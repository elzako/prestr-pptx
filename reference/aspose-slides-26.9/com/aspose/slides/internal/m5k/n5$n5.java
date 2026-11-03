package com.aspose.slides.internal.m5k;

final class n5$n5 {
   private final float[][] n5;
   private final n5$n5$n5[] l6;
   private int k5;
   private float u3;
   private float a6;
   private float u9;
   private float h0;
   private float c8;
   private float t2;
   private int s7;
   private boolean x8;
   private final float[] n3 = new float[3];
   private int y4 = -1;
   private final float[] e2 = new float[4];
   private final float[] t9 = new float[]{0.0F, 0.0F, -1.0F, 0.0F};

   n5$n5() {
      this.n5 = new float[5][8];
      this.l6 = new n5$n5$n5[4];
      this.u3 = Float.MAX_VALUE;
      this.a6 = Float.MAX_VALUE;
      this.c8 = Float.MIN_VALUE;
      this.s7 = Integer.MIN_VALUE;
      this.t2 = Float.MAX_VALUE;
      this.x8 = true;
   }

   void n5() {
   }

   void n5(float[] var1, int var2) {
      System.arraycopy(var1, 0, this.n5[0], 0, 8);
      this.k5 = var2;
      this.s7 = 0;
      this.u9 = 0.0F;
      this.h0 = 0.0F;
      this.u3 = 0.0F;
      this.a6 = 0.0F;
      this.u3();
      this.c8 = 0.0F;
      if (this.s7 > 0) {
         this.l6[0] = n5$n5$n5.n5;
         this.x8 = false;
      } else {
         this.l6[0] = n5$n5$n5.l6;
         this.x8 = true;
      }

      this.t2 = 0.0F;
   }

   private boolean l6(float var1) {
      if (this.y4 == -1) {
         float var2 = this.n3[0];
         float var3 = this.n3[1];
         if (!com.aspose.slides.internal.k3w.l6.n5(var2, var3, var1 * var3)) {
            this.y4 = 0;
            return false;
         }

         if (this.k5 == 8) {
            float var4 = this.n3[2];
            float var5 = var1 * var4;
            if (!com.aspose.slides.internal.k3w.l6.n5(var3, var4, var5) || !com.aspose.slides.internal.k3w.l6.n5(var2, var4, var5)) {
               this.y4 = 0;
               return false;
            }
         }

         this.y4 = 1;
         return true;
      } else {
         return this.y4 == 1;
      }
   }

   float n5(float var1) {
      float var2 = this.c8 + var1;

      while (this.a6 < var2) {
         if (this.x8) {
            this.t2 = this.a6 - this.c8;
            return 1.0F;
         }

         this.k5();
      }

      this.c8 = var2;
      float var3 = this.a6 - this.h0;
      float var4 = (var2 - this.h0) / var3;
      if (!this.l6(0.05F)) {
         float[] var5 = this.t9;
         if (var5[2] < 0.0F) {
            float var6 = 0.0F + this.n3[0];
            float var7 = var6 + this.n3[1];
            if (this.k5 == 8) {
               float var8 = var7 + this.n3[2];
               var5[0] = 3.0F * (var6 - var7) + var8;
               var5[1] = 3.0F * (var7 - 2.0F * var6);
               var5[2] = 3.0F * var6;
               var5[3] = -var8;
            } else if (this.k5 == 6) {
               var5[0] = 0.0F;
               var5[1] = var7 - 2.0F * var6;
               var5[2] = 2.0F * var6;
               var5[3] = -var7;
            }
         }

         float var12 = var5[0];
         float var13 = var5[1];
         float var14 = var5[2];
         float var9 = var4 * var5[3];
         int var10 = com.aspose.slides.internal.k3w.l6.n5(var12, var13, var14, var9, this.e2, 0, 0.0F, 1.0F);
         if (var10 == 1 && !Float.isNaN(this.e2[0])) {
            var4 = this.e2[0];
         }
      }

      var4 = var4 * (this.u3 - this.u9) + this.u9;
      if (var4 >= 1.0F) {
         var4 = 1.0F;
         this.x8 = true;
      }

      this.t2 = var1;
      return var4;
   }

   float l6() {
      return this.t2;
   }

   private void k5() {
      int var1 = this.s7;
      n5$n5$n5[] var2 = this.l6;
      var1--;

      while (var2[var1] == n5$n5$n5.l6) {
         if (var1 == 0) {
            this.s7 = 0;
            this.x8 = true;
            return;
         }

         var1--;
      }

      var2[var1] = n5$n5$n5.l6;
      System.arraycopy(this.n5[var1], 0, this.n5[var1 + 1], 0, 8);
      this.s7 = ++var1;
      this.u3();
   }

   private void u3() {
      float var1 = this.a6();
      if (var1 >= 0.0F) {
         this.u9 = this.u3;
         this.h0 = this.a6;
         this.u3 = this.u3 + (1 << 4 - this.s7) * 0.0625F;
         this.a6 += var1;
         this.t9[2] = -1.0F;
         this.y4 = -1;
      } else {
         com.aspose.slides.internal.k3w.l6.n5(this.n5[this.s7], 0, this.n5[this.s7 + 1], 0, this.n5[this.s7], 0, this.k5);
         this.l6[this.s7] = n5$n5$n5.n5;
         this.s7++;
         this.u3();
      }
   }

   private float a6() {
      float[] var1 = this.n5[this.s7];
      float var2 = 0.0F;
      float var3 = var1[0];
      float var4 = var1[1];

      for (int var5 = 2; var5 < this.k5; var5 += 2) {
         float var6 = var1[var5];
         float var7 = var1[var5 + 1];
         float var8 = com.aspose.slides.internal.k3w.l6.n5(var3, var4, var6, var7);
         var2 += var8;
         this.n3[var5 / 2 - 1] = var8;
         var3 = var6;
         var4 = var7;
      }

      float var9 = com.aspose.slides.internal.k3w.l6.n5(var1[0], var1[1], var1[this.k5 - 2], var1[this.k5 - 1]);
      return !(var2 - var9 < 0.01F) && this.s7 != 4 ? -1.0F : (var2 + var9) / 2.0F;
   }
}
