package com.aspose.slides.internal.g5;

import com.aspose.slides.internal.b9.s9;

public abstract class a6 extends com.aspose.slides.internal.v6.a6 {
   private com.aspose.slides.internal.e1.n3 l6;
   private com.aspose.slides.internal.x4g.m1 k5;

   protected a6(com.aspose.slides.internal.r5.y4 var1) {
      super(var1);
   }

   @Override
   protected void l6(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      super.l6(var1, var2);
      this.l6 = var2.n5();
      com.aspose.slides.internal.e1.t2 var3 = new com.aspose.slides.internal.e1.t2();
      this.l6.n5(var3);
      var2.n5(var3);
   }

   @Override
   protected void k5(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      var2.n5(this.l6);
      if (this.k5 != null) {
         this.k5 = null;
      }
   }

   @Override
   protected void n5(
      String var1,
      com.aspose.slides.internal.o9b.n3 var2,
      com.aspose.slides.internal.o9b.u3 var3,
      com.aspose.slides.internal.o9b.y1 var4,
      com.aspose.slides.internal.o9b.e5 var5,
      byte var6,
      long var7,
      com.aspose.slides.internal.r6.u9 var9,
      boolean var10
   ) {
      com.aspose.slides.internal.p1s.l6 var11 = com.aspose.slides.internal.e1x.x8.u3().n5(var2.h0(), var2.c8(), var2.x8());
      com.aspose.slides.internal.w0.l6 var12 = com.aspose.slides.internal.p1.n5.n5(var3);
      com.aspose.slides.internal.e1.z1 var13 = new com.aspose.slides.internal.e1.z1(var11, var12, null, var4.u9().u3(), var1, var4.c8().a6(), 0.0F);
      com.aspose.slides.internal.x4g.m1 var14 = var9.x9().u9();
      if (this.k5 != null) {
         var14.n5(this.k5, 0);
      }

      com.aspose.slides.internal.w0.c8 var15 = com.aspose.slides.internal.p1.l6.n5(
         com.aspose.slides.internal.o9b.j5.n5(
               new com.aspose.slides.internal.o9b.j5(
                  com.aspose.slides.internal.v6g.k5.u3(var4.u9().l6(), 13), com.aspose.slides.internal.v6g.k5.u3(var4.u9().k5(), 13)
               )
            )
            .u3(),
         new com.aspose.slides.internal.w0.c8(),
         var4.c8().a6(),
         var11,
         (int)var9.j5(),
         0.0F
      );
      var14.l6(com.aspose.slides.internal.p1.n5.n5(var15));
      var13.n5(com.aspose.slides.internal.p1.n5.n5(var14));
      var13.n5(var4.c8().a6());
      var13.n5(new com.aspose.slides.internal.w0.s7(com.aspose.slides.internal.p1s.n5.b2));
      var9.<com.aspose.slides.internal.e1.n3>n5().n5(var13);
   }

   @Override
   protected void n5(
      String var1,
      com.aspose.slides.internal.o9b.n3 var2,
      com.aspose.slides.internal.o9b.u3 var3,
      com.aspose.slides.internal.o9b.w1 var4,
      com.aspose.slides.internal.o9b.e5 var5,
      byte var6,
      long var7,
      com.aspose.slides.internal.r6.u9 var9,
      boolean var10
   ) {
      com.aspose.slides.internal.p1s.l6 var11 = com.aspose.slides.internal.e1x.x8.u3().n5(var2.h0(), var2.c8(), var2.x8());
      com.aspose.slides.internal.w0.l6 var12 = com.aspose.slides.internal.p1.n5.n5(var3);
      com.aspose.slides.internal.e1.z1 var13 = new com.aspose.slides.internal.e1.z1(
         var11, var12, null, var4.u3(), var1, new com.aspose.slides.internal.o9b.f2(), 0.0F
      );
      com.aspose.slides.internal.x4g.m1 var14 = var9.x9().u9();
      if (this.k5 != null) {
         var14.n5(this.k5, 0);
      }

      int var15 = (int)var9.j5();
      com.aspose.slides.internal.w0.c8 var16 = new com.aspose.slides.internal.w0.c8();
      var16.l6(0.0F, com.aspose.slides.internal.p1.l6.n5(var11, var15), 0);
      var14.l6(com.aspose.slides.internal.p1.n5.n5(var16));
      var13.n5(com.aspose.slides.internal.p1.n5.n5(var14));
      var13.n5(new com.aspose.slides.internal.o9b.f2());
      var13.n5(new com.aspose.slides.internal.w0.s7(com.aspose.slides.internal.p1s.n5.b2));
      var9.<com.aspose.slides.internal.e1.n3>n5().n5(var13);
   }

   @Override
   protected com.aspose.slides.internal.o9b.w1 n5(
      com.aspose.slides.internal.o9b.w1 var1, String var2, com.aspose.slides.internal.o9b.n3 var3, int var4, float var5, com.aspose.slides.internal.r6.u9 var6
   ) {
      com.aspose.slides.internal.o9b.w1 var7 = var1.u3();
      com.aspose.slides.internal.o9b.z1 var8 = com.aspose.slides.internal.o9b.z1.n5(var6.z7());

      try {
         com.aspose.slides.internal.y6.c8.l6(var1.u3(), var2, var3, var8, var4 & 65535 & 65511 & 65535, var5).n5(var7);
      } finally {
         if (var8 != null) {
            var8.dispose();
         }
      }

      return var7;
   }

   @Override
   protected void n5(com.aspose.slides.internal.o9b.i1 var1, com.aspose.slides.internal.o9b.y1 var2, com.aspose.slides.internal.r6.u9 var3) {
      com.aspose.slides.internal.e1.r4 var4 = com.aspose.slides.internal.e1.r4.n5(var2.y4());
      var4.n5(com.aspose.slides.internal.p1.n5.n5(var3.x9()));
      var4.n5(com.aspose.slides.internal.p1.n5.n5(var3.t2()));
      var3.<com.aspose.slides.internal.e1.n3>n5().n5(var4);
   }

   @Override
   protected com.aspose.slides.internal.o9b.f2 n5(
      String var1,
      com.aspose.slides.internal.o9b.n3 var2,
      com.aspose.slides.internal.o9b.w1 var3,
      com.aspose.slides.internal.o9b.e5 var4,
      com.aspose.slides.internal.r6.u9 var5
   ) {
      com.aspose.slides.internal.p1s.l6 var6 = com.aspose.slides.internal.e1x.x8.u3().n5(var2.h0(), var2.a6(), var2.x8());
      return var6.l6(var1);
   }

   @Override
   protected void n5(com.aspose.slides.internal.x4g.m1 var1, com.aspose.slides.internal.r6.u9 var2) {
      this.k5 = var1.u9();
   }

   @Override
   protected void n5(com.aspose.slides.internal.x4g.x8 var1, com.aspose.slides.internal.r6.u9 var2) {
   }

   @Override
   protected com.aspose.slides.internal.x4g.x8 n5(com.aspose.slides.internal.r6.u9 var1) {
      return null;
   }

   @Override
   protected void n5(com.aspose.slides.internal.o9b.y2 var1, int var2, com.aspose.slides.internal.r6.u9 var3) {
   }

   @Override
   protected void l6(int var1, com.aspose.slides.internal.r6.u9 var2) {
   }

   @Override
   protected void n5(int var1, com.aspose.slides.internal.r6.u9 var2) {
   }
}
