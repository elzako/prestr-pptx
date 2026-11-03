package com.aspose.slides.Collections.Generic;

import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;

@j3
final class SortedList$KeyList<TKey, TValue> implements IGenericCollection<TKey>, IGenericEnumerable<TKey>, IGenericList<TKey> {
   private SortedList<TKey, TValue> l6;
   // $VF: synthetic field
   final SortedList n5;

   @Override
   public final int size() {
      return SortedList.u3(this.l6);
   }

   @Override
   public final boolean isReadOnly() {
      return true;
   }

   @Override
   public final TKey get_Item(int index) {
      return (TKey)SortedList.n5(this.l6, index);
   }

   @Override
   public final void set_Item(int index, TKey value) {
      SortedList$ThrowHelper.throwNotSupportedException("Operation not supported");
   }

   public SortedList$KeyList(SortedList<TKey, TValue> var1, SortedList dictionary) {
      this.n5 = var1;
      this.l6 = dictionary;
   }

   @Override
   public final void addItem(TKey key) {
      SortedList$ThrowHelper.throwNotSupportedException("Operation not supported");
   }

   @Override
   public final void clear() {
      SortedList$ThrowHelper.throwNotSupportedException("Operation not supported");
   }

   @Override
   public final boolean containsItem(TKey key) {
      return this.l6.containsKey(key);
   }

   @Override
   public final void copyToTArray(TKey[] array, int arrayIndex) {
      u3.n5(k5.k5(SortedList.l6(this.l6), u3.class), 0, k5.k5(array, u3.class), arrayIndex, this.l6.size());
   }

   @Override
   public final void insertItem(int index, TKey value) {
      SortedList$ThrowHelper.throwNotSupportedException("Operation not supported");
   }

   @Override
   public final IGenericEnumerator<TKey> iterator() {
      return new SortedList$SortedListKeyEnumerator<>(this.n5, this.l6);
   }

   @Deprecated
   public final IGenericEnumerator<TKey> n5() {
      return new SortedList$SortedListKeyEnumeratorJava<>(this.n5, this.l6);
   }

   @Override
   public final int indexOfItem(TKey key) {
      if (key == null) {
         SortedList$ThrowHelper.throwArgumentNullException("key");
      }

      int var2 = u3.n5(u3.n5((Object)(SortedList.l6(this.l6))), 0, this.l6.size(), key, SortedList.a6(this.l6));
      return var2 >= 0 ? var2 : -1;
   }

   @Override
   public final boolean removeItem(TKey key) {
      SortedList$ThrowHelper.throwNotSupportedException("Operation not supported");
      return false;
   }

   @Override
   public final void removeAt(int index) {
      SortedList$ThrowHelper.throwNotSupportedException("Operation not supported");
   }
}
