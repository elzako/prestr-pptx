package com.aspose.slides.internal.o8m;

class y8 {
   private long[] n5 = new long[5];
   private long l6;
   private byte[] k5 = new byte[64];
   private int u3;
   private long[] a6 = new long[80];

   public y8() {
      this.l6();
   }

   public void n5(byte[] var1, int var2, int var3) {
      if (this.u3 != 0) {
         if (var3 < 64 - this.u3) {
            com.aspose.slides.ms.System.y4.n5(var1, var2, this.k5, this.u3, var3);
            this.u3 += var3;
            return;
         }

         int var4 = 64 - this.u3;
         com.aspose.slides.ms.System.y4.n5(var1, var2, this.k5, this.u3, var4);
         this.n5(this.k5, 0L);
         this.u3 = 0;
         var2 += var4;
         var3 -= var4;
      }

      for (int var5 = 0; var5 < var3 - var3 % 64; var5 += 64) {
         this.n5(var1, var2 + var5);
      }

      if (var3 % 64 != 0) {
         com.aspose.slides.ms.System.y4.n5(var1, var3 - var3 % 64 + var2, this.k5, 0, var3 % 64);
         this.u3 = var3 % 64;
      }
   }

   public byte[] n5() {
      byte[] var1 = new byte[20];
      this.l6(this.k5, 0, this.u3);

      for (int var2 = 0; var2 < 5; var2++) {
         for (int var3 = 0; var3 < 4; var3++) {
            var1[var2 * 4 + var3] = (byte)((this.n5[var2] & 4294967295L) >> 8 * (3 - var3));
         }
      }

      return var1;
   }

   public void l6() {
      this.l6 = 0L;
      this.u3 = 0;
      this.n5[0] = 1732584193L;
      this.n5[1] = 4023233417L;
      this.n5[2] = 2562383102L;
      this.n5[3] = 271733878L;
      this.n5[4] = 3285377520L;
   }

