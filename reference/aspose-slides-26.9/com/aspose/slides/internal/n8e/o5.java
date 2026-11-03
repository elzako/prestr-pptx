package com.aspose.slides.internal.n8e;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotSupportedException;

public class o5<T> implements IGenericList<T> {
   private Class<T> n5;
   private final IGenericList<T> l6;

   public o5(Class<T> var1, IGenericList<T> var2) {
      this.n5 = var1;
      if (var2 == null) {
         throw new ArgumentNullException();
      }

      this.l6 = var2;
   }

   @Override
   public final int size() {
      return this.l6.size();
   }

   @Override
   public final boolean isReadOnly() {
      return true;
   }

   @Override
   public final void addItem(T item) {
      throw new NotSupportedException();
   }

   @Override
   public final void clear() {
      throw new NotSupportedException();
   }

   @Override
   public final void copyToTArray(T[] array, int arrayIndex) {
      this.l6.copyToTArray(array, arrayIndex);
   }

   @Override
   public final boolean containsItem(T item) {
      return this.l6.containsItem(item);
   }

   @Override
   public final IGenericEnumerator<T> iterator() {
      return this.l6.iterator();
   }

   @Override
   public final int indexOfItem(T item) {
      return this.l6.indexOfItem(item);
   }

   @Override
   public final void insertItem(int index, T item) {
      throw new NotSupportedException();
   }

   @Override
   public final boolean removeItem(T item) {
      throw new NotSupportedException();
   }

   @Override
   public final void removeAt(int index) {
      throw new NotSupportedException();
   }

   @Override
   public final T get_Item(int index) {
      return this.l6.get_Item(index);
   }

   @Override
   public final void set_Item(int index, T value) {
      throw new NotSupportedException();
   }
}
