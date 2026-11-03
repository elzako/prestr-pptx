package com.aspose.slides.internal.s8;

import com.aspose.slides.ms.System.d5;

public class l6 extends x8 {
   public com.aspose.slides.internal.y6.u3 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.k1.u3 var2 = new com.aspose.slides.internal.k1.u3();
      var2.n5(var1.c4());
      var2.k5(var1.r4());
      var2.u3(var1.r4());
      var2.n5(var1.r4());
      int var3 = var1.r4();
      if (d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o4.l6.class), var3)) {
         var2.l6(var3 & 65535);
         return var2;
      } else {
         throw new com.aspose.slides.internal.p5.l6("Invalid BitCount value for BitmapCoreHeader");
      }
   }
}
