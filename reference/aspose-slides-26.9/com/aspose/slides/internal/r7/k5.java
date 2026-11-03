package com.aspose.slides.internal.r7;

import com.aspose.slides.internal.b9.a8;
import com.aspose.slides.internal.b9.e9;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.x8;

public class k5 extends com.aspose.slides.internal.h9.u3 {
   public k5(com.aspose.slides.internal.h9.n5 var1) {
      super(var1);
   }

   @Override
   protected void n5(e9 var1, com.aspose.slides.internal.r6.u9 var2) {
      z1 var3 = var2.n5();
      y2 var4 = var1.n5().c8().n3();
      a0 var5 = var2.v0().l6();
      var5.l6(var4.n3());
      if (!var5.l6(var3)) {
         y2 var6 = new y2(var1.c8(), var1.t2(), var1.u3(), var1.u9());
         y2 var7 = new y2(var1.l6(), var1.k5(), var1.u3(), var1.u9());
         com.aspose.slides.internal.o9b.l6 var8 = com.aspose.slides.internal.h9.a6.n5(
            var1.j5().l6(var2.x8()), var1.w1().l6(var2.x8()), new j5(var1.t4(), var1.q0())
         );
         a8 var9 = var1.h0();
         m1 var10 = var1.s7().c8();
         com.aspose.slides.internal.o9b.c8 var11 = var1.x8().u9().o8();
         a0 var12 = new a0(var6.n3());
         var12.l6(var10);
         y2.l6(var12.n5(var3).y4()).u3(var6);
         x8 var13 = var3.l6();
         var3.n5(var2.x9(), 0);
         var3.n5(var2.v0(), 0);
         com.aspose.slides.internal.g1.h0.n5(var6.n3(), new y2(0, 0, var8.e2(), var8.h0())).u3(var6);
         com.aspose.slides.internal.j9e.t2 var14 = new com.aspose.slides.internal.j9e.t2();

         try {
            var14.l6(3);
            var3.a6(2);
            var3.k5(7);
            var3.n5(var8, var7.n3(), var6.s7(), var6.x8(), var6.t2(), var6.l6(), 2, var14);
         } finally {
            if (var14 != null) {
               var14.dispose();
            }
         }

         var3.n5(var13);
      }
   }
}
