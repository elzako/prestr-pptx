package com.aspose.slides.internal.e3;

import com.aspose.slides.internal.e1.r4;

public class n3 extends com.aspose.slides.internal.k6.y4 {
   private final com.aspose.slides.internal.k6.n5 n5 = new n5(this);

   @Override
   public com.aspose.slides.internal.k6.n5 n5() {
      return this.n5;
   }

   @Override
   public void n5(com.aspose.slides.internal.x3.a6 var1) {
      int[] var2 = com.aspose.slides.internal.p1.n5.n5(var1.s7());
      boolean var3 = var2.length > 0 && (var2[var2.length - 1] & 128) == 128;
      r4 var4 = com.aspose.slides.internal.g0.u3.n5(var1.s7().a6(), var2, var3);
      var4.n5(com.aspose.slides.internal.p1.n5.n5(var1.z1()));
      var4.n5(com.aspose.slides.internal.p1.n5.n5(var1.c8()));
      var1.<com.aspose.slides.internal.e1.n3>n5().n5(var4);
   }
}
