package com.aspose.slides.internal.b3;

import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.internal.h2.t1;

public class e2 extends s7 {
   @Override
   public int n5() {
      return 0;
   }

   @Override
   public a5 n5(a5[] var1, j5 var2) {
      com.aspose.slides.internal.f2.k5 var3 = var2.u3().a6(195).c8();
      com.aspose.slides.internal.f2.k5 var4 = var2.u3().u9(196).c8();
      com.aspose.slides.internal.e5.w1 var5 = var2.u3();

      while (var5 != null && !com.aspose.slides.internal.v6g.k5.l6(var5.n5(), com.aspose.slides.internal.v4.k7.class)) {
         var5 = var5.k5();
      }

      if (var5 == null) {
         throw new z8("label-end() called from outside an fo:list-item");
      }

      com.aspose.slides.internal.f2.k5 var6 = var5.a6(233).c8();
      com.aspose.slides.internal.f2.h0 var7 = new com.aspose.slides.internal.f2.h0(var2.u3(), 4);
      t1 var8 = new t1(1.0, var7);
      com.aspose.slides.internal.f2.u3 var9 = var3;
      var9 = m1.n5(var9, var6);
      var9 = m1.l6(var9, var4);
      var9 = m1.l6(var8, var9);
      return (a5)var9;
   }
}
