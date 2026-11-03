package com.aspose.slides.internal.i2;

import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.b9.z5;
import com.aspose.slides.internal.t5.e2;

public class u3 extends com.aspose.slides.internal.r5.c8 {
   @Override
   public void u9(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      z5 var3 = (z5)var1;
      e2 var4 = com.aspose.slides.internal.v6g.k5.n5(var2.t4().n5(var3.n5()), e2.class);
      if (var4 != null) {
         int[] var5 = new int[(int)var3.l6()];

         for (int var6 = 0; var6 < (int)var3.l6(); var6++) {
            if (var6 < var4.u3().length) {
               var5[var6] = var4.u3()[var6].u9();
            }
         }

         var4.n5(var5);
         var4.l6((int)(var3.l6() & 65535L));
      }
   }
}
