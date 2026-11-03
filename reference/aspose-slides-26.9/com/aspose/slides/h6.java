package com.aspose.slides;

class h6 {
   public static x3f n5(com.aspose.slides.internal.k4y.r2h var0, t5w var1) {
      if (var0 == null) {
         return null;
      }

      x3f var2 = new x3f();
      if (var0.l6() != null) {
         var2.n5(w2p.h0(var0.l6().n5()));
      }

      var2.n5(o5b.n5(var0.k5()));
      var2.l6(o5b.n5(var0.u3()));
      if (var0.a6() != null) {
         var2.l6(var0.a6().n5() & 255);
      }

      if (var0.u9() != null) {
         var2.n5(var0.u9().n5());
      }

      l0u.n5(var2.u9(), var0.h0(), var1);
      return var2;
   }

   public static com.aspose.slides.internal.k4y.r2h n5(MathArray var0, g6c var1) {
      if (var0 != null && !var0.l6()) {
         com.aspose.slides.internal.k4y.r2h var2 = new com.aspose.slides.internal.k4y.r2h();
         if (var0.getBaseJustification() != 0) {
            com.aspose.slides.internal.k4y.r3n var3 = new com.aspose.slides.internal.k4y.r3n();
            var3.n5(w2p.c8(var0.getBaseJustification()));
            var2.n5(var3);
         }

         var2.n5(o5b.n5(var0.getMaximumDistribution()));
         var2.l6(o5b.n5(var0.getObjectDistribution()));
         com.aspose.slides.internal.k4y.q6z var5 = new com.aspose.slides.internal.k4y.q6z();
         var5.n5((byte)var0.getRowSpacingRule());
         var2.n5(var5);
         com.aspose.slides.internal.k4y.i6m var4 = new com.aspose.slides.internal.k4y.i6m();
         var4.n5(var0.getRowSpacing());
         var2.n5(var4);
         l0u.n5(var0.n5(), new h6$1(var2), var1);
         return var2;
      } else {
         return null;
      }
   }
}
