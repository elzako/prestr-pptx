package com.aspose.slides.internal.o8m;

public class y0 extends x9 {
   private byte[] n5;
   private long[] a6 = new long[16];
   private long[] u9 = new long[5];
   private long h0;
   private int c8;

   public y0() {
      this.n5 = new byte[64];
      this.t2();
   }

   @Override
   public void t2() {
      this.u9[0] = 1732584193L;
      this.u9[1] = 4023233417L;
      this.u9[2] = 2562383102L;
      this.u9[3] = 271733878L;
      this.u9[4] = 3285377520L;
      this.h0 = 0L;
      this.c8 = 0;
      com.aspose.slides.ms.System.u3.n5(this.a6, 0, this.a6.length);
      com.aspose.slides.ms.System.u3.n5(this.n5, 0, this.n5.length);
   }

   @Override
   protected void l6(byte[] var1, int var2, int var3) {
      this.u3 = 1;
      this.h0 += var3 & 4294967295L;
      if (this.c8 != 0) {
         if (var3 < 64 - this.c8) {
            com.aspose.slides.ms.System.y4.n5(var1, var2, this.n5, this.c8, var3);
            this.c8 += var3;
            return;
         }

         int var4 = 64 - this.c8;
         com.aspose.slides.ms.System.y4.n5(var1, var2, this.n5, this.c8, var4);
         this.n5(this.n5, 0);
         this.c8 = 0;
         var2 += var4;
         var3 -= var4;
      }

      for (int var5 = 0; var5 < var3 - var3 % 64; var5 += 64) {
         this.n5(var1, var2 + var5);
      }

      if (var3 % 64 != 0) {
         com.aspose.slides.ms.System.y4.n5(var1, var3 - var3 % 64 + var2, this.n5, 0, var3 % 64);
         this.c8 = var3 % 64;
      }
   }

   @Override
   protected byte[] c8() {
      this.n5(this.h0);
      byte[] var1 = new byte[20];
      int[] var2 = new int[this.u9.length];
      int var3 = 0;

      for (int var4 = this.u9.length; var3 < var4; var3++) {
         var2[var3] = (int)this.u9[var3];
      }

      com.aspose.slides.ms.System.y4.n5(var2, 0, var1, 0, 20);
      return var1;
   }

   private void n5(byte[] var1, int var2) {
      for (int var3 = 0; var3 < this.a6.length; var3++) {
         this.a6[var3] = var1[var2] & 0xFF & 4294967295L
            | (long)(var1[var2 + 1] & 0xFF) << 8 & 4294967295L
            | (long)(var1[var2 + 2] & 0xFF) << 16 & 4294967295L
            | (long)(var1[var2 + 3] & 0xFF) << 24 & 4294967295L;
         var2 += 4;
      }

      this.a6();
   }

