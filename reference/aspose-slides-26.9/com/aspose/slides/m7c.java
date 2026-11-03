package com.aspose.slides;

class m7c {
   public static MathRadical n5(com.aspose.slides.internal.k4y.o9p var0, t5w var1) {
      MathRadical var2 = new MathRadical(b6l.n5(var0.k5(), var1), b6l.n5(var0.l6(), var1));
      if (var0.n5() != null) {
         var2.setHideDegree(o5b.n5(var0.n5().l6()));
         l0u.n5(var2.n5, var0.n5().k5(), var1);
      }

      return var2;
   }

   public static com.aspose.slides.internal.k4y.o9p n5(MathRadical var0, g6c var1) {
      com.aspose.slides.internal.k4y.o9p var2 = new com.aspose.slides.internal.k4y.o9p();
      if (!var0.l6()) {
         com.aspose.slides.internal.k4y.p2v var3 = new com.aspose.slides.internal.k4y.p2v();
         var3.n5(o5b.n5(var0.getHideDegree()));
         l0u.n5(var0.n5, new m7c$1(var3), var1);
         var2.n5(var3);
      }

      if (var0.getBase() != null) {
         b6l.n5(var2.k5(), var0.getBase(), var1);
      }

      if (var0.getDegree() != null) {
         b6l.n5(var2.l6(), var0.getDegree(), var1);
      }

      return var2;
   }
}
