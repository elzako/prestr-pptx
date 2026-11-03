package com.aspose.slides;

class k2n {
   public static o6z n5(com.aspose.slides.internal.k4y.t9f var0) {
      String var1 = var0.l6() == null ? com.aspose.slides.ms.System.d1.n5 : var0.l6();
      return new o6z(var1, w2p.n5(var0.n5()));
   }

   public static com.aspose.slides.internal.k4y.t9f n5(o6z var0, IPortionFormat var1) {
      String var2 = var0.n5();
      if (var1 != null) {
         var2 = m8y.n5(var2, MathematicalText.n5(var1));
      }

      com.aspose.slides.internal.k4y.t9f var3 = new com.aspose.slides.internal.k4y.t9f();
      var3.n5(var2);
      var3.n5(w2p.l6(var0.l6()));
      return var3;
   }
}