   private void a6() {
      long var1 = this.u9[0];
      long var3 = this.u9[1];
      long var5 = this.u9[2];
      long var7 = this.u9[3];
      long var9 = this.u9[4];
      long var11 = this.u9[0];
      long var13 = this.u9[1];
      long var15 = this.u9[2];
      long var17 = this.u9[3];
      long var19 = this.u9[4];
      long[] var21 = new long[]{var1};
      long[] var22 = new long[]{var5};
      this.n5(var21, var3, var22, var7, var9, this.a6[0], 11);
      var1 = var21[0];
      var5 = var22[0];
      long[] var23 = new long[]{var9};
      long[] var24 = new long[]{var3};
      this.n5(var23, var1, var24, var5, var7, this.a6[1], 14);
      var9 = var23[0];
      var3 = var24[0];
      long[] var25 = new long[]{var7};
      var21[0] = var1;
      this.n5(var25, var9, var21, var3, var5, this.a6[2], 15);
      var7 = var25[0];
      var1 = var21[0];
      var22[0] = var5;
      var23[0] = var9;
      this.n5(var22, var7, var23, var1, var3, this.a6[3], 12);
      var5 = var22[0];
      var9 = var23[0];
      var24[0] = var3;
      var25[0] = var7;
      this.n5(var24, var5, var25, var9, var1, this.a6[4], 5);
      var3 = var24[0];
      var7 = var25[0];
      var21[0] = var1;
      var22[0] = var5;
      this.n5(var21, var3, var22, var7, var9, this.a6[5], 8);
      var1 = var21[0];
      var5 = var22[0];
      var23[0] = var9;
      var24[0] = var3;
      this.n5(var23, var1, var24, var5, var7, this.a6[6], 7);
      var9 = var23[0];
      var3 = var24[0];
      var25[0] = var7;
      var21[0] = var1;
      this.n5(var25, var9, var21, var3, var5, this.a6[7], 9);
      var7 = var25[0];
      var1 = var21[0];
      var22[0] = var5;
      var23[0] = var9;
      this.n5(var22, var7, var23, var1, var3, this.a6[8], 11);
      var5 = var22[0];
      var9 = var23[0];
      var24[0] = var3;
      var25[0] = var7;
      this.n5(var24, var5, var25, var9, var1, this.a6[9], 13);
      var3 = var24[0];
      var7 = var25[0];
      var21[0] = var1;
      var22[0] = var5;
      this.n5(var21, var3, var22, var7, var9, this.a6[10], 14);
      var1 = var21[0];
      var5 = var22[0];
      var23[0] = var9;
      var24[0] = var3;
      this.n5(var23, var1, var24, var5, var7, this.a6[11], 15);
      var9 = var23[0];
      var3 = var24[0];
      var25[0] = var7;
      var21[0] = var1;
      this.n5(var25, var9, var21, var3, var5, this.a6[12], 6);
      var7 = var25[0];
      var1 = var21[0];
      var22[0] = var5;
      var23[0] = var9;
      this.n5(var22, var7, var23, var1, var3, this.a6[13], 7);
      var5 = var22[0];
      var9 = var23[0];
      var24[0] = var3;
      var25[0] = var7;
      this.n5(var24, var5, var25, var9, var1, this.a6[14], 9);
      var3 = var24[0];
      var7 = var25[0];
      var21[0] = var1;
      var22[0] = var5;
      this.n5(var21, var3, var22, var7, var9, this.a6[15], 8);
      var1 = var21[0];
      var5 = var22[0];
      var23[0] = var9;
      var24[0] = var3;
      this.l6(var23, var1, var24, var5, var7, this.a6[7], 7);
      var9 = var23[0];
      var3 = var24[0];
      var25[0] = var7;
      var21[0] = var1;
      this.l6(var25, var9, var21, var3, var5, this.a6[4], 6);
      var7 = var25[0];
      var1 = var21[0];
      var22[0] = var5;
      var23[0] = var9;
      this.l6(var22, var7, var23, var1, var3, this.a6[13], 8);
      var5 = var22[0];
      var9 = var23[0];
      var24[0] = var3;
      var25[0] = var7;
      this.l6(var24, var5, var25, var9, var1, this.a6[1], 13);
      var3 = var24[0];
      var7 = var25[0];
      var21[0] = var1;
      var22[0] = var5;
      this.l6(var21, var3, var22, var7, var9, this.a6[10], 11);
      var1 = var21[0];
      var5 = var22[0];
      var23[0] = var9;
      var24[0] = var3;
      this.l6(var23, var1, var24, var5, var7, this.a6[6], 9);
      var9 = var23[0];
      var3 = var24[0];
      var25[0] = var7;
      var21[0] = var1;
      this.l6(var25, var9, var21, var3, var5, this.a6[15], 7);
      var7 = var25[0];
      var1 = var21[0];
      var22[0] = var5;
      var23[0] = var9;
      this.l6(var22, var7, var23, var1, var3, this.a6[3], 15);
      var5 = var22[0];
      var9 = var23[0];
      var24[0] = var3;
      var25[0] = var7;
      this.l6(var24, var5, var25, var9, var1, this.a6[12], 7);
      var3 = var24[0];
      var7 = var25[0];
      var21[0] = var1;
      var22[0] = var5;
      this.l6(var21, var3, var22, var7, var9, this.a6[0], 12);
      var1 = var21[0];
      var5 = var22[0];
      var23[0] = var9;
      var24[0] = var3;
      this.l6(var23, var1, var24, var5, var7, this.a6[9], 15);
      var9 = var23[0];
      var3 = var24[0];
      var25[0] = var7;
      var21[0] = var1;
      this.l6(var25, var9, var21, var3, var5, this.a6[5], 9);
      var7 = var25[0];
      var1 = var21[0];
      var22[0] = var5;
      var23[0] = var9;
      this.l6(var22, var7, var23, var1, var3, this.a6[2], 11);
      var5 = var22[0];
      var9 = var23[0];
      var24[0] = var3;
      var25[0] = var7;
      this.l6(var24, var5, var25, var9, var1, this.a6[14], 7);
      var3 = var24[0];
      var7 = var25[0];
      var21[0] = var1;
      var22[0] = var5;
      this.l6(var21, var3, var22, var7, var9, this.a6[11], 13);
      var1 = var21[0];
      var5 = var22[0];
      var23[0] = var9;
      var24[0] = var3;
      this.l6(var23, var1, var24, var5, var7, this.a6[8], 12);
      var9 = var23[0];
      var3 = var24[0];
      var25[0] = var7;
      var21[0] = var1;
      this.k5(var25, var9, var21, var3, var5, this.a6[3], 11);
      var7 = var25[0];
      var1 = var21[0];
      var22[0] = var5;
      var23[0] = var9;
      this.k5(var22, var7, var23, var1, var3, this.a6[10], 13);
      var5 = var22[0];
      var9 = var23[0];
      var24[0] = var3;
      var25[0] = var7;
      this.k5(var24, var5, var25, var9, var1, this.a6[14], 6);
      var3 = var24[0];
      var7 = var25[0];
      var21[0] = var1;
      var22[0] = var5;
      this.k5(var21, var3, var22, var7, var9, this.a6[4], 7);
      var1 = var21[0];
      var5 = var22[0];
      var23[0] = var9;
      var24[0] = var3;
      this.k5(var23, var1, var24, var5, var7, this.a6[9], 14);
      var9 = var23[0];
      var3 = var24[0];
      var25[0] = var7;
      var21[0] = var1;
      this.k5(var25, var9, var21, var3, var5, this.a6[15], 9);
      var7 = var25[0];
      var1 = var21[0];
      var22[0] = var5;
      var23[0] = var9;
      this.k5(var22, var7, var23, var1, var3, this.a6[8], 13);
      var5 = var22[0];
      var9 = var23[0];
      var24[0] = var3;
      var25[0] = var7;
      this.k5(var24, var5, var25, var9, var1, this.a6[1], 15);
      var3 = var24[0];
      var7 = var25[0];
      var21[0] = var1;
      var22[0] = var5;
      this.k5(var21, var3, var22, var7, var9, this.a6[2], 14);
      var1 = var21[0];
      var5 = var22[0];
      var23[0] = var9;
      var24[0] = var3;
      this.k5(var23, var1, var24, var5, var7, this.a6[7], 8);
      var9 = var23[0];
      var3 = var24[0];
      var25[0] = var7;
      var21[0] = var1;
      this.k5(var25, var9, var21, var3, var5, this.a6[0], 13);
      var7 = var25[0];
      var1 = var21[0];
      var22[0] = var5;
      var23[0] = var9;
      this.k5(var22, var7, var23, var1, var3, this.a6[6], 6);
      var5 = var22[0];
      var9 = var23[0];
      var24[0] = var3;
      var25[0] = var7;
      this.k5(var24, var5, var25, var9, var1, this.a6[13], 5);
      var3 = var24[0];
      var7 = var25[0];
      var21[0] = var1;
      var22[0] = var5;
      this.k5(var21, var3, var22, var7, var9, this.a6[11], 12);
      var1 = var21[0];
      var5 = var22[0];
      var23[0] = var9;
      var24[0] = var3;
      this.k5(var23, var1, var24, var5, var7, this.a6[5], 7);
      var9 = var23[0];
      var3 = var24[0];
      var25[0] = var7;
      var21[0] = var1;
      this.k5(var25, var9, var21, var3, var5, this.a6[12], 5);
      var7 = var25[0];
      var1 = var21[0];
      var22[0] = var5;
      var23[0] = var9;
      this.u3(var22, var7, var23, var1, var3, this.a6[1], 11);
      var5 = var22[0];
      var9 = var23[0];
      var24[0] = var3;
      var25[0] = var7;
      this.u3(var24, var5, var25, var9, var1, this.a6[9], 12);
      var3 = var24[0];
      var7 = var25[0];
      var21[0] = var1;
      var22[0] = var5;
      this.u3(var21, var3, var22, var7, var9, this.a6[11], 14);
      var1 = var21[0];
      var5 = var22[0];
      var23[0] = var9;
      var24[0] = var3;
      this.u3(var23, var1, var24, var5, var7, this.a6[10], 15);
      var9 = var23[0];
      var3 = var24[0];
      var25[0] = var7;
      var21[0] = var1;
      this.u3(var25, var9, var21, var3, var5, this.a6[0], 14);
      var7 = var25[0];
      var1 = var21[0];
      var22[0] = var5;
      var23[0] = var9;
      this.u3(var22, var7, var23, var1, var3, this.a6[8], 15);
      var5 = var22[0];
      var9 = var23[0];
      var24[0] = var3;
      var25[0] = var7;
      this.u3(var24, var5, var25, var9, var1, this.a6[12], 9);
      var3 = var24[0];
      var7 = var25[0];
      var21[0] = var1;
      var22[0] = var5;
      this.u3(var21, var3, var22, var7, var9, this.a6[4], 8);
      var1 = var21[0];
      var5 = var22[0];
      var23[0] = var9;
      var24[0] = var3;
      this.u3(var23, var1, var24, var5, var7, this.a6[13], 9);
      var9 = var23[0];
      var3 = var24[0];
      var25[0] = var7;
      var21[0] = var1;
      this.u3(var25, var9, var21, var3, var5, this.a6[3], 14);
      var7 = var25[0];
      var1 = var21[0];
      var22[0] = var5;
      var23[0] = var9;
      this.u3(var22, var7, var23, var1, var3, this.a6[7], 5);
      var5 = var22[0];
      var9 = var23[0];
      var24[0] = var3;
      var25[0] = var7;
      this.u3(var24, var5, var25, var9, var1, this.a6[15], 6);
      var3 = var24[0];
      var7 = var25[0];
      var21[0] = var1;
      var22[0] = var5;
      this.u3(var21, var3, var22, var7, var9, this.a6[14], 8);
      var1 = var21[0];
      var5 = var22[0];
      var23[0] = var9;
      var24[0] = var3;
      this.u3(var23, var1, var24, var5, var7, this.a6[5], 6);
      var9 = var23[0];
      var3 = var24[0];
      var25[0] = var7;
      var21[0] = var1;
      this.u3(var25, var9, var21, var3, var5, this.a6[6], 5);
      var7 = var25[0];
      var1 = var21[0];
      var22[0] = var5;
      var23[0] = var9;
      this.u3(var22, var7, var23, var1, var3, this.a6[2], 12);
      var5 = var22[0];
      var9 = var23[0];
      var24[0] = var3;
      var25[0] = var7;
      this.a6(var24, var5, var25, var9, var1, this.a6[4], 9);
      var3 = var24[0];
      var7 = var25[0];
      var21[0] = var1;
      var22[0] = var5;
      this.a6(var21, var3, var22, var7, var9, this.a6[0], 15);
      var1 = var21[0];
      var5 = var22[0];
      var23[0] = var9;
      var24[0] = var3;
      this.a6(var23, var1, var24, var5, var7, this.a6[5], 5);
      var9 = var23[0];
      var3 = var24[0];
      var25[0] = var7;
      var21[0] = var1;
      this.a6(var25, var9, var21, var3, var5, this.a6[9], 11);
      var7 = var25[0];
      var1 = var21[0];
      var22[0] = var5;
      var23[0] = var9;
      this.a6(var22, var7, var23, var1, var3, this.a6[7], 6);
      var5 = var22[0];
      var9 = var23[0];
      var24[0] = var3;
      var25[0] = var7;
      this.a6(var24, var5, var25, var9, var1, this.a6[12], 8);
      var3 = var24[0];
      var7 = var25[0];
      var21[0] = var1;
      var22[0] = var5;
      this.a6(var21, var3, var22, var7, var9, this.a6[2], 13);
      var1 = var21[0];
      var5 = var22[0];
      var23[0] = var9;
      var24[0] = var3;
      this.a6(var23, var1, var24, var5, var7, this.a6[10], 12);
      var9 = var23[0];
      var3 = var24[0];
      var25[0] = var7;
      var21[0] = var1;
      this.a6(var25, var9, var21, var3, var5, this.a6[14], 5);
      var7 = var25[0];
      var1 = var21[0];
      var22[0] = var5;
      var23[0] = var9;
      this.a6(var22, var7, var23, var1, var3, this.a6[1], 12);
      var5 = var22[0];
      var9 = var23[0];
      var24[0] = var3;
      var25[0] = var7;
      this.a6(var24, var5, var25, var9, var1, this.a6[3], 13);
      var3 = var24[0];
      var7 = var25[0];
      var21[0] = var1;
      var22[0] = var5;
      this.a6(var21, var3, var22, var7, var9, this.a6[8], 14);
      var1 = var21[0];
      var5 = var22[0];
      var23[0] = var9;
      var24[0] = var3;
      this.a6(var23, var1, var24, var5, var7, this.a6[11], 11);
      var9 = var23[0];
      var3 = var24[0];
      var25[0] = var7;
      var21[0] = var1;
      this.a6(var25, var9, var21, var3, var5, this.a6[6], 8);
      var7 = var25[0];
      var1 = var21[0];
      var22[0] = var5;
      var23[0] = var9;
      this.a6(var22, var7, var23, var1, var3, this.a6[15], 5);
      var5 = var22[0];
      var9 = var23[0];
      var24[0] = var3;
      var25[0] = var7;
      this.a6(var24, var5, var25, var9, var1, this.a6[13], 6);
      var3 = var24[0];
      var7 = var25[0];
      long[] var26 = new long[]{var11};
      long[] var27 = new long[]{var15};
      this.s7(var26, var13, var27, var17, var19, this.a6[5], 8);
      var11 = var26[0];
      var15 = var27[0];
      long[] var28 = new long[]{var19};
      long[] var29 = new long[]{var13};
      this.s7(var28, var11, var29, var15, var17, this.a6[14], 9);
      var19 = var28[0];
      var13 = var29[0];
      long[] var30 = new long[]{var17};
      var26[0] = var11;
      this.s7(var30, var19, var26, var13, var15, this.a6[7], 9);
      var17 = var30[0];
      var11 = var26[0];
      var27[0] = var15;
      var28[0] = var19;
      this.s7(var27, var17, var28, var11, var13, this.a6[0], 11);
      var15 = var27[0];
      var19 = var28[0];
      var29[0] = var13;
      var30[0] = var17;
      this.s7(var29, var15, var30, var19, var11, this.a6[9], 13);
      var13 = var29[0];
      var17 = var30[0];
      var26[0] = var11;
      var27[0] = var15;
      this.s7(var26, var13, var27, var17, var19, this.a6[2], 15);
      var11 = var26[0];
      var15 = var27[0];
      var28[0] = var19;
      var29[0] = var13;
      this.s7(var28, var11, var29, var15, var17, this.a6[11], 15);
      var19 = var28[0];
      var13 = var29[0];
      var30[0] = var17;
      var26[0] = var11;
      this.s7(var30, var19, var26, var13, var15, this.a6[4], 5);
      var17 = var30[0];
      var11 = var26[0];
      var27[0] = var15;
      var28[0] = var19;
      this.s7(var27, var17, var28, var11, var13, this.a6[13], 7);
      var15 = var27[0];
      var19 = var28[0];
      var29[0] = var13;
      var30[0] = var17;
      this.s7(var29, var15, var30, var19, var11, this.a6[6], 7);
      var13 = var29[0];
      var17 = var30[0];
      var26[0] = var11;
      var27[0] = var15;
      this.s7(var26, var13, var27, var17, var19, this.a6[15], 8);
      var11 = var26[0];
      var15 = var27[0];
      var28[0] = var19;
      var29[0] = var13;
      this.s7(var28, var11, var29, var15, var17, this.a6[8], 11);
      var19 = var28[0];
      var13 = var29[0];
      var30[0] = var17;
      var26[0] = var11;
      this.s7(var30, var19, var26, var13, var15, this.a6[1], 14);
      var17 = var30[0];
      var11 = var26[0];
      var27[0] = var15;
      var28[0] = var19;
      this.s7(var27, var17, var28, var11, var13, this.a6[10], 14);
      var15 = var27[0];
      var19 = var28[0];
      var29[0] = var13;
      var30[0] = var17;
      this.s7(var29, var15, var30, var19, var11, this.a6[3], 12);
      var13 = var29[0];
      var17 = var30[0];
      var26[0] = var11;
      var27[0] = var15;
      this.s7(var26, var13, var27, var17, var19, this.a6[12], 6);
      var11 = var26[0];
      var15 = var27[0];
      var28[0] = var19;
      var29[0] = var13;
      this.t2(var28, var11, var29, var15, var17, this.a6[6], 9);
      var19 = var28[0];
      var13 = var29[0];
      var30[0] = var17;
      var26[0] = var11;
      this.t2(var30, var19, var26, var13, var15, this.a6[11], 13);
      var17 = var30[0];
      var11 = var26[0];
      var27[0] = var15;
      var28[0] = var19;
      this.t2(var27, var17, var28, var11, var13, this.a6[3], 15);
      var15 = var27[0];
      var19 = var28[0];
      var29[0] = var13;
      var30[0] = var17;
      this.t2(var29, var15, var30, var19, var11, this.a6[7], 7);
      var13 = var29[0];
      var17 = var30[0];
      var26[0] = var11;
      var27[0] = var15;
      this.t2(var26, var13, var27, var17, var19, this.a6[0], 12);
      var11 = var26[0];
      var15 = var27[0];
      var28[0] = var19;
      var29[0] = var13;
      this.t2(var28, var11, var29, var15, var17, this.a6[13], 8);
      var19 = var28[0];
      var13 = var29[0];
      var30[0] = var17;
      var26[0] = var11;
      this.t2(var30, var19, var26, var13, var15, this.a6[5], 9);
      var17 = var30[0];
      var11 = var26[0];
      var27[0] = var15;
      var28[0] = var19;
      this.t2(var27, var17, var28, var11, var13, this.a6[10], 11);
      var15 = var27[0];
      var19 = var28[0];
      var29[0] = var13;
      var30[0] = var17;
      this.t2(var29, var15, var30, var19, var11, this.a6[14], 7);
      var13 = var29[0];
      var17 = var30[0];
      var26[0] = var11;
      var27[0] = var15;
      this.t2(var26, var13, var27, var17, var19, this.a6[15], 7);
      var11 = var26[0];
      var15 = var27[0];
      var28[0] = var19;
      var29[0] = var13;
      this.t2(var28, var11, var29, var15, var17, this.a6[8], 12);
      var19 = var28[0];
      var13 = var29[0];
      var30[0] = var17;
      var26[0] = var11;
      this.t2(var30, var19, var26, var13, var15, this.a6[12], 7);
      var17 = var30[0];
      var11 = var26[0];
      var27[0] = var15;
      var28[0] = var19;
      this.t2(var27, var17, var28, var11, var13, this.a6[4], 6);
      var15 = var27[0];
      var19 = var28[0];
      var29[0] = var13;
      var30[0] = var17;
      this.t2(var29, var15, var30, var19, var11, this.a6[9], 15);
      var13 = var29[0];
      var17 = var30[0];
      var26[0] = var11;
      var27[0] = var15;
      this.t2(var26, var13, var27, var17, var19, this.a6[1], 13);
      var11 = var26[0];
      var15 = var27[0];
      var28[0] = var19;
      var29[0] = var13;
      this.t2(var28, var11, var29, var15, var17, this.a6[2], 11);
      var19 = var28[0];
      var13 = var29[0];
      var30[0] = var17;
      var26[0] = var11;
      this.c8(var30, var19, var26, var13, var15, this.a6[15], 9);
      var17 = var30[0];
      var11 = var26[0];
      var27[0] = var15;
      var28[0] = var19;
      this.c8(var27, var17, var28, var11, var13, this.a6[5], 7);
      var15 = var27[0];
      var19 = var28[0];
      var29[0] = var13;
      var30[0] = var17;
      this.c8(var29, var15, var30, var19, var11, this.a6[1], 15);
      var13 = var29[0];
      var17 = var30[0];
      var26[0] = var11;
      var27[0] = var15;
      this.c8(var26, var13, var27, var17, var19, this.a6[3], 11);
      var11 = var26[0];
      var15 = var27[0];
      var28[0] = var19;
      var29[0] = var13;
      this.c8(var28, var11, var29, var15, var17, this.a6[7], 8);
      var19 = var28[0];
      var13 = var29[0];
      var30[0] = var17;
      var26[0] = var11;
      this.c8(var30, var19, var26, var13, var15, this.a6[14], 6);
      var17 = var30[0];
      var11 = var26[0];
      var27[0] = var15;
      var28[0] = var19;
      this.c8(var27, var17, var28, var11, var13, this.a6[6], 6);
      var15 = var27[0];
      var19 = var28[0];
      var29[0] = var13;
      var30[0] = var17;
      this.c8(var29, var15, var30, var19, var11, this.a6[9], 14);
      var13 = var29[0];
      var17 = var30[0];
      var26[0] = var11;
      var27[0] = var15;
      this.c8(var26, var13, var27, var17, var19, this.a6[11], 12);
      var11 = var26[0];
      var15 = var27[0];
      var28[0] = var19;
      var29[0] = var13;
      this.c8(var28, var11, var29, var15, var17, this.a6[8], 13);
      var19 = var28[0];
      var13 = var29[0];
      var30[0] = var17;
      var26[0] = var11;
      this.c8(var30, var19, var26, var13, var15, this.a6[12], 5);
      var17 = var30[0];
      var11 = var26[0];
      var27[0] = var15;
      var28[0] = var19;
      this.c8(var27, var17, var28, var11, var13, this.a6[2], 14);
      var15 = var27[0];
      var19 = var28[0];
      var29[0] = var13;
      var30[0] = var17;
      this.c8(var29, var15, var30, var19, var11, this.a6[10], 13);
      var13 = var29[0];
      var17 = var30[0];
      var26[0] = var11;
      var27[0] = var15;
      this.c8(var26, var13, var27, var17, var19, this.a6[0], 13);
      var11 = var26[0];
      var15 = var27[0];
      var28[0] = var19;
      var29[0] = var13;
      this.c8(var28, var11, var29, var15, var17, this.a6[4], 7);
      var19 = var28[0];
      var13 = var29[0];
      var30[0] = var17;
      var26[0] = var11;
      this.c8(var30, var19, var26, var13, var15, this.a6[13], 5);
      var17 = var30[0];
      var11 = var26[0];
      var27[0] = var15;
      var28[0] = var19;
      this.h0(var27, var17, var28, var11, var13, this.a6[8], 15);
      var15 = var27[0];
      var19 = var28[0];
      var29[0] = var13;
      var30[0] = var17;
      this.h0(var29, var15, var30, var19, var11, this.a6[6], 5);
      var13 = var29[0];
      var17 = var30[0];
      var26[0] = var11;
      var27[0] = var15;
      this.h0(var26, var13, var27, var17, var19, this.a6[4], 8);
      var11 = var26[0];
      var15 = var27[0];
      var28[0] = var19;
      var29[0] = var13;
      this.h0(var28, var11, var29, var15, var17, this.a6[1], 11);
      var19 = var28[0];
      var13 = var29[0];
      var30[0] = var17;
      var26[0] = var11;
      this.h0(var30, var19, var26, var13, var15, this.a6[3], 14);
      var17 = var30[0];
      var11 = var26[0];
      var27[0] = var15;
      var28[0] = var19;
      this.h0(var27, var17, var28, var11, var13, this.a6[11], 14);
      var15 = var27[0];
      var19 = var28[0];
      var29[0] = var13;
      var30[0] = var17;
      this.h0(var29, var15, var30, var19, var11, this.a6[15], 6);
      var13 = var29[0];
      var17 = var30[0];
      var26[0] = var11;
      var27[0] = var15;
      this.h0(var26, var13, var27, var17, var19, this.a6[0], 14);
      var11 = var26[0];
      var15 = var27[0];
      var28[0] = var19;
      var29[0] = var13;
      this.h0(var28, var11, var29, var15, var17, this.a6[5], 6);
      var19 = var28[0];
      var13 = var29[0];
      var30[0] = var17;
      var26[0] = var11;
      this.h0(var30, var19, var26, var13, var15, this.a6[12], 9);
      var17 = var30[0];
      var11 = var26[0];
      var27[0] = var15;
      var28[0] = var19;
      this.h0(var27, var17, var28, var11, var13, this.a6[2], 12);
      var15 = var27[0];
      var19 = var28[0];
      var29[0] = var13;
      var30[0] = var17;
      this.h0(var29, var15, var30, var19, var11, this.a6[13], 9);
      var13 = var29[0];
      var17 = var30[0];
      var26[0] = var11;
      var27[0] = var15;
      this.h0(var26, var13, var27, var17, var19, this.a6[9], 12);
      var11 = var26[0];
      var15 = var27[0];
      var28[0] = var19;
      var29[0] = var13;
      this.h0(var28, var11, var29, var15, var17, this.a6[7], 5);
      var19 = var28[0];
      var13 = var29[0];
      var30[0] = var17;
      var26[0] = var11;
      this.h0(var30, var19, var26, var13, var15, this.a6[10], 15);
      var17 = var30[0];
      var11 = var26[0];
      var27[0] = var15;
      var28[0] = var19;
      this.h0(var27, var17, var28, var11, var13, this.a6[14], 8);
      var15 = var27[0];
      var19 = var28[0];
      var29[0] = var13;
      var30[0] = var17;
      this.u9(var29, var15, var30, var19, var11, this.a6[12], 8);
      var13 = var29[0];
      var17 = var30[0];
      var26[0] = var11;
      var27[0] = var15;
      this.u9(var26, var13, var27, var17, var19, this.a6[15], 5);
      var11 = var26[0];
      var15 = var27[0];
      var28[0] = var19;
      var29[0] = var13;
      this.u9(var28, var11, var29, var15, var17, this.a6[10], 12);
      var19 = var28[0];
      var13 = var29[0];
      var30[0] = var17;
      var26[0] = var11;
      this.u9(var30, var19, var26, var13, var15, this.a6[4], 9);
      var17 = var30[0];
      var11 = var26[0];
      var27[0] = var15;
      var28[0] = var19;
      this.u9(var27, var17, var28, var11, var13, this.a6[1], 12);
      var15 = var27[0];
      var19 = var28[0];
      var29[0] = var13;
      var30[0] = var17;
      this.u9(var29, var15, var30, var19, var11, this.a6[5], 5);
      var13 = var29[0];
      var17 = var30[0];
      var26[0] = var11;
      var27[0] = var15;
      this.u9(var26, var13, var27, var17, var19, this.a6[8], 14);
      var11 = var26[0];
      var15 = var27[0];
      var28[0] = var19;
      var29[0] = var13;
      this.u9(var28, var11, var29, var15, var17, this.a6[7], 6);
      var19 = var28[0];
      var13 = var29[0];
      var30[0] = var17;
      var26[0] = var11;
      this.u9(var30, var19, var26, var13, var15, this.a6[6], 8);
      var17 = var30[0];
      var11 = var26[0];
      var27[0] = var15;
      var28[0] = var19;
      this.u9(var27, var17, var28, var11, var13, this.a6[2], 13);
      var15 = var27[0];
      var19 = var28[0];
      var29[0] = var13;
      var30[0] = var17;
      this.u9(var29, var15, var30, var19, var11, this.a6[13], 6);
      var13 = var29[0];
      var17 = var30[0];
      var26[0] = var11;
      var27[0] = var15;
      this.u9(var26, var13, var27, var17, var19, this.a6[14], 5);
      var11 = var26[0];
      var15 = var27[0];
      var28[0] = var19;
      var29[0] = var13;
      this.u9(var28, var11, var29, var15, var17, this.a6[0], 15);
      var19 = var28[0];
      var13 = var29[0];
      var30[0] = var17;
      var26[0] = var11;
      this.u9(var30, var19, var26, var13, var15, this.a6[3], 13);
      var17 = var30[0];
      var11 = var26[0];
      var27[0] = var15;
      var28[0] = var19;
      this.u9(var27, var17, var28, var11, var13, this.a6[9], 11);
      var15 = var27[0];
      var19 = var28[0];
      var29[0] = var13;
      var30[0] = var17;
      this.u9(var29, var15, var30, var19, var11, this.a6[11], 11);
      var13 = var29[0];
      var17 = var30[0];
      var17 = (var17 & 4294967295L) + (var5 & 4294967295L) + (this.u9[1] & 4294967295L);
      var17 &= 4294967295L;
      this.u9[1] = (this.u9[2] & 4294967295L) + (var7 & 4294967295L) + (var19 & 4294967295L);
      this.u9[1] = this.u9[1] & 4294967295L;
      this.u9[2] = (this.u9[3] & 4294967295L) + (var9 & 4294967295L) + (var11 & 4294967295L);
      this.u9[2] = this.u9[2] & 4294967295L;
      this.u9[3] = (this.u9[4] & 4294967295L) + (var1 & 4294967295L) + (var13 & 4294967295L);
      this.u9[3] = this.u9[3] & 4294967295L;
      this.u9[4] = (this.u9[0] & 4294967295L) + (var3 & 4294967295L) + (var15 & 4294967295L);
      this.u9[4] = this.u9[4] & 4294967295L;
      this.u9[0] = var17;
   }

