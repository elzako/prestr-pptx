package com.aspose.slides.internal.y5s;

import com.aspose.slides.ms.System.q1;

public class u3 {
   public static k5 n5(int var0) {
      int var1 = var0 & 0xFF;
      int var2 = var0 >> 8 & 0xFF;
      int var3 = var0 >> 16 & 0xFF;
      int var4 = q1.l6(q1.l6(255 - var1, 255 - var2), 255 - var3);
      if (var4 < 255) {
         int var5 = 255 * (255 - var3 - var4) / (255 - var4);
         int var6 = 255 * (255 - var2 - var4) / (255 - var4);
         int var7 = 255 * (255 - var1 - var4) / (255 - var4);
         return k5.n5(var5, var6, var7, var4);
      } else {
         return k5.n5(0, 0, 0, var4);
      }
   }

   public static k5 n5(int var0, int var1, int var2, int var3, com.aspose.slides.internal.s7k.t2 var4) {
      double[] var5 = new double[3];
      double[] var6 = null;
      var5[0] = var1 / 255.0;
      var5[1] = var2 / 255.0;
      var5[2] = var3 / 255.0;
      boolean var7 = var4.n5() != 3;
      var6 = var7 ? new double[4] : new double[3];
      var4.n5(var5, var6);
      int var8 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.internal.v6g.k5.n5((Object)(255.0 * var6[0]), 14), 6);
      int var9 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.internal.v6g.k5.n5((Object)(255.0 * var6[1]), 14), 6);
      int var10 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.internal.v6g.k5.n5((Object)(255.0 * var6[2]), 14), 6);
      return var7
         ? k5.n5(var8, var9, var10, com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.internal.v6g.k5.n5((Object)(255.0 * var6[3]), 14), 6))
         : n5(com.aspose.slides.internal.o9b.c8.n5(255, var8, var9, var10).h0());
   }
}
