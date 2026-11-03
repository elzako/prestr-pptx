package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class z0 {
   public static MathBar n5(com.aspose.slides.internal.k4y.q7l var0, t5w var1) {
      if (var0 == null) {
         throw new ArgumentNullException("elementData");
      }

      IMathElement var2 = b6l.n5(var0.l6(), var1);
      MathBar var3 = new MathBar(var2);
      if (var0.n5() != null) {
         if (var0.n5().l6() != null) {
            var3.setPosition(w2p.z1(var0.n5().l6().n5()));
         }

         l0u.n5(var3.n5, var0.n5().k5(), var1);
      }

      return var3;
   }

   public static void n5(MathBar var0, com.aspose.slides.internal.k4y.q7l var1, g6c var2) {
      if (var0 == null) {
         throw new ArgumentNullException("domObject");
      }

      if (var1 == null) {
         throw new ArgumentNullException("elementData");
      }

      com.aspose.slides.internal.k4y.d8p var3 = new com.aspose.slides.internal.k4y.d8p();
      com.aspose.slides.internal.k4y.m0s var4 = new com.aspose.slides.internal.k4y.m0s();
      var4.n5(w2p.t9(var0.getPosition()));
      var3.n5(var4);
      l0u.n5(var0.n5, new z0$1(var3), var2);
      var1.n5(var3);
      b6l.n5(var1.l6(), var0.getBase(), var2);
   }
}
