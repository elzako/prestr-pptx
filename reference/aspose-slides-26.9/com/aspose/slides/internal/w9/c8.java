package com.aspose.slides.internal.w9;

public class c8 {
   public static boolean n5(com.aspose.slides.internal.b9.s9[] var0, com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.b9.x8 var2 = new com.aspose.slides.internal.b9.x8(var0[0]);
      com.aspose.slides.internal.z0k.n5 var3 = new com.aspose.slides.internal.z0k.n5(var1);
      var2.n5(var3.c4() & 4294967295L);
      var2.l6(var3.c4() & 4294967295L);
      var2.k5(var3.c4());
      var2.u3(var3.c4());
      long var4 = (var2.k5() & 4294967295L) + (var2.u3() & 4294967295L) & 4294967295L;
      if ((var4 & 4294967295L) > 0L) {
         var2.n5(var3.c8((int)var4));
      }

      var0[0] = var2;
      return true;
   }
}
