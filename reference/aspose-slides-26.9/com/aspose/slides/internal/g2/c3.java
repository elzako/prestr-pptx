package com.aspose.slides.internal.g2;

import com.aspose.slides.internal.i3.i6;

public class c3 extends com.aspose.slides.internal.o6.l6 {
   @Override
   public boolean l6(com.aspose.slides.internal.i3.v4[] var1, com.aspose.slides.internal.z0k.t4 var2) {
      i6 var3 = new i6(var1[0]);
      com.aspose.slides.internal.z0k.n5 var4 = new com.aspose.slides.internal.z0k.n5(var2);
      var3.n5(var4.k7());
      int var5 = var3.n5() + var3.n5() % 2;
      byte[] var6 = var4.c8(var5);
      var3.n5(com.aspose.slides.internal.l7h.j5.e2().l6(var6));
      var3.n5(var6);
      var3.k5(var4.k7());
      var3.l6(var4.k7());
      var1[0] = var3;
      return true;
   }
}
