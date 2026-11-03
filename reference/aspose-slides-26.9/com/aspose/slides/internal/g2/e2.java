package com.aspose.slides.internal.g2;

public class e2 extends com.aspose.slides.internal.o6.l6 {
   @Override
   public boolean l6(com.aspose.slides.internal.i3.v4[] var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.i3.t9 var3 = new com.aspose.slides.internal.i3.t9(var1[0]);
      com.aspose.slides.internal.z0k.n5 var4 = new com.aspose.slides.internal.z0k.n5(var2);
      long var5 = var4.c4();
      long var7 = 0L;
      long[] var9 = new long[]{0L};
      boolean var10 = com.aspose.slides.internal.o4.w1.n5(var9, var5);
      var7 = var9[0];
      if (var10) {
         var3.n5(var7);
         var3.a6(var4.k7());
         var3.u9(var4.k7());
         var3.n5(var4.k7());
         var3.l6(var4.k7());
         if (!var3.y4()) {
            var3.h0(var4.k7());
         }

         var3.c8(var4.k7());
         var3.t2(var4.k7());
         var3.k5(var4.k7());
         var3.u3(var4.k7());
         if (var3.y4()) {
            var3.n5(
               (com.aspose.slides.internal.k1.t2)new com.aspose.slides.internal.s8.u9(var3.z1() & 4294967295L, (int)((var3.e2() & 4294967295L) * 2L)).l6(var4)
            );
         }

         var1[0] = var3;
         return true;
      } else {
         com.aspose.slides.internal.f8y.n5.k5("Invalid RasterOperation value for WmfDibStretchBlt");
         return false;
      }
   }
}
