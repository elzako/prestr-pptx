package com.aspose.slides.internal.o9b;

import java.awt.BasicStroke;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;

final class z7$l6 implements z7$k5 {
   @Override
   public Stroke n5(
      float var1,
      int var2,
      int var3,
      int var4,
      float var5,
      float[] var6,
      float var7,
      int var8,
      AffineTransform var9,
      AffineTransform var10,
      int var11,
      z1 var12
   ) {
      return new BasicStroke(var1, com.aspose.slides.internal.x4g.t9.n5(var3), com.aspose.slides.internal.x4g.t4.n5(var4), var5, var6, var7);
   }

   @Override
   public Stroke n5(float var1, int var2, int var3, int var4, float var5, float[] var6, float var7, AffineTransform var8, AffineTransform var9, int var10) {
      return this.n5(var1, var2, var3, var4, var5, var6, var7, 0, var8, var9, var10, null);
   }
}
