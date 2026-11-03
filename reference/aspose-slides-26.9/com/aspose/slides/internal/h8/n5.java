package com.aspose.slides.internal.h8;

import com.aspose.slides.internal.b9.h5;
import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.e1.t2;
import com.aspose.slides.internal.r6.u9;
import com.aspose.slides.internal.z9.c8;

public class n5 extends c8 {
   @Override
   protected void u9(s9 var1, u9 var2) {
      h5 var3 = (h5)var1;
      t2 var4 = var2.n5();
      int var5 = var3.n5();
      if (var5 < 0) {
         var5 = -var5;
         if (var5 > var2.y0()) {
            var5 = var2.y0();
         }
      } else {
         var5 = var2.y0() - var5;
      }

      while (var5 > 0) {
         t2 var6 = var4;
         if (var4.a6() != null) {
            var6 = (t2)var4.y2();
         }

         if (var6.a6() != null) {
            var6.n5((r4)null);
         }

         if (var6.y2() == null) {
            break;
         }

         var4 = (t2)var6.y2();
         var5--;
      }

      var2.n5(var4);
      super.u9(var1, var2);
   }
}
