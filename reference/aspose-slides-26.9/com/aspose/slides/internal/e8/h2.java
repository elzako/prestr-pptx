package com.aspose.slides.internal.e8;

public class h2 extends com.aspose.slides.internal.k4.l6 {
   @Override
   public com.aspose.slides.internal.g1.n5 n5(
      com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3
   ) {
      com.aspose.slides.internal.i3.p3 var4 = (com.aspose.slides.internal.i3.p3)var1;
      if ((var4.n5() & 65535) < var3.h0().length) {
         com.aspose.slides.internal.k1.m3 var5 = com.aspose.slides.internal.v6g.k5.n5(var3.h0()[var4.n5() & 65535], com.aspose.slides.internal.k1.m3.class);
         if (var5 != null) {
            var3.k5(var5.c8().u9().n3());
         }
      }

      return com.aspose.slides.internal.g1.n5.k5();
   }
}
