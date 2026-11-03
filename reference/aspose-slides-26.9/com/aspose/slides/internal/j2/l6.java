package com.aspose.slides.internal.j2;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.x4g.m1;

public class l6 extends com.aspose.slides.internal.h9.l6 {
   public l6(com.aspose.slides.internal.h9.n5 var1) {
      super(var1);
   }

   @Override
   protected void n5(com.aspose.slides.internal.b9.n5 var1, com.aspose.slides.internal.r6.u9 var2) {
      com.aspose.slides.internal.o9b.l6 var3 = var1.z3() != null ? var1.z3().l6(var2.x8()) : null;
      if (var3 != null) {
         int[] var4 = var1.z3().k5(var2.x8());
         com.aspose.slides.internal.o9b.l6 var5 = new com.aspose.slides.internal.o9b.l6(var3.e2(), var3.h0(), 2498570);

         try {
            com.aspose.slides.internal.j9e.n5 var6 = var5.n5(new y2(0, 0, var5.e2(), var5.h0()), 2, 2498570);
            com.aspose.slides.internal.e3m.n5.n5(var4, 0, var6.u3(), var4.length);
            var5.n5(var6);
            y2 var7 = new y2(var1.c8(), var1.t2(), var1.u3(), var1.u9());
            y2 var8 = new y2(var1.l6(), var1.k5(), var1.u3(), var1.u9());
            long var9 = 204L;
            this.n5(var9, var5, var7.n3(), var8.n3(), com.aspose.slides.internal.o9b.c8.u3.o8(), new m1(), var2);
         } finally {
            if (var5 != null) {
               var5.dispose();
            }
         }
      }
   }
}
