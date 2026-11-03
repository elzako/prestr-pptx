package com.aspose.slides;

public class SectionZoomFrame extends ZoomObject implements ISectionZoomFrame {
   private ISection n5;
   private com.aspose.slides.ms.System.o0 l6 = new com.aspose.slides.ms.System.o0();

   final com.aspose.slides.ms.System.o0 n5() {
      return this.l6.k5();
   }

   final void n5(com.aspose.slides.ms.System.o0 var1) {
      this.l6 = var1.k5();
   }

   @Override
   public final ISection getTargetSection() {
      return this.n5;
   }

   @Override
   public final void setTargetSection(ISection value) {
      if (value.getStartedFromSlide() != null) {
         this.n5 = value;
         this.n5(((Section)this.n5).n5().k5());
         this.setTargetSlide(this.n5.getStartedFromSlide());
      }
   }

   final void n5(ISection var1) {
      this.n5 = var1;
      this.n5(((Section)var1).n5().k5());
   }

   SectionZoomFrame(r0g parentImmediate) {
      super(parentImmediate);
   }
}
