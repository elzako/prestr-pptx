package com.aspose.slides;

class o0y {
   public static MathFraction n5(com.aspose.slides.internal.k4y.k6l var0, t5w var1) {
      com.aspose.slides.internal.k4y.s0m var2 = var0.l6();
      com.aspose.slides.internal.k4y.s0m var3 = var0.k5();
      MathFraction var4 = new MathFraction(b6l.n5(var2, var1), b6l.n5(var3, var1));
      if (var0.n5() != null) {
         if (var0.n5().l6() != null) {
            var4.setFractionType(w2p.a6(var0.n5().l6().n5()));
         }

         l0u.n5(var4.n5, var0.n5().k5(), var1);
      }

      return var4;
   }

   public static com.aspose.slides.internal.k4y.k6l n5(MathFraction var0, g6c var1) {
      com.aspose.slides.internal.k4y.k6l var2 = new com.aspose.slides.internal.k4y.k6l();
      b6l.n5(var2.l6(), var0.getNumerator(), var1);
      b6l.n5(var2.k5(), var0.getDenominator(), var1);
      if (!var0.l6()) {
         com.aspose.slides.internal.k4y.m6v var3 = new com.aspose.slides.internal.k4y.m6v();
         com.aspose.slides.internal.k4y.s6z var4 = new com.aspose.slides.internal.k4y.s6z();
         var4.n5(w2p.u9(var0.getFractionType()));
         var3.n5(var4);
         l0u.n5(var0.n5, new o0y$1(var3), var1);
         var2.n5(var3);
      }

      return var2;
   }
}
