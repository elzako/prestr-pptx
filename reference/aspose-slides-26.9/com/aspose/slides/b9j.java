package com.aspose.slides;

class b9j {
   public static void n5(IEffectStyle var0, com.aspose.slides.internal.k4y.n3c var1, t5w var2) {
      if (var1 != null) {
         w5i.n5(new b9j$1(var0), var1.k5(), var2);
         r6k.n5(var0.getThreeDFormat(), var1.u3(), var1.a6(), null);
      }
   }

   public static void n5(IEffectStyle var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.n3c> var1, g6c var2) {
      if (var0 != null) {
         com.aspose.slides.internal.k4y.n3c var3 = (com.aspose.slides.internal.k4y.n3c)var1.invoke();
         w5i.n5(var0.getEffectFormat(), (com.aspose.slides.internal.k4y.o9b)var3.n5("effectLst").l6(), var2);
         r6k.n5(var0.getThreeDFormat(), new b9j$2(var3), new b9j$3(var3), null);
      }
   }
}
