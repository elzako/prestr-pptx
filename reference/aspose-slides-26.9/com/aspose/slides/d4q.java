package com.aspose.slides;

class d4q extends h7x {
   d4q(l5 var1) {
      super(var1);
   }

   @Override
   protected void n5(z5 var1) {
      this.u6();
      this.h0();
      this.k5(var1.n5());
      this.c8(var1);
      this.j5();
      if (!this.n5().c8().isPlotOrderReversed()) {
         this.n5.reverse();
      }

      com.aspose.slides.internal.o9b.f2 var2 = this.u9(var1).a6();
      this.u3(var2.k5() + this.q0());
      this.n5(var2.a6());
      this.a6(var1);
   }

   @Override
   protected void h0(z5 var1) {
      float var2 = 0.0F;
      float var3 = com.aspose.slides.internal.v6g.k5.n5(this.n5().d2().n3().getPlotArea(), ChartPlotArea.class).isLocationAutocalculated()
         ? com.aspose.slides.internal.v6g.k5.n5(this.y1().y1(), u2w.class).a6(new z5(this.n5().d2().c4(), this.n5().d2().y2())).n5()
         : var1.n5();
      var2 = var3 / (this.n5.size() - 1);
      float var4 = com.aspose.slides.ms.System.q1.k5(
               com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(0).h0(), double.class),
               com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(this.n5.size() - 1).h0(), double.class)
            )
            < 0.0
         ? 3.0F
         : 2.0F;
      float var5 = this.n5("0").l6();
      double var6 = 7.5;
      if (ChartTypeCharacterizer.isChartTypeBar(this.l6.get_Item(0).u9().getType()) && this.n5.size() < 6) {
         var6 = this.n5.size() + 2.0;
      } else if (ChartTypeCharacterizer.isChartTypeScatter(this.l6.get_Item(0).u9().getType())) {
         var6 = 6.615;
      }

      if (this.n5().m3() && this.n5.size() > var4 && var5 * var6 > var2) {
         double var8 = 0.0;
         double[] var10 = new double[]{this.x8};
         double[] var11 = new double[]{0.0};
         o9b.n5(var10[0], var10, var11, this.n5());
         this.x8 = var10[0];
         var8 = var11[0];
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
   protected void c8() {
      this.s7();
   }

   @Override
   float n5(double var1) {
      double var3 = this.s7;
      double var5 = this.t2;
      float var7;
      if (this.n5().c8().isPlotOrderReversed()) {
         var7 = (float)((var3 - var1) / (var3 - var5) * this.d2());
      } else {
         var7 = (float)((var1 - var5) / (var3 - var5) * this.d2());
      }

      return var7;
   }

   @Override
   protected void a6(z5 var1) {
      this.u3 = 0.0F;
      this.a6 = 0.0F;
      if (this.T_()) {
         float var2 = 0.0F;
         float var3 = 0.0F;
         float var4 = this.d2() / (this.n5.size() - 1);

         for (int var5 = 0; var5 < this.n5.size(); var5++) {
            float var6 = var4 * var5;
            float var8;
            float var9;
            if (this.n5().u9() != 0 && this.n5().u9() % 90 != 0) {
               float var10 = this.n5.get_Item(var5).d2();
               if (this.n5().u9() > 0) {
                  var8 = var6 + this.x8() - var10;
                  var9 = this.x8();
               } else {
                  var8 = this.x8() * -1.0F;
                  var9 = var6 - this.x8() + var10;
               }
            } else {
               float var7 = this.n5.get_Item(var5).d2();
               var8 = var6 - var7 / 2.0F;
               var9 = var6 + var7 / 2.0F;
            }

            if (var8 < 0.0F && var8 < var2) {
               var2 = var8;
            }

            if (var9 > var1.n5() && var9 - var1.n5() > var3) {
               var3 = var9 - var1.n5();
            }
         }

         this.u3 = var2 * -1.0F;
         this.a6 = var3;
      }
   }

   @Override
   protected void l6(z5 var1) {
      for (int var2 = 0; var2 < this.n5.size(); var2++) {
         g8t var3 = this.n5.get_Item(var2);
         float var4 = this.n5(((Double)com.aspose.slides.internal.v6g.k5.u3(var3.h0(), double.class)).doubleValue());
         if (this.n5().u9() == 0 || this.n5().u9() % 90 == 0) {
            var3.a6(var4 - var3.d2() / 2.0F);
         } else if (this.n5().u9() < 0) {
            if (this.n3().n5().c8().isPlotOrderReversed()) {
               var3.a6(var4 - var3.d2() + this.x8());
            } else {
               var3.a6(var4 - this.x8());
            }
         } else if (this.n3().n5().c8().isPlotOrderReversed()) {
            var3.a6(var4 - this.x8());
         } else {
            var3.a6(var4 - var3.d2() + this.x8());
         }

         var3.u9(this.z3() == 0 ? this.q0() : this.d5() - this.q0() - var3.d5());
      }

      for (v6g var5 : this.a0()) {
         var5.t1();
      }
   }

   @Override
   public com.aspose.slides.internal.o9b.f2 t9() {
      return this.z1();
   }
}
