package com.aspose.slides.internal.g7p;

import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.m3;

public class a6 extends k5<com.aspose.slides.internal.w4c.n5> {
   public a6(m3 var1) {
      super(var1);
   }

   public com.aspose.slides.internal.o9b.c8 n5(float var1, float var2, com.aspose.slides.internal.w4c.n5 var3) {
      com.aspose.slides.internal.x4g.a6 var4 = this.n5.n3();
      com.aspose.slides.internal.o9b.c8[] var5 = var4.n5();
      float[] var6 = var4.l6();
      if (var3.k5(var1, var2)) {
         com.aspose.slides.internal.o9b.c8[] var7 = new com.aspose.slides.internal.o9b.c8[]{var5[var5.length - 1], var5[var5.length - 2]};
         float[] var8 = new float[]{var6[var6.length - 1], var6[var6.length - 2]};
         return this.n5(1.0, var7, var8);
      } else {
         double var9 = this.n5(new w1(var1, var2), var3, true);
         return var9 == -1.0 ? null : this.n5(var9, var5, var6);
      }
   }
}
