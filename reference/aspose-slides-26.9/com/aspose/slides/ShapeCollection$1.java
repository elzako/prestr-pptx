package com.aspose.slides;

class ShapeCollection$1 extends com.aspose.slides.ms.System.g7<PPImage> {
   // $VF: synthetic field
   final com.aspose.slides.internal.o9b.f2[] n5;
   // $VF: synthetic field
   final ShapeCollection l6;

   ShapeCollection$1(ShapeCollection var1, com.aspose.slides.internal.o9b.f2[] var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   public boolean n5(PPImage var1) {
      return var1.getWidth() == com.aspose.slides.internal.v6g.k5.u3(this.n5[0].l6(), 13)
         && var1.getHeight() == com.aspose.slides.internal.v6g.k5.u3(this.n5[0].k5(), 13);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean invoke(PPImage bridgeArg0) {
      return this.n5(bridgeArg0);
   }

}
