package com.aspose.slides.internal.r7;

import com.aspose.slides.internal.b9.l0;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.q1;

public class h0 extends com.aspose.slides.internal.h9.c8 {
   public h0(com.aspose.slides.internal.h9.n5 var1) {
      super(var1);
   }

   @Override
   protected void n5(l0 var1, com.aspose.slides.internal.r6.u9 var2) {
      com.aspose.slides.internal.o9b.l6 var3 = var1.t4() != null ? var1.t4().l6(var2.x8()) : null;
      m1 var4 = new m1();
      int var5 = var1.h0();
      int var6 = var1.c8();
      int var7 = var1.t9();
      int var8 = var1.z1();
      boolean var9 = false;
      boolean var10 = false;
      if (var3 != null) {
         if (q1.l6(var5) != q1.l6(var7)) {
            var9 = true;
         }

         if (q1.l6(var6) != q1.l6(var8)) {
            var10 = true;
         }

         if (var9) {
            if (var10) {
               var3.u3(2);
            } else {
               var3.u3(4);
            }
         } else if (var10) {
            var3.u3(6);
         }
      }

      y2 var11 = this.n5(var1.u3(), var1.u9(), var5, var6).n3();
      y2 var12 = this.n5(var1.l6(), var1.k5(), var7, var8).n3();
      long var13 = var1.e2();
      this.l6(var13, var3, var11.n3(), var12.n3(), com.aspose.slides.internal.o9b.c8.u3.o8(), var4, var2);
   }
}
