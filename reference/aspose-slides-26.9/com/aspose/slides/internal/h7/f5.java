package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.List;

public class f5 implements t9 {
   private final com.aspose.slides.internal.t8.l6 n5;
   private final com.aspose.slides.internal.k0.k5 l6;
   private final com.aspose.slides.internal.t8.n5 k5;

   public f5(com.aspose.slides.internal.t8.l6 var1, com.aspose.slides.internal.k0.k5 var2, com.aspose.slides.internal.t8.n5 var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   @Override
   public final void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      com.aspose.slides.internal.v2.t2 var3 = (com.aspose.slides.internal.v2.t2)var2.get_Item(0);
      com.aspose.slides.internal.v2.t2 var4 = (com.aspose.slides.internal.v2.t2)var2.get_Item(1);
      com.aspose.slides.internal.o9b.w1 var5 = com.aspose.slides.internal.t8.u3.n5(var3.u3(), var4.u3(), this.n5.n5().n5()).u3();
      var5.l6(this.k5.n5() - var5.k5());
      this.l6.n5(var5.u3());
   }
}
