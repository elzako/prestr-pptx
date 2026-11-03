package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.List;

public class t2 implements t9 {
   private final com.aspose.slides.internal.t8.l6 n5;

   public t2(com.aspose.slides.internal.t8.l6 var1) {
      this.n5 = var1;
   }

   @Override
   public final void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      if (var2 != null && var2.size() >= 6) {
         com.aspose.slides.internal.x4g.m1 var3 = new com.aspose.slides.internal.x4g.m1(
            ((com.aspose.slides.internal.v2.t2)var2.get_Item(0)).u3(),
            ((com.aspose.slides.internal.v2.t2)var2.get_Item(1)).u3(),
            ((com.aspose.slides.internal.v2.t2)var2.get_Item(2)).u3(),
            ((com.aspose.slides.internal.v2.t2)var2.get_Item(3)).u3(),
            ((com.aspose.slides.internal.v2.t2)var2.get_Item(4)).u3(),
            ((com.aspose.slides.internal.v2.t2)var2.get_Item(5)).u3()
         );
         com.aspose.slides.internal.t8.a6 var4 = this.n5.n5();
         var3.n5(var4.n5(), 1);
         var4.n5(var3);
      }
   }
}
