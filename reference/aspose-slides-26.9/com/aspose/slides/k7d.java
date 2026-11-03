package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class k7d {
   public static void n5(IEffectFormatEffectiveData var0, com.aspose.slides.internal.k4y.p3w var1, OdpSerializationContext var2) {
      if (var0 == null) {
         throw new ArgumentNullException("effectParamSources");
      }

      if (var1 == null) {
         throw new ArgumentNullException("graphicProperties");
      }

      if (!var0.isNoEffects()) {
         if (var0.getOuterShadowEffect() != null) {
            var1.a6(1);
            IOuterShadowEffectiveData var3 = var0.getOuterShadowEffect();
            var1.n3(t2f.n5(((k0p)var3).l6().o8()));
            if ((((k0p)var3).l6().s7() & 255) < 255) {
               var1.y4(t2f.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3((((k0p)var3).l6().s7() & 255) * 100 / 255.0F), 14)));
            }

            if (var3.getDirection() == 0.0F || var3.getDirection() == 360.0F) {
               var1.s7(t2f.n5(var3.getDistance()));
            } else if (var3.getDirection() > 44.0F && var3.getDirection() < 90.0F) {
               var1.s7(t2f.n5(var3.getDistance()));
               var1.x8(t2f.n5(var3.getDistance()));
            } else if (var3.getDirection() == 90.0F) {
               var1.s7("0cm");
               var1.x8(t2f.n5(var3.getDistance()));
            } else if (var3.getDirection() > 90.0F && var3.getDirection() < 180.0F) {
               var1.s7(t2f.n5(var3.getDistance() * -1.0));
               var1.x8(t2f.n5(var3.getDistance()));
            } else if (var3.getDirection() == 180.0F) {
               var1.s7(t2f.n5(var3.getDistance() * -1.0));
            } else if (var3.getDirection() > 180.0F && var3.getDirection() < 270.0F) {
               var1.s7(t2f.n5(var3.getDistance() * -1.0));
               var1.x8(t2f.n5(var3.getDistance() * -1.0));
            } else if (var3.getDirection() == 270.0F) {
               var1.s7("0cm");
               var1.x8(t2f.n5(var3.getDistance() * -1.0));
            } else if (var3.getDirection() > 270.0F && var3.getDirection() < 360.0F) {
               var1.s7(t2f.n5(var3.getDistance()));
               var1.x8(t2f.n5(var3.getDistance() * -1.0));
            }
         }
      }
   }
}
