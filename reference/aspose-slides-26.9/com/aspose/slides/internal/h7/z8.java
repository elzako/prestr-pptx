package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.List;

public class z8 implements t9 {
   private final com.aspose.slides.internal.t8.l6 n5;

   public z8(com.aspose.slides.internal.t8.l6 var1) {
      this.n5 = var1;
   }

   @Override
   public final void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      if (var2 != null && var2.size() > 0) {
         com.aspose.slides.internal.v2.s7 var3 = (com.aspose.slides.internal.v2.s7)var2.get_Item(var2.size() - 1);
         if (com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.v2.t2.class)) {
            com.aspose.slides.internal.v2.t2 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.v2.t2.class);
            com.aspose.slides.internal.t8.a6 var5 = this.n5.n5();
            com.aspose.slides.internal.t8.c8 var6 = var5.t2().t2();
            var6.a6(var4.u3());
            var5.n5(var6.t2());
            this.n5.n5(var5);
         }
      }
   }
}
