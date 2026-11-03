package com.aspose.slides.internal.b6;

import com.aspose.slides.ms.System.q1;

public class l6 extends z1 {
   @Override
   public void l6(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3) {
      com.aspose.slides.internal.i3.l6 var4 = (com.aspose.slides.internal.i3.l6)var1;
      com.aspose.slides.internal.o9b.w1 var5 = new com.aspose.slides.internal.o9b.w1(var4.u3(), var4.k5());
      com.aspose.slides.internal.o9b.w1 var6 = new com.aspose.slides.internal.o9b.w1(var4.l6(), var4.n5());
      com.aspose.slides.internal.o9b.y1 var7 = com.aspose.slides.internal.o9b.y1.n5(var4.t2(), var4.c8(), var4.h0(), var4.u9()).y4();
      com.aspose.slides.internal.o9b.w1 var8 = new com.aspose.slides.internal.o9b.w1(var7.x8() + var7.s7() / 2.0F, var7.n3() + var7.k5() / 2.0F);
      float var9 = (float)(q1.u3(var5.l6() - var8.l6(), var5.k5() - var8.k5()) * (180.0 / Math.PI));
      float var10 = (float)(q1.u3(var6.l6() - var8.l6(), var6.k5() - var8.k5()) * (180.0 / Math.PI));
      var9 = var9 < 0.0F ? 360.0F + var9 : var9;
      var10 = var10 < 0.0F ? 360.0F + var10 : var10;
      float var11 = var10 - var9;
      var11 = var11 < 0.0F ? 360.0F + var11 : var11;
      var9 -= 90.0F;
      if (var3.t2() != null) {
         var2.n5(var3.t2(), var7.y4(), var9, var11);
      }
   }
}
