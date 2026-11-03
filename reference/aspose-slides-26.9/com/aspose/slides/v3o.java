package com.aspose.slides;

class v3o extends o8r {
   v3o(l5 var1) {
      super(var1);
   }

   @Override
   protected void c8() {
      this.t2();
   }

   @Override
   protected void n5(z5 var1) {
      this.u6();
      this.x8(var1);
      this.h0();
      this.j5();
      this.y4(var1);
      this.h0(var1);
      com.aspose.slides.internal.o9b.f2 var2 = this.u9(var1).a6();
      this.k5(var2.l6() + this.q0());
      this.u3(var1.l6());
      this.n5(var2.a6());
      this.a6(var1);
   }

   @Override
   protected void l6(z5 var1) {
      double var2 = this.w1();
      float var4 = this.n5().k5().a6() / 2.0F;

      for (int var5 = 0; var5 < this.n5.size(); var5++) {
         g8t var6 = this.n5.get_Item(var5);
         float var7 = this.l6((double)((Integer)var6.h0()).intValue());
         if (this.n5().a0() || this.n5().d2().n3().hasDataTable()) {
            var7 += (float)(var2 / 2.0);
         }

         if (this.n5().c8().isPlotOrderReversed()) {
            var7 = this.d5() - var7;
         }

         float var8;
         if (this.n5().u9() == 0 || this.n5().u9() % 90 == 0) {
            var8 = var7 + var6.d5() / 2.0F;
         } else if (this.n5().u9() > 0) {
            var8 = var7 + var4;
         } else {
            var8 = var7 - var4 + var6.d5();
         }

         var6.a6(this.z3() == 1 ? this.d2() - this.q0() - var6.d2() : this.q0());
         var6.u9(this.d5() - var8);
      }

      for (v6g var12 : this.a0()) {
         var12.t1();
      }
   }

   private void y4(z5 var1) {
      z5 var2 = this.n5(var1, this.l6(this.n5().c8().getBaseUnitScale()));
      z5 var3 = new z5(this.n5().d2().c4(), this.n5().d2().y2());
      float var4 = 0.0F;
      if (this.n5().u9() == 0) {
         var4 = this.s7(var3);
      } else if (this.n5().u9() % 90 == 0) {
         var4 = this.s7(var3);
      } else {
         var4 = this.u9(var3).k5();
      }

      if (this.n5().m3() && this.n5().z8()) {
         if (var4 > var2.n5()) {
            int var5 = this.l6(this.n5().c8().getBaseUnitScale());
            int var6 = com.aspose.slides.internal.v6g.k5.u3(var1.l6() / var4, 13);
            int var7 = var5 % var6 == 0 ? var5 / var6 : var5 / var6 + 1;
            this.k5(var7);
         } else {
            this.n5().h0(1.0);
            this.n5().u9(1.0);
            this.n5().u3(this.n5().c8().getBaseUnitScale());
            this.n5().a6(this.n5().c8().getBaseUnitScale());
         }
      } else if (!this.n5().m3() && this.n5().z8()) {
         this.n5()
            .u9(com.aspose.slides.internal.v6g.k5.u3(this.n5().w1() / 2.0, 14) == 0 ? 1.0 : com.aspose.slides.internal.v6g.k5.u3(this.n5().w1() / 2.0, 14));
         this.n5().a6(this.n5().m1());
      } else if (this.n5().m3() && !this.n5().z8()) {
      }
   }

   @Override
   protected z5 n5(z5 var1, int var2) {
      float var3 = var1.l6() / var2;
      float var4 = var1.n5() * 0.5F - this.q0();
      return new z5(var4, var3);
   }

   @Override
   protected void a6(z5 var1) {
      float var2 = this.n5().k5().a6() / 2.0F;
      if (this.n5().a0() && this.n5().u9() != 0) {
         float var3 = this.w1();

         for (int var4 = 0; var4 < this.n5.size(); var4++) {
            g8t var5 = this.n5.get_Item(var4);
            float var6 = var5.d5();
            if (var5.T_()) {
               float var7 = var1.l6() - (var3 * var4 + var3 / 2.0F);
               if (this.n5().u9() > 0) {
                  float var8 = var7 - var2;
                  if (var8 + var6 > this.d5() && var8 + var6 - this.d5() > this.u3) {
                     this.u3 = var8 + var6 - this.d5();
                  }
               } else {
                  float var9 = var7 + var2;
                  if (var9 - var6 < 0.0F && (var9 - var6) * -1.0F > this.a6) {
                     this.a6 = (var9 - var6) * -1.0F;
                  }
               }
            }
         }
      } else {
         this.a6 = var2;
         this.u3 = var2;
      }
   }

   @Override
   float n5(double var1) {
      int var3 = com.aspose.slides.internal.v6g.k5.u3(this.n5().q0(), 14);
      int var4 = this.l6(this.n5().c8().getBaseUnitScale());
      int var5 = p4.n5(
         this.n5().c8().getBaseUnitScale(),
         com.aspose.slides.internal.v6g.k5.u3(var1, 14),
         var3,
         com.aspose.slides.internal.v6g.k5.u3(this.n5().z3(), 14),
         false
      );
      return !this.n5().c8().isPlotOrderReversed() ? this.d5() - (float)var5 / var4 * this.d5() : (float)var5 / var4 * this.d5();
   }

   final float l6(double var1) {
      int var3 = com.aspose.slides.internal.v6g.k5.u3(this.n5().q0(), 14);
      int var4 = this.l6(this.n5().c8().getBaseUnitScale());
      int var5 = p4.n5(
         this.n5().c8().getBaseUnitScale(),
         com.aspose.slides.internal.v6g.k5.u3(var1, 14),
         var3,
         com.aspose.slides.internal.v6g.k5.u3(this.n5().z3(), 14),
         false
      );
      return (float)var5 / var4 * this.d5();
   }

   final float w1() {
      int var1 = this.l6(this.n5().c8().getBaseUnitScale());
      return this.d5() / var1;
   }

   @Override
   public com.aspose.slides.internal.o9b.f2 t9() {
      return this.t4();
   }
}
