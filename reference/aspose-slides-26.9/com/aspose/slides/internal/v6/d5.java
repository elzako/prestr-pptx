package com.aspose.slides.internal.v6;

import com.aspose.slides.internal.b9.p7;
import com.aspose.slides.internal.b9.s9;

public abstract class d5 extends com.aspose.slides.internal.r5.a6 {
   protected d5(com.aspose.slides.internal.r5.y4 var1) {
      super(var1);
   }

   @Override
   public void u9(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      p7 var3 = (p7)var1;
      com.aspose.slides.internal.o9b.y2 var4 = var3.n5().c8().n3();
      if (var2.c8() == null) {
         var4.l6(var4.t2() - 1);
         var4.n5(var4.l6() - 1);
      }

      if (var2.e2()) {
         var2.y4().l6(var4.n3());
      } else {
         this.n5(var4.n3(), var2);
      }
   }

   @Override
   public boolean h0(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      return !var2.e2();
   }

   protected abstract void n5(com.aspose.slides.internal.o9b.y2 var1, com.aspose.slides.internal.r6.u9 var2);
}