   private void n5(long var1) {
      long var3 = var1 & 4294967295L;
      long var5 = var1 >> 32;
      com.aspose.slides.ms.System.u3.n5(this.a6, 0, this.a6.length);
      int var7 = 0;

      for (long var8 = 0L; (var8 & 4294967295L) < (var3 & 4294967295L & 63L); var8++) {
         this.a6[(int)((var8 & 4294967295L) >> 2)] = this.a6[(int)((var8 & 4294967295L) >> 2)]
            ^ (long)(this.n5[var7++] & 0xFF) << ((int)(8L * (var8 & 4294967295L & 3L)) & 31) & 4294967295L;
      }

      this.a6[(int)((var3 & 4294967295L) >> 2 & 15L)] = this.a6[(int)((var3 & 4294967295L) >> 2 & 15L)]
         ^ 1L << ((int)(8L * (var3 & 4294967295L & 3L) + 7L) & 31) & 4294967295L;
      if ((var3 & 4294967295L & 63L) > 55L) {
         this.a6();
         com.aspose.slides.ms.System.u3.n5(this.a6, 0, this.a6.length);
      }

      this.a6[14] = var3 << 3 & 4294967295L;
      this.a6[15] = (var3 & 4294967295L) >> 29 | var5 << 3 & 4294967295L;
      this.a6();
   }

