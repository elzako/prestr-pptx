package com.aspose.slides.Collections.Generic;

import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;

@j3
final class SortedList$ValueList<TKey, TValue> implements IGenericCollection<TValue>, IGenericEnumerable<TValue>, IGenericList<TValue> {
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
   public final TValue get_Item(int index) {
      return (TValue)SortedList.l6(this.l6, index);
   }

   @Override
   public final void set_Item(int index, TValue value) {
      SortedList$ThrowHelper.throwNotSupportedException("Operation not supported");
   }

   public SortedList$ValueList(SortedList<TKey, TValue> var1, SortedList dictionary) {
      this.n5 = var1;
      this.l6 = dictionary;
   }

   @Override
   public final void addItem(TValue key) {
      SortedList$ThrowHelper.throwNotSupportedException("Operation not supported");
   }

   @Override
   public final void clear() {
      SortedList$ThrowHelper.throwNotSupportedException("Operation not supported");
   }

   @Override
   public final boolean containsItem(TValue value) {
      return this.l6.containsValue(value);
   }

   @Override
   public final void copyToTArray(TValue[] array, int arrayIndex) {
      u3.n5(k5.k5(SortedList.k5(this.l6), u3.class), 0, k5.k5(array, u3.class), arrayIndex, this.l6.size());
   }

   @Override
   public final void insertItem(int index, TValue value) {
      SortedList$ThrowHelper.throwNotSupportedException("Operation not supported");
   }

   @Override
   public final IGenericEnumerator<TValue> iterator() {
      return new SortedList$SortedListValueEnumerator<>(this.n5, this.l6);
   }

   @Deprecated
   public final IGenericEnumerator<TValue> n5() {
      return new SortedList$SortedListValueEnumeratorJava<>(this.n5, this.l6);
   }

   @Override
   public final int indexOfItem(TValue value) {
      return u3.n5(SortedList.k5(this.l6), value, 0, this.l6.size());
   }

   @Override
   public final boolean removeItem(TValue value) {
      SortedList$ThrowHelper.throwNotSupportedException("Operation not supported");
      return false;
   }

   @Override
   public final void removeAt(int index) {
      SortedList$ThrowHelper.throwNotSupportedException("Operation not supported");
   }
}
