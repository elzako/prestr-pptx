package com.aspose.slides.internal.k0y;

public class x8 implements com.aspose.slides.internal.t1h.n5 {
   @Override
   public void n5(com.aspose.slides.internal.c4i.e5 var1, com.aspose.slides.internal.o6t.l6 var2, com.aspose.slides.internal.m5l.k5 var3) throws com.aspose.slides.internal.p7x.l6 {
      com.aspose.slides.internal.c4i.y4 var4 = (com.aspose.slides.internal.c4i.y4)var1;
      com.aspose.slides.internal.f4l.b3 var5 = (com.aspose.slides.internal.f4l.b3)var2.n5(var4.q0() & 255);
      com.aspose.slides.internal.o9b.t4 var6 = com.aspose.slides.internal.i8n.l6.n5(var5);
      com.aspose.slides.internal.f4l.o0 var7 = (com.aspose.slides.internal.f4l.o0)var2.n5(var4.u9());
      com.aspose.slides.internal.j9e.t2 var8 = var7 != null ? com.aspose.slides.internal.i8n.k5.n5(var7) : null;
      int var9 = var4.t2();
      com.aspose.slides.internal.o9b.y1 var10 = com.aspose.slides.internal.m0l.l6.n5(var4.c8());
      com.aspose.slides.internal.o9b.y1 var11 = com.aspose.slides.internal.m0l.l6.n5(var4.h0());
      if (var8 == null) {
         var2.t4().n5(var6, var11, var10, var9);
      } else {
         com.aspose.slides.internal.o9b.w1[] var12 = new com.aspose.slides.internal.o9b.w1[]{
            new com.aspose.slides.internal.o9b.w1(var11.a6(), var11.t2()),
            new com.aspose.slides.internal.o9b.w1(var11.h0(), var11.t2()),
            new com.aspose.slides.internal.o9b.w1(var11.h0(), var11.l6())
         };
         var2.t4().n5(var6, var12, var10, var9, var8);
      }
   }
}
