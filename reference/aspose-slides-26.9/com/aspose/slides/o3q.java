package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

class o3q implements IMathElementCollection {
   private final List<IMathElement> n5;

   public o3q() {
      this.n5 = new List<>();
   }

   public o3q(int var1) {
      this.n5 = new List<>(var1);
   }

   public o3q(IGenericEnumerable<IMathElement> var1) {
      this.n5 = new List<>(var1);
   }

   @Override
   public final IMathElement get_Item(int index) {
      return this.n5.get_Item(index);
   }

   public final void n5(int var1, IMathElement var2) {
      this.n5.set_Item(var1, var2);
   }

   @Override
   public final int getCount() {
      return this.n5.size();
   }

   @Override
   public final void add(IMathElement item) {
      this.n5.addItem(item);
   }

   @Override
   public final int indexOf(IMathElement item) {
      return this.n5.indexOf(item);
   }

   @Override
   public final void insert(int index, IMathElement item) {
      this.n5.insertItem(index, item);
   }

   @Override
   public final void clear() {
      this.n5.clear();
   }

   @Override
   public final boolean contains(IMathElement item) {
      return this.n5.containsItem(item);
   }

   @Override
   public final boolean remove(IMathElement item) {
      return this.n5.removeItem(item);
   }

   @Override
   public final void removeAt(int index) {
      this.n5.removeAt(index);
   }

   @Override
   public final void copyTo(IMathElement[] array, int arrayIndex) {
      this.n5.copyToTArray(array, arrayIndex);
   }

   @Override
   public final IGenericEnumerator<IMathElement> iterator() {
      return this.n5.iterator();
   }

   public final IGenericEnumerator<IMathElement> n5() {
      return this.n5.iteratorJava();
   }
}
