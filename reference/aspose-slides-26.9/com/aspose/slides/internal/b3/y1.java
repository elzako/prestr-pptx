package com.aspose.slides.internal.b3;

import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.internal.h2.v4;
import com.aspose.slides.ms.System.q1;

public class y1 extends s7 {
   @Override
   public int n5() {
      return 1;
   }

   @Override
   public a5 n5(a5[] var1, j5 var2) {
      double var3 = com.aspose.slides.internal.v6g.k5.u3(var1[0].h0(), double.class);
      double var5 = q1.k5(var3 + 0.5);
      if (var5 == 0.0 && var3 < 0.0) {
         var5 = -var5;
      }

      return v4.n5(var5);
   }
}
