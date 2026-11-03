package com.aspose.slides.internal.h3k;

public class u9 {
   private long[] n5 = new long[4];
   private byte[] l6;
   private long[] k5 = new long[2];
   private long[] u3;
   private byte[] a6;

   public u9() {
      this.l6 = new byte[64];
      this.a6 = new byte[16];
      this.u3 = new long[16];
      this.l6();
   }

   public final byte[] n5(byte[] var1) {
      return this.n5(var1, 0, var1.length);
   }

   public final byte[] n5(byte[] var1, int var2, int var3) {
      this.l6(var1, var2, var3);
      return this.n5();
   }

   private void l6() {
      this.k5[0] = 0L;
      this.k5[1] = 0L;
      this.n5[0] = 1732584193L;
      this.n5[1] = 4023233417L;
      this.n5[2] = 2562383102L;
      this.n5[3] = 271733878L;
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.l6)), 0, 64);
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.u3)), 0, 16);
   }

   public final void l6(byte[] var1, int var2, int var3) {
      int var4 = (int)((this.k5[0] & 4294967295L) >> 3 & 4294967295L & 63L);
      this.k5[0] = (this.k5[0] & 4294967295L) + (var3 << 3 & 4294967295L) & 4294967295L;
      if ((this.k5[0] & 4294967295L) < var3 << 3) {
         this.k5[1]++;
      }

      this.k5[1] = (this.k5[1] & 4294967295L) + (var3 >> 29 & 4294967295L) & 4294967295L;
      int var5 = 64 - var4;
      int var6 = 0;
      if (var3 >= var5) {
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), var2, com.aspose.slides.ms.System.u3.n5((Object)(this.l6)), var4, var5);
         this.l6(this.n5, this.l6, 0);

         for (var6 = var5; var6 + 63 < var3; var6 += 64) {
            this.l6(this.n5, var1, var6);
         }

         var4 = 0;
      }

      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), var2 + var6, com.aspose.slides.ms.System.u3.n5((Object)(this.l6)), var4, var3 - var6);
   }

   public final byte[] n5() {
      byte[] var1 = new byte[8];
      n5(var1, this.k5);
      long var2 = (this.k5[0] & 4294967295L) >> 3 & 4294967295L & 63L & 4294967295L;
      int var4 = (int)((var2 & 4294967295L) < 56L ? 56L - (var2 & 4294967295L) & 4294967295L : 120L - (var2 & 4294967295L) & 4294967295L);
      this.l6(n5(var4), 0, var4);
      this.l6(var1, 0, 8);
      n5(this.a6, this.n5);
      this.l6();
      return this.a6;
   }

   private static byte[] n5(int var0) {
      if (var0 > 0) {
         byte[] var1 = new byte[var0];
         var1[0] = -128;
         return var1;
      } else {
         return null;
      }
   }

   private static long n5(long var0, long var2, long var4) {
      return (var0 & var2 | ~(var0 & 4294967295L) & 4294967295L & var4) & 4294967295L & 4294967295L;
   }

   private static long l6(long var0, long var2, long var4) {
      return (var0 & var2 | var0 & var4 | var2 & var4) & 4294967295L & 4294967295L;
   }

   private static long k5(long var0, long var2, long var4) {
      return (var0 ^ var2 ^ var4) & 4294967295L & 4294967295L;
   }

   private static long n5(long var0, byte var2) {
      return ((var0 & 4294967295L) << (var2 & 255 & 31) | (var0 & 4294967295L) >> 32 - (var2 & 255)) & 4294967295L & 4294967295L;
   }

   private static void n5(long[] var0, long var1, long var3, long var5, long var7, byte var9) {
      var0[0] = (var0[0] & 4294967295L) + ((n5(var1, var3, var5) & 4294967295L) + (var7 & 4294967295L) & 4294967295L) & 4294967295L;
      var0[0] = n5(var0[0], var9);
   }

   private static void l6(long[] var0, long var1, long var3, long var5, long var7, byte var9) {
      var0[0] = (var0[0] & 4294967295L) + (((l6(var1, var3, var5) & 4294967295L) + (var7 & 4294967295L) & 4294967295L) + 1518500249L & 4294967295L)
         & 4294967295L;
      var0[0] = n5(var0[0], var9);
   }

   private static void k5(long[] var0, long var1, long var3, long var5, long var7, byte var9) {
      var0[0] = (var0[0] & 4294967295L) + (((k5(var1, var3, var5) & 4294967295L) + (var7 & 4294967295L) & 4294967295L) + 1859775393L & 4294967295L)
         & 4294967295L;
      var0[0] = n5(var0[0], var9);
   }

   private static void n5(byte[] var0, long[] var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < var0.length; var3 += 4) {
         var0[var3] = (byte)var1[var2];
         var0[var3 + 1] = (byte)((var1[var2] & 4294967295L) >> 8 & 4294967295L);
         var0[var3 + 2] = (byte)((var1[var2] & 4294967295L) >> 16 & 4294967295L);
         var0[var3 + 3] = (byte)((var1[var2] & 4294967295L) >> 24 & 4294967295L);
         var2++;
      }
   }

   private static void n5(long[] var0, byte[] var1, int var2) {
      int var3 = 0;

      for (int var4 = var2; var3 < var0.length; var4 += 4) {
         var0[var3] = (var1[var4] & 0xFF | (var1[var4 + 1] & 255) << 8 | (var1[var4 + 2] & 255) << 16 | (var1[var4 + 3] & 255) << 24) & 4294967295L;
         var3++;
      }
   }

   private void l6(long[] var1, byte[] var2, int var3) {
      long var4 = var1[0];
      long var6 = var1[1];
      long var8 = var1[2];
      long var10 = var1[3];
      n5(this.u3, var2, var3);
      long[] var12 = new long[]{var4};
      n5(var12, var6, var8, var10, this.u3[0], (byte)3);
      var4 = var12[0];
      long[] var13 = new long[]{var10};
      n5(var13, var4, var6, var8, this.u3[1], (byte)7);
      var10 = var13[0];
      long[] var14 = new long[]{var8};
      n5(var14, var10, var4, var6, this.u3[2], (byte)11);
      var8 = var14[0];
      long[] var15 = new long[]{var6};
      n5(var15, var8, var10, var4, this.u3[3], (byte)19);
      var6 = var15[0];
      var12[0] = var4;
      n5(var12, var6, var8, var10, this.u3[4], (byte)3);
      var4 = var12[0];
      var13[0] = var10;
      n5(var13, var4, var6, var8, this.u3[5], (byte)7);
      var10 = var13[0];
      var14[0] = var8;
      n5(var14, var10, var4, var6, this.u3[6], (byte)11);
      var8 = var14[0];
      var15[0] = var6;
      n5(var15, var8, var10, var4, this.u3[7], (byte)19);
      var6 = var15[0];
      var12[0] = var4;
      n5(var12, var6, var8, var10, this.u3[8], (byte)3);
      var4 = var12[0];
      var13[0] = var10;
      n5(var13, var4, var6, var8, this.u3[9], (byte)7);
      var10 = var13[0];
      var14[0] = var8;
      n5(var14, var10, var4, var6, this.u3[10], (byte)11);
      var8 = var14[0];
      var15[0] = var6;
      n5(var15, var8, var10, var4, this.u3[11], (byte)19);
      var6 = var15[0];
      var12[0] = var4;
      n5(var12, var6, var8, var10, this.u3[12], (byte)3);
      var4 = var12[0];
      var13[0] = var10;
      n5(var13, var4, var6, var8, this.u3[13], (byte)7);
      var10 = var13[0];
      var14[0] = var8;
      n5(var14, var10, var4, var6, this.u3[14], (byte)11);
      var8 = var14[0];
      var15[0] = var6;
      n5(var15, var8, var10, var4, this.u3[15], (byte)19);
      var6 = var15[0];
      var12[0] = var4;
      l6(var12, var6, var8, var10, this.u3[0], (byte)3);
      var4 = var12[0];
      var13[0] = var10;
      l6(var13, var4, var6, var8, this.u3[4], (byte)5);
      var10 = var13[0];
      var14[0] = var8;
      l6(var14, var10, var4, var6, this.u3[8], (byte)9);
      var8 = var14[0];
      var15[0] = var6;
      l6(var15, var8, var10, var4, this.u3[12], (byte)13);
      var6 = var15[0];
      var12[0] = var4;
      l6(var12, var6, var8, var10, this.u3[1], (byte)3);
      var4 = var12[0];
      var13[0] = var10;
      l6(var13, var4, var6, var8, this.u3[5], (byte)5);
      var10 = var13[0];
      var14[0] = var8;
      l6(var14, var10, var4, var6, this.u3[9], (byte)9);
      var8 = var14[0];
      var15[0] = var6;
      l6(var15, var8, var10, var4, this.u3[13], (byte)13);
      var6 = var15[0];
      var12[0] = var4;
      l6(var12, var6, var8, var10, this.u3[2], (byte)3);
      var4 = var12[0];
      var13[0] = var10;
      l6(var13, var4, var6, var8, this.u3[6], (byte)5);
      var10 = var13[0];
      var14[0] = var8;
      l6(var14, var10, var4, var6, this.u3[10], (byte)9);
      var8 = var14[0];
      var15[0] = var6;
      l6(var15, var8, var10, var4, this.u3[14], (byte)13);
      var6 = var15[0];
      var12[0] = var4;
      l6(var12, var6, var8, var10, this.u3[3], (byte)3);
      var4 = var12[0];
      var13[0] = var10;
      l6(var13, var4, var6, var8, this.u3[7], (byte)5);
      var10 = var13[0];
      var14[0] = var8;
      l6(var14, var10, var4, var6, this.u3[11], (byte)9);
      var8 = var14[0];
      var15[0] = var6;
      l6(var15, var8, var10, var4, this.u3[15], (byte)13);
      var6 = var15[0];
      var12[0] = var4;
      k5(var12, var6, var8, var10, this.u3[0], (byte)3);
      var4 = var12[0];
      var13[0] = var10;
      k5(var13, var4, var6, var8, this.u3[8], (byte)9);
      var10 = var13[0];
      var14[0] = var8;
      k5(var14, var10, var4, var6, this.u3[4], (byte)11);
      var8 = var14[0];
      var15[0] = var6;
      k5(var15, var8, var10, var4, this.u3[12], (byte)15);
      var6 = var15[0];
      var12[0] = var4;
      k5(var12, var6, var8, var10, this.u3[2], (byte)3);
      var4 = var12[0];
      var13[0] = var10;
      k5(var13, var4, var6, var8, this.u3[10], (byte)9);
      var10 = var13[0];
      var14[0] = var8;
      k5(var14, var10, var4, var6, this.u3[6], (byte)11);
      var8 = var14[0];
      var15[0] = var6;
      k5(var15, var8, var10, var4, this.u3[14], (byte)15);
      var6 = var15[0];
      var12[0] = var4;
      k5(var12, var6, var8, var10, this.u3[1], (byte)3);
      var4 = var12[0];
      var13[0] = var10;
      k5(var13, var4, var6, var8, this.u3[9], (byte)9);
      var10 = var13[0];
      var14[0] = var8;
      k5(var14, var10, var4, var6, this.u3[5], (byte)11);
      var8 = var14[0];
      var15[0] = var6;
      k5(var15, var8, var10, var4, this.u3[13], (byte)15);
      var6 = var15[0];
      var12[0] = var4;
      k5(var12, var6, var8, var10, this.u3[3], (byte)3);
      var4 = var12[0];
      var13[0] = var10;
      k5(var13, var4, var6, var8, this.u3[11], (byte)9);
      var10 = var13[0];
      var14[0] = var8;
      k5(var14, var10, var4, var6, this.u3[7], (byte)11);
      var8 = var14[0];
      var15[0] = var6;
      k5(var15, var8, var10, var4, this.u3[15], (byte)15);
      var6 = var15[0];
      var1[0] = (var1[0] & 4294967295L) + (var4 & 4294967295L) & 4294967295L;
      var1[1] = (var1[1] & 4294967295L) + (var6 & 4294967295L) & 4294967295L;
      var1[2] = (var1[2] & 4294967295L) + (var8 & 4294967295L) & 4294967295L;
      var1[3] = (var1[3] & 4294967295L) + (var10 & 4294967295L) & 4294967295L;
   }
}
