package com.aspose.slides.internal.s8;

import com.aspose.slides.internal.l7h.j5;

public class s7 extends x8 {
   public com.aspose.slides.internal.y6.u3 n5(com.aspose.slides.internal.z0k.n5 var1) {
      long var2 = var1.x8().getPosition() - 8L;
      com.aspose.slides.internal.k1.y4 var4 = new com.aspose.slides.internal.k1.y4();
      var4.n5(var1.c4());
      var4.l6(var1.c4());
      var4.n5((int)var1.c4());
      var4.l6((int)var1.c4());
      var4.n5((com.aspose.slides.internal.k1.h0)new u3().n5(var1));
      var4.k5(var1.m3());
      var4.u3(var1.m3());
      var4.a6(var1.m3());
      int var5 = (int)(var1.x8().getPosition() - var2);
      if (var5 > 0) {
         byte[] var6 = var1.c8(var5);
         var4.n5(j5.z1().l6(var6));
      }

      return var4;
   }
}
