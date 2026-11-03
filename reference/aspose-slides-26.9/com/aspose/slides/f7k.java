package com.aspose.slides;

class f7k {
   static void n5(IEffectFormat var0, a9x var1) {
      com.aspose.slides.internal.k0r.q5 var2 = var1.n3();
      com.aspose.slides.internal.k0r.r3 var3 = var2.a6();
      com.aspose.slides.internal.k0r.w8 var4 = var3 != null ? var3.l6() : new com.aspose.slides.internal.k0r.w8();
      com.aspose.slides.internal.k0r.u4 var5 = com.aspose.slides.internal.v6g.k5.n5(var4.n5(575), com.aspose.slides.internal.k0r.u4.class);
      if (var5 != null && var5.l6()) {
         w0.n5(var0.getBlurEffect(), var3, var1);
         y8s.n5(var0.getFillOverlayEffect(), var3, var1);
         u5h.n5(var0.getGlowEffect(), var3, var1);
         s2x.n5(var0.getInnerShadowEffect(), var3, var1);
         n9f.n5(var0.getReflectionEffect(), var3, var1);
         v5e.n5(var0.getSoftEdgeEffect(), var3, var1);
         if (var5.l6() && !var5.k5() && var0.isNoEffects()) {
            ((EffectFormat)var0).a6();
         } else if (v8w.n5(var3)) {
            v8w.n5(var0, var2);
         } else {
            o5m.n5(var0, var1);
         }
      }
   }

   static void n5(k1z var0) {
      if (!var0.a0()) {
         GeometryShape var1 = com.aspose.slides.internal.v6g.k5.n5(var0.s7(), GeometryShape.class);
         if (var1 != null) {
            y2q var2 = var0.u3().a6();
            IShapeStyle var3 = var1.getShapeStyle();
            if (var3 != null) {
               s8u var4 = (s8u)var2.l6().createThemeEffective();
               d0e var5 = null;
               if ((var3.getEffectStyleIndex() & 4294967295L) > 0L) {
                  var5 = var4.n5(var3.getEffectStyleIndex());
               }

               if (var5 != null) {
                  com.aspose.slides.internal.k0r.r3 var6 = var0.z3().a6();
                  com.aspose.slides.internal.k0r.w8 var7 = var6.l6();
                  com.aspose.slides.internal.k0r.u4 var8 = com.aspose.slides.internal.v6g.k5.n5(var7.n5(575), com.aspose.slides.internal.k0r.u4.class);
                  if (var8 == null) {
                     var8 = new com.aspose.slides.internal.k0r.u4();
                     var7.l6(var8);
                  }

                  if (var5.isNoEffects()) {
                     var8.n5(true);
                     var8.l6(false);
                     var8.k5(false);
                  } else {
                     var8.n5(true);
                     var8.l6(true);
                     var8.k5(true);
                     s2x.n5(var5.getInnerShadowEffect(), var0);
                     o5m.n5(var5.getOuterShadowEffect(), var0);
                     v8w.n5(var5.getPresetShadowEffect(), var0);
                  }

                  w0.n5(var5.getBlurEffect(), var0);
                  y8s.n5(var5.getFillOverlayEffect(), var0);
                  u5h.n5(var5.getGlowEffect(), var0);
                  n9f.n5(var5.getReflectionEffect(), var0);
                  v5e.n5(var5.getSoftEdgeEffect(), var0);
                  if (var7.l6(521) || var7.l6(524) || var7.l6(522) || var7.l6(523)) {
                     var7.l6(new com.aspose.slides.internal.k0r.z5(512, 2L));
                  }
               }
            }
         }
      }
   }

   static void l6(k1z var0) {
      if (var0.a0()) {
         IEffectFormat var1 = var0.c4();
         com.aspose.slides.internal.k0r.r3 var2 = var0.z3().a6();
         com.aspose.slides.internal.k0r.w8 var3 = var2.l6();
         com.aspose.slides.internal.k0r.u4 var4 = new com.aspose.slides.internal.k0r.u4();
         if (((EffectFormat)var1).u3() && var1.isNoEffects()) {
            var4.n5(true);
            var4.l6(false);
            var4.k5(false);
         } else {
            var4.n5(true);
            var4.l6(true);
            var4.k5(true);
            s2x.n5(var1.getInnerShadowEffect(), var0);
            o5m.n5(var1.getOuterShadowEffect(), var0);
            v8w.n5(var1.getPresetShadowEffect(), var0);
         }

         var3.l6(var4);
         w0.n5(var1.getBlurEffect(), var0);
         y8s.n5(var1.getFillOverlayEffect(), var0);
         u5h.n5(var1.getGlowEffect(), var0);
         n9f.n5(var1.getReflectionEffect(), var0);
         v5e.n5(var1.getSoftEdgeEffect(), var0);
         if (var3.l6(521) || var3.l6(524) || var3.l6(522) || var3.l6(523)) {
            var3.l6(new com.aspose.slides.internal.k0r.z5(512, 2L));
         }
      }
   }
}
