package com.aspose.slides.internal.w9;

public class y1 {
   public static boolean n5(com.aspose.slides.internal.b9.s9[] var0, com.aspose.slides.internal.z0k.t4 var1) {
      long var2 = var1.getPosition() - 8L;
      com.aspose.slides.internal.z0k.n5 var4 = new com.aspose.slides.internal.z0k.n5(var1);
      com.aspose.slides.internal.b9.p8 var5 = new com.aspose.slides.internal.b9.p8(var0[0]);
      var5.n5(var4.c4());
      var5.l6(var4.c4());
      if ((var5.n5() & 4294967295L) > 0L) {
         var4.x8().seek(var2 + (var5.l6() & 4294967295L), 0);
         var5.n5(com.aspose.slides.internal.m8.x8.n5(var4, var5.n5()));
      }

      com.aspose.slides.internal.o6.n5.n5(var1, 4);
      var5.k5(var4.c4());
      var0[0] = var5;
      return true;
   }
}
