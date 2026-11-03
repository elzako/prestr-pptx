package com.aspose.slides.internal.v6;

import com.aspose.slides.internal.b9.p6;
import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.ms.System.q1;

public abstract class t9 extends com.aspose.slides.internal.r5.a6 {
   protected t9(com.aspose.slides.internal.r5.y4 var1) {
      super(var1);
   }

   @Override
   public void u9(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      p6 var3 = (p6)var1;
      com.aspose.slides.internal.o9b.w1 var4 = var3.l6().u3().u3();
      com.aspose.slides.internal.o9b.w1 var5 = var3.k5().u3().u3();
      com.aspose.slides.internal.o9b.y2 var6 = var3.n5().c8().n3();
      com.aspose.slides.internal.o9b.w1 var7 = new com.aspose.slides.internal.o9b.w1(var6.s7() + var6.t2() / 2.0F, var6.x8() + var6.l6() / 2.0F);
      float var8 = n5(var4.k5() - var7.k5(), var4.l6() - var7.l6());
      float var9 = n5(var5.k5() - var7.k5(), var5.l6() - var7.l6());
      var8 = var8 < 0.0F ? 360.0F + var8 : var8;
      var9 = var9 < 0.0F ? 360.0F + var9 : var9;
      float var10 = var8 > var9 ? var8 - var9 : 360.0F - (var9 - var8);
      if (var2.e2()) {
         var2.y4().l6(var6.n3(), var9, var10);
      } else {
         this.n5(var6.n3(), var9, var10, var2);
      }
   }

   public static float n5(float var0, float var1) {
      return (float)(q1.u3(var0, var1) * (180.0 / Math.PI));
   }

   @Override
   public boolean h0(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      return !var2.e2();
   }

   protected abstract void n5(com.aspose.slides.internal.o9b.y2 var1, float var2, float var3, com.aspose.slides.internal.r6.u9 var4);
}
