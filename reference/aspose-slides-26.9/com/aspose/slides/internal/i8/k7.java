package com.aspose.slides.internal.i8;

public class k7 extends e5 {
   private final long n5;

   public k7(long var1) {
      this.n5 = var1;
   }

   public com.aspose.slides.internal.i0.f0 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.i0.y1 var2 = new com.aspose.slides.internal.i0.y1();
      if ((this.n5 & 1L) > 0L) {
         var2.n5((com.aspose.slides.internal.i0.d5)new w1().n5(var1));
      }

      if ((this.n5 & 2L) > 0L) {
         var2.n5((com.aspose.slides.internal.i0.t1)new s3().n5(var1));
      }

      return var2;
   }
}
