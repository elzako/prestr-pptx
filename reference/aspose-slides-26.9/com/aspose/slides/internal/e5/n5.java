package com.aspose.slides.internal.e5;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.internal.h2.h2;

public class n5 extends com.aspose.slides.internal.h2.a0 {
   @Override
   protected a5 n5(int var1, a5 var2, h2 var3, w1 var4) {
      List var5 = var2.t_();
      if (var5 != null) {
         if (var5.size() == 1) {
            a5 var8 = (a5)var5.get_Item(0);
            return new com.aspose.slides.internal.h2.i1(var8);
         }

         if (var5.size() == 2) {
            a5 var6 = (a5)var5.get_Item(0);
            a5 var7 = (a5)var5.get_Item(1);
            return new com.aspose.slides.internal.h2.i1(var6, var7);
         }
      }

      throw new com.aspose.slides.internal.b3.z8("list with 1 or 2 length values expected");
   }
}
