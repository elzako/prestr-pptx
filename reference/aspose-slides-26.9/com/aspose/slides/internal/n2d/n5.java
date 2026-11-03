package com.aspose.slides.internal.n2d;

public class n5 {
   public static final byte[] n5 = new byte[0];

   public static boolean n5(byte[] var0, byte[] var1) {
      if (var0.length != var1.length) {
         return false;
      }

      for (int var2 = 0; var2 < var0.length; var2++) {
         if ((var0[var2] & 255) != (var1[var2] & 255)) {
            return false;
         }
      }

      return true;
   }

   public static boolean n5(int[] var0, int[] var1) {
      if (var0.length != var1.length) {
         return false;
      }

      for (int var2 = 0; var2 < var0.length; var2++) {
         if (var0[var2] != var1[var2]) {
            return false;
         }
      }

      return true;
   }

   public static int n5(int[] var0, int var1, int var2, int var3) {
      int var4 = var1;
      int var5 = var1 + var2 - 1;

      while (var4 <= var5) {
         int var6 = var4 + var5 >> 1;
         int var7 = var0[var6];
         if (var7 == var3) {
            return var6;
         }

         if (var7 < var3) {
            var4 = var6 + 1;
         } else {
            var5 = var6 - 1;
         }
      }

      return ~var4;
   }

   public static boolean n5(byte[] var0, byte[] var1, int var2) {
      for (int var3 = 0; var3 < var2; var3++) {
         if ((var0[var3] & 255) != (var1[var3] & 255)) {
            return false;
         }
      }

      return true;
   }

   public static int n5(byte[] var0, int var1, int var2, byte[] var3) {
      int var4 = var1 + var2;
      if (var0.length < var4) {
         var4 = var0.length;
      }

      int var5 = var4 - var3.length;

      for (int var6 = var1; var6 <= var5; var6++) {
         int var7 = 0;

         while (var7 < var3.length && var0[var6 + var7] == var3[var7]) {
            var7++;
         }

         if (var7 == var3.length) {
            return var6;
         }
      }

      return -1;
   }
}
