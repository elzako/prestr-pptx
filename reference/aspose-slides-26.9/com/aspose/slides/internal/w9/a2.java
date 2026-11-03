package com.aspose.slides.internal.w9;

import com.aspose.slides.internal.b9.l0;

public class a2 {
   public static boolean n5(com.aspose.slides.internal.b9.s9[] var0, com.aspose.slides.internal.z0k.t4 var1) {
      long var2 = var1.getPosition() - 8L;
      com.aspose.slides.internal.z0k.n5 var4 = new com.aspose.slides.internal.z0k.n5(var1);
      l0 var5 = new l0(var0[0]);
      var5.n5((com.aspose.slides.internal.k1.k7)new com.aspose.slides.internal.s8.t4().n5(var4));
      var5.n5(var4.m3());
      var5.l6(var4.m3());
      var5.k5(var4.m3());
      var5.u3(var4.m3());
      var5.a6(var4.m3());
      var5.u9(var4.m3());
      var5.n5(var4.c4());
      var5.l6(var4.c4());
      var5.k5(var4.c4());
      var5.u3(var4.c4());
      var5.a6(var4.c4() & 4294967295L);
      long var6 = var4.c4();
      long var8 = 0L;
      long[] var10 = new long[]{0L};
      boolean var11 = com.aspose.slides.internal.o4.w1.n5(var10, var6);
      var8 = var10[0];
      if (var11) {
         var5.u9(var8);
         var5.h0(var4.m3());
         var5.c8(var4.m3());
         com.aspose.slides.internal.s8.u9 var12 = new com.aspose.slides.internal.s8.u9(
            var2, var5.y2(), var5.t2(), var5.s7(), var5.x8(), var5.n3(), (int)(var5.y4() & 65535L)
         );
         var5.n5(var12.n5(var4));
         var0[0] = var5;
         return true;
      } else {
         com.aspose.slides.internal.f8y.n5.k5("Invalid RasterOperation value for EmfBitBlt");
         return false;
      }
   }
}
