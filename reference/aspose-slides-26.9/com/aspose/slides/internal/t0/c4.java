package com.aspose.slides.internal.t0;

public class c4 extends y1 {
   private final long n5;

   public c4(long var1) {
      this.n5 = var1;
   }

   public void n5(com.aspose.slides.internal.i0.f0 var1, com.aspose.slides.internal.z0k.l6 var2) {
      com.aspose.slides.internal.i0.h2 var3 = (com.aspose.slides.internal.i0.h2)var1;
      if ((this.n5 & 2L) > 0L) {
         new p3().n5(var3.n5(), var2);
      }

      if ((this.n5 & 4L) == 0L) {
         if ((this.n5 & 8L) == 0L) {
            if ((this.n5 & 16L) == 0L) {
            }
         } else if ((this.n5 & 16L) == 0L) {
            new a6().n5(var3.l6()[1], var2);
         } else {
            new a6().n5(var3.l6()[0], var2);
            new a6().n5(var3.l6()[1], var2);
         }
      } else if ((this.n5 & 8L) == 0L) {
         if ((this.n5 & 16L) == 0L) {
            new u3().n5(var3.l6()[0], var2);
         } else {
            new a6().n5(var3.l6()[0], var2);
         }
      }
   }
}
