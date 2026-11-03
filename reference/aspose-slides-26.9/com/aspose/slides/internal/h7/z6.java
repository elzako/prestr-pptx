package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;

public class z6 implements t9 {
   private final com.aspose.slides.internal.t8.l6 n5;
   private final Stack<com.aspose.slides.internal.e7.t2> l6;

   public z6(com.aspose.slides.internal.t8.l6 var1, Stack<com.aspose.slides.internal.e7.t2> var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      if (var2 != null && var2.size() >= 2) {
         com.aspose.slides.internal.v2.c8 var3 = (com.aspose.slides.internal.v2.c8)var2.get_Item(0);
         float var4 = ((com.aspose.slides.internal.v2.t2)var2.get_Item(1)).u3();
         com.aspose.slides.internal.t8.a6 var5 = this.n5.n5();
         com.aspose.slides.internal.t8.c8 var6 = var5.t2().t2();
         var6.n5(var4);
         com.aspose.slides.internal.e7.t2 var7 = this.l6.peek();
         String var8 = var3.n5();
         com.aspose.slides.internal.u1.u3 var9;
         if (var7.l6().containsKey(var8)) {
            var9 = var7.l6().get_Item(var8);
         } else {
            var9 = com.aspose.slides.internal.u1.h0.n5();
         }

         var6.n5(var9);
         var5.n5(var6.t2());
         this.n5.n5(var5);
      }
   }
}
