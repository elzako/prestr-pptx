package com.aspose.slides.internal.m5k;

import com.aspose.slides.internal.t9z.k5;

public class n5 implements k5 {
   private k5 n5;
   private float[] l6;
   private int k5;
   private float u3;
   private boolean a6;
   private int u9;
   private boolean h0;
   private boolean c8;
   private int t2;
   private boolean s7;
   private float x8;
   private float n3;
   private float y4;
   private float e2;
   private float t9;
   private final float[] z1;
   private final n5$n5 t4 = new n5$n5();

   public n5(float var1, float[] var2, k5 var3) {
      this.n5 = var3;
      this.z1 = new float[16];
      float var4 = var1;
      if (var4 < 0.0F) {
         throw new IllegalArgumentException("phase < 0 !");
      }

      this.l6 = var2;
      this.k5 = this.l6.length;
      int var5 = 0;
      this.s7 = true;

      float var6;
      while (var4 >= (var6 = this.l6[var5])) {
         var4 -= var6;
         var5 = (var5 + 1) % this.k5;
         this.n5(var5);
      }

      this.u3 = this.x8 = var4;
      this.a6 = this.s7;
      this.u9 = var5;
      this.h0 = true;
      this.c8 = false;
   }

   @Override
   public void n5(float var1, float var2) {
      this.c8 = true;
      this.t2 = this.u9;
      this.s7 = this.a6;
      this.x8 = this.u3;
      this.n3 = this.e2 = var1;
      this.y4 = this.t9 = var2;
      this.h0 = true;
   }

   @Override
   public void l6(float var1, float var2) {
      float var3 = var1 - this.e2;
      float var4 = var2 - this.t9;
      float var5 = var3 * var3 + var4 * var4;
      if (var5 != 0.0F && !Float.isInfinite(var5) && !Float.isNaN(var5)) {
         var5 = (float)Math.sqrt(var5);
         float var6 = var3 / var5;
         float var7 = var4 / var5;
         float[] var8 = this.z1;
         float[] var9 = this.l6;

         while (true) {
            float var10 = var9[this.t2] - this.x8;
            if (var5 <= var10) {
               var8[0] = var1;
               var8[1] = var2;
               this.n5(var8, 0, 4);
               this.x8 += var5;
               if (var5 == var10) {
                  this.x8 = 0.0F;
                  this.t2 = (this.t2 + 1) % this.k5;
                  this.n5(this.t2);
               }

               return;
            }

            float var11 = var9[this.t2] * var6;
            float var12 = var9[this.t2] * var7;
            if (this.x8 == 0.0F) {
               var8[0] = this.e2 + var11;
               var8[1] = this.t9 + var12;
            } else {
               float var13 = var10 / var9[this.t2];
               var8[0] = this.e2 + var13 * var11;
               var8[1] = this.t9 + var13 * var12;
            }

            this.n5(var8, 0, 4);
            var5 -= var10;
            this.t2 = (this.t2 + 1) % this.k5;
            this.n5(this.t2);
            this.x8 = 0.0F;
         }
      }
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4) {
      float[] var5 = this.z1;
      var5[0] = this.e2;
      var5[1] = this.t9;
      var5[2] = var1;
      var5[3] = var2;
      var5[4] = var3;
      var5[5] = var4;
      this.l6(6);
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4, float var5, float var6) {
      float[] var7 = this.z1;
      var7[0] = this.e2;
      var7[1] = this.t9;
      var7[2] = var1;
      var7[3] = var2;
      var7[4] = var3;
      var7[5] = var4;
      var7[6] = var5;
      var7[7] = var6;
      this.l6(8);
   }

   @Override
   public void n5() {
      this.l6(this.n3, this.y4);
      this.n5(this.n3, this.y4);
   }

   @Override
   public void l6() {
      this.n5.l6();
   }

   private void n5(int var1) {
      if (var1 == 0) {
         this.s7 = true;
      } else {
         this.s7 = !this.s7;
      }
   }

   private void n5(float[] var1, int var2, int var3) {
      float var4 = var1[var2 + var3 - 4];
      float var5 = var1[var2 + var3 - 3];
      if (this.s7) {
         if (this.c8) {
            this.k5(this.e2, this.t9);
            this.c8 = false;
         }

         this.l6(var1, var2, var3);
      } else {
         this.h0 = false;
         this.c8 = true;
      }

      this.e2 = var4;
      this.t9 = var5;
   }

   private void l6(int var1) {
      if (!n5(this.z1, var1)) {
         this.t4.n5(this.z1, var1);
         int var2 = 0;
         float var3 = 0.0F;

         float var5;
         for (float var4 = this.l6[this.t2] - this.x8; (var5 = this.t4.n5(var4)) < 1.0F; var4 = this.l6[this.t2]) {
            if (var5 != 0.0F) {
               com.aspose.slides.internal.k3w.l6.n5((var5 - var3) / (1.0F - var3), this.z1, var2, this.z1, 0, this.z1, var1, var1);
               var3 = var5;
               this.n5(this.z1, 2, var1);
               var2 = var1;
            }

            this.t2 = (this.t2 + 1) % this.k5;
            this.n5(this.t2);
            this.x8 = 0.0F;
         }

         this.n5(this.z1, var2 + 2, var1);
         this.x8 = this.x8 + this.t4.l6();
         if (this.x8 >= this.l6[this.t2]) {
            this.x8 = 0.0F;
            this.t2 = (this.t2 + 1) % this.k5;
            this.n5(this.t2);
         }

         this.t4.n5();
      }
   }

   private static boolean n5(float[] var0, int var1) {
      for (int var2 = 2; var2 < var1; var2++) {
         if (var0[var2] != var0[var2 - 2]) {
            return false;
         }
      }

      return true;
   }

   private void k5(float var1, float var2) {
      this.n5.n5(var1, var2);
   }

   private void l6(float[] var1, int var2, int var3) {
      switch (var3) {
         case 4:
            this.n5.l6(var1[var2], var1[var2 + 1]);
            break;
         case 5:
         case 7:
         default:
            return;
         case 6:
            this.n5.n5(var1[var2 + 0], var1[var2 + 1], var1[var2 + 2], var1[var2 + 3]);
            break;
         case 8:
            this.n5.n5(var1[var2 + 0], var1[var2 + 1], var1[var2 + 2], var1[var2 + 3], var1[var2 + 4], var1[var2 + 5]);
      }
   }
}
