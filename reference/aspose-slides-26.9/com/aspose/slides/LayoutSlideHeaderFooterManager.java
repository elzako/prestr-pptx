package com.aspose.slides;

public final class LayoutSlideHeaderFooterManager extends BaseSlideHeaderFooterManager implements ILayoutSlideHeaderFooterManager {
   private final LayoutSlide n5;

   @Override
   public final void setFooterAndChildFootersVisibility(boolean isVisible) {
      this.l6((byte)6, isVisible);
   }

   @Override
   public final void setSlideNumberAndChildSlideNumbersVisibility(boolean isVisible) {
      this.l6((byte)5, isVisible);
   }

   @Override
   public final void setDateTimeAndChildDateTimesVisibility(boolean isVisible) {
      this.l6((byte)4, isVisible);
   }

   @Override
   public final void setFooterAndChildFootersText(String text) {
      this.l6((byte)6, text, false);
   }

   @Override
   public final void setDateTimeAndChildDateTimesText(String text) {
      this.l6((byte)4, text, true);
   }

   @Override
   void k5(byte var1) {
      n5(this.n5(), (MasterSlide)this.n5.getMasterSlide(), var1);
   }

   final void l6(byte var1, boolean var2) {
      this.n5(var1, var2);

      for (ISlide var6 : this.n5.getDependingSlides()) {
         ((SlideHeaderFooterManager)var6.getHeaderFooterManager()).n5(var1, var2);
      }
   }

   final void l6(byte var1, String var2, boolean var3) {
      this.n5(var1, var2, var3);

      for (ISlide var7 : this.n5.getDependingSlides()) {
         ((SlideHeaderFooterManager)var7.getHeaderFooterManager()).n5(var1, var2, var3);
      }
   }

   LayoutSlideHeaderFooterManager(LayoutSlide layoutSlide) {
      super(layoutSlide);
      this.n5 = layoutSlide;
   }
}
