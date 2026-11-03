package com.aspose.slides.internal.b7s;

public class j9 {
   public static com.aspose.slides.internal.o9b.y2 n5(int var0, int var1, int var2, com.aspose.slides.internal.o9b.y2 var3) {
      int var4 = 8 * var2;
      int var5 = var3.x8() / var4;
      int var6 = var0 == var5 ? var3.x8() : var0 * var4;
      int var7 = var4;
      if (var0 == var1) {
         if (var0 == var5) {
            var7 = var3.n5() - var3.x8();
         } else {
            var7 = var3.n5() - var0 * var4;
         }
      } else if (var0 == var5) {
         var7 = (var0 + 1) * var4 - var3.x8();
      }

      return new com.aspose.slides.internal.o9b.y2(var3.s7(), var6, var3.t2(), var7);
   }
}