   private void n5(byte[] var1, long var2) {
      this.l6 += 64L;
      long[] var4 = this.n5;
      long[] var5 = this.a6;
      n5(var5, var1, var2);
      n5(var5);
      long var6 = var4[0];
      long var8 = var4[1];
      long var10 = var4[2];
      long var12 = var4[3];
      long var14 = var4[4];

      byte var16;
      for (var16 = 0; var16 < 20; var16 += 5) {
         long var33 = (var14 & 4294967295L)
            + (var6 << 5 & 4294967295L | (var6 & 4294967295L) >> 27)
            + ((var10 & 4294967295L ^ var12 & 4294967295L) & var8 & 4294967295L ^ var12 & 4294967295L)
            + 1518500249L
            + (var5[var16] & 4294967295L);
         long var21 = var8 << 30 & 4294967295L | (var8 & 4294967295L) >> 2;
         long var29 = (var12 & 4294967295L)
            + (var33 << 5 & 4294967295L | (var33 & 4294967295L) >> 27)
            + ((var21 & 4294967295L ^ var10 & 4294967295L) & var6 & 4294967295L ^ var10 & 4294967295L)
            + 1518500249L
            + (var5[var16 + 1] & 4294967295L);
         var6 = var6 << 30 & 4294967295L | (var6 & 4294967295L) >> 2;
         var10 = (var10 & 4294967295L)
            + (var29 << 5 & 4294967295L | (var29 & 4294967295L) >> 27)
            + ((var6 & 4294967295L ^ var21 & 4294967295L) & var33 & 4294967295L ^ var21 & 4294967295L)
            + 1518500249L
            + (var5[var16 + 2] & 4294967295L);
         var14 = var33 << 30 & 4294967295L | (var33 & 4294967295L) >> 2;
         var8 = (var21 & 4294967295L)
            + (var10 << 5 & 4294967295L | (var10 & 4294967295L) >> 27)
            + ((var14 & 4294967295L ^ var6 & 4294967295L) & var29 & 4294967295L ^ var6 & 4294967295L)
            + 1518500249L
            + (var5[var16 + 3] & 4294967295L);
         var12 = var29 << 30 & 4294967295L | (var29 & 4294967295L) >> 2;
         var6 = (var6 & 4294967295L)
            + (var8 << 5 & 4294967295L | (var8 & 4294967295L) >> 27)
            + ((var12 & 4294967295L ^ var14 & 4294967295L) & var10 & 4294967295L ^ var14 & 4294967295L)
            + 1518500249L
            + (var5[var16 + 4] & 4294967295L);
         var10 = var10 << 30 & 4294967295L | (var10 & 4294967295L) >> 2;
      }

      while (var16 < 40) {
         long var34 = (var14 & 4294967295L)
            + (var6 << 5 & 4294967295L | (var6 & 4294967295L) >> 27)
            + (var8 & 4294967295L ^ var10 & 4294967295L ^ var12 & 4294967295L)
            + 1859775393L
            + (var5[var16] & 4294967295L);
         long var22 = var8 << 30 & 4294967295L | (var8 & 4294967295L) >> 2;
         long var30 = (var12 & 4294967295L)
            + (var34 << 5 & 4294967295L | (var34 & 4294967295L) >> 27)
            + (var6 & 4294967295L ^ var22 & 4294967295L ^ var10 & 4294967295L)
            + 1859775393L
            + (var5[var16 + 1] & 4294967295L);
         var6 = var6 << 30 & 4294967295L | (var6 & 4294967295L) >> 2;
         var10 = (var10 & 4294967295L)
            + (var30 << 5 & 4294967295L | (var30 & 4294967295L) >> 27)
            + (var34 & 4294967295L ^ var6 & 4294967295L ^ var22 & 4294967295L)
            + 1859775393L
            + (var5[var16 + 2] & 4294967295L);
         var14 = var34 << 30 & 4294967295L | (var34 & 4294967295L) >> 2;
         var8 = (var22 & 4294967295L)
            + (var10 << 5 & 4294967295L | (var10 & 4294967295L) >> 27)
            + (var30 & 4294967295L ^ var14 & 4294967295L ^ var6 & 4294967295L)
            + 1859775393L
            + (var5[var16 + 3] & 4294967295L);
         var12 = var30 << 30 & 4294967295L | (var30 & 4294967295L) >> 2;
         var6 = (var6 & 4294967295L)
            + (var8 << 5 & 4294967295L | (var8 & 4294967295L) >> 27)
            + (var10 & 4294967295L ^ var12 & 4294967295L ^ var14 & 4294967295L)
            + 1859775393L
            + (var5[var16 + 4] & 4294967295L);
         var10 = var10 << 30 & 4294967295L | (var10 & 4294967295L) >> 2;
         var16 += 5;
      }

      while (var16 < 60) {
         long var35 = (var14 & 4294967295L)
            + (var6 << 5 & 4294967295L | (var6 & 4294967295L) >> 27)
            + (var8 & 4294967295L & var10 & 4294967295L | var8 & 4294967295L & var12 & 4294967295L | var10 & 4294967295L & var12 & 4294967295L)
            + 2400959708L
            + (var5[var16] & 4294967295L);
         long var23 = var8 << 30 & 4294967295L | (var8 & 4294967295L) >> 2;
         long var31 = (var12 & 4294967295L)
            + (var35 << 5 & 4294967295L | (var35 & 4294967295L) >> 27)
            + (var6 & 4294967295L & var23 & 4294967295L | var6 & 4294967295L & var10 & 4294967295L | var23 & 4294967295L & var10 & 4294967295L)
            + 2400959708L
            + (var5[var16 + 1] & 4294967295L);
         var6 = var6 << 30 & 4294967295L | (var6 & 4294967295L) >> 2;
         var10 = (var10 & 4294967295L)
            + (var31 << 5 & 4294967295L | (var31 & 4294967295L) >> 27)
            + (var35 & 4294967295L & var6 & 4294967295L | var35 & 4294967295L & var23 & 4294967295L | var6 & 4294967295L & var23 & 4294967295L)
            + 2400959708L
            + (var5[var16 + 2] & 4294967295L);
         var14 = var35 << 30 & 4294967295L | (var35 & 4294967295L) >> 2;
         var8 = (var23 & 4294967295L)
            + (var10 << 5 & 4294967295L | (var10 & 4294967295L) >> 27)
            + (var31 & 4294967295L & var14 & 4294967295L | var31 & 4294967295L & var6 & 4294967295L | var14 & 4294967295L & var6 & 4294967295L)
            + 2400959708L
            + (var5[var16 + 3] & 4294967295L);
         var12 = var31 << 30 & 4294967295L | (var31 & 4294967295L) >> 2;
         var6 = (var6 & 4294967295L)
            + (var8 << 5 & 4294967295L | (var8 & 4294967295L) >> 27)
            + (var10 & 4294967295L & var12 & 4294967295L | var10 & 4294967295L & var14 & 4294967295L | var12 & 4294967295L & var14 & 4294967295L)
            + 2400959708L
            + (var5[var16 + 4] & 4294967295L);
         var10 = var10 << 30 & 4294967295L | (var10 & 4294967295L) >> 2;
         var16 += 5;
      }

      while (var16 < 80) {
         long var36 = (var14 & 4294967295L)
            + (var6 << 5 & 4294967295L | (var6 & 4294967295L) >> 27)
            + (var8 & 4294967295L ^ var10 & 4294967295L ^ var12 & 4294967295L)
            + 3395469782L
            + (var5[var16] & 4294967295L);
         long var24 = var8 << 30 & 4294967295L | (var8 & 4294967295L) >> 2;
         long var32 = (var12 & 4294967295L)
            + (var36 << 5 & 4294967295L | (var36 & 4294967295L) >> 27)
            + (var6 & 4294967295L ^ var24 & 4294967295L ^ var10 & 4294967295L)
            + 3395469782L
            + (var5[var16 + 1] & 4294967295L);
         var6 = var6 << 30 & 4294967295L | (var6 & 4294967295L) >> 2;
         var10 = (var10 & 4294967295L)
            + (var32 << 5 & 4294967295L | (var32 & 4294967295L) >> 27)
            + (var36 & 4294967295L ^ var6 & 4294967295L ^ var24 & 4294967295L)
            + 3395469782L
            + (var5[var16 + 2] & 4294967295L);
         var14 = var36 << 30 & 4294967295L | (var36 & 4294967295L) >> 2;
         var8 = (var24 & 4294967295L)
            + (var10 << 5 & 4294967295L | (var10 & 4294967295L) >> 27)
            + (var32 & 4294967295L ^ var14 & 4294967295L ^ var6 & 4294967295L)
            + 3395469782L
            + (var5[var16 + 3] & 4294967295L);
         var12 = var32 << 30 & 4294967295L | (var32 & 4294967295L) >> 2;
         var6 = (var6 & 4294967295L)
            + (var8 << 5 & 4294967295L | (var8 & 4294967295L) >> 27)
            + (var10 & 4294967295L ^ var12 & 4294967295L ^ var14 & 4294967295L)
            + 3395469782L
            + (var5[var16 + 4] & 4294967295L);
         var10 = var10 << 30 & 4294967295L | (var10 & 4294967295L) >> 2;
         var16 += 5;
      }

      var4[0] = (var4[0] & 4294967295L) + (var6 & 4294967295L);
      var4[1] = (var4[1] & 4294967295L) + (var8 & 4294967295L);
      var4[2] = (var4[2] & 4294967295L) + (var10 & 4294967295L);
      var4[3] = (var4[3] & 4294967295L) + (var12 & 4294967295L);
      var4[4] = (var4[4] & 4294967295L) + (var14 & 4294967295L);
   }

