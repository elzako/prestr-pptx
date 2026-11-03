package com.aspose.slides;

class i2z extends h7x {
   i2z(l5 var1) {
      super(var1);
   }

   @Override
   protected void n5(z5 var1) {
      this.u6();
      this.c8(var1);
      if (this.n5().c8().isPlotOrderReversed()) {
         this.n5.reverse();
      }

      this.j5();
      com.aspose.slides.internal.o9b.f2 var2 = this.u9(var1).a6();
      this.k5(var2.l6() + this.q0());
      this.u3(var1.l6());
      this.n5(var2.a6());
      this.a6(var1);
   }

   @Override
   protected void l6(z5 var1) {
      for (int var2 = 0; var2 < this.n5.size(); var2++) {
         g8t var3 = this.n5.get_Item(var2);
         float var4 = this.n5(((Double)com.aspose.slides.internal.v6g.k5.u3(var3.h0(), double.class)).doubleValue());
         float var5 = var4 - var3.d5() / 2.0F;
         var3.a6(this.z3() == 1 ? this.d2() - this.q0() - var3.d2() : this.q0());
         var3.u9(var5);
      }

      for (v6g var9 : this.a0()) {
         var9.t1();
      }
   }

   @Override
   protected void h0(z5 var1) {
      a9v var2 = com.aspose.slides.internal.v6g.k5.n5(this.y1().y1(), u2w.class).a6(new z5(this.n5().d2().c4(), this.n5().d2().y2()));
      boolean var3 = com.aspose.slides.internal.v6g.k5.n5(this.n5().d2().n3().getPlotArea(), ChartPlotArea.class).isLocationAutocalculated();
      double var4 = var2.l6() + 2.0F;
      if (!var3 && this.n5().d2().n3().getPlotArea().getLayoutTargetType() == 1) {
         var4 = this.n5().d2().n3().getHeight();
      }

      if (!this.l6.isEmpty() && ChartTypeCharacterizer.isChartTypeRadar(this.l6.get_Item(0).u9().getType())) {
         if (!var3) {
            var2 = com.aspose.slides.internal.v6g.k5.n5(this.y1().y1(), u2w.class).k5(var1);
            var4 = com.aspose.slides.ms.System.q1.l6(var2.n5(), var2.l6()) * 0.5F;
         } else {
            var4 = com.aspose.slides.ms.System.q1.l6(var2.n5(), var2.l6()) * 0.6F;
         }
      }

      int var6 = this.n5().l6().l6().u9(0);
      int var7 = this.n5().l6().l6().h0(0);
      float var8 = this.n5().l6().c8() * var7 / var6;
      double var9 = (this.n5.size() + 1) * var8;
      if (this.n5().c8().isAutomaticMaxValue() && this.n5().c8().isAutomaticMinValue() && this.t2 < 0.0 && this.s7 > 0.0 && this.n5.size() == 11) {
         var9 = this.n5.size() * var8;
      }

      int var11 = this.t2 < 0.0 && this.s7 > 0.0 ? 12 : 11;
      if (this.r4()) {
         var9 *= 0.55F;
         var11 = 21;
      }

      if ((var9 > var4 || this.n5.size() > var11)
         && this.n5().m3()
         && this.n5.size() > 2
         && (
            this.n5.size() != 3
               || !(com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(0).h0(), double.class) > 0.0)
               || !(com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(2).h0(), double.class) < 0.0)
         )) {
         double var12 = 0.0;
         double[] var14 = new double[]{this.x8};
         double[] var15 = new double[]{0.0};
         o9b.n5(var14[0], var14, var15, this.n5());
         this.x8 = var14[0];
         var12 = var15[0];
         this.x8 *= 10.0;
         this.m3();
         this.h0(var1);
      }

      if (this.n5.size() >= 2) {
         this.t2 = com.aspose.slides.ms.System.q1.k5(
            com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(0).h0(), double.class),
            com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(this.n5.size() - 1).h0(), double.class)
         );
         this.s7 = com.aspose.slides.ms.System.q1.l6(
            com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(0).h0(), double.class),
            com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(this.n5.size() - 1).h0(), double.class)
         );
         if (this.n5().z8()) {
            this.n5().u9(this.n5().m3() ? this.x8 / 5.0 : this.n5().w1() / 5.0);
         }
      }
   }

   @Override
   protected void a6(z5 var1) {
      if (this.T_()) {
         if (this.n5().u9() != 0 && this.n5().u9() % 90 != 0) {
            int var2 = this.n5().u9();
            this.n5().n5(90);
            float var3;
            float var4;
            if (this.n5().c8().isPlotOrderReversed()) {
               var3 = this.n5.get_Item(0).d5() / 2.0F;
               var4 = this.n5.get_Item(this.n5.size() - 1).d5() / 2.0F;
            } else {
               var3 = this.n5.get_Item(this.n5.size() - 1).d5() / 2.0F;
               var4 = this.n5.get_Item(0).d5() / 2.0F;
            }

            this.n5().n5(var2);
            if (this.n5().c8().isPlotOrderReversed()) {
               this.u3 = this.n5.get_Item(0).d5() / 2.0F;
               this.a6 = this.n5.get_Item(this.n5.size() - 1).d5() / 2.0F;
            } else {
               this.u3 = this.n5.get_Item(this.n5.size() - 1).d5() / 2.0F;
               this.a6 = this.n5.get_Item(0).d5() / 2.0F;
            }

            if (this.u3 > var3) {
               this.u3 = var3;
            }

            if (this.a6 > var4) {
               this.a6 = var4;
            }
         } else if (this.n5().c8().isPlotOrderReversed()) {
            this.u3 = this.n5.get_Item(0).d5() / 2.0F;
            this.a6 = this.n5.get_Item(this.n5.size() - 1).d5() / 2.0F;
         } else {
            this.u3 = this.n5.get_Item(this.n5.size() - 1).d5() / 2.0F;
            this.a6 = this.n5.get_Item(0).d5() / 2.0F;
         }

         if (com.aspose.slides.internal.v6g.k5.n5(this.n5().d2().n3().getPlotArea(), ChartPlotArea.class).isLocationAutocalculated()) {
            this.a6 = this.a6 >= 8.0F ? (this.a6 -= 8.0F) : 0.0F;
            this.u3 = this.u3 >= 8.0F ? (this.u3 -= 8.0F) : 0.0F;
         }
      }
   }

   @Override
   protected void c8() {
      this.t2();
   }

   @Override
   float n5(double var1) {
      double var3 = this.s7;
      double var5 = this.t2;
      float var7;
      if (!this.n5().c8().isPlotOrderReversed()) {
         var7 = (float)((var3 - var1) / (var3 - var5) * this.d5());
      } else {
         var7 = (float)((var1 - var5) / (var3 - var5) * this.d5());
      }

      return var7;
   }

   @Override
   public com.aspose.slides.internal.o9b.f2 t9() {
      return this.t4();
   }
}
