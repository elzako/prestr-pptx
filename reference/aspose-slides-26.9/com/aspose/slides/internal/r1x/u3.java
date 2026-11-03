package com.aspose.slides.internal.r1x;

import com.aspose.slides.ms.System.q1;

public class u3 {
   public static void n5(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      int var5 = var4;

      while (var5 > 0) {
         int var6 = var1 % 8;
         byte var7 = var0[var1 / 8];
         int var8 = q1.l6(8 - var6, var5);
         int var9 = var3 % 8;
         byte var10 = var2[var3 / 8];
         int var11 = q1.l6(8 - var9, var8);
         byte[] var12 = new byte[]{var10};
         n5(var7, var6, var12, var9, var11);
         var10 = var12[0];
         var2[var3 / 8] = var10;
         var3 += var11;
         if (var8 > var11) {
            var10 = var2[var3 / 8];
            var12[0] = var10;
            n5(var7, var6 + var11, var12, var3 % 8, var8 - var11);
            var10 = var12[0];
            var2[var3 / 8] = var10;
            var3 += var8 - var11;
         }

         var5 -= var8;
         var1 += var8;
      }
   }

   private static void n5(byte var0, int var1, byte[] var2, int var3, int var4) {
      long var5 = ~(((255L >> 8 - var3 - var4 & 4294967295L) << (32 - var4 & 31) & 4294967295L) >> 24 + var3 & 4294967295L) & 4294967295L;
      long var7 = (((var0 & 0xFF & 4294967295L) >> 8 - var1 - var4 & 4294967295L) << (32 - var4 & 31) & 4294967295L) >> 24 + var3 & 4294967295L;
      var2[0] = (byte)((var2[0] & 0xFF & var5 & 4294967295L | var7) & 4294967295L);
   }
}
