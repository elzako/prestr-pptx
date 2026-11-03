package com.aspose.slides.internal.t0;

import com.aspose.slides.internal.i0.j8;

public class f2 extends y1 {
   private final long n5;

   public f2(long var1) {
      this.n5 = var1;
   }

   public void n5(com.aspose.slides.internal.i0.f0 var1, com.aspose.slides.internal.z0k.l6 var2) {
      j8 var3 = (j8)var1;
      if ((this.n5 & 1L) > 0L) {
         new p3().n5(var3.n5(), var2);
      }

      if ((this.n5 & 2L) > 0L) {
         var2.l6((int)var3.l6());
      }

      if ((this.n5 & 4L) > 0L) {
         var2.l6((int)var3.k5());
      }

      if ((this.n5 & 8L) > 0L) {
         var2.l6(var3.u3());
      }

      if ((this.n5 & 16L) > 0L) {
         var2.n5(var3.a6());
      }

      if ((this.n5 & 32L) > 0L) {
         var2.l6(var3.h0());
      }

      if ((this.n5 & 64L) > 0L) {
         var2.l6(var3.c8());
      }

      if ((this.n5 & 128L) > 0L) {
         var2.n5(var3.t2());
      }

      if ((this.n5 & 256L) > 0L) {
         new q0().n5(var3.s7(), var2);
      }

      if ((this.n5 & 512L) > 0L) {
         var2.l6(var3.x8());
      }

      if ((this.n5 & 1024L) > 0L) {
         new s7().n5(var3.n3(), var2);
      }

      if ((this.n5 & 2048L) > 0L) {
         new t4().n5(var3.y4(), var2);
      }

      if ((this.n5 & 4096L) > 0L) {
         new n3().n5(var3.e2(), var2);
      }
   }
}