   private long n5(long var1, int var3) {
      return (var1 & 4294967295L) << (var3 & 31) & 4294967295L | (var1 & 4294967295L) >> 32 - var3;
   }

   private long n5(long var1, long var3, long var5) {
      return var1 & 4294967295L ^ var3 & 4294967295L ^ var5 & 4294967295L;
   }

   private long l6(long var1, long var3, long var5) {
      return var1 & 4294967295L & var3 & 4294967295L | ~(var1 & 4294967295L) & var5 & 4294967295L;
   }

   private long k5(long var1, long var3, long var5) {
      return (var1 & 4294967295L | ~(var3 & 4294967295L)) ^ var5 & 4294967295L;
   }

   private long u3(long var1, long var3, long var5) {
      return var1 & 4294967295L & var5 & 4294967295L | var3 & 4294967295L & ~(var5 & 4294967295L);
   }

   private long a6(long var1, long var3, long var5) {
      return var1 & 4294967295L ^ (var3 & 4294967295L | ~(var5 & 4294967295L));
   }

   private void n5(long[] var1, long var2, long[] var4, long var5, long var7, long var9, int var11) {
      var1[0] = (var1[0] & 4294967295L) + (this.n5(var2, var4[0], var5) & 4294967295L) + (var9 & 4294967295L);
      var1[0] &= 4294967295L;
      var1[0] = (this.n5(var1[0], var11) & 4294967295L) + (var7 & 4294967295L);
      var1[0] &= 4294967295L;
      var4[0] = this.n5(var4[0], 10);
   }

