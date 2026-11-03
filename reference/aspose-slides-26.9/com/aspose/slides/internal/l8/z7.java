package com.aspose.slides.internal.l8;

public class z7 extends z1 {
   @Override
   protected boolean n5(com.aspose.slides.internal.i3.q0[] var1, com.aspose.slides.internal.z0k.n5 var2) {
      com.aspose.slides.internal.q6.o0 var3 = new com.aspose.slides.internal.q6.o0(var1[0]);
      if ((var3.l6() & 65535) != 2) {
         com.aspose.slides.internal.f8y.n5.u3("Warning: Invalid ByteCount for WmfSetCopyCountEscape record. MUST be 0x0002");
      }

      var3.u3(var2.r4());
      var1[0] = var3;
      return true;
   }
}
