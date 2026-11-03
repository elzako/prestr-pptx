package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;
import com.aspose.slides.ms.System.w5;
import com.aspose.slides.ms.System.y8;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

@j3
public class ArrayList implements IList, List {
   private Object[] n5;
   private int l6;
   private int k5;
   private static Object[] u3 = new Object[0];

   protected int getVersion() {
      return this.k5;
   }

   public ArrayList() {
      this.n5 = new Object[4];
   }

   public ArrayList(ICollection c) {
      if (c == null) {
         throw new ArgumentNullException("c", "collection is null");
      }

      this.n5 = new Object[c.size()];
      this.addRange(c);
   }

   public ArrayList(int capacity) {
      if (capacity < 0) {
         n5("capacity", capacity, "The initial capacity can't be smaller than zero.");
      }

      if (capacity == 0) {
         capacity = 4;
      }

      this.n5 = new Object[capacity];
   }

   private ArrayList(int initialCapacity, boolean forceZeroSize) {
      if (forceZeroSize) {
         this.n5 = null;
      } else {
         throw new IllegalStateException("Use ArrayList(int)");
      }
   }

   private ArrayList(u3 array, int index, int count) {
      if (count == 0) {
         this.n5 = new Object[4];
      } else {
         this.n5 = new Object[count];
      }

      com.aspose.slides.ms.System.u3.n5(array, index, com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), 0, count);
      this.l6 = count;
   }

   @Override
   public Object get_Item(int index) {
      if (index < 0 || index >= this.l6) {
         n5("index", index, "Index is less than 0 or more than or equal to the list count.");
      }

      return this.n5[index];
   }

   @Override
   public void set_Item(int index, Object value) {
      if (index < 0 || index >= this.l6) {
         n5("index", index, "Index is less than 0 or more than or equal to the list count.");
      }

      this.n5[index] = value;
      this.k5++;
   }

   @Override
   public int size() {
      return this.l6;
   }

   public int getCapacity() {
      return this.n5.length;
   }

   public void setCapacity(int value) {
      if (value < this.l6) {
         n5("Capacity", value, "Must be more than count.");
      }

      if (value > 0) {
         this.n5 = Arrays.copyOf(this.n5, value);
      } else {
         this.n5 = new Object[4];
      }
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
   public boolean isSynchronized() {
      return false;
   }

   @Override
   public Object getSyncRoot() {
      return this;
   }

   private void n5(int var1) {
      if (var1 > this.n5.length) {
         int var2 = this.n5.length == 0 ? 4 : this.n5.length * 2;
         if (var2 < var1) {
            var2 = var1;
         }

         this.setCapacity(var2);
      }
   }

   private void n5(int var1, int var2) {
      if (var2 > 0) {
         if (this.l6 + var2 > this.n5.length) {
            int var3 = this.n5.length > 0 ? this.n5.length << 1 : 1;

            while (var3 < this.l6 + var2) {
               var3 <<= 1;
            }

            Object[] var4 = new Object[var3];
            com.aspose.slides.ms.System.u3.n5(this.n5, 0, var4, 0, var1);
            com.aspose.slides.ms.System.u3.n5(this.n5, var1, var4, var1 + var2, this.l6 - var1);
            this.n5 = var4;
         } else {
            com.aspose.slides.ms.System.u3.n5(this.n5, var1, this.n5, var1 + var2, this.l6 - var1);
         }
      } else if (var2 < 0) {
         int var5 = var1 - var2;
         com.aspose.slides.ms.System.u3.n5(this.n5, var5, this.n5, var1, this.l6 - var5);
         com.aspose.slides.ms.System.u3.n5(this.n5, this.l6 + var2, -var2);
      }
   }

   @Override
   public int addItem(Object value) {
      if (this.n5.length <= this.l6) {
         this.n5(this.l6 + 1);
      }

      this.n5[this.l6] = value;
      this.k5++;
      return this.l6++;
   }

   @Override
   public void clear() {
      com.aspose.slides.ms.System.u3.n5(this.n5, 0, this.l6);
      this.l6 = 0;
      this.k5++;
   }

   @Override
   public boolean contains(Object item) {
      return this.indexOf(item, 0, this.l6) > -1;
   }

   boolean n5(Object var1, int var2, int var3) {
      return this.indexOf(var1, var2, var3) > -1;
   }

   @Override
   public int indexOf(Object value) {
      return this.indexOf(value, 0);
   }

   public int indexOf(Object value, int startIndex) {
      return this.indexOf(value, startIndex, this.l6 - startIndex);
   }

   public int indexOf(Object value, int startIndex, int count) {
      if (startIndex < 0 || startIndex > this.l6) {
         n5("startIndex", startIndex, "Does not specify valid index.");
      }

      if (count < 0) {
         n5("count", count, "Can't be less than 0.");
      }

      if (startIndex > this.l6 - count) {
         throw new ArgumentOutOfRangeException("count", "Start index and count do not specify a valid range.");
      } else {
         return com.aspose.slides.ms.System.u3.n5(this.n5, value, startIndex, count);
      }
   }

   @Override
   public int lastIndexOf(Object value) {
      return this.lastIndexOf(value, this.l6 - 1);
   }

   public int lastIndexOf(Object value, int startIndex) {
      return this.lastIndexOf(value, startIndex, startIndex + 1);
   }

   public int lastIndexOf(Object value, int startIndex, int count) {
      return w5.n5(this.n5, value, startIndex, count);
   }

   @Override
   public void insertItem(int index, Object value) {
      if (index < 0 || index > this.l6) {
         n5("index", index, "Index must be >= 0 and <= Count.");
      }

      this.n5(index, 1);
      this.n5[index] = value;
      this.l6++;
      this.k5++;
   }

   public void insertRange(int index, ICollection c) {
      if (c == null) {
         throw new ArgumentNullException("c");
      }

      if (index < 0 || index > this.l6) {
         n5("index", index, "Index must be >= 0 and <= Count.");
      }

      int var3 = c.size();
      if (var3 > 0) {
         if (this.n5.length < this.l6 + var3) {
            this.n5(this.l6 + var3);
         }

         if (index < this.l6) {
            com.aspose.slides.ms.System.u3.n5(this.n5, index, this.n5, index + var3, this.l6 - index);
         }

         if (this == c.getSyncRoot()) {
            com.aspose.slides.ms.System.u3.n5(this.n5, 0, this.n5, index, index);
            com.aspose.slides.ms.System.u3.n5(this.n5, index + var3, this.n5, index << 1, this.l6 - index);
         } else {
            c.copyTo(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), index);
         }

         this.l6 = this.l6 + c.size();
         this.k5++;
      }
   }

   public void insertRange(int index, Object[] c) {
      if (c == null) {
         throw new ArgumentNullException("c");
      }

      if (index < 0 || index > this.l6) {
         n5("index", index, "Index must be >= 0 and <= Count.");
      }

      int var3 = c.length;
      if (var3 > 0) {
         if (this.n5.length < this.l6 + var3) {
            this.n5(this.l6 + var3);
         }

         if (index < this.l6) {
            com.aspose.slides.ms.System.u3.n5(this.n5, index, this.n5, index + var3, this.l6 - index);
         }

         com.aspose.slides.ms.System.u3.n5((Object)(c)).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), index);
         this.l6 += c.length;
         this.k5++;
      }
   }

   @Override
   public void removeItem(Object obj) {
      int var2 = this.indexOf(obj);
      if (var2 > -1) {
         this.removeAt(var2);
      }

      this.k5++;
   }

   @Override
   public void removeAt(int index) {
      if (index < 0 || index >= this.l6) {
         n5("index", index, "Less than 0 or more than list count.");
      }

      this.n5(index, -1);
      this.l6--;
      this.k5++;
   }

   public void removeRange(int index, int count) {
      n5(index, count, this.l6);
      this.n5(index, -count);
      this.l6 -= count;
      this.k5++;
   }

   public void reverse() {
      w5.n5(this.n5, 0, this.l6);
      this.k5++;
   }

   public void reverse(int index, int count) {
      n5(index, count, this.l6);
      w5.n5(this.n5, index, count);
      this.k5++;
   }

   public void copyTo(u3 array) {
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), 0, array, 0, this.l6);
   }

   @Override
   public void copyTo(u3 array, int arrayIndex) {
      this.copyTo(0, array, arrayIndex, this.l6);
   }

   public void copyTo(int index, u3 array, int arrayIndex, int count) {
      if (array == null) {
         throw new ArgumentNullException("array");
      }

      if (array.u3() != 1) {
         throw new ArgumentException("Must have only 1 dimensions.", "array");
      }

      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), index, array, arrayIndex, count);
   }

   @Override
   public IEnumerator iterator() {
      return new ArrayList$SimpleEnumerator(this);
   }

   public IEnumerator iterator(int index, int count) {
      n5(index, count, this.l6);
      return new ArrayList$ArrayListEnumerator(this, index, count);
   }

   public void addRange(ICollection c) {
      if (c == null) {
         throw new ArgumentNullException("c");
      }

      this.insertRange(this.l6, c);
   }

   public void addRange(Object[] collection) {
      if (collection == null) {
         throw new ArgumentNullException("c");
      }

      this.insertRange(this.l6, collection);
   }

   public int binarySearch(Object value) {
      if (value == null) {
         return -1;
      }

      try {
         return w5.n5(this.n5, 0, this.l6, value);
      } catch (InvalidOperationException var3) {
         throw new ArgumentException(var3.getMessage());
      }
   }

   public int binarySearch(Object value, Comparator comparer) {
      try {
         return w5.n5(this.n5, 0, this.l6, value, comparer);
      } catch (InvalidOperationException var4) {
         throw new ArgumentException(var4.getMessage());
      }
   }

   public int binarySearch(int index, int count, Object value, Comparator comparer) {
      try {
         return w5.n5(this.n5, index, count, value, comparer);
      } catch (InvalidOperationException var6) {
         throw new ArgumentException(var6.getMessage());
      }
   }

   public ArrayList getRange(int index, int count) {
      n5(index, count, this.l6);
      return this.isSynchronized() ? sync(new ArrayList$RangedArrayList(this, index, count)) : new ArrayList$RangedArrayList(this, index, count);
   }

   public void setRange(int index, ICollection c) {
      if (c == null) {
         throw new ArgumentNullException("c");
      }

      if (index >= 0 && index + c.size() <= this.l6) {
         c.copyTo(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), index);
         this.k5++;
      } else {
         throw new ArgumentOutOfRangeException("index");
      }
   }

   public void trimToSize() {
      this.setCapacity(this.l6);
   }

   public void sort() {
      Arrays.sort(this.n5, 0, this.l6, Comparer.Default);
      this.k5++;
   }

   @Override
   public void sort(Comparator comparer) {
      Arrays.sort(this.n5, 0, this.l6, comparer);
   }

   public void sort(int index, int count, Comparator comparer) {
      n5(index, count, this.l6);
      Arrays.sort(this.n5, index, index + count, comparer);
   }

   @Override
   public Object[] toArray() {
      Object[] var1 = new Object[this.l6];
      this.copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var1)));
      return var1;
   }

   public u3 toArray(y8 type) {
      u3 var2 = com.aspose.slides.ms.System.u3.n5(type, this.l6);
      this.copyTo(var2);
      return var2;
   }

   public Object deepClone() {
      return new ArrayList(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), 0, this.l6);
   }

   static void n5(int var0, int var1, int var2) {
      if (var0 < 0) {
         n5("index", var0, "Can't be less than 0.");
      }

      if (var1 < 0) {
         n5("count", var1, "Can't be less than 0.");
      }

      if (var0 > var2 - var1) {
         throw new ArgumentException("Index and count do not denote a valid range of elements.", "index");
      }
   }

   static void n5(String var0, Object var1, String var2) {
      throw new ArgumentOutOfRangeException(var0, var1, var2);
   }

   public static ArrayList adapter(IList list) {
      if (list == null) {
         throw new ArgumentNullException("list");
      }

      ArrayList var1 = list instanceof ArrayList ? (ArrayList)list : null;
      if (var1 != null) {
         return var1;
      }

      var1 = new ArrayList$ArrayListAdapter(list);
      return list.isSynchronized() ? sync(var1) : var1;
   }

   public static ArrayList sync(ArrayList list) {
      if (list == null) {
         throw new ArgumentNullException("list");
      } else {
         return list.isSynchronized() ? list : new ArrayList$SynchronizedArrayListWrapper(list);
      }
   }

   public static IList sync(IList list) {
      if (list == null) {
         throw new ArgumentNullException("list");
      } else {
         return list.isSynchronized() ? list : new ArrayList$SynchronizedListWrapper(list);
      }
   }

   public static ArrayList readOnly(ArrayList list) {
      if (list == null) {
         throw new ArgumentNullException("list");
      } else {
         return list.isReadOnly() ? list : new ArrayList$ReadOnlyArrayListWrapper(list);
      }
   }

   public static IList readOnly(IList list) {
      if (list == null) {
         throw new ArgumentNullException("list");
      } else {
         return list.isReadOnly() ? list : new ArrayList$ReadOnlyListWrapper(list);
      }
   }

   public static ArrayList fixedSize(ArrayList list) {
      if (list == null) {
         throw new ArgumentNullException("list");
      } else {
         return list.isFixedSize() ? list : new ArrayList$FixedSizeArrayListWrapper(list);
      }
   }

   public static IList fixedSize(IList list) {
      if (list == null) {
         throw new ArgumentNullException("list");
      } else {
         return list.isFixedSize() ? list : new ArrayList$FixedSizeListWrapper(list);
      }
   }

   public static ArrayList repeat(Object value, int count) {
      ArrayList var2 = new ArrayList(count);

      for (int var3 = 0; var3 < count; var3++) {
         var2.addItem(value);
      }

      return var2;
   }

   @Override
   public boolean isEmpty() {
      return this.size() == 0;
   }

   @Override
   public Object[] toArray(Object[] a) {
      if (a.length <= this.size()) {
         a = new Object[this.size()];
      }

      this.copyTo(com.aspose.slides.ms.System.u3.n5((Object)(a)));
      return a;
   }

   @Override
   public boolean add(Object o) {
      int var2 = this.size();
      this.addItem(o);
      return this.size() != var2;
   }

   @Override
   public boolean remove(Object o) {
      int var2 = this.size();
      this.removeItem(o);
      return this.size() != var2;
   }

   @Override
   public boolean containsAll(Collection c) {
      for (Object var3 : c) {
         if (!this.contains(var3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean addAll(Collection c) {
      return this.addAll(this.l6, c);
   }

   @Override
   public boolean addAll(int index, Collection c) {
      if (c == null) {
         throw new ArgumentNullException("c");
      }

      int var3 = index;
      int var4 = this.size();

      for (Object var6 : c) {
         this.insertItem(var3++, var6);
      }

      return var4 != this.size();
   }

   @Override
   public boolean removeAll(Collection c) {
      if (c == null) {
         throw new ArgumentNullException("c");
      }

      int var2 = this.size();

      for (Object var4 : c) {
         this.removeItem(var4);
      }

      return var2 != this.size();
   }

   @Override
   public boolean retainAll(Collection c) {
      if (c == null) {
         throw new ArgumentNullException("c");
      }

      int var2 = this.size();
      Object[] var3 = this.toArray();

      for (Object var7 : var3) {
         if (!c.contains(var7)) {
            this.remove(var7);
         }
      }

      return var2 != this.size();
   }

   @Override
   public Object get(int index) {
      return this.get_Item(index);
   }

   @Override
   public Object set(int index, Object element) {
      Object var3 = this.get_Item(index);
      this.set_Item(index, element);
      return var3;
   }

   @Override
   public void add(int index, Object element) {
      this.insertItem(index, element);
   }

   @Override
   public Object remove(int index) {
      Object var2 = this.get_Item(index);
      this.removeAt(index);
      return var2;
   }

   @Override
   public ListIterator listIterator() {
      return new ArrayList$ListItr(this, 0);
   }

   @Override
   public ListIterator listIterator(int index) {
      if (index >= 0 && index <= this.size()) {
         return new ArrayList$ListItr(this, index);
      } else {
         throw new IndexOutOfBoundsException("Index: " + index);
      }
   }

   @Override
   public List subList(int fromIndex, int toIndex) {
      int var3 = toIndex - fromIndex;
      return this.getRange(fromIndex, var3);
   }

   public static ArrayList fromJava(List list) {
      return list == null ? null : new ArrayList$ArrayListInternalized(list);
   }

   public static List toJava(ArrayList list) {
      return list;
   }

   // $VF: synthetic method
   static Object[] n5(ArrayList var0) {
      return var0.n5;
   }

   // Restored original synthetic constructor delegation: (IZLcom/aspose/slides/Collections/ArrayList$1;)V -> (IZ)V
   ArrayList(int recoveredArg0, boolean recoveredArg1, com.aspose.slides.Collections.ArrayList$1 recoveredArg2) {
      this(recoveredArg0, recoveredArg1);
   }
}