   private void l6(long[] var1, long var2, long[] var4, long var5, long var7, long var9, int var11) {
      var1[0] = (var1[0] & 4294967295L) + (this.l6(var2, var4[0], var5) & 4294967295L) + (var9 & 4294967295L) + 1518500249L;
      var1[0] &= 4294967295L;
      var1[0] = (this.n5(var1[0], var11) & 4294967295L) + (var7 & 4294967295L);
      var1[0] &= 4294967295L;
      var4[0] = this.n5(var4[0], 10);
   }

   private void k5(long[] var1, long var2, long[] var4, long var5, long var7, long var9, int var11) {
      var1[0] = (var1[0] & 4294967295L) + (this.k5(var2, var4[0], var5) & 4294967295L) + (var9 & 4294967295L) + 1859775393L;
      var1[0] &= 4294967295L;
      var1[0] = (this.n5(var1[0], var11) & 4294967295L) + (var7 & 4294967295L);
      var1[0] &= 4294967295L;
      var4[0] = this.n5(var4[0], 10);
   }

   private void u3(long[] var1, long var2, long[] var4, long var5, long var7, long var9, int var11) {
      var1[0] = (var1[0] & 4294967295L) + (this.u3(var2, var4[0], var5) & 4294967295L) + (var9 & 4294967295L) + 2400959708L;
      var1[0] &= 4294967295L;
      var1[0] = (this.n5(var1[0], var11) & 4294967295L) + (var7 & 4294967295L);
      var1[0] &= 4294967295L;
      var4[0] = this.n5(var4[0], 10);
   }

