package com.aspose.slides;

class g3p extends l5t {
   @Override
   public com.aspose.slides.internal.o9b.f2 t9() {
      return this.z1();
   }

   g3p(l5 var1) {
      super(var1);
   }

   @Override
   protected void n5(z5 var1) {
      this.u6();
      this.c8(var1);
      if (!this.n5().c8().isPlotOrderReversed()) {
         this.n5.reverse();
      }

      com.aspose.slides.internal.o9b.f2 var2 = this.u9(var1).a6();
      this.k5(var1.n5());
      this.u3(var2.k5() + this.q0());
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
         if (!this.n5().c8().isPlotOrderReversed()) {
            var10 = this.d2() - (float)((var2 - var8) / (var2 - var4) * this.d2());
         } else {
            var10 = (float)((var2 - var8) / (var2 - var4) * this.d2());
         }

         float var11 = var10 - var7.d2() / 2.0F;
         var7.u9(this.z3() == 0 ? this.q0() : this.d5() - this.q0() - var7.d5());
         var7.a6(var11);
      }

      for (v6g var13 : this.a0()) {
         var13.t1();
      }
   }

   @Override
   protected void h0(z5 var1) {
      float var2 = var1.n5();
      float var3 = this.u9(var1).l6() * (this.n5.size() - 1);
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
      this.s7();
   }

   @Override
   protected void a6(z5 var1) {
      this.u3 = 0.0F;
      this.a6 = 0.0F;
      if (this.T_()) {
         float var2 = 0.0F;
         float var3 = 0.0F;
         float var4 = this.d2() / (this.n5.size() - 1);
         if (!this.n5().c8().isPlotOrderReversed()) {
            this.n5.reverse();
         }

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

         if (!this.n5().c8().isPlotOrderReversed()) {
            this.n5.reverse();
         }

         this.u3 = var2 * -1.0F;
         this.a6 = var3;
      }
   }

   @Override
   float n5(double var1) {
      double var3 = this.n5().n5(this.s7);
      double var5 = this.n5().n5(this.t2);
      float var7;
      if (this.n5().c8().isPlotOrderReversed()) {
         var7 = this.d2() - (float)((var1 - var5) / (var3 - var5) * this.d2());
      } else {
         var7 = (float)((var1 - var5) / (var3 - var5) * this.d2());
      }

      return var7;
   }
}
