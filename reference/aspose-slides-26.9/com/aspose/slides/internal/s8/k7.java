package com.aspose.slides.internal.s8;

import com.aspose.slides.internal.k1.j5;
import com.aspose.slides.internal.k1.z8;

public class k7 extends x8 {
   public com.aspose.slides.internal.y6.u3 n5(com.aspose.slides.internal.z0k.n5 var1) {
      z8 var2 = new z8();
      var2.n5(var1.r4());
      var2.l6(var1.r4());
      var2.k5(var1.r4());
      var2.n5(new j5[(var2.n5() & 65535) / 2]);

      for (int var3 = 0; var3 < (var2.n5() & 65535) / 2; var3++) {
         var2.u3()[var3] = (j5)new m1().n5(var1);
      }

      var2.u3(var1.r4());
      if ((var2.n5() & 65535) != (var2.u9() & 65535)) {
         com.aspose.slides.internal.f8y.n5.k5("Warning: WmfScan.Count != WmfScan.Count2");
      }

      return var2;
   }
}
