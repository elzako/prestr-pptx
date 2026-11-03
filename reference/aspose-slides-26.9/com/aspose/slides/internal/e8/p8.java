package com.aspose.slides.internal.e8;

public class p8 extends com.aspose.slides.internal.k4.l6 {
   @Override
   public com.aspose.slides.internal.g1.n5 n5(
      com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3
   ) {
      com.aspose.slides.internal.i3.e5 var4 = (com.aspose.slides.internal.i3.e5)var1;
      if (var4.k5().length <= 0) {
         return com.aspose.slides.internal.g1.n5.k5();
      }

      com.aspose.slides.internal.o9b.y2 var5 = new com.aspose.slides.internal.o9b.y2(var4.k5()[0].u3().k5(), new com.aspose.slides.internal.o9b.p8());

      for (int var6 = 0; var6 < var4.k5().length; var6++) {
         com.aspose.slides.internal.o9b.y2.l6(
               var5.n3(), new com.aspose.slides.internal.o9b.y2(var4.k5()[var6].u3().k5(), new com.aspose.slides.internal.o9b.p8())
            )
            .u3(var5);
      }

      return new com.aspose.slides.internal.g1.n5(var5.n3());
   }
}
