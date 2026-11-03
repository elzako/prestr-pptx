package com.aspose.slides.internal.w4w;

import java.util.Arrays;

public final class h0 {
   private static final char[] n5 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
   private static final int[] l6 = new int[256];

   public static final byte[] n5(String var0) {
      int var1 = var0 != null ? var0.length() : 0;
      if (var1 == 0) {
         return new byte[0];
      }

      int var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         if (l6[var0.charAt(var3)] < 0) {
            var2++;
         }
      }

      if ((var1 - var2) % 4 != 0) {
         return null;
      }

      int var11 = 0;
      int var4 = var1;

      while (var4 > 1) {
         if (l6[var0.charAt(--var4)] > 0) {
            break;
         }

         if (var0.charAt(var4) == '=') {
            var11++;
         }
      }

      var4 = ((var1 - var2) * 6 >> 3) - var11;
      byte[] var5 = new byte[var4];
      int var6 = 0;
      int var7 = 0;

      while (var7 < var4) {
         int var8 = 0;

         for (int var9 = 0; var9 < 4; var9++) {
            int var10 = l6[var0.charAt(var6++)];
            if (var10 >= 0) {
               var8 |= var10 << 18 - var9 * 6;
            } else {
               var9--;
            }
         }

         var5[var7++] = (byte)(var8 >> 16);
         if (var7 < var4) {
            var5[var7++] = (byte)(var8 >> 8);
            if (var7 < var4) {
               var5[var7++] = (byte)var8;
            }
         }
      }

      return var5;
   }

   static {
      Arrays.fill(l6, -1);
      int var0 = 0;
      int var1 = n5.length;

      while (var0 < var1) {
         l6[n5[var0]] = var0++;
      }

      l6[61] = 0;
   }
}
