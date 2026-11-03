package com.aspose.slides.internal.b3;

import com.aspose.slides.internal.h2.a5;

public class l6 extends s7 {
   @Override
   public int n5() {
      return 0;
   }

   @Override
   public a5 n5(a5[] var1, j5 var2) {
      com.aspose.slides.internal.f2.u3 var3 = var2.u3().a6(195).u9();
      com.aspose.slides.internal.e5.w1 var4 = var2.u3();

      while (var4 != null && !com.aspose.slides.internal.v6g.k5.l6(var4.n5(), com.aspose.slides.internal.v4.k7.class)) {
         var4 = var4.k5();
      }

      if (var4 == null) {
         throw new z8("body-start() called from outside an fo:list-item");
      }

      com.aspose.slides.internal.f2.u3 var5 = var4.a6(233).u9();
      return (a5)m1.n5(var3, var5);
   }
}
