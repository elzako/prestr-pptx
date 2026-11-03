package com.aspose.slides.internal.n3;

import com.aspose.slides.internal.k5.l6$n5;
import com.aspose.slides.ms.System.d1;

public abstract class h0 extends m1 {
   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      switch (var1.n5()) {
         case 12:
            return l6$n5.n5;
         case 35:
            String var3 = d1.a6(var1.t2());
            com.aspose.slides.internal.k5.u9 var4 = this.a6().n5(var3);
            if (var4 != null) {
               return var4;
            } else {
               if ("initial".equals(var3)) {
                  return l6$n5.y8;
               }

               throw this.n5(var1.t2());
            }
         default:
            throw this.n5(var1.n5());
      }
   }

   public abstract com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> a6();
}
