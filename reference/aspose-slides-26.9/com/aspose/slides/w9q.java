package com.aspose.slides;

class w9q {
   public static void n5(ILightRig var0, com.aspose.slides.internal.k4y.r5d var1) {
      if (var1 != null) {
         var0.setDirection(var1.k5());
         var0.setLightType(var1.l6());
         if (var1.u3() != null) {
            var0.setRotation(var1.u3().n5(), var1.u3().l6(), var1.u3().k5());
         }
      }
   }

   public static void l6(ILightRig var0, com.aspose.slides.internal.k4y.r5d var1) {
      if (var0.getLightType() != -1) {
         var1.l6(var0.getDirection() == -1 ? 1 : var0.getDirection());
         var1.n5(var0.getLightType() == -1 ? 26 : var0.getLightType());
         float[] var2 = var0.getRotation();
         if (var2 != null && (var2[0] != 0.0F || var2[1] != 0.0F || var2[2] != 0.0F)) {
            com.aspose.slides.internal.k4y.v2x var3 = var1.n5();
            var3.n5(var2[0]);
            var3.l6(var2[1]);
            var3.k5(var2[2]);
         }
      }
   }
}
