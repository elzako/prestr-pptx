package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.q1;

public class f0 implements t9 {
   private final com.aspose.slides.internal.t8.l6 n5;

   public f0(com.aspose.slides.internal.t8.l6 var1) {
      this.n5 = var1;
   }

   @Override
   public final void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      com.aspose.slides.internal.t8.a6 var3 = this.n5.n5();
      int var4 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(((com.aspose.slides.internal.v2.t2)var2.get_Item(0)).u3() * 255.0F), 14);
      var3.l6(com.aspose.slides.internal.o9b.c8.n5(var3.p8().s7() & 255, var4, var4, var4).o8());
      this.n5.n5(var3);
   }
}
