package com.aspose.slides.internal.d3v;

import com.aspose.slides.internal.r1x.k7;
import com.aspose.slides.internal.r1x.t2;
import com.aspose.slides.internal.z0k.t4;

class l6$c8 extends l6$q0 {
   private final t4 n5;

   public l6$c8(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4, 32);
      this.n5 = var1.m1();
   }

   @Override
   protected void n5(int[] var1, int var2, int var3) {
      byte[] var4;
      if (this.n5 == null) {
         var4 = com.aspose.slides.internal.r1x.t2.n5(var1, var2, var3);
      } else {
         var4 = com.aspose.slides.internal.r1x.t2.n5(var1, var2, var3, k7.l6().n5(), this.n5);
      }

      com.aspose.slides.ms.System.u3.n5(var4, 0, this.h0, this.c8, var4.length);
      this.c8 += var4.length;
   }
}
