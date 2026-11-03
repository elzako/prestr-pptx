package com.aspose.slides;

class g5l extends v6g {
   private a8e n5;
   private x2k l6;
   private x7u k5;

   g5l(g3y var1) {
      this.n5 = var1.t2().s7();
      this.k5 = new x7u(var1.k5(), this.n5);
      this.n5(this.k5);
      if (this.n5.h0().n3().getChartDataTable().getShowLegendKey()) {
         this.l6 = new q6t(var1);
         this.n5(this.l6);
      }
   }

   @Override
   protected void n5(z5 var1) {
      float var2 = 0.0F;
      if (this.l6 != null) {
         int var3 = com.aspose.slides.internal.v6g.k5.n5(this.y1(), d1x.class).u3();
         float var4 = this.k5.c8().a6();
         float var5 = (float)com.aspose.slides.ms.System.q1.n5((double)(var4 / 3.0F), 0);
         if (var3 == 0) {
            this.l6.n3(new z5(var5, var5));
         } else {
            this.l6.n3(new z5(h9p.n5(var3), var5));
         }

         var2 = this.l6.d2() + 2.5F;
      }

      d2k var6 = this.k5.n5(this.k5.h0(), var1.n5() - var2, var1.l6()).u3();
      var6.l6 = var6.l6 + 2.0F * this.h0();
      var6.n5 += 5.0F;
      this.k5.n3(new z5(var6.n5, var6.l6));
      this.k5(var2 + this.k5.d2());
      this.u3(this.k5.d5());
   }

   @Override
   protected void l6(z5 var1) {
      float var2 = 2.5F;
      if (this.l6 != null) {
         this.l6.a6(var2);
         this.l6.u9(this.d5() / 2.0F - this.l6.d5() / 2.0F);
         var2 += this.l6.d2() + 2.5F;
         this.l6.t1();
      }

      this.k5.u9(this.h0());
      this.k5.a6(var2);
      this.k5.t1();
   }

   @Override
   protected void u3(z5 var1) {
   }

   final x2k u3() {
      return this.l6;
   }

   private float h0() {
      return 1.5F;
   }
}
