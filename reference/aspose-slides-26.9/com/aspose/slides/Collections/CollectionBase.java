package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;

@j3
public abstract class CollectionBase implements ICollection, IEnumerable, IList {
   private ArrayList n5;

   @Override
   public int size() {
      return this.getInnerList().size();
   }

   @Override
   public IEnumerator iterator() {
      return this.getInnerList().iterator();
   }

   @Override
   public void clear() {
      this.onClear();
      this.getInnerList().clear();
      this.onClearComplete();
   }

   @Override
   public void removeAt(int index) {
      Object var2 = this.getInnerList().get_Item(index);
      this.onValidate(var2);
      this.onRemove(index, var2);
      this.getInnerList().removeAt(index);
      this.onRemoveComplete(index, var2);
   }

   protected CollectionBase() {
   }

   protected CollectionBase(int capacity) {
      this.n5 = new ArrayList(capacity);
   }

   public int getCapacity() {
      if (this.n5 == null) {
         this.n5 = new ArrayList();
      }

      return this.n5.getCapacity();
   }

   public void setCapacity(int value) {
      if (this.n5 == null) {
         this.n5 = new ArrayList();
      }

      this.n5.setCapacity(value);
   }

   protected ArrayList getInnerList() {
      if (this.n5 == null) {
         this.n5 = new ArrayList();
      }

      return this.n5;
   }

   protected IList getList() {
      return this;
   }

   protected void onClear() {
   }

   protected void onClearComplete() {
   }

   protected void onInsert(int index, Object value) {
   }

   protected void onInsertComplete(int index, Object value) {
   }

   protected void onRemove(int index, Object value) {
   }

   protected void onRemoveComplete(int index, Object value) {
   }

   protected void onSet(int index, Object oldValue, Object newValue) {
   }

   protected void onSetComplete(int index, Object oldValue, Object newValue) {
   }

   protected void onValidate(Object value) {
      if (null == value) {
         throw new ArgumentNullException("CollectionBase.OnValidate: Invalid parameter value passed to method: null");
      }
   }

   @Override
   public void copyTo(u3 array, int index) {
      this.getInnerList().copyTo(array, index);
   }

   @Override
   public Object getSyncRoot() {
      return this.getInnerList().getSyncRoot();
   }

   @Override
   public boolean isSynchronized() {
      return this.getInnerList().isSynchronized();
   }

   @Override
   public int addItem(Object value) {
      this.onValidate(value);
      int var2 = this.getInnerList().size();
      this.onInsert(var2, value);
      this.getInnerList().addItem(value);

      try {
         this.onInsertComplete(var2, value);
         return var2;
      } catch (RuntimeException var4) {
         this.getInnerList().removeAt(var2);
         throw var4;
      }
   }

   @Override
   public boolean contains(Object value) {
      return this.getInnerList().contains(value);
   }

   @Override
   public int indexOf(Object value) {
      return this.getInnerList().indexOf(value);
   }

   @Override
   public void insertItem(int index, Object value) {
      this.onValidate(value);
      this.onInsert(index, value);
      this.getInnerList().insertItem(index, value);

      try {
         this.onInsertComplete(index, value);
      } catch (RuntimeException var4) {
         this.getInnerList().removeAt(index);
         throw var4;
      }
   }

   @Override
   public void removeItem(Object value) {
      this.onValidate(value);
      int var2 = this.getInnerList().indexOf(value);
      if (var2 == -1) {
         throw new ArgumentException("The element cannot be found.", "value");
      }

      this.onRemove(var2, value);
      this.getInnerList().removeItem(value);
      this.onRemoveComplete(var2, value);
   }

   @Override
   public boolean isFixedSize() {
      return this.getInnerList().isFixedSize();
   }

   @Override
   public boolean isReadOnly() {
      return this.getInnerList().isReadOnly();
   }

   @Override
   public Object get_Item(int index) {
      return this.getInnerList().get_Item(index);
   }

   @Override
   public void set_Item(int index, Object value) {
      if (index >= 0 && index < this.getInnerList().size()) {
         this.onValidate(value);
         Object var3 = this.getInnerList().get_Item(index);
         this.onSet(index, var3, value);
         this.getInnerList().set_Item(index, value);

         try {
            this.onSetComplete(index, var3, value);
         } catch (RuntimeException var5) {
            this.getInnerList().set_Item(index, var3);
            throw var5;
         }
      } else {
         throw new ArgumentOutOfRangeException("index");
      }
   }
}
