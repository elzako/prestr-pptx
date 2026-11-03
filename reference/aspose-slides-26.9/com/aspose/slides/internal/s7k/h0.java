package com.aspose.slides.internal.s7k;

class h0 extends u9 {
   public h0(byte var1, byte var2, byte var3, byte var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public void n5() {
      this.h0 = new int[16];
      this.h0[0] = 0;
      this.h0[1] = com.aspose.slides.internal.v6g.k5.u3(this.k5, 6)
         * com.aspose.slides.internal.v6g.k5.u3(this.u3, 6)
         * com.aspose.slides.internal.v6g.k5.u3(this.u3, 6)
         * com.aspose.slides.internal.v6g.k5.u3(this.u3, 6);
      this.h0[2] = com.aspose.slides.internal.v6g.k5.u3(this.k5, 6)
         * com.aspose.slides.internal.v6g.k5.u3(this.u3, 6)
         * com.aspose.slides.internal.v6g.k5.u3(this.u3, 6);
      this.h0[3] = this.h0[2] + this.h0[1];
      this.h0[4] = com.aspose.slides.internal.v6g.k5.u3(this.k5, 6) * com.aspose.slides.internal.v6g.k5.u3(this.u3, 6);
      this.h0[5] = this.h0[4] + this.h0[1];
      this.h0[6] = this.h0[4] + this.h0[2];
      this.h0[7] = this.h0[4] + this.h0[3];
      this.h0[8] = com.aspose.slides.internal.v6g.k5.u3(this.k5, 6);
      this.h0[9] = this.h0[8] + this.h0[1];
      this.h0[10] = this.h0[8] + this.h0[2];
      this.h0[11] = this.h0[8] + this.h0[3];
      this.h0[12] = this.h0[8] + this.h0[4];
      this.h0[13] = this.h0[8] + this.h0[5];
      this.h0[14] = this.h0[8] + this.h0[6];
      this.h0[15] = this.h0[8] + this.h0[7];
   }

   @Override
   public void n5(float[] var1) {
      byte var2 = (byte)(com.aspose.slides.internal.v6g.k5.u3(this.u3, 6) - 1);
      byte var3 = (byte)(com.aspose.slides.internal.v6g.k5.u3(this.u3, 6) - 1);
      byte var4 = (byte)(com.aspose.slides.internal.v6g.k5.u3(this.u3, 6) - 1);
      byte var5 = (byte)(com.aspose.slides.internal.v6g.k5.u3(this.u3, 6) - 1);
      float var6 = var1[0] * com.aspose.slides.internal.v6g.k5.c8(var2, 6);
      float var7 = var1[1] * com.aspose.slides.internal.v6g.k5.c8(var3, 6);
      float var8 = var1[2] * com.aspose.slides.internal.v6g.k5.c8(var4, 6);
      float var9 = var1[3] * com.aspose.slides.internal.v6g.k5.c8(var5, 6);
      int var10 = com.aspose.slides.internal.v6g.k5.u3(var6, 13);
      int var11 = com.aspose.slides.internal.v6g.k5.u3(var7, 13);
      int var12 = com.aspose.slides.internal.v6g.k5.u3(var8, 13);
      int var13 = com.aspose.slides.internal.v6g.k5.u3(var9, 13);
      float var14 = var6 - var10;
      float var15 = var7 - var11;
      float var16 = var8 - var12;
      float var17 = var9 - var13;
      int[] var18 = new int[]{var10};
      float[] var19 = new float[]{var14};
      n5(var2, var18, var19);
      var10 = var18[0];
      var14 = var19[0];
      int[] var20 = new int[]{var11};
      float[] var21 = new float[]{var15};
      n5(var3, var20, var21);
      var11 = var20[0];
      var15 = var21[0];
      int[] var22 = new int[]{var12};
      float[] var23 = new float[]{var16};
      n5(var4, var22, var23);
      var12 = var22[0];
      var16 = var23[0];
      int[] var24 = new int[]{var13};
      float[] var25 = new float[]{var17};
      n5(var5, var24, var25);
      var13 = var24[0];
      var17 = var25[0];
      float var26 = 1.0F - var17;
      float var27 = 1.0F - var16;
      float var28 = 1.0F - var15;
      float var29 = 1.0F - var14;
      int var30 = var10 * this.h0[1] + var11 * this.h0[2] + var12 * this.h0[4] + var13 * this.h0[8];
      float[] var31 = new float[]{
         var26 * var27 * var28 * var29,
         var26 * var27 * var28 * var14,
         var26 * var27 * var15 * var29,
         var26 * var27 * var15 * var14,
         var26 * var16 * var28 * var29,
         var26 * var16 * var28 * var14,
         var26 * var16 * var15 * var29,
         var26 * var16 * var15 * var14,
         var17 * var27 * var28 * var29,
         var17 * var27 * var28 * var14,
         var17 * var27 * var15 * var29,
         var17 * var27 * var15 * var14,
         var17 * var16 * var28 * var29,
         var17 * var16 * var28 * var14,
         var17 * var16 * var15 * var29,
         var17 * var16 * var15 * var14
      };

      for (int var32 = 0; var32 < com.aspose.slides.internal.v6g.k5.u3(this.k5, 6); var32++) {
         float var33 = 0.0F;

         for (int var34 = 0; var34 < 16; var34++) {
            var33 += this.u9[var30 + this.h0[var34] + var32] * var31[var34];
         }

         var1[var32] = d2.k5(var33);
      }
   }
}
