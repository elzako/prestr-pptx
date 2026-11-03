package com.aspose.slides.internal.e5;

import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.internal.h2.h2;
import com.aspose.slides.internal.h2.x9;
import com.aspose.slides.ms.System.d1;

public class f2 extends com.aspose.slides.internal.h2.a0 {
   @Override
   public a5 l6(int var1, a5 var2, h2 var3, w1 var4) {
      String var5 = var2.j_();
      int var6 = d1.u3(var5, '-');
      if (var1 == 134) {
         return var6 == -1 ? var2 : x9.l6(com.aspose.slides.internal.v3.x8.n5(var5, 0, var6));
      } else if (var1 == 81 && var6 != -1) {
         int var7 = d1.l6(var5, '-', var6 + 1);
         return var7 != -1 ? x9.l6(com.aspose.slides.internal.v3.x8.n5(var5, var6 + 1, var7)) : x9.l6(d1.k5(var5, var6 + 1));
      } else {
         return null;
      }
   }
}
