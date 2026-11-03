package com.aspose.slides.internal.v6;

import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.b9.z6;

public abstract class y4 extends com.aspose.slides.internal.r5.a6 {
   protected y4(com.aspose.slides.internal.r5.y4 var1) {
      super(var1);
   }

   @Override
   public void u9(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      z6 var3 = (z6)var1;
      if (var2.e2()) {
         var2.y4().n5(var2.k7().k5(), var3.n5().k5().k5());
         var2.l6(var3.n5().k5().k5());
      } else {
         if (var2.c8() != null) {
            this.n5(var3.n5().k5().k5(), var2);
         }

         var2.n5(var3.n5().k5().k5());
      }
   }

   @Override
   public boolean h0(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      return !var2.e2();
   }

   protected abstract void n5(com.aspose.slides.internal.o9b.j5 var1, com.aspose.slides.internal.r6.u9 var2);
}
