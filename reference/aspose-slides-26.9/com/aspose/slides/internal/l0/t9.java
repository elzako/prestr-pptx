package com.aspose.slides.internal.l0;

import com.aspose.slides.internal.t5.m3;

public class t9 extends x8 {
   private final long n5;
   private boolean l6 = false;

   public t9(long var1, boolean var3) {
      this.n5 = var1;
      this.l6 = var3;
   }

   public void n5(com.aspose.slides.internal.z0k.l6 var1, com.aspose.slides.internal.t5.q0 var2) {
      m3 var3 = (m3)var2;
      new com.aspose.slides.internal.o3.t9().n5(var1, var3.n5());
      var1.n5(var3.l6() & 4294967295L);
      com.aspose.slides.internal.o6.n5.n5(var1.n5(), this.l6 ? 2 : 1);
      var1.n5(var3.k5() & 4294967295L);
      var1.n5(var3.u3() & 4294967295L);
      new com.aspose.slides.internal.o3.t4().n5(var1, var3.u9());
      com.aspose.slides.internal.o6.n5.n5(var1.n5(), 4);
      var1.n5(var3.h0() & 4294967295L);
      var1.n5().seek(this.n5 + (var3.k5() & 4294967295L), 0);
      var1.n5(var3.c8());
      var1.n5().seek(this.n5 + (var3.h0() & 4294967295L), 0);
      int var4 = (int)var3.l6() << 2;
      boolean var5 = (var3.u3() & 8192L) == 8192L;
      if (var5) {
         var4 <<= 1;
      }

      byte[] var6 = new byte[var4];
      byte var7 = 0;
      int var8 = 0;
      int var9 = 0;

      while (var8 < (var3.l6() & 4294967295L)) {
         var8++;
         byte[] var10 = com.aspose.slides.ms.System.x8.n5(var3.n3()[var9++]);
         System.arraycopy(var10, 0, var6, var7, 4);
         var7 += 4;
         if (var5) {
            var10 = com.aspose.slides.ms.System.x8.n5(var3.n3()[var9++]);
            System.arraycopy(var10, 0, var6, var7, 4);
            var7 += 4;
         }
      }

      var1.n5(var6);
   }
}
