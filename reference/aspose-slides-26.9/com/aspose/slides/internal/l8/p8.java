package com.aspose.slides.internal.l8;

public class p8 extends z1 {
   @Override
   protected boolean n5(com.aspose.slides.internal.i3.q0[] var1, com.aspose.slides.internal.z0k.n5 var2) {
      com.aspose.slides.internal.q6.s3 var3 = new com.aspose.slides.internal.q6.s3(var1[0]);
      if ((var3.l6() & 65535) != 0) {
         com.aspose.slides.internal.f8y.n5.n5("Warning: Invalid ByteCount=0x{0:X4} for WmfPostScriptIgnoreEscape record. MUST be 0x0000", var3.l6());
         var2.x8().seek(var3.l6() & 65535, 1);
      }

      var1[0] = var3;
      return true;
   }
}
