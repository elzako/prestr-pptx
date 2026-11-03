package com.aspose.slides;

class f2d extends a8m<IInnerShadow, f2d> {
   public static final f2d n5 = new f2d();

   protected boolean n5(IInnerShadow var1, IInnerShadow var2) {
      return com.aspose.slides.internal.n8e.v4.n5(var1.getBlurRadius(), var2.getBlurRadius())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getDirection(), var2.getDirection())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getDistance(), var2.getDistance())
         && s5r.n5.equals(var1.getShadowColor(), var2.getShadowColor());
   }

   protected int n5(IInnerShadow var1) {
      int var2 = -324743029 + com.aspose.slides.ms.System.d2.n5(var1.getBlurRadius());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.getDirection());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.d2.n5(var1.getDistance());
      return var2 * 486187739 + s5r.n5.l6(var1.getShadowColor());
   }
}
