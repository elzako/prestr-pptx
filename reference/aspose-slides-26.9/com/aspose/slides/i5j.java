package com.aspose.slides;

class i5j {
   public static void n5(c4p var0, com.aspose.slides.internal.k4y.l4o var1, t5w var2) {
      if (var1 != null) {
         b6w.n5(var0.n5(), var1.n5(), var2);
         i8s.n5(var0.l6(), var1.l6(), var2);
      }
   }

   public static void n5(c4p var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.l4o> var1, g6c var2) {
      if (var0.n5().u3() != 0 || var0.l6().n5() != 0) {
         com.aspose.slides.internal.k4y.l4o var3 = (com.aspose.slides.internal.k4y.l4o)var1.invoke();
         b6w.n5(var0.n5(), new i5j$1(var3), var2);
         i8s.n5(var0.l6(), new i5j$2(var3), var2);
      }
   }
}
