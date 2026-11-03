package com.aspose.slides;

class m7 {
   public static void n5(ICamera var0, com.aspose.slides.internal.k4y.y3 var1) {
      if (var1 != null) {
         var0.setCameraType(var1.l6());
         var0.setZoom(var1.u3());
         var0.setFieldOfViewAngle(var1.k5());
         if (var1.a6() != null) {
            var0.setRotation(var1.a6().n5(), var1.a6().l6(), var1.a6().k5());
         }
      }
   }

   public static void l6(ICamera var0, com.aspose.slides.internal.k4y.y3 var1) {
      if (var0.getCameraType() != -1) {
         var1.n5(var0.getCameraType());
         if (!com.aspose.slides.ms.System.n1.k5(var0.getZoom())) {
            var1.l6(var0.getZoom());
         }

         if (!com.aspose.slides.ms.System.n1.k5(var0.getFieldOfViewAngle())) {
            var1.n5(var0.getFieldOfViewAngle());
         }

         float[] var2 = var0.getRotation();
         if (var2 != null) {
            com.aspose.slides.internal.k4y.v2x var3 = var1.n5();
            var3.n5(var2[0]);
            var3.l6(var2[1]);
            var3.k5(var2[2]);
         }
      }
   }
}
