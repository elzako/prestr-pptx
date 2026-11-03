package com.aspose.slides.internal.t0;

import com.aspose.slides.ms.System.d1;

public class k5 extends y1 {
   private final com.aspose.slides.internal.i0.u9 n5;
   private final int l6;
   private final int k5;

   public k5(com.aspose.slides.internal.i0.u9 var1, int var2, int var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public void n5(com.aspose.slides.internal.i0.f0 var1, com.aspose.slides.internal.z0k.l6 var2) {
      com.aspose.slides.internal.i0.u9 var3;
      int var5;
      if (this.n5 == null) {
         var3 = (com.aspose.slides.internal.i0.u9)var1;
         var2.l6(var3.s7());
         var2.l6(var3.a6());
         var2.l6(var3.c8());
         var2.n5(var3.h0() & 4294967295L);
         var2.n5(var3.t2() & 4294967295L);
         Object var4 = null;
         var5 = this.l6 - 20;
         int var6 = this.k5 - 20;
      } else {
         var3 = this.n5;
         com.aspose.slides.internal.i0.l6 var10 = this.n5.u3();
         var5 = this.l6;
         int var11 = this.k5;
      }

      com.aspose.slides.internal.i0.l6 var7 = var3.u3();
      long var8 = var2.n5().getPosition();
      switch ((int)var3.t2()) {
         case 0:
            new l6(var3).n5(var7, var2);
            break;
         case 1:
            new x8().n5(var7, var2);
            break;
         default:
            throw new com.aspose.slides.internal.p5.n5(
               d1.n5(new String[]{"Unknown bitmap data type: ", com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.n5.class, var3.t2())})
            );
      }

      if (var8 + var5 != var2.n5().getPosition()) {
         throw new com.aspose.slides.internal.p5.n5("Writeed more bytes than the object size.");
      }
   }
}
