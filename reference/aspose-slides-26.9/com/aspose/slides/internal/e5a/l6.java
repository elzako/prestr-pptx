package com.aspose.slides.internal.e5a;

public final class l6 {
   public static long n5(long var0, byte[] var2, int var3, int var4) {
      if (var2 == null) {
         return 1L;
      }

      long var5 = var0 & 65535L;

      long var7;
      for (var7 = var0 >> 16 & 65535L; var4 > 0; var7 %= 65521L) {
         int var9 = var4 < 5552 ? var4 : 5552;
         var4 -= var9;

         while (var9 >= 16) {
            long var25 = var5 + (var2[var3++] & 0xFF & 0xFF);
            var7 += var25;
            long var26 = var25 + (var2[var3++] & 0xFF & 0xFF);
            var7 += var26;
            long var27 = var26 + (var2[var3++] & 0xFF & 0xFF);
            var7 += var27;
            long var28 = var27 + (var2[var3++] & 0xFF & 0xFF);
            var7 += var28;
            long var29 = var28 + (var2[var3++] & 0xFF & 0xFF);
            var7 += var29;
            long var30 = var29 + (var2[var3++] & 0xFF & 0xFF);
            var7 += var30;
            long var31 = var30 + (var2[var3++] & 0xFF & 0xFF);
            var7 += var31;
            long var32 = var31 + (var2[var3++] & 0xFF & 0xFF);
            var7 += var32;
            long var33 = var32 + (var2[var3++] & 0xFF & 0xFF);
            var7 += var33;
            long var34 = var33 + (var2[var3++] & 0xFF & 0xFF);
            var7 += var34;
            long var35 = var34 + (var2[var3++] & 0xFF & 0xFF);
            var7 += var35;
            long var36 = var35 + (var2[var3++] & 0xFF & 0xFF);
            var7 += var36;
            long var37 = var36 + (var2[var3++] & 0xFF & 0xFF);
            var7 += var37;
            long var38 = var37 + (var2[var3++] & 0xFF & 0xFF);
            var7 += var38;
            long var39 = var38 + (var2[var3++] & 0xFF & 0xFF);
            var7 += var39;
            var5 = var39 + (var2[var3++] & 0xFF & 0xFF);
            var7 += var5;
            var9 -= 16;
         }

         if (var9 != 0) {
            do {
               var5 += var2[var3++] & 0xFF & 0xFF;
               var7 += var5;
            } while (--var9 != 0);
         }

         var5 %= 65521L;
      }

      return var7 << 16 | var5;
   }
}
