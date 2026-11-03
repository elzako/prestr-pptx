package com.aspose.slides.internal.l3e;

import com.aspose.slides.exceptions.ArgumentNullException;

public class t2 {
   public static boolean n5(short[] var0, short[][] var1) {
      byte var2 = 8;
      byte var3 = 64;
      var1[0] = null;
      if (var0 == null) {
         throw new ArgumentNullException("data");
      }

      if (var0.length != 64) {
         return false;
      }

      var1[0] = new short[8];

      for (int var4 = 0; var4 < 64; var4++) {
         if ((var4 & 7) == 0) {
            var1[0][var4 >> 3] = var0[var4];
         } else if (var0[var4] != 0) {
            return false;
         }
      }

      return true;
   }

   public static boolean n5(short[] var0, short[] var1) {
      byte var2 = 8;
      if (var0 == null) {
         throw new ArgumentNullException("packedData");
      }

      if (var0.length != 8) {
         return false;
      }

      byte var3 = 64;
      com.aspose.slides.internal.f8y.n5.n5(var1.length == 64);

      for (int var4 = 0; var4 < var0.length; var4++) {
         var1[var4 << 3] = var0[var4];
      }

      return true;
   }

   public static short[] n5(short[] var0) {
      if (var0 == null) {
         throw new ArgumentNullException("data");
      }

      short[] var1 = new short[0];
      if (var0.length < 2) {
         if (var0.length == 1) {
            var1 = new short[]{var0[0]};
         }

         return var1;
      } else {
         int var2 = 0;

         for (int var3 = var0.length - 1; var3 != 0 && var0[var3] == 0; var3--) {
            var2++;
         }

         int var4 = var0.length - var2;
         var1 = new short[var4];
         System.arraycopy(var0, 0, var1, 0, var1.length);
         return var1;
      }
   }

   public static void n5(short[] var0, int var1, short[] var2) {
      if (var0 == null) {
         throw new ArgumentNullException("data");
      }

      if (var0.length > var1) {
         throw new com.aspose.slides.internal.z3b.k5("Data length is greater than unpacked length");
      }

      com.aspose.slides.internal.f8y.n5.n5(var2.length == var1);
      System.arraycopy(var0, 0, var2, 0, var0.length);
   }
}
