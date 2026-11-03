package com.aspose.slides.internal.w9;

public class x8 {
   public final boolean n5(com.aspose.slides.internal.b9.z3[] var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.z0k.n5 var3 = new com.aspose.slides.internal.z0k.n5(var2);
      com.aspose.slides.internal.b9.t9 var4 = new com.aspose.slides.internal.b9.t9(var1[0]);
      if ((var4.c8() & 4294967295L) > 8L) {
         var4.n5(var3.c4() & 4294967295L);
         var4.l6(var3.c4() & 4294967295L);
         com.aspose.slides.internal.f8y.n5.k5("Reading EmfCommentEmfSpool record is not implemented");
         var2.seek((var4.c8() & 4294967295L) - 8L & 4294967295L, 1);
      }

      var1[0] = var4;
      return true;
   }
}
