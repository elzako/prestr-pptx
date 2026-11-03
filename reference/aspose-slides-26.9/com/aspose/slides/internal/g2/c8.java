package com.aspose.slides.internal.g2;

public class c8 extends com.aspose.slides.internal.o6.l6 {
   @Override
   public boolean l6(com.aspose.slides.internal.i3.v4[] var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.i3.t2 var3 = new com.aspose.slides.internal.i3.t2(var1[0]);
      com.aspose.slides.internal.z0k.n5 var4 = new com.aspose.slides.internal.z0k.n5(var2);
      var3.n5(new com.aspose.slides.internal.s8.n5().l6(var4));
      var3.n5(var4.c8(18));
      int var5 = (var3.n5().l6() * (var3.n5().h0() & 255) + 15 >> 4 << 1) * var3.n5().k5();
      var3.l6(var4.c8(var5));
      var1[0] = var3;
      return true;
   }
}
