package com.aspose.slides.internal.v6;

import com.aspose.slides.internal.b9.g8;
import com.aspose.slides.internal.b9.s9;

public abstract class i1 extends com.aspose.slides.internal.r5.a6 {
   protected i1(com.aspose.slides.internal.r5.y4 var1) {
      super(var1);
   }

   @Override
   public void u9(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      g8 var3 = (g8)var1;
      com.aspose.slides.internal.o9b.y2 var4 = var3.n5().c8().n3();
      this.n5(var3, var2);
   }

   @Override
   public boolean h0(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      return true;
   }

   protected abstract void n5(g8 var1, com.aspose.slides.internal.r6.u9 var2);
}
