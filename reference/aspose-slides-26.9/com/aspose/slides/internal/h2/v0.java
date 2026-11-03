package com.aspose.slides.internal.h2;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class v0 extends v4$n5 {
   public v0(int var1) {
      super(var1);
   }

   @Override
   public a5 n5(int var1, com.aspose.slides.internal.e5.w1 var2, boolean var3, boolean var4) {
      a5 var5 = super.n5(0, var2, var3, var4);
      int var6 = 0;
      if (var5 != null) {
         var6 = var5.u9().u3();
      }

      if (q1.n5(var6) % 90 == 0 && q1.n5(var6) / 90 <= 3) {
         return var5;
      } else {
         throw new com.aspose.slides.internal.b3.z8(
            d1.n5("Illegal property value: ", "reference-orientation=\"", com.aspose.slides.ms.System.a3.l6(var6), "\" ", "on ", var2.n5().t9())
         );
      }
   }
}
