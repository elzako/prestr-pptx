package com.aspose.slides.internal.e3;

import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.o9b.w1;

public class u3 extends com.aspose.slides.internal.k6.a6 {
   private final com.aspose.slides.internal.k6.n5 n5 = new n5(this);

   @Override
   public com.aspose.slides.internal.k6.n5 n5() {
      return this.n5;
   }

   @Override
   protected void n5(com.aspose.slides.internal.a4.c8 var1, com.aspose.slides.internal.x3.a6 var2) {
      w1[] var3 = (w1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(w1.class), var1.t2()));

      for (int var4 = 0; var4 < var1.s7().length; var4++) {
         com.aspose.slides.internal.i0.u3 var5 = var1.s7()[var4];
         var5.n5().n5(var3[var4]);
      }

      r4 var6 = com.aspose.slides.internal.g0.u3.n5(var3);
      var6.n5(com.aspose.slides.internal.p1.n5.n5(var2.z1()));
      if (var2.c8() != null) {
         var6.n5(com.aspose.slides.internal.p1.n5.n5(var2.c8()));
      }

      var2.<com.aspose.slides.internal.e1.n3>n5().n5(var6);
   }
}
