package com.aspose.slides.internal.x5;

import com.aspose.slides.internal.i0.g7;

public class x8 extends com.aspose.slides.internal.b4.n5 {
   @Override
   public boolean n5(com.aspose.slides.internal.a4.b3[] var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.a4.e2 var3 = new com.aspose.slides.internal.a4.e2(var1[0]);
      com.aspose.slides.internal.z0k.n5 var4 = new com.aspose.slides.internal.z0k.n5(var2);
      var3.n5(var4.c4());
      var3.k5(var4.m3());
      var3.n5((g7)new com.aspose.slides.internal.i8.v0().n5(var4));
      var3.l6(var4.c4());
      if (var3.t2()) {
         var3.n5(com.aspose.slides.internal.b4.k5.k5(var3.y4(), var4));
      } else if (var3.k5()) {
         var3.n5(com.aspose.slides.internal.b4.k5.l6(var3.y4(), var4));
      } else {
         var3.n5(com.aspose.slides.internal.b4.k5.u3(var3.y4(), var4));
      }

      var1[0] = var3;
      return true;
   }
}
