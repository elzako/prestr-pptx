package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.q1;

public class b3 implements t9 {
   private final com.aspose.slides.internal.t8.l6 n5;

   public b3(com.aspose.slides.internal.t8.l6 var1) {
      this.n5 = var1;
   }

   @Override
   public final void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      com.aspose.slides.internal.t8.a6 var3 = this.n5.n5();
      if (var2.size() == 1) {
         int var4 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(((com.aspose.slides.internal.v2.t2)var2.get_Item(0)).u3() * 255.0F), 14);
         var3.n5(com.aspose.slides.internal.o9b.c8.n5(var3.a0().s7() & 255, var4, var4, var4).o8());
      } else if (var2.size() == 3) {
         int var7 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(((com.aspose.slides.internal.v2.t2)var2.get_Item(0)).u3() * 255.0F), 14);
         int var5 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(((com.aspose.slides.internal.v2.t2)var2.get_Item(1)).u3() * 255.0F), 14);
         int var6 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(((com.aspose.slides.internal.v2.t2)var2.get_Item(2)).u3() * 255.0F), 14);
         var3.n5(com.aspose.slides.internal.o9b.c8.n5(var3.a0().s7() & 255, var7, var5, var6).o8());
      }

      this.n5.n5(var3);
   }
}
