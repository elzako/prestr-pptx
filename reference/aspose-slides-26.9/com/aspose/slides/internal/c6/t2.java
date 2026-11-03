package com.aspose.slides.internal.c6;

import com.aspose.slides.IPresentation;
import com.aspose.slides.ms.System.q1;

public abstract class t2 {
   private final IPresentation n5;
   private final z8 l6;

   public t2(IPresentation var1, z8 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final void n5() {
      int var1 = this.k5();

      for (int var2 = 0; !this.n5(var2); var2 += var1) {
         this.n5(this.n5, this.l6, var2, var1).n5();
      }
   }

   protected abstract com.aspose.slides.ms.System.c4 n5(z8 var1);

   protected abstract com.aspose.slides.ms.System.c4 l6();

   protected abstract y1 n5(IPresentation var1, z8 var2, int var3, int var4);

   private int k5() {
      com.aspose.slides.ms.System.c4 var1 = this.n5(this.l6).l6();
      int var2 = com.aspose.slides.internal.v6g.k5.u3(q1.n5(com.aspose.slides.ms.System.c4.u9(var1, this.l6()).l6()), 15);
      return com.aspose.slides.internal.v6g.k5.u3(q1.n5(com.aspose.slides.ms.System.c4.u9(var1, com.aspose.slides.internal.v6g.k5.s7(var2, 9)).l6()), 15);
   }

   private boolean n5(int var1) {
      return com.aspose.slides.ms.System.c4.s7(com.aspose.slides.internal.v6g.k5.s7(var1, 9), this.n5(this.l6));
   }
}
