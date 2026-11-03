package com.aspose.slides;

class r6w {
   public static void n5(IInnerShadow var0, com.aspose.slides.internal.k4y.s5g var1) {
      if (var1 != null) {
         var0.setBlurRadius(var1.n5());
         var0.setDirection(var1.k5());
         var0.setDistance(var1.l6());
         c4i.n5(var0.getShadowColor(), var1.u3());
      }
   }

   public static void n5(IInnerShadow var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.s5g> var1) {
      if (var0 != null) {
         com.aspose.slides.internal.k4y.s5g var2 = (com.aspose.slides.internal.k4y.s5g)var1.invoke();
         var2.n5(var0.getBlurRadius());
         var2.n5(var0.getDirection());
         var2.l6(var0.getDistance());
         c4i.n5(var0.getShadowColor(), new r6w$1(var2));
      }
   }
}
