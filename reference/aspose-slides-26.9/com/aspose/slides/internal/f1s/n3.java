package com.aspose.slides.internal.f1s;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.z4.t4;
import com.aspose.slides.ms.System.q1;

public class n3 extends u3 {
   private final int n5 = 8;
   private final float[][] k5;
   private final int u3;

   private n3(com.aspose.slides.internal.z4.c8 var1, int var2, int var3, int var4, float[][] var5, float[] var6, float[] var7) {
      super(var1, var2, var3, var6, var7);
      this.k5 = var5;
      this.u3 = var4;
   }

   public static n3 n5(com.aspose.slides.internal.z4.c8 var0, float[][] var1, int var2, int var3, int var4) {
      int var5 = var3 + var4;
      float[] var6 = new float[var5];
      float[] var7 = new float[var5];

      for (int var8 = 0; var8 < var5; var8++) {
         var6[var8] = Float.POSITIVE_INFINITY;
         var7[var8] = Float.NEGATIVE_INFINITY;
      }

      for (int var13 = 0; var13 < var2; var13++) {
         for (int var9 = 0; var9 < var5; var9++) {
            if (var6[var9] > var1[var13][var9]) {
               var6[var9] = var1[var13][var9];
            }

            if (var7[var9] < var1[var13][var9]) {
               var7[var9] = var1[var13][var9];
            }
         }
      }

      float[] var14 = new float[var3 * 2];
      float[] var15 = new float[var4 * 2];

      for (int var10 = 0; var10 < var5; var10++) {
         if (var10 < var3) {
            var14[var10 * 2] = var6[var10];
            var14[var10 * 2 + 1] = var7[var10];
         } else {
            var15[(var10 - var3) * 2] = var6[var10];
            var15[(var10 - var3) * 2 + 1] = var7[var10];
         }
      }

      int[] var16 = new int[]{var2};
      var1 = n5(var1, var14, var15, var16, var3, var4);
      var2 = var16[0];
      return new n3(var0, var3, var4, var2, var1, var14, var15);
   }

   private static float[][] n5(float[][] var0, float[] var1, float[] var2, int[] var3, int var4, int var5) {
      if (var4 != 1) {
         throw new NotImplementedException("Only support functions with one input variable.");
      }

      float[][] var6 = var0;
      float[] var7 = new float[var4];
      if (n5(var0, var3[0], var4, var7)) {
         var7[0] = (var1[1] - var1[0]) / 256.0F;
         var6 = new float[256][];

         for (int var8 = 0; var8 < 256; var8++) {
            var6[var8] = new float[var4 + var5];
         }

         int var19 = -1;
         int var9 = 0;

         for (int var10 = 0; var10 < 256; var10++) {
            var6[var10][0] = var10 * var7[0];
            float var11 = var0[var9][0];
            float var12 = var19 >= 0 ? var0[var19][0] : 0.0F;

            for (int var13 = var4; var13 < var5 + var4; var13++) {
               float var14 = var0[var9][var13];
               float var15 = var19 >= 0 ? var0[var19][var13] : 0.0F;
               if (var11 - var12 != 0.0F) {
                  float var16 = var14 - var15;
                  float var17 = var11 - var12;
                  float var18 = var6[var10][0] - var12;
                  var6[var10][var13] = var16 / var17 * var18 + var15;
                  if (var6[var10][var13] < var2[(var13 - var4) * 2]) {
                     var6[var10][var13] = var2[(var13 - var4) * 2];
                  }

                  if (var6[var10][var13] > var2[(var13 - var4) * 2 + 1]) {
                     var6[var10][var13] = var2[(var13 - var4) * 2 + 1];
                  }
               } else {
                  var6[var10][var13] = var14;
               }
            }

            if (var6[var10][0] >= var0[var9][0]) {
               var9++;
               var19++;
            }
         }

         var3[0] = 256;
      }

      return var6;
   }

   private static boolean n5(float[][] var0, int var1, int var2, float[] var3) {
      boolean var4 = false;

      for (int var5 = 0; var5 < var2; var5++) {
         var3[var5] = Float.POSITIVE_INFINITY;
      }

      for (int var8 = 1; var8 < var1; var8++) {
         for (int var6 = 0; var6 < var2; var6++) {
            float var7 = var0[var8][var6] - var0[var8 - 1][var6];
            if (var7 != var3[var6] && var3[var6] != Float.POSITIVE_INFINITY) {
               var4 = true;
            }

            if (var7 < var3[var6]) {
               var3[var6] = var7;
            }
         }
      }

      return var4;
   }

   @Override
   public void l6(t4 var1) {
      super.l6(var1);
      var1.n5("/Size", (int[])(new int[]{this.u3}));
      var1.n5("/BitsPerSample", 8);
   }

   @Override
   public void n5(t4 var1) {
      byte[][] var2 = new byte[this.u3][];

      for (int var3 = 0; var3 < this.u3; var3++) {
         var2[var3] = new byte[this.t4() + this.q0()];
      }

      for (int var14 = 0; var14 < this.t4() + this.q0(); var14++) {
         double var4;
         double var6;
         if (var14 < this.t4()) {
            var4 = this.l6()[var14 * 2];
            var6 = this.l6()[var14 * 2 + 1];
         } else {
            var4 = this.z1()[(var14 - this.t4()) * 2];
            var6 = this.z1()[(var14 - this.t4()) * 2 + 1];
         }

         double var8 = var6 - var4 != 0.0 ? 255.0 / (var6 - var4) : 1.0;

         for (int var10 = 0; var10 < this.u3; var10++) {
            double var11 = this.k5[var10][var14];
            var2[var10][var14] = com.aspose.slides.internal.v6g.k5.n5((Object)(q1.u3((var11 - var4) * var8)), 14);
         }
      }

      for (int var15 = 0; var15 < this.u3; var15++) {
         for (int var13 = this.t4(); var13 < this.t4() + this.q0(); var13++) {
            this.n5(var2[var15][var13]);
         }
      }

      super.n5(var1);
   }

   @Override
   protected int n5() {
      return 0;
   }
}
