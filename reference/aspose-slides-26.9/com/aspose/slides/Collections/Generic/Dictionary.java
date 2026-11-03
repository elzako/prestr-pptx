package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.KeyNotFoundException;
import com.aspose.slides.internal.v6g.u9;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;
import java.util.Arrays;

@j3
public class Dictionary<TKey, TValue> implements IGenericDictionary<TKey, TValue> {
   private int[] n5;
   private Dictionary$Link[] l6;
   private Object[] k5;
   private Object[] u3;
   private IGenericEqualityComparer<TKey> a6;
   private int u9;
   private int h0;
   private int c8;
   private int t2;
   private int s7;
   private final Object x8 = new Object();
   private static final u9 n3 = new u9("Version", "Comparer", "HashSize", "KeyValuePairs");

   @Override
   public int size() {
      return this.c8;
   }

   @Override
   public TValue get_Item(TKey key) {
      if (key == null) {
         throw new ArgumentNullException("key");
      }

      int var2 = this.a6.hashCodeT(key) | -2147483648;

      for (int var3 = this.n5[(var2 & 2147483647) % this.n5.length] - 1; var3 != -1; var3 = this.l6[var3].Next) {
         if (this.l6[var3].HashCode == var2 && this.a6.equalsT((TKey)this.k5[var3], key)) {
            return (TValue)this.u3[var3];
         }
      }

      throw new KeyNotFoundException();
   }

   @Override
   public void set_Item(TKey key, TValue value) {
      if (key == null) {
         throw new ArgumentNullException("key");
      }

      int var3 = this.a6.hashCodeT(key) | -2147483648;
      int var4 = (var3 & 2147483647) % this.n5.length;
      int var5 = this.n5[var4] - 1;
      int var6 = -1;
      if (var5 != -1) {
         while (this.l6[var5].HashCode != var3 || !this.a6.equalsT((TKey)this.k5[var5], key)) {
            var6 = var5;
            var5 = this.l6[var5].Next;
            if (var5 == -1) {
               break;
            }
         }
      }

      if (var5 == -1) {
         if (++this.c8 > this.t2) {
            this.k5();
            var4 = (var3 & 2147483647) % this.n5.length;
         }

         var5 = this.h0;
         if (var5 == -1) {
            var5 = this.u9++;
         } else {
            this.h0 = this.l6[var5].Next;
         }

         this.l6[var5].Next = this.n5[var4] - 1;
         this.n5[var4] = var5 + 1;
         this.l6[var5].HashCode = var3;
         this.k5[var5] = key;
      } else if (var6 != -1) {
         this.l6[var6].Next = this.l6[var5].Next;
         this.l6[var5].Next = this.n5[var4] - 1;
         this.n5[var4] = var5 + 1;
      }

      this.u3[var5] = value;
      this.s7++;
   }

   public Dictionary() {
      this.n5(10, null);
   }

   public Dictionary(IGenericEqualityComparer<TKey> comparer) {
      this.n5(10, comparer);
   }

   public Dictionary(IGenericDictionary<TKey, TValue> dictionary) {
      this(dictionary, null);
   }

   public Dictionary(int capacity) {
      this.n5(capacity, null);
   }

   public Dictionary(IGenericDictionary<TKey, TValue> dictionary, IGenericEqualityComparer<TKey> comparer) {
      if (dictionary == null) {
         throw new ArgumentNullException("dictionary");
      }

      int var3 = dictionary.size();
      this.n5(var3, comparer);

      for (KeyValuePair var5 : dictionary) {
         this.addItem((TKey)var5.getKey(), (TValue)var5.getValue());
      }
   }

   public Dictionary(int capacity, IGenericEqualityComparer<TKey> comparer) {
      this.n5(capacity, comparer);
   }

