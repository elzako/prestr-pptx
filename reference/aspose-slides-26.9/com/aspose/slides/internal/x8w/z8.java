package com.aspose.slides.internal.x8w;

public class z8 extends u3 {
   private long[] n5 = new long[4];
   private byte[] a6;
   private long[] u9 = new long[2];
   private long[] h0;
   private byte[] c8;

   public z8() {
      this.a6 = new byte[64];
      this.c8 = new byte[16];
      this.h0 = new long[16];
      this.t2();
   }

   @Override
   public void t2() {
      this.u9[0] = 0L;
      this.u9[1] = 0L;
      this.n5[0] = 1732584193L;
      this.n5[1] = 4023233417L;
      this.n5[2] = 2562383102L;
      this.n5[3] = 271733878L;
      com.aspose.slides.ms.System.u3.n5(this.a6, 0, 64);
      com.aspose.slides.ms.System.u3.n5(this.h0, 0, 16);
   }

   @Override
   protected void l6(byte[] var1, int var2, int var3) {
      int var4 = (int)((this.u9[0] & 4294967295L) >> 3 & 63L);
      this.u9[0] = (this.u9[0] & 4294967295L) + (var3 << 3 & 4294967295L);
      if ((this.u9[0] & 4294967295L) < var3 << 3) {
         this.u9[1]++;
      }

      this.u9[1] = (this.u9[1] & 4294967295L) + (var3 >> 29 & 4294967295L);
      int var5 = 64 - var4;
      int var6 = 0;
      if (var3 >= var5) {
         com.aspose.slides.ms.System.y4.n5(var1, var2, this.a6, var4, var5);
         this.l6(this.n5, this.a6, 0);

         for (var6 = var5; var6 + 63 < var3; var6 += 64) {
            this.l6(this.n5, var1, var2 + var6);
         }

         var4 = 0;
      }

      com.aspose.slides.ms.System.y4.n5(var1, var2 + var6, this.a6, var4, var3 - var6);
   }

   @Override
   protected byte[] c8() {
      byte[] var1 = new byte[8];
      this.n5(var1, this.u9);
      long var2 = (this.u9[0] & 4294967295L) >> 3 & 63L;
      int var4 = (int)((var2 & 4294967295L) < 56L ? 56L - (var2 & 4294967295L) : 120L - (var2 & 4294967295L));
      this.l6(this.n5(var4), 0, var4);
      this.l6(var1, 0, 8);
      this.n5(this.c8, this.n5);
      this.t2();
      return this.c8;
   }

   private byte[] n5(int var1) {
      if (var1 > 0) {
         byte[] var2 = new byte[var1];
         var2[0] = -128;
         return var2;
      } else {
         return null;
      }
   }

   private long n5(long var1, long var3, long var5) {
      return var1 & 4294967295L & var3 & 4294967295L | ~(var1 & 4294967295L) & var5 & 4294967295L;
   }

   private long l6(long var1, long var3, long var5) {
      return var1 & 4294967295L & var3 & 4294967295L | var1 & 4294967295L & var5 & 4294967295L | var3 & 4294967295L & var5 & 4294967295L;
   }

   private long k5(long var1, long var3, long var5) {
      return var1 & 4294967295L ^ var3 & 4294967295L ^ var5 & 4294967295L;
   }

   private long n5(long var1, byte var3) {
      return (var1 & 4294967295L) << (var3 & 255 & 31) & 4294967295L | (var1 & 4294967295L) >> 32 - (var3 & 255);
   }

   private void n5(long[] var1, long var2, long var4, long var6, long var8, byte var10) {
      var1[0] = (var1[0] & 4294967295L) + (this.n5(var2, var4, var6) & 4294967295L) + (var8 & 4294967295L);
      var1[0] = this.n5(var1[0], var10);
   }

   private void l6(long[] var1, long var2, long var4, long var6, long var8, byte var10) {
      var1[0] = (var1[0] & 4294967295L) + (this.l6(var2, var4, var6) & 4294967295L) + (var8 & 4294967295L) + 1518500249L;
      var1[0] = this.n5(var1[0], var10);
   }

