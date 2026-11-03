package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.u3;

class SortedList$SynchedSortedList extends SortedList {
   private SortedList n5;

   public SortedList$SynchedSortedList(SortedList host) {
      if (host == null) {
         throw new ArgumentNullException();
      }

      this.n5 = host;
   }

   @Override
   public int getCapacity() {
      synchronized (this.n5.getSyncRoot()) {
         return this.n5.getCapacity();
      }
   }

   @Override
   public void setCapacity(int value) {
      synchronized (this.n5.getSyncRoot()) {
         this.n5.setCapacity(value);
      }
   }

   @Override
   public int size() {
      return this.n5.size();
   }

   @Override
   public boolean isSynchronized() {
      return true;
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
   public ICollection getKeys() {
      Object var1 = null;
      synchronized (this.n5.getSyncRoot()) {
         return this.n5.getKeys();
      }
   }

   @Override
   public ICollection getValues() {
      Object var1 = null;
      synchronized (this.n5.getSyncRoot()) {
         return this.n5.getValues();
      }
   }

   @Override
   public Object get_Item(Object key) {
      synchronized (this.n5.getSyncRoot()) {
         return SortedList.n5(this.n5, key);
      }
   }

   @Override
   public void set_Item(Object key, Object value) {
      synchronized (this.n5.getSyncRoot()) {
         SortedList.n5(this.n5, key, value, true);
      }
   }

   @Override
   public void copyTo(u3 array, int arrayIndex) {
      synchronized (this.n5.getSyncRoot()) {
         this.n5.copyTo(array, arrayIndex);
      }
   }

   @Override
   public void addItem(Object key, Object value) {
      synchronized (this.n5.getSyncRoot()) {
         SortedList.n5(this.n5, key, value, false);
      }
   }

   @Override
   public void clear() {
      synchronized (this.n5.getSyncRoot()) {
         this.n5.clear();
      }
   }

   @Override
   public boolean contains(Object key) {
      synchronized (this.n5.getSyncRoot()) {
         return SortedList.l6(this.n5, key) >= 0;
      }
   }

   @Override
   public IDictionaryEnumerator iterator() {
      synchronized (this.n5.getSyncRoot()) {
         return this.n5.iterator();
      }
   }

   @Deprecated
   @Override
   public IDictionaryEnumerator iteratorJava() {
      synchronized (this.n5.getSyncRoot()) {
         return this.n5.iteratorJava();
      }
   }

   @Override
   public void removeItem(Object key) {
      synchronized (this.n5.getSyncRoot()) {
         this.n5.removeItem(key);
      }
   }

   @Override
   public boolean containsKey(Object key) {
      synchronized (this.n5.getSyncRoot()) {
         return this.n5.contains(key);
      }
   }

   @Override
   public boolean containsValue(Object value) {
      synchronized (this.n5.getSyncRoot()) {
         return this.n5.containsValue(value);
      }
   }

   @Override
   public Object deepClone() {
      synchronized (this.n5.getSyncRoot()) {
         return this.n5.deepClone();
      }
   }

   @Override
   public Object getByIndex(int index) {
      synchronized (this.n5.getSyncRoot()) {
         return this.n5.getByIndex(index);
      }
   }

   @Override
   public Object getKey(int index) {
      synchronized (this.n5.getSyncRoot()) {
         return this.n5.getKey(index);
      }
   }

   @Override
   public IList getKeyList() {
      synchronized (this.n5.getSyncRoot()) {
         return new SortedList$ListKeys(this.n5);
      }
   }

   @Override
   public IList getValueList() {
      synchronized (this.n5.getSyncRoot()) {
         return new SortedList$ListValues(this.n5);
      }
   }

   @Override
   public void removeAt(int index) {
      synchronized (this.n5.getSyncRoot()) {
         this.n5.removeAt(index);
      }
   }

   @Override
   public int indexOfKey(Object key) {
      synchronized (this.n5.getSyncRoot()) {
         return this.n5.indexOfKey(key);
      }
   }

   @Override
   public int indexOfValue(Object val) {
      synchronized (this.n5.getSyncRoot()) {
         return this.n5.indexOfValue(val);
      }
   }

   @Override
   public void setByIndex(int index, Object value) {
      synchronized (this.n5.getSyncRoot()) {
         this.n5.setByIndex(index, value);
      }
   }

   @Override
   public void trimToSize() {
      synchronized (this.n5.getSyncRoot()) {
         this.n5.trimToSize();
      }
   }
}
