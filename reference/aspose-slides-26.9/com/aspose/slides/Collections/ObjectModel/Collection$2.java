package com.aspose.slides.Collections.ObjectModel;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.IList;
import com.aspose.slides.ms.System.u3;

class Collection$2 implements IList {
   // $VF: synthetic field
   final Collection n5;

   Collection$2(Collection this$0) {
      this.n5 = this$0;
   }

   @Override
   public boolean isFixedSize() {
      return false;
   }

   @Override
   public boolean isReadOnly() {
      return Collection.n5(this.n5).isReadOnly();
   }

   @Override
   public Object get_Item(int index) {
      return Collection.n5(this.n5).get_Item(index);
   }

   @Override
   public void set_Item(int index, Object value) {
      Collection.n5(this.n5).set_Item(index, value);
   }

   @Override
   public int addItem(Object value) {
      int var2 = Collection.n5(this.n5).size();
      Collection.n5(this.n5).addItem(value);
      return var2;
   }

   @Override
   public void removeItem(Object value) {
      Collection.n5(this.n5).removeItem(value);
   }

   @Override
   public void insertItem(int index, Object value) {
      Collection.n5(this.n5).insertItem(index, value);
   }

   @Override
   public void removeAt(int index) {
      Collection.n5(this.n5).removeAt(index);
   }

   @Override
   public void clear() {
      Collection.n5(this.n5).clear();
   }

   @Override
   public boolean contains(Object value) {
      return Collection.n5(this.n5).containsItem(value);
   }

   @Override
   public int indexOf(Object value) {
      return Collection.n5(this.n5).indexOfItem(value);
   }

   @Override
   public int size() {
      return Collection.n5(this.n5).size();
   }

   @Override
   public boolean isSynchronized() {
      return false;
   }

   @Override
   public Object getSyncRoot() {
      return Collection.l6(this.n5);
   }

   @Override
   public void copyTo(u3 array, int index) {
      this.n5.copyToTArray((Object[])u3.n5(array), index);
   }

   @Override
   public IEnumerator iterator() {
      return Collection.n5(this.n5).iterator();
   }
}
