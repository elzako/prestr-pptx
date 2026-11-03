package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;

@j3
class SortedList$ListValues implements IList {
   private SortedList n5;

   public SortedList$ListValues(SortedList host) {
      if (host == null) {
         throw new ArgumentNullException();
      }

      this.n5 = host;
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
   public void copyTo(u3 array, int arrayIndex) {
      SortedList.n5(this.n5, array, arrayIndex, 1);
   }

   @Override
   public boolean isFixedSize() {
      return true;
   }

   @Override
   public boolean isReadOnly() {
      return true;
   }

   @Override
   public Object get_Item(int index) {
      return this.n5.getByIndex(index);
   }

   @Override
   public void set_Item(int index, Object value) {
      throw new NotSupportedException("This operation is not supported on GetValueList return");
   }

   @Override
   public int addItem(Object value) {
      throw new NotSupportedException("IList::Add not supported");
   }

   @Override
   public void clear() {
      throw new NotSupportedException("IList::Clear not supported");
   }

   @Override
   public boolean contains(Object value) {
      return this.n5.containsValue(value);
   }

   @Override
   public int indexOf(Object value) {
      return this.n5.indexOfValue(value);
   }

   @Override
   public void insertItem(int index, Object value) {
      throw new NotSupportedException("IList::Insert not supported");
   }

   @Override
   public void removeItem(Object value) {
      throw new NotSupportedException("IList::Remove not supported");
   }

   @Override
   public void removeAt(int index) {
      throw new NotSupportedException("IList::RemoveAt not supported");
   }

   @Override
   public IEnumerator iterator() {
      return new SortedList$Enumerator(this.n5, 1);
   }
}
