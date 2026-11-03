package com.aspose.slides;

class k4f extends a8m<IReflection, k4f> {
   public static final k4f n5 = new k4f();

   protected boolean n5(IReflection var1, IReflection var2) {
      return com.aspose.slides.internal.n8e.v4.n5(var1.getStartPosAlpha(), var2.getStartPosAlpha())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getEndPosAlpha(), var2.getEndPosAlpha())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getFadeDirection(), var2.getFadeDirection())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getStartReflectionOpacity(), var2.getStartReflectionOpacity())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getEndReflectionOpacity(), var2.getEndReflectionOpacity())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getBlurRadius(), var2.getBlurRadius())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getDirection(), var2.getDirection())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getDistance(), var2.getDistance())
         && var1.getRectangleAlign() == var2.getRectangleAlign()
         && com.aspose.slides.internal.n8e.v4.n5(var1.getSkewHorizontal(), var2.getSkewHorizontal())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getSkewVertical(), var2.getSkewVertical())
         && com.aspose.slides.internal.n8e.v4.n5(Boolean.valueOf(var1.getRotateShadowWithShape()), var2.getRotateShadowWithShape())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getScaleHorizontal(), var2.getScaleHorizontal())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getScaleVertical(), var2.getScaleVertical());
   }

   protected int n5(IReflection var1) {
      int var2 = -324743029 + com.aspose.slides.ms.System.n1.n5(var1.getStartPosAlpha());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.getEndPosAlpha());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.getFadeDirection());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.getStartReflectionOpacity());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.getEndReflectionOpacity());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.d2.n5(var1.getBlurRadius());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.getDirection());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.d2.n5(var1.getDistance());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.s3.n5(var1.getRectangleAlign());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.d2.n5(var1.getSkewHorizontal());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.d2.n5(var1.getSkewVertical());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.n3.n5(var1.getRotateShadowWithShape());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.d2.n5(var1.getScaleHorizontal());
      return var2 * 486187739 + com.aspose.slides.ms.System.d2.n5(var1.getScaleVertical());
   }
}
