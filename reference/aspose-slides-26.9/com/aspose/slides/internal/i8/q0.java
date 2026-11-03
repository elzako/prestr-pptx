package com.aspose.slides.internal.i8;

public class q0 extends e5 {
   public com.aspose.slides.internal.i0.f0 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.i0.w1 var2 = new com.aspose.slides.internal.i0.w1();
      var2.n5(var1.m3());
      long var3 = var1.x8().getPosition();
      var2.n5((com.aspose.slides.internal.i0.r4)new m3().n5(var1));
      int var5 = (int)(var1.x8().getPosition() - var3);
      if (var2.l6() != var5) {
         throw new com.aspose.slides.internal.p5.n5("Readed more bytes than the object size.");
      } else {
         return var2;
      }
   }
}
