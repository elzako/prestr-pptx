package com.aspose.slides.Collections;

import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;

@j3
final class ArrayList$SynchronizedListWrapper extends ArrayList$ListWrapper {
   private final Object l6;

   public ArrayList$SynchronizedListWrapper(IList innerList) {
      super(innerList);
      this.l6 = innerList.getSyncRoot();
   }

   @Override
   public int size() {
      synchronized (this.l6) {
         return this.n5.size();
      }
   }

   @Override
   public boolean isSynchronized() {
      return true;
   }

   @Override
   public Object getSyncRoot() {
      synchronized (this.l6) {
         return this.n5.getSyncRoot();
      }
   }

   @Override
   public boolean isFixedSize() {
      synchronized (this.l6) {
         return this.n5.isFixedSize();
      }
   }

   @Override
   public boolean isReadOnly() {
      synchronized (this.l6) {
         return this.n5.isReadOnly();
      }
   }

   @Override
   public Object get_Item(int index) {
      synchronized (this.l6) {
         return this.n5.get_Item(index);
      }
   }

   @Override
   public void set_Item(int index, Object value) {
      synchronized (this.l6) {
         this.n5.set_Item(index, value);
      }
   }

   @Override
   public int addItem(Object value) {
      synchronized (this.l6) {
         return this.n5.addItem(value);
      }
   }

   @Override
   public void clear() {
      synchronized (this.l6) {
         this.n5.clear();
      }
   }

   @Override
   public boolean contains(Object value) {
      synchronized (this.l6) {
         return this.n5.contains(value);
      }
   }

   @Override
   public int indexOf(Object value) {
      synchronized (this.l6) {
         return this.n5.indexOf(value);
      }
   }

   @Override
   public void insertItem(int index, Object value) {
      synchronized (this.l6) {
         this.n5.insertItem(index, value);
      }
   }

   @Override
   public void removeItem(Object value) {
      synchronized (this.l6) {
         this.n5.removeItem(value);
      }
   }

   @Override
   public void removeAt(int index) {
      synchronized (this.l6) {
         this.n5.removeAt(index);
      }
   }

   @Override
   public void copyTo(u3 array, int index) {
      synchronized (this.l6) {
         this.n5.copyTo(array, index);
      }
   }

   @Override
   public IEnumerator iterator() {
      synchronized (this.l6) {
         return this.n5.iterator();
      }
   }
}
