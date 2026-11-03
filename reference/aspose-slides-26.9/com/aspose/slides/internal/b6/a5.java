package com.aspose.slides.internal.b6;

public class a5 extends z1 {
   @Override
   public void l6(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3) {
      com.aspose.slides.internal.i3.h2 var4 = (com.aspose.slides.internal.i3.h2)var1;
      com.aspose.slides.internal.x4g.s7 var5 = new com.aspose.slides.internal.x4g.s7();
      int var6 = var4.l6();
      int var7 = var4.n5();
      if (var6 > var4.u3() - var4.h0()) {
         var6 = var4.u3() - var4.h0();
      }

      if (var7 > var4.k5() - var4.u9()) {
         var7 = var4.k5() - var4.u9();
      }

      var5.n5(var4.h0(), var4.u9(), var6, var7, 180.0F, 90.0F);
      var5.l6(var4.h0() + var6 / 2.0F, var4.u9(), var4.u3() - var6 / 2.0F, var4.u9());
      var5.n5(var4.u3() - var6, var4.u9(), var6, var7, -90.0F, 90.0F);
      var5.l6(var4.u3(), var4.u9() + var7 / 2, var4.u3(), var4.k5() - var7 / 2);
      var5.n5(var4.u3() - var6, var4.k5() - var7, var6, var7, 0.0F, 90.0F);
      var5.l6(var4.u3() - var6 / 2.0F, var4.k5(), var4.h0() + var6 / 2.0F, var4.k5());
      var5.n5(var4.h0(), var4.k5() - var7, var6, var7, 90.0F, 90.0F);
      var5.l6(var4.h0(), var4.k5() - var7 / 2, var4.h0(), var4.u9() + var7 / 2);
      var5.n3();
      if (var3.c8() != null) {
         var2.n5(var3.c8(), var5);
      }

      if (var3.t2() != null) {
         var2.n5(var3.t2(), var5);
      }
   }
}
