package com.aspose.slides.internal.l8;

public class b3 extends z1 {
   @Override
   protected boolean n5(com.aspose.slides.internal.i3.q0[] var1, com.aspose.slides.internal.z0k.n5 var2) {
      com.aspose.slides.internal.q6.e5 var3 = new com.aspose.slides.internal.q6.e5(var1[0]);
      int var4 = var2.r4();
      if (com.aspose.slides.ms.System.d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o4.y4.class), var4)) {
         var3.u3(var4 & 65535);
         var1[0] = var3;
         return true;
      } else {
         com.aspose.slides.internal.f8y.n5.u3("Warning: Invalid Query value for WmfQueryEscSupportEscape.");
         return false;
      }
   }
}
