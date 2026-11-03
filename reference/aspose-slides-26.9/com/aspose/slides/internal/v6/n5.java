package com.aspose.slides.internal.v6;

import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.ms.System.q1;

public abstract class n5 extends com.aspose.slides.internal.r5.a6 {
   protected n5(com.aspose.slides.internal.r5.y4 var1) {
      super(var1);
   }

   @Override
   public void u9(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      com.aspose.slides.internal.b9.l6 var3 = (com.aspose.slides.internal.b9.l6)var1;
      if (var2.c8() != null) {
         com.aspose.slides.internal.o9b.y2 var4 = new com.aspose.slides.internal.o9b.y2(
            (int)(var3.n5().n5() - (var3.l6() & 4294967295L) & 4294967295L),
            (int)(var3.n5().l6() - (var3.l6() & 4294967295L) & 4294967295L),
            (int)((var3.l6() & 4294967295L) * 2L),
            (int)((var3.l6() & 4294967295L) * 2L)
         );
         float var5 = var3.k5();
         float var6 = var3.u3();
         float var7 = var5 + var6;
         var5 = 360.0F - var7;
         float var8 = (float)(var3.n5().n5() + (var3.l6() & 4294967295L) * q1.h0(var5 / 180.0F * Math.PI));
         float var9 = (float)(var3.n5().l6() + (var3.l6() & 4294967295L) * q1.c8(var5 / 180.0F * Math.PI));
         com.aspose.slides.internal.o9b.w1 var10 = new com.aspose.slides.internal.o9b.w1(var8, var9);
         if (var2.e2()) {
            var2.y4().n5(var4.n3(), var5, var6);
         } else {
            this.n5(var4.n3(), var10.u3(), var5, var6, var2);
         }
      }
   }

   @Override
   public boolean h0(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      return !var2.e2();
   }

   protected abstract void n5(
      com.aspose.slides.internal.o9b.y2 var1, com.aspose.slides.internal.o9b.w1 var2, float var3, float var4, com.aspose.slides.internal.r6.u9 var5
   );
}
