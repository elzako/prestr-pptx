package com.aspose.slides;

class w9 {
   public static void n5(IBackdrop3DScene var0, com.aspose.slides.internal.k4y.i5 var1) {
      if (var1 != null) {
         var0.setAnchorPoint(new float[]{(float)var1.n5().n5(), (float)var1.n5().l6(), (float)var1.n5().k5()});
         var0.setNormalVector(new float[]{(float)var1.l6().n5(), (float)var1.l6().l6(), (float)var1.l6().k5()});
         var0.setUpVector(new float[]{(float)var1.k5().n5(), (float)var1.k5().l6(), (float)var1.k5().k5()});
      }
   }

   public static void n5(IBackdrop3DScene var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.i5> var1) {
      float[] var2 = var0.getAnchorPoint();
      float[] var3 = var0.getNormalVector();
      float[] var4 = var0.getUpVector();
      if (var3[0] != 0.0F || var3[1] != 0.0F || var3[2] != 0.0F || var4[0] != 0.0F || var4[1] != 0.0F || var4[2] != 0.0F) {
         com.aspose.slides.internal.k4y.i5 var5 = (com.aspose.slides.internal.k4y.i5)var1.invoke();
         var5.n5().n5(var2[0]);
         var5.n5().l6(var2[1]);
         var5.n5().k5(var2[2]);
         var5.l6().n5(var3[0]);
         var5.l6().l6(var3[1]);
         var5.l6().k5(var3[2]);
         var5.k5().n5(var4[0]);
         var5.k5().l6(var4[1]);
         var5.k5().k5(var4[2]);
      }
   }
}
