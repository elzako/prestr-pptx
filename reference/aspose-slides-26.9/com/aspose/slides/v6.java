package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;

class v6 {
   private final n1g n5;

   public v6(n1g var1) {
      this.n5 = var1;
   }

   final void n5() {
      if (this.n5.q0().c8().getCategoryAxisType() == 1) {
         throw new NotImplementedException("Not Implemented rendering date or time for 3-D Clustered Bar");
      }

      boolean var1 = ChartTypeCharacterizer.isChartTypeBar(this.n5.n3().getType());
      int var2 = n1g.u3(this.n5.y4());
      float var3 = o9b.n5(
         com.aspose.slides.internal.v6g.k5.u3(this.n5.e5().l6(), 13), com.aspose.slides.internal.v6g.k5.u3(this.n5.e5().u3(), 13), var1, this.n5.m1()
      );
      double var4 = this.n5.m1().t4();
      List var6 = this.n5.y4();
      l5 var7 = this.n5.q0();
      l5 var8 = this.n5.m1();
      IRotation3D var9 = this.n5.n3().getRotation3D();
      float var10 = (var9.getDepthPercents() & 65535) / 100.0F;
      float var11 = (this.n5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F;
      float var12 = (this.n5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) / 100.0F;
      float var13 = this.n5.e5().a6() / var2;
      float var14 = var13 / (1.0F + var12);
      float var15 = var14 * var12;
      float var16 = var13 * var10 / (1.0F + var11);
      List var17 = new List();
      List var18 = var6;

      for (int var19 = 0; var19 < var18.size(); var19++) {
         int var20 = var18.size() - 1 - var19;
         g3y var21 = (g3y)var18.get_Item(var20);
         int var22 = var21.l6();
         List var23 = var21.c8();
         float var24 = (var16 + var16 * var11) * (var19 + 1) - var16 * var11 / 2.0F;
         if (!var9.getRightAngleAxes()) {
            var24 = -(var16 + var16 * var11) * (var18.size() - 1 - var19) - var16 * var11 / 2.0F;
         }

         for (int var25 = 0; var25 < var2; var25++) {
            int var26 = var25;
            float var27 = var13 * var26 + var15 / 2.0F;
            var27 = this.n5.e5().k5() - var27;
            int var28 = var26;
            if (var7.c8().isPlotOrderReversed()) {
               var28 = var2 - 1 - var26;
            }

            if (var28 < var23.size()) {
               t9z var29 = null;
               if (var28 < var23.size()) {
                  var29 = (t9z)var23.get_Item(var28);
               }

               if (var29 != null && !var29.c8()) {
                  double var30 = var8.k5(var29.n5());
                  float var32 = (float)(var30 - var4) / (float)(var8.z3() - var8.q0()) * this.n5.e5().u3();
                  if (var8.c8().isPlotOrderReversed()) {
                     var32 = -var32;
                  }

                  com.aspose.slides.internal.x4g.s7 var33 = new com.aspose.slides.internal.x4g.s7();

                  try {
                     if (var32 >= 0.0F) {
                        var33.l6(new com.aspose.slides.internal.o9b.y1(var3, var27 - var14, var32, var14));
                     } else {
                        var33.l6(new com.aspose.slides.internal.o9b.y1(var3 + var32, var27 - var14, -var32, var14));
                     }

                     float var34 = var16;
                     n6u var35 = new n6u(1.0F, 0.0F);
                     var29.n5(var33, var34, var24, var35);
                  } finally {
                     if (var33 != null) {
                        var33.dispose();
                     }
                  }

                  com.aspose.slides.internal.o9b.f2 var40 = t7k.n5(
                        var6, var22, var28, com.aspose.slides.internal.v6g.k5.u3(this.n5.e5().u3(), 13), this.n5, this.n5.q0()
                     )
                     .a6();
                  com.aspose.slides.internal.o9b.w1 var41 = new com.aspose.slides.internal.o9b.w1(
                     var3 + var32 + var40.k5() / 2.0F, var27 - var14 / 2.0F - var40.k5() / 2.0F
                  );
                  w2f var36 = new w2f(var22, var28, var41.u3(), var24);
                  var17.addItem(var36);
               }
            }
         }
      }

      n5(var17, this.n5);
   }

   final void l6() {
      if (this.n5.q0().c8().getCategoryAxisType() == 1) {
         throw new NotImplementedException("Not Implemented rendering date or time for 3-D Clustered Bar");
      }

      boolean var1 = ChartTypeCharacterizer.isChartTypeBar(this.n5.n3().getType());
      int var2 = n1g.u3(this.n5.y4());
      float var3 = o9b.n5(
         com.aspose.slides.internal.v6g.k5.u3(this.n5.e5().l6(), 13), com.aspose.slides.internal.v6g.k5.u3(this.n5.e5().u3(), 13), var1, this.n5.m1()
      );
      double var4 = this.n5.m1().t4();
      List var6 = this.n5.y4();
      int var7 = var6.size();
      l5 var8 = this.n5.q0();
      l5 var9 = this.n5.m1();
      List var10 = new List();
      float var11 = this.n5.e5().a6() / var2;
      float var12 = this.n5.e5().n5(true, var2, var7);
      IRotation3D var13 = this.n5.n3().getRotation3D();
      float var14 = this.n5.e5().c8();
      float var15 = (var13.getDepthPercents() & 65535) / 100.0F;
      var14 *= var15;
      float var16 = var12 * (this.n5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) / 100.0F;
      float var17 = var14 * ((this.n5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F);
      float var18 = var14 + var17 / 2.0F;
      if (!var13.getRightAngleAxes()) {
         var18 = -var17 / 2.0F;
      }

      for (int var19 = 0; var19 < var2; var19++) {
         List var20 = var6;
         if (var8.c8().isPlotOrderReversed()) {
            var20.reverse();
         }

         for (int var21 = 0; var21 < var20.size(); var21++) {
            g3y var22 = (g3y)var20.get_Item(var21);
            int var23 = var22.l6();
            float var24 = var12 * (var21 + 1);
            float var25 = var11 * var19 + var16 / 2.0F + var24;
            var25 = this.n5.e5().k5() - var25;
            List var26 = var22.c8();
            int var27 = var19;
            if (var8.c8().isPlotOrderReversed()) {
               var27 = var2 - 1 - var27;
            }

            t9z var28 = null;
            if (var27 <= var26.size()) {
               var28 = (t9z)var26.get_Item(var27);
            }

            if (var28 != null && !var28.c8()) {
               double var29 = var9.k5(var28.n5());
               float var31 = (float)(var29 - var4) / (float)(var9.z3() - var9.q0()) * this.n5.e5().u3();
               if (var9.c8().isPlotOrderReversed()) {
                  var31 = -var31;
               }

               com.aspose.slides.internal.x4g.s7 var32 = new com.aspose.slides.internal.x4g.s7();

               try {
                  if (var31 >= 0.0F) {
                     var32.l6(new com.aspose.slides.internal.o9b.y1(var3, var25, var31, var12));
                  } else {
                     var32.l6(new com.aspose.slides.internal.o9b.y1(var3 + var31, var25, -var31, var12));
                  }

                  float var33 = var14;
                  n6u var34 = new n6u(1.0F, 0.0F);
                  var28.n5(var32, var33, var18, var34);
               } finally {
                  if (var32 != null) {
                     var32.dispose();
                  }
               }

               com.aspose.slides.internal.o9b.f2 var40 = t7k.n5(
                     var6, var23, var27, com.aspose.slides.internal.v6g.k5.u3(this.n5.e5().u3(), 13), this.n5, this.n5.q0()
                  )
                  .a6();
               com.aspose.slides.internal.o9b.w1 var41 = new com.aspose.slides.internal.o9b.w1(
                  var3 + var31 + var40.k5() / 2.0F, var25 + (var12 - var40.k5()) / 2.0F
               );
               w2f var35 = new w2f(var23, var27, var41.u3(), var18);
               var10.addItem(var35);
            }
         }
      }

      n5(var10, this.n5);
   }

   final void k5() {
      if (this.n5.q0().c8().getCategoryAxisType() == 1) {
         throw new NotImplementedException("Not Implemented rendering date or time for 3-D Stacked Bar");
      }

      int var1 = n1g.u3(this.n5.y4());
      List var2 = this.n5.y4();
      l5 var3 = this.n5.q0();
      l5 var4 = this.n5.m1();
      float var5 = this.n5.e5().l6();
      float var6 = this.n5.e5().k5();
      float var7 = this.n5.e5().a6();
      float var8 = this.n5.e5().u3();
      double var9 = var4.z3();
      double var11 = var4.q0();
      float var13;
      if (var4.c8().isPlotOrderReversed()) {
         var13 = (float)(var5 + com.aspose.slides.ms.System.q1.n5(var9 / (var9 - var11)) * var8);
      } else {
         var13 = (float)(var5 + var8 - var9 / (var9 - var11) * var8);
      }

      List var14 = new List();
      float var15 = var7 / var1;
      float var16 = this.n5.e5().n5(true, var1, 1);
      IRotation3D var17 = this.n5.n3().getRotation3D();
      float var18 = var17.getRotationY() & 65535;
      float var19 = this.n5.e5().c8();
      float var20 = (var17.getDepthPercents() & 65535) / 100.0F;
      var19 *= var20;
      float var21 = var16 * (this.n5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) / 100.0F;
      float var22 = var19 * ((this.n5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F);
      float var23 = var19 + var22 / 2.0F;
      if (!var17.getRightAngleAxes()) {
         var23 = -var22 / 2.0F;
      }

      for (int var24 = 0; var24 < var1; var24++) {
         List var25 = new List();
         List var26 = var2;
         float var27 = var6 - (var15 * (var24 + 1) - var21 / 2.0F);

         for (int var28 = 0; var28 < var26.size(); var28++) {
            g3y var29 = (g3y)var26.get_Item(var28);
            int var30 = var29.l6();
            List var31 = var29.c8();
            int var32 = var24;
            if (var3.c8().isPlotOrderReversed()) {
               var32 = var1 - 1 - var32;
            }

            t9z var33 = null;
            if (var32 < var31.size()) {
               var33 = (t9z)var31.get_Item(var32);
            }

            int var34 = var28;
            if (var33 != null && !var33.c8()) {
               double var35 = var33.n5();
               double var37 = 0.0;
               double[] var39 = new double[]{var35};
               double[] var40 = new double[]{0.0};
               boolean var41 = g6z.n5(var39, var40, var26, var34, var32, var9, var11);
               var35 = var39[0];
               var37 = var40[0];
               if (var41) {
                  float var42 = (float)var35 / (float)(var9 - var11) * var8;
                  float var43 = (float)var37 / (float)(var9 - var11) * var8;
                  float var44;
                  if (var4.c8().isPlotOrderReversed()) {
                     var44 = var13 - (var43 - var42);
                     var42 = -var42;
                  } else {
                     var44 = var13 + (var43 - var42);
                     if (var44 < var5) {
                        var42 -= var5 - var44;
                        var44 = var5;
                     }
                  }

                  z9 var45 = new z9(var33, var27, var44, var42, (float)var37);
                  this.n5(var35, var45, var25, var4);
                  com.aspose.slides.internal.o9b.f2 var46 = t7k.n5(var2, var30, var32, com.aspose.slides.internal.v6g.k5.u3(var8, 13), this.n5, this.n5.q0())
                     .a6();
                  com.aspose.slides.internal.o9b.w1 var47 = new com.aspose.slides.internal.o9b.w1(
                     var44 + (var42 - var46.k5()) / 2.0F, var27 + (var16 - var46.l6()) / 2.0F
                  );
                  w2f var48 = new w2f(var30, var32, var47.u3(), var23);
                  var14.addItem(var48);
               }
            }
         }

         for (int var53 = 0; var53 < var25.size(); var53++) {
            z9 var54;
            if (var18 <= 180.0F) {
               var54 = (z9)var25.get_Item(var53);
            } else {
               var54 = (z9)var25.get_Item(var25.size() - 1 - var53);
            }

            com.aspose.slides.internal.x4g.s7 var55 = new com.aspose.slides.internal.x4g.s7();

            try {
               var55.l6(new com.aspose.slides.internal.o9b.y1(var54.k5(), var54.l6(), var54.u3(), var16));
               float var56 = var19;
               d0m var57 = new d0m(var54.n5(), this.n5, var54.a6());
               n6u var58 = new n6u((float)var57.n5(), (float)var57.l6());
               var54.n5().n5(var55, var56, var23, var58);
            } finally {
               if (var55 != null) {
                  var55.dispose();
               }
            }
         }

         var25.clear();
      }

      n5(var14, this.n5);
   }

   final void u3() {
      int var1 = n1g.u3(this.n5.y4());
      List var2 = this.n5.y4();
      l5 var3 = this.n5.q0();
      l5 var4 = this.n5.m1();
      float var5 = this.n5.e5().l6();
      float var6 = this.n5.e5().k5();
      float var7 = this.n5.e5().a6();
      float var8 = this.n5.e5().u3();
      double var9 = var4.z3();
      double var11 = var4.q0();
      float var13;
      if (var4.c8().isPlotOrderReversed()) {
         var13 = var5 + (float)com.aspose.slides.ms.System.q1.n5(var9 / (var9 - var11)) * var8;
      } else {
         var13 = var5 + (float)com.aspose.slides.ms.System.q1.n5(var11 / (var9 - var11)) * var8;
      }

      List var14 = new List();
      float var15 = var7 / var1;
      float var16 = this.n5.e5().n5(true, var1, 1);
      IRotation3D var17 = this.n5.n3().getRotation3D();
      float var18 = var17.getRotationY() & 65535;
      float var19 = this.n5.e5().c8();
      float var20 = (var17.getDepthPercents() & 65535) / 100.0F;
      var19 *= var20;
      float var21 = var16 * (this.n5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) / 100.0F;
      float var22 = var19 * ((this.n5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F);
      float var23 = var19 + var22 / 2.0F;
      if (!var17.getRightAngleAxes()) {
         var23 = -var22 / 2.0F;
      }

      for (int var24 = 0; var24 < var1; var24++) {
         List var25 = new List();
         List var26 = var2;
         float var27 = var6 - (var15 * (var24 + 1) - var21 / 2.0F);

         for (int var28 = 0; var28 < var26.size(); var28++) {
            g3y var29 = (g3y)var26.get_Item(var28);
            int var30 = var29.l6();
            List var31 = var29.c8();
            int var32 = var24;
            if (var3.c8().isPlotOrderReversed()) {
               var32 = var1 - 1 - var32;
            }

            t9z var33 = null;
            if (var32 < var31.size()) {
               var33 = (t9z)var31.get_Item(var32);
            }

            int var34 = var28;
            if (var33 != null && !var33.c8()) {
               double var35 = g6z.n5(var26, var32);
               if (var35 != 0.0) {
                  double var37 = var33.n5();
                  double var39 = var37;
                  double[] var41 = new double[]{var37};
                  double[] var42 = new double[]{var39};
                  boolean var43 = g6z.n5(var41, var42, var26, var34, var32, var35, var4);
                  var37 = var41[0];
                  var39 = var42[0];
                  if (var43) {
                     float var44 = (float)var37 * 100.0F / (float)var35 / (float)(var9 - var11) * var8;
                     float var45 = (float)var39 * 100.0F / (float)var35 / (float)(var9 - var11) * var8;
                     float var46;
                     if (var4.c8().isPlotOrderReversed()) {
                        var46 = var13 - (var45 - var44);
                        var44 = -var44;
                     } else {
                        var46 = var13 + (var45 - var44);
                     }

                     z9 var47 = new z9(var33, var27, var46, var44, (float)var39);
                     this.n5(var37, var47, var25, var4);
                     com.aspose.slides.internal.o9b.f2 var48 = t7k.n5(
                           var2, var30, var32, com.aspose.slides.internal.v6g.k5.u3(this.n5.e5().u3(), 13), this.n5, this.n5.q0()
                        )
                        .a6();
                     com.aspose.slides.internal.o9b.w1 var49 = new com.aspose.slides.internal.o9b.w1(
                        var46 + (var44 - var48.k5()) / 2.0F, var27 + (var16 - var48.l6()) / 2.0F
                     );
                     w2f var50 = new w2f(var30, var32, var49.u3(), var23);
                     var14.addItem(var50);
                  }
               }
            }
         }

         for (int var55 = 0; var55 < var25.size(); var55++) {
            z9 var56;
            if (var18 <= 180.0F) {
               var56 = (z9)var25.get_Item(var55);
            } else {
               var56 = (z9)var25.get_Item(var25.size() - 1 - var55);
            }

            com.aspose.slides.internal.x4g.s7 var57 = new com.aspose.slides.internal.x4g.s7();

            try {
               var57.l6(new com.aspose.slides.internal.o9b.y1(var56.k5(), var56.l6(), var56.u3(), var16));
               float var58 = var19;
               d0m var59 = new d0m(var56.n5(), this.n5, var56.a6());
               n6u var60 = new n6u((float)var59.n5(), (float)var59.l6());
               var56.n5().n5(var57, var58, var23, var60);
            } finally {
               if (var57 != null) {
                  var57.dispose();
               }
            }
         }

         var25.clear();
      }

      n5(var14, this.n5);
   }

   private static void n5(List<w2f> var0, n1g var1) {
      List var2 = var1.y4();

      for (int var3 = 0; var3 < var0.size(); var3++) {
         w2f var4 = (w2f)var0.get_Item(var3);
         int var5 = var4.n5();
         int var6 = var4.l6();
         com.aspose.slides.internal.o9b.w1 var7 = var4.k5().u3();
         com.aspose.slides.internal.o9b.f2 var8 = t7k.n5(var2, var5, var6, com.aspose.slides.internal.v6g.k5.u3(var1.e5().u3(), 13), var1, var1.q0()).a6();
         com.aspose.slides.internal.o9b.y1 var9 = new com.aspose.slides.internal.o9b.y1(var7.l6(), var7.k5(), var8.l6(), var8.k5());
         v2s.n5(var2, var5, var6, var9.y4(), var1, var1.q0(), var4.u3());
      }
   }

   private void n5(double var1, z9 var3, List<z9> var4, l5 var5) {
      float var6 = var3.k5() + var3.u3();
      if (var4.size() == 0) {
         var4.addItem(var3);
      } else {
         for (int var7 = 0; var7 < var4.size(); var7++) {
            z9 var8 = (z9)var4.get_Item(var7);
            float var9 = var8.k5() + var8.u3();
            if (var6 < var9) {
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
