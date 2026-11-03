package com.aspose.slides;

class t1g {
   private static e6s n5;

   static void n5(e6s var0) {
      n5 = var0;
   }

   static com.aspose.slides.internal.o9b.n3 n5() {
      return n5(18.0F);
   }

   static com.aspose.slides.internal.o9b.n3 n5(float var0) {
      com.aspose.slides.internal.o9b.n3 var1 = new com.aspose.slides.internal.o9b.n3("Cambria Math", var0, 2, 3);
      if (n5 != null && n5.n5() > 0 && !"Cambria Math".equals(var1.h0())) {
         com.aspose.slides.internal.o9b.n3 var2 = n5.n5("Cambria Math", var0, 2);
         if (var2 != null && "Cambria Math".equals(var2.h0())) {
            return var2;
         }
      }

      return var1;
   }
}
