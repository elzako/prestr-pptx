package com.aspose.slides.internal.r3x;

import com.aspose.slides.internal.x4g.m1;

class a6$h0 implements a6$c8 {
   @Override
   public com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var1, m1 var2, float var3, float var4) {
      com.aspose.slides.internal.o9b.l6 var5;
      if (var1.s7() != 2498570 && var1.s7() != 137224) {
         boolean var6 = (var1.s7() & 262144) != 0;
         var5 = new com.aspose.slides.internal.o9b.l6(var1.e2(), var1.h0(), var6 ? 2498570 : 137224);
         a6.n5(var1, var5);
      } else {
         var5 = (com.aspose.slides.internal.o9b.l6)var1.deepClone();
      }

      int var9 = a6.n5(var3, var4);
      double var7 = a6.n5(var9);
      l6.n5(var5, var7, 1);
      return var5;
   }
}
