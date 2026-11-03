package com.aspose.slides;

class z7o {
   public static MathFunction n5(com.aspose.slides.internal.k4y.i3t var0, t5w var1) {
      IMathElement var2 = b6l.n5(var0.k5(), var1);
      IMathElement var3 = b6l.n5(var0.u3(), var1);
      MathFunction var4 = new MathFunction(var2, var3);
      if (var0.l6() != null) {
         l0u.n5(var4.n5, var0.l6().l6(), var1);
      }

      return var4;
   }

   public static com.aspose.slides.internal.k4y.i3t n5(MathFunction var0, g6c var1) {
      com.aspose.slides.internal.k4y.i3t var2 = new com.aspose.slides.internal.k4y.i3t();
      b6l.n5(var2.k5(), var0.getName(), var1);
      b6l.n5(var2.u3(), var0.getBase(), var1);
      if (!var0.n5.n5()) {
         com.aspose.slides.internal.k4y.h4q var3 = var2.n5();
         l0u.n5(var0.n5, new z7o$1(var3), var1);
      }

      return var2;
   }
}
