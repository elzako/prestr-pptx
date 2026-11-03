package com.aspose.slides.internal.m4;

import com.aspose.slides.internal.a4.b3;
import com.aspose.slides.internal.a4.f0;
import com.aspose.slides.internal.n2d.y4;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;

public class k5 extends com.aspose.slides.internal.x3.k5 {
   @Override
   protected void l6(b3 var1, com.aspose.slides.internal.x3.a6 var2) {
      f0 var3 = (f0)var1;
      var2.l6(var3.u3() & 255);
      m1 var4 = var2.z1();
      var4.n5(var2.u3(), 1);
      a0 var5 = y4.n5(var2.s7(), var4);
      switch (var3.k5() & 0xFF) {
         case 0:
            var2.n5(var5);
            break;
         case 1:
            z1 var6 = z1.n5(var2.m1());
            a0 var7 = y4.n5(var6, var2.k5(), var5);
            var2.n5(var7);
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
