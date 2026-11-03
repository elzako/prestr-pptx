package com.aspose.slides;

class i2t extends l5t {
   @Override
   public com.aspose.slides.internal.o9b.f2 t9() {
      return this.t4();
   }

   i2t(l5 var1) {
      super(var1);
   }

   @Override
   float n5(double var1) {
      double var3 = this.n5().n5(this.s7);
      double var5 = this.n5().n5(this.t2);
      float var7;
      if (this.n5().c8().isPlotOrderReversed()) {
         var7 = (float)((var1 - var5) / (var3 - var5) * this.d5());
      } else {
         var7 = this.d5() - (float)((var1 - var5) / (var3 - var5) * this.d5());
      }

      return var7;
   }

   @Override
   protected void n5(z5 var1) {
      this.u6();
      this.c8(var1);
      if (this.n5().c8().isPlotOrderReversed()) {
         this.n5.reverse();
      }

      com.aspose.slides.internal.o9b.f2 var2 = this.u9(var1).a6();
      this.k5(var2.l6() + this.q0());
      this.u3(var1.l6());
      this.n5(var2.a6());
      this.a6(var1);
   }

   @Override
   protected void l6(z5 var1) {
      double var2 = this.n5().n5(this.h2());
      double var4 = this.n5().n5(this.v0());

      for (int var6 = 0; var6 < this.n5.size(); var6++) {
         g8t var7 = this.n5.get_Item(var6);
         double var8 = this.n5().n5(com.aspose.slides.internal.v6g.k5.u3(var7.h0(), double.class));
         float var10;
         if (this.n5().c8().isPlotOrderReversed()) {
            var10 = this.d5() - (float)((var2 - var8) / (var2 - var4) * this.d5());
         } else {
            var10 = (float)((var2 - var8) / (var2 - var4) * this.d5());
         }

         float var11 = var10 - var7.d5() / 2.0F;
         var7.a6(this.z3() == 1 ? this.d2() - this.q0() - var7.d2() : this.q0());
         var7.u9(var11);
      }

      for (v6g var13 : this.a0()) {
         var13.t1();
      }
   }

   @Override
   protected void h0(z5 var1) {
      float var2 = var1.l6();
      float var3 = this.u9(var1).k5() * (this.n5.size() - 1);
      if (this.n5().m3() && this.n5.size() > 2 && var3 > var2) {
         this.x8++;
         this.m3();
         this.h0(var1);
      }

      if (this.n5.size() >= 2) {
         this.t2 = com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(0).h0(), double.class);
         this.s7 = com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(this.n5.size() - 1).h0(), double.class);
         if (this.n5().z8()) {
            this.n5().u9(this.n5().m3() ? this.x8 / 10.0 : this.n5().w1() / 10.0);
         }
      }
   }

   @Override
   protected void c8() {
      this.t2();
   }

   @Override
   protected void a6(z5 var1) {
      double var2 = this.n5().n5(this.s7);
      double var4 = this.n5().n5(this.t2);

      for (int var6 = 0; var6 < this.n5.size(); var6++) {
         if (this.n5.get_Item(var6).T_()) {
            double var7 = this.n5().n5(com.aspose.slides.internal.v6g.k5.u3(this.n5.get_Item(var6).h0(), double.class));
            double var9 = this.n5.get_Item(var6).d5();
            float var11;
            if (this.n5().c8().isPlotOrderReversed()) {
               var11 = this.d5() - (float)((var2 - var7) / (var2 - var4) * this.d5());
            } else {
               var11 = (float)((var2 - var7) / (var2 - var4) * this.d5());
            }

            if (var11 - var9 / 2.0 < 0.0 && (var11 - var9 / 2.0) * -1.0 > this.a6) {
               this.a6 = (float)(var11 - var9 / 2.0) * -1.0F;
            }

            if (var11 + var9 / 2.0 > this.d5() && var11 + var9 / 2.0 - this.d5() > this.u3) {
               this.u3 = (float)(var11 + var9 / 2.0 - this.d5());
            }
         }
      }
   }
}
