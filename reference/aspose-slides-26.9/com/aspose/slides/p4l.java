package com.aspose.slides;

class p4l {
   private final n1g n5;

   public p4l(n1g var1) {
      this.n5 = var1;
   }

   final void n5() {
      try {
         this.n5(this.n5);
         this.k5(this.n5);
      } catch (RuntimeException var2) {
         com.aspose.slides.internal.n8e.v4.n5(var2);
      }
   }

   private void n5(n1g var1) {
      k1d var2 = new k1d();
      var2.n5(var1);
   }

   private boolean l6(n1g var1) {
      return var1.y4().size() == 0 || n1g.u3(var1.y4()) == 0;
   }

   private void k5(n1g var1) {
      if (!this.l6(var1)) {
         var1.v4();
         var1.n5.n5();
         var1.u9();
         this.u3(var1);
         this.a6(var1);
         this.t2(var1);
         this.u9(var1);
         this.s7(var1);
         this.x8(var1);
         var1.h0();
         this.h0(var1);
         this.c8(var1);
      }
   }

   private void u3(n1g var1) {
      var1.f2().t4();
      var1.b3().t4();
      var1.i1().t4();
      var1.f2().n5();
      var1.b3().n5();
      var1.i1().n5();
   }

   private void a6(n1g var1) {
      z0k var2 = new z0k(var1);
      var2.n5();
   }

   private void u9(n1g var1) {
      h5 var2 = new h5(var1);
      var2.n5();
   }

   private void h0(n1g var1) {
      if (var1.n3().hasTitle()) {
         var1.x8().n5(var1);
      }
   }

   private void c8(n1g var1) {
      if (var1.n3().hasLegend()) {
         boolean var2 = ChartTypeCharacterizer.isChartTypeBar(var1.n3().getType());
         g3y var3 = var1.y4().get_Item(0);
         if (var1.n3().getType() != 30 && var1.n3().getType() != 27 && !var1.t2().n3()) {
            z7d.n5(var2, var3, var1, (Legend)var1.n3().getLegend());
         } else {
            z7d.n5(var3, var1, (Legend)var1.n3().getLegend(), var1.y4().get_Item(0));
         }
      }
   }

   private void t2(n1g var1) {
      switch (var1.n3().getType()) {
         case 3:
         case 7:
         case 11:
         case 15:
            h6t var5 = new h6t(var1);
            var5.n5();
            break;
         case 4:
         case 8:
         case 12:
         case 16:
            n5p var6 = new n5p(var1);
            var6.n5();
            break;
         case 5:
         case 9:
         case 13:
         case 17:
            n5p var7 = new n5p(var1);
            var7.l6();
            break;
         case 6:
         case 10:
         case 14:
         case 18:
            b7s var4 = new b7s(var1);
            var4.n5();
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 34:
         case 35:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
         case 59:
         case 60:
         case 61:
         default:
            break;
         case 25:
            p4j var3 = new p4j(var1);
            var3.n5();
            break;
         case 33:
            if (var1.n3().u9() == 3) {
               v6 var11 = new v6(var1);
               var11.n5();
            } else {
               v6 var12 = new v6(var1);
               var12.l6();
            }
            break;
         case 36:
         case 39:
         case 42:
         case 45:
            v6 var9 = new v6(var1);
            var9.k5();
            break;
         case 37:
         case 40:
         case 43:
         case 46:
            v6 var10 = new v6(var1);
            var10.u3();
            break;
         case 38:
         case 41:
         case 44:
            v6 var8 = new v6(var1);
            var8.l6();
            break;
         case 62:
            w4i var2 = new w4i(var1);
            var2.n5();
      }
   }

   private void s7(n1g var1) {
      IRotation3D var2 = var1.n3().getRotation3D();
      boolean var3 = var2.getRightAngleAxes();
      var2.setRightAngleAxes(true);
      float var4 = var1.e5().c8();
      var4 *= (var2.getDepthPercents() & 65535) / 100.0F;
      if (var1.m1().c8() != null && var1.m1().c8().hasTitle() && var1.m1().c8().isVisible()) {
         float var5 = var4 * ((var1.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F);
         float var6 = var4 + var5;
         if (var1.m1().c8().getPosition() == 3) {
            var6 = 0.0F;
         }

         if (!var3) {
            var6 = 0.0F;
         }

         var1.m1().h0().n5(var1, var6);
      }

      if (var1.q0().c8() != null && var1.q0().c8().hasTitle() && var1.q0().c8().isVisible()) {
         float var8 = var4 * ((var1.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F);
         float var10 = var4 + var8;
         var1.q0().h0().n5(var1, var10);
      }

      if (var1.m3().c8() != null && var1.m3().c8().hasTitle() && var1.m3().c8().isVisible()) {
         float var9 = var4 * ((var1.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F);
         float var11 = var4 + var9 / 2.0F;
         if (!var3) {
            var11 = 0.0F;
         }

         var1.m3().h0().n5(var1, var11 / 2.0F);
      }

      var2.setRightAngleAxes(var3);
   }

   private void x8(n1g var1) {
      if (var1.n3().hasDataTable()) {
         x7n var2 = new x7n(var1);
         var2.n5();
      }
   }
}
