package com.aspose.slides;

import com.aspose.slides.internal.k4y.g7$n5;

class d6w {
   public static void n5(ISetEffect var0, com.aspose.slides.internal.k4y.p2j var1) {
      if (var1.k5() != null) {
         var0.setTo(j2b.n5(var1.k5()));
      }
   }

   public static void n5(ISetEffect var0, g7$n5 var1, com.aspose.slides.internal.k4y.u2q[] var2) {
      com.aspose.slides.internal.k4y.p2j var3 = (com.aspose.slides.internal.k4y.p2j)var1.n5("set").l6();
      var2[0] = var3.l6();
      if (var0.getTo() != null) {
         com.aspose.slides.internal.k4y.k7v var4 = var3.n5();
         j2b.n5(var0.getTo(), var3.k5());
      }
   }
}
