package com.aspose.slides.internal.m4;

import com.aspose.slides.internal.a4.a3;
import com.aspose.slides.internal.a4.b3;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.x4g.m1;

public class u3 extends com.aspose.slides.internal.x3.k5 {
   @Override
   protected void l6(b3 var1, com.aspose.slides.internal.x3.a6 var2) {
      a3 var3 = (a3)var1;
      y1 var4 = var3.u3().n5().y4();
      a0 var5 = new a0(var4.y4());
      m1 var6 = var2.z1();
      var6.n5(var2.u3(), 1);
      var5.l6(var6);
      switch (var3.k5() & 0xFF) {
         case 0:
            var2.n5(var5);
            break;
         case 1:
            var2.k5().k5(var5);
            break;
         case 2:
            var2.k5().u3(var5);
            break;
         case 3:
            var2.k5().a6(var5);
            break;
         case 4:
            var2.k5().l6(var5);
            break;
         case 5:
            var2.k5().n5(var5);
      }
   }
}
