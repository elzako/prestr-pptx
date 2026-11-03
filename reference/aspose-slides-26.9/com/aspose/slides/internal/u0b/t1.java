package com.aspose.slides.internal.u0b;

class t1 {
   private final int n5;

   public t1(int var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.f4l.o5 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.f4l.o5 var2 = new com.aspose.slides.internal.f4l.o5();
      if ((this.n5 & 1) > 0) {
         var2.n5(j4.n5(var1));
      }

      if ((this.n5 & 2) > 0) {
         var2.n5(var1.m3());
      }

      if ((this.n5 & 4) > 0) {
         var2.l6(var1.m3());
      }

      if ((this.n5 & 8) > 0) {
         var2.k5(var1.m3());
      }

      if ((this.n5 & 16) > 0) {
         var2.n5(var1.w1());
      }

      if ((this.n5 & 32) > 0) {
         var2.u3(var1.m3());
      }

      if ((this.n5 & 64) > 0) {
         var2.a6(var1.m3());
      }

      if ((this.n5 & 128) > 0) {
         var2.l6(var1.w1());
      }

      if ((this.n5 & 256) > 0) {
         var2.n5(j5.n5(var1));
      }

      if ((this.n5 & 512) > 0) {
         var2.u9(var1.m3());
      }

      if ((this.n5 & 1024) > 0) {
         var2.n5(z1.n5(var1));
      }

      if ((this.n5 & 2048) > 0) {
         var2.n5(z8.n5(var1));
      }

      if ((this.n5 & 4096) > 0) {
         var2.n5(q0.n5(var1));
      }

      return var2;
   }
}
