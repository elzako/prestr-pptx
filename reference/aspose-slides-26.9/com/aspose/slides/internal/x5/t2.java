package com.aspose.slides.internal.x5;

import com.aspose.slides.internal.i0.a7;
import com.aspose.slides.internal.i8.v3;

public class t2 extends com.aspose.slides.internal.b4.n5 {
   @Override
   public boolean n5(com.aspose.slides.internal.a4.b3[] var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.a4.x8 var3 = new com.aspose.slides.internal.a4.x8(var1[0]);
      com.aspose.slides.internal.z0k.n5 var4 = new com.aspose.slides.internal.z0k.n5(var2);
      var3.k5(var4.m3());
      var3.n5(var4.c4() & 4294967295L);
      var3.l6(var4.c4());
      var3.u3(var4.m3());
      var3.n5(com.aspose.slides.internal.o6.n5.n5(var3.t2(), var4));
      if ((var3.c8() & 1L) > 0L) {
         var3.n5(com.aspose.slides.internal.o6.n5.n5(var3.x8()));
      }

      var3.n5(com.aspose.slides.internal.b4.k5.k5(var3.t2(), var4));
      if ((var3.e2() & 4294967295L) == 1L) {
         var3.n5((a7)new v3().n5(var4));
      }

      var1[0] = var3;
      return true;
   }
}
