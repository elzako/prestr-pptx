package com.aspose.slides;

class o2i extends a8m<IGradientFormat, o2i> {
   public static final o2i n5 = new o2i();

   protected boolean n5(IGradientFormat var1, IGradientFormat var2) {
      return var1.getTileFlip() == var2.getTileFlip()
         && var1.getGradientDirection() == var2.getGradientDirection()
         && com.aspose.slides.internal.n8e.v4.n5(var1.getLinearGradientAngle(), var2.getLinearGradientAngle())
         && var1.getLinearGradientScaled() == var2.getLinearGradientScaled()
         && var1.getGradientShape() == var2.getGradientShape()
         && z3k.n5.equals(var1.getGradientStops(), var2.getGradientStops());
   }

   protected int n5(IGradientFormat var1) {
      int var2 = -324743029 + com.aspose.slides.ms.System.s3.n5(var1.getTileFlip());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.s3.n5(var1.getGradientDirection());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.getLinearGradientAngle());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.s3.n5(var1.getLinearGradientScaled());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.s3.n5(var1.getGradientShape());
      return var2 * 486187739 + z3k.n5.l6(var1.getGradientStops());
   }
}
