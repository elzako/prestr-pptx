package com.aspose.slides.internal.e8;

public class d2 extends com.aspose.slides.internal.k4.l6 {
   @Override
   public com.aspose.slides.internal.g1.n5 n5(
      com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3
   ) {
      com.aspose.slides.internal.i3.s3 var4 = (com.aspose.slides.internal.i3.s3)var1;
      if ((var4.n5() & 65535) >= var3.h0().length) {
         return com.aspose.slides.internal.g1.n5.k5();
      }

      com.aspose.slides.internal.k1.m3 var5 = com.aspose.slides.internal.v6g.k5.n5(var3.h0()[var4.n5() & 65535], com.aspose.slides.internal.k1.m3.class);
      return var5 != null ? new com.aspose.slides.internal.g1.n5(var5.c8().u9().n3()) : com.aspose.slides.internal.g1.n5.k5();
   }
}
