package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class a1f {
   static IMathPhantom n5(com.aspose.slides.internal.k4y.d2m var0, t5w var1) {
      if (var0 == null) {
         throw new ArgumentNullException("elementData");
      }

      IMathElement var2 = b6l.n5(var0.l6(), var1);
      MathPhantom var3 = new MathPhantom(var2);
      if (var0.n5() != null) {
         var3.setShow(var0.n5().l6() == null || o5b.n5(var0.n5().l6()));
         var3.setZeroWidth(o5b.n5(var0.n5().k5()));
         var3.setZeroAsc(o5b.n5(var0.n5().u3()));
         var3.setZeroDesc(o5b.n5(var0.n5().a6()));
         var3.setTransp(o5b.n5(var0.n5().u9()));
         l0u.n5(var3.n5, var0.n5().h0(), var1);
      }

      return var3;
   }

   static void n5(MathPhantom var0, com.aspose.slides.internal.k4y.d2m var1, g6c var2) {
      if (var0 == null) {
         throw new ArgumentNullException("math");
      }

      if (var1 == null) {
         throw new ArgumentNullException("dataObject");
      }

      com.aspose.slides.internal.k4y.d4q var3 = new com.aspose.slides.internal.k4y.d4q();
      var1.n5(var3);
      com.aspose.slides.internal.k4y.g3p var4 = new com.aspose.slides.internal.k4y.g3p();
      var4.n5(var0.getShow() ? 1 : 2);
      var3.n5(var4);
      com.aspose.slides.internal.k4y.g3p var5 = new com.aspose.slides.internal.k4y.g3p();
      var5.n5(var0.getZeroWidth() ? 1 : 2);
      var3.l6(var5);
      com.aspose.slides.internal.k4y.g3p var6 = new com.aspose.slides.internal.k4y.g3p();
      var6.n5(var0.getZeroAsc() ? 1 : 2);
      var3.k5(var6);
      com.aspose.slides.internal.k4y.g3p var7 = new com.aspose.slides.internal.k4y.g3p();
      var7.n5(var0.getZeroDesc() ? 1 : 2);
      var3.u3(var7);
      com.aspose.slides.internal.k4y.g3p var8 = new com.aspose.slides.internal.k4y.g3p();
      var8.n5(var0.getTransp() ? 1 : 2);
      var3.a6(var8);
      l0u.n5(var0.n5, new a1f$1(var3), var2);
      b6l.n5(var1.l6(), var0.getBase(), var2);
   }
}
