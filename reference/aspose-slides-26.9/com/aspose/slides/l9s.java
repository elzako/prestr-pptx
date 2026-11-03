package com.aspose.slides;

import com.aspose.slides.internal.k4y.g7$n5;

class l9s {
   public static void n5(IRotationEffect var0, com.aspose.slides.internal.k4y.c3t var1) {
      var0.setFrom(var1.l6());
      var0.setTo(var1.k5());
      var0.setBy(var1.n5());
   }

   public static void n5(IRotationEffect var0, g7$n5 var1, com.aspose.slides.internal.k4y.u2q[] var2) {
      com.aspose.slides.internal.k4y.c3t var3 = (com.aspose.slides.internal.k4y.c3t)var1.n5("animRot").l6();
      var2[0] = var3.u3();
      var3.l6(var0.getFrom());
      var3.k5(var0.getTo());
      var3.n5(var0.getBy());
   }
}
