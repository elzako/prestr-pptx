package com.aspose.slides.internal.o7;

import com.aspose.slides.internal.a4.b3;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;

public class m3 extends com.aspose.slides.internal.k6.n5 {
   public m3(com.aspose.slides.internal.k6.l6 var1) {
      super(var1);
   }

   @Override
   public void n5(b3 var1, com.aspose.slides.internal.x3.a6 var2) {
      com.aspose.slides.internal.o9b.z1 var3 = var2.n5();
      com.aspose.slides.internal.x4g.m1 var4 = var3.m1();

      try {
         var2.n5 = com.aspose.slides.internal.n2d.y4.n5(var3, var2.k5(), var2.z1(), var2.n5);
         a0 var5 = var2.u9().l6();
         com.aspose.slides.internal.x4g.m1 var6 = var2.z1();
         var6.h0();
         var5.l6(var6);
         com.aspose.slides.internal.n2d.y4.n5(var3, var5);
         this.n5.n5(var1, var2);
      } finally {
         var3.l6(var4);
      }
   }

   @Override
   public void n5(
      com.aspose.slides.internal.o9b.t4 var1, w1[] var2, y1 var3, int var4, com.aspose.slides.internal.j9e.t2 var5, com.aspose.slides.internal.x3.a6 var6
   ) {
      com.aspose.slides.internal.n2d.y4.n5(var1, var2, var3.y4(), var4, var5, var6.n5());
   }

   @Override
   public void n5(com.aspose.slides.internal.y6.l6 var1, w1[] var2, com.aspose.slides.internal.x4g.m1 var3, y1 var4, com.aspose.slides.internal.x3.a6 var5) {
      com.aspose.slides.internal.o1.k5 var6 = com.aspose.slides.internal.o1.k5.n5(var1);
      var6.n5(var5.m1());
      var6.n5(var5.n5(), var3);
   }

   @Override
   public void n5(y1 var1, com.aspose.slides.internal.x4g.m1 var2, int var3, com.aspose.slides.internal.x3.a6 var4) {
      var4.<com.aspose.slides.internal.o9b.z1>n5().n5(var1.y4(), var3);
   }
}
