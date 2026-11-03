package com.aspose.slides.internal.n2;

public class n7 extends com.aspose.slides.internal.s2.n5 {
   @Override
   public boolean l6(com.aspose.slides.internal.b9.s9 var1, com.aspose.slides.internal.z0k.l6 var2) {
      n5(var1, var2);
      com.aspose.slides.internal.b9.r7 var3 = (com.aspose.slides.internal.b9.r7)var1;
      var2.n5(var3.n5() & 4294967295L);
      var2.n5(var3.l6() & 4294967295L);
      var2.n5(var3.k5() & 4294967295L);
      if (var3.u3().length > 0) {
         for (com.aspose.slides.internal.t5.t9 var7 : var3.u3()) {
            new com.aspose.slides.internal.l0.h0().n5(var2, var7);
         }
      }

      return true;
   }
}
