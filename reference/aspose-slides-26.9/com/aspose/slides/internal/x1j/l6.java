package com.aspose.slides.internal.x1j;

final class l6 implements h0 {
   private final h0 n5;
   private final float[] l6;
   private final float k5;
   private final boolean u3;
   private final int a6;
   private boolean u9;
   private boolean h0;
   private int c8;
   private boolean t2;
   private float s7;
   private float x8;
   private float n3;
   private float y4;
   private float e2;
   private final float[] t9;
   private float[] z1 = new float[7];
   private int t4 = 0;
   private l6$n5 q0 = null;

   public l6(h0 var1, float[] var2, float var3) {
      if (var3 < 0.0F) {
         throw new IllegalArgumentException("phase < 0 !");
      }

      this.n5 = var1;
      int var4 = 0;

      float var5;
      for (this.t2 = true; var3 >= (var5 = var2[var4]); this.t2 = !this.t2) {
         var3 -= var5;
         var4 = (var4 + 1) % var2.length;
      }

      this.l6 = var2;
      this.k5 = this.s7 = var3;
      this.u3 = this.t2;
      this.a6 = var4;
      this.u9 = true;
      this.t9 = new float[16];
   }

   @Override
   public void n5(float var1, float var2) {
      this.h0 = true;
      this.c8 = this.a6;
      this.t2 = this.u3;
      this.s7 = this.k5;
      this.x8 = this.y4 = var1;
      this.n3 = this.e2 = var2;
      this.u9 = true;
      this.h0 = false;
      this.n5.n5(this.x8, this.n3);
   }

   private void n5(float[] var1, int var2, int var3) {
      switch (var3) {
         case 4:
            this.n5.l6(var1[var2], var1[var2 + 1]);
         case 5:
         case 7:
         default:
            break;
         case 6:
            this.n5.n5(var1[var2 + 0], var1[var2 + 1], var1[var2 + 2], var1[var2 + 3]);
            break;
         case 8:
            this.n5.n5(var1[var2 + 0], var1[var2 + 1], var1[var2 + 2], var1[var2 + 3], var1[var2 + 4], var1[var2 + 5]);
      }
   }

   private void k5() {
      int var1 = 0;

      while (var1 < this.t4) {
         this.n5(this.z1, var1 + 1, (int)this.z1[var1]);
         var1 += (int)this.z1[var1] - 1;
      }

      this.t4 = 0;
   }

   private void l6(float[] var1, int var2, int var3) {
      float var4 = var1[var2 + var3 - 4];
      float var5 = var1[var2 + var3 - 3];
      if (this.t2) {
         if (this.u9) {
            this.z1 = com.aspose.slides.internal.x1j.a6.n5(this.z1, this.t4, var3 - 2);
            this.z1[this.t4++] = var3;
            System.arraycopy(var1, var2, this.z1, this.t4, var3 - 2);
            this.t4 += var3 - 2;
            this.k5();
         } else {
            if (this.h0) {
               this.n5.n5(this.y4, this.e2);
               this.h0 = false;
            }

            this.n5(var1, var2, var3);
         }
      } else {
         this.u9 = false;
         this.h0 = true;
      }

      this.y4 = var4;
      this.e2 = var5;
   }

   @Override
   public void l6(float var1, float var2) {
      float var3 = var1 - this.y4;
      float var4 = var2 - this.e2;
      float var5 = (float)Math.sqrt(var3 * var3 + var4 * var4);
      if (var5 != 0.0F) {
         float var6 = var3 / var5;
         float var7 = var4 / var5;

         while (true) {
            float var8 = this.l6[this.c8] - this.s7;
            if (var5 <= var8) {
               this.t9[0] = var1;
               this.t9[1] = var2;
               this.l6(this.t9, 0, 4);
               this.s7 += var5;
               if (var5 == var8) {
                  this.s7 = 0.0F;
                  this.c8 = (this.c8 + 1) % this.l6.length;
                  this.t2 = !this.t2;
               }

               return;
            }

            float var9 = this.l6[this.c8] * var6;
            float var10 = this.l6[this.c8] * var7;
            if (this.s7 == 0.0F) {
               this.t9[0] = this.y4 + var9;
               this.t9[1] = this.e2 + var10;
            } else {
               float var11 = var8 / this.l6[this.c8];
               this.t9[0] = this.y4 + var11 * var9;
               this.t9[1] = this.e2 + var11 * var10;
            }

            this.l6(this.t9, 0, 4);
            var5 -= var8;
            this.c8 = (this.c8 + 1) % this.l6.length;
            this.t2 = !this.t2;
            this.s7 = 0.0F;
         }
      }
   }

   private void n5(int var1) {
      if (!n5(this.t9, var1)) {
         if (this.q0 == null) {
            this.q0 = new l6$n5(4, 0.01F);
         }

         this.q0.n5(this.t9, var1);
         int var2 = 0;
         float var3 = 0.0F;
         float var4 = 0.0F;

         for (float var5 = this.l6[this.c8] - this.s7; (var4 = this.q0.n5(var5)) < 1.0F; var5 = this.l6[this.c8]) {
            if (var4 != 0.0F) {
               com.aspose.slides.internal.x1j.a6.n5((var4 - var3) / (1.0F - var3), this.t9, var2, this.t9, 0, this.t9, var1, var1);
               var3 = var4;
               this.l6(this.t9, 2, var1);
               var2 = var1;
            }

            this.c8 = (this.c8 + 1) % this.l6.length;
            this.t2 = !this.t2;
            this.s7 = 0.0F;
         }

         this.l6(this.t9, var2 + 2, var1);
         this.s7 = this.s7 + this.q0.n5();
         if (this.s7 >= this.l6[this.c8]) {
            this.s7 = 0.0F;
            this.c8 = (this.c8 + 1) % this.l6.length;
            this.t2 = !this.t2;
         }
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

   @Override
   public void n5(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.t9[0] = this.y4;
      this.t9[1] = this.e2;
      this.t9[2] = var1;
      this.t9[3] = var2;
      this.t9[4] = var3;
      this.t9[5] = var4;
      this.t9[6] = var5;
      this.t9[7] = var6;
      this.n5(8);
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4) {
      this.t9[0] = this.y4;
      this.t9[1] = this.e2;
      this.t9[2] = var1;
      this.t9[3] = var2;
      this.t9[4] = var3;
      this.t9[5] = var4;
      this.n5(6);
   }

   @Override
   public void n5() {
      this.l6(this.x8, this.n3);
      if (this.t4 > 0) {
         if (!this.t2 || this.h0) {
            this.n5.n5(this.x8, this.n3);
         }

         this.k5();
      }

      this.n5(this.x8, this.n3);
   }

   @Override
   public void l6() {
      if (this.t4 > 0) {
         this.n5.n5(this.x8, this.n3);
         this.k5();
      }

      this.n5.l6();
   }
}
