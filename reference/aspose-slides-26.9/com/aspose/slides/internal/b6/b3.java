package com.aspose.slides.internal.b6;

public class b3 extends z1 {
   @Override
   public void l6(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3) {
      com.aspose.slides.internal.i3.b3 var4 = (com.aspose.slides.internal.i3.b3)var1;
      com.aspose.slides.internal.o9b.w1[] var5 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var4.n5())
      );

      for (int var6 = 0; var6 < var5.length; var6++) {
         var4.l6()[var6].k5().n5(var5[var6]);
      }

      if (var3.c8() != null) {
         var2.n5(var3.c8(), var5, var3.z1());
      }

      if (var3.t2() != null) {
         var2.k5(var3.t2(), var5);
      }
   }
}
