package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

public class BehaviorCollection implements IBehaviorCollection {
   private final List<IBehavior> l6 = new List<>();
   Effect n5;

   BehaviorCollection() {
   }

   @Override
   public final int getCount() {
      return this.l6.size();
   }

   public final boolean isReadOnly() {
      return this.l6.isReadOnly();
   }

   @Override
   public final void add(IBehavior item) {
      ((Behavior)item).n5().n5(this.n5);
      this.l6.addItem(item);
   }

   @Override
   public final int indexOf(IBehavior item) {
      return this.l6.indexOf(item);
   }

   @Override
   public final void insert(int index, IBehavior item) {
      ((Behavior)item).n5().n5(this.n5);
      this.l6.insertItem(index, item);
   }

   public final void copyTo(IBehavior[] array, int arrayIndex) {
      this.l6.copyToTArray(array, arrayIndex);
   }

   @Override
   public final boolean remove(IBehavior item) {
      return this.l6.removeItem(item);
   }

   @Override
   public final void removeAt(int index) {
      this.l6.removeAt(index);
   }

   @Override
   public final void clear() {
      this.l6.clear();
   }

   @Override
   public final boolean contains(IBehavior item) {
      return this.l6.containsItem(item);
   }

   @Override
   public final IBehavior get_Item(int index) {
      return this.l6.get_Item(index);
   }

   @Override
   public final void set_Item(int index, IBehavior value) {
      this.l6.set_Item(index, value);
   }

   @Override
   public final IGenericEnumerator<IBehavior> iterator() {
      return this.l6.iterator();
   }

   public final IGenericEnumerator<IBehavior> iteratorJava() {
      return this.l6.iteratorJava();
   }
}
