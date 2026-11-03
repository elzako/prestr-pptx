package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

public class BehaviorPropertyCollection implements IBehaviorPropertyCollection {
   private final List<IBehaviorProperty> n5 = new List<>();

   BehaviorPropertyCollection() {
   }

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final boolean isReadOnly() {
      return this.n5.isReadOnly();
   }

   public final void add(IBehaviorProperty item) {
      this.n5.addItem(item);
   }

   @Override
   public final void add(String propertyValue) {
      this.add(BehaviorProperty.getOrCreateByValue(propertyValue));
   }

   public final int indexOf(IBehaviorProperty item) {
      return this.n5.indexOf(item);
   }

   @Override
   public final int indexOf(String propertyValue) {
      return this.indexOf(BehaviorProperty.getOrCreateByValue(propertyValue));
   }

   public final void insert(int index, IBehaviorProperty item) {
      this.n5.insertItem(index, item);
   }

   @Override
   public final void insert(int index, String propertyValue) {
      this.insert(index, BehaviorProperty.getOrCreateByValue(propertyValue));
   }

   public final void copyTo(IBehaviorProperty[] array, int arrayIndex) {
      this.n5.copyToTArray(array, arrayIndex);
   }

   public final boolean remove(IBehaviorProperty item) {
      return this.n5.removeItem(item);
   }

   @Override
   public final boolean remove(String propertyValue) {
      return this.remove(BehaviorProperty.getOrCreateByValue(propertyValue));
   }

   @Override
   public final void removeAt(int index) {
      this.n5.removeAt(index);
   }

   @Override
   public final void clear() {
      this.n5.clear();
   }

   public final boolean contains(IBehaviorProperty item) {
      return this.n5.containsItem(item);
   }

   @Override
   public final boolean contains(String propertyValue) {
      return this.contains(BehaviorProperty.getOrCreateByValue(propertyValue));
   }

   public final IBehaviorProperty get_Item(int index) {
      return this.n5.get_Item(index);
   }

   public final void set_Item(int index, IBehaviorProperty value) {
      this.n5.set_Item(index, value);
   }

   @Override
   public final IGenericEnumerator<IBehaviorProperty> iterator() {
      return this.n5.iterator();
   }

   public int indexOfItem(IBehaviorProperty item) {
      return this.n5.indexOfItem(item);
   }

   public void insertItem(int index, IBehaviorProperty item) {
      this.n5.insertItem(index, item);
   }

   public void addItem(IBehaviorProperty item) {
      this.n5.addItem(item);
   }

   public boolean containsItem(IBehaviorProperty item) {
      return this.n5.containsItem(item);
   }

   public void copyToTArray(IBehaviorProperty[] array, int arrayIndex) {
      this.n5.copyToTArray(array, arrayIndex);
   }

   public boolean removeItem(IBehaviorProperty item) {
      return this.n5.removeItem(item);
   }

   public final IGenericEnumerator<IBehaviorProperty> iteratorJava() {
      return this.n5.iteratorJava();
   }
}
