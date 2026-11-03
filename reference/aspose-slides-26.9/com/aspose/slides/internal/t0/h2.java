package com.aspose.slides.internal.t0;

import com.aspose.slides.internal.i0.h6;

public class h2 extends y1 {
   public void n5(com.aspose.slides.internal.i0.f0 var1, com.aspose.slides.internal.z0k.l6 var2) {
      h6 var3 = (h6)var1;
      if (var3.n5() != null) {
         if (var3.n5().length > 0) {
            com.aspose.slides.internal.t7.n5.n5(var3.n5(), var2);
         }

         if (var3.l6() != null && var3.l6().length > 0) {
            for (com.aspose.slides.internal.i0.t4 var7 : var3.l6()) {
               new t2().n5(var7, var2);
            }
         }
      }
   }
}
