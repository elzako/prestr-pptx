package com.aspose.slides.internal.n2;

import com.aspose.slides.internal.b9.f8;

public class r7 extends com.aspose.slides.internal.s2.n5 {
   @Override
   public boolean l6(com.aspose.slides.internal.b9.s9 var1, com.aspose.slides.internal.z0k.l6 var2) {
      n5(var1, var2);
      f8 var3 = (f8)var1;
      var2.l6(var3.n5());
      var2.l6(var3.l6());
      var2.n5(var3.k5() & 4294967295L);
      var2.n5(var3.u3() & 4294967295L);
      var2.n5(var3.u9() & 4294967295L);
      var2.n5(com.aspose.slides.internal.v6g.k5.a6(var3.h0(), 13));
      var2.n5(com.aspose.slides.internal.v6g.k5.a6(var3.c8(), 13));
      if (var3.u3() != 256L) {
         new com.aspose.slides.internal.o3.t4().n5(var2, var3.t2());
      }

      byte[] var4 = com.aspose.slides.internal.l7h.j5.z1().u3(var3.s7());
      var2.n5(var4);
      return true;
   }
}
