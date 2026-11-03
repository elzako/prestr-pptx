package com.aspose.slides.internal.g2;

public class h0 extends com.aspose.slides.internal.o6.l6 {
   @Override
   public boolean l6(com.aspose.slides.internal.i3.v4[] var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.i3.c8 var3 = new com.aspose.slides.internal.i3.c8(var1[0]);
      com.aspose.slides.internal.z0k.n5 var4 = new com.aspose.slides.internal.z0k.n5(var2);
      var3.n5((com.aspose.slides.internal.k1.e2)new com.aspose.slides.internal.s8.y4().n5(var4));
      if ((var3.n5().n5() & 65535) != 768) {
         throw new com.aspose.slides.internal.p5.l6("Invalid Pallete Start value for WmfPallete");
      }

      var1[0] = var3;
      return true;
   }
}
