package com.aspose.slides;

class c9e {
   public static void n5(IReflection var0, com.aspose.slides.internal.k4y.d2a var1) {
      if (var1 != null) {
         var0.setBlurRadius(var1.n5());
         var0.setDirection(var1.h0());
         var0.setDistance(var1.u9());
         var0.setRectangleAlign(var1.y4());
         var0.setStartReflectionOpacity(var1.l6());
         var0.setEndReflectionOpacity(var1.u3());
         var0.setStartPosAlpha(var1.k5());
         var0.setEndPosAlpha(var1.a6());
         var0.setFadeDirection(var1.c8());
         var0.setSkewHorizontal(var1.x8());
         var0.setSkewVertical(var1.n3());
         var0.setRotateShadowWithShape(var1.e2());
         var0.setScaleHorizontal(var1.t2());
         var0.setScaleVertical(var1.s7());
      }
   }

   public static void n5(IReflection var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.d2a> var1) {
      if (var0 != null) {
         com.aspose.slides.internal.k4y.d2a var2 = (com.aspose.slides.internal.k4y.d2a)var1.invoke();
         var2.n5(var0.getBlurRadius());
         var2.a6(var0.getDirection());
         var2.l6(var0.getDistance());
         var2.n5(var0.getRectangleAlign());
         var2.n5(var0.getStartReflectionOpacity());
         var2.k5(var0.getEndReflectionOpacity());
         var2.l6(var0.getStartPosAlpha());
         var2.u3(var0.getEndPosAlpha());
         var2.u9(var0.getFadeDirection());
         var2.t2((float)var0.getSkewHorizontal());
         var2.s7((float)var0.getSkewVertical());
         var2.n5(var0.getRotateShadowWithShape());
         var2.h0((float)var0.getScaleHorizontal());
         var2.c8((float)var0.getScaleVertical());
      }
   }
}
