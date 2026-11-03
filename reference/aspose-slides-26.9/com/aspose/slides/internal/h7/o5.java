package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.q1;

public class o5 implements t9 {
   private final com.aspose.slides.internal.k0.u3 n5;

   public o5(com.aspose.slides.internal.k0.u3 var1) {
      this.n5 = var1;
   }

   @Override
   public final void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      if (var2 != null && var2.size() >= 6) {
         float var3 = ((com.aspose.slides.internal.v2.t2)var2.get_Item(0)).u3();
         float var4 = ((com.aspose.slides.internal.v2.t2)var2.get_Item(1)).u3();
         float var5 = ((com.aspose.slides.internal.v2.t2)var2.get_Item(2)).u3();
         float var6 = ((com.aspose.slides.internal.v2.t2)var2.get_Item(3)).u3();
         float var7 = ((com.aspose.slides.internal.v2.t2)var2.get_Item(4)).u3();
         float var8 = ((com.aspose.slides.internal.v2.t2)var2.get_Item(5)).u3();
         if (this.n5.a6()) {
            com.aspose.slides.internal.x4g.m1 var9 = this.n5.l6();
            if (!var9.l6() && q1.n5(var9.a6() - var8) < 0.05F) {
               var7 = q1.n5(var7, var9.u3());
            }
         }

         this.n5.n5(new com.aspose.slides.internal.x4g.m1(var3, var4, var5, var6, var7, var8));
         this.n5.l6(new com.aspose.slides.internal.x4g.m1(var3, var4, var5, var6, var7, var8));
      }
   }
}