   private void a6(long[] var1, long var2, long[] var4, long var5, long var7, long var9, int var11) {
      var1[0] = (var1[0] & 4294967295L) + (this.a6(var2, var4[0], var5) & 4294967295L) + (var9 & 4294967295L) + 2840853838L;
      var1[0] &= 4294967295L;
      var1[0] = (this.n5(var1[0], var11) & 4294967295L) + (var7 & 4294967295L);
      var1[0] &= 4294967295L;
      var4[0] = this.n5(var4[0], 10);
   }

   private void u9(long[] var1, long var2, long[] var4, long var5, long var7, long var9, int var11) {
      var1[0] = (var1[0] & 4294967295L) + (this.n5(var2, var4[0], var5) & 4294967295L) + (var9 & 4294967295L);
      var1[0] &= 4294967295L;
      var1[0] = (this.n5(var1[0], var11) & 4294967295L) + (var7 & 4294967295L);
      var1[0] &= 4294967295L;
      var4[0] = this.n5(var4[0], 10);
   }

   private void h0(long[] var1, long var2, long[] var4, long var5, long var7, long var9, int var11) {
      var1[0] = (var1[0] & 4294967295L) + (this.l6(var2, var4[0], var5) & 4294967295L) + (var9 & 4294967295L) + 2053994217L;
      var1[0] &= 4294967295L;
      var1[0] = (this.n5(var1[0], var11) & 4294967295L) + (var7 & 4294967295L);
      var1[0] &= 4294967295L;
      var4[0] = this.n5(var4[0], 10);
   }

