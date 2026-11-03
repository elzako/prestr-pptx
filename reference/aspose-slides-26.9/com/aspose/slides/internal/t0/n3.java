package com.aspose.slides.internal.t0;

public class n3 extends y1 {
   public void n5(com.aspose.slides.internal.i0.f0 var1, com.aspose.slides.internal.z0k.l6 var2) {
      com.aspose.slides.internal.i0.w1 var3 = (com.aspose.slides.internal.i0.w1)var1;
      var2.l6(var3.l6());
      long var4 = var2.n5().getPosition();
      new z1().n5(var3.n5(), var2);
      int var6 = (int)(var2.n5().getPosition() - var4);
      if (var3.l6() != var6) {
         throw new com.aspose.slides.internal.p5.n5("Writeed more bytes than the object size.");
      }
   }
}
