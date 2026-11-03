package com.aspose.slides.internal.d3;

public class x8 extends t9 {
   @Override
   protected boolean n5(com.aspose.slides.internal.i3.q0 var1, com.aspose.slides.internal.z0k.l6 var2) {
      com.aspose.slides.internal.q6.n3 var3 = (com.aspose.slides.internal.q6.n3)var1;
      var2.n5(var3.k5() & 4294967295L);
      if ((var3.k5() & 4294967295L) > (var3.l6() & 65535)) {
         com.aspose.slides.internal.f8y.n5.u3("ByteCount SHOULD be greater than or equal to the value of the Size field");
         return false;
      } else {
         var2.n5(var3.u3() & 4294967295L);
         com.aspose.slides.internal.t7.u3.n5(var2, var3.u9());
         var2.n5(var3.h0());
         return true;
      }
   }
}
