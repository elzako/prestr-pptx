package com.aspose.slides.internal.o3;

import com.aspose.slides.internal.k1.z8;

public class k7 extends x8 {
   public void n5(com.aspose.slides.internal.z0k.l6 var1, com.aspose.slides.internal.y6.u3 var2) {
      z8 var3 = (z8)var2;
      var1.n5(var3.n5() & 65535);
      var1.n5(var3.l6() & 65535);
      var1.n5(var3.k5() & 65535);

      for (int var4 = 0; var4 < var3.u3().length; var4++) {
         new m1().n5(var1, var3.u3()[var4]);
      }

      var1.n5(var3.u9() & 65535);
   }
}
