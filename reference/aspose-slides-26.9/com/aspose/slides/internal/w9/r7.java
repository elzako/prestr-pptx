package com.aspose.slides.internal.w9;

import com.aspose.slides.internal.b9.f8;

public class r7 {
   public static boolean n5(com.aspose.slides.internal.b9.s9[] var0, com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var1);
      f8 var3 = new f8(var0[0]);
      var3.n5(var2.m3());
      var3.l6(var2.m3());
      var3.n5(var2.c4());
      long var4 = var2.c4() & 4294967295L;
      var3.l6(var4);
      var3.k5(var2.c4() & 4294967295L);
      var3.n5((float)(var2.c4() & 4294967295L));
      var3.l6((float)(var2.c4() & 4294967295L));
      if (var4 != 256L) {
         var3.n5((com.aspose.slides.internal.k1.k7)new com.aspose.slides.internal.s8.t4().n5(var2));
      }

      byte[] var6 = var2.c8((int)var3.k5() << 1);
      String var7 = com.aspose.slides.internal.l7h.j5.z1().l6(var6);
      var3.n5(var7);
      var3.n5(com.aspose.slides.internal.l7h.j5.z1().u3(var7));
      var0[0] = var3;
      return true;
   }
}
