package com.aspose.slides.internal.l0;

public class t2 extends x8 {
   public void n5(com.aspose.slides.internal.z0k.l6 var1, com.aspose.slides.internal.t5.q0 var2) {
      com.aspose.slides.internal.t5.t4 var3 = (com.aspose.slides.internal.t5.t4)var2;
      var1.n5(var3.n5() & 4294967295L);
      var1.n5(var3.l6() & 4294967295L);
      var1.n5((long)(var3.u3() & 65535));
      new com.aspose.slides.internal.o3.a6().n5(var1, var3.u9());
      var1.n5(var3.h0() & 4294967295L);
      var1.n5(var3.c8() & 4294967295L);
      if (var3.t2() != null) {
         for (long var7 : var3.t2()) {
            var1.n5(var7 & 4294967295L);
         }
      }
   }
}
