package com.aspose.slides.internal.g2;

public class m1 extends com.aspose.slides.internal.o6.l6 {
   @Override
   public boolean l6(com.aspose.slides.internal.i3.v4[] var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.i3.k7 var3 = new com.aspose.slides.internal.i3.k7(var1[0]);
      com.aspose.slides.internal.z0k.n5 var4 = new com.aspose.slides.internal.z0k.n5(var2);
      var3.n5(var4.k7());
      var3.l6(var4.k7());
      var3.k5(var4.k7());
      var3.n5(var4.r4() & 65535);
      if ((var3.u3() & 4) == 4 || (var3.u3() & 2) == 2) {
         var3.n5((com.aspose.slides.internal.k1.m1)new com.aspose.slides.internal.s8.q0().n5(var4));
      }

      int var5 = var3.k5() + var3.k5() % 2;
      var3.n5(var4.c8(var5));
      var3.n5(com.aspose.slides.internal.l7h.j5.z3().l6(var3.h0(), 0, var3.k5()));
      long var6 = ((var3.e2() & 4294967295L) * 2L & 4294967295L) - (var2.getPosition() - (var3.z1() & 4294967295L));
      if (var6 > 0L && var6 / 2L == var3.k5()) {
         var3.n5(com.aspose.slides.internal.o6.n5.n5(var3.k5(), var4));
      }

      var1[0] = var3;
      return true;
   }
}
