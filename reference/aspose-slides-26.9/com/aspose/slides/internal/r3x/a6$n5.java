package com.aspose.slides.internal.r3x;

import com.aspose.slides.internal.x4g.m1;

abstract class a6$n5 implements a6$c8 {
   @Override
   public com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var1, m1 var2, float var3, float var4) {
      float var5 = (float)var2.t2().getScaleX();
      float var6 = (float)var2.t2().getScaleY();
      var2.t2().scale(1.0 / Math.abs(var5), 1.0 / Math.abs(var6));
      int var7 = Math.max(1, Math.round(var1.e2() * Math.abs(var5)));
      int var8 = Math.max(1, Math.round(var1.h0() * Math.abs(var6)));
      return this.n5(var1, var7, var8);
   }

   protected abstract com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var1, int var2, int var3);
}
