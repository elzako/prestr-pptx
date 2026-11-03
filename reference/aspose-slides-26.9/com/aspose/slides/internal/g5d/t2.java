package com.aspose.slides.internal.g5d;

import com.aspose.slides.internal.u0b.j4;

public class t2 extends com.aspose.slides.internal.s5r.n5 {
   @Override
   public boolean n5(com.aspose.slides.internal.c4i.e5[] var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.c4i.x8 var3 = new com.aspose.slides.internal.c4i.x8(var1[0]);
      com.aspose.slides.internal.z0k.n5 var4 = new com.aspose.slides.internal.z0k.n5(var2);
      var3.k5(var4.m3());
      var3.u3(var4.m3());
      var3.u9(var4.m3());
      var3.a6(var4.m3());
      var3.n5(com.aspose.slides.internal.q5v.n5.n5(var3.h0(), var4));
      if ((var3.u9() & 1) == 1) {
         var3.n5(com.aspose.slides.internal.q5v.n5.n5(var3.t2()));
      }

      int var5 = 1;
      if ((var3.u9() & 4) != 4) {
         var5 = var3.h0();
      }

      var3.n5(com.aspose.slides.internal.u0b.h2.n5(var5, var4));
      if (var3.n3() == 1) {
         var3.n5(j4.n5(var4));
      }

      var1[0] = var3;
      return true;
   }
}
