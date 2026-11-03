package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.u3;
import java.util.Comparator;

public class SortedList<TKey, TValue>
   implements IGenericCollection<KeyValuePair<TKey, TValue>>,
   IGenericDictionary<TKey, TValue>,
   IGenericEnumerable<KeyValuePair<TKey, TValue>> {
   private static Object[] n5 = new Object[0];
   private static Object[] l6 = new Object[0];
   private Object[] k5;
   private Object[] u3;
   private int a6;
   private int u9;
   private Comparator<TKey> h0;
   private SortedList$KeyList<TKey, TValue> c8;
   private SortedList$ValueList<TKey, TValue> t2;
   private final Object s7 = new Object();

   public final int getCapacity() {
      return this.k5.length;
   }

   public final void setCapacity(int value) {
      if (value != this.k5.length) {
         if (value < this.a6) {
            SortedList$ThrowHelper.throwArgumentOutOfRangeException("value", "Capacity is set to a value that is less than Count");
         }

         if (value > 0) {
            Object[] var2 = new Object[value];
            Object[] var3 = new Object[value];
            if (this.a6 > 0) {
               com.aspose.slides.ms.System.u3.n5(
                  com.aspose.slides.internal.v6g.k5.k5(this.k5, u3.class), 0, com.aspose.slides.internal.v6g.k5.k5(var2, u3.class), 0, this.a6
               );
               com.aspose.slides.ms.System.u3.n5(
                  com.aspose.slides.internal.v6g.k5.k5(this.u3, u3.class), 0, com.aspose.slides.internal.v6g.k5.k5(var3, u3.class), 0, this.a6
               );
            }

            this.k5 = var2;
            this.u3 = var3;
         } else {
            this.k5 = n5;
            this.u3 = l6;
         }
      }
   }

   public final Comparator<TKey> getComparer() {
      return this.h0;
   }

   @Override
   public final int size() {
      return this.a6;
   }

   public final IGenericList<TKey> getKeys() {
      return this.n5();
   }

   public final IGenericList<TValue> getValues() {
      return this.l6();
   }

   @Override
   public final boolean isReadOnly() {
      return false;
   }

   public final boolean isFixedSize() {
      return false;
   }

   public final boolean isSynchronized() {
      return false;
   }

   public final Object getSyncRoot() {
      return this.s7;
   }

   @Override
   public final TValue get_Item(TKey key) {
      int var2 = this.indexOfKey(key);
      if (var2 >= 0) {
         return (TValue)this.u3[var2];
      }

      SortedList$ThrowHelper.throwKeyNotFoundException();
      return null;
   }

   @Override
   public final void set_Item(TKey key, TValue value) {
      if (key == null) {
         SortedList$ThrowHelper.throwArgumentNullException("key");
      }

      int var3 = com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.k5)), 0, this.a6, key, this.h0);
      if (var3 >= 0) {
         this.u3[var3] = value;
         this.u9++;
      } else {
         this.n5(~var3, key, value);
      }
   }

   public SortedList() {
      this.k5 = n5;
      this.u3 = l6;
      this.a6 = 0;
      this.h0 = Comparer.getDefault();
   }

   public SortedList(int capacity) {
      if (capacity < 0) {
         SortedList$ThrowHelper.throwArgumentOutOfRangeException("capacity", "capacity is less than zero");
      }

      this.k5 = new Object[capacity];
      this.u3 = new Object[capacity];
      this.h0 = Comparer.getDefault();
   }

   public SortedList(Comparator<TKey> comparer) {
      this();
      if (comparer != null) {
         this.h0 = comparer;
      }
   }

   public SortedList(int capacity, Comparator<TKey> comparer) {
      this(comparer);
      this.setCapacity(capacity);
   }

   public SortedList(IGenericDictionary<TKey, TValue> dictionary) {
      this(dictionary, (Comparator<TKey>)null);
   }

   public SortedList(IGenericDictionary<TKey, TValue> dictionary, Comparator<TKey> comparer) {
      this(dictionary != null ? dictionary.size() : 0, comparer);
      if (dictionary == null) {
         SortedList$ThrowHelper.throwArgumentNullException("dictionary");
      }

      this.n5(dictionary.getKeys(), this.k5, 0);
      this.n5(dictionary.getValues(), this.u3, 0);
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.k5)), com.aspose.slides.ms.System.u3.n5((Object)(this.u3)), comparer);
      this.a6 = dictionary.size();
   }

   private <T> void n5(IGenericCollection<T> var1, Object[] var2, int var3) {
      for (Object var5 : var1) {
         var2[var3] = var5;
         var3++;
      }
   }

   @Override
   public final void addItem(TKey key, TValue value) {
      if (key == null) {
         SortedList$ThrowHelper.throwArgumentNullException("key");
      }

      int var3 = com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.k5)), 0, this.a6, key, this.h0);
      if (var3 >= 0) {
         SortedList$ThrowHelper.throwArgumentException("An element with the same key already exists");
      }

      this.n5(~var3, key, value);
   }

   public final void addItem(KeyValuePair<TKey, TValue> keyValuePair) {
      this.addItem(keyValuePair.getKey(), keyValuePair.getValue());
   }

   public final boolean containsItem(KeyValuePair<TKey, TValue> keyValuePair) {
      int var2 = this.indexOfKey(keyValuePair.getKey());
      return var2 >= 0 && EqualityComparer.getDefault().equals(this.u3[var2], keyValuePair.getValue());
   }

   public final boolean removeItem(KeyValuePair<TKey, TValue> keyValuePair) {
      int var2 = this.indexOfKey(keyValuePair.getKey());
      if (var2 >= 0 && EqualityComparer.getDefault().equals(this.u3[var2], keyValuePair.getValue())) {
         this.removeAt(var2);
         return true;
      } else {
         return false;
      }
   }

   private SortedList$KeyList<TKey, TValue> n5() {
      if (this.c8 == null) {
         this.c8 = new SortedList$KeyList<>(this, this);
      }

      return this.c8;
   }

   private SortedList$ValueList<TKey, TValue> l6() {
      if (this.t2 == null) {
         this.t2 = new SortedList$ValueList<>(this, this);
      }

      return this.t2;
   }

   @Override
   public final void clear() {
      this.u9++;
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.k5(this.k5, u3.class), 0, this.a6);
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.k5(this.u3, u3.class), 0, this.a6);
      this.a6 = 0;
   }

   @Override
   public final boolean containsKey(TKey key) {
      return this.indexOfKey(key) >= 0;
   }

   public final boolean containsValue(TValue value) {
      return this.indexOfValue(value) >= 0;
   }

   public final void copyToTArray(KeyValuePair<TKey, TValue>[] array, int arrayIndex) {
      if (array == null) {
         SortedList$ThrowHelper.throwArgumentNullException("array");
      }

      if (arrayIndex < 0 || arrayIndex > array.length) {
         SortedList$ThrowHelper.throwArgumentOutOfRangeException("arrayIndex", "index is less than zero or index is equal to or greater than size of array");
      }

      if (array.length - arrayIndex < this.size()) {
         SortedList$ThrowHelper.throwArgumentException(
            "The number of elements in the source collection is greater than the available space from arrayIndex to the end of the destination array"
         );
      }

      for (int var3 = 0; var3 < this.size(); var3++) {
         KeyValuePair var4 = new KeyValuePair<>(this.k5[var3], this.u3[var3]);
         var4.CloneTo(array[arrayIndex + var3]);
      }
   }

   public final void copyTo(u3 array, int arrayIndex) {
      if (array == null) {
         SortedList$ThrowHelper.throwArgumentNullException("array");
      }

      if (array.u3() != 1) {
         SortedList$ThrowHelper.throwArgumentException("array is multidimensional");
      }

      if (array.l6(0) != 0) {
         SortedList$ThrowHelper.throwArgumentException("array does not have zero-based indexing");
      }

      if (arrayIndex < 0 || arrayIndex > array.a6()) {
         SortedList$ThrowHelper.throwArgumentOutOfRangeException("arrayIndex", "index is less than zero or index is equal to or greater than size of array");
      }

      if (array.a6() - arrayIndex < this.size()) {
         SortedList$ThrowHelper.throwArgumentException(
            "The number of elements in the source collection is greater than the available space from arrayIndex to the end of the destination array"
         );
      }

      KeyValuePair[] var3 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.u3.n5(array), KeyValuePair[].class);
      if (var3 != null) {
         for (int var4 = 0; var4 < this.size(); var4++) {
            var3[var4 + arrayIndex] = new KeyValuePair<>(this.k5[var4], this.u3[var4]);
         }
      } else {
         Object[] var7 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.u3.n5(array), Object[].class);
         if (var7 == null) {
            SortedList$ThrowHelper.throwArgumentException("The type of the source collection cannot be cast automatically to the type of the destination array");
         }

         try {
            for (int var5 = 0; var5 < this.size(); var5++) {
               var7[var5 + arrayIndex] = new KeyValuePair<>(this.k5[var5], this.u3[var5]);
            }
         } catch (Exception var6) {
            SortedList$ThrowHelper.throwArgumentException("The type of the source collection cannot be cast automatically to the type of the destination array");
         }
      }
   }

   private void n5(int var1) {
      int var2 = this.k5.length == 0 ? 4 : this.k5.length * 2;
      if (var2 < var1) {
         var2 = var1;
      }

      this.setCapacity(var2);
   }

   private TValue l6(int var1) {
      if (var1 < 0 || var1 >= this.a6) {
         SortedList$ThrowHelper.throwArgumentOutOfRangeException("index", "index is less than zero or index is equal to or greater than Count");
      }

      return (TValue)this.u3[var1];
   }

   @Override
   public final IGenericEnumerator<KeyValuePair<TKey, TValue>> iterator() {
      return new SortedList$Enumerator<>(this, 1);
   }

   @Deprecated
   public final IGenericEnumerator<KeyValuePair<TKey, TValue>> iteratorJava() {
      return new SortedList$EnumeratorJava<>(this, 1);
   }

   @Deprecated
   public final IGenericEnumerator<TKey> iteratorJavaKeys() {
      return ((SortedList$KeyList)this.getKeys()).n5();
   }

   @Deprecated
   public final IGenericEnumerator<TValue> iteratorJavaValues() {
      return ((SortedList$ValueList)this.getValues()).n5();
   }

   public final IDictionaryEnumerator iterator_IDictionary() {
      return new SortedList$Enumerator<>(this, 2);
   }

   @Deprecated
   public final IDictionaryEnumerator iteratorJava_IDictionary() {
      return new SortedList$EnumeratorJava<>(this, 2);
   }

   private TKey k5(int var1) {
      if (var1 < 0 || var1 >= this.a6) {
         SortedList$ThrowHelper.throwArgumentOutOfRangeException("index", "index is less than zero or index is equal to or greater than Count");
      }

      return (TKey)this.k5[var1];
   }

   public final int indexOfKey(TKey key) {
      if (key == null) {
         SortedList$ThrowHelper.throwArgumentNullException("key");
      }

      int var2 = com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.k5)), 0, this.a6, key, this.h0);
      return var2 < 0 ? -1 : var2;
   }

   public final int indexOfValue(TValue value) {
      return com.aspose.slides.ms.System.u3.n5(this.u3, value, 0, this.a6);
   }

   private void n5(int var1, TKey var2, TValue var3) {
      if (this.a6 == this.k5.length) {
         this.n5(this.a6 + 1);
      }

      if (var1 < this.a6) {
         com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.internal.v6g.k5.k5(this.k5, u3.class), var1, com.aspose.slides.internal.v6g.k5.k5(this.k5, u3.class), var1 + 1, this.a6 - var1
         );
         com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.internal.v6g.k5.k5(this.u3, u3.class), var1, com.aspose.slides.internal.v6g.k5.k5(this.u3, u3.class), var1 + 1, this.a6 - var1
         );
      }

      this.k5[var1] = var2;
      this.u3[var1] = var3;
      this.a6++;
      this.u9++;
   }

   @Override
   public final boolean tryGetValue(TKey key, Object[] value) {
      int var3 = this.indexOfKey(key);
      if (var3 >= 0) {
         value[0] = this.u3[var3];
         return true;
      } else {
         value[0] = null;
         return false;
      }
   }

   public final void removeAt(int index) {
      if (index < 0 || index >= this.a6) {
         SortedList$ThrowHelper.throwArgumentOutOfRangeException("index", "index is less than zero or index is equal to or greater than Count");
      }

      this.a6--;
      if (index < this.a6) {
         com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.internal.v6g.k5.k5(this.k5, u3.class), index + 1, com.aspose.slides.internal.v6g.k5.k5(this.k5, u3.class), index, this.a6 - index
         );
         com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.internal.v6g.k5.k5(this.u3, u3.class), index + 1, com.aspose.slides.internal.v6g.k5.k5(this.u3, u3.class), index, this.a6 - index
         );
      }

      this.k5[this.a6] = null;
      this.u3[this.a6] = null;
      this.u9++;
   }

   @Override
   public final boolean removeItemByKey(TKey key) {
      int var2 = this.indexOfKey(key);
      if (var2 >= 0) {
         this.removeAt(var2);
      }

      return var2 >= 0;
   }

   public final void trimExcess() {
      if (this.a6 < com.aspose.slides.internal.v6g.k5.u3(this.k5.length * 0.9, 14)) {
         this.setCapacity(this.a6);
      }
   }

   // $VF: synthetic method
   static int n5(SortedList var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static Object[] l6(SortedList var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static Object[] k5(SortedList var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static int u3(SortedList var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static Object n5(SortedList var0, int var1) {
      return var0.k5(var1);
   }

   // $VF: synthetic method
   static Comparator a6(SortedList var0) {
      return var0.h0;
   }

   // $VF: synthetic method
   static Object l6(SortedList var0, int var1) {
      return var0.l6(var1);
   }
}
