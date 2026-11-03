package com.aspose.slides.internal.e6;

public class k5 {
   private float[] n5;
   private int[] l6;
   private int[] k5;
   private int u3;
   private int a6;
   private com.aspose.slides.internal.v2.n5 u9;
   private int[][] h0;

   public k5(float[] var1, int[] var2, int[] var3, int var4, com.aspose.slides.internal.v2.n5 var5, int[][] var6) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var1.length;
      this.a6 = var4;
      this.u9 = var5;
      this.h0 = var6;
   }

   public final float[] n5() {
      return this.n5(new int[this.u3], 0);
   }

   private float[] n5(int[] var1, int var2) {
      float[] var3 = new float[this.a6];
      if (var2 == this.n5.length - 1) {
         if (this.l6[var2] == this.k5[var2]) {
            var1[var2] = this.l6[var2];
            int[] var8 = this.h0[this.n5(var1)];

            for (int var10 = 0; var10 < this.a6; var10++) {
               var3[var10] = var8[var10];
            }

            return var3;
         } else {
            var1[var2] = this.l6[var2];
            int[] var7 = this.h0[this.n5(var1)];
            var1[var2] = this.k5[var2];
            int[] var9 = this.h0[this.n5(var1)];

            for (int var11 = 0; var11 < this.a6; var11++) {
               var3[var11] = this.n5(this.n5[var2], this.l6[var2], this.k5[var2], var7[var11], var9[var11]);
            }

            return var3;
         }
      } else {
         if (this.l6[var2] == this.k5[var2]) {
            var1[var2] = this.l6[var2];
            return this.n5(var1, var2 + 1);
         }

         var1[var2] = this.l6[var2];
         float[] var4 = this.n5(var1, var2 + 1);
         var1[var2] = this.k5[var2];
         float[] var5 = this.n5(var1, var2 + 1);

         for (int var6 = 0; var6 < this.a6; var6++) {
            var3[var6] = this.n5(this.n5[var2], this.l6[var2], this.k5[var2], var4[var6], var5[var6]);
         }

         return var3;
      }
   }

   private int n5(int[] var1) {
      float[] var2 = this.u9.l6();
      int var3 = 0;
      int var4 = 1;
      int var5 = var1.length;

      for (int var6 = var5 - 2; var6 >= 0; var6--) {
         var4 *= com.aspose.slides.internal.v6g.k5.u3(var2[var6], 13);
      }

      for (int var7 = var5 - 1; var7 >= 0; var7--) {
         var3 += var4 * var1[var7];
         if (var7 - 1 >= 0) {
            var4 /= com.aspose.slides.internal.v6g.k5.u3(var2[var7 - 1], 13);
         }
      }

      return var3;
   }

   protected final float n5(float var1, float var2, float var3, float var4, float var5) {
      return var4 + (var1 - var2) * (var5 - var4) / (var3 - var2);
   }
}
