package com.aspose.slides.internal.n2;

public class y1 extends com.aspose.slides.internal.s2.n5 {
   @Override
   public boolean l6(com.aspose.slides.internal.b9.s9 var1, com.aspose.slides.internal.z0k.l6 var2) {
      long var3 = var2.n5().getPosition();
      n5(var1, var2);
      com.aspose.slides.internal.b9.p8 var5 = (com.aspose.slides.internal.b9.p8)var1;
      var2.n5(var5.n5() & 4294967295L);
      var2.n5(var5.l6() & 4294967295L);
      if ((var5.n5() & 4294967295L) > 0L) {
         var2.n5().seek(var3 + (var5.l6() & 4294967295L), 0);
         com.aspose.slides.internal.l0.c8.n5(var2, var5.k5());
      }

      com.aspose.slides.internal.o6.n5.n5(var2.n5(), 4);
      var2.n5(var5.u3() & 4294967295L);
      return true;
   }
}
