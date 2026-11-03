package com.aspose.slides.internal.c7;

import com.aspose.slides.internal.a4.v0;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.ms.System.o5;

public class n5 extends com.aspose.slides.internal.r9.n5 {
   @Override
   protected void n5(v0 var1, com.aspose.slides.internal.x3.a6 var2) {
      if (!o5.l6(var2.l6().t2(), null)) {
         z1 var3 = var2.n5();
         if (var1.u3()) {
            var3.u9(4);
         } else {
            var3.u9(var1.k5() & 255);
         }
      }
   }
}
