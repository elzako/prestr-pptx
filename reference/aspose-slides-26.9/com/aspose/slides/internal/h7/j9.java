package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.ms.System.q1;

public class j9 implements t9 {
   private final com.aspose.slides.internal.t8.l6 n5;
   private final Stack<com.aspose.slides.internal.e7.t2> l6;

   public j9(com.aspose.slides.internal.t8.l6 var1, Stack<com.aspose.slides.internal.e7.t2> var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      if (var2 != null && var2.size() >= 1) {
         com.aspose.slides.internal.t8.a6 var3 = this.n5.n5();
         com.aspose.slides.internal.e7.t2 var4 = this.l6.peek();
         com.aspose.slides.internal.g9.a6 var5 = var4.n5().get_Item(var3.y1());
         com.aspose.slides.internal.g9.h0 var6 = var3.k5();
         if (var5 != null) {
            com.aspose.slides.internal.g9.t4 var7 = (com.aspose.slides.internal.g9.t4)var5;
            var5 = var7.l6();
            com.aspose.slides.internal.v2.n5 var8 = var7.l6((com.aspose.slides.internal.v2.s7)var2.get_Item(0));
            var6.n5(var8.l6());
            if (var8.n5() == 1) {
               int var9 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(((com.aspose.slides.internal.v2.t2)var8.k5(0)).u3() * 255.0F), 14);
               var3.l6(com.aspose.slides.internal.o9b.c8.n5(var3.p8().s7() & 255, var9, var9, var9).o8());
            } else if (var8.n5() == 3) {
               int var13 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(((com.aspose.slides.internal.v2.t2)var8.k5(0)).u3() * 255.0F), 14);
               int var10 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(((com.aspose.slides.internal.v2.t2)var8.k5(1)).u3() * 255.0F), 14);
               int var11 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(((com.aspose.slides.internal.v2.t2)var8.k5(2)).u3() * 255.0F), 14);
               var3.l6(com.aspose.slides.internal.o9b.c8.n5(var3.p8().s7() & 255, var13, var10, var11).o8());
            }

            var3.n5(var6);
            this.n5.n5(var3);
         }
      }
   }
}
