package com.aspose.slides.internal.f3h;

public final class n5 {
   public static long n5(long var0, byte[] var2, int var3, int var4) {
      if (var2 == null) {
         return 1L;
      }

      long var5 = var0 & 65535L;

      long var7;
      for (var7 = var0 >>> 16; var4 > 0; var7 %= 65521L) {
         int var9 = 3800;
         if (var9 > var4) {
            var9 = var4;
         }

         var4 -= var9;

         while (--var9 >= 0) {
            var5 += var2[var3++] & 0xFF;
            var7 += var5;
         }

         var5 %= 65521L;
      }

      return var7 << 16 | var5;
   }
}
