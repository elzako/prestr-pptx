package com.aspose.slides.internal.a3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.v0.h0;
import com.aspose.slides.internal.v0.s7;

public class u3 extends List<k5> {
   public final void n5(h0 var1) {
      com.aspose.slides.internal.r4.u3 var2 = new com.aspose.slides.internal.r4.u3<>(this);

      while (var2.l6()) {
         k5 var3 = (k5)var2.k5();
         l6 var4 = var3.l6();
         s7 var5 = var4.l6(var1);
         if (var5 != null) {
            String var6 = var1.n5(var5);
            l6 var7 = var3.n5();
            List var8 = var7.u3();
            com.aspose.slides.internal.r4.u3 var9 = new com.aspose.slides.internal.r4.u3(var8);

            while (var9.l6()) {
               s7 var10 = (s7)var9.k5();
               var1.n5(var6, var10);
            }
         }
      }
   }
}
