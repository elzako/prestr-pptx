package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;

public abstract class z1 extends u8 {
   static byte[][] n5 = new byte[][]{
      {1, 1, 1, 1, 1, 1, 1, 1}, {31, 31, 31, 31, 15, 15, 15, 15}, {-31, -31, -31, -31, -15, -15, -15, -15}, {-1, -1, -1, -1, -1, -1, -1, -1}
   };
   static byte[][] l6 = new byte[][]{
      {0, 30, 0, 30, 0, 14, 0, 14},
      {0, -32, 0, -32, 0, -16, 0, -16},
      {0, -2, 0, -2, 0, -2, 0, -2},
      {30, 0, 30, 0, 14, 0, 14, 0},
      {30, -32, 30, -32, 14, -16, 14, -16},
      {30, -2, 30, -2, 14, -2, 14, -2},
      {-32, 0, -32, 0, -16, 0, -16, 0},
      {-32, 30, -32, 30, -16, 14, -16, 14},
      {-32, -2, -32, -2, -16, -2, -16, -2},
      {-2, 0, -2, 0, -2, 0, -2, 0},
      {-2, 30, -2, 30, -2, 14, -2, 14},
      {-2, -32, -2, -32, -2, -16, -2, -16}
   };

   protected z1() {
      this.a6 = 64;
      this.k5 = 64;
      this.t2 = 8;
      this.c8 = new e5[1];
      this.c8[0] = new e5(64, 64, 0);
      this.h0 = new e5[1];
      this.h0[0] = new e5(64, 64, 0);
   }

   public static z1 k5() {
      return n5(t4.class.getName());
   }

   public static z1 n5(String var0) {
      return (z1)y4.n5(var0);
   }

   public static boolean n5(byte[] var0) {
      if (var0 == null) {
         throw new CryptographicException(com.aspose.slides.internal.x8w.z3.n5("Null Key"));
      }

      if (var0.length != 8) {
         throw new CryptographicException(com.aspose.slides.internal.x8w.z3.n5("Wrong Key Length"));
      }

      for (int var1 = 0; var1 < var0.length; var1++) {
         switch (var0[var1] & 0xFF | 17) {
            case 17:
            case 31:
            case 241:
            case 255:
            default:
               return false;
         }
      }

      for (int var3 = 0; var3 < n5.length; var3++) {
         int var2 = 0;

         while (var2 < var0.length && (var0[var2] & 255 ^ n5[var3][var2] & 255) <= 1) {
            var2++;
         }

         if (var2 == 8) {
            return true;
         }
      }

      return false;
   }

   public static boolean l6(byte[] var0) {
      if (var0 == null) {
         throw new CryptographicException(com.aspose.slides.internal.x8w.z3.n5("Null Key"));
      }

      if (var0.length != 8) {
         throw new CryptographicException(com.aspose.slides.internal.x8w.z3.n5("Wrong Key Length"));
      }

      for (int var1 = 0; var1 < var0.length; var1++) {
         switch (var0[var1] & 0xFF | 17) {
            case 17:
            case 31:
            case 241:
            case 255:
            default:
               return false;
         }
      }

      for (int var3 = 0; var3 < l6.length; var3++) {
         int var2 = 0;

         while (var2 < var0.length && (var0[var2] & 255 ^ l6[var3][var2] & 255) <= 1) {
            var2++;
         }

         if (var2 == 8) {
            return true;
         }
      }

      return false;
   }

   @Override
   public byte[] u3() {
      if (this.u9 == null) {
         this.n5();
      }

      return (byte[])this.u9.clone();
   }

   @Override
   public void k5(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("Key");
      }

      if (var1.length != 8) {
         throw new ArgumentException(com.aspose.slides.internal.x8w.z3.n5("Wrong Key Length"));
      }

      if (n5(var1)) {
         throw new CryptographicException(com.aspose.slides.internal.x8w.z3.n5("Weak Key"));
      }

      if (l6(var1)) {
         throw new CryptographicException(com.aspose.slides.internal.x8w.z3.n5("Semi Weak Key"));
      }

      this.u9 = (byte[])var1.clone();
   }
}
