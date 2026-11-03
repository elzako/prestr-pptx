package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.k4y.g7$n5;

class w5i {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("effectLst", "effectDag");

   public static void n5(IEffectFormat var0, com.aspose.slides.internal.k4y.g7 var1, t5w var2) {
      n5(new w5i$1(var0), var1, var2);
   }

   public static void n5(w5i$n5 var0, com.aspose.slides.internal.k4y.g7 var1, t5w var2) {
      if (var1 != null) {
         IEffectFormat var3 = var0.n5();
         switch (n5.n5(var1.n5())) {
            case 0:
               com.aspose.slides.internal.k4y.o9b var4 = (com.aspose.slides.internal.k4y.o9b)var1.l6();
               if (var4.t2() != null) {
                  var3.setBlurEffect(var4.t2().n5(), var4.t2().l6());
               }

               if (var4.s7() != null) {
                  var3.enableFillOverlayEffect();
                  l9e.n5(var3.getFillOverlayEffect(), var4.s7(), var2);
               }

               if (var4.x8() != null) {
                  var3.enableGlowEffect();
                  h1k.n5(var3.getGlowEffect(), var4.x8());
               }

               if (var4.n3() != null) {
                  var3.enableInnerShadowEffect();
                  r6w.n5(var3.getInnerShadowEffect(), var4.n3());
               }

               if (var4.y4() != null) {
                  var3.enableOuterShadowEffect();
                  w0g.n5(var3.getOuterShadowEffect(), var4.y4());
               }

               if (var4.e2() != null) {
                  var3.enablePresetShadowEffect();
                  b5c.n5(var3.getPresetShadowEffect(), var4.e2());
               }

               if (var4.t9() != null) {
                  var3.enableReflectionEffect();
                  c9e.n5(var3.getReflectionEffect(), var4.t9());
               }

               if (var4.z1() != null) {
                  var3.enableSoftEdgeEffect();
                  e1t.n5(var3.getSoftEdgeEffect(), var4.z1());
               }

               if (var3.isNoEffects()) {
                  ((EffectFormat)var3).a6();
               }
            case 1:
               return;
            default:
               throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var1.n5(), "\""}));
         }
      }
   }

   public static void n5(IEffectFormat var0, g7$n5 var1, g6c var2) {
      if (var0 != null) {
         EffectFormat var3 = (EffectFormat)var0;
         if (var3.z3() && var3.isNoEffects()) {
            var3.a6();
         }

         if (var3.u3()) {
            com.aspose.slides.internal.k4y.o9b var4 = (com.aspose.slides.internal.k4y.o9b)var1.n5("effectLst").l6();
            n5(var0, var4, var2);
         }
      }
   }

   public static void n5(IEffectFormat var0, com.aspose.slides.internal.k4y.o9b var1, g6c var2) {
      if (var0 != null && ((EffectFormat)var0).u3()) {
         if (var0.getBlurEffect() != null) {
            com.aspose.slides.internal.k4y.f9 var3 = var1.n5();
            var3.n5(var0.getBlurEffect().getRadius());
            var3.n5(var0.getBlurEffect().getGrow());
         }

         l9e.n5(var0.getFillOverlayEffect(), new w5i$2(var1), var2);
         h1k.n5(var0.getGlowEffect(), new w5i$3(var1));
         r6w.n5(var0.getInnerShadowEffect(), new w5i$4(var1));
         w0g.n5(var0.getOuterShadowEffect(), new w5i$5(var1));
         b5c.n5(var0.getPresetShadowEffect(), new w5i$6(var1));
         c9e.n5(var0.getReflectionEffect(), new w5i$7(var1));
         if (var0.getSoftEdgeEffect() != null) {
            com.aspose.slides.internal.k4y.g9t var4 = var1.c8();
            var4.n5(var0.getSoftEdgeEffect().getRadius());
         }
      }
   }
}
