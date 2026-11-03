package com.aspose.slides.internal.b9j;

import com.aspose.slides.ms.System.q1;

public class n5 {
   private float[][] n5;
   private com.aspose.slides.internal.o9b.l6 l6 = null;
   private int k5;
   private static final float[][] u3 = new float[][]{
      {0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, {0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, {0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, {0.2125F, 0.7154F, 0.0721F, 0.0F, 0.0F}
   };

   public static n5 n5() {
      n5 var0 = new n5();
      var0.k5 = 3;
      var0.n5 = u3;
      return var0;
   }

   public final float[][] l6() {
      return this.n5;
   }

   public static n5 n5(float var0) {
      n5 var1 = new n5();
      var1.k5 = 1;
      var1.n5 = new float[][]{
         {0.213F + 0.787F * var0, 0.715F - 0.715F * var0, 0.072F - 0.072F * var0, 0.0F, 0.0F},
         {0.213F - 0.213F * var0, 0.715F + 0.285F * var0, 0.072F - 0.072F * var0, 0.0F, 0.0F},
         {0.213F - 0.213F * var0, 0.715F - 0.715F * var0, 0.072F + 0.928F * var0, 0.0F, 0.0F},
         {0.0F, 0.0F, 0.0F, 1.0F, 0.0F}
      };
      return var1;
   }

   public static n5 l6(float var0) {
      n5 var1 = new n5();
      var1.k5 = 2;
      float var2 = (float)q1.c8(var0);
      float var3 = (float)q1.h0(var0);
      float var4 = 0.213F + var2 * 0.787F - var3 * 0.213F;
      float var5 = 0.213F - var2 * 0.212F + var3 * 0.143F;
      float var6 = 0.213F - var2 * 0.213F - var3 * 0.787F;
      float var7 = 0.715F - var2 * 0.715F - var3 * 0.715F;
      float var8 = 0.715F + var2 * 0.285F + var3 * 0.14F;
      float var9 = 0.715F - var2 * 0.715F + var3 * 0.715F;
      float var10 = 0.072F - var2 * 0.072F + var3 * 0.928F;
      float var11 = 0.072F - var2 * 0.072F - var3 * 0.283F;
      float var12 = 0.072F + var2 * 0.928F + var3 * 0.072F;
      var1.n5 = new float[][]{
         {var4, var7, var10, 0.0F, 0.0F}, {var5, var8, var11, 0.0F, 0.0F}, {var6, var9, var12, 0.0F, 0.0F}, {0.0F, 0.0F, 0.0F, 1.0F, 0.0F}
      };
      return var1;
   }
}
