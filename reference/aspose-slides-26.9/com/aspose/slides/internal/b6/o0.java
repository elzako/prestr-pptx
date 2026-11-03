package com.aspose.slides.internal.b6;

public class o0 extends z1 {
   @Override
   public void l6(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3) {
      com.aspose.slides.internal.i3.o0 var4 = (com.aspose.slides.internal.i3.o0)var1;
      short var5 = var4.n5();
      com.aspose.slides.internal.o9b.w1[] var6 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var5)
      );

      for (int var7 = 0; var7 < var5; var7++) {
         var4.l6()[var7].k5().n5(var6[var7]);
      }

      if (var3.t2() != null) {
         var2.l6(var3.t2(), var6);
      }
   }
}
