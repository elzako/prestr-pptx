package com.aspose.slides.internal.b6;

public class j5 extends z1 {
   @Override
   public void l6(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3) {
      com.aspose.slides.internal.i3.m3 var4 = (com.aspose.slides.internal.i3.m3)var1;
      if ((var4.l6() & 65535) < var3.h0().length && (var4.n5() & 65535) < var3.h0().length) {
         com.aspose.slides.internal.o9b.u3 var5 = var3.s7(var4.l6());
         com.aspose.slides.internal.o9b.a0 var6 = var3.x8(var4.n5());
         if (var5 != null && var6 != null) {
            if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.o9b.u6.class)) {
               com.aspose.slides.internal.o9b.u6 var7 = com.aspose.slides.internal.v6g.k5.n5(var5, com.aspose.slides.internal.o9b.u6.class);
               com.aspose.slides.internal.x4g.m1 var8 = var2.m1().u9();
               var8.h0();
               var7.k5(var8);
               var2.n5(var7, var6);
            } else {
               var2.n5(var5, var6);
            }
         }
      }
   }
}
