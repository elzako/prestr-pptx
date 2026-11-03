package com.aspose.slides.internal.l8;

public class u6 extends z1 {
   @Override
   protected boolean n5(com.aspose.slides.internal.i3.q0[] var1, com.aspose.slides.internal.z0k.n5 var2) {
      com.aspose.slides.internal.q6.v4 var3 = new com.aspose.slides.internal.q6.v4(var1[0]);
      if ((var3.l6() & 65535) != 4) {
         com.aspose.slides.internal.f8y.n5.u3("Warning: Invalid ByteCount for WmfSetLineJoinEscape record. MUST be 0x0004");
      }

      int var4 = var2.m3();
      if (com.aspose.slides.ms.System.d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o4.k7.class), var4)) {
         var3.u3(var4);
         var1[0] = var3;
         return true;
      } else {
         com.aspose.slides.internal.f8y.n5.u3("Invalid Join value for WmfSetLineJoinEscape.");
         return false;
      }
   }
}
