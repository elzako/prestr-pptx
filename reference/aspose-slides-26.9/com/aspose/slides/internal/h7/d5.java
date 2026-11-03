package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.List;

public class d5 implements t9 {
   private final com.aspose.slides.internal.t8.l6 n5;

   public d5(com.aspose.slides.internal.t8.l6 var1) {
      this.n5 = var1;
   }

   @Override
   public final void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      if (var2 != null && var2.size() <= 3) {
         com.aspose.slides.internal.t8.a6 var3 = this.n5.n5();
         com.aspose.slides.internal.g9.h0 var4 = var3.u3();
         float[] var5 = new float[3];

         for (int var6 = 0; var6 < var2.size(); var6++) {
            var5[var6] = ((com.aspose.slides.internal.v2.t2)var2.get_Item(var6)).u3();
         }

         var4.n5(var5);
         var3.l6(var4);
         this.n5.n5(var3);
      }
   }
}
