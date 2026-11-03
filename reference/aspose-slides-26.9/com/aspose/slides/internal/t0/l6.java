package com.aspose.slides.internal.t0;

public class l6 extends y1 {
   private final com.aspose.slides.internal.i0.u9 n5;

   public l6(com.aspose.slides.internal.i0.u9 var1) {
      this.n5 = var1;
   }

   public void n5(com.aspose.slides.internal.i0.f0 var1, com.aspose.slides.internal.z0k.l6 var2) {
      com.aspose.slides.internal.i0.h0 var3 = (com.aspose.slides.internal.i0.h0)var1;
      if (com.aspose.slides.internal.g8.s3.l6(this.n5.h0())) {
         new a0().n5(var3.u3(), var2);
      }

      int var4 = com.aspose.slides.internal.g8.s3.n5(this.n5.h0());
      int var5 = var4 * this.n5.s7() / 8;
      int var6 = this.n5.c8() - var5;
      byte[][] var7 = var3.a6();

      for (int var8 = 0; var8 < var7.length; var8++) {
         var2.n5(var7[var8]);
         var2.n5().seek(var6, 1);
      }
   }
}
