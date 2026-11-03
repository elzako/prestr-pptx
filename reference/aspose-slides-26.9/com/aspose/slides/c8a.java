package com.aspose.slides;

class c8a {
   public static s4s n5(com.aspose.slides.internal.k4y.p6r var0) {
      if (var0 != null) {
         d2k var1 = new d2k(var0.n5() / 100.0F, var0.l6() / 100.0F);
         d2k var2 = d2k.l6(new d2k(1.0F - var0.k5() / 100.0F, 1.0F - var0.u3() / 100.0F), var1).u3();
         return new s4s(var1.u3(), var2.u3());
      } else {
         return new s4s(d2k.k5.u3(), d2k.u3.u3());
      }
   }

   public static void n5(s4s var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.p6r> var1) {
      com.aspose.slides.internal.k4y.p6r var2 = (com.aspose.slides.internal.k4y.p6r)var1.invoke();
      if (c1t.l6(var0.l6())) {
         n5(var0.l6(), var2);
      }
   }

   public static void n5(s4s var0, com.aspose.slides.internal.k4y.p6r var1) {
      var1.n5(var0.n5.n5 * 100.0F);
      var1.l6(var0.n5.l6 * 100.0F);
      d2k var2 = var0.n5().u3();
      var1.k5((1.0F - var2.n5) * 100.0F);
      var1.u3((1.0F - var2.l6) * 100.0F);
   }
}
