package com.aspose.slides.internal.s8;

import com.aspose.slides.ms.System.q1;

public class h0 extends x8 {
   private long n5;

   public h0(long var1) {
      this.n5 = var1;
   }

   public com.aspose.slides.internal.y6.u3 n5(com.aspose.slides.internal.z0k.n5 var1) {
      long var2 = var1.x8().getPosition();
      com.aspose.slides.internal.k1.s7 var4 = new com.aspose.slides.internal.k1.s7();
      var4.n5(var1.k7());
      var4.l6(var1.k7());
      var4.k5(var1.k7());
      var4.u3(var1.k7());
      var4.a6(var1.k7());
      var4.n5(var1.z1());
      var4.l6(var1.z1());
      var4.k5(var1.z1());
      var4.u3(var1.z1());
      var4.a6(var1.z1());
      var4.u9(var1.z1());
      var4.h0(var1.z1());
      var4.c8(var1.z1());
      long var5 = (this.n5 & 4294967295L) - (var1.x8().getPosition() - var2);
      int var7 = (int)q1.k5(var5, 32L);
      var4.n5(var1.c8(var7));
      int var8 = 0;

      while (var8 < var4.z1().length && (var4.z1()[var8] & 255) != 0) {
         var8++;
      }

      var4.n5(com.aspose.slides.internal.r0.l6.n5(var4.s7()).l6(var4.z1(), 0, var8));
      return var4;
   }
}
