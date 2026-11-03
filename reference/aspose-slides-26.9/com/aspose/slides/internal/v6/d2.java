package com.aspose.slides.internal.v6;

import com.aspose.slides.internal.b9.c2;
import com.aspose.slides.internal.b9.s9;

public abstract class d2 extends com.aspose.slides.internal.r5.a6 {
   protected d2(com.aspose.slides.internal.r5.y4 var1) {
      super(var1);
   }

   @Override
   public void u9(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      c2 var3 = (c2)var1;
      com.aspose.slides.internal.o9b.j5[] var4 = (com.aspose.slides.internal.o9b.j5[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.j5.class), (int)var3.l6())
      );

      for (int var5 = 0; var5 < var4.length; var5++) {
         var3.k5()[var5].k5().k5(var4[var5]);
      }

      if (var2.e2()) {
         var2.y4().k5(var4);
      } else {
         this.n5(var4, var2);
      }
   }

   @Override
   public boolean h0(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      return !var2.e2();
   }

   protected abstract void n5(com.aspose.slides.internal.o9b.j5[] var1, com.aspose.slides.internal.r6.u9 var2);
}
