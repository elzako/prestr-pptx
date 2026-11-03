package com.aspose.slides.internal.h2;

import com.aspose.slides.Collections.Generic.List;

public class n5$l6 extends a0 {
   @Override
   public a5 l6(int var1, a5 var2, h2 var3, com.aspose.slides.internal.e5.w1 var4) {
      byte var5 = -1;
      List var6 = var2.t_();
      if (var1 == 12) {
         var5 = 0;
      } else if (var1 == 13) {
         var5 = 1;
      }

      return var5 >= 0 ? var3.l6((a5)var6.get_Item(var5), var4, var4.n5()) : null;
   }
}
