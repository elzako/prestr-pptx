package com.aspose.slides;

class w0g {
   public static void n5(IOuterShadow var0, com.aspose.slides.internal.k4y.o3i var1) {
      if (var1 != null) {
         var0.setBlurRadius(var1.n5());
         var0.setDirection(var1.k5());
         var0.setDistance(var1.l6());
         c4i.n5(var0.getShadowColor(), var1.s7());
         var0.setRectangleAlign(var1.c8());
         var0.setSkewHorizontal(var1.u9());
         var0.setSkewVertical(var1.h0());
         var0.setRotateShadowWithShape(var1.t2());
         var0.setScaleHorizontal(var1.u3());
         var0.setScaleVertical(var1.a6());
      }
   }

   public static void n5(IOuterShadow var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.o3i> var1) {
      if (var0 != null) {
         com.aspose.slides.internal.k4y.o3i var2 = (com.aspose.slides.internal.k4y.o3i)var1.invoke();
         var2.n5(var0.getBlurRadius());
         var2.n5(var0.getDirection());
         var2.l6(var0.getDistance());
         c4i.n5(var0.getShadowColor(), new w0g$1(var2));
         var2.n5(var0.getRectangleAlign());
         var2.u3((float)var0.getSkewHorizontal());
         var2.a6((float)var0.getSkewVertical());
         var2.n5(var0.getRotateShadowWithShape());
         var2.l6((float)var0.getScaleHorizontal());
         var2.k5((float)var0.getScaleVertical());
      }
   }
}
