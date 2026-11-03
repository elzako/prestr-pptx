package com.aspose.slides;

final class ForEach$2 implements ForEach$ForEachLayoutSlideCallback {
   // $VF: synthetic field
   final ForEach$ForEachShapeCallback n5;

   ForEach$2(ForEach$ForEachShapeCallback var1) {
      this.n5 = var1;
   }

   @Override
   public void invoke(LayoutSlide layoutSlide, int index) {
      ForEach.shape(layoutSlide, this.n5);
   }
}
