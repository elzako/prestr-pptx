package com.aspose.slides.internal.m8;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.t5.m3;

public class q0 extends e2 {
   private final long n5;
   private boolean l6 = false;

   public q0(long var1, boolean var3) {
      this.n5 = var1;
      this.l6 = var3;
   }

   public com.aspose.slides.internal.t5.q0 n5(com.aspose.slides.internal.z0k.n5 var1) {
      m3 var2 = new m3();
      var2.n5((com.aspose.slides.internal.k1.q0)new com.aspose.slides.internal.s8.t9().n5(var1));
      var2.n5(var1.c4());
      com.aspose.slides.internal.o6.n5.n5(var1.x8(), this.l6 ? 2 : 1);
      var2.l6(var1.c4());
      var2.k5(var1.c4() & 4294967295L);
      var2.n5((com.aspose.slides.internal.k1.k7)new com.aspose.slides.internal.s8.t4().n5(var1));
      com.aspose.slides.internal.o6.n5.n5(var1.x8(), 4);
      var2.u3(var1.c4());
      var1.x8().seek(this.n5 + (var2.k5() & 4294967295L), 0);
      int var3 = (int)var2.l6() * (this.l6 ? 2 : 1);
      var2.n5(var1.c8(var3));
      if (this.l6) {
         var2.n5(1200);
      }

      var1.x8().seek(this.n5 + (var2.h0() & 4294967295L), 0);
      var3 = (int)var2.l6();
      boolean var4 = (var2.u3() & 8192L) == 8192L;
      if (var4) {
         var3 <<= 1;
      }

      List var5 = new List(var3);
      var3 <<= 2;
      byte[] var6 = var1.c8(var3);
      byte var7 = 0;
      int var8 = 0;

      while (var8 < (var2.l6() & 4294967295L)) {
         var8++;
         var5.addItem(com.aspose.slides.ms.System.x8.l6(var6, var7));
         var7 += 4;
         if (var4) {
            var5.addItem(com.aspose.slides.ms.System.x8.l6(var6, var7));
            var7 += 4;
         }
      }

      var2.n5(com.aspose.slides.internal.n2d.t4.l6(var5));
      return var2;
   }
}
