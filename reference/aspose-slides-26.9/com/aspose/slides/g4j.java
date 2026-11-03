package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class g4j extends f6d {
   t9z n5;
   private double k5;
   private double u3;
   private boolean a6;
   z7s l6;

   public final double x8() {
      return this.d2() / 2.0F;
   }

   public final double n3() {
      return this.k5 % 360.0;
   }

   public final double y4() {
      return this.u3;
   }

   public final double e2() {
      return (this.k5 + this.u3 / 2.0) % 360.0;
   }

   public final int t9() {
      return this.n5.s7() != null ? this.n5.s7().getExplosion() : 0;
   }

   @Override
   public boolean T_() {
      return this.u3 > 0.0 && this.t2() > 0.0;
   }

   public final boolean z1() {
      return this.a6;
   }

   public final void n5(boolean var1) {
      this.a6 = var1;
   }

   public g4j(t9z var1, double var2, double var4, double var6, double var8) {
      super(var6, var8);
      this.n5 = var1;
      this.k5 = var2 - 90.0;
      if (this.k5 < 0.0) {
         this.k5 += 360.0;
      }

      this.u3 = var4;
   }

   public g4j(z7s var1, double var2, double var4, double var6, double var8) {
      super(var6, var8);
      this.l6 = var1;
      this.k5 = var2 - 90.0;
      if (this.k5 < 0.0) {
         this.k5 += 360.0;
      }

      this.u3 = var4;
   }

   @Override
   void U_() {
      if (this.T_()) {
         if (this.n5 != null) {
            com.aspose.slides.internal.x4g.s7 var1 = this.c8();
            this.n5.u9(var1);
         }
      }
   }

   @Override
   protected void l6() {
      com.aspose.slides.internal.x4g.s7 var1 = this.c8();
      if (this.n5 != null) {
         boolean var2 = this.n5.l6(var1);
         if (!var2) {
            this.n5.k5(var1);
         }

         if (this.n5.s7() != null && (!this.n5.s7().getFormat().getLine().isFormatNotDefined() || !((Format)this.n5.s7().getFormat()).z3())) {
            this.n5.n5(var1);
         }
      }

      if (this.l6 != null) {
         w5k.k5(
            com.aspose.slides.internal.o9b.c8.w4().o8(),
            com.aspose.slides.internal.o9b.c8.u3.o8(),
            this.l6.c8(),
            var1,
            (LineFormat)this.l6.h0().getFormat().getLine(),
            (FillFormat)this.l6.h0().getFormat().getFill(),
            this.l6.h0().getFormat().getEffect(),
            1.0F
         );
         w5k.n5(com.aspose.slides.internal.o9b.c8.u3.o8(), this.l6.c8(), var1, this.l6.h0().k5(), 1.0F, this.l6.h0().u3());
         w5k.n5(
            com.aspose.slides.internal.o9b.c8.w4().o8(),
            this.l6.c8(),
            var1,
            (LineFormat)this.l6.h0().getFormat().getLine(),
            this.l6.h0().getFormat().getEffect()
         );
      }
   }

   protected com.aspose.slides.internal.x4g.s7 c8() {
      com.aspose.slides.internal.x4g.s7 var1 = new com.aspose.slides.internal.x4g.s7();
      com.aspose.slides.internal.o9b.w1 var2 = this.i1().u3();
      if (this.u3 < 360.0) {
         com.aspose.slides.internal.o9b.w1 var3 = x5h.n5(this.k5, this.x8(), var2.u3()).u3();
         com.aspose.slides.internal.o9b.w1 var4 = x5h.n5(this.k5 + this.u3, this.x8(), var2.u3()).u3();
         var1.n5(var2.u3(), var3.u3());
         var1.n5(this.e5().y4(), (float)this.k5, (float)this.u3);
         var1.n5(var4.u3(), var2.u3());
      } else {
         var1.n5(this.e5().y4());
      }

      return var1;
   }

   public final com.aspose.slides.internal.o9b.w1 n5(double var1, a9v var3) {
      if (var1 > 0.0) {
         com.aspose.slides.internal.o9b.w1 var4 = x5h.n5(this.e2(), var1, com.aspose.slides.internal.o9b.w1.n5.u3()).u3();
         com.aspose.slides.internal.o9b.y1 var5 = this.n5(1.0, 1.0, 5).u3().y4();
         var5.k5(var4.l6(), var4.k5());
         com.aspose.slides.internal.o9b.y1 var6 = new com.aspose.slides.internal.o9b.y1(-var3.u3(), -var3.a6(), this.y2().d2(), this.y2().d5());
         float var7 = 0.0F;
         float var8 = 0.0F;
         float[] var9 = new float[]{0.0F};
         float[] var10 = new float[]{0.0F};
         boolean var11 = x5h.n5(var6.y4(), var5.y4(), var9, var10);
         var7 = var9[0];
         var8 = var10[0];
         if (var11) {
            var1 = com.aspose.slides.ms.System.q1.k5(
               n5(var1, var4.l6(), com.aspose.slides.ms.System.q1.n5(var7)), n5(var1, var4.k5(), com.aspose.slides.ms.System.q1.n5(var8))
            );
            x5h.n5(this.e2(), var1, com.aspose.slides.internal.o9b.w1.n5.u3()).n5(var4);
         }

         return new com.aspose.slides.internal.o9b.w1(var4.l6(), var4.k5());
      } else {
         return new com.aspose.slides.internal.o9b.w1();
      }
   }

   public final z3y n5(double var1, double var3) {
      return this.n5(var1, var3, 20);
   }

   public final z3y n5(double var1, double var3, int var5) {
      double var6 = this.x8() * var1;
      com.aspose.slides.internal.o9b.w1 var8 = this.i1().u3();
      x5h.n5(this.e2(), var6 * (1.0 - var3), var8.u3()).n5(var8);
      var6 -= var6 * (1.0 - var3);
      List var9 = new List();
      var9.addItem(var8.u3());
      var9.addItem(x5h.n5(this.k5 + this.u3 * (1.0 - var3), var6, var8.u3()).u3());

      for (int var10 = var5; var10 < this.u3 * var3; var10 += var5) {
         double var11 = this.k5 + var10;
         var9.addItem(x5h.n5(var11, var6, var8.u3()).u3());
      }

      var9.addItem(x5h.n5(this.k5 + this.u3 * var3, var6, var8.u3()).u3());
      var9.addItem(var8.u3());
      return new z3y((com.aspose.slides.internal.o9b.w1[])var9.toArray(new com.aspose.slides.internal.o9b.w1[0]));
   }

   public final com.aspose.slides.internal.o9b.w1 l6(double var1) {
      return x5h.n5(this.e2() % 360.0, var1, this.i1().u3());
   }

   public final com.aspose.slides.internal.o9b.w1 n5(com.aspose.slides.internal.o9b.f2 var1, double var2) {
      com.aspose.slides.internal.o9b.w1 var4 = this.l6(var2).u3();
      u6x var5 = new u6x(new e4c(var4.u3()), var1.l6(), var1.k5());
      e4c var6 = q3g.n5(var5.z1(), new e4c(this.i1().u3())).u9();
      return new com.aspose.slides.internal.o9b.w1((float)var6.n5, (float)var6.l6);
   }

   public final com.aspose.slides.internal.o9b.w1 l6(com.aspose.slides.internal.o9b.f2 var1, double var2) {
      com.aspose.slides.internal.o9b.w1 var4 = this.l6(var2).u3();
      double var5 = 1.0;
      double var7 = 1.0;
      double var9 = this.e2() % 180.0;
      if (var9 <= 45.0) {
         var7 = var9 / 45.0;
      } else if (var9 >= 67.5 && var9 <= 90.0) {
         var5 = (90.0 - var9) / 22.5;
      } else if (var9 > 90.0 && var9 <= 112.5) {
         var5 = (var9 - 90.0) / 22.5;
      } else if (var9 >= 135.0) {
         var7 = (180.0 - var9) / 45.0;
      }

      if (this.e2() > 90.0 && this.e2() < 270.0) {
         var5 *= -1.0;
      }

      if (this.e2() > 180.0) {
         var7 *= -1.0;
      }

      double var11 = var1.l6() / 2.0F * var5;
      double var13 = var1.k5() / 2.0F * var7;
      return x5h.n5(var4.u3(), (float)var11, (float)var13);
   }

   private static double n5(double var0, double var2, double var4) {
      if (var4 > 0.0) {
         var2 = com.aspose.slides.ms.System.q1.n5(var2);
         double var6 = var0 / var2;
         double var8 = (var2 - var4) * var6;
         return com.aspose.slides.ms.System.q1.k5(var8, var0);
      } else {
         return var0;
      }
   }
}
