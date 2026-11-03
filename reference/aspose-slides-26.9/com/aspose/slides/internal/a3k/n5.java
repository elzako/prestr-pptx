package com.aspose.slides.internal.a3k;

import com.aspose.slides.Collections.Generic.List;

public abstract class n5 {
   public static float[] n5(float[] var0) {
      return var0.length != 6
         ? new float[0]
         : new float[]{
            var0[0],
            var0[1],
            0.33333334F * var0[0] + 0.6666667F * var0[2],
            0.33333334F * var0[1] + 0.6666667F * var0[3],
            0.6666667F * var0[2] + 0.33333334F * var0[4],
            0.6666667F * var0[3] + 0.33333334F * var0[5],
            var0[4],
            var0[5]
         };
   }

   public static List<float[]> n5(float var0, float var1, float var2) {
      List var3 = new List();
      var3.addItem(n5(new float[]{var1 + var0, var2, var0 + var1, -0.41421357F * var0 + var2, 0.70710677F * var0 + var1, -0.70710677F * var0 + var2}));
      var3.addItem(n5(new float[]{0.70710677F * var0 + var1, -0.70710677F * var0 + var2, 0.41421357F * var0 + var1, -var0 + var2, var1, -var0 + var2}));
      var3.addItem(n5(new float[]{var1, -var0 + var2, -0.41421357F * var0 + var1, -var0 + var2, -0.70710677F * var0 + var1, -0.70710677F * var0 + var2}));
      var3.addItem(n5(new float[]{-0.70710677F * var0 + var1, -0.70710677F * var0 + var2, -var0 + var1, -0.41421357F * var0 + var2, -var0 + var1, var2}));
      var3.addItem(n5(new float[]{-var0 + var1, var2, -var0 + var1, 0.41421357F * var0 + var2, -0.70710677F * var0 + var1, 0.70710677F * var0 + var2}));
      var3.addItem(n5(new float[]{-0.70710677F * var0 + var1, 0.70710677F * var0 + var2, -0.41421357F * var0 + var1, var0 + var2, var1, var0 + var2}));
      var3.addItem(n5(new float[]{var1, var0 + var2, 0.41421357F * var0 + var1, var0 + var2, 0.70710677F * var0 + var1, 0.70710677F * var0 + var2}));
      var3.addItem(n5(new float[]{0.70710677F * var0 + var1, 0.70710677F * var0 + var2, var0 + var1, 0.41421357F * var0 + var2, var0 + var1, var2}));
      return var3;
   }

   public static List<float[]> n5(float var0, float var1, float var2, float var3) {
      float var4 = var0 + var2 / 2.0F;
      float var5 = var1 + var3 / 2.0F;
      float var6 = var2 / 2.0F;
      float var7 = var3 / 2.0F;
      float var8 = 0.5522848F;
      float var9 = var6 * var8;
      float var10 = var7 * var8;
      float var11 = var4 + var6;
      float var12 = var5 + var7;
      List var13 = new List();
      var13.addItem(new float[]{var4 - var6, var5, var4 - var6, var5 - var10, var4 - var9, var5 - var7, var4, var5 - var7});
      var13.addItem(new float[]{var4, var5 - var7, var4 + var9, var5 - var7, var11, var5 - var10, var11, var5});
      var13.addItem(new float[]{var11, var5, var11, var5 + var10, var4 + var9, var12, var4, var12});
      var13.addItem(new float[]{var4, var12, var4 - var9, var12, var4 - var6, var5 + var10, var4 - var6, var5});
      return var13;
   }
}
