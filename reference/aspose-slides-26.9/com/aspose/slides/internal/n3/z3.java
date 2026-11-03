package com.aspose.slides.internal.n3;

import com.aspose.slides.internal.k5.l6$n5;
import com.aspose.slides.ms.System.d1;

public abstract class z3 extends h0 {
   protected abstract com.aspose.slides.internal.k5.u9 l6(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2);

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      switch (var1.n5()) {
         case 12:
            return l6$n5.n5;
         case 24:
         case 36:
            return new com.aspose.slides.internal.y4.t4(var1.t2());
         case 35:
            com.aspose.slides.internal.k5.u9 var3 = this.a6().n5(d1.a6(var1.t2()));
            if (var3 == null) {
               throw this.n5(var1.t2());
            }

            return var3;
         case 41:
            return this.l6(var1, var2);
         default:
            throw com.aspose.slides.internal.z8.u9.n5(var1.n5());
      }
   }
}
