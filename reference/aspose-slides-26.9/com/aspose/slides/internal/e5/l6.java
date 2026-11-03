package com.aspose.slides.internal.e5;

import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.internal.h2.h2;
import com.aspose.slides.ms.System.d1;

public class l6 extends com.aspose.slides.internal.h2.a0 {
   @Override
   protected a5 n5(int var1, a5 var2, h2 var3, w1 var4) {
      String var5 = s7.n5(var1);
      a5 var6 = null;
      int var7 = var2.t_().size();
      if (d1.c8(var5, "-top") >= 0) {
         var6 = this.n5(var2, 0);
      } else if (d1.c8(var5, "-right") >= 0) {
         var6 = this.n5(var2, var7 > 1 ? 1 : 0);
      } else if (d1.c8(var5, "-bottom") >= 0) {
         var6 = this.n5(var2, var7 > 2 ? 2 : 0);
      } else if (d1.c8(var5, "-left") >= 0) {
         var6 = this.n5(var2, var7 > 3 ? 3 : (var7 > 1 ? 1 : 0));
      }

      return var6 != null ? var3.n5(var4, var6, null) : var6;
   }
}
