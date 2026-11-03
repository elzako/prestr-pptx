package com.aspose.slides.internal.m4;

import com.aspose.slides.internal.a4.b3;
import com.aspose.slides.internal.a4.p3;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.x4g.m1;

public class a6 extends com.aspose.slides.internal.x3.k5 {
   @Override
   protected void l6(b3 var1, com.aspose.slides.internal.x3.a6 var2) {
      p3 var3 = (p3)var1;
      var2.k5(var3.u3() & 255);
      a0 var4 = var2.x8().l6();
      m1 var5 = var2.z1();
      var5.n5(var2.u3(), 1);
      var4.l6(var5);
      switch (var3.k5() & 0xFF) {
         case 0:
            var2.n5(var4);
            break;
         case 1:
            var2.k5().k5(var4);
            break;
         case 2:
            var2.k5().u3(var4);
            break;
         case 3:
            var2.k5().a6(var4);
            break;
         case 4:
            var2.k5().l6(var4);
            break;
         case 5:
            var2.k5().n5(var4);
      }
   }
}
