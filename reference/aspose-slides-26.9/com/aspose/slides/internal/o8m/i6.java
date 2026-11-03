package com.aspose.slides.internal.o8m;

public class i6 extends l4 {
   private long[] n5 = new long[8];
   private com.aspose.slides.ms.System.i6 a6;
   private byte[] u9 = new byte[64];
   private int h0;
   private long[] c8 = new long[64];

   public i6() {
      this.t2();
   }

   @Override
   protected void l6(byte[] var1, int var2, int var3) {
      this.u3 = 1;
      if (this.h0 != 0) {
         if (var3 < 64 - this.h0) {
            com.aspose.slides.ms.System.y4.n5(var1, var2, this.u9, this.h0, var3);
            this.h0 += var3;
            return;
         }

         int var4 = 64 - this.h0;
         com.aspose.slides.ms.System.y4.n5(var1, var2, this.u9, this.h0, var4);
         this.n5(this.u9, 0);
         this.h0 = 0;
         var2 += var4;
         var3 -= var4;
      }

      for (int var5 = 0; var5 < var3 - var3 % 64; var5 += 64) {
         this.n5(var1, var2 + var5);
      }

      if (var3 % 64 != 0) {
         com.aspose.slides.ms.System.y4.n5(var1, var3 - var3 % 64 + var2, this.u9, 0, var3 % 64);
         this.h0 = var3 % 64;
      }
   }

   @Override
   protected byte[] c8() {
      byte[] var1 = new byte[32];
      this.u3(this.u9, 0, this.h0);

      for (int var2 = 0; var2 < 8; var2++) {
         for (int var3 = 0; var3 < 4; var3++) {
            var1[var2 * 4 + var3] = (byte)((this.n5[var2] & 4294967295L) >> 24 - var3 * 8);
         }
      }

      this.u3 = 0;
      return var1;
   }

   @Override
   public void t2() {
      this.a6 = new com.aspose.slides.ms.System.i6("0");
      this.h0 = 0;
      this.n5[0] = 1779033703L;
      this.n5[1] = 3144134277L;
      this.n5[2] = 1013904242L;
      this.n5[3] = 2773480762L;
      this.n5[4] = 1359893119L;
      this.n5[5] = 2600822924L;
      this.n5[6] = 528734635L;
      this.n5[7] = 1541459225L;
   }

   private void n5(byte[] var1, int var2) {
      long[] var3 = k8.n5;
      long[] var4 = this.c8;
      this.a6 = com.aspose.slides.ms.System.i6.u3(this.a6, new com.aspose.slides.ms.System.i6(String.valueOf(64)));

      for (int var5 = 0; var5 < 16; var5++) {
         var4[var5] = (var1[var2 + 4 * var5] & 255) << 24
            | (var1[var2 + 4 * var5 + 1] & 255) << 16
            | (var1[var2 + 4 * var5 + 2] & 255) << 8
            | var1[var2 + 4 * var5 + 3] & 0xFF;
      }

      for (int var26 = 16; var26 < 64; var26++) {
         long var6 = var4[var26 - 15];
         var6 = ((var6 & 4294967295L) >> 7 | var6 << 25 & 4294967295L) ^ ((var6 & 4294967295L) >> 18 | var6 << 14 & 4294967295L) ^ (var6 & 4294967295L) >> 3;
         long var8 = var4[var26 - 2];
         var8 = ((var8 & 4294967295L) >> 17 | var8 << 15 & 4294967295L) ^ ((var8 & 4294967295L) >> 19 | var8 << 13 & 4294967295L) ^ (var8 & 4294967295L) >> 10;
         var4[var26] = (var8 & 4294967295L) + (var4[var26 - 7] & 4294967295L) + (var6 & 4294967295L) + (var4[var26 - 16] & 4294967295L);
      }

      long var10 = this.n5[0];
      long var12 = this.n5[1];
      long var14 = this.n5[2];
      long var16 = this.n5[3];
      long var18 = this.n5[4];
      long var20 = this.n5[5];
      long var22 = this.n5[6];
      long var24 = this.n5[7];

      for (int var27 = 0; var27 < 64; var27++) {
         long var29 = (var24 & 4294967295L)
            + (
               ((var18 & 4294967295L) >> 6 | var18 << 26 & 4294967295L)
                  ^ ((var18 & 4294967295L) >> 11 | var18 << 21 & 4294967295L)
                  ^ ((var18 & 4294967295L) >> 25 | var18 << 7 & 4294967295L)
            )
            + (var18 & 4294967295L & var20 & 4294967295L ^ ~(var18 & 4294967295L) & var22 & 4294967295L)
            + (var3[var27] & 4294967295L)
            + (var4[var27] & 4294967295L);
         long var31 = ((var10 & 4294967295L) >> 2 | var10 << 30 & 4294967295L)
            ^ ((var10 & 4294967295L) >> 13 | var10 << 19 & 4294967295L)
            ^ ((var10 & 4294967295L) >> 22 | var10 << 10 & 4294967295L);
         var31 = (var31 & 4294967295L)
            + (var10 & 4294967295L & var12 & 4294967295L ^ var10 & 4294967295L & var14 & 4294967295L ^ var12 & 4294967295L & var14 & 4294967295L);
         var24 = var22;
         var22 = var20;
         var20 = var18;
         var18 = (var16 & 4294967295L) + (var29 & 4294967295L);
         var16 = var14;
         var14 = var12;
         var12 = var10;
         var10 = (var29 & 4294967295L) + (var31 & 4294967295L);
      }

      this.n5[0] = (this.n5[0] & 4294967295L) + (var10 & 4294967295L);
      this.n5[1] = (this.n5[1] & 4294967295L) + (var12 & 4294967295L);
      this.n5[2] = (this.n5[2] & 4294967295L) + (var14 & 4294967295L);
      this.n5[3] = (this.n5[3] & 4294967295L) + (var16 & 4294967295L);
      this.n5[4] = (this.n5[4] & 4294967295L) + (var18 & 4294967295L);
      this.n5[5] = (this.n5[5] & 4294967295L) + (var20 & 4294967295L);
      this.n5[6] = (this.n5[6] & 4294967295L) + (var22 & 4294967295L);
      this.n5[7] = (this.n5[7] & 4294967295L) + (var24 & 4294967295L);
   }

