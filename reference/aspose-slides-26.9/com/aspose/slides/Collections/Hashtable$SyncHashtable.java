package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.h3d.c4;
import com.aspose.slides.internal.h3d.s3;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;

@j3
class Hashtable$SyncHashtable extends Hashtable {
   protected Hashtable n5;

   Hashtable$SyncHashtable(Hashtable table) {
      super(false);
      this.n5 = table;
   }

   @Override
   public void addItem(Object key, Object value) {
      synchronized (this.n5.getSyncRoot()) {
         this.n5.addItem(key, value);
      }
   }

   @Override
   public void clear() {
      synchronized (this.n5.getSyncRoot()) {
         this.n5.clear();
      }
   }

   @Override
   public Object deepClone() {
      synchronized (this.n5.getSyncRoot()) {
         return Hashtable.sync((Hashtable)this.n5.deepClone());
      }
   }

   @Override
   public boolean contains(Object key) {
      return this.n5.contains(key);
   }

   @Override
   public boolean containsKey(Object key) {
      return this.n5.containsKey(key);
   }

   @Override
   public boolean containsValue(Object key) {
      synchronized (this.n5.getSyncRoot()) {
         return this.n5.containsValue(key);
      }
   }

   @Override
   public void copyTo(u3 array, int arrayIndex) {
      synchronized (this.n5.getSyncRoot()) {
         this.n5.copyTo(array, arrayIndex);
      }
   }

   @Override
   public IDictionaryEnumerator iterator() {
      return this.n5.iterator();
   }

   @Override
   public void getObjectData(c4 info, s3 context) {
      if (info == null) {
         throw new ArgumentNullException("info");
      }

      info.n5("ParentTable", this.n5, com.aspose.slides.internal.v6g.k5.n5(Hashtable.class));
   }

   @Override
   public void onDeserialization(Object sender) {
   }

   @Override
   public void removeItem(Object key) {
      synchronized (this.n5.getSyncRoot()) {
         this.n5.removeItem(key);
      }
   }

   @Override
   Hashtable$KeyValuePairs[] n5() {
      return this.n5.n5();
   }

   @Override
   public int size() {
      return this.n5.size();
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
   public boolean isSynchronized() {
      return true;
   }

   @Override
   public Object get_Item(Object key) {
      return this.n5.get_Item(key);
   }

   @Override
   public void set_Item(Object key, Object value) {
      synchronized (this.n5.getSyncRoot()) {
         this.n5.set_Item(key, value);
      }
   }

   @Override
   public ICollection getKeys() {
      synchronized (this.n5.getSyncRoot()) {
         return this.n5.getKeys();
      }
   }

   @Override
   public Object getSyncRoot() {
      return this.n5.getSyncRoot();
   }

   @Override
   public ICollection getValues() {
      synchronized (this.n5.getSyncRoot()) {
         return this.n5.getValues();
      }
   }
}
