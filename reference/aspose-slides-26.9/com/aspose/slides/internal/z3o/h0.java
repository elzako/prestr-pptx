package com.aspose.slides.internal.z3o;

public class h0 {
   public float[] n5(float var1, float var2, float var3, float var4) {
      float var5 = var3 - var1;
      float var6 = var4 - var2;
      if (var5 == 0.0F && var6 == 0.0F) {
         var5 = 1.0F;
      }

      return new float[]{var5, var6, var5, var6};
   }

   public float[] n5(float var1, float var2, float var3, float var4, float var5, float var6) {
      float[] var7 = new float[16];
      var7[0] = var1;
      var7[1] = var2;
      var7[2] = var3;
      var7[3] = var4;
      var7[4] = var5;
      var7[5] = var6;
      float var8 = var7[2] - var7[0];
      float var9 = var7[3] - var7[1];
      float var10 = var7[4] - var7[2];
      float var11 = var7[5] - var7[3];
      if (var8 == 0.0F && var9 == 0.0F || var10 == 0.0F && var11 == 0.0F) {
         var8 = var10 = var7[4] - var7[0];
         var9 = var11 = var7[5] - var7[1];
      }

      return var8 == 0.0F && var9 == 0.0F ? this.n5(var1, var2, var7[0], var7[1]) : new float[]{var8, var9, var10, var11};
   }

   public float[] n5(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float[] var9 = new float[16];
      var9[0] = var1;
      var9[1] = var2;
      var9[2] = var3;
      var9[3] = var4;
      var9[4] = var5;
      var9[5] = var6;
      var9[6] = var7;
      var9[7] = var8;
      float var10 = var9[2] - var9[0];
      float var11 = var9[3] - var9[1];
      float var12 = var9[6] - var9[4];
      float var13 = var9[7] - var9[5];
      boolean var14 = var10 == 0.0F && var11 == 0.0F;
      boolean var15 = var12 == 0.0F && var13 == 0.0F;
      if (var14) {
         var10 = var9[4] - var9[0];
         var11 = var9[5] - var9[1];
         if (var10 == 0.0F && var11 == 0.0F) {
            var10 = var9[6] - var9[0];
            var11 = var9[7] - var9[1];
         }
      }

      if (var15) {
         var12 = var9[6] - var9[2];
         var13 = var9[7] - var9[3];
         if (var12 == 0.0F && var13 == 0.0F) {
            var12 = var9[6] - var9[0];
            var13 = var9[7] - var9[1];
         }
      }

      return var10 == 0.0F && var11 == 0.0F ? this.n5(var1, var2, var9[0], var9[1]) : new float[]{var10, var11, var12, var13};
   }
}
