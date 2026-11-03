package com.aspose.slides.internal.v6;

import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.ms.System.q1;

public abstract class u9 extends com.aspose.slides.internal.r5.a6 {
   protected u9(com.aspose.slides.internal.r5.y4 var1) {
      super(var1);
   }

   @Override
   public void u9(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      com.aspose.slides.internal.b9.c8 var3 = (com.aspose.slides.internal.b9.c8)var1;
      com.aspose.slides.internal.o9b.w1 var4 = var3.l6().u3().u3();
      com.aspose.slides.internal.o9b.w1 var5 = var3.k5().u3().u3();
      com.aspose.slides.internal.o9b.y1 var6 = var3.n5().t2().y4();
      com.aspose.slides.internal.o9b.w1 var7 = new com.aspose.slides.internal.o9b.w1(var6.x8() + var6.s7() / 2.0F, var6.n3() + var6.k5() / 2.0F);
      float var8 = (float)(q1.u3(var4.l6() - var7.l6(), var4.k5() - var7.k5()) * (180.0 / Math.PI));
      float var9 = (float)(q1.u3(var5.l6() - var7.l6(), var5.k5() - var7.k5()) * (180.0 / Math.PI));
      var8 = var8 < 0.0F ? 360.0F + var8 : var8;
      var9 = var9 < 0.0F ? 360.0F + var9 : var9;
      float var10 = var9 - var8;
      var10 = var10 < 0.0F ? 360.0F + var10 : var10;
      com.aspose.slides.internal.x4g.s7 var11 = new com.aspose.slides.internal.x4g.s7();
      var11.n5(var6.y4(), var8, var10);
      var11.n3();
      if (var2.e2()) {
         var2.y4().n5(var11, false);
      } else {
         this.n5(var11, var2);
      }
   }

   @Override
   public boolean h0(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      return !var2.e2();
   }

   protected abstract void n5(com.aspose.slides.internal.x4g.s7 var1, com.aspose.slides.internal.r6.u9 var2);
}
