package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;

@j3
class SortedList$ListKeys implements IList {
   private SortedList n5;

   public SortedList$ListKeys(SortedList host) {
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
      SortedList.n5(this.n5, array, arrayIndex, 0);
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
      return this.n5.getKey(index);
   }

   @Override
   public void set_Item(int index, Object value) {
      throw new NotSupportedException("attempt to modify a key");
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
   public boolean contains(Object key) {
      return this.n5.contains(key);
   }

   @Override
   public int indexOf(Object key) {
      return this.n5.indexOfKey(key);
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
      return new SortedList$Enumerator(this.n5, 0);
   }
}
