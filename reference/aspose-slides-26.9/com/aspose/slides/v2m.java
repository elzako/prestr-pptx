package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;

class v2m extends u7 {
   private com.aspose.slides.internal.o9b.f2 h0 = new com.aspose.slides.internal.o9b.f2();

   v2m(l5 var1) {
      super(var1);
   }

   @Override
   protected void n5(z5 var1) {
      this.u6();
      this.s7(var1);
      com.aspose.slides.internal.o9b.f2 var2 = this.u9(new z5(1000.0F, 1000.0F)).a6();
      this.x8(var1).l6(this.h0);
      boolean var3 = com.aspose.slides.internal.v6g.k5.n5(this.n5().d2().n3().getPlotArea(), ChartPlotArea.class).isLocationAutocalculated();
      if (var3) {
         float var4 = var1.n5() - var2.l6() * 2.0F > var1.l6() - var2.k5() * 2.0F ? this.h0.k5() : this.h0.l6();
         float var5 = var1.n5() - var2.l6() * 2.0F > var1.l6() - var2.k5() * 2.0F ? var1.l6() : var1.n5();
         this.k5(var5 - var4 * 2.0F);
         this.u3(var5 - var4 * 2.0F);
      } else {
         this.k5(var1.n5());
         this.u3(var1.l6());
      }

      this.n5(this.h0.a6());
   }

   @Override
   protected void l6(z5 var1) {
      double var2 = (Math.PI * 2) / this.n5.size();
      double var4 = this.d2() / 2.0;
      double var6 = this.d5() / 2.0;
      double var8 = (Math.PI / 2) + var2;
      double var10 = this.d2() / 2.0F + this.d5() / 35.0F;

      for (int var12 = 0; var12 < this.n5.size(); var12++) {
         var8 -= var2;
         double var13 = var4 + var10 * com.aspose.slides.ms.System.q1.c8(var8);
         double var15 = var6 - var10 * com.aspose.slides.ms.System.q1.h0(var8);
         double var17 = com.aspose.slides.ms.System.q1.u3(var8 / Math.PI * 180.0);
         if (var17 > -270.0 && var17 < -90.0) {
            var13 -= this.n5.get_Item(var12).d2();
         } else if (var17 == -270.0 || var17 == 90.0 || var17 == -90.0) {
            var13 -= this.n5.get_Item(var12).d2() / 2.0F;
         }

         if (var17 == -270.0 || var17 == 90.0) {
            var15 -= this.n5.get_Item(var12).d5();
         } else if (var17 != -90.0) {
            var15 -= this.n5.get_Item(var12).d5() / 2.0F;
         }

         this.n5.get_Item(var12).a6((float)var13);
         this.n5.get_Item(var12).u9((float)var15);
      }

      for (v6g var21 : this.a0()) {
         var21.t1();
      }
   }

   protected final com.aspose.slides.internal.o9b.f2 x8(z5 var1) {
      a9v var2 = com.aspose.slides.internal.v6g.k5.n5(this.y1().y1(), u2w.class).a6(new z5(this.n5().d2().c4(), this.n5().d2().y2()));
      return this.u9(new z5(var2.n5() * 0.25F, var2.l6()));
   }

   @Override
   protected void c8() {
      throw new InvalidOperationException("Opeartion is not supported by radar axis");
   }

   @Override
   public com.aspose.slides.internal.o9b.f2 t9() {
      return !this.T_()
         ? new com.aspose.slides.internal.o9b.f2(0.0F, 0.0F)
         : new com.aspose.slides.internal.o9b.f2(this.n5.get_Item(0).d2(), this.n5.get_Item(0).d5());
   }

   @Override
   float n5(double var1) {
      throw new InvalidOperationException("Opeartion is not supported by radar axis");
   }

   @Override
   protected void a6(z5 var1) {
      throw new InvalidOperationException("Opeartion is not supported by radar axis");
   }

   @Override
   protected z5 t2(z5 var1) {
      throw new InvalidOperationException("Opeartion is not supported by radar axis");
   }
}
