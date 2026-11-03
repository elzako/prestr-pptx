package com.aspose.slides.ms.System;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.exceptions.NotSupportedException;

class u3$k5<T> implements IGenericList<T> {
   private u3 n5;

   private u3$k5(u3 var1) {
      this.n5 = var1;
   }

   @Override
   public int indexOfItem(T item) {
      return this.n5.indexOf(item);
   }

   @Override
   public void insertItem(int index, T item) {
      throw new NotSupportedException("Collection is of a fixed size");
   }

   @Override
   public void removeAt(int index) {
      throw new NotSupportedException("Collection is of a fixed size");
   }

   @Override
   public T get_Item(int index) {
      return (T)this.n5.get_Item(index);
   }

   @Override
   public void set_Item(int index, T value) {
      this.n5.set_Item(index, value);
   }

   @Override
   public int size() {
      return this.n5.a6();
   }

   @Override
   public boolean isReadOnly() {
      return true;
   }

   @Override
   public void addItem(T item) {
      throw new NotSupportedException("Collection is of a fixed size");
   }

   @Override
   public void clear() {
      throw new NotSupportedException("Collection is read-only");
   }

   @Override
   public boolean containsItem(T item) {
      return this.n5.contains(item);
   }

   @Override
   public void copyToTArray(T[] array, int arrayIndex) {
      this.n5.copyTo(u3.n5((Object)(array)), arrayIndex);
   }

   @Override
   public boolean removeItem(T item) {
      throw new NotSupportedException("Collection is of a fixed size");
   }

   @Override
   public IGenericEnumerator<T> iterator() {
      return new u3$k5$n5<>(this, null);
   }

   // $VF: synthetic method
   u3$k5(u3 var1, a6 var2) {
      this(var1);
   }

   // $VF: synthetic method
   static u3 n5(u3$k5 var0) {
      return var0.n5;
   }
}