   private static void n5(long[] var0, byte[] var1, long var2) {
      var0[0] = (var1[(int)((var2 & 4294967295L) + 0L)] & 255) << 24
         | (var1[(int)((var2 & 4294967295L) + 1L)] & 255) << 16
         | (var1[(int)((var2 & 4294967295L) + 2L)] & 255) << 8
         | var1[(int)((var2 & 4294967295L) + 3L)] & 0xFF;
      var0[1] = (var1[(int)((var2 & 4294967295L) + 4L)] & 255) << 24
         | (var1[(int)((var2 & 4294967295L) + 5L)] & 255) << 16
         | (var1[(int)((var2 & 4294967295L) + 6L)] & 255) << 8
         | var1[(int)((var2 & 4294967295L) + 7L)] & 0xFF;
      var0[2] = (var1[(int)((var2 & 4294967295L) + 8L)] & 255) << 24
         | (var1[(int)((var2 & 4294967295L) + 9L)] & 255) << 16
         | (var1[(int)((var2 & 4294967295L) + 10L)] & 255) << 8
         | var1[(int)((var2 & 4294967295L) + 11L)] & 0xFF;
      var0[3] = (var1[(int)((var2 & 4294967295L) + 12L)] & 255) << 24
         | (var1[(int)((var2 & 4294967295L) + 13L)] & 255) << 16
         | (var1[(int)((var2 & 4294967295L) + 14L)] & 255) << 8
         | var1[(int)((var2 & 4294967295L) + 15L)] & 0xFF;
      var0[4] = (var1[(int)((var2 & 4294967295L) + 16L)] & 255) << 24
         | (var1[(int)((var2 & 4294967295L) + 17L)] & 255) << 16
         | (var1[(int)((var2 & 4294967295L) + 18L)] & 255) << 8
         | var1[(int)((var2 & 4294967295L) + 19L)] & 0xFF;
      var0[5] = (var1[(int)((var2 & 4294967295L) + 20L)] & 255) << 24
         | (var1[(int)((var2 & 4294967295L) + 21L)] & 255) << 16
         | (var1[(int)((var2 & 4294967295L) + 22L)] & 255) << 8
         | var1[(int)((var2 & 4294967295L) + 23L)] & 0xFF;
      var0[6] = (var1[(int)((var2 & 4294967295L) + 24L)] & 255) << 24
         | (var1[(int)((var2 & 4294967295L) + 25L)] & 255) << 16
         | (var1[(int)((var2 & 4294967295L) + 26L)] & 255) << 8
         | var1[(int)((var2 & 4294967295L) + 27L)] & 0xFF;
      var0[7] = (var1[(int)((var2 & 4294967295L) + 28L)] & 255) << 24
         | (var1[(int)((var2 & 4294967295L) + 29L)] & 255) << 16
         | (var1[(int)((var2 & 4294967295L) + 30L)] & 255) << 8
         | var1[(int)((var2 & 4294967295L) + 31L)] & 0xFF;
      var0[8] = (var1[(int)((var2 & 4294967295L) + 32L)] & 255) << 24
         | (var1[(int)((var2 & 4294967295L) + 33L)] & 255) << 16
         | (var1[(int)((var2 & 4294967295L) + 34L)] & 255) << 8
         | var1[(int)((var2 & 4294967295L) + 35L)] & 0xFF;
      var0[9] = (var1[(int)((var2 & 4294967295L) + 36L)] & 255) << 24
         | (var1[(int)((var2 & 4294967295L) + 37L)] & 255) << 16
         | (var1[(int)((var2 & 4294967295L) + 38L)] & 255) << 8
         | var1[(int)((var2 & 4294967295L) + 39L)] & 0xFF;
      var0[10] = (var1[(int)((var2 & 4294967295L) + 40L)] & 255) << 24
         | (var1[(int)((var2 & 4294967295L) + 41L)] & 255) << 16
         | (var1[(int)((var2 & 4294967295L) + 42L)] & 255) << 8
         | var1[(int)((var2 & 4294967295L) + 43L)] & 0xFF;
      var0[11] = (var1[(int)((var2 & 4294967295L) + 44L)] & 255) << 24
         | (var1[(int)((var2 & 4294967295L) + 45L)] & 255) << 16
         | (var1[(int)((var2 & 4294967295L) + 46L)] & 255) << 8
         | var1[(int)((var2 & 4294967295L) + 47L)] & 0xFF;
      var0[12] = (var1[(int)((var2 & 4294967295L) + 48L)] & 255) << 24
         | (var1[(int)((var2 & 4294967295L) + 49L)] & 255) << 16
         | (var1[(int)((var2 & 4294967295L) + 50L)] & 255) << 8
         | var1[(int)((var2 & 4294967295L) + 51L)] & 0xFF;
      var0[13] = (var1[(int)((var2 & 4294967295L) + 52L)] & 255) << 24
         | (var1[(int)((var2 & 4294967295L) + 53L)] & 255) << 16
         | (var1[(int)((var2 & 4294967295L) + 54L)] & 255) << 8
         | var1[(int)((var2 & 4294967295L) + 55L)] & 0xFF;
      var0[14] = (var1[(int)((var2 & 4294967295L) + 56L)] & 255) << 24
         | (var1[(int)((var2 & 4294967295L) + 57L)] & 255) << 16
         | (var1[(int)((var2 & 4294967295L) + 58L)] & 255) << 8
         | var1[(int)((var2 & 4294967295L) + 59L)] & 0xFF;
      var0[15] = (var1[(int)((var2 & 4294967295L) + 60L)] & 255) << 24
         | (var1[(int)((var2 & 4294967295L) + 61L)] & 255) << 16
         | (var1[(int)((var2 & 4294967295L) + 62L)] & 255) << 8
         | var1[(int)((var2 & 4294967295L) + 63L)] & 0xFF;
   }

