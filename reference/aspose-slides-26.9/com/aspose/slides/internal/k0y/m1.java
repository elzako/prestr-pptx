package com.aspose.slides.internal.k0y;

public class m1 implements com.aspose.slides.internal.t1h.n5 {
   @Override
   public void n5(com.aspose.slides.internal.c4i.e5 var1, com.aspose.slides.internal.o6t.l6 var2, com.aspose.slides.internal.m5l.k5 var3) throws com.aspose.slides.internal.p7x.l6 {
      com.aspose.slides.internal.c4i.w1 var4 = (com.aspose.slides.internal.c4i.w1)var1;
      com.aspose.slides.internal.o9b.u3 var5 = null;
      com.aspose.slides.internal.f4l.t9 var6 = null;
      if (var4.u3()) {
         var5 = new com.aspose.slides.internal.o9b.i1(com.aspose.slides.internal.o9b.c8.n5(var4.u9()));
      } else {
         var6 = (com.aspose.slides.internal.f4l.t9)var2.n5(var4.u9());
         var5 = com.aspose.slides.internal.i8n.n5.n5(var6);
      }

      com.aspose.slides.internal.f4l.a3 var7 = (com.aspose.slides.internal.f4l.a3)var2.n5(var4.q0() & 255);
      if (var7 != null) {
         com.aspose.slides.internal.x4g.s7 var8 = com.aspose.slides.internal.i8n.u3.n5(var7);
         var8.n5(1);
         var2.t4().n5(var5, var8);
      }
   }
}
