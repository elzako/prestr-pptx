package com.aspose.slides.internal.w2k;

import com.aspose.slides.internal.e3j.a6$n5;
import com.aspose.slides.internal.o9b.w1;

abstract class n5 implements a6 {
   protected boolean n5(a6$n5 var1, boolean var2) {
      return var2 && var1 == a6$n5.n5 || !var2 && var1 == a6$n5.l6;
   }

   protected w1 n5(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      float var11 = var1 - var3 + var7;
      float var12 = var2 - var4 + var8;
      float var13 = var1 + var7;
      float var14 = var2 + var8;
      float var15 = var1 + var9;
      float var16 = var2 + var10;
      float var17 = var1 + var5 + var9;
      float var18 = var2 + var6 + var10;
      float[] var19 = new float[2];
      com.aspose.slides.internal.k3w.l6.n5(var11, var12, var13, var14, var15, var16, var17, var18, var19, 0, 100000.0F);
      return new w1(var19[0], var19[1]);
   }
}
