package com.aspose.slides;

final class ForEach$3 implements ForEach$ForEachMasterSlideCallback {
   // $VF: synthetic field
   final ForEach$ForEachShapeCallback n5;

   ForEach$3(ForEach$ForEachShapeCallback var1) {
      this.n5 = var1;
   }

   @Override
   public void invoke(MasterSlide masterSlide, int index) {
      ForEach.shape(masterSlide, this.n5);
   }
}
