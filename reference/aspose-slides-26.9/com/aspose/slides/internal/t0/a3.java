package com.aspose.slides.internal.t0;

import com.aspose.slides.internal.i0.l4;

public class a3 extends y1 {
   private final long n5;
   private final int l6;

   public a3(long var1, int var3) {
      this.n5 = var1;
      this.l6 = var3;
   }

   public void n5(com.aspose.slides.internal.i0.f0 var1, com.aspose.slides.internal.z0k.l6 var2) {
      long var3 = var2.n5().getPosition();
      l4 var5 = (l4)var1;
      if ((this.n5 & 2L) > 0L) {
         new p3().n5(var5.n5(), var2);
      }

      int var6 = this.l6 - (int)(var2.n5().getPosition() - var3);
      if (var5.l6() != null) {
         new j5(null, var6, var6).n5(var5.l6(), var2);
      }
   }
}
