package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.q1;

public class z7 implements t9 {
   private final com.aspose.slides.internal.t8.l6 n5;

   public z7(com.aspose.slides.internal.t8.l6 var1) {
      this.n5 = var1;
   }

   @Override
   public final void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      com.aspose.slides.internal.t8.a6 var3 = this.n5.n5();
      float var4 = ((com.aspose.slides.internal.v2.t2)var2.get_Item(0)).u3() * 255.0F;
      float var5 = ((com.aspose.slides.internal.v2.t2)var2.get_Item(1)).u3() * 255.0F;
      float var6 = ((com.aspose.slides.internal.v2.t2)var2.get_Item(2)).u3() * 255.0F;
      var3.n5(
         com.aspose.slides.internal.o9b.c8.n5(
               var3.a0().s7() & 255,
               com.aspose.slides.internal.v6g.k5.u3(q1.u3(var4), 14),
               com.aspose.slides.internal.v6g.k5.u3(q1.u3(var5), 14),
               com.aspose.slides.internal.v6g.k5.u3(q1.u3(var6), 14)
            )
            .o8()
      );
      this.n5.n5(var3);
   }
}
