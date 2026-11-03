package com.aspose.slides;

public final class SlideHeaderFooterManager extends BaseSlideHeaderFooterManager implements ISlideHeaderFooterManager {
   private final Slide n5;

   SlideHeaderFooterManager(Slide slide) {
      super(slide);
      this.n5 = slide;
   }

   @Override
   void k5(byte var1) {
      n5(this.n5(), this.n5.w1(), var1);
   }
}
