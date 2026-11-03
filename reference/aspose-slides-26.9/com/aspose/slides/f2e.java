package com.aspose.slides;

class f2e {
   public static void n5(ITrendline var0, com.aspose.slides.internal.k4y.l6z var1, t5w var2) {
      if (var1 != null) {
         y9a var3 = ((Trendline)var0).n5();
         var0.setTrendlineName(var1.s7());
         k5r.n5(var0.getFormat(), var1.x8(), var2);
         var0.setTrendlineType(var1.n3().n5());
         if (var1.y4() != null) {
            var0.setOrder(var1.y4().n5());
         }

         if (var1.e2() != null) {
            var0.setPeriod(var1.e2().n5());
         }

         if (var1.t9() != null) {
            var0.setForward(var1.t9().n5());
         }

         if (var1.z1() != null) {
            var0.setBackward(var1.z1().n5());
         }

         if (var1.t4() != null) {
            var0.setIntercept(var1.t4().n5());
         }

         if (var1.q0() != null) {
            var0.setDisplayRSquaredValue(var1.q0().n5());
         }

         if (var1.z3() != null) {
            var0.setDisplayEquation(var1.z3().n5());
         }

         if (var1.m1() != null) {
            w5s.n5(var0, var1.m1().u3(), var1.m1().h0(), var2);
            var3.n5(var1.m1().k5());
            var3.n5(var1.m1().a6());
            var3.n5(var1.m1().u9());
            var3.l6(var1.m1().c8());
         }

         var3.n5(var1.k7());
      }
   }

   public static void n5(ITrendline var0, com.aspose.slides.internal.k4y.l6z var1, g6c var2) {
      if (var0 != null) {
         y9a var3 = ((Trendline)var0).n5();
         var1.n5(var0.getTrendlineName());
         k5r.n5(var0.getFormat(), new f2e$1(var1), var2, null, false);
         var1.n3().n5(var0.getTrendlineType());
         if (var0.getTrendlineType() == 4) {
            var1.l6().n5(var0.getOrder());
         }

         if (var0.getTrendlineType() == 3) {
            var1.k5().n5(var0.getPeriod());
         }

         if (!com.aspose.slides.ms.System.d2.k5(var0.getForward())) {
            var1.u3().n5(var0.getForward());
         }

         if (!com.aspose.slides.ms.System.d2.k5(var0.getBackward())) {
            var1.a6().n5(var0.getBackward());
         }

         if (!com.aspose.slides.ms.System.d2.k5(var0.getIntercept())) {
            var1.u9().n5(var0.getIntercept());
         }

         var1.h0().n5(var0.getDisplayRSquaredValue());
         var1.c8().n5(var0.getDisplayEquation());
         if (var0.getTextFrameForOverriding() != null && var0.getTextFrameForOverriding().getParagraphs().getCount() != 0
            || y4k.n5(var0.getTextFormat())
            || var3.n5() != null
            || var3.l6() != null
            || var3.k5() != null
            || var3.a6() != null) {
            var1.t2();
            w5s.n5(var0, new f2e$2(var1), new f2e$3(var1), var2);
            var1.m1().n5(var3.n5());
            var1.m1().n5(var3.l6());
            var1.m1().n5(var3.k5());
            var1.m1().n5(var3.a6());
         }

         var1.n5(var3.u3());
      }
   }
}
