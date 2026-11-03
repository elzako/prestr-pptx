package com.aspose.slides.internal.x0;

import com.aspose.slides.internal.b9.f0;

public class n3 extends com.aspose.slides.internal.v6.x8 {
   public n3(com.aspose.slides.internal.r5.y4 var1) {
      super(var1);
   }

   @Override
   protected void n5(f0 var1, com.aspose.slides.internal.r6.u9 var2) {
      com.aspose.slides.internal.o9b.z1 var3 = var2.n5();
      com.aspose.slides.internal.x4g.x8 var4 = var3.l6();
      com.aspose.slides.internal.o9b.u3 var5 = var2.t9(var1.k5());
      com.aspose.slides.internal.o9b.a0 var6 = var1.h0().k5();
      if (var5 != null && var6 != null) {
         com.aspose.slides.internal.o9b.y1 var7 = var6.n5(var3).y4();
         com.aspose.slides.internal.o9b.w1[] var8 = new com.aspose.slides.internal.o9b.w1[]{
            new com.aspose.slides.internal.o9b.w1(var7.u9().l6() - var1.u3(), var7.u9().k5() - var1.u9()),
            new com.aspose.slides.internal.o9b.w1(var7.u9().l6() - var1.u3() + var7.s7() + var1.u3() * 2.0F, var7.u9().k5() - var1.u9()),
            new com.aspose.slides.internal.o9b.w1(var7.u9().l6() - var1.u3(), var7.u9().k5() - var1.u9() + var7.k5() + var1.u9() * 2.0F)
         };
         com.aspose.slides.internal.x4g.m1 var9 = new com.aspose.slides.internal.x4g.m1(var7.y4(), var8);
         com.aspose.slides.internal.o9b.a0 var10 = var6.l6();
         var10.l6(var9);
         var10.l6(var6);
         var3.n5(var5, var10);
      }

      var3.n5(var4);
   }
}
