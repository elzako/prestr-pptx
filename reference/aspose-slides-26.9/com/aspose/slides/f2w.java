package com.aspose.slides;

class f2w extends a8m<IOuterShadow, f2w> {
   public static final f2w n5 = new f2w();

   protected boolean n5(IOuterShadow var1, IOuterShadow var2) {
      return com.aspose.slides.internal.n8e.v4.n5(var1.getBlurRadius(), var2.getBlurRadius())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getDirection(), var2.getDirection())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getDistance(), var2.getDistance())
         && var1.getRectangleAlign() == var2.getRectangleAlign()
         && com.aspose.slides.internal.n8e.v4.n5(var1.getSkewHorizontal(), var2.getSkewHorizontal())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getSkewVertical(), var2.getSkewVertical())
         && var1.getRotateShadowWithShape() == var2.getRotateShadowWithShape()
         && com.aspose.slides.internal.n8e.v4.n5(var1.getScaleHorizontal(), var2.getScaleHorizontal())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getScaleVertical(), var2.getScaleVertical())
         && s5r.n5.equals(var1.getShadowColor(), var2.getShadowColor());
   }

   protected int n5(IOuterShadow var1) {
      int var2 = -324743029 + com.aspose.slides.ms.System.d2.n5(var1.getBlurRadius());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.getDirection());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.d2.n5(var1.getDistance());
      var2 = var2 * 486187739 + s5r.n5.l6(var1.getShadowColor());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.s3.n5(var1.getRectangleAlign());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.d2.n5(var1.getSkewHorizontal());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.d2.n5(var1.getSkewVertical());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.n3.n5(var1.getRotateShadowWithShape());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.d2.n5(var1.getScaleHorizontal());
      return var2 * 486187739 + com.aspose.slides.ms.System.d2.n5(var1.getScaleVertical());
   }
}
