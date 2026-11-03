package com.aspose.slides.internal.n3;

import com.aspose.slides.ms.System.d1;

public abstract class u3 extends k5 {
   protected abstract com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> u9();

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      if (var1.n5() == 35) {
         com.aspose.slides.internal.k5.u9 var3 = this.u9().n5(d1.a6(var1.t2()));
         if (var3 != null) {
            return var3;
         }
      }

      return super.n5(var1, var2);
   }
}
