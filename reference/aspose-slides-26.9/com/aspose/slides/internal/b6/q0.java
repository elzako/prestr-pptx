package com.aspose.slides.internal.b6;

public class q0 extends z1 {
   @Override
   public void l6(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3) {
      com.aspose.slides.internal.q6.s7 var4 = (com.aspose.slides.internal.q6.s7)var1;
      com.aspose.slides.internal.y6.l6 var5 = com.aspose.slides.internal.y6.l6.n5(new com.aspose.slides.internal.z0k.e2(var4.l6()));

      try {
         com.aspose.slides.internal.o1.k5 var6 = com.aspose.slides.internal.o1.k5.n5(var5);
         var6.n5(var3.z3());
         if (var2.m1().n5()[0] != 0.0F) {
            float var7 = (float)var3.z3().e2() / var5.u9();
            float var8 = (float)var3.z3().h0() / var5.h0();
            com.aspose.slides.internal.x4g.m1 var9 = new com.aspose.slides.internal.x4g.m1(var7, 0.0F, 0.0F, var8, -var5.E_() * var7, -var5.F_() * var8);
            var2.l6(var9);
         }

         var6.n5(var2);
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }
   }
}
