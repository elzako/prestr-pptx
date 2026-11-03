package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.u3;
import com.aspose.slides.ms.System.v4;
import java.util.Comparator;

@j3
public class SortedList implements IDictionary, v4 {
   private final Object n5 = new Object();
   private SortedList$Slot[] l6;
   private Comparator k5;
   private int u3;
   private int a6;
   private int u9;

   public SortedList() {
      this(null, 16);
   }

   public SortedList(int initialCapacity) {
      this(null, initialCapacity);
   }

   public SortedList(Comparator comparer, int capacity) {
      if (capacity < 0) {
         throw new ArgumentOutOfRangeException("capacity");
      }

      if (capacity == 0) {
         this.u9 = 0;
      } else {
         this.u9 = 16;
      }

      this.k5 = comparer;
      this.l6(capacity, true);
   }

   public SortedList(Comparator comparer) {
      this.k5 = comparer;
      this.l6(16, true);
   }

   public SortedList(IDictionary d) {
      this(d, null);
   }

   public SortedList(IDictionary d, Comparator comparer) {
      if (d == null) {
         throw new ArgumentNullException("dictionary");
      }

      this.l6(d.size(), true);
      this.k5 = comparer;
      IDictionaryEnumerator var3 = d.iterator();

      while (var3.hasNext()) {
         this.addItem(var3.getKey(), var3.getValue());
      }
   }

   @Override
   public int size() {
      return this.u3;
   }

   @Override
   public boolean isSynchronized() {
      return false;
   }

   @Override
   public Object getSyncRoot() {
      return this.n5;
   }

   @Override
   public boolean isFixedSize() {
      return false;
   }

   @Override
   public boolean isReadOnly() {
      return false;
   }

   @Override
   public ICollection getKeys() {
      return new SortedList$ListKeys(this);
   }

   @Override
   public ICollection getValues() {
      return new SortedList$ListValues(this);
   }

   @Override
   public Object get_Item(Object key) {
      if (key == null) {
         throw new ArgumentNullException();
      } else {
         return this.n5(key);
      }
   }

   @Override
   public void set_Item(Object key, Object value) {
      if (key == null) {
         throw new ArgumentNullException();
      }

      if (this.isReadOnly()) {
         throw new NotSupportedException("SortedList is Read Only.");
      }

      if (this.l6(key) < 0 && this.isFixedSize()) {
         throw new NotSupportedException("Key not found and SortedList is fixed size.");
      }

      this.n5(key, value, true);
   }

   public int getCapacity() {
      return this.l6.length;
   }

   public void setCapacity(int value) {
      int var2 = this.l6.length;
      if (this.u3 > value) {
         throw new ArgumentOutOfRangeException("capacity too small");
      }

      if (value == 0) {
         SortedList$Slot[] var3 = n5(this.u9);
         n5(this.l6, 0, var3, 0, this.u3);
         this.l6 = var3;
      } else if (value > this.u3) {
         SortedList$Slot[] var4 = n5(value);
         n5(this.l6, 0, var4, 0, this.u3);
         this.l6 = var4;
      } else if (value > var2) {
         SortedList$Slot[] var5 = n5(value);
         n5(this.l6, 0, var5, 0, var2);
         this.l6 = var5;
      }
   }

   @Override
   public IDictionaryEnumerator iterator() {
      return new SortedList$Enumerator(this, 2);
   }

   @Deprecated
   public IDictionaryEnumerator iteratorJava() {
      return new SortedList$EnumeratorJava(this, 2);
   }

   @Override
   public void addItem(Object key, Object value) {
      this.n5(key, value, false);
   }

   @Override
   public void clear() {
      this.u9 = 16;
      this.l6 = n5(this.u9);
      this.u3 = 0;
      this.a6++;
   }

   @Override
   public boolean contains(Object key) {
      if (null == key) {
         throw new ArgumentNullException();
      }

      try {
         return this.l6(key) >= 0;
      } catch (RuntimeException var3) {
         throw new IllegalStateException();
      }
   }

   @Override
   public void removeItem(Object key) {
      int var2 = this.indexOfKey(key);
      if (var2 >= 0) {
         this.removeAt(var2);
      }
   }