   private void k5(long[] var1, long var2, long var4, long var6, long var8, byte var10) {
      var1[0] = (var1[0] & 4294967295L) + (this.k5(var2, var4, var6) & 4294967295L) + (var8 & 4294967295L) + 1859775393L;
      var1[0] = this.n5(var1[0], var10);
   }

   private void n5(byte[] var1, long[] var2) {
      int var3 = 0;

      for (int var4 = 0; var4 < var1.length; var4 += 4) {
         var1[var4] = (byte)(var2[var3] & 4294967295L);
         var1[var4 + 1] = (byte)((var2[var3] & 4294967295L) >> 8);
         var1[var4 + 2] = (byte)((var2[var3] & 4294967295L) >> 16);
         var1[var4 + 3] = (byte)((var2[var3] & 4294967295L) >> 24);
         var3++;
      }
   }

   private void n5(long[] var1, byte[] var2, int var3) {
      int var4 = 0;

      for (int var5 = var3; var4 < var1.length; var5 += 4) {
         var1[var4] = var2[var5] & 0xFF | (var2[var5 + 1] & 255) << 8 | (var2[var5 + 2] & 255) << 16 | (var2[var5 + 3] & 255) << 24;
         var4++;
      }
   }

   private void l6(long[] var1, byte[] var2, int var3) {
      long var4 = var1[0];
      long var6 = var1[1];
      long var8 = var1[2];
      long var10 = var1[3];
      this.n5(this.h0, var2, var3);
      long[] var12 = new long[]{var4};
      this.n5(var12, var6, var8, var10, this.h0[0], (byte)3);
      var4 = var12[0];
      long[] var13 = new long[]{var10};
      this.n5(var13, var4, var6, var8, this.h0[1], (byte)7);
      var10 = var13[0];
      long[] var14 = new long[]{var8};
      this.n5(var14, var10, var4, var6, this.h0[2], (byte)11);
      var8 = var14[0];
      long[] var15 = new long[]{var6};
      this.n5(var15, var8, var10, var4, this.h0[3], (byte)19);
      var6 = var15[0];
      var12[0] = var4;
      this.n5(var12, var6, var8, var10, this.h0[4], (byte)3);
      var4 = var12[0];
      var13[0] = var10;
      this.n5(var13, var4, var6, var8, this.h0[5], (byte)7);
      var10 = var13[0];
      var14[0] = var8;
      this.n5(var14, var10, var4, var6, this.h0[6], (byte)11);
      var8 = var14[0];
      var15[0] = var6;
      this.n5(var15, var8, var10, var4, this.h0[7], (byte)19);
      var6 = var15[0];
      var12[0] = var4;
      this.n5(var12, var6, var8, var10, this.h0[8], (byte)3);
      var4 = var12[0];
      var13[0] = var10;
      this.n5(var13, var4, var6, var8, this.h0[9], (byte)7);
      var10 = var13[0];
      var14[0] = var8;
      this.n5(var14, var10, var4, var6, this.h0[10], (byte)11);
      var8 = var14[0];
      var15[0] = var6;
      this.n5(var15, var8, var10, var4, this.h0[11], (byte)19);
      var6 = var15[0];
      var12[0] = var4;
      this.n5(var12, var6, var8, var10, this.h0[12], (byte)3);
      var4 = var12[0];
      var13[0] = var10;
      this.n5(var13, var4, var6, var8, this.h0[13], (byte)7);
      var10 = var13[0];
      var14[0] = var8;
      this.n5(var14, var10, var4, var6, this.h0[14], (byte)11);
      var8 = var14[0];
      var15[0] = var6;
      this.n5(var15, var8, var10, var4, this.h0[15], (byte)19);
      var6 = var15[0];
      var12[0] = var4;
      this.l6(var12, var6, var8, var10, this.h0[0], (byte)3);
      var4 = var12[0];
      var13[0] = var10;
      this.l6(var13, var4, var6, var8, this.h0[4], (byte)5);
      var10 = var13[0];
      var14[0] = var8;
      this.l6(var14, var10, var4, var6, this.h0[8], (byte)9);
      var8 = var14[0];
      var15[0] = var6;
      this.l6(var15, var8, var10, var4, this.h0[12], (byte)13);
      var6 = var15[0];
      var12[0] = var4;
      this.l6(var12, var6, var8, var10, this.h0[1], (byte)3);
      var4 = var12[0];
      var13[0] = var10;
      this.l6(var13, var4, var6, var8, this.h0[5], (byte)5);
      var10 = var13[0];
      var14[0] = var8;
      this.l6(var14, var10, var4, var6, this.h0[9], (byte)9);
      var8 = var14[0];
      var15[0] = var6;
      this.l6(var15, var8, var10, var4, this.h0[13], (byte)13);
      var6 = var15[0];
      var12[0] = var4;
      this.l6(var12, var6, var8, var10, this.h0[2], (byte)3);
      var4 = var12[0];
      var13[0] = var10;
      this.l6(var13, var4, var6, var8, this.h0[6], (byte)5);
      var10 = var13[0];
      var14[0] = var8;
      this.l6(var14, var10, var4, var6, this.h0[10], (byte)9);
      var8 = var14[0];
      var15[0] = var6;
      this.l6(var15, var8, var10, var4, this.h0[14], (byte)13);
      var6 = var15[0];
      var12[0] = var4;
      this.l6(var12, var6, var8, var10, this.h0[3], (byte)3);
      var4 = var12[0];
      var13[0] = var10;
      this.l6(var13, var4, var6, var8, this.h0[7], (byte)5);
      var10 = var13[0];
      var14[0] = var8;
      this.l6(var14, var10, var4, var6, this.h0[11], (byte)9);
      var8 = var14[0];
      var15[0] = var6;
      this.l6(var15, var8, var10, var4, this.h0[15], (byte)13);
      var6 = var15[0];
      var12[0] = var4;
      this.k5(var12, var6, var8, var10, this.h0[0], (byte)3);
      var4 = var12[0];
      var13[0] = var10;
      this.k5(var13, var4, var6, var8, this.h0[8], (byte)9);
      var10 = var13[0];
      var14[0] = var8;
      this.k5(var14, var10, var4, var6, this.h0[4], (byte)11);
      var8 = var14[0];
      var15[0] = var6;
      this.k5(var15, var8, var10, var4, this.h0[12], (byte)15);
      var6 = var15[0];
      var12[0] = var4;
      this.k5(var12, var6, var8, var10, this.h0[2], (byte)3);
      var4 = var12[0];
      var13[0] = var10;
      this.k5(var13, var4, var6, var8, this.h0[10], (byte)9);
      var10 = var13[0];
      var14[0] = var8;
      this.k5(var14, var10, var4, var6, this.h0[6], (byte)11);
      var8 = var14[0];
      var15[0] = var6;
      this.k5(var15, var8, var10, var4, this.h0[14], (byte)15);
      var6 = var15[0];
      var12[0] = var4;
      this.k5(var12, var6, var8, var10, this.h0[1], (byte)3);
      var4 = var12[0];
      var13[0] = var10;
      this.k5(var13, var4, var6, var8, this.h0[9], (byte)9);
      var10 = var13[0];
      var14[0] = var8;
      this.k5(var14, var10, var4, var6, this.h0[5], (byte)11);
      var8 = var14[0];
      var15[0] = var6;
      this.k5(var15, var8, var10, var4, this.h0[13], (byte)15);
      var6 = var15[0];
      var12[0] = var4;
      this.k5(var12, var6, var8, var10, this.h0[3], (byte)3);
      var4 = var12[0];
      var13[0] = var10;
      this.k5(var13, var4, var6, var8, this.h0[11], (byte)9);
      var10 = var13[0];
      var14[0] = var8;
      this.k5(var14, var10, var4, var6, this.h0[7], (byte)11);
      var8 = var14[0];
      var15[0] = var6;
      this.k5(var15, var8, var10, var4, this.h0[15], (byte)15);
      var6 = var15[0];
      var1[0] = (var1[0] & 4294967295L) + (var4 & 4294967295L);
      var1[1] = (var1[1] & 4294967295L) + (var6 & 4294967295L);
      var1[2] = (var1[2] & 4294967295L) + (var8 & 4294967295L);
      var1[3] = (var1[3] & 4294967295L) + (var10 & 4294967295L);
   }
}
