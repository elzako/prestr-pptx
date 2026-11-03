package com.aspose.slides.Collections;

import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;

@j3
class ArrayList$ListWrapper implements IList {
   protected IList n5;

   public ArrayList$ListWrapper(IList innerList) {
      this.n5 = innerList;
   }

   @Override
   public Object get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public void set_Item(int index, Object value) {
      this.n5.set_Item(index, value);
   }

   @Override
   public int size() {
      return this.n5.size();
   }

   @Override
   public boolean isSynchronized() {
      return this.n5.isSynchronized();
   }

   @Override
   public Object getSyncRoot() {
      return this.n5.getSyncRoot();
   }

   @Override
   public boolean isFixedSize() {
      return this.n5.isFixedSize();
   }

   @Override
   public boolean isReadOnly() {
      return this.n5.isReadOnly();
   }

   @Override
   public int addItem(Object value) {
      return this.n5.addItem(value);
   }

   @Override
   public void clear() {
      this.n5.clear();
   }

   @Override
   public boolean contains(Object value) {
      return this.n5.contains(value);
   }

   @Override
   public int indexOf(Object value) {
      return this.n5.indexOf(value);
   }

   @Override
   public void insertItem(int index, Object value) {
      this.n5.insertItem(index, value);
   }

   @Override
   public void removeItem(Object value) {
      this.n5.removeItem(value);
   }

   @Override
   public void removeAt(int index) {
      this.n5.removeAt(index);
   }

   @Override
   public void copyTo(u3 array, int index) {
      this.n5.copyTo(array, index);
   }

   @Override
   public IEnumerator iterator() {
      return this.n5.iterator();
   }
}
