package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class b3x {
   public static MathBox n5(com.aspose.slides.internal.k4y.r3m var0, t5w var1) {
      if (var0 == null) {
         throw new ArgumentNullException("elementData");
      }

      IMathElement var2 = b6l.n5(var0.k5(), var1);
      MathBox var3 = new MathBox(var2);
      if (var0.l6() != null) {
         com.aspose.slides.internal.k4y.c9u var4 = var0.l6();
         var3.setOperatorEmulator(o5b.n5(var4.l6()));
         var3.setNoBreak(o5b.l6(var4.k5()));
         var3.setDifferential(o5b.n5(var4.u3()));
         var3.setAlignmentPoint(o5b.n5(var4.u9()));
         if (var4.a6() != null) {
            var3.setExplicitBreak(var4.a6().n5());
         }

         l0u.n5(var3.n5, var4.h0(), var1);
      }

      return var3;
   }

   public static void n5(MathBox var0, com.aspose.slides.internal.k4y.r3m var1, g6c var2) {
      if (var0 == null) {
         throw new ArgumentNullException("groupBox");
      }

      if (var1 == null) {
         throw new ArgumentNullException("elementData");
      }

      com.aspose.slides.internal.k4y.c9u var3 = var1.n5();
      if (var0.getOperatorEmulator()) {
         var3.n5(o5b.n5(var0.getOperatorEmulator()));
      }

      if (!var0.getNoBreak()) {
         var3.l6(o5b.n5(var0.getNoBreak()));
      }

      if (var0.getDifferential()) {
         var3.k5(o5b.n5(var0.getDifferential()));
      }

      if (var0.getAlignmentPoint()) {
         var3.u3(o5b.n5(var0.getAlignmentPoint()));
      }

      if ((var0.getExplicitBreak() & 255) > 0) {
         com.aspose.slides.internal.k4y.s1y var4 = new com.aspose.slides.internal.k4y.s1y();
         var4.n5(var0.getExplicitBreak());
         var3.n5(var4);
      }

      l0u.n5(var0.n5, new b3x$1(var3), var2);
      b6l.n5(var1.k5(), var0.getBase(), var2);
   }
}