   private static void n5(long[] var0) {
      for (int var1 = 16; var1 < 80; var1 += 8) {
         long var2 = var0[var1 - 3] & 4294967295L ^ var0[var1 - 8] & 4294967295L ^ var0[var1 - 14] & 4294967295L ^ var0[var1 - 16] & 4294967295L;
         var0[var1] = var2 << 1 & 4294967295L | (var2 & 4294967295L) >> 31;
         var2 = var0[var1 - 2] & 4294967295L ^ var0[var1 - 7] & 4294967295L ^ var0[var1 - 13] & 4294967295L ^ var0[var1 - 15] & 4294967295L;
         var0[var1 + 1] = var2 << 1 & 4294967295L | (var2 & 4294967295L) >> 31;
         var2 = var0[var1 - 1] & 4294967295L ^ var0[var1 - 6] & 4294967295L ^ var0[var1 - 12] & 4294967295L ^ var0[var1 - 14] & 4294967295L;
         var0[var1 + 2] = var2 << 1 & 4294967295L | (var2 & 4294967295L) >> 31;
         var2 = var0[var1 + 0] & 4294967295L ^ var0[var1 - 5] & 4294967295L ^ var0[var1 - 11] & 4294967295L ^ var0[var1 - 13] & 4294967295L;
         var0[var1 + 3] = var2 << 1 & 4294967295L | (var2 & 4294967295L) >> 31;
         var2 = var0[var1 + 1] & 4294967295L ^ var0[var1 - 4] & 4294967295L ^ var0[var1 - 10] & 4294967295L ^ var0[var1 - 12] & 4294967295L;
         var0[var1 + 4] = var2 << 1 & 4294967295L | (var2 & 4294967295L) >> 31;
         var2 = var0[var1 + 2] & 4294967295L ^ var0[var1 - 3] & 4294967295L ^ var0[var1 - 9] & 4294967295L ^ var0[var1 - 11] & 4294967295L;
         var0[var1 + 5] = var2 << 1 & 4294967295L | (var2 & 4294967295L) >> 31;
         var2 = var0[var1 + 3] & 4294967295L ^ var0[var1 - 2] & 4294967295L ^ var0[var1 - 8] & 4294967295L ^ var0[var1 - 10] & 4294967295L;
         var0[var1 + 6] = var2 << 1 & 4294967295L | (var2 & 4294967295L) >> 31;
         var2 = var0[var1 + 4] & 4294967295L ^ var0[var1 - 1] & 4294967295L ^ var0[var1 - 7] & 4294967295L ^ var0[var1 - 9] & 4294967295L;
         var0[var1 + 7] = var2 << 1 & 4294967295L | (var2 & 4294967295L) >> 31;
      }
   }

