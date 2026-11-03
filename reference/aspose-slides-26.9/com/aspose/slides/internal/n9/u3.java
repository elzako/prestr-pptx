package com.aspose.slides.internal.n9;

import com.aspose.slides.internal.b9.i9;
import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.x4g.m1;

public class u3 extends com.aspose.slides.internal.r6.u3 {
   @Override
   protected void u3(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      u9(var1, var2);
   }

   public static void u9(s9 var0, com.aspose.slides.internal.r6.u9 var1) {
      i9 var2 = (i9)var0;
      m1 var3 = var1.l6();
      var3.l6(var1.x9());
      var1.v0().l6(var2.n5().n5() * var3.n5()[0] + var2.n5().l6() * var3.n5()[2], var2.n5().l6() * var3.n5()[3] + var2.n5().n5() * var3.n5()[1]);
   }
}
