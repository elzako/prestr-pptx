package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class a3s {
   public static void n5(IEffectFormat var0, com.aspose.slides.internal.k4y.p3w var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("effectFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("graphicProperties");
      }

      switch (var1.t9()) {
         case 1:
            var0.enableOuterShadowEffect();
            IOuterShadow var3 = var0.getOuterShadowEffect();
            if (t2f.k5(var1.q0())) {
               ((ColorFormat)var3.getShadowColor()).n5(t2f.x8(var1.q0()).o8());
               if (t2f.k5(var1.z3())) {
                  int var4 = t2f.u3(var1.z3());
                  if (var4 < 100 && var4 >= 0) {
                     var3.getShadowColor().getColorTransform().add(5, var4 / 100.0F);
                  }
               }
            }

            var3.setDistance(3.0);
            var3.setDirection(45.0F);
            var3.setRectangleAlign((byte)0);
            if (t2f.k5(var1.z1()) || t2f.k5(var1.t4())) {
               double var5 = t2f.n5(var1.z1(), 0.0);
               double var7 = t2f.n5(var1.t4(), 0.0);
               if (var5 == 0.0 && var7 == 0.0) {
                  var3.setDistance(0.0);
                  var3.setDirection(0.0F);
               } else if (var5 != 0.0) {
                  var3.setDistance(com.aspose.slides.ms.System.q1.n5(var5));
                  if (var7 > 0.0) {
                     var3.setDirection(var5 < 0.0 ? 135.0F : 45.0F);
                  } else if (var7 == 0.0) {
                     var3.setDirection(var5 < 0.0 ? 180.0F : 0.0F);
                  } else {
                     var3.setDirection(var5 < 0.0 ? 225.0F : 315.0F);
                  }
               } else if (var7 != 0.0) {
                  var3.setDistance(com.aspose.slides.ms.System.q1.n5(var7));
                  if (var7 > 0.0) {
                     var3.setDirection(90.0F);
                  } else {
                     var3.setDirection(270.0F);
                  }
               }
            }
            break;
         case 2:
            var0.disableOuterShadowEffect();
      }
   }
}
