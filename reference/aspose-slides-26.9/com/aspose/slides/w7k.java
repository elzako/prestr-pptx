package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class w7k {
   public static MathGroupingCharacter n5(com.aspose.slides.internal.k4y.h9j var0, t5w var1) {
      if (var0 == null) {
         throw new ArgumentNullException("elementData");
      }

      char var2 = 9183;
      int var3 = 2;
      int var4 = 1;
      if (var0.n5() != null) {
         if (var0.n5().l6() != null) {
            var2 = var0.n5().l6().n5();
         } else {
            var2 = 0;
         }

         if (var0.n5().k5() != null) {
            var3 = w2p.z1(var0.n5().k5().n5());
         }

         if (var0.n5().u3() != null) {
            var4 = w2p.z1(var0.n5().u3().n5());
         } else {
            var4 = 2;
         }
      }

      IMathElement var5 = b6l.n5(var0.l6(), var1);
      MathGroupingCharacter var6 = new MathGroupingCharacter(var5, var2, var3, var4);
      if (var0.n5() != null) {
         l0u.n5(var6.n5, var0.n5().a6(), var1);
      }

      return var6;
   }

   public static void n5(MathGroupingCharacter var0, com.aspose.slides.internal.k4y.h9j var1, g6c var2) {
      if (var0 == null) {
         throw new ArgumentNullException("domObject");
      }

      if (var1 == null) {
         throw new ArgumentNullException("elementData");
      }

      com.aspose.slides.internal.k4y.l4x var3 = new com.aspose.slides.internal.k4y.l4x();
      com.aspose.slides.internal.k4y.m0s var4 = new com.aspose.slides.internal.k4y.m0s();
      var4.n5(w2p.t9(var0.getPosition()));
      var3.n5(var4);
      com.aspose.slides.internal.k4y.m0s var5 = new com.aspose.slides.internal.k4y.m0s();
      var5.n5(w2p.t9(var0.getVerticalJustification()));
      var3.l6(var5);
      com.aspose.slides.internal.k4y.m4f var6 = new com.aspose.slides.internal.k4y.m4f();
      var6.n5(var0.getCharacter());
      var3.n5(var6);
      l0u.n5(var0.n5, new w7k$1(var3), var2);
      var1.n5(var3);
      b6l.n5(var1.l6(), var0.getBase(), var2);
   }
}
