package com.aspose.slides.internal.i2;

import com.aspose.slides.internal.b9.q3;
import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.c5.z1;
import com.aspose.slides.ms.System.d5;

public class a6 extends com.aspose.slides.internal.r5.c8 {
   @Override
   public void u9(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      q3 var3 = (q3)var1;
      long var4 = var3.n5();
      if ((var4 & 4294967295L) != 0L) {
         if (d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(z1.class), var4)) {
            var2.t4().l6(var4 & 4294967295L, var2);
         } else {
            var2.t4().n5(var4, var2);
         }
      }
   }
}
