package com.aspose.slides.internal.e8;

public class z8 extends com.aspose.slides.internal.k4.l6 {
   @Override
   public com.aspose.slides.internal.g1.n5 n5(
      com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3
   ) {
      com.aspose.slides.internal.i3.j5 var4 = (com.aspose.slides.internal.i3.j5)var1;
      if ((var4.n5() & 65535) >= var3.h0().length) {
         return com.aspose.slides.internal.g1.n5.k5();
      } else {
         com.aspose.slides.internal.k1.m3 var5 = com.aspose.slides.internal.v6g.k5.n5(var3.h0()[var4.n5() & 65535], com.aspose.slides.internal.k1.m3.class);
         if (var5 != null) {
            com.aspose.slides.internal.k1.m1 var6 = var5.c8();
            return com.aspose.slides.internal.g1.n5.n5(var6.n5() - var4.u3(), var6.l6() - var4.k5(), var6.k5() + var4.u3(), var6.u3() + var4.k5());
         } else {
            return com.aspose.slides.internal.g1.n5.k5();
         }
      }
   }
}
