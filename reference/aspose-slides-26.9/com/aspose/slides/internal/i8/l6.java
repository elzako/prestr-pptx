package com.aspose.slides.internal.i8;

public class l6 extends e5 {
   private final com.aspose.slides.internal.i0.u9 n5;

   public l6(com.aspose.slides.internal.i0.u9 var1) {
      this.n5 = var1;
   }

   public com.aspose.slides.internal.i0.f0 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.i0.h0 var2 = new com.aspose.slides.internal.i0.h0();
      if (com.aspose.slides.internal.g8.s3.l6(this.n5.h0())) {
         var2.n5((com.aspose.slides.internal.i0.a3)new b3().n5(var1));
      }

      int var3 = com.aspose.slides.internal.g8.s3.n5(this.n5.h0());
      int var4 = var3 * this.n5.s7() / 8;
      int var5 = this.n5.c8() - var4;
      byte[][] var6 = new byte[this.n5.a6()][];

      for (int var7 = 0; var7 < var6.length; var7++) {
         var6[var7] = var1.c8(var4);
         var1.x8().seek(var5, 1);
      }

      var2.n5(var6);
      return var2;
   }
}