   @Override
   public void copyTo(u3 array, int arrayIndex) {
      if (null == array) {
         throw new ArgumentNullException();
      }

      if (arrayIndex < 0) {
         throw new ArgumentOutOfRangeException();
      }

      if (array.u3() > 1) {
         throw new ArgumentException("array is multi-dimensional");
      }

      if (arrayIndex >= array.a6()) {
         throw new ArgumentNullException("arrayIndex is greater than or equal to array.Length");
      }

      if (this.size() > array.a6() - arrayIndex) {
         throw new ArgumentNullException("Not enough space in array from arrayIndex to end of array");
      }

      IDictionaryEnumerator var3 = this.iterator();
      int var4 = arrayIndex;

      while (var3.hasNext()) {
         array.k5(var3.getEntry().Clone(), var4++);
      }
   }

   @Override
   public Object deepClone() {
      SortedList var1 = new SortedList(this, this.k5);
      var1.a6 = this.a6;
      return var1;
   }

   public IList getKeyList() {
      return new SortedList$ListKeys(this);
   }

   public IList getValueList() {
      return new SortedList$ListValues(this);
   }

   public void removeAt(int index) {
      SortedList$Slot[] var2 = this.l6;
      int var3 = this.size();
      if (index >= 0 && index < var3) {
         if (index != var3 - 1) {
            n5(var2, index + 1, var2, index, var3 - 1 - index);
         } else {
            var2[index].n5 = null;
            var2[index].l6 = null;
         }

         this.u3--;
         this.a6++;
      } else {
         throw new ArgumentOutOfRangeException("index out of range");
      }
   }

   public int indexOfKey(Object key) {
      if (null == key) {
         throw new ArgumentNullException();
      }

      int var2 = 0;

      try {
         var2 = this.l6(key);
      } catch (RuntimeException var4) {
         throw new InvalidOperationException();
      }

      return var2 | var2 >> 31;
   }

   public int indexOfValue(Object value) {
      if (this.u3 == 0) {
         return -1;
      }

      for (int var2 = 0; var2 < this.u3; var2++) {
         SortedList$Slot var3 = this.l6[var2].Clone();
         if (j8.n5(value, var3.l6)) {
            return var2;
         }
      }

      return -1;
   }

   public boolean containsKey(Object key) {
      if (null == key) {
         throw new ArgumentNullException();
      }

      try {
         return this.contains(key);
      } catch (RuntimeException var3) {
         throw new IllegalStateException();
      }
   }

   public boolean containsValue(Object value) {
      return this.indexOfValue(value) >= 0;
   }

   public Object getByIndex(int index) {
      if (index >= 0 && index < this.size()) {
         return this.l6[index].l6;
      } else {
         throw new ArgumentOutOfRangeException("index out of range");
      }
   }

   public void setByIndex(int index, Object value) {
      if (index >= 0 && index < this.size()) {
         this.l6[index].l6 = value;
      } else {
         throw new ArgumentOutOfRangeException("index out of range");
      }
   }

   public Object getKey(int index) {
      if (index >= 0 && index < this.size()) {
         return this.l6[index].n5;
      } else {
         throw new ArgumentOutOfRangeException("index out of range");
      }
   }

   public static SortedList sync(SortedList list) {
      if (list == null) {
         throw new ArgumentNullException("Base list is null.");
      } else {
         return new SortedList$SynchedSortedList(list);
      }
   }

   public void trimToSize() {
      if (this.size() == 0) {
         this.n5(this.u9, false);
      } else {
         this.n5(this.size(), true);
      }
   }

   private void n5(int var1, boolean var2) {
      SortedList$Slot[] var3 = this.l6;
      SortedList$Slot[] var4 = n5(var1);
      if (var2) {
         n5(var3, 0, var4, 0, var1);
      }

      this.l6 = var4;
   }

   private void n5(int var1, int var2) {
      SortedList$Slot[] var3 = this.l6;
      SortedList$Slot[] var4 = null;
      int var5 = this.getCapacity();
      boolean var6 = var2 >= 0 && var2 < this.size();
      if (var1 > var5) {
         var4 = n5(var1 << 1);
      }

      if (var4 != null) {
         if (var6) {
            int var7 = var2;
            if (var7 > 0) {
               n5(var3, 0, var4, 0, var7);
            }

            var7 = this.size() - var2;
            if (var7 > 0) {
               n5(var3, var2, var4, var2 + 1, var7);
            }
         } else {
            n5(var3, 0, var4, 0, this.size());
         }

         this.l6 = var4;
      } else if (var6) {
         n5(var3, var2, var3, var2 + 1, this.size() - var2);
      }
   }

