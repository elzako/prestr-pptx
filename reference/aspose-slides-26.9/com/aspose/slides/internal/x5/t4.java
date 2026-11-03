package com.aspose.slides.internal.x5;

import com.aspose.slides.internal.i0.g7;

public class t4 extends com.aspose.slides.internal.b4.n5 {
   @Override
   public boolean n5(com.aspose.slides.internal.a4.b3[] var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.a4.z3 var3 = new com.aspose.slides.internal.a4.z3(var1[0]);
      com.aspose.slides.internal.z0k.n5 var4 = new com.aspose.slides.internal.z0k.n5(var2);
      long var5 = var2.getPosition();
      var3.k5(var4.m3());
      var3.u3(var4.m3());
      var3.a6(var4.m3());
      var3.n5((g7)new com.aspose.slides.internal.i8.v0().n5(var4));
      var3.n5(com.aspose.slides.internal.o6.n5.u3(var3.s7(), var4));
      var3.n5(var4.c8(var3.H_() - (int)(var2.getPosition() - var5)));
      var1[0] = var3;
      return true;
   }
}
