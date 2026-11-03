package com.aspose.slides.internal.r3x;

public class k5 {
   private static float[] n5(float var0) {
      int var1 = (int)Math.ceil(var0 * 2.0F);
      if (var1 % 2 == 0) {
         var1++;
      }

      int var2 = (var1 + 1) / 2;
      float var3 = var2 / 3.0F;
      float[] var4 = new float[var1];
      int var5 = -((var4.length + 1) / 2) + 1;

      for (int var6 = 0; var6 < var4.length; var5++) {
         if (var5 == 0) {
            var4[var6] = 1.0F;
         } else {
            var4[var6] = (float)Math.pow(Math.E, -(var5 * var5 / (2.0F * var3 * var3)));
         }

         var6++;
      }

      return var4;
   }

   public static void n5(int[][][] var0, float var1, float var2) {
      float[] var3 = n5(var1);
      float[] var4 = n5(var2);
      int var5 = (1 + var3.length) / 2 - 1;

      for (int var6 = 0; var6 < var0[0].length; var6++) {
         int[][] var7 = new int[var0.length][4];

         for (int var8 = 0; var8 < var0.length; var8++) {
            float var9 = 0.0F;

            for (int var10 = 0; var10 < var3.length; var10++) {
               int var11 = var8 + var10 - var5;
               if (var11 >= 0 && var11 < var0.length) {
                  var7[var8][0] = (int)(var7[var8][0] + var0[var11][var6][0] * var3[var10]);
                  var7[var8][1] = (int)(var7[var8][1] + var0[var11][var6][1] * var3[var10]);
                  var7[var8][2] = (int)(var7[var8][2] + var0[var11][var6][2] * var3[var10]);
                  var7[var8][3] = (int)(var7[var8][3] + var0[var11][var6][3] * var3[var10]);
                  var9 += var3[var10];
               }
            }

            var7[var8][0] = (int)(var7[var8][0] / var9);
            var7[var8][1] = (int)(var7[var8][1] / var9);
            var7[var8][2] = (int)(var7[var8][2] / var9);
            var7[var8][3] = (int)(var7[var8][3] / var9);
         }

         for (int var15 = 0; var15 < var0.length; var15++) {
            var0[var15][var6] = var7[var15];
         }
      }

      int var13 = (1 + var4.length) / 2 - 1;

      for (int var14 = 0; var14 < var0.length; var14++) {
         int[][] var16 = new int[var0[0].length][4];

         for (int var17 = 0; var17 < var0[0].length; var17++) {
            float var18 = 0.0F;

            for (int var19 = 0; var19 < var4.length; var19++) {
               int var12 = var17 + var19 - var13;
               if (var12 >= 0 && var12 < var0[0].length) {
                  var16[var17][0] = (int)(var16[var17][0] + var0[var14][var12][0] * var4[var19]);
                  var16[var17][1] = (int)(var16[var17][1] + var0[var14][var12][1] * var4[var19]);
                  var16[var17][2] = (int)(var16[var17][2] + var0[var14][var12][2] * var4[var19]);
                  var16[var17][3] = (int)(var16[var17][3] + var0[var14][var12][3] * var4[var19]);
                  var18 += var4[var19];
               }
            }

            var16[var17][0] = (int)(var16[var17][0] / var18);
            var16[var17][1] = (int)(var16[var17][1] / var18);
            var16[var17][2] = (int)(var16[var17][2] / var18);
            var16[var17][3] = (int)(var16[var17][3] / var18);
         }

         System.arraycopy(var16, 0, var0[var14], 0, var0[0].length);
      }
   }
}
