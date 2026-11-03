package com.aspose.slides.internal.i2;

import com.aspose.slides.internal.b9.r7;
import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.t5.e2;

public class c8 extends com.aspose.slides.internal.r5.c8 {
   @Override
   public void u9(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      r7 var3 = (r7)var1;
      e2 var4 = com.aspose.slides.internal.v6g.k5.n5(var2.t4().n5(var3.n5()), e2.class);
      if (var4 != null) {
         int[] var5 = var4.k5();

         for (int var6 = 0; var6 < (int)var3.k5(); var6++) {
            if (var6 < var4.u3().length) {
               var5[(int)((var3.l6() & 4294967295L) + var6 & 4294967295L)] = var3.u3()[var6].u9();
            }
         }

         var4.n5(var5);
      }
   }
}
