package com.aspose.slides.internal.j2;

import com.aspose.slides.internal.b9.l0;
import com.aspose.slides.internal.e1.k7;
import com.aspose.slides.internal.e1.n3;
import com.aspose.slides.internal.j9e.x8;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.ms.System.q1;

public class c8 extends com.aspose.slides.internal.h9.c8 {
   public c8(com.aspose.slides.internal.h9.n5 var1) {
      super(var1);
   }

   @Override
   protected void n5(l0 var1, com.aspose.slides.internal.r6.u9 var2) {
      com.aspose.slides.internal.o9b.l6 var3 = var1.t4() != null ? var1.t4().l6(var2.x8()) : null;
      new m1();
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
      e2 var15 = new e2();

      byte[] var16;
      try {
         var3.n5(var15, x8.s7());
         var16 = var15.toArray();
      } finally {
         if (var15 != null) {
            var15.dispose();
         }
      }

      com.aspose.slides.internal.e1.t2 var17 = new com.aspose.slides.internal.e1.t2();
      k7 var18 = new k7(j5.n5(var12.a6()).u3(), p8.n5(var12.h0()).a6(), var16);
      var17.n5(var18);
      var17.n5(com.aspose.slides.internal.p1.n5.n5(var2.x9()));
      var2.<n3>n5().n5(var17);
   }
}
