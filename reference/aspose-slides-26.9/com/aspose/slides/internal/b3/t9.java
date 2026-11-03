package com.aspose.slides.internal.b3;

import com.aspose.slides.internal.h2.a5;

public class t9 extends s7 {
   @Override
   public int n5() {
      return 2;
   }

   @Override
   public a5 n5(a5[] var1, j5 var2) {
      com.aspose.slides.internal.f2.u3 var3 = var1[0].u9();
      com.aspose.slides.internal.f2.u3 var4 = var1[1].u9();
      if (var3 != null && var4 != null) {
         return (a5)m1.a6(var3, var4);
      } else {
         throw new z8("Non numeric operands to max function");
      }
   }
}
