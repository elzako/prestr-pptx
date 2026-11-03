package com.aspose.slides.internal.g2;

public class z3 extends com.aspose.slides.internal.o6.l6 {
   @Override
   public boolean l6(com.aspose.slides.internal.i3.v4[] var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.i3.m1 var3 = new com.aspose.slides.internal.i3.m1(var1[0]);
      com.aspose.slides.internal.z0k.n5 var4 = new com.aspose.slides.internal.z0k.n5(var2);
      int var5 = var4.r4();
      if (com.aspose.slides.ms.System.d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o4.c8.class), var5)) {
         var3.n5(var5 & 65535);
         var3.n5((com.aspose.slides.internal.k1.c8)new com.aspose.slides.internal.s8.a6().n5(var4));
         var3.l6(var4.k7());
         var3.n5(var4.k7());
         var1[0] = var3;
         return true;
      } else {
         com.aspose.slides.internal.f8y.n5.l6("Invalid Mode value for WmfExtFloodFill");
         return false;
      }
   }
}
