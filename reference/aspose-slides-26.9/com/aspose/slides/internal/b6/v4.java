package com.aspose.slides.internal.b6;

public class v4 extends z1 {
   @Override
   public void l6(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3) {
      com.aspose.slides.internal.i3.u6 var4 = (com.aspose.slides.internal.i3.u6)var1;
      com.aspose.slides.internal.o9b.y2 var5 = new com.aspose.slides.internal.o9b.y2(var4.u3(), var4.k5(), var4.l6() - var4.u3(), var4.n5() - var4.k5());
      boolean var6 = var3.n5() == 8 && var3.u3().n5()[3] < 0.0F && var3.u3().n5()[0] > 0.0F;
      com.aspose.slides.internal.x4g.x8 var7 = null;
      if (var6) {
         var7 = var2.l6();
         com.aspose.slides.internal.x4g.m1 var8 = new com.aspose.slides.internal.x4g.m1();
         var8.n5(1.0F, -1.0F);
         var2.n5(var8);
         com.aspose.slides.internal.o9b.j5[] var9 = new com.aspose.slides.internal.o9b.j5[]{
            var5.a6(),
            new com.aspose.slides.internal.o9b.j5(var4.l6(), var4.k5()),
            new com.aspose.slides.internal.o9b.j5(var4.l6(), var4.n5()),
            new com.aspose.slides.internal.o9b.j5(var4.u3(), var4.n5())
         };
         var8.n5(var9);
         var5 = new com.aspose.slides.internal.o9b.y2(
            var9[0].k5(), new com.aspose.slides.internal.o9b.p8(var9[1].n5() - var9[0].n5(), var9[2].l6() - var9[0].l6())
         );
      }

      if (var3.c8() != null) {
         var2.l6(var3.c8(), var5.n3());
      }

      if (var3.t2() != null) {
         var2.l6(var3.t2(), var5.n3());
      }

      if (var7 != null) {
         var2.n5(var7);
      }
   }
}
