package com.aspose.slides.internal.l8;

public class w1 extends z1 {
   @Override
   protected boolean n5(com.aspose.slides.internal.i3.q0[] var1, com.aspose.slides.internal.z0k.n5 var2) {
      com.aspose.slides.internal.q6.j5 var3 = new com.aspose.slides.internal.q6.j5(var1[0]);
      if ((var3.l6() & 65535) != 4) {
         com.aspose.slides.internal.f8y.n5.u3("Warning: Invalid ByteCount for WmfGetPsFeatureSettingEscape record. MUST be 0x0004");
      }

      var3.u3(var2.m3());
      var1[0] = var3;
      return true;
   }
}
