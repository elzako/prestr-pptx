package com.aspose.slides.internal.t0;

import com.aspose.slides.internal.i0.y0;

public class d5 extends y1 {
   private final long n5;

   public d5(long var1) {
      this.n5 = var1;
   }

   public void n5(com.aspose.slides.internal.i0.f0 var1, com.aspose.slides.internal.z0k.l6 var2) {
      y0 var3 = (y0)var1;
      if ((this.n5 & 2L) == 2L) {
         new p3().n5(var3.n5(), var2);
      }

      if ((this.n5 & 4L) != 0L || (this.n5 & 8L) != 0L) {
         if ((this.n5 & 4L) == 4L) {
            new u3().n5(var3.l6(), var2);
         } else if ((this.n5 & 8L) == 8L) {
            new a6().n5(var3.l6(), var2);
         }
      }

      if ((this.n5 & 64L) == 64L) {
         new m1().n5(var3.k5(), var2);
      }
   }
}
