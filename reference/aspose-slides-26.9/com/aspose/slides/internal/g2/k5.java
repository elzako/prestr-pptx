package com.aspose.slides.internal.g2;

public class k5 extends com.aspose.slides.internal.o6.l6 {
   @Override
   public boolean l6(com.aspose.slides.internal.i3.v4[] var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.i3.u3 var3 = new com.aspose.slides.internal.i3.u3(var1[0]);
      com.aspose.slides.internal.z0k.n5 var4 = new com.aspose.slides.internal.z0k.n5(var2);
      long var5 = var4.c4();
      if (com.aspose.slides.ms.System.d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o4.j5.class), var5)) {
         var3.n5(var5 & 4294967295L);
      } else {
         long var7 = 0L;
         long[] var9 = new long[]{0L};
         boolean var10 = com.aspose.slides.internal.o4.w1.n5(var9, var5);
         var7 = var9[0];
         if (!var10) {
            com.aspose.slides.internal.f8y.n5.k5("Invalid RasterOperation value for WmfBitBlt");
            return false;
         }

         var3.n5(var7);
      }

      var3.n5(var4.k7());
      var3.l6(var4.k7());
      if (!var3.x8()) {
         var3.a6(var4.k7());
      }

      var3.u9(var4.k7());
      var3.h0(var4.k7());
      var3.k5(var4.k7());
      var3.u3(var4.k7());
      if (var3.x8()) {
         var3.n5((com.aspose.slides.internal.k1.l6)new com.aspose.slides.internal.s8.n5().n5(var4));
      }

      var1[0] = var3;
      return true;
   }
}
