package com.aspose.slides.internal.n3;

import com.aspose.slides.internal.k5.l6$n5;

public abstract class y4 extends n3 {
   public abstract com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> a6();

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      switch (var1.n5()) {
         case 12:
            return l6$n5.n5;
         case 35:
            com.aspose.slides.internal.k5.u9 var3 = this.a6().n5(var1.t2());
            if (var3 == null) {
               throw this.n5(var1.t2());
            }

            return var3;
         default:
            return super.n5(var1, var2);
      }
   }
}
