package com.aspose.slides.internal.r1x;

import com.aspose.slides.ms.System.q1;

public class t2 {
   public static byte[] n5(int[] var0, int var1, int var2) {
      int var3 = q1.l6(var1 + var2, var0.length);
      byte[] var4 = new byte[(var3 - var1) * 4];
      int var5 = 0;

      for (int var6 = var1; var6 < var3; var6++) {
         int var7 = var0[var6] & 0xFF;
         int var8 = var0[var6] >> 8 & 0xFF;
         int var9 = var0[var6] >> 16 & 0xFF;
         int var10 = q1.l6(q1.l6(255 - var7, 255 - var8), 255 - var9);
         if (var10 < 255) {
            int var11 = 255 - var10;
            var4[var5++] = (byte)(255 * (var11 - var9) / var11);
            var4[var5++] = (byte)(255 * (var11 - var8) / var11);
            var4[var5++] = (byte)(255 * (var11 - var7) / var11);
            var4[var5++] = (byte)var10;
         } else {
            var4[var5++] = 0;
            var4[var5++] = 0;
            var4[var5++] = 0;
            var4[var5++] = (byte)var10;
         }
      }

      return var4;
   }

   public static byte[] n5(int[] var0, int var1, int var2, com.aspose.slides.internal.z0k.t4 var3, com.aspose.slides.internal.z0k.t4 var4) {
      com.aspose.slides.internal.g7i.n5 var5 = new com.aspose.slides.internal.g7i.n5(var3, var4);
      double[] var6 = new double[3];
      double[] var7 = new double[4];
      int var8 = q1.l6(var1 + var2, var0.length);
      byte[] var9 = new byte[(var8 - var1) * 4];
      int var10 = 0;

      for (int var11 = var1; var11 < var8; var11++) {
         var6[0] = (var0[var11] >> 16 & 0xFF) / 255.0;
         var6[1] = (var0[var11] >> 8 & 0xFF) / 255.0;
         var6[2] = (var0[var11] & 0xFF) / 255.0;
         var5.n5(var6, var7);
         var9[var10++] = com.aspose.slides.internal.v6g.k5.n5((Object)(var7[0] * 255.0), 14);
         var9[var10++] = com.aspose.slides.internal.v6g.k5.n5((Object)(var7[1] * 255.0), 14);
         var9[var10++] = com.aspose.slides.internal.v6g.k5.n5((Object)(var7[2] * 255.0), 14);
         var9[var10++] = com.aspose.slides.internal.v6g.k5.n5((Object)(var7[3] * 255.0), 14);
      }

      return var9;
   }
}
