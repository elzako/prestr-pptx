package com.aspose.slides;

class l9e {
   public static void n5(IFillOverlay var0, com.aspose.slides.internal.k4y.k1d var1, t5w var2) {
      if (var1 != null) {
         var0.setBlend(var1.n5());
         x9f.n5(var0.getFillFormat(), var1.l6(), var2);
      }
   }

   public static void n5(IFillOverlay var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.k1d> var1, g6c var2) {
      if (var0 != null) {
         com.aspose.slides.internal.k4y.k1d var3 = (com.aspose.slides.internal.k4y.k1d)var1.invoke();
         var3.n5(var0.getBlend());
         x9f.n5(var0.getFillFormat(), new l9e$1(var3), var2);
      }
   }
}
