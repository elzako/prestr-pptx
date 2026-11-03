package com.aspose.slides.internal.n8e;

public class y2 {
   public static short n5(byte[] var0, int var1) {
      return (short)u3(var0, var1, 2);
   }

   public static int l6(byte[] var0, int var1) {
      short var2 = (short)u3(var0, var1, 2);
      return var2 >= 0 ? var2 : 65536 + var2;
   }

   public static short n5(byte[] var0) {
      return n5(var0, 0);
   }

   public static int k5(byte[] var0, int var1) {
      return (int)u3(var0, var1, 4);
   }

   public static int l6(byte[] var0) {
      return k5(var0, 0);
   }

   public static long u3(byte[] var0, int var1) {
      return u3(var0, var1, 4);
   }

   public static long k5(byte[] var0) {
      return u3(var0, 0);
   }

   public static long a6(byte[] var0, int var1) {
      return u3(var0, var1, 8);
   }

   public static long u3(byte[] var0) {
      return a6(var0, 0);
   }

   public static void n5(byte[] var0, int var1, short var2) {
      n5(var0, var1, var2, 2);
   }

   public static void n5(byte[] var0, int var1, int var2) {
      n5(var0, var1, var2, 2);
   }

   public static void n5(byte[] var0, short var1) {
      n5(var0, 0, var1);
   }

   public static void l6(byte[] var0, int var1, int var2) {
      n5(var0, var1, var2, 4);
   }

   public static void u9(byte[] var0, int var1) {
      l6(var0, 0, var1);
   }

   public static void n5(byte[] var0, int var1, long var2) {
      n5(var0, var1, var2, 4);
   }

   public static void l6(byte[] var0, int var1, long var2) {
      n5(var0, var1, var2, 8);
   }

   public static void n5(byte[] var0, long var1) {
      l6(var0, 0, var1);
   }

   public static short n5(com.aspose.slides.internal.z0k.t4 var0) {
      return (short)v4.n5(n5(l6(var0, 2)));
   }

   public static int l6(com.aspose.slides.internal.z0k.t4 var0) {
      return l6(l6(var0, 4));
   }

   static void n5(com.aspose.slides.internal.z0k.t4 var0, int var1) {
      byte[] var2 = new byte[4];
      l6(var2, 0, var1);
      var0.write(var2, 0, var2.length);
   }

   public static byte[] l6(com.aspose.slides.internal.z0k.t4 var0, int var1) {
      byte[] var2 = new byte[var1];
      int var3 = var0.read(var2, 0, var2.length);
      if (var3 == -1) {
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var2)), 0, var1);
      } else if (var3 != var1) {
         throw new y2$n5();
      }

      return var2;
   }

   private static long u3(byte[] var0, int var1, int var2) {
      long var3 = 0L;

      for (int var5 = var1 + var2 - 1; var5 >= var1; var5--) {
         var3 <<= 8;
         var3 |= (byte)(0xFF & var0[var5] & 0xFF) & 0xFF;
      }

      return var3;
   }

   private static void n5(byte[] var0, int var1, long var2, int var4) {
      int var5 = var4 + var1;
      long var6 = var2;

      for (int var8 = var1; var8 < var5; var8++) {
         var0[var8] = (byte)(var6 & 255L);
         var6 >>= 8;
      }
   }

   public static byte[] k5(byte[] var0, int var1, int var2) {
      byte[] var3 = new byte[var2];
      System.arraycopy(var0, var1, var3, 0, var2);
      return var3;
   }

   public static double n5(long var0) {
      double var2 = (var0 & 4294967295L & 65535L & 4294967295L) / 65535.0;
      int var4 = (int)((var0 & 4294967295L) >> 16 & 4294967295L & 65535L);
      if ((var4 & 65535 & 32768) != 0) {
         double var5 = (var4 & 65535) - 65536;
         var2 = var5 + var2;
      } else {
         var2 += var4 & 65535;
      }

      return var2;
   }

   public static long n5(double var0) {
      double var2 = com.aspose.slides.ms.System.q1.k5(var0);
      long var7;
      if (var0 < 0.0) {
         short var4 = com.aspose.slides.internal.v6g.k5.l6(var2, 14);
         var7 = (65536 + var4 & 4294967295L) << 16 & 4294967295L;
         var7 = (
               var7
                  | com.aspose.slides.internal.v6g.k5.a6(
                        (1.0 - com.aspose.slides.ms.System.q1.n5(var0) + (com.aspose.slides.ms.System.q1.n5(var2) - 1.0)) * 65536.0, 14
                     )
                     & 4294967295L
                     & 65535L
            )
            & 4294967295L;
      } else {
         var7 = (com.aspose.slides.internal.v6g.k5.a6(var2, 14) & 4294967295L) << 16 & 4294967295L;
         var7 = (var7 | com.aspose.slides.internal.v6g.k5.a6((var0 - var2) * 65536.0, 14) & 4294967295L & 65535L) & 4294967295L;
      }

      return var7;
   }
}
