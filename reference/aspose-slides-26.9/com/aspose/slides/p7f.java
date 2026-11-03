package com.aspose.slides;

class p7f {
   public static float n5(com.aspose.slides.internal.o9b.f2 var0, com.aspose.slides.internal.o9b.f2 var1) {
      float var2 = var0.l6() / var0.k5() > var1.l6() / var1.k5() ? var0.k5() / var1.k5() : var0.l6() / var1.l6();
      var2 = (float)com.aspose.slides.ms.System.q1.n5((double)(var2), 2);
      return var2 != 0.0F ? var2 : 1.0F;
   }

   public static float n5(XamlOptions var0, com.aspose.slides.internal.o9b.f2 var1, com.aspose.slides.internal.o9b.f2 var2, float var3) {
      if (com.aspose.slides.ms.System.n1.k5(var3)) {
         String var7 = com.aspose.slides.ms.System.d1.n5("In the '{0}' class was put a parameter '{1}' equal 'null'.",new Object[]{ "ScaleHelper", "unscaledSize"});
         throw new t1c(var7);
      } else {
         float var4 = n5(var1.a6(), var2.a6());
         float var5 = var3 * var4;
         if (var0.t2() == 0) {
            float var6 = var5 / 2.0F;
            return (float)com.aspose.slides.ms.System.q1.n5((double)(var6), 2);
         } else {
            return (float)com.aspose.slides.ms.System.q1.n5((double)(var5), 2);
         }
      }
   }
}
