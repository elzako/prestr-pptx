package com.aspose.slides.internal.v6;

import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.b9.u8;

public abstract class r4 extends com.aspose.slides.internal.r5.a6 {
   protected r4(com.aspose.slides.internal.r5.y4 var1) {
      super(var1);
   }

   @Override
   public void u9(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      u8 var3 = (u8)var1;
      int var4 = 0;
      com.aspose.slides.internal.x4g.s7 var5 = new com.aspose.slides.internal.x4g.s7();

      for (int var6 = 0; var6 < (var3.l6() & 4294967295L); var6++) {
         int var7 = (int)var3.u3()[var6];
         com.aspose.slides.internal.o9b.w1[] var8 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var7)
         );

         for (int var9 = 0; var9 < var7; var9++) {
            var3.u9()[var4 + var9].k5().n5(var8[var9]);
         }

         var5.l6(var8);
         var4 += var7;
      }

      if (var2.e2()) {
         var2.y4().n5(var5, false);
      } else if (var2.c8() != null) {
         this.n5(var5, var2);
      }
   }

   @Override
   public boolean h0(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      return !var2.e2();
   }

   protected abstract void n5(com.aspose.slides.internal.x4g.s7 var1, com.aspose.slides.internal.r6.u9 var2);
}
