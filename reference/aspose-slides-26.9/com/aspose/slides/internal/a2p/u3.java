package com.aspose.slides.internal.a2p;

import com.aspose.slides.internal.b7s.e2;
import com.aspose.slides.internal.b8u.t9;
import com.aspose.slides.internal.r1x.v4;

public class u3 extends e2 {
   protected static final int[] k5 = n5();

   public u3(t9 var1) {
      this.n5 = var1;
      this.l6 = v4.x8();
   }

   private static int[] n5() {
      double var0 = 0.16873589164785552;
      double var2 = 0.3312641083521444;
      double var4 = 0.5;
      double var6 = 0.5;
      double var8 = 0.41868758915834514;
      double var10 = 0.08131241084165478;
      int[] var12 = new int[2304];

      for (int var13 = 0; var13 < 256; var13++) {
         var12[var13 + 0] = n5(0.299) * var13;
         var12[var13 + 256] = n5(0.587) * var13;
         var12[var13 + 512] = n5(0.114) * var13;
         var12[var13 + 1536] = -n5(var0) * var13;
         var12[var13 + 1792] = -n5(var2) * var13;
         var12[var13 + 2048] = n5(var4) * var13 + 8388608;
         var12[var13 + 768] = n5(var6) * var13;
         var12[var13 + 1024] = -n5(var8) * var13;
         var12[var13 + 1280] = -n5(var10) * var13 + 8388608;
      }

      return var12;
   }

   private static int n5(double var0) {
      return com.aspose.slides.internal.v6g.k5.u3(var0 * 65536.0 + 0.5, 14);
   }

   @Override
   protected byte[] n5(int[] var1) {
      boolean var2 = false;
      short var3 = 255;
      byte[] var4 = new byte[var1.length * 3];
      int var5 = 0;
      int[] var6 = k5;

      for (int var7 = 0; var7 < var1.length; var7++) {
         int var8 = var1[var7];
         int var9 = (byte)(var8 >> 16 & 0xFF) & 255;
         int var10 = (byte)(var8 >> 8 & 0xFF) & 255;
         int var11 = (byte)(var8 & 0xFF) & 255;
         int var12 = var6[var9 + 0] + var6[var10 + 256] + var6[var11 + 512] >> 16;
         int var13 = var6[var9 + 1536] + var6[var10 + 1792] + var6[var11 + 2048] >> 16;
         int var14 = var6[var9 + 768] + var6[var10 + 1024] + var6[var11 + 1280] >> 16;
         if (var12 < 0) {
            var12 = 0;
         } else if (var12 > 255) {
            var12 = 255;
         }

         if (var13 < 0) {
            var13 = 0;
         } else if (var13 > 255) {
            var13 = 255;
         }

         if (var14 < 0) {
            var14 = 0;
         } else if (var14 > 255) {
            var14 = 255;
         }

         var4[var5++] = (byte)var12;
         var4[var5++] = (byte)var13;
         var4[var5++] = (byte)var14;
      }

      return var4;
   }
}
