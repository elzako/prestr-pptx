package com.aspose.slides.internal.l4;

import com.aspose.slides.internal.c3.y8;

public class z8 extends j5 {
   @Override
   public boolean n5(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      if (var1.h0() && var1.t4().l6()) {
         return true;
      } else if (var1.c8()) {
         var2.n5((com.aspose.slides.internal.c3.a6)var1, var2.u9());
         return true;
      } else if (var1.t2()) {
         com.aspose.slides.internal.c3.h0 var3 = (com.aspose.slides.internal.c3.h0)var1;
         com.aspose.slides.internal.j3.q0 var4 = var2.u9().n5(var3.n5(), var3.l6(), var3.k5(), null);
         var2.u9().k5(var4);
         var2.n5(l6);
         return true;
      } else {
         var2.n5(l6);
         return var2.n5(var1);
      }
   }
}
