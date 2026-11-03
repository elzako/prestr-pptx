package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.List;

public class t4 implements t9 {
   private final com.aspose.slides.internal.k0.u3 n5;

   public t4(com.aspose.slides.internal.k0.u3 var1) {
      this.n5 = var1;
   }

   @Override
   public void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      if (var2 != null && var2.size() >= 2) {
         com.aspose.slides.internal.v2.t2 var3 = (com.aspose.slides.internal.v2.t2)var2.get_Item(0);
         com.aspose.slides.internal.v2.t2 var4 = (com.aspose.slides.internal.v2.t2)var2.get_Item(1);
         com.aspose.slides.internal.x4g.m1 var5 = new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, var3.u3(), var4.u3());
         var5.n5(this.n5.k5(), 1);
         this.n5.l6(var5);
         this.n5.n5(this.n5.k5().u9());
      }
   }
}
