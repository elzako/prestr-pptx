package com.aspose.slides;

class e9b {
   static void n5(IExtraColorScheme var0, com.aspose.slides.internal.k4y.c0 var1) {
      if (var1 != null) {
         g3j.n5(var0.getColorScheme(), var1.l6());
         a1g.n5(((ExtraColorScheme)var0).n5(), var1.k5());
      }
   }

   static void n5(IExtraColorScheme var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.c0> var1) {
      if (var0 != null) {
         com.aspose.slides.internal.k4y.c0 var2 = (com.aspose.slides.internal.k4y.c0)var1.invoke();
         g3j.l6(var0.getColorScheme(), var2.l6());
         a1g.n5(((ExtraColorScheme)var0).n5(), new e9b$1(var2));
      }
   }
}
