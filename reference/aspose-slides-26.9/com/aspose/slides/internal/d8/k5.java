package com.aspose.slides.internal.d8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.exceptions.NotImplementedException;

public class k5<T> implements IGenericList<T> {
   private final T[] n5;
   private final int l6;
   private int k5;

   public k5(T[] var1, int var2, int var3) {
      this.n5 = (T[])var1;
      this.l6 = var2;
      this.n5(var3);
   }

   @Override
   public int size() {
      return this.k5;
   }

   public final int n5() {
      return this.k5;
   }

   private void n5(int var1) {
      this.k5 = var1;
   }

   @Override
   public final IGenericEnumerator<T> iterator() {
      return new l6<>(this.n5, this.n5());
   }

   @Override
   public final void addItem(T item) {
      this.n5[this.l6 + this.n5()] = item;
      this.n5(this.n5() + 1);
   }

   @Override
   public final void clear() {
      this.n5(0);
   }

   @Override
   public final boolean containsItem(T item) {
      throw new NotImplementedException();
   }

   @Override
   public final void copyToTArray(T[] array, int arrayIndex) {
      throw new NotImplementedException();
   }

   @Override
   public final boolean removeItem(T item) {
      throw new NotImplementedException();
   }

   @Override
   public final boolean isReadOnly() {
      return false;
   }

   @Override
   public final int indexOfItem(T item) {
      throw new NotImplementedException();
   }

   @Override
   public final void insertItem(int index, T item) {
      throw new NotImplementedException();
   }

   @Override
   public final void removeAt(int index) {
      throw new NotImplementedException();
   }

   @Override
   public final T get_Item(int index) {
      return this.n5[this.l6 + index];
   }

   @Override
   public final void set_Item(int index, T value) {
      this.n5[this.l6 + index] = value;
   }
}
