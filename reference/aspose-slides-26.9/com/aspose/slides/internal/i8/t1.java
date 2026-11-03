package com.aspose.slides.internal.i8;

import com.aspose.slides.internal.i0.a7;

public class t1 extends e5 {
   private final long n5;

   public t1(long var1) {
      this.n5 = var1;
   }

   public com.aspose.slides.internal.i0.f0 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.i0.j8 var2 = new com.aspose.slides.internal.i0.j8();
      if ((this.n5 & 1L) > 0L) {
         var2.n5((a7)new v3().n5(var1));
      }

      if ((this.n5 & 2L) > 0L) {
         var2.n5(var1.m3() & 4294967295L);
      }

      if ((this.n5 & 4L) > 0L) {
         var2.l6(var1.m3() & 4294967295L);
      }

      if ((this.n5 & 8L) > 0L) {
         var2.n5(var1.m3());
      }

      if ((this.n5 & 16L) > 0L) {
         var2.n5(var1.w1());
      }

      if ((this.n5 & 32L) > 0L) {
         var2.l6(var1.m3());
      }

      if ((this.n5 & 64L) > 0L) {
         var2.k5(var1.m3());
      }

      if ((this.n5 & 128L) > 0L) {
         var2.l6(var1.w1());
      }

      if ((this.n5 & 256L) > 0L) {
         var2.n5((com.aspose.slides.internal.i0.d2)new j5().n5(var1));
      }

      if ((this.n5 & 512L) > 0L) {
         var2.u3(var1.m3());
      }

      if ((this.n5 & 1024L) > 0L) {
         var2.n5((com.aspose.slides.internal.i0.m3)new z1().n5(var1));
      }

      if ((this.n5 & 2048L) > 0L) {
         var2.n5((com.aspose.slides.internal.i0.a0)new z8().n5(var1));
      }

      if ((this.n5 & 4096L) > 0L) {
         var2.n5((com.aspose.slides.internal.i0.w1)new q0().n5(var1));
      }

      return var2;
   }
}