   private void l6(byte[] var1, int var2, int var3) {
      long var4 = this.l6 + var3;
      int var6 = 56 - (int)(var4 % 64L);
      if (var6 < 1) {
         var6 += 64;
      }

      int var7 = var3 + var6 + 8;
      byte[] var8 = var7 == 64 ? this.k5 : new byte[var7];
      if (var3 >= 0) {
         System.arraycopy(var1, 0 + var2, var8, 0, var3);
      }

      var8[var3] = -128;

      for (int var9 = var3 + 1; var9 < var3 + var6; var9++) {
         var8[var9] = 0;
      }

      long var10 = var4 << 3;
      this.n5(var10, var8, var3 + var6);
      this.n5(var8, 0L);
      if (var7 == 128) {
         this.n5(var8, 64L);
      }
   }

   void n5(long var1, byte[] var3, int var4) {
      var3[var4++] = (byte)(var1 >> 56);
      var3[var4++] = (byte)(var1 >> 48);
      var3[var4++] = (byte)(var1 >> 40);
      var3[var4++] = (byte)(var1 >> 32);
      var3[var4++] = (byte)(var1 >> 24);
      var3[var4++] = (byte)(var1 >> 16);
      var3[var4++] = (byte)(var1 >> 8);
      var3[var4] = (byte)var1;
   }
}
