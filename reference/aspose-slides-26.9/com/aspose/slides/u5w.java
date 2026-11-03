package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class u5w extends q8o {
   private boolean n5;
   private final f6d l6;

   public final g4j u3() {
      return com.aspose.slides.internal.v6g.k5.n5(this.l6, g4j.class);
   }

   public final i2 m1() {
      return com.aspose.slides.internal.v6g.k5.n5(this.l6, i2.class);
   }

   public final c9q k7() {
      return com.aspose.slides.internal.v6g.k5.n5(this.l6, c9q.class);
   }

   public final f6d m3() {
      return this.l6;
   }

   @Override
   public int c8() {
      int var1 = super.c8();
      if (!this.x8().t9().n3() && (var1 == -1 || var1 == 1)) {
         var1 = 6;
      }

      return var1;
   }

   public final com.aspose.slides.internal.o9b.w1[] z8() {
      com.aspose.slides.internal.o9b.w1 var1 = this.i1().u3();
      float var2 = 4.0F;
      if (!this.h0()) {
         float var12 = com.aspose.slides.ms.System.q1.l6(4.0F, this.d5() / 2.0F);
         return new com.aspose.slides.internal.o9b.w1[]{
            new com.aspose.slides.internal.o9b.w1(var1.l6() - this.d2() / 2.0F, var1.k5() - var12),
            new com.aspose.slides.internal.o9b.w1(var1.l6() + this.d2() / 2.0F, var1.k5() - var12)
         };
      }

      com.aspose.slides.internal.o9b.y1[] var3 = this.n3().t9();
      if (var3.length <= 2) {
         com.aspose.slides.internal.o9b.w1[] var13 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var3.length > 1 ? 4 : 2)
         );
         float var14 = this.n3().t2();
         float var16 = var3[0].k5();
         float var18 = this.f2() + var14 + var16 - 4.0F;
         float var21 = (var3[0].s7() + 4.0F) / 2.0F;
         var13[0] = new com.aspose.slides.internal.o9b.w1(var1.l6() - var21, var18);
         var13[1] = new com.aspose.slides.internal.o9b.w1(var1.l6() + var21, var18);
         if (var3.length > 1) {
            var18 = this.f2() + this.d5() - var14 - 4.0F;
            var21 = (var3[var3.length - 1].s7() + 2.0F) / 2.0F;
            var13[2] = new com.aspose.slides.internal.o9b.w1(var1.l6() - var21, var18);
            var13[3] = new com.aspose.slides.internal.o9b.w1(var1.l6() + var21, var18);
         }

         return var13;
      } else {
         List var4 = new List();
         float var5 = 0.0F;

         for (com.aspose.slides.internal.o9b.y1 var9 : var3) {
            var5 += var9.k5();
         }

         float var15 = var1.k5() - var5 / 2.0F;

         for (com.aspose.slides.internal.o9b.y1 var10 : var3) {
            float var11 = (var10.s7() + 2.0F) / 2.0F;
            var15 += var10.k5();
            var4.addItem(new com.aspose.slides.internal.o9b.w1(var1.l6() + var11, var15));
            var4.addItem(new com.aspose.slides.internal.o9b.w1(var1.l6() - var11, var15));
         }

         return (com.aspose.slides.internal.o9b.w1[])var4.toArray(new com.aspose.slides.internal.o9b.w1[0]);
      }
   }

   public u5w(f6d var1, t9z var2) {
      super(var2, new k1x(var2));
      this.l6 = var1;
   }

   public final double j5() {
      com.aspose.slides.internal.o9b.w1 var1 = this.u3().i1().u3();
      com.aspose.slides.internal.o9b.w1 var2 = this.i1().u3();
      return com.aspose.slides.ms.System.q1.z3(
         com.aspose.slides.ms.System.q1.a6(var1.l6() - var2.l6(), 2.0) + com.aspose.slides.ms.System.q1.a6(var1.k5() - var2.k5(), 2.0)
      );
   }

   public final double w1() {
      com.aspose.slides.internal.o9b.w1 var1 = this.u3().i1().u3();
      com.aspose.slides.internal.o9b.w1 var2 = this.i1().u3();
      double var3 = com.aspose.slides.ms.System.q1.u3(var2.k5() - var1.k5(), var2.l6() - var1.l6());
      double var5 = var3 * (180.0 / Math.PI);
      if (var5 < 0.0) {
         var5 += 360.0;
      }

      if (var5 < 0.0) {
         var5 += 360.0;
      }

      return var5;
   }

   public final boolean r4() {
      return this.n5;
   }

   public final void k5(boolean var1) {
      this.n5 = var1;
   }
}
