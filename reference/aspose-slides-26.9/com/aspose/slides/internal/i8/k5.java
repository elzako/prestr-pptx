package com.aspose.slides.internal.i8;

import com.aspose.slides.ms.System.d1;

public class k5 extends e5 {
   public com.aspose.slides.internal.i0.f0 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.i0.u9 var2 = new com.aspose.slides.internal.i0.u9();
      var2.k5(var1.m3());
      var2.n5(var1.m3());
      var2.l6(var1.m3());
      var2.n5(var1.c4() & 4294967295L);
      var2.l6(var1.c4() & 4294967295L);
      long var3 = var1.x8().getPosition();
      com.aspose.slides.internal.i0.l6 var5;
      switch ((int)var2.t2()) {
         case 0:
            var5 = (com.aspose.slides.internal.i0.h0)new l6(var2).n5(var1);
            break;
         case 1:
            var5 = (com.aspose.slides.internal.i0.z8)new t4().n5(var1);
            break;
         default:
            throw new com.aspose.slides.internal.p5.n5(
               d1.n5(new String[]{"Unknown bitmap data type: ", com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.n5.class, var2.t2())})
            );
      }

      var2.n5(var5);
      return var2;
   }
}
