package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.List;

public class j8 implements t9 {
   private final com.aspose.slides.internal.t8.l6 n5;

   public j8(com.aspose.slides.internal.t8.l6 var1) {
      this.n5 = var1;
   }

   @Override
   public void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      if (var2 != null && var2.size() >= 1) {
         com.aspose.slides.internal.v2.t2 var3 = (com.aspose.slides.internal.v2.t2)var2.get_Item(0);
         com.aspose.slides.internal.t8.a6 var4 = this.n5.n5();
         com.aspose.slides.internal.t8.c8 var5 = var4.t2().t2();
         var5.n5(var3.k5());
         var4.n5(var5.t2());
         this.n5.n5(var4);
      }
   }
}
