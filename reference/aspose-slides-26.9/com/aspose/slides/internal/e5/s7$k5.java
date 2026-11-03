package com.aspose.slides.internal.e5;

import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.internal.h2.u9$n5;

class s7$k5 extends u9$n5 {
   public s7$k5(int var1) {
      super(var1);
   }

   @Override
   protected a5 n5(a5 var1, w1 var2, t9 var3) {
      String var4 = var1.i_();
      if (var4 != null) {
         t9 var5 = var3 == null ? var2.n5() : var3;
         com.aspose.slides.internal.y1.u3 var6 = var5 == null ? null : var5.q_();
         return com.aspose.slides.internal.h2.u9.n5(var6, var4);
      } else {
         return super.n5(var1, var2, var3);
      }
   }
}