   private void n5(int var1, IGenericEqualityComparer<TKey> var2) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("capacity");
      }

      this.a6 = var2 != null ? var2 : new EqualityComparer$DefaultComparer<>();
      if (var1 == 0) {
         var1 = 10;
      }

      var1 = (int)(var1 / 0.9F) + 1;
      this.n5(var1);
      this.s7 = 0;
   }

   private void n5(int var1) {
      this.n5 = new int[var1];
      this.l6 = this.l6(var1);
      this.h0 = -1;
      this.k5 = new Object[var1];
      this.u3 = new Object[var1];
      this.u9 = 0;
      this.t2 = (int)(this.n5.length * 0.9F);
      if (this.t2 == 0 && this.n5.length > 0) {
         this.t2 = 1;
      }
   }

   private void n5(u3 var1, int var2) {
      if (var1 == null) {
         throw new ArgumentNullException("array");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("index");
      }

      if (var2 > var1.a6()) {
         throw new ArgumentException("index larger than largest valid index of array");
      }

      if (var1.a6() - var2 < this.size()) {
         throw new ArgumentException("Destination array cannot hold the requested elements!");
      }
   }

   private void n5(TKey[] var1, int var2) {
      for (int var3 = 0; var3 < this.u9; var3++) {
         if ((this.l6[var3].HashCode & -2147483648) != 0) {
            var1[var2++] = (TKey)this.k5[var3];
         }
      }
   }

   private void l6(TValue[] var1, int var2) {
      for (int var3 = 0; var3 < this.u9; var3++) {
         if ((this.l6[var3].HashCode & -2147483648) != 0) {
            var1[var2++] = (TValue)this.u3[var3];
         }
      }
   }

   static <TKey, TValue> KeyValuePair<TKey, TValue> n5(TKey var0, TValue var1) {
      return new KeyValuePair<>((TKey)var0, (TValue)var1);
   }

   static <TKey, TValue> TKey l6(TKey var0, TValue var1) {
      return (TKey)var0;
   }

   static <TKey, TValue> TValue k5(TKey var0, TValue var1) {
      return (TValue)var1;
   }

   public void copyToTArray(KeyValuePair<TKey, TValue>[] array, int index) {
      this.n5(com.aspose.slides.ms.System.u3.n5((Object)(array)), index);

      for (int var3 = 0; var3 < this.u9; var3++) {
         if ((this.l6[var3].HashCode & -2147483648) != 0) {
            array[index++] = new KeyValuePair<>((TKey)this.k5[var3], (TValue)this.u3[var3]);
         }
      }
   }

   public IEnumerable<DictionaryEntry> getDictionaryEntryEnumerator() {
      return new Dictionary$ShimEnumerator<>(this, this);
   }

   @Deprecated
   public IEnumerable<DictionaryEntry> getDictionaryEntryEnumeratorJava() {
      return new Dictionary$ShimEnumeratorJava<>(this, this);
   }

   private <TRet> void n5(u3 var1, int var2, Dictionary$Transform<TKey, TValue, TRet> var3) {
      try {
         Object[] var4 = (Object[])com.aspose.slides.ms.System.u3.n5(var1);

         for (int var5 = 0; var5 < this.u9; var5++) {
            if ((this.l6[var5].HashCode & -2147483648) != 0) {
               var4[var2++] = var3.l6((TKey)this.k5[var5], (TValue)this.u3[var5]);
            }
         }
      } catch (RuntimeException var6) {
         throw new ArgumentException("Cannot copy source collection elements to destination array", "array", var6);
      }
   }

   private void k5() {
      int var1 = com.aspose.slides.internal.t3o.n5.n5(this.n5.length << 1 | 1);
      int[] var2 = new int[var1];
      Dictionary$Link[] var3 = this.l6(var1);

      for (int var4 = 0; var4 < this.n5.length; var4++) {
         for (int var5 = this.n5[var4] - 1; var5 != -1; var5 = this.l6[var5].Next) {
            int var6 = var3[var5].HashCode = this.a6.hashCodeT((TKey)this.k5[var5]) | -2147483648;
            int var7 = (var6 & 2147483647) % var1;
            var3[var5].Next = var2[var7] - 1;
            var2[var7] = var5 + 1;
         }
      }

      this.n5 = var2;
      this.l6 = var3;
      this.k5 = Arrays.copyOf(this.k5, var1);
      this.u3 = Arrays.copyOf(this.u3, var1);
      this.t2 = (int)(var1 * 0.9F);
   }

   private Dictionary$Link[] l6(int var1) {
      Dictionary$Link[] var2 = new Dictionary$Link[var1];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = new Dictionary$Link();
      }

      return var2;
   }

   @Override
   public void addItem(TKey key, TValue value) {
      if (key == null) {
         throw new ArgumentNullException("key");
      }

      int var3 = this.a6.hashCodeT(key) | -2147483648;
      int var4 = (var3 & 2147483647) % this.n5.length;

      for (int var5 = this.n5[var4] - 1; var5 != -1; var5 = this.l6[var5].Next) {
         if (this.l6[var5].HashCode == var3 && this.a6.equalsT((TKey)this.k5[var5], key)) {
            throw new ArgumentException("An element with the same key already exists in the dictionary.");
         }
      }

      if (++this.c8 > this.t2) {
         this.k5();
         var4 = (var3 & 2147483647) % this.n5.length;
      }

      int var6 = this.h0;
      if (var6 == -1) {
         var6 = this.u9++;
      } else {
         this.h0 = this.l6[var6].Next;
      }

      this.l6[var6].HashCode = var3;
      this.l6[var6].Next = this.n5[var4] - 1;
      this.n5[var4] = var6 + 1;
      this.k5[var6] = key;
      this.u3[var6] = value;
      this.s7++;
   }

   public IGenericEqualityComparer<TKey> getComparer() {
      return this.a6;
   }

   @Override
   public void clear() {
      this.c8 = 0;
      Arrays.fill(this.n5, 0);
      Arrays.fill(this.k5, null);
      Arrays.fill(this.u3, null);

      for (int var1 = 0; var1 < this.l6.length; var1++) {
         this.l6[var1] = new Dictionary$Link();
      }

      this.h0 = -1;
      this.u9 = 0;
      this.s7++;
   }

   @Override
   public boolean containsKey(TKey key) {
      if (key == null) {
         throw new ArgumentNullException("key");
      }

      int var2 = this.a6.hashCodeT(key) | -2147483648;

      for (int var3 = this.n5[(var2 & 2147483647) % this.n5.length] - 1; var3 != -1; var3 = this.l6[var3].Next) {
         if (this.l6[var3].HashCode == var2 && this.a6.equalsT((TKey)this.k5[var3], key)) {
            return true;
         }
      }

      return false;
   }

   public boolean containsValue(TValue value) {
      EqualityComparer$DefaultComparer var2 = new EqualityComparer$DefaultComparer();

      for (int var3 = 0; var3 < this.n5.length; var3++) {
         for (int var4 = this.n5[var3] - 1; var4 != -1; var4 = this.l6[var4].Next) {
            if (var2.equalsT(this.u3[var4], value)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean removeItemByKey(TKey key) {
      if (key == null) {
         throw new ArgumentNullException("key");
      }

      int var2 = this.a6.hashCodeT(key) | -2147483648;
      int var3 = (var2 & 2147483647) % this.n5.length;
      int var4 = this.n5[var3] - 1;
      if (var4 == -1) {
         return false;
      }

      int var5 = -1;

      while (this.l6[var4].HashCode != var2 || !this.a6.equalsT((TKey)this.k5[var4], key)) {
         var5 = var4;
         var4 = this.l6[var4].Next;
         if (var4 == -1) {
            break;
         }
      }

      if (var4 == -1) {
         return false;
      }

      this.c8--;
      if (var5 == -1) {
         this.n5[var3] = this.l6[var4].Next + 1;
      } else {
         this.l6[var5].Next = this.l6[var4].Next;
      }

      this.l6[var4].Next = this.h0;
      this.h0 = var4;
      this.l6[var4].HashCode = 0;
      this.k5[var4] = null;
      this.u3[var4] = null;
      this.s7++;
      return true;
   }

   @Override
   public boolean tryGetValue(TKey key, Object[] value) {
      if (key == null) {
         throw new ArgumentNullException("key");
      }

      int var3 = this.a6.hashCodeT(key) | -2147483648;

      for (int var4 = this.n5[(var3 & 2147483647) % this.n5.length] - 1; var4 != -1; var4 = this.l6[var4].Next) {
         if (this.l6[var4].HashCode == var3 && this.a6.equalsT((TKey)this.k5[var4], key)) {
            value[0] = this.u3[var4];
            return true;
         }
      }

      return false;
   }

   public Dictionary$KeyCollection<TKey, TValue> getKeys() {
      return new Dictionary$KeyCollection<>(this);
   }

   public Dictionary$ValueCollection<TKey, TValue> getValues() {
      return new Dictionary$ValueCollection<>(this);
   }

   public boolean isFixedSize() {
      return false;
   }

   @Override
   public boolean isReadOnly() {
      return false;
   }

   public boolean isSynchronized() {
      return false;
   }

   public Object getSyncRoot() {
      return this.x8;
   }

   public void addItem(KeyValuePair<TKey, TValue> keyValuePair) {
      this.addItem(keyValuePair.getKey(), keyValuePair.getValue());
   }

   public boolean containsItem(KeyValuePair<TKey, TValue> keyValuePair) {
      if (keyValuePair == null) {
         throw new ArgumentNullException("keyValuePair");
      } else {
         return this.n5(keyValuePair.Clone());
      }
   }

   public boolean removeItem(KeyValuePair<TKey, TValue> keyValuePair) {
      if (keyValuePair == null) {
         throw new ArgumentNullException("keyValuePair");
      } else {
         return !this.n5(keyValuePair.Clone()) ? false : this.removeItemByKey(keyValuePair.getKey());
      }
   }

   private boolean n5(KeyValuePair<TKey, TValue> var1) {
      Object var2 = null;
      Object[] var3 = new Object[]{var2};
      boolean var4 = !this.tryGetValue((TKey)var1.getKey(), var3);
      var2 = var3[0];
      return var4 ? false : new EqualityComparer$DefaultComparer<Object>().equalsT(var1.getValue(), var2);
   }

   public void copyTo(u3 array, int index) {
      Object var3 = com.aspose.slides.ms.System.u3.n5(array);
      KeyValuePair[] var4 = var3 instanceof KeyValuePair[] ? (KeyValuePair[])var3 : null;
      if (var4 != null) {
         this.copyToTArray(var4, index);
      } else {
         this.n5(array, index);
         DictionaryEntry[] var5 = var3 instanceof DictionaryEntry[] ? (DictionaryEntry[])var3 : null;
         if (var5 != null) {
            for (int var6 = 0; var6 < this.u9; var6++) {
               if ((this.l6[var6].HashCode & -2147483648) != 0) {
                  var5[index++] = new DictionaryEntry(this.k5[var6], this.u3[var6]);
               }
            }
         } else {
            this.n5(array, index, new Dictionary$1(this));
         }
      }
   }

   public Dictionary$Enumerator<TKey, TValue> iterator() {
      return new Dictionary$Enumerator<>(this);
   }

   @Deprecated
   public Dictionary$EnumeratorJava<TKey, TValue> iteratorJava() {
      return new Dictionary$EnumeratorJava<>(this);
   }

   Dictionary$Enumerator n5() {
      return new Dictionary$Enumerator<>(this);
   }

   @Deprecated
   Dictionary$EnumeratorJava l6() {
      return new Dictionary$EnumeratorJava<>(this);
   }

   // $VF: synthetic method
   static int n5(Dictionary var0) {
      return var0.s7;
   }

   // $VF: synthetic method
   static int l6(Dictionary var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static Dictionary$Link[] k5(Dictionary var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static Object[] u3(Dictionary var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static Object[] a6(Dictionary var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static void n5(Dictionary var0, u3 var1, int var2) {
      var0.n5(var1, var2);
   }

   // $VF: synthetic method
   static void n5(Dictionary var0, Object[] var1, int var2) {
      var0.n5(var1, var2);
   }

   // $VF: synthetic method
   static void n5(Dictionary var0, u3 var1, int var2, Dictionary$Transform var3) {
      var0.n5(var1, var2, var3);
   }

   // $VF: synthetic method
   static void l6(Dictionary var0, Object[] var1, int var2) {
      var0.l6(var1, var2);
   }
}
