package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class s7 {
   public static MathAccent n5(com.aspose.slides.internal.k4y.b3x var0, t5w var1) {
      if (var0 == null) {
         throw new ArgumentNullException("accElementData");
      }

      IMathElement var2 = b6l.n5(var0.l6(), var1);
      MathAccent var3 = new MathAccent(var2);
      if (var0.n5() != null) {
         if (var0.n5().l6() != null) {
            var3.setCharacter(var0.n5().l6().n5());
         }

         l0u.n5(var3.n5, var0.n5().k5(), var1);
      }

      return var3;
   }

   public static void n5(MathAccent var0, com.aspose.slides.internal.k4y.b3x var1, g6c var2) {
      if (var0 == null) {
         throw new ArgumentNullException("domObject");
      }

      if (var1 == null) {
         throw new ArgumentNullException("accElementData");
      }

      com.aspose.slides.internal.k4y.n2q var3 = new com.aspose.slides.internal.k4y.n2q();
      com.aspose.slides.internal.k4y.m4f var4 = new com.aspose.slides.internal.k4y.m4f();
      var4.n5(var0.getCharacter());
      var3.n5(var4);
      l0u.n5(var0.n5, new s7$1(var3), var2);
      var1.n5(var3);
      b6l.n5(var1.l6(), var0.getBase(), var2);
   }
}
