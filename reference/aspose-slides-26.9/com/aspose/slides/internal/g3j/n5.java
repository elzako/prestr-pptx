package com.aspose.slides.internal.g3j;

public class n5 {
   public static long n5(long var0, byte[] var2, int var3, int var4) {
      if (var2 == null) {
         return 1L;
      }

      long var5 = var0 & 4294967295L & 65535L & 4294967295L & 4294967295L;

      long var7;
      for (var7 = (var0 & 4294967295L) >> 16 & 4294967295L & 65535L & 4294967295L & 4294967295L; var4 > 0; var7 = (var7 & 4294967295L) % 65521L & 4294967295L) {
         int var9 = var4 < 5552 ? var4 : 5552;
         var4 -= var9;

         while (var9 >= 16) {
            long var25 = (var5 & 4294967295L) + (var2[var3++] & 0xFF) & 4294967295L;
            var7 = (var7 & 4294967295L) + (var25 & 4294967295L) & 4294967295L;
            long var26 = (var25 & 4294967295L) + (var2[var3++] & 0xFF) & 4294967295L;
            var7 = (var7 & 4294967295L) + (var26 & 4294967295L) & 4294967295L;
            long var27 = (var26 & 4294967295L) + (var2[var3++] & 0xFF) & 4294967295L;
            var7 = (var7 & 4294967295L) + (var27 & 4294967295L) & 4294967295L;
            long var28 = (var27 & 4294967295L) + (var2[var3++] & 0xFF) & 4294967295L;
            var7 = (var7 & 4294967295L) + (var28 & 4294967295L) & 4294967295L;
            long var29 = (var28 & 4294967295L) + (var2[var3++] & 0xFF) & 4294967295L;
            var7 = (var7 & 4294967295L) + (var29 & 4294967295L) & 4294967295L;
            long var30 = (var29 & 4294967295L) + (var2[var3++] & 0xFF) & 4294967295L;
            var7 = (var7 & 4294967295L) + (var30 & 4294967295L) & 4294967295L;
            long var31 = (var30 & 4294967295L) + (var2[var3++] & 0xFF) & 4294967295L;
            var7 = (var7 & 4294967295L) + (var31 & 4294967295L) & 4294967295L;
            long var32 = (var31 & 4294967295L) + (var2[var3++] & 0xFF) & 4294967295L;
            var7 = (var7 & 4294967295L) + (var32 & 4294967295L) & 4294967295L;
            long var33 = (var32 & 4294967295L) + (var2[var3++] & 0xFF) & 4294967295L;
            var7 = (var7 & 4294967295L) + (var33 & 4294967295L) & 4294967295L;
            long var34 = (var33 & 4294967295L) + (var2[var3++] & 0xFF) & 4294967295L;
            var7 = (var7 & 4294967295L) + (var34 & 4294967295L) & 4294967295L;
            long var35 = (var34 & 4294967295L) + (var2[var3++] & 0xFF) & 4294967295L;
            var7 = (var7 & 4294967295L) + (var35 & 4294967295L) & 4294967295L;
            long var36 = (var35 & 4294967295L) + (var2[var3++] & 0xFF) & 4294967295L;
            var7 = (var7 & 4294967295L) + (var36 & 4294967295L) & 4294967295L;
            long var37 = (var36 & 4294967295L) + (var2[var3++] & 0xFF) & 4294967295L;
            var7 = (var7 & 4294967295L) + (var37 & 4294967295L) & 4294967295L;
            long var38 = (var37 & 4294967295L) + (var2[var3++] & 0xFF) & 4294967295L;
            var7 = (var7 & 4294967295L) + (var38 & 4294967295L) & 4294967295L;
            long var39 = (var38 & 4294967295L) + (var2[var3++] & 0xFF) & 4294967295L;
            var7 = (var7 & 4294967295L) + (var39 & 4294967295L) & 4294967295L;
            var5 = (var39 & 4294967295L) + (var2[var3++] & 0xFF) & 4294967295L;
            var7 = (var7 & 4294967295L) + (var5 & 4294967295L) & 4294967295L;
            var9 -= 16;
         }

         if (var9 != 0) {
            do {
               var5 = (var5 & 4294967295L) + (var2[var3++] & 0xFF) & 4294967295L;
               var7 = (var7 & 4294967295L) + (var5 & 4294967295L) & 4294967295L;
            } while (--var9 != 0);
         }

         var5 = (var5 & 4294967295L) % 65521L & 4294967295L;
      }

      return ((var7 & 4294967295L) << 16 | var5) & 4294967295L & 4294967295L;
   }
}