   private void u3(byte[] var1, int var2, int var3) {
      com.aspose.slides.ms.System.i6 var4 = com.aspose.slides.ms.System.i6.u3(this.a6, new com.aspose.slides.ms.System.i6(String.valueOf(var3)));
      com.aspose.slides.ms.System.i6 var5 = new com.aspose.slides.ms.System.i6(String.valueOf(64));
      Integer var6 = Float.valueOf(com.aspose.slides.ms.System.i6.h0(var4, var5).toString()).intValue();
      com.aspose.slides.ms.System.i6 var7 = new com.aspose.slides.ms.System.i6(var6.toString());
      com.aspose.slides.ms.System.i6 var8 = com.aspose.slides.ms.System.i6.a6(var4, com.aspose.slides.ms.System.i6.u9(var5, var7));
      int var9 = 56 - Integer.parseInt(var8.toString());
      if (var9 < 1) {
         var9 += 64;
      }

      byte[] var10 = new byte[var3 + var9 + 8];
      if (var3 >= 0) {
         System.arraycopy(var1, 0 + var2, var10, 0, var3);
      }

      var10[var3] = -128;

      for (int var11 = var3 + 1; var11 < var3 + var9; var11++) {
         var10[var11] = 0;
      }

      com.aspose.slides.ms.System.i6 var12 = com.aspose.slides.ms.System.i6.l6(var4, 3);
      this.n5(var12, var10, var3 + var9);
      this.n5(var10, 0);
      if (var3 + var9 + 8 == 128) {
         this.n5(var10, 64);
      }
   }

   void n5(com.aspose.slides.ms.System.i6 var1, byte[] var2, int var3) {
      var2[var3++] = com.aspose.slides.ms.System.i6.n5(var1, 56).byteValue();
      var2[var3++] = com.aspose.slides.ms.System.i6.n5(var1, 48).byteValue();
      var2[var3++] = com.aspose.slides.ms.System.i6.n5(var1, 40).byteValue();
      var2[var3++] = com.aspose.slides.ms.System.i6.n5(var1, 32).byteValue();
      var2[var3++] = com.aspose.slides.ms.System.i6.n5(var1, 24).byteValue();
      var2[var3++] = com.aspose.slides.ms.System.i6.n5(var1, 16).byteValue();
      var2[var3++] = com.aspose.slides.ms.System.i6.n5(var1, 8).byteValue();
      var2[var3++] = var1.byteValue();
   }
}
