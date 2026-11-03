package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;

class b7s {
   private final n1g n5;

   public b7s(n1g var1) {
      this.n5 = var1;
   }

   final void n5() {
      l5 var1 = this.n5.q0();
      if (var1.c8().getCategoryAxisType() == 1) {
         throw new NotImplementedException("Not implemented rendering of CategoryAxisType.Date for 3-D Column Chart");
      }

      boolean var2 = ChartTypeCharacterizer.isChartTypeBar(this.n5.n3().getType());
      int var3 = n1g.u3(this.n5.y4());
      double var4 = this.n5.m1().t4();
      float var6 = o9b.n5(
         com.aspose.slides.internal.v6g.k5.u3(this.n5.e5().k5() - this.n5.e5().a6(), 13),
         com.aspose.slides.internal.v6g.k5.u3(this.n5.e5().a6(), 13),
         var2,
         this.n5.m1()
      );
      IRotation3D var7 = this.n5.n3().getRotation3D();
      List var8 = this.n5.y4();
      l5 var9 = this.n5.m1();
      float var10 = (var7.getDepthPercents() & 65535) / 100.0F;
      float var11 = (((g3y)var8.get_Item(0)).u9().getParentSeriesGroup().getGapDepth() & 65535) / 100.0F;
      float var12 = (((g3y)var8.get_Item(0)).u9().getParentSeriesGroup().getGapWidth() & 65535) / 100.0F;
      float var13 = this.n5.e5().u3() / var3;
      float var14 = var13 / (1.0F + var12);
      float var15 = var14 * var12;
      float var16 = var13 * var10 / (1.0F + var11);
      float var17 = var7.getRotationY() & 65535;
      double var18 = this.n5(var8, var9);
      List var20 = new List();

      for (int var21 = 0; var21 < var8.size(); var21++) {
         int var22 = var8.size() - 1 - var21;
         if (this.n5.m3().c8().isPlotOrderReversed()) {
            var22 = var8.size() - 1 - var22;
         }

         g3y var23 = (g3y)var8.get_Item(var22);
         int var24 = var23.l6();
         boolean var25 = var23.u9().getBar3DShape() == 5 || var23.u9().getBar3DShape() == 2;
         float var26 = this.n5(var23.u9().getBar3DShape(), var8.size() - 1, var21, var7.getRightAngleAxes());
         List var27 = var23.c8();
         float var28 = (var16 + var16 * var11) * (var21 + 1) - var16 * var11 / 2.0F;
         if (!var7.getRightAngleAxes()) {
            var28 = -(var16 + var16 * var11) * (var8.size() - 1 - var21) - var16 * var11 / 2.0F;
         }

         for (int var29 = 0; var29 < var3; var29++) {
            int var30 = var29;
            if (var17 >= 180.0F) {
               var30 = var3 - 1 - var29;
            }

            float var31 = var13 * var30 + var15 / 2.0F;
            float var32 = this.n5.e5().l6() + var31;
            int var33 = var30;
            if (var1.c8().isPlotOrderReversed()) {
               var33 = var3 - 1 - var30;
            }

            if (var33 < var27.size()) {
               t9z var34 = null;
               if (var33 < var27.size()) {
                  var34 = (t9z)var27.get_Item(var33);
               }

               if (var34 != null && !var34.c8()) {
                  double var35 = var9.k5(var34.n5()) * var26;
                  float var37 = (float)g6z.n5(var4, var35) / (float)(var9.z3() - var9.q0()) * this.n5.e5().a6();
                  if (var9.c8().isPlotOrderReversed()) {
                     var37 = -var37;
                  }

                  float var38 = this.n5.e5().k5() + var37;
                  com.aspose.slides.internal.x4g.s7 var39 = new com.aspose.slides.internal.x4g.s7();

                  try {
                     var39.l6(
                        new com.aspose.slides.internal.o9b.y2(
                           com.aspose.slides.internal.v6g.k5.u3(var32, 13),
                           com.aspose.slides.internal.v6g.k5.u3(var38, 13),
                           com.aspose.slides.internal.v6g.k5.u3(var14, 13),
                           -com.aspose.slides.internal.v6g.k5.u3(var37, 13)
                        )
                     );
                     n6u var42;
                     if (var25 && var18 != 0.0) {
                        double var40 = var18 * var26;
                        var42 = new n6u(1.0F, (float)((var40 - var35) / var40));
                     } else {
                        var42 = new n6u(1.0F, 0.0F);
                     }

                     var34.n5(var39, var16, var28, var42);
                  } finally {
                     if (var39 != null) {
                        var39.dispose();
                     }
                  }

                  boolean var49 = g6z.n5(var37, 0.0) < 0.0;
                  float var44 = var32 + var14 / 2.0F;
                  float var45 = var6 + var37;
                  com.aspose.slides.internal.o9b.w1 var43 = new com.aspose.slides.internal.o9b.w1(var44, var45);
                  v2o var46 = new v2o(var24, var33, var43.u3(), var49, var28);
                  var20.addItem(var46);
               }
            }
         }
      }

      v2s.n5(var20, this.n5);
   }

   private float n5(int var1, int var2, int var3, boolean var4) {
      float var5 = 1.0F;
      if (var1 != 0 && var4) {
         float var6 = 0.1F;
         float var7 = 0.92F;
         var5 = var7 - var6 * var3 / var2;
      }

      return var5;
   }

   private double n5(List<g3y> var1, l5 var2) {
      double var3 = -Double.MAX_VALUE;

      for (int var5 = 0; var5 < var1.size(); var5++) {
         g3y var6 = (g3y)var1.get_Item(var5);
         List var7 = var6.c8();

         for (int var8 = 0; var8 < var7.size(); var8++) {
            t9z var9 = (t9z)var7.get_Item(var8);
            if (var9 != null) {
               double var10 = var2.k5(var9.n5());
               if (var10 > var3) {
                  var3 = var10;
               }
            }
         }
      }

      return var3;
   }
}
