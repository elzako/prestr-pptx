package com.aspose.slides.internal.s8;

import com.aspose.slides.internal.k1.z8;

public class z3 extends x8 {
   public com.aspose.slides.internal.y6.u3 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.k1.m3 var2 = new com.aspose.slides.internal.k1.m3();
      var2.n5(var1.k7());
      var2.l6(var1.k7());
      if (var2.l6() != 6) {
         throw new com.aspose.slides.internal.p5.l6("Invalid ObjectType for WmfRegion");
      }

      var2.n5(var1.m3());
      var2.k5(var1.k7());
      var2.u3(var1.k7());
      var2.a6(var1.k7());
      var2.n5((com.aspose.slides.internal.k1.m1)new q0().n5(var1));
      var2.n5(new z8[var2.u9()]);

      for (int var3 = 0; var3 < var2.t2().length; var3++) {
         var2.t2()[var3] = (z8)new k7().n5(var1);
      }

      return var2;
   }
}
