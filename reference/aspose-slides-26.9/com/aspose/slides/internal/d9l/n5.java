package com.aspose.slides.internal.d9l;

import com.aspose.slides.internal.w2i.s7;
import com.aspose.slides.ms.System.q1;

public class n5 {
   protected byte[] n5 = null;
   protected byte l6;
   protected byte k5;
   protected byte u3;
   protected byte a6;
   protected float[] u9;
   protected int[] h0;

   public n5(byte var1, byte var2, byte var3, byte var4) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
      this.a6 = var4;
      this.u9 = null;
      this.h0 = null;
   }

   public static n5 n5(byte var0, byte var1, byte var2, byte var3) {
      return com.aspose.slides.internal.d9l.k5.n5(var0, var1, var2, var3);
   }

   public final void n5(s7 var1) {
      byte[] var2 = var1.n5(16);
      this.a6 = var1.n5();
      this.n5 = var1.n5(3);
      this.u3 = var2[0];
      this.l6(var1);
   }

   public final void l6(s7 var1) {
      int var2 = com.aspose.slides.internal.v6g.k5.u3(q1.a6(this.u3 & 0xFF, this.l6 & 0xFF), 14) * (this.k5 & 255);
      switch (this.a6) {
         case 1:
            this.u9 = var1.l6(var2);
            break;
         case 2:
            this.u9 = var1.k5(var2);
      }
   }

   public void n5() {
      this.h0 = new int[8];
      this.h0[0] = 0;
      this.h0[1] = (this.k5 & 255) * (this.u3 & 255) * (this.u3 & 255);
      this.h0[2] = (this.k5 & 255) * (this.u3 & 255);
      this.h0[3] = this.h0[1] + this.h0[2];
      this.h0[4] = this.k5 & 255;
      this.h0[5] = this.h0[4] + this.h0[1];
      this.h0[6] = this.h0[4] + this.h0[2];
      this.h0[7] = this.h0[6] + this.h0[1];
   }

   public void n5(float[] var1) {
      for (int var2 = 0; var2 < (this.l6 & 255); var2++) {
         var1[var2] = com.aspose.slides.internal.g7i.k5.k5(var1[var2]);
      }

      byte var29 = (byte)((this.u3 & 255) - 1);
      byte var3 = (byte)((this.u3 & 255) - 1);
      byte var4 = (byte)((this.u3 & 255) - 1);
      float var5 = var1[0] * (var29 & 0xFF);
      float var6 = var1[1] * (var3 & 0xFF);
      float var7 = var1[2] * (var4 & 0xFF);
      int var8 = com.aspose.slides.internal.v6g.k5.u3(var5, 13);
      int var9 = com.aspose.slides.internal.v6g.k5.u3(var6, 13);
      int var10 = com.aspose.slides.internal.v6g.k5.u3(var7, 13);
      float var11 = var5 - var8;
      float var12 = var6 - var9;
      float var13 = var7 - var10;
      int[] var14 = new int[]{var8};
      float[] var15 = new float[]{var11};
      n5(var29, var14, var15);
      var8 = var14[0];
      var11 = var15[0];
      int[] var16 = new int[]{var9};
      float[] var17 = new float[]{var12};
      n5(var3, var16, var17);
      var9 = var16[0];
      var12 = var17[0];
      int[] var18 = new int[]{var10};
      float[] var19 = new float[]{var13};
      n5(var4, var18, var19);
      var10 = var18[0];
      var13 = var19[0];
      float var20 = 1.0F - var13;
      float var21 = 1.0F - var12;
      float var22 = 1.0F - var11;
      int var23 = var8 * this.h0[1] + var9 * this.h0[2] + var10 * this.h0[4];
      float[] var24 = new float[]{
         var20 * var21 * var22,
         var20 * var21 * var11,
         var20 * var12 * var22,
         var20 * var12 * var11,
         var13 * var21 * var22,
         var13 * var21 * var11,
         var13 * var12 * var22,
         var13 * var12 * var11
      };

      for (int var25 = 0; var25 < (this.k5 & 255); var25++) {
         double var26 = 0.0;

         for (int var28 = 0; var28 < 8; var28++) {
            var26 += this.u9[var23 + this.h0[var28] + var25] * var24[var28];
         }

         var1[var25] = com.aspose.slides.internal.g7i.k5.k5((float)var26);
      }
   }

   protected static void n5(byte var0, int[] var1, float[] var2) {
      if (var1[0] == (var0 & 255)) {
         var1[0]--;
         var2[0] = 1.0F;
      }
   }
}
