package com.aspose.slides;

class t5g {
   public static void n5(IChartDataPoint var0, com.aspose.slides.internal.k4y.v0v var1, t5w var2) {
      if (var1 != null) {
         if (var1.t2() != null) {
            var0.setBubble3D(var1.t2().n5());
         }

         if (var1.s7() != null) {
            var0.setExplosion((int)var1.s7().n5());
         }

         k5r.n5(var0.getFormat(), var1.x8(), var2);
         v9t.n5(var0.getMarker(), var1.c8(), var2);
         l6(var0, var1, var2);
      }
   }

   private static void l6(IChartDataPoint var0, com.aspose.slides.internal.k4y.v0v var1, t5w var2) {
      m5l var3 = ((ChartDataPoint)var0).k5();
      if (var1.h0() != null) {
         var0.setInvertIfNegative(var1.h0().n5());
      } else {
         var0.setInvertIfNegative(!p2i.n5(var2));
      }

      var3.n5(var1.n3());
      var3.n5(var1.y4());
   }

   public static void n5(IChartDataPoint var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.v0v> var1, long var2, long var4, g6c var6) {
      ChartDataPoint var7 = (ChartDataPoint)var0;
      if (var1 != null && n5(var7)) {
         com.aspose.slides.internal.k4y.v0v var8 = (com.aspose.slides.internal.k4y.v0v)var1.invoke();
         var8.u9().n5(var2);
         if (var0.isBubble3D()) {
            var8.k5();
         }

         if (var0.getExplosion() != -1) {
            var8.u3().n5(var0.getExplosion() & 4294967295L);
         }

         if (var7.h0()) {
            n5(var7, new t5g$1(var8), var6);
         } else {
            k5r.n5(var0.getFormat(), new t5g$2(var8), var6, null, false);
         }

         v9t.n5(var0.getMarker(), new t5g$3(var8), var6);
         n5(var0, var8);
      }
   }

   private static void n5(ChartDataPoint var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.b9y> var1, g6c var2) {
      IFormat var3 = var0.u9();
      IFormat var4 = var0.getFormat();
      IFillFormat var5 = var4.getFill().getFillType() == -1 ? var3.getFill() : var4.getFill();
      ILineFormat var6 = var4.getLine().isFormatNotDefined() ? var3.getLine() : var4.getLine();
      IEffectFormat var7 = var4.getEffect().isNoEffects() ? var3.getEffect() : var4.getEffect();
      IThreeDFormat var8 = r6k.n5(var4.getEffect3D(), true) ? var4.getEffect3D() : var3.getEffect3D();
      com.aspose.slides.internal.k4y.b9y var9 = (com.aspose.slides.internal.k4y.b9y)var1.invoke();
      x9f.n5(var5, new t5g$4(var9), var2);
      i3z.n5(var6, new t5g$5(var9));
      w5i.n5(var7, new t5g$6(var9), var2);
      r6k.n5(var8, new t5g$7(var9), new t5g$8(var9), null);
      z4p var10 = ((Format)var0.getFormat()).u3();
      var9.n5(var10.n5());
   }

   private static void n5(IChartDataPoint var0, com.aspose.slides.internal.k4y.v0v var1) {
      m5l var2 = ((ChartDataPoint)var0).k5();
      var1.n5();
      var1.h0().n5(var0.getInvertIfNegative());
      var1.n5(var2.n5());
      var1.n5(var2.l6());
   }

   private static boolean n5(ChartDataPoint var0) {
      m5l var1 = var0.k5();
      ChartSeries var2 = var0.u3().l6();
      return var0.isBubble3D()
         || var0.getExplosion() != -1
         || var0.n5() != null && k5r.n5(var0.getFormat(), null)
         || var0.h0()
         || var0.l6() != null && v9t.n5(var0.getMarker())
         || var0.getInvertIfNegative() != var2.getInvertIfNegative()
         || var1.n5() != null
         || var1.l6() != null;
   }
}
