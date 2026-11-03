package com.aspose.slides;

class c5f {
   public static MathLimit n5(com.aspose.slides.internal.k4y.m6c var0, t5w var1) {
      MathLimit var2 = new MathLimit(b6l.n5(var0.k5(), var1), b6l.n5(var0.u3(), var1), true);
      if (var0.l6() != null) {
         l0u.n5(var2.n5, var0.l6().l6(), var1);
      }

      return var2;
   }

   public static com.aspose.slides.internal.k4y.m6c n5(MathLimit var0, g6c var1) {
      com.aspose.slides.internal.k4y.m6c var2 = new com.aspose.slides.internal.k4y.m6c();
      b6l.n5(var2.k5(), var0.getBase(), var1);
      b6l.n5(var2.u3(), var0.getLimit(), var1);
      s7u var3 = var0.n5;
      if (!var3.n5()) {
         com.aspose.slides.internal.k4y.r1g var4 = var2.n5();
         l0u.n5(var3, new c5f$1(var4), var1);
      }

      return var2;
   }
}
