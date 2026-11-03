package com.aspose.slides.internal.i8;

import com.aspose.slides.ms.System.d1;

public class d2 extends e5 {
   public com.aspose.slides.internal.i0.f0 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.i0.o0 var2 = new com.aspose.slides.internal.i0.o0();
      var2.n5(com.aspose.slides.internal.b4.k5.n5(var1));
      var2.n5(var1.c4() & 4294967295L);
      com.aspose.slides.internal.i0.l6 var3;
      switch ((int)var2.l6()) {
         case 0:
            var3 = null;
            com.aspose.slides.internal.f8y.n5.u3(
               d1.n5(new String[]{"Unknown image type: ", com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.t9.class, var2.l6())})
            );
            break;
         case 1:
            var3 = (com.aspose.slides.internal.i0.u9)new k5().n5(var1);
            break;
         case 2:
            var3 = (com.aspose.slides.internal.i0.v0)new i1().n5(var1);
            break;
         default:
            throw new com.aspose.slides.internal.p5.n5(
               d1.n5(new String[]{"Unknown image type: ", com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.t9.class, var2.l6())})
            );
      }

      var2.n5(var3);
      return var2;
   }
}
