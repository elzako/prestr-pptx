package com.aspose.slides.internal.b6;

public class r4 extends z1 {
   @Override
   public void l6(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3) {
      com.aspose.slides.internal.i3.j5 var4 = (com.aspose.slides.internal.i3.j5)var1;
      com.aspose.slides.internal.o9b.u3 var5 = var3.s7(var4.l6());
      com.aspose.slides.internal.o9b.a0 var6 = var3.x8(var4.n5());
      if (var5 != null && var6 != null) {
         com.aspose.slides.internal.o9b.y1 var7 = var6.n5(var2).y4();
         com.aspose.slides.internal.o9b.w1[] var8 = new com.aspose.slides.internal.o9b.w1[]{
            new com.aspose.slides.internal.o9b.w1(var7.u9().l6() - var4.u3(), var7.u9().k5() - var4.k5()),
            new com.aspose.slides.internal.o9b.w1(var7.u9().l6() - var4.u3() + var7.s7() + var4.u3() * 2.0F, var7.u9().k5() - var4.k5()),
            new com.aspose.slides.internal.o9b.w1(var7.u9().l6() - var4.u3(), var7.u9().k5() - var4.k5() + var7.k5() + var4.k5() * 2.0F)
         };
         com.aspose.slides.internal.x4g.m1 var9 = new com.aspose.slides.internal.x4g.m1(var7.y4(), var8);
         com.aspose.slides.internal.o9b.a0 var10 = var6.l6();
         var10.l6(var9);
         var10.l6(var6);
         var2.n5(var5, var10);
      }
   }
}
