package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class x6 {
   public static MathBorderBox n5(com.aspose.slides.internal.k4y.r2v var0, t5w var1) {
      if (var0 == null) {
         throw new ArgumentNullException("elementData");
      }

      IMathElement var2 = b6l.n5(var0.l6(), var1);
      MathBorderBox var3 = new MathBorderBox(var2);
      if (var0.n5() != null) {
         var3.setHideTop(o5b.n5(var0.n5().l6()));
         var3.setHideBottom(o5b.n5(var0.n5().k5()));
         var3.setHideLeft(o5b.n5(var0.n5().u3()));
         var3.setHideRight(o5b.n5(var0.n5().a6()));
         var3.setStrikethroughHorizontal(o5b.n5(var0.n5().u9()));
         var3.setStrikethroughVertical(o5b.n5(var0.n5().h0()));
         var3.setStrikethroughBottomLeftToTopRight(o5b.n5(var0.n5().c8()));
         var3.setStrikethroughTopLeftToBottomRight(o5b.n5(var0.n5().t2()));
         l0u.n5(var3.n5, var0.n5().s7(), var1);
      }

      return var3;
   }

   public static void n5(MathBorderBox var0, com.aspose.slides.internal.k4y.r2v var1, g6c var2) {
      if (var0 == null) {
         throw new ArgumentNullException("borderBox");
      }

      if (var1 == null) {
         throw new ArgumentNullException("elementData");
      }

      com.aspose.slides.internal.k4y.w3p var3 = new com.aspose.slides.internal.k4y.w3p();
      if (var0.getHideTop()) {
         var3.n5(o5b.n5(var0.getHideTop()));
      }

      if (var0.getHideBottom()) {
         var3.l6(o5b.n5(var0.getHideBottom()));
      }

      if (var0.getHideLeft()) {
         var3.k5(o5b.n5(var0.getHideLeft()));
      }

      if (var0.getHideRight()) {
         var3.u3(o5b.n5(var0.getHideRight()));
      }

      if (var0.getStrikethroughHorizontal()) {
         var3.a6(o5b.n5(var0.getStrikethroughHorizontal()));
      }

      if (var0.getStrikethroughVertical()) {
         var3.u9(o5b.n5(var0.getStrikethroughVertical()));
      }

      if (var0.getStrikethroughBottomLeftToTopRight()) {
         var3.h0(o5b.n5(var0.getStrikethroughBottomLeftToTopRight()));
      }

      if (var0.getStrikethroughTopLeftToBottomRight()) {
         var3.c8(o5b.n5(var0.getStrikethroughTopLeftToBottomRight()));
      }

      l0u.n5(var0.n5, new x6$1(var3), var2);
      var1.n5(var3);
      b6l.n5(var1.l6(), var0.getBase(), var2);
   }
}
