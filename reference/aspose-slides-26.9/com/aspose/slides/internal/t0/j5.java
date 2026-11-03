package com.aspose.slides.internal.t0;

import com.aspose.slides.ms.System.d1;

public class j5 extends y1 {
   private final com.aspose.slides.internal.i0.o0 n5;
   private final int l6;
   private final int k5;

   public j5(com.aspose.slides.internal.i0.o0 var1, int var2, int var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public void n5(com.aspose.slides.internal.i0.f0 var1, com.aspose.slides.internal.z0k.l6 var2) {
      com.aspose.slides.internal.i0.o0 var3 = (com.aspose.slides.internal.i0.o0)var1;
      com.aspose.slides.internal.i0.l6 var4;
      int var5;
      int var6;
      if (this.n5 == null) {
         com.aspose.slides.internal.o8.u3.n5(var3.t2(), var2);
         var2.n5(var3.l6() & 4294967295L);
         var4 = null;
         var5 = this.l6 - 8;
         var6 = this.k5 - 8;
      } else {
         var3 = this.n5;
         var4 = this.n5.n5();
         var5 = this.l6;
         var6 = this.l6;
      }

      switch ((int)var3.l6()) {
         case 0:
            var2.n5().seek(var5, 1);
            break;
         case 1:
            new k5((com.aspose.slides.internal.i0.u9)var4, var5, var6).n5(var3.n5(), var2);
            break;
         case 2:
            new y2((com.aspose.slides.internal.i0.v0)var4, var5, var6).n5(var3.n5(), var2);
            break;
         default:
            throw new com.aspose.slides.internal.p5.n5(
               d1.n5(new String[]{"Unknown image type: ", com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.t9.class, var3.l6())})
            );
      }
   }
}
