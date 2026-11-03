package com.aspose.slides;

public final class MasterLayoutSlideCollection extends LayoutSlideCollection implements IMasterLayoutSlideCollection {
   MasterLayoutSlideCollection(MasterSlide parentImmediate) {
      super(parentImmediate);
   }

   @Override
   public final ILayoutSlide addClone(ILayoutSlide sourceLayout) {
      return this.n5().getLayoutSlides().addClone(sourceLayout, (IMasterSlide)this.l6);
   }

   @Override
   public final ILayoutSlide insertClone(int index, ILayoutSlide sourceLayout) {
      ILayoutSlide var3 = this.addClone(sourceLayout);
      this.reorder(index, var3);
      return var3;
   }

   @Override
   public final ILayoutSlide add(byte layoutType, String layoutName) {
      return this.n5().getLayoutSlides().add((IMasterSlide)this.l6, layoutType, layoutName);
   }

   @Override
   public final ILayoutSlide insert(int index, byte layoutType, String layoutName) {
      ILayoutSlide var4 = this.add(layoutType, layoutName);
      this.reorder(index, var4);
      return var4;
   }

   @Override
   public final void removeAt(int index) {
      this.n5.get_Item(index).remove();
   }

   @Override
   public final void reorder(int index, ILayoutSlide layoutSlide) {
      if (index >= 0 && index < this.size()) {
         if (layoutSlide.getPresentation() != this.n5()) {
            throw new PptxEditException("Trying to move layout from other presentation.");
         }

         if (layoutSlide.getMasterSlide() != (IMasterSlide)this.l6) {
            throw new PptxEditException("Trying to move layout from other collection.");
         }

         int var3 = this.n5.indexOf(layoutSlide);
         if (index != var3) {
            synchronized (this.n5.getSyncRoot()) {
               if (index < var3) {
                  for (int var5 = var3; var5 > index; var5--) {
                     this.n5.set_Item(var5, this.n5.get_Item(var5 - 1));
                  }
               } else {
                  for (int var8 = var3; var8 < index; var8++) {
                     this.n5.set_Item(var8, this.n5.get_Item(var8 + 1));
                  }
               }

               this.n5.set_Item(index, layoutSlide);
            }
         }
      } else {
         throw new PptxEditException("Index must lay within [0..Count-1] range.");
      }
   }

   @Override
   void n5(ILayoutSlide var1) {
      super.n5(var1);
   }
}
