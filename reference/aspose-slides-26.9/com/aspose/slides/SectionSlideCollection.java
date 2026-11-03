package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

public final class SectionSlideCollection extends DomObject<Section> implements ISectionSlideCollection {
   private final List<ISlide> n5 = new List<>();

   SectionSlideCollection(Section parentImmediate) {
      super(parentImmediate);
   }

   @Override
   public final ISlide get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public final int size() {
      return this.n5.size();
   }

   final boolean n5(ISlide var1) {
      return this.n5.containsItem(var1);
   }

   final void l6(ISlide var1) {
      this.n5.addItem(var1);
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.n5.copyTo(array, index);
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }

   @Override
   public final IGenericEnumerator<ISlide> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final IGenericEnumerator<ISlide> iteratorJava() {
      return this.n5.iteratorJava();
   }
}
