package com.aspose.slides.internal.l8;

public class t2 extends z1 {
   @Override
   protected boolean n5(com.aspose.slides.internal.i3.q0[] var1, com.aspose.slides.internal.z0k.n5 var2) {
      com.aspose.slides.internal.q6.t2 var3 = new com.aspose.slides.internal.q6.t2(var1[0]);
      if ((var3.l6() & 65535) != 20) {
         com.aspose.slides.internal.f8y.n5.u3("Warning: Invalid ByteCount for WmfDownloadHeaderEscape record. MUST be 0x0014.");
      }

      var3.n5((com.aspose.slides.internal.k1.q0)new com.aspose.slides.internal.s8.t9().n5(var2));
      var3.l6((com.aspose.slides.internal.k1.q0)new com.aspose.slides.internal.s8.t9().n5(var2));
      var3.u3(var2.r4());
      var3.a6(var2.r4());
      var1[0] = var3;
      return true;
   }
}
