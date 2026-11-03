package com.aspose.slides.internal.o9b;

import java.awt.BasicStroke;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;

final class z7$n5 implements z7$k5 {
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
      if (var8 == 0
         && (var6 == null || var6.length < 2)
         && var11 == 0
         && (var10 == null || var10.isIdentity())
         && (var9 == null || var9.isIdentity())
         && !z7.n5(var2)
         && !z7.n5(var3)) {
         return new BasicStroke(var1, com.aspose.slides.internal.x4g.t9.n5(var3), com.aspose.slides.internal.x4g.t4.n5(var4), var5 * 1.8F - 0.799F, var6, var7);
      }

      try {
         return new com.aspose.slides.internal.x1j.n5(
            var1, var2, var3, com.aspose.slides.internal.x4g.t4.n5(var4), var5, var6, var7, var8, var9, var10, var11, var12
         );
      } catch (Exception var14) {
         com.aspose.slides.internal.f8y.n5.n5(var14);
         return new BasicStroke(var1, com.aspose.slides.internal.x4g.t9.n5(var3), com.aspose.slides.internal.x4g.t4.n5(var4), var5, var6, var7);
      }
   }

   @Override
   public Stroke n5(float var1, int var2, int var3, int var4, float var5, float[] var6, float var7, AffineTransform var8, AffineTransform var9, int var10) {
      try {
         return new com.aspose.slides.internal.x1j.n5(var1, var2, var3, com.aspose.slides.internal.x4g.t4.n5(var4), var5, var6, var7, var8, var9, var10);
      } catch (Exception var12) {
         com.aspose.slides.internal.f8y.n5.n5(var12);
         return new BasicStroke(var1, com.aspose.slides.internal.x4g.t9.n5(var3), com.aspose.slides.internal.x4g.t4.n5(var4), var5, var6, var7);
      }
   }
}
