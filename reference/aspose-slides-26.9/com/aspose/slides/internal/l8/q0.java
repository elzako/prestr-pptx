package com.aspose.slides.internal.l8;

public class q0 extends z1 {
   @Override
   protected boolean n5(com.aspose.slides.internal.i3.q0[] var1, com.aspose.slides.internal.z0k.n5 var2) {
      com.aspose.slides.internal.q6.t4 var3 = new com.aspose.slides.internal.q6.t4(var1[0]);
      var3.u3(var2.r4());
      long var4 = var2.x8().getPosition() - 12L;
      long var6 = var4 + (var3.k5() & 65535) - var2.x8().getPosition();
      var3.n5(var2.c8((int)var6));
      long var8 = var4 + ((var3.e2() & 4294967295L) * 2L & 4294967295L) - (var4 + (var3.k5() & 65535));
      var3.l6(new byte[0]);
      var3.k5(var2.c8((int)var8));
      var1[0] = var3;
      return true;
   }
}
