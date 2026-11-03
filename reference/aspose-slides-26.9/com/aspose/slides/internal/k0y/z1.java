package com.aspose.slides.internal.k0y;

import com.aspose.slides.internal.f4l.f5;

public class z1 implements com.aspose.slides.internal.t1h.n5 {
   private static int n5 = 0;

   @Override
   public void n5(com.aspose.slides.internal.c4i.e5 var1, com.aspose.slides.internal.o6t.l6 var2, com.aspose.slides.internal.m5l.k5 var3) throws com.aspose.slides.internal.p7x.l6 {
      com.aspose.slides.internal.c4i.z3 var4 = (com.aspose.slides.internal.c4i.z3)var1;
      f5 var5 = (f5)var2.n5(var4.h0());
      com.aspose.slides.internal.o9b.e5 var6 = var5 != null ? com.aspose.slides.internal.i8n.k5.n5(var5) : null;
      boolean var7 = var6 != null && (var6.k5() & 2) != 0;
      com.aspose.slides.internal.o9b.n3 var8 = com.aspose.slides.internal.i8n.k5.n5((com.aspose.slides.internal.f4l.s3)var2.n5(var4.q0() & 255), var7);
      com.aspose.slides.internal.o9b.u3 var9;
      if (var4.u3()) {
         var9 = new com.aspose.slides.internal.o9b.i1(com.aspose.slides.internal.o9b.c8.n5(var4.u9()));
      } else {
         var9 = com.aspose.slides.internal.i8n.n5.n5((com.aspose.slides.internal.f4l.t9)var2.n5(var4.u9()));
      }

      com.aspose.slides.internal.y5s.w1 var10 = var4.t2();
      com.aspose.slides.internal.o9b.y1 var11 = com.aspose.slides.internal.m0l.l6.n5(var10);
      String var12 = var4.s7();
      this.n5(var2.t4(), var8, var7, var5, var6, var11);
      if (var6 != null) {
         var2.t4().n5(var12, var8, var9, var11, var6);
      } else {
         var2.t4().n5(var12, var8, var9, var11);
      }
   }

   private void n5(
      com.aspose.slides.internal.o9b.z1 var1,
      com.aspose.slides.internal.o9b.n3 var2,
      boolean var3,
      f5 var4,
      com.aspose.slides.internal.o9b.e5 var5,
      com.aspose.slides.internal.o9b.y1 var6
   ) {
      float var7 = 0.0F;
      if (var4 != null) {
         this.n5(var1, var2, var4.h0(), var5 != null && var5.q0());
      } else {
         this.n5(var1, var2, 0.0F, false);
      }

      if (var3) {
         var6.u3(var6.n3() + var7);
      } else {
         var6.k5(var6.x8() + var7);
      }
   }

   protected float n5(com.aspose.slides.internal.o9b.z1 var1, com.aspose.slides.internal.o9b.n3 var2, float var3, boolean var4) {
      float var5 = var4 ? 0.0F : 0.16666667F;
      float var6 = var3 - var5;
      if (var6 == 0.0F) {
         return 0.0F;
      }

      float var7 = com.aspose.slides.internal.f3l.k5.n5(var2.c8(), var2.y4(), var1);
      return var7 * var6;
   }
}
