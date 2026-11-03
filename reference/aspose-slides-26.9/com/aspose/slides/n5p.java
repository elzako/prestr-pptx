package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;

class n5p {
   private final n1g n5;

   public n5p(n1g var1) {
      this.n5 = var1;
   }

   final void n5() {
      if (this.n5.q0().c8().getCategoryAxisType() == 1) {
         throw new NotImplementedException("Not Implemented rendering date or time for 3-D Stacked Column Chart");
      }

      int var1 = n1g.u3(this.n5.y4());
      List var2 = this.n5.y4();
      l5 var3 = this.n5.q0();
      l5 var4 = this.n5.m1();
      int var5 = o9b.n5(var2);
      double var6 = 0.0;
      if (var5 == 1) {
         var6 = var4.q0();
      } else if (var5 == 2) {
         var6 = var4.z3();
      }

      float var8 = this.n5.e5().a6();
      double var9 = var4.z3();
      double var11 = var4.q0();
      float var13 = (float)(var9 - var11);
      float var14;
      if (var4.c8().isPlotOrderReversed()) {
         var14 = this.n5.e5().k5() - (float)com.aspose.slides.ms.System.q1.n5((var9 - var6) / var13) * var8;
      } else {
         var14 = this.n5.e5().k5() - (float)com.aspose.slides.ms.System.q1.n5((var11 - var6) / var13) * var8;
      }

      List var15 = new List();
      IRotation3D var16 = this.n5.n3().getRotation3D();
      float var17 = this.n5.e5().u3() / var1;
      float var18 = this.n5.e5().n5(false, var1, 1);
      float var19 = this.n5.e5().c8();
      float var20 = (var16.getDepthPercents() & 65535) / 100.0F;
      var19 *= var20;
      float var21 = var18 * (this.n5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) / 100.0F;
      float var22 = var19 * ((this.n5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F);
      float var23 = var16.getRotationY() & 65535;
      float var24 = var16.getRotationX();

      for (int var25 = 0; var25 < var1; var25++) {
         int var26 = var25;
         if (var23 > 180.0F) {
            var26 = var1 - 1 - var25;
         }

         float var27 = this.n5.e5().l6() + var17 * var26 + var21 / 2.0F;
         List var28 = new List();

         for (int var29 = 0; var29 < var2.size(); var29++) {
            g3y var30 = (g3y)var2.get_Item(var29);
            int var31 = var30.l6();
            List var32 = var30.c8();
            int var33 = var26;
            if (var3.c8().isPlotOrderReversed()) {
               var33 = var1 - 1 - var26;
            }

            t9z var34 = (t9z)var32.get_Item(var33);
            if (var34 != null && !var34.c8()) {
               double var35 = var34.n5();
               double var37 = 0.0;
               double[] var39 = new double[]{var35};
               double[] var40 = new double[]{0.0};
               boolean var41 = g6z.n5(var39, var40, var2, var29, var33, var4.z3(), var4.q0());
               var35 = var39[0];
               var37 = var40[0];
               if (var41) {
                  if (var5 == 1 && var29 == 0) {
                     var35 -= var6;
                  } else if (var5 == 2 && var29 == 0) {
                     var35 -= var6;
                  }

                  float var42 = (float)var35 / var13 * var8;
                  float var43 = (float)(var37 - var6) / var13 * var8;
                  float var44;
                  if (var4.c8().isPlotOrderReversed()) {
                     var44 = var14 + (var43 - var42);
                  } else {
                     var44 = var14 - (var43 - var42);
                     var42 = -var42;
                  }

                  q6r var45 = new q6r(var34, var27, var44, var42, var37);
                  this.n5(var35, var45, var28, var4);
                  com.aspose.slides.internal.o9b.w1 var46 = new com.aspose.slides.internal.o9b.w1(var27 + var18 / 2.0F, var44 + var42 / 2.0F);
                  float var47 = var19 + var22 / 2.0F;
                  if (!var16.getRightAngleAxes()) {
                     var47 = -var22 / 2.0F;
                  }

                  v2o var48 = new v2o(var31, var33, var46.u3(), var47);
                  var15.addItem(var48);
               }
            }
         }

         for (int var53 = 0; var53 < var28.size(); var53++) {
            q6r var54 = (q6r)var28.get_Item(var53);
            if (var24 <= 0.0F) {
               var54 = (q6r)var28.get_Item(var28.size() - 1 - var53);
            }

            com.aspose.slides.internal.x4g.s7 var55 = new com.aspose.slides.internal.x4g.s7();

            try {
               var55.l6(
                  new com.aspose.slides.internal.o9b.y2(
                     com.aspose.slides.internal.v6g.k5.u3(var27, 13),
                     com.aspose.slides.internal.v6g.k5.u3(var54.l6() + var54.k5(), 13),
                     com.aspose.slides.internal.v6g.k5.u3(var18, 13),
                     -com.aspose.slides.internal.v6g.k5.u3(var54.k5(), 13)
                  )
               );
               float var56 = var19 + var22 / 2.0F;
               if (!var16.getRightAngleAxes()) {
                  var56 = -var22 / 2.0F;
               }

               d0m var57 = new d0m(var54.n5(), this.n5, var54.u3());
               n6u var58 = new n6u((float)var57.n5(), (float)var57.l6());
               var54.n5().n5(var55, var19, var56, var58);
            } finally {
               if (var55 != null) {
                  var55.dispose();
               }
            }
         }

         var28.clear();
         v2s.n5(var15, this.n5);
         var15.clear();
      }
   }

   final void l6() {
      if (this.n5.q0().c8().getCategoryAxisType() == 1) {
         throw new NotImplementedException("Not Implemented rendering date or time for 3-D 100% Stacked Column Chart");
      }

      int var1 = n1g.u3(this.n5.y4());
      List var2 = this.n5.y4();
      l5 var3 = this.n5.q0();
      l5 var4 = this.n5.m1();
      float var5 = this.n5.e5().k5();
      float var6 = this.n5.e5().a6();
      float var7 = (float)(var4.z3() - var4.q0());
      float var8;
      if (this.n5.m1().c8().isPlotOrderReversed()) {
         var8 = var5 - (float)com.aspose.slides.ms.System.q1.n5(var4.z3() / var7) * var6;
      } else {
         var8 = var5 - (float)com.aspose.slides.ms.System.q1.n5(var4.q0() / var7) * var6;
      }

      IRotation3D var9 = this.n5.n3().getRotation3D();
      float var10 = this.n5.e5().u3() / var1;
      float var11 = this.n5.e5().n5(false, var1, 1);
      float var12 = this.n5.e5().c8();
      float var13 = (var9.getDepthPercents() & 65535) / 100.0F;
      var12 *= var13;
      float var14 = var11 * (this.n5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) / 100.0F;
      float var15 = var12 * ((this.n5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F);
      float var16 = var9.getRotationY() & 65535;
      float var17 = var9.getRotationX();
      float var18 = this.n5.e5().l6();
      List var19 = new List();

      for (int var20 = 0; var20 < var1; var20++) {
         int var21 = var20;
         if (var16 > 180.0F) {
            var21 = var1 - 1 - var20;
         }

         float var22 = var18 + var10 * var21 + var14 / 2.0F;
         List var23 = new List();

         for (int var24 = 0; var24 < var2.size(); var24++) {
            g3y var25 = (g3y)var2.get_Item(var24);
            int var26 = var25.l6();
            List var27 = var25.c8();
            int var28 = var21;
            if (var3.c8().isPlotOrderReversed()) {
               var28 = var1 - 1 - var21;
            }

            t9z var29 = (t9z)var27.get_Item(var28);
            if (var29 != null && !var29.c8()) {
               double var30 = g6z.n5(var2, var28);
               if (var30 != 0.0) {
                  double var32 = var29.n5();
                  double var34 = var32;
                  double[] var36 = new double[]{var32};
                  double[] var37 = new double[]{var34};
                  boolean var38 = g6z.n5(var36, var37, var2, var24, var28, var30, var4);
                  var32 = var36[0];
                  var34 = var37[0];
                  if (var38) {
                     float var39 = (float)var32 * 100.0F / (float)var30 / var7 * var6;
                     float var40 = (float)var34 * 100.0F / (float)var30 / var7 * var6;
                     float var41;
                     if (var4.c8().isPlotOrderReversed()) {
                        var41 = var8 + (var40 - var39);
                     } else {
                        var41 = var8 - (var40 - var39);
                        var39 = -var39;
                     }

                     q6r var42 = new q6r(var29, var22, var41, var39, var34);
                     this.n5(var32, var42, var23, var4);
                     com.aspose.slides.internal.o9b.w1 var43 = new com.aspose.slides.internal.o9b.w1(var22 + var11 / 2.0F, var41 + var39 / 2.0F);
                     float var44 = var12 + var15 / 2.0F;
                     if (!var9.getRightAngleAxes()) {
                        var44 = -var15 / 2.0F;
                     }

                     v2o var45 = new v2o(var26, var28, var43.u3(), var44);
                     var19.addItem(var45);
                  }
               }
            }
         }

         for (int var50 = 0; var50 < var23.size(); var50++) {
            q6r var51 = (q6r)var23.get_Item(var50);
            if (var17 <= 0.0F) {
               var51 = (q6r)var23.get_Item(var23.size() - 1 - var50);
            }

            com.aspose.slides.internal.x4g.s7 var52 = new com.aspose.slides.internal.x4g.s7();

            try {
               var52.l6(
                  new com.aspose.slides.internal.o9b.y2(
                     com.aspose.slides.internal.v6g.k5.u3(var22, 13),
                     com.aspose.slides.internal.v6g.k5.u3(var51.l6() + var51.k5(), 13),
                     com.aspose.slides.internal.v6g.k5.u3(var11, 13),
                     -com.aspose.slides.internal.v6g.k5.u3(var51.k5(), 13)
                  )
               );
               float var53 = var12 + var15 / 2.0F;
               if (!var9.getRightAngleAxes()) {
                  var53 = -var15 / 2.0F;
               }

               d0m var54 = new d0m(var51.n5(), this.n5, var51.u3());
               n6u var55 = new n6u((float)var54.n5(), (float)var54.l6());
               var51.n5().n5(var52, var12, var53, var55);
            } finally {
               if (var52 != null) {
                  var52.dispose();
               }
            }
         }

         var23.clear();
         v2s.n5(var19, this.n5);
         var19.clear();
      }
   }

   private void n5(double var1, q6r var3, List<q6r> var4, l5 var5) {
      if (var4.size() == 0) {
         var4.addItem(var3);
      } else {
         int var6 = com.aspose.slides.internal.v6g.k5.u3(var3.l6() + var3.k5() + 0.5F, 13);

         for (int var7 = 0; var7 < var4.size(); var7++) {
            q6r var8 = (q6r)var4.get_Item(var7);
            int var9 = com.aspose.slides.internal.v6g.k5.u3(var8.l6() + var8.k5() + 0.5F, 13);
            if (var6 > var9) {
               var4.insertItem(var7, var3);
               break;
            }

            if (var6 == var9) {
               if (var5.c8().isPlotOrderReversed()) {
                  if (var1 > 0.0) {
                     var4.insertItem(var7, var3);
                  } else {
                     var4.insertItem(var7 + 1, var3);
                  }
               } else if (var1 < 0.0) {
                  var4.insertItem(var7, var3);
               } else {
                  var4.insertItem(var7 + 1, var3);
               }
               break;
            }

            if (var7 == var4.size() - 1) {
               var4.addItem(var3);
               break;
            }
         }
      }
   }
}
