package com.aspose.slides.internal.n2;

public class x8 {
   public final boolean n5(com.aspose.slides.internal.b9.z3 var1, com.aspose.slides.internal.z0k.l6 var2) {
      com.aspose.slides.internal.b9.t9 var3 = (com.aspose.slides.internal.b9.t9)var1;
      if ((var3.c8() & 4294967295L) > 8L) {
         var2.n5(var3.n5() & 4294967295L);
         var2.n5(var3.l6() & 4294967295L);
         com.aspose.slides.internal.f8y.n5.k5("Writing EmfCommentEmfSpool record is not implemented");
         var2.n5().seek((var3.c8() & 4294967295L) - 8L & 4294967295L, 1);
      }

      return true;
   }
}
