package com.aspose.slides.internal.x1j;

import java.util.Iterator;

final class k5 {
   float n5;
   float l6;
   float k5;
   float u3;
   float a6;
   float u9;
   float h0;
   float c8;
   float t2;
   float s7;
   float x8;
   float n3;
   // $VF: synthetic field
   static final boolean y4 = !k5.class.desiredAssertionStatus();

   void n5(float[] var1, int var2) {
      switch (var2) {
         case 6:
            this.n5(var1[0], var1[1], var1[2], var1[3], var1[4], var1[5]);
            break;
         case 8:
            this.n5(var1[0], var1[1], var1[2], var1[3], var1[4], var1[5], var1[6], var1[7]);
            break;
         default:
            throw new InternalError("Curves should be cubic or quadratic");
      }
   }

   void n5(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.n5 = 3.0F * (var3 - var5) + var7 - var1;
      this.l6 = 3.0F * (var4 - var6) + var8 - var2;
      this.k5 = 3.0F * (var1 - 2.0F * var3 + var5);
      this.u3 = 3.0F * (var2 - 2.0F * var4 + var6);
      this.a6 = 3.0F * (var3 - var1);
      this.u9 = 3.0F * (var4 - var2);
      this.h0 = var1;
      this.c8 = var2;
      this.t2 = 3.0F * this.n5;
      this.s7 = 3.0F * this.l6;
      this.x8 = 2.0F * this.k5;
      this.n3 = 2.0F * this.u3;
   }

   void n5(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.n5 = this.l6 = 0.0F;
      this.k5 = var1 - 2.0F * var3 + var5;
      this.u3 = var2 - 2.0F * var4 + var6;
      this.a6 = 2.0F * (var3 - var1);
      this.u9 = 2.0F * (var4 - var2);
      this.h0 = var1;
      this.c8 = var2;
      this.t2 = 0.0F;
      this.s7 = 0.0F;
      this.x8 = 2.0F * this.k5;
      this.n3 = 2.0F * this.u3;
   }

   int l6(float[] var1, int var2) {
      return com.aspose.slides.internal.x1j.a6.n5(this.t2, this.x8, this.a6, var1, var2);
   }

   int k5(float[] var1, int var2) {
      return com.aspose.slides.internal.x1j.a6.n5(this.s7, this.n3, this.u9, var1, var2);
   }

   int u3(float[] var1, int var2) {
      float var3 = this.t2 * this.n3 - this.x8 * this.s7;
      float var4 = 2.0F * (this.u9 * this.t2 - this.s7 * this.a6);
      float var5 = this.u9 * this.x8 - this.a6 * this.n3;
      return com.aspose.slides.internal.x1j.a6.n5(var3, var4, var5, var1, var2);
   }

   private int a6(float[] var1, int var2) {
      assert var1.length >= var2 + 4;
      float var3 = 2.0F * (this.t2 * this.t2 + this.s7 * this.s7);
      float var4 = 3.0F * (this.t2 * this.x8 + this.s7 * this.n3);
      float var5 = 2.0F * (this.t2 * this.a6 + this.s7 * this.u9) + this.x8 * this.x8 + this.n3 * this.n3;
      float var6 = this.x8 * this.a6 + this.n3 * this.u9;
      return com.aspose.slides.internal.x1j.a6.n5(var3, var4, var5, var6, var1, var2, 0.0F, 1.0F);
   }

   int n5(float[] var1, int var2, float var3, float var4) {
      assert var2 <= 6 && var1.length >= 10;
      int var5 = var2;
      int var6 = this.a6(var1, var2);
      float var7 = 0.0F;
      float var8 = this.l6(var7) - var3 * var3;
      var1[var2 + var6] = 1.0F;
      var6++;

      for (int var9 = var2; var9 < var2 + var6; var9++) {
         float var10 = var1[var9];
         float var11 = this.l6(var10) - var3 * var3;
         if (var8 == 0.0F) {
            var1[var5++] = var7;
         } else if (var11 * var8 < 0.0F) {
            var1[var5++] = this.n5(var7, var10, var3 * var3, var4);
         }

         var7 = var10;
         var8 = var11;
      }

      return var5 - var2;
   }

   private static float n5(float var0) {
      return var0 == Float.POSITIVE_INFINITY ? Float.MAX_VALUE : (var0 == Float.NEGATIVE_INFINITY ? Float.MIN_VALUE : var0);
   }

   private float n5(float var1, float var2, float var3, float var4) {
      byte var5 = 100;
      int var6 = 0;
      float var7 = var2;
      float var8 = n5(this.l6(var7) - var3);
      float var9 = var1;
      float var10 = n5(this.l6(var9) - var3);
      float var11 = var9;

      for (int var12 = 0; var12 < 100 && Math.abs(var7 - var9) > var4 * Math.abs(var7 + var9); var12++) {
         var11 = (var10 * var7 - var8 * var9) / (var10 - var8);
         float var13 = this.l6(var11) - var3;
         if ((!(var13 < 0.0F) || !(var8 < 0.0F)) && (!(var13 > 0.0F) || !(var8 > 0.0F))) {
            if (!(var13 * var10 > 0.0F)) {
               break;
            }

            var10 = var13;
            var9 = var11;
            if (var6 > 0) {
               var8 /= 1 << var6;
               var6++;
            } else {
               var6 = 1;
            }
         } else {
            var8 = var13;
            var7 = var11;
            if (var6 < 0) {
               var10 /= 1 << -var6;
               var6--;
            } else {
               var6 = -1;
            }
         }
      }

      return var11;
   }

   private float l6(float var1) {
      float var2 = var1 * (var1 * this.t2 + this.x8) + this.a6;
      float var3 = var1 * (var1 * this.s7 + this.n3) + this.u9;
      float var4 = 2.0F * this.t2 * var1 + this.x8;
      float var5 = 2.0F * this.s7 * var1 + this.n3;
      float var6 = var2 * var2 + var3 * var3;
      return (float)(var6 * (var6 * var6 / (var6 * (var4 * var4 + var5 * var5) - Math.pow(var4 * var2 + var5 * var3, 2.0))));
   }

   static Iterator<Integer> n5(float[] var0, int var1, float[] var2, int var3) {
      assert var0.length >= 2 * var1 && var3 <= var2.length;
      return new u3(var1, var3, var2, var0);
   }
}
