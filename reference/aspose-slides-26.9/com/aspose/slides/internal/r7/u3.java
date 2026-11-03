package com.aspose.slides.internal.r7;

import com.aspose.slides.internal.b9.s4;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.x8;

public class u3 extends com.aspose.slides.internal.h9.a6 {
   public u3(com.aspose.slides.internal.h9.n5 var1) {
      super(var1);
   }

   @Override
   protected void n5(s4 var1, com.aspose.slides.internal.r6.u9 var2) {
      z1 var3 = var2.n5();
      y2 var4 = var1.n5().c8().n3();
      a0 var5 = var2.v0().l6();
      var5.l6(var4.n3());
      if (!var5.l6(var3)) {
         j5[] var6 = new j5[]{var1.l6()[0].k5(), var1.l6()[1].k5(), var1.l6()[2].k5()};
         y2 var7 = new y2(var1.k5(), var1.u3(), var1.u9(), var1.h0());
         m1 var8 = var1.c8().c8();
         a0 var9 = new a0(var7.n3());
         var9.l6(var8);
         y2.l6(var9.n5(var3).y4()).u3(var7);
         com.aspose.slides.internal.o9b.c8 var10 = var1.t2().u9().o8();
         com.aspose.slides.internal.o9b.l6 var11 = n5(var1.m3().l6(var2.x8()), var1.z8().l6(var2.x8()), new j5(var1.t9(), var1.z1()));
         x8 var12 = var3.l6();
         var3.n5(var2.x9(), 0);
         var3.n5(var2.v0(), 0);
         com.aspose.slides.internal.g1.h0.n5(var7.n3(), new y2(0, 0, var11.e2(), var11.h0())).u3(var7);
         com.aspose.slides.internal.j9e.t2 var13 = new com.aspose.slides.internal.j9e.t2();

         try {
            var13.l6(3);
            var3.a6(2);
            var3.k5(7);
            var3.n5(var11, var6, var7.n3(), 2, var13);
         } finally {
            if (var13 != null) {
               var13.dispose();
            }
         }

         var3.n5(var12);
      }
   }
}
