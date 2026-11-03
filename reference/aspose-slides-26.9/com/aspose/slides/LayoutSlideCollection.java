package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

public class LayoutSlideCollection implements ILayoutSlideCollection, r0g {
   List<ILayoutSlide> n5;
   r0g l6;
   private IPresentationComponent k5;

   LayoutSlideCollection(r0g parentImmediate) {
      this.l6 = parentImmediate;
      this.n5 = new List<>();
   }

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final ILayoutSlide get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public final ILayoutSlide getByType(byte type) {
      int var2 = this.n5.size();

      for (int var3 = 0; var3 < var2; var3++) {
         if (this.get_Item(var3).getLayoutType() == type) {
            return this.get_Item(var3);
         }
      }

      return null;
   }

   final Presentation n5() {
      return (Presentation)this.k5().getPresentation();
   }

   void n5(ILayoutSlide var1) {
      this.n5.addItem(var1);
   }

   @Override
   public final void remove(ILayoutSlide value) {
      if (this.n5.containsItem(value)) {
         value.remove();
      }
   }

   @Override
   public final void removeUnused() {
      synchronized (this.n5.getSyncRoot()) {
         int var2 = 0;

         while (var2 < this.n5.size()) {
            ILayoutSlide var3 = this.n5.get_Item(var2);
            if (var3.hasDependingSlides()) {
               var2++;
            } else {
               var3.remove();
            }
         }
      }
   }

   @Override
   public final IGenericEnumerator<ILayoutSlide> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final IGenericEnumerator<ILayoutSlide> iteratorJava() {
      return this.n5.iteratorJava();
   }

   void l6() {
      this.n5.clear();
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
   public final r0g getParent_Immediate() {
      return this.l6;
   }

   final IPresentationComponent k5() {
      if (this.k5 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.k5};
         d0u.n5(IPresentationComponent.class, this.l6, var1);
         this.k5 = var1[0];
      }

      return this.k5;
   }
}
