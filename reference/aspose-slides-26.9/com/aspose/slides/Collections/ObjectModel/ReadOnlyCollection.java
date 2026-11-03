package com.aspose.slides.Collections.ObjectModel;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.j3;

@j3
public class ReadOnlyCollection<T> implements IGenericList<T> {
   private IGenericList<T> n5;

   public ReadOnlyCollection(IGenericList<T> list) {
      if (list == null) {
         throw new ArgumentNullException("list");
      }

      this.n5 = list;
   }

   @Override
   public void addItem(T item) {
      throw new NotSupportedException();
   }

   @Override
   public void clear() {
      throw new NotSupportedException();
   }

   @Override
   public boolean containsItem(T value) {
      return this.n5.containsItem(value);
   }

   @Override
   public void copyToTArray(T[] array, int index) {
      this.n5.copyToTArray(array, index);
   }

   @Override
   public IGenericEnumerator<T> iterator() {
      return this.n5.iterator();
   }

   @Override
   public int indexOfItem(T value) {
      return this.n5.indexOfItem(value);
   }

   @Override
   public void insertItem(int index, T item) {
      throw new NotSupportedException();
   }

   @Override
   public boolean removeItem(T item) {
      throw new NotSupportedException();
   }

   @Override
   public void removeAt(int index) {
      throw new NotSupportedException();
   }

   @Override
   public int size() {
      return this.n5.size();
   }

   protected IGenericList<T> getItems() {
      return this.n5;
   }

   @Override
   public T get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public void set_Item(int index, T value) {
      throw new NotSupportedException();
   }

   @Override
   public boolean isReadOnly() {
      return true;
   }

   public int add(Object value) {
      throw new NotSupportedException();
   }

   public void insert(int index, Object value) {
      throw new NotSupportedException();
   }

   public void remove(Object value) {
      throw new NotSupportedException();
   }

   public boolean isSynchronized() {
      return false;
   }

   public Object getSyncRoot() {
      return this;
   }

   public boolean isFixedSize() {
      return true;
   }
}
