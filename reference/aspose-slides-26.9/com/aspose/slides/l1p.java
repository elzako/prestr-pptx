package com.aspose.slides;

class l1p {
   public static MathLimit n5(com.aspose.slides.internal.k4y.b9g var0, t5w var1) {
      MathLimit var2 = new MathLimit(b6l.n5(var0.k5(), var1), b6l.n5(var0.u3(), var1), false);
      if (var0.l6() != null) {
         l0u.n5(var2.n5, var0.l6().l6(), var1);
      }

      return var2;
   }

   public static com.aspose.slides.internal.k4y.b9g n5(MathLimit var0, g6c var1) {
      com.aspose.slides.internal.k4y.b9g var2 = new com.aspose.slides.internal.k4y.b9g();
      b6l.n5(var2.k5(), var0.getBase(), var1);
      b6l.n5(var2.u3(), var0.getLimit(), var1);
      if (!var0.n5.n5()) {
         com.aspose.slides.internal.k4y.g8l var3 = var2.n5();
         l0u.n5(var0.n5, new l1p$1(var3), var1);
      }

      return var2;
   }
}
