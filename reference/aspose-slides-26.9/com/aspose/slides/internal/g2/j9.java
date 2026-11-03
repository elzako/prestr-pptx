package com.aspose.slides.internal.g2;

public class j9 extends com.aspose.slides.internal.o6.l6 {
   @Override
   public boolean l6(com.aspose.slides.internal.i3.v4[] var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.i3.e9 var3 = new com.aspose.slides.internal.i3.e9(var1[0]);
      com.aspose.slides.internal.z0k.n5 var4 = new com.aspose.slides.internal.z0k.n5(var2);
      int var5 = var4.r4();
      if (com.aspose.slides.ms.System.d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o4.u9.class), var5)) {
         var3.n5(var5 & 65535);
         var3.l6(var4.r4());
         var3.u3(var4.r4());
         var3.a6(var4.r4());
         var3.u9(var4.r4());
         var3.h0(var4.r4());
         var3.c8(var4.r4());
         var3.t2(var4.r4());
         var3.s7(var4.r4());
         var3.n5(
            (com.aspose.slides.internal.k1.t2)new com.aspose.slides.internal.s8.u9(var3.z1() & 4294967295L, (int)((var3.e2() & 4294967295L) * 2L)).l6(var4)
         );
         var1[0] = var3;
         return true;
      } else {
         com.aspose.slides.internal.f8y.n5.l6("Invalid ColorUsage value for WmfSetDibToDev");
         return false;
      }
   }
}