   private void c8(long[] var1, long var2, long[] var4, long var5, long var7, long var9, int var11) {
      var1[0] = (var1[0] & 4294967295L) + (this.k5(var2, var4[0], var5) & 4294967295L) + (var9 & 4294967295L) + 1836072691L;
      var1[0] &= 4294967295L;
      var1[0] = (this.n5(var1[0], var11) & 4294967295L) + (var7 & 4294967295L);
      var1[0] &= 4294967295L;
      var4[0] = this.n5(var4[0], 10);
   }

   private void t2(long[] var1, long var2, long[] var4, long var5, long var7, long var9, int var11) {
      var1[0] = (var1[0] & 4294967295L) + (this.u3(var2, var4[0], var5) & 4294967295L) + (var9 & 4294967295L) + 1548603684L;
      var1[0] &= 4294967295L;
      var1[0] = (this.n5(var1[0], var11) & 4294967295L) + (var7 & 4294967295L);
      var1[0] &= 4294967295L;
      var4[0] = this.n5(var4[0], 10);
   }

   private void s7(long[] var1, long var2, long[] var4, long var5, long var7, long var9, int var11) {
      var1[0] = (var1[0] & 4294967295L) + (this.a6(var2, var4[0], var5) & 4294967295L) + (var9 & 4294967295L) + 1352829926L;
      var1[0] &= 4294967295L;
      var1[0] = (this.n5(var1[0], var11) & 4294967295L) + (var7 & 4294967295L);
      var1[0] &= 4294967295L;
      var4[0] = this.n5(var4[0], 10);
   }
}