   private void n5(Object var1, Object var2, boolean var3) {
      if (var1 == null) {
         throw new ArgumentNullException("null key");
      }

      SortedList$Slot[] var4 = this.l6;
      int var5 = -1;

      try {
         var5 = this.l6(var1);
      } catch (RuntimeException var7) {
         throw new InvalidOperationException();
      }

      if (var5 >= 0) {
         if (!var3) {
            String var6 = d1.n5("Key '{0}' already exists in list.", new Object[]{var1});
            throw new ArgumentException(var6);
         }

         var4[var5].l6 = var2;
         this.a6++;
      } else {
         var5 = ~var5;
         if (var5 > this.getCapacity() + 1) {
            throw new RuntimeException(d1.n5(new Object[]{"SortedList::internal error (", var1, ", ", var2, ") at [", var5, "]"}));
         }

         this.n5(this.size() + 1, var5);
         var4 = this.l6;
         var4[var5].n5 = var1;
         var4[var5].l6 = var2;
         this.u3++;
         this.a6++;
      }
   }

   private Object n5(Object var1) {
      int var2 = this.l6(var1);
      return var2 >= 0 ? this.l6[var2].l6 : null;
   }

   private void l6(int var1, boolean var2) {
      if (!var2 && var1 < this.u9) {
         var1 = this.u9;
      }

      this.l6 = n5(var1);
      this.u3 = 0;
      this.a6 = 0;
   }

   private void n5(u3 var1, int var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("arr");
      }

      if (var2 >= 0 && var2 + this.size() <= var1.a6()) {
         SortedList$Enumerator var4 = new SortedList$Enumerator(this, var3);

         while (var4.hasNext()) {
            var1.k5(var4.next(), var2++);
         }
      } else {
         throw new ArgumentOutOfRangeException("i");
      }
   }

   private int l6(Object var1) {
      SortedList$Slot[] var2 = this.l6;
      int var3 = this.size();
      if (var3 == 0) {
         return -1;
      }

      Comparator var4 = this.k5 == null ? Comparer.Default : this.k5;
      int var5 = 0;
      int var6 = var3 - 1;

      while (var5 <= var6) {
         int var7 = var5 + var6 >> 1;
         int var8 = var4.compare(var2[var7].n5, var1);
         if (var8 == 0) {
            return var7;
         }

         if (var8 < 0) {
            var5 = var7 + 1;
         } else {
            var6 = var7 - 1;
         }
      }

      return ~var5;
   }

   static SortedList$Slot[] n5(int var0) {
      SortedList$Slot[] var1 = new SortedList$Slot[var0];

      for (int var2 = 0; var2 < var0; var2++) {
         var1[var2] = new SortedList$Slot();
      }

      return var1;
   }

   private static boolean n5(int var0, int var1, int var2) {
      return var0 < var1 && var0 + var2 > var1 || var1 < var0 && var1 + var2 > var0;
   }

   static void n5(SortedList$Slot[] var0, int var1, SortedList$Slot[] var2, int var3, int var4) {
      SortedList$Slot[] var5;
      if (var0 == var2 && n5(var1, var3, var4)) {
         var5 = new SortedList$Slot[var4];
         System.arraycopy(var0, var1, var5, 0, var4);
         var1 = 0;
      } else {
         var5 = var0;
      }

      for (int var6 = 0; var6 < var4; var6++) {
         var2[var3 + var6] = var5[var1 + var6].Clone();
      }
   }

   // $VF: synthetic method
   static int n5(SortedList var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static SortedList$Slot[] l6(SortedList var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static void n5(SortedList var0, u3 var1, int var2, int var3) {
      var0.n5(var1, var2, var3);
   }

   // $VF: synthetic method
   static Object n5(SortedList var0, Object var1) {
      return var0.n5(var1);
   }

   // $VF: synthetic method
   static void n5(SortedList var0, Object var1, Object var2, boolean var3) {
      var0.n5(var1, var2, var3);
   }

   // $VF: synthetic method
   static int l6(SortedList var0, Object var1) {
      return var0.l6(var1);
   }
}
