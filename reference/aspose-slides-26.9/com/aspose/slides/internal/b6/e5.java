package com.aspose.slides.internal.b6;

public class e5 extends z1 {
   @Override
   public void l6(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3) {
      com.aspose.slides.internal.i3.e5 var4 = (com.aspose.slides.internal.i3.e5)var1;
      int var5 = 0;
      com.aspose.slides.internal.x4g.s7 var6 = new com.aspose.slides.internal.x4g.s7(var3.z1());

      for (int var7 = 0; var7 < (var4.n5() & 65535); var7++) {
         int var8 = var4.l6()[var7] & 65535;
         com.aspose.slides.internal.o9b.w1[] var9 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var8)
         );

         for (int var10 = 0; var10 < var8; var10++) {
            var4.k5()[var5 + var10].k5().n5(var9[var10]);
         }

         var6.l6(var9);
         var6.n3();
         var5 += var8;
      }

      if (var3.c8() != null) {
         var2.n5(var3.c8(), var6);
      }

      if (var3.t2() != null) {
         var2.n5(var3.t2(), var6);
      }
   }
}
