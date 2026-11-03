package com.aspose.slides.internal.w9;

public class m3 {
   public static boolean n5(com.aspose.slides.internal.b9.s9[] var0, com.aspose.slides.internal.z0k.t4 var1) {
      long var2 = var1.getPosition() - 8L;
      com.aspose.slides.internal.b9.r4 var4 = new com.aspose.slides.internal.b9.r4(var0[0]);
      com.aspose.slides.internal.z0k.n5 var5 = new com.aspose.slides.internal.z0k.n5(var1);
      var4.n5(var5.c4());
      var4.l6(var5.c4() & 4294967295L);
      var4.k5(var5.c4());
      var4.u3(var5.c4());
      var4.a6(var5.c4());
      var4.u9(var5.c4());
      com.aspose.slides.internal.s8.u9 var6 = new com.aspose.slides.internal.s8.u9(
         var2, var4.y2(), var4.k5(), var4.u3(), var4.u9(), var4.h0(), (int)(var4.l6() & 65535L)
      );
      var4.n5(var6.n5(var5));
      var0[0] = var4;
      return true;
   }
}
