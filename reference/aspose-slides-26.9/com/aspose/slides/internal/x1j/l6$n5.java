package com.aspose.slides.internal.x1j;

class l6$n5 {
   private final float[][] n5;
   private final l6$n5$n5[] l6;
   private int k5;
   private final int u3;
   private final float a6;
   private final float u9;
   private float h0;
   private float c8;
   private float t2;
   private float s7;
   private float x8;
   private float n3;
   private int y4;
   private boolean e2;
   private final float[] t9 = new float[3];
   private int z1 = -1;
   private final float[] t4 = new float[4];
   private final float[] q0 = new float[]{0.0F, 0.0F, -1.0F, 0.0F};

   public l6$n5(int var1, float var2) {
      this.u3 = var1;
      this.u9 = 1.0F / (1 << this.u3);
      this.a6 = var2;
      this.n5 = new float[var1 + 1][8];
      this.l6 = new l6$n5$n5[var1];
      this.h0 = Float.MAX_VALUE;
      this.c8 = Float.MAX_VALUE;
      this.x8 = Float.MIN_VALUE;
      this.y4 = Integer.MIN_VALUE;
      this.n3 = Float.MAX_VALUE;
      this.e2 = true;
   }

   public void n5(float[] var1, int var2) {
      System.arraycopy(var1, 0, this.n5[0], 0, var2);
      this.k5 = var2;
      this.y4 = 0;
      this.t2 = 0.0F;
      this.s7 = 0.0F;
      this.h0 = 0.0F;
      this.c8 = 0.0F;
      this.k5();
      this.x8 = 0.0F;
      if (this.y4 > 0) {
         this.l6[0] = l6$n5$n5.n5;
         this.e2 = false;
      } else {
         this.l6[0] = l6$n5$n5.l6;
         this.e2 = true;
      }

      this.n3 = 0.0F;
   }

   private boolean l6(float var1) {
      if (this.z1 == -1) {
         float var2 = this.t9[0];
         float var3 = this.t9[1];
         if (!com.aspose.slides.internal.x1j.a6.n5(var2, var3, var1 * var3)) {
            this.z1 = 0;
            return false;
         }

         if (this.k5 == 8) {
            float var4 = this.t9[2];
            if (!com.aspose.slides.internal.x1j.a6.n5(var3, var4, var1 * var4) || !com.aspose.slides.internal.x1j.a6.n5(var2, var4, var1 * var4)) {
               this.z1 = 0;
               return false;
            }
         }

         this.z1 = 1;
         return true;
      } else {
         return this.z1 == 1;
      }
   }

   public float n5(float var1) {
      float var2 = this.x8 + var1;

      while (this.c8 < var2) {
         if (this.e2) {
            this.n3 = this.c8 - this.x8;
            return 1.0F;
         }

         this.l6();
      }

      this.x8 = var2;
      float var3 = this.c8 - this.s7;
      float var4 = (var2 - this.s7) / var3;
      if (!this.l6(0.05F)) {
         if (this.q0[2] < 0.0F) {
            float var5 = 0.0F + this.t9[0];
            float var6 = var5 + this.t9[1];
            if (this.k5 == 8) {
               float var7 = var6 + this.t9[2];
               this.q0[0] = 3.0F * (var5 - var6) + var7;
               this.q0[1] = 3.0F * (var6 - 2.0F * var5);
               this.q0[2] = 3.0F * var5;
               this.q0[3] = -var7;
            } else if (this.k5 == 6) {
               this.q0[0] = 0.0F;
               this.q0[1] = var6 - 2.0F * var5;
               this.q0[2] = 2.0F * var5;
               this.q0[3] = -var6;
            }
         }

         float var11 = this.q0[0];
         float var12 = this.q0[1];
         float var13 = this.q0[2];
         float var8 = var4 * this.q0[3];
         int var9 = com.aspose.slides.internal.x1j.a6.n5(var11, var12, var13, var8, this.t4, 0, 0.0F, 1.0F);
         if (var9 == 1 && !Float.isNaN(this.t4[0])) {
            var4 = this.t4[0];
         }
      }

      var4 = var4 * (this.h0 - this.t2) + this.t2;
      if (var4 >= 1.0F) {
         var4 = 1.0F;
         this.e2 = true;
      }

      this.n3 = var1;
      return var4;
   }

   public float n5() {
      return this.n3;
   }

   private void l6() {
      this.y4--;

      while (this.l6[this.y4] == l6$n5$n5.l6) {
         if (this.y4 == 0) {
            this.e2 = true;
            return;
         }

         this.y4--;
      }

      this.l6[this.y4] = l6$n5$n5.l6;
      System.arraycopy(this.n5[this.y4], 0, this.n5[this.y4 + 1], 0, this.k5);
      this.y4++;
      this.k5();
   }

   private void k5() {
      float var1 = this.u3();
      if (var1 >= 0.0F) {
         this.t2 = this.h0;
         this.s7 = this.c8;
         this.h0 = this.h0 + (1 << this.u3 - this.y4) * this.u9;
         this.c8 += var1;
         this.q0[2] = -1.0F;
         this.z1 = -1;
      } else {
         com.aspose.slides.internal.x1j.a6.n5(this.n5[this.y4], 0, this.n5[this.y4 + 1], 0, this.n5[this.y4], 0, this.k5);
         this.l6[this.y4] = l6$n5$n5.n5;
         this.y4++;
         this.k5();
      }
   }

   private float u3() {
      float[] var1 = this.n5[this.y4];
      float var2 = 0.0F;
      float var3 = var1[0];
      float var4 = var1[1];

      for (int var5 = 2; var5 < this.k5; var5 += 2) {
         float var6 = var1[var5];
         float var7 = var1[var5 + 1];
         float var8 = com.aspose.slides.internal.c9b.a6.n5(var3, var4, var6, var7);
         var2 += var8;
         this.t9[var5 / 2 - 1] = var8;
         var3 = var6;
         var4 = var7;
      }

      float var9 = com.aspose.slides.internal.c9b.a6.n5(var1[0], var1[1], var1[this.k5 - 2], var1[this.k5 - 1]);
      return !(var2 - var9 < this.a6) && this.y4 != this.u3 ? -1.0F : (var2 + var9) / 2.0F;
   }
}
