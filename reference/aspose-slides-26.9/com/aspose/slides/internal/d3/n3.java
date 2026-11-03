package com.aspose.slides.internal.d3;

public class n3 extends t9 {
   @Override
   protected boolean n5(com.aspose.slides.internal.i3.q0 var1, com.aspose.slides.internal.z0k.l6 var2) {
      if ((var1.l6() & 65535) != 0) {
         com.aspose.slides.internal.f8y.n5.u3("Warning: Invalid ByteCount for WmfEndDocEscape record. MUST be 0x0000");
         var2.n5().seek(var1.l6() & 65535, 1);
      }

      return true;
   }
}
