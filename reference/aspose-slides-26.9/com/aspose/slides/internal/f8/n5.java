package com.aspose.slides.internal.f8;

import com.aspose.slides.internal.b9.s0;
import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.r5.n3;
import com.aspose.slides.internal.r6.u9;
import com.aspose.slides.internal.x4g.m1;

public class n5 extends n3 {
   @Override
   public void u9(s9 var1, u9 var2) {
      s0 var3 = (s0)var1;
      switch ((int)var3.n5()) {
         case 1:
            var2.k5(new m1());
            break;
         case 2:
            var2.a3().n5(var3.l6().c8(), 0);
            break;
         case 3:
            var2.a3().n5(var3.l6().c8(), 1);
            break;
         case 4:
            var2.k5(var3.l6().c8());
      }
   }
}
