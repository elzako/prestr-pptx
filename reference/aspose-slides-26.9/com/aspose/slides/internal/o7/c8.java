package com.aspose.slides.internal.o7;

import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;

public class c8 extends com.aspose.slides.internal.k6.s7 {
   private final com.aspose.slides.internal.k6.n5 n5 = new m3(this);

   @Override
   public com.aspose.slides.internal.k6.n5 n5() {
      return this.n5;
   }

   @Override
   protected void n5(com.aspose.slides.internal.a4.y4 var1, com.aspose.slides.internal.x3.a6 var2) {
      com.aspose.slides.internal.o9b.z1 var3 = var2.n5();
      com.aspose.slides.internal.l5.c8 var4 = var2.e2();
      com.aspose.slides.internal.j9e.t2 var5 = null;
      if ((var1.c8() & 4294967295L) != 4294967295L) {
         var2.u9((int)var1.c8());
         var5 = var2.y4();
      }

      y1 var6 = var1.t2().n5().y4();
      y1 var7 = var1.s7().n5().y4();
      if (com.aspose.slides.internal.v6g.k5.l6(var4, com.aspose.slides.internal.l5.u3.class)) {
         var3.n5(
            ((com.aspose.slides.internal.l5.u3)var4).n5(),
            new w1[]{var6.u9(), new w1(var6.h0(), var6.t2()), new w1(var6.a6(), var6.l6())},
            var7.y4(),
            var1.x8(),
            var5
         );
      } else {
         w1[] var8 = new w1[]{new w1(var6.a6(), var6.t2()), new w1(var6.h0(), var6.t2()), new w1(var6.a6(), var6.l6())};
         com.aspose.slides.internal.x4g.m1 var9 = new com.aspose.slides.internal.x4g.m1(var7.y4(), var8);
         var3.n5(var6.y4(), 1);
         com.aspose.slides.internal.o1.k5 var10 = com.aspose.slides.internal.o1.k5.n5((com.aspose.slides.internal.y6.l6)var4);
         var10.n5(var2.m1());
         var10.n5(var3, var9);
      }
   }
}
