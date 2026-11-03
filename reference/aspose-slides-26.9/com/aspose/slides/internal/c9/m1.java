package com.aspose.slides.internal.c9;

public class m1 extends com.aspose.slides.internal.t7.l6 {
   @Override
   public boolean l6(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.i3.k7 var3 = (com.aspose.slides.internal.i3.k7)var1;
      com.aspose.slides.internal.z0k.l6 var4 = new com.aspose.slides.internal.z0k.l6(var2);
      var4.n5(var3.n5());
      var4.n5(var3.l6());
      var4.n5(var3.k5());
      var4.n5(var3.u3() & 65535);
      if ((var3.u3() & 4) == 4 || (var3.u3() & 2) == 2) {
         new com.aspose.slides.internal.o3.q0().n5(var4, var3.u9());
      }

      var4.n5(var3.h0());
      if (var3.c8() != null) {
         com.aspose.slides.internal.t7.n5.n5(var3.c8(), var4);
      }

      return true;
   }
}
