package com.aspose.slides;

class q2c {
   public static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var0) {
      o3 var1 = o3.n5(var0);
      o3 var2 = o3.n5(var1.a6().u3(), 196865);

      for (int var3 = 0; var3 < var1.l6(); var3++) {
         for (int var4 = 0; var4 < var1.n5(); var4++) {
            byte var5 = var1.n5(var4, var3);
            int var6 = (var5 & 255) >= 128 ? -1 : 0;
            var2.n5(var4, var3, (byte)var6);
            int var7 = (var5 & 255) - (var6 & 0xFF);
            if (var4 + 1 < var1.n5()) {
               n5(var1, var4 + 1, var3, var7, 7);
            }

            if (var4 - 1 >= 0 && var3 + 1 < var1.l6()) {
               n5(var1, var4 - 1, var3 + 1, var7, 3);
            }

            if (var3 + 1 < var1.l6()) {
               n5(var1, var4, var3 + 1, var7, 5);
            }

            if (var4 + 1 < var1.n5() && var3 + 1 < var1.l6()) {
               n5(var1, var4 + 1, var3 + 1, var7, 1);
            }
         }
      }

      return var2.u9();
   }

   private static void n5(o3 var0, int var1, int var2, int var3, int var4) {
      byte var5 = var0.n5(var1, var2);
      byte var6 = n5((var5 & 255) + com.aspose.slides.internal.v6g.k5.u3(var3 * var4 / 16.0, 14));
      var0.n5(var1, var2, var6);
   }

   private static byte n5(int var0) {
      return (byte)com.aspose.slides.ms.System.q1.l6(com.aspose.slides.ms.System.q1.n5(var0, 0), 255);
   }
}
