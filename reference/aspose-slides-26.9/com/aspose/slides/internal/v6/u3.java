package com.aspose.slides.internal.v6;

import com.aspose.slides.ms.System.q1;

public abstract class u3 extends com.aspose.slides.internal.r5.a6 {
   protected u3(com.aspose.slides.internal.r5.y4 var1) {
      super(var1);
   }

   protected final void n5(
      com.aspose.slides.internal.o9b.j5 var1,
      com.aspose.slides.internal.o9b.j5 var2,
      com.aspose.slides.internal.o9b.y2 var3,
      com.aspose.slides.internal.r6.u9 var4
   ) {
      com.aspose.slides.internal.o9b.w1 var5 = new com.aspose.slides.internal.o9b.w1(var3.a6().n5() + var3.t2() / 2, var3.a6().l6() + var3.l6() / 2);
      float var6 = (float)(q1.u3(var1.n5() - var5.l6(), var1.l6() - var5.k5()) * (180.0 / Math.PI));
      float var7 = (float)(q1.u3(var2.n5() - var5.l6(), var2.l6() - var5.k5()) * (180.0 / Math.PI));
      var6 = var6 < 0.0F ? 360.0F + var6 : var6;
      var7 = var7 < 0.0F ? 360.0F + var7 : var7;
      float var8 = var7 - var6;
      if (var4.f2() != 2L) {
         var8 = var8 < 0.0F ? 360.0F + var8 : var8;
         var6 -= 90.0F;
      }

      if (var4.e2()) {
         var4.y4().n5(var3.n3(), var6, var8);
         var4.l6(var2.k5());
      } else {
         if (var4.c8() != null) {
            this.n5(var3.n3(), var6, var8, var4);
         }

         var4.n5(var2.k5());
      }
   }

   protected abstract void n5(com.aspose.slides.internal.o9b.y2 var1, float var2, float var3, com.aspose.slides.internal.r6.u9 var4);
}
