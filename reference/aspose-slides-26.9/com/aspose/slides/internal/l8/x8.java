package com.aspose.slides.internal.l8;

public class x8 extends z1 {
   @Override
   protected boolean n5(com.aspose.slides.internal.i3.q0[] var1, com.aspose.slides.internal.z0k.n5 var2) {
      com.aspose.slides.internal.q6.n3 var3 = new com.aspose.slides.internal.q6.n3(var1[0]);
      var3.n5(var2.c4());
      if ((var3.k5() & 4294967295L) > (var3.l6() & 65535)) {
         com.aspose.slides.internal.f8y.n5.u3("ByteCount SHOULD be greater than or equal to the value of the Size field");
         return false;
      } else {
         var3.u3(var2.c4());
         var3.n5(com.aspose.slides.internal.o6.u3.n5(3L, var2));
         var3.n5(var2.c8((int)((((var3.k5() & 4294967295L) - 4L & 4294967295L) - 4L & 4294967295L) - 24L)));
         var1[0] = var3;
         return true;
      }
   }
}
