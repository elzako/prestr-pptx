package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class h6t {
   private final n1g n5;

   public h6t(n1g var1) {
      this.n5 = var1;
   }

   final void n5() {
      boolean var1 = ChartTypeCharacterizer.isChartTypeBar(this.n5.n3().getType());
      int var2 = n1g.u3(this.n5.y4());
      double var3 = this.n5.m1().t4();
      float var5 = o9b.n5(
         com.aspose.slides.internal.v6g.k5.u3(this.n5.e5().k5() - this.n5.e5().a6(), 13),
         com.aspose.slides.internal.v6g.k5.u3(this.n5.e5().a6(), 13),
         var1,
         this.n5.m1()
      );
      IRotation3D var6 = this.n5.n3().getRotation3D();
      float var7 = var6.getRotationY() & 65535;
      l5 var8 = this.n5.q0();
      l5 var9 = this.n5.m1();
      List var10 = this.n5.y4();
      int var11 = var10.size();
      float var12 = this.n5.e5().u3() / var2;
      float var13 = this.n5.e5().n5(false, var2, var11);
      float var14 = this.n5.e5().c8();
      float var15 = (var6.getDepthPercents() & 65535) / 100.0F;
      var14 *= var15;
      float var16 = var13 * (this.n5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) / 100.0F;
      float var17 = var14 * ((this.n5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F);
      List var18 = new List();
      float var19 = var14 + var17 / 2.0F;
      if (!var6.getRightAngleAxes()) {
         var19 = -var17 / 2.0F;
      }

      for (int var20 = 0; var20 < var2; var20++) {
         int var21 = var20;
         if (this.n5.p8() > 180) {
            var21 = var2 - 1 - var20;
         }

         for (int var22 = 0; var22 < var10.size(); var22++) {
            int var23 = var22;
            if (var7 > 180.0F) {
               var23 = var10.size() - 1 - var22;
            }

            g3y var24 = (g3y)var10.get_Item(var23);
            int var25 = var24.l6();
            float var26 = this.n5.e5().l6() + (var12 * var21 + var16 / 2.0F + var23 * var13);
            int var27 = var21;
            if (var8.c8().isPlotOrderReversed()) {
               var27 = var2 - 1 - var21;
            }

            if (var27 <= var24.c8().size() - 1) {
               List var28 = var24.c8();
               t9z var29 = (t9z)var28.get_Item(var27);
               if (var29 != null && !var29.c8()) {
                  double var30 = var9.k5(var29.n5());
                  float var32 = (float)g6z.n5(var3, var30) / (float)(var9.z3() - var9.q0()) * this.n5.e5().a6();
                  if (var9.c8().isPlotOrderReversed()) {
                     var32 = -var32;
                  }

                  float var33 = this.n5.e5().k5() + var32;
                  com.aspose.slides.internal.x4g.s7 var34 = new com.aspose.slides.internal.x4g.s7();

                  try {
                     if (var32 == 0.0F) {
                        var34.l6(new com.aspose.slides.internal.o9b.y1(var26, var33, var13, 1.0F));
                     } else {
                        var34.l6(new com.aspose.slides.internal.o9b.y1(var26, var33, var13, -var32));
                     }

                     n6u var35 = new n6u(1.0F, 0.0F);
                     var29.n5(var34, var14, var19, var35);
                  } finally {
                     if (var34 != null) {
                        var34.dispose();
                     }
                  }

                  boolean var41 = g6z.n5(var32, 0.0) <= 0.0;
                  com.aspose.slides.internal.o9b.w1 var36 = v2s.n5(var26, var13, var5, var32, var41).u3();
                  v2o var37 = new v2o(var25, var27, var36.u3(), var41, var19);
                  var18.addItem(var37);
               }
            }
         }
      }

      v2s.n5(var18, this.n5);
   }
}
