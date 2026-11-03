package com.aspose.slides.internal.r1x;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class h0 {
   public static void n5(int var0, byte[] var1, int var2) {
      var1[var2] = (byte)(var0 >> 24 & 0xFF);
      var1[var2 + 1] = (byte)(var0 >> 16 & 0xFF);
      var1[var2 + 2] = (byte)(var0 >> 8 & 0xFF);
      var1[var2 + 3] = (byte)var0;
   }

   public static void n5(long var0, byte[] var2, int var3) {
      var2[var3] = (byte)((var0 & 4294967295L) >> 24 & 4294967295L & 255L & 4294967295L);
      var2[var3 + 1] = (byte)((var0 & 4294967295L) >> 16 & 4294967295L & 255L & 4294967295L);
      var2[var3 + 2] = (byte)((var0 & 4294967295L) >> 8 & 4294967295L & 255L & 4294967295L);
      var2[var3 + 3] = (byte)var0;
   }

   public static void n5(float var0, byte[] var1, int var2) {
      byte[] var3 = com.aspose.slides.ms.System.x8.n5(var0);
      var1[var2] = var3[3];
      var1[var2 + 1] = var3[2];
      var1[var2 + 2] = var3[1];
      var1[var2 + 3] = var3[0];
   }

   public static void n5(double var0, byte[] var2, int var3) {
      byte[] var4 = com.aspose.slides.ms.System.x8.n5(var0);
      var2[var3 + 0] = var4[7];
      var2[var3 + 1] = var4[6];
      var2[var3 + 2] = var4[5];
      var2[var3 + 3] = var4[4];
      var2[var3 + 4] = var4[3];
      var2[var3 + 5] = var4[2];
      var2[var3 + 6] = var4[1];
      var2[var3 + 7] = var4[0];
   }

   public static void n5(short var0, byte[] var1, int var2) {
      var1[var2] = (byte)(var0 >> 8);
      var1[var2 + 1] = (byte)var0;
   }

   public static void l6(int var0, byte[] var1, int var2) {
      var1[var2] = (byte)((var0 & 65535) >> 8);
      var1[var2 + 1] = (byte)var0;
   }

   public static int n5(byte[] var0, int var1) {
      if (var0 == null) {
         throw new ArgumentNullException("bytes");
      } else if (var1 >= 0 && var1 + 4 <= var0.length) {
         return (var0[var1] & 0xFF) << 24 | (var0[var1 + 1] & 0xFF) << 16 | (var0[var1 + 2] & 0xFF) << 8 | var0[var1 + 3] & 0xFF;
      } else {
         throw new ArgumentOutOfRangeException("index", "The index falls outside the bytes array.");
      }
   }

   public static float l6(byte[] var0, int var1) {
      if (var0 == null) {
         throw new ArgumentNullException("bytes");
      } else if (var1 >= 0 && var1 + 4 <= var0.length) {
         byte[] var2 = new byte[]{var0[var1 + 3], var0[var1 + 2], var0[var1 + 1], var0[var1 + 0]};
         return com.aspose.slides.ms.System.x8.c8(var2, 0);
      } else {
         throw new ArgumentOutOfRangeException("index", "The index falls outside the bytes array.");
      }
   }

   public static double k5(byte[] var0, int var1) {
      if (var0 == null) {
         throw new ArgumentNullException("bytes");
      } else if (var1 >= 0 && var1 + 4 <= var0.length) {
         byte[] var2 = new byte[]{
            var0[var1 + 7], var0[var1 + 6], var0[var1 + 5], var0[var1 + 4], var0[var1 + 3], var0[var1 + 2], var0[var1 + 1], var0[var1 + 0]
         };
         return com.aspose.slides.ms.System.x8.t2(var2, 0);
      } else {
         throw new ArgumentOutOfRangeException("index", "The index falls outside the bytes array.");
      }
   }

   public static short u3(byte[] var0, int var1) {
      if (var0 == null) {
         throw new ArgumentNullException("bytes");
      } else if (var1 >= 0 && var1 + 2 <= var0.length) {
         return (short)((var0[var1] & 255) << 8 | var0[var1 + 1] & 0xFF);
      } else {
         throw new ArgumentOutOfRangeException("index", "The index falls outside the bytes array.");
      }
   }
}
