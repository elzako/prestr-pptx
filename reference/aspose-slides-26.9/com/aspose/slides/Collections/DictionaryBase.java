package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;

@j3
public abstract class DictionaryBase implements ICollection, IDictionary, IEnumerable {
   private Hashtable n5 = new Hashtable();

   protected DictionaryBase() {
   }

   @Override
   public void clear() {
      this.onClear();
      this.n5.clear();
      this.onClearComplete();
   }

   @Override
   public int size() {
      return this.n5.size();
   }

   protected IDictionary getDictionary() {
      return this;
   }

   protected Hashtable getInnerHashtable() {
      return this.n5;
   }

   @Override
   public void copyTo(u3 array, int index) {
      if (array == null) {
         throw new ArgumentNullException("array");
      }

      if (index < 0) {
         throw new ArgumentOutOfRangeException("index must be possitive");
      }

      if (array.u3() > 1) {
         throw new ArgumentException("array is multidimensional");
      }

      int var3 = array.a6();
      if (index > var3) {
         throw new ArgumentException("index is larger than array size");
      }

      if (index + this.size() > var3) {
         throw new ArgumentException("Copy will overlflow array");
      }

      this.n5(array, index);
   }

   private void n5(u3 var1, int var2) {
      for (Object recoveredElement$var4$1493 : this.n5) {
         DictionaryEntry var4 = (DictionaryEntry)recoveredElement$var4$1493;
         var1.k5(var4.Clone(), var2++);
      }
   }

   @Override
   public IDictionaryEnumerator iterator() {
      return this.n5.iterator();
   }

   protected void onClear() {
   }

   protected void onClearComplete() {
   }

   protected Object onGet(Object key, Object currentValue) {
      return currentValue;
   }

   protected void onInsert(Object key, Object value) {
   }

   protected void onInsertComplete(Object key, Object value) {
   }

   protected void onSet(Object key, Object oldValue, Object newValue) {
   }

   protected void onSetComplete(Object key, Object oldValue, Object newValue) {
   }

   protected void onRemove(Object key, Object value) {
   }

   protected void onRemoveComplete(Object key, Object value) {
   }

   protected void onValidate(Object key, Object value) {
   }

   @Override
   public boolean isFixedSize() {
      return false;
   }

   @Override
   public boolean isReadOnly() {
      return false;
   }

   @Override
   public Object get_Item(Object key) {
      Object var2 = this.n5.get_Item(key);
      this.onGet(key, var2);
      return var2;
   }

   @Override
   public void set_Item(Object key, Object value) {
      this.onValidate(key, value);
      Object var3 = this.n5.get_Item(key);
      this.onSet(key, var3, value);
      this.n5.set_Item(key, value);

      try {
         this.onSetComplete(key, var3, value);
      } catch (RuntimeException var5) {
         this.n5.set_Item(key, var3);
         throw var5;
      }
   }

   @Override
   public ICollection getKeys() {
      return this.n5.getKeys();
   }

   @Override
   public ICollection getValues() {
      return this.n5.getValues();
   }

   @Override
   public void addItem(Object key, Object value) {
      this.onValidate(key, value);
      this.onInsert(key, value);
      this.n5.addItem(key, value);

      try {
         this.onInsertComplete(key, value);
      } catch (RuntimeException var4) {
         this.n5.removeItem(key);
         throw var4;
      }
   }

   @Override
   public void removeItem(Object key) {
      if (this.n5.contains(key)) {
         Object var2 = this.n5.get_Item(key);
         this.onValidate(key, var2);
         this.onRemove(key, var2);
         this.n5.removeItem(key);

         try {
            this.onRemoveComplete(key, var2);
         } catch (RuntimeException var4) {
            this.n5.set_Item(key, var2);
            throw var4;
         }
      }
   }

   @Override
   public boolean contains(Object key) {
      return this.n5.contains(key);
   }

   @Override
   public boolean isSynchronized() {
      return this.n5.isSynchronized();
   }

   @Override
   public Object getSyncRoot() {
      return this.n5.getSyncRoot();
   }
}
