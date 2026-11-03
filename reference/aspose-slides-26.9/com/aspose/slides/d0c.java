package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class d0c extends com.aspose.slides.internal.v6g.h0<d0c> {
   public d0c() {
   }

   static void n5(float var0, double var1, int var3, n1g var4) {
      List var5 = var4.y4();
      int var6 = var5.size();
      l5 var7 = var4.q0();
      l5 var8 = var4.m1();
      if (var4.q0().c8().getCategoryAxisType() == 1) {
         n5(var0, var1, var4);
      } else {
         List var9 = new List();
         float var10 = var4.e5().u3() / var3;
         float var11 = var4.e5().n5(false, var3, var6);
         float var12 = var4.e5().c8();
         float var13 = var11 * (var4.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) / 100.0F;

         for (int var14 = 0; var14 < var3; var14++) {
            int var15 = var14;
            if (var4.p8() > 180) {
               var15 = var3 - 1 - var14;
            }

            double var16 = 1.0;

            for (int var18 = 0; var18 < var5.size(); var18++) {
               int var19 = var18;
               if (var4.p8() > 180) {
                  var19 = var5.size() - 1 - var18;
               }

               g3y var20 = (g3y)var5.get_Item(var19);
               int var21 = var20.l6();
               float var22 = var19 * var11;
               float var23 = var10 * var15 + var13 / 2.0F + var22;
               var23 = var4.e5().l6() + var23;
               List var24 = var20.c8();
               int var25 = var15;
               if (var7.c8().isPlotOrderReversed()) {
                  var25 = var3 - 1 - var15;
               }

               if (var25 <= var20.c8().size() - 1) {
                  t9z var26 = (t9z)var24.get_Item(var25);
                  if (var26 != null && !var26.c8()) {
                     double var27 = var8.k5(var26.n5());
                     float var29 = (float)g6z.n5(var1, var27) / (float)(var8.z3() - var8.q0()) * var4.e5().a6();
                     if (var8.c8().isPlotOrderReversed()) {
                        var29 = -var29;
                     }

                     double[] var30 = new double[]{var16};
                     n5(var26, var23, var11, var12, var0, var29, Double.NaN, var30, var4);
                     var16 = var30[0];
                     boolean var31 = g6z.n5(var29, 0.0) <= 0.0;
                     com.aspose.slides.internal.o9b.w1 var32 = n5(var4, var23, var11, var0, var29, var31).u3();
                     v2o var33 = new v2o(var21, var25, var32.u3(), var31);
                     var9.addItem(var33);
                  }
               }
            }
         }

         n5(var9, var4);
      }
   }

   private static void n5(float var0, double var1, n1g var3) {
      List var4 = var3.y4();
      int var5 = var4.size();
      l5 var6 = var3.q0();
      l5 var7 = var3.m1();
      List var8 = new List();
      int var9 = com.aspose.slides.internal.v6g.k5.u3(var6.z3(), 14);
      int var10 = com.aspose.slides.internal.v6g.k5.u3(var6.q0(), 14);
      int var11 = var6.c8().getBaseUnitScale();
      int var12 = p4.n5(var11, var9, var10, var9, false) + 1;
      float var13 = var3.e5().u3() / var12;
      float var14 = var3.e5().n5(false, var12, var5);
      float var15 = var3.e5().c8();
      float var16 = var14 * (var3.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) / 100.0F;
      List var17 = o9b.n5(var3.l6(), false);
      int var18 = var17.size();

      for (int var19 = 0; var19 < var18; var19++) {
         int var20 = var19;
         if (var3.p8() > 180) {
            var20 = var18 - 1 - var19;
         }

         int var21 = (Integer)var17.get_Item(var20);
         var21 = p4.n5(var11, var21, false);
         int var22 = p4.n5(var11, var21, com.aspose.slides.internal.v6g.k5.u3(var6.q0(), 14), com.aspose.slides.internal.v6g.k5.u3(var6.z3(), 14), false);
         float var23 = var13 * var22;
         var23 += var3.e5().l6() + var16 / 2.0F;
         double var24 = 1.0;

         for (int var26 = 0; var26 < var4.size(); var26++) {
            int var27 = var26;
            if (var3.p8() > 180) {
               var27 = var4.size() - 1 - var26;
            }

            g3y var28 = (g3y)var4.get_Item(var27);
            int var29 = var28.l6();
            float var30 = var27 * var14;
            float var31 = var23 + var30;
            List var32 = var28.c8();
            int var33 = var20;
            if (var6.c8().isPlotOrderReversed()) {
               var33 = var18 - 1 - var20;
            }

            t9z var34 = (t9z)var32.get_Item(var33);
            if (var34 != null && !var34.c8()) {
               double var35 = var7.k5(var34.n5());
               float var37 = (float)g6z.n5(var1, var35) / (float)(var7.z3() - var7.q0()) * var3.e5().a6();
               if (var7.c8().isPlotOrderReversed()) {
                  var37 = -var37;
               }

               double[] var38 = new double[]{var24};
               n5(var34, var31, var14, var15, var0, var37, Double.NaN, var38, var3);
               var24 = var38[0];
               boolean var39 = g6z.n5(var37, 0.0) < 0.0;
               com.aspose.slides.internal.o9b.w1 var40 = n5(var3, var31, var14, var0, var37, var39).u3();
               v2o var41 = new v2o(var29, var33, var40.u3(), var39);
               var8.addItem(var41);
            }
         }
      }

      n5(var8, var3);
   }

   static void n5(double var0, int var2, n1g var3) {
      List var4 = var3.y4();
      l5 var5 = var3.q0();
      l5 var6 = var3.m1();
      int var7 = o9b.n5(var4);
      double var8 = 0.0;
      if (var7 == 1) {
         var8 = var6.q0();
      } else if (var7 == 2) {
         var8 = var6.z3();
      }

      float var10 = 0.0F;
      if (var6.c8().isPlotOrderReversed()) {
         var10 = var3.e5().k5() - (float)com.aspose.slides.ms.System.q1.n5((var6.z3() - var8) / (float)(var6.z3() - var6.q0())) * var3.e5().a6();
      } else {
         var10 = var3.e5().k5() - (float)com.aspose.slides.ms.System.q1.n5((var6.q0() - var8) / (float)(var6.z3() - var6.q0())) * var3.e5().a6();
      }

      if (var3.q0().c8().getCategoryAxisType() == 1) {
         l6(var10, var0, var3);
      } else {
         List var11 = new List();
         float var12 = var3.e5().u3() / var2;
         float var13 = var3.e5().n5(false, var2, 1);
         float var14 = var3.e5().c8();
         float var15 = var13 * (var3.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) / 100.0F;

         for (int var16 = 0; var16 < var2; var16++) {
            int var17 = var16;
            if (var3.p8() > 180) {
               var17 = var2 - 1 - var16;
            }

            float var18 = var3.e5().l6() + var12 * var17 + var15 / 2.0F;
            List var19 = new List();

            for (int var20 = 0; var20 < var4.size(); var20++) {
               g3y var21 = (g3y)var4.get_Item(var20);
               int var22 = var21.l6();
               List var23 = var21.c8();
               int var24 = var17;
               if (var5.c8().isPlotOrderReversed()) {
                  var24 = var2 - 1 - var17;
               }

               t9z var25 = (t9z)var23.get_Item(var24);
               if (var25 != null && !var25.c8()) {
                  double var26 = var25.n5();
                  double var28 = 0.0;
                  double[] var30 = new double[]{var26};
                  double[] var31 = new double[]{0.0};
                  boolean var32 = g6z.n5(var30, var31, var4, var20, var24, var6.z3(), var6.q0());
                  var26 = var30[0];
                  var28 = var31[0];
                  if (var32) {
                     if (var7 == 1 && var20 == 0) {
                        var26 -= var8;
                     } else if (var7 == 2 && var20 == 0) {
                        var26 -= var8;
                     }

                     float var33 = (float)var26 / (float)(var6.z3() - var6.q0()) * var3.e5().a6();
                     float var34 = (float)(var28 - var8) / (float)(var6.z3() - var6.q0()) * var3.e5().a6();
                     float var35;
                     if (var6.c8().isPlotOrderReversed()) {
                        var35 = var10 + (var34 - var33);
                     } else {
                        var35 = var10 - (var34 - var33);
                        var33 = -var33;
                     }

                     d0c$n5 var36 = new d0c$n5(var25, var18, var35, var33, var28);
                     n5(var26, var36, var19, var6);
                     com.aspose.slides.internal.o9b.w1 var37 = n5(var3, var18, var13, var14, var35, var33).u3();
                     v2o var38 = new v2o(var22, var24, var37.u3());
                     var11.addItem(var38);
                  }
               }
            }

            double var39 = 1.0;

            for (int var42 = 0; var42 < var19.size(); var42++) {
               d0c$n5 var43 = (d0c$n5)var19.get_Item(var42);
               double[] var44 = new double[]{var39};
               n5(var43.n5(), var43.l6(), var13, var14, var43.k5(), var43.u3(), var43.a6(), var44, var3);
               var39 = var44[0];
            }

            var19.clear();
            n5(var11, var3);
            var11.clear();
         }
      }
   }

   private static void l6(float var0, double var1, n1g var3) {
      List var4 = var3.y4();
      l5 var5 = var3.q0();
      l5 var6 = var3.m1();
      List var7 = new List();
      int var8 = com.aspose.slides.internal.v6g.k5.u3(var5.z3(), 14);
      int var9 = com.aspose.slides.internal.v6g.k5.u3(var5.q0(), 14);
      int var10 = var5.c8().getBaseUnitScale();
      int var11 = p4.n5(var10, var8, var9, var8, false) + 1;
      float var12 = var3.e5().u3() / var11;
      float var13 = var3.e5().n5(false, var11, 1);
      float var14 = var3.e5().c8();
      float var15 = var13 * (var3.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) / 100.0F;
      List var16 = o9b.n5(var3.l6(), false);
      int var17 = var16.size();

      for (int var18 = 0; var18 < var17; var18++) {
         int var19 = var18;
         if (var3.p8() > 180) {
            var19 = var17 - 1 - var18;
         }

         int var20 = (Integer)var16.get_Item(var19);
         var20 = p4.n5(var10, var20, false);
         int var21 = p4.n5(var10, var20, com.aspose.slides.internal.v6g.k5.u3(var5.q0(), 14), com.aspose.slides.internal.v6g.k5.u3(var5.z3(), 14), false);
         float var22 = var12 * var21;
         float var23 = var3.e5().l6() + var15 / 2.0F + var22;
         List var24 = new List();

         for (int var25 = 0; var25 < var4.size(); var25++) {
            g3y var26 = (g3y)var4.get_Item(var25);
            int var27 = var26.l6();
            List var28 = var26.c8();
            int var29 = var19;
            if (var5.c8().isPlotOrderReversed()) {
               var29 = var17 - 1 - var19;
            }

            t9z var30 = (t9z)var28.get_Item(var29);
            if (var30 != null && !var30.c8()) {
               double var31 = var30.n5();
               double var33 = 0.0;
               double[] var35 = new double[]{var31};
               double[] var36 = new double[]{0.0};
               boolean var37 = g6z.n5(var35, var36, var4, var25, var29, var6.z3(), var6.q0());
               var31 = var35[0];
               var33 = var36[0];
               if (var37) {
                  float var38 = (float)var31 / (float)(var6.z3() - var6.q0()) * var3.e5().a6();
                  float var39 = (float)var33 / (float)(var6.z3() - var6.q0()) * var3.e5().a6();
                  float var40;
                  if (var6.c8().isPlotOrderReversed()) {
                     var40 = var0 + (var39 - var38);
                  } else {
                     var40 = var0 - (var39 - var38);
                     var38 = -var38;
                  }

                  d0c$n5 var41 = new d0c$n5(var30, var23, var40, var38, var33);
                  n5(var31, var41, var24, var6);
                  com.aspose.slides.internal.o9b.w1 var42 = n5(var3, var23, var13, var14, var40, var38).u3();
                  v2o var43 = new v2o(var27, var29, var42.u3());
                  var7.addItem(var43);
               }
            }
         }

         double var44 = 1.0;

         for (int var47 = 0; var47 < var24.size(); var47++) {
            d0c$n5 var48 = (d0c$n5)var24.get_Item(var47);
            double[] var49 = new double[]{var44};
            n5(var48.n5(), var48.l6(), var13, var14, var48.k5(), var48.u3(), var48.a6(), var49, var3);
            var44 = var49[0];
         }

         var24.clear();
         n5(var7, var3);
         var7.clear();
      }
   }

   static void l6(double var0, int var2, n1g var3) {
      List var4 = var3.y4();
      l5 var5 = var3.q0();
      l5 var6 = var3.m1();
      float var7 = 0.0F;
      if (var3.m1().c8().isPlotOrderReversed()) {
         var7 = var3.e5().k5() - (float)com.aspose.slides.ms.System.q1.n5(var6.z3() / (float)(var6.z3() - var6.q0())) * var3.e5().a6();
      } else {
         var7 = var3.e5().k5() - (float)com.aspose.slides.ms.System.q1.n5(var6.q0() / (float)(var6.z3() - var6.q0())) * var3.e5().a6();
      }

      if (var3.q0().c8().getCategoryAxisType() == 1) {
         k5(var7, var0, var3);
      } else {
         List var8 = new List();
         float var9 = var3.e5().u3() / var2;
         float var10 = var3.e5().n5(false, var2, 1);
         float var11 = var3.e5().c8();
         float var12 = var10 * (var3.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) / 100.0F;

         for (int var13 = 0; var13 < var2; var13++) {
            int var14 = var13;
            if (var3.p8() > 180) {
               var14 = var2 - 1 - var13;
            }

            float var15 = var3.e5().l6() + var9 * var14 + var12 / 2.0F;
            List var16 = new List();

            for (int var17 = 0; var17 < var4.size(); var17++) {
               g3y var18 = (g3y)var4.get_Item(var17);
               int var19 = var18.l6();
               List var20 = var18.c8();
               int var21 = var14;
               if (var5.c8().isPlotOrderReversed()) {
                  var21 = var2 - 1 - var14;
               }

               t9z var22 = (t9z)var20.get_Item(var21);
               if (var22 != null && !var22.c8()) {
                  double var23 = g6z.n5(var4, var21);
                  if (var23 != 0.0) {
                     double var25 = var22.n5();
                     double var27 = var25;
                     double[] var29 = new double[]{var25};
                     double[] var30 = new double[]{var27};
                     boolean var31 = g6z.n5(var29, var30, var4, var17, var21, var23, var6);
                     var25 = var29[0];
                     var27 = var30[0];
                     if (var31) {
                        float var32 = (float)var25 * 100.0F / (float)var23 / (float)(var6.z3() - var6.q0()) * var3.e5().a6();
                        float var33 = (float)var27 * 100.0F / (float)var23 / (float)(var6.z3() - var6.q0()) * var3.e5().a6();
                        float var34;
                        if (var6.c8().isPlotOrderReversed()) {
                           var34 = var7 + (var33 - var32);
                        } else {
                           var34 = var7 - (var33 - var32);
                           var32 = -var32;
                        }

                        d0c$n5 var35 = new d0c$n5(var22, var15, var34, var32, var27);
                        n5(var25, var35, var16, var6);
                        com.aspose.slides.internal.o9b.w1 var36 = n5(var3, var15, var10, var11, var34, var32).u3();
                        v2o var37 = new v2o(var19, var21, var36.u3());
                        var8.addItem(var37);
                     }
                  }
               }
            }

            double var38 = 1.0;

            for (int var41 = 0; var41 < var16.size(); var41++) {
               d0c$n5 var42 = (d0c$n5)var16.get_Item(var41);
               double[] var43 = new double[]{var38};
               n5(var42.n5(), var42.l6(), var10, var11, var42.k5(), var42.u3(), var42.a6(), var43, var3);
               var38 = var43[0];
            }

            var16.clear();
            n5(var8, var3);
            var8.clear();
         }
      }
   }

   private static void k5(float var0, double var1, n1g var3) {
      List var4 = var3.y4();
      l5 var5 = var3.q0();
      l5 var6 = var3.m1();
      List var7 = new List();
      int var8 = com.aspose.slides.internal.v6g.k5.u3(var5.z3(), 14);
      int var9 = com.aspose.slides.internal.v6g.k5.u3(var5.q0(), 14);
      int var10 = var5.c8().getBaseUnitScale();
      int var11 = p4.n5(var10, var8, var9, var8, false) + 1;
      float var12 = var3.e5().u3() / var11;
      float var13 = var3.e5().n5(false, var11, 1);
      float var14 = var3.e5().c8();
      float var15 = var13 * (var3.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) / 100.0F;
      List var16 = o9b.n5(var3.l6(), false);
      int var17 = var16.size();

      for (int var18 = 0; var18 < var17; var18++) {
         int var19 = var18;
         if (var3.p8() > 180) {
            var19 = var17 - 1 - var18;
         }

         int var20 = (Integer)var16.get_Item(var19);
         var20 = p4.n5(var10, var20, false);
         int var21 = p4.n5(var10, var20, com.aspose.slides.internal.v6g.k5.u3(var5.q0(), 14), com.aspose.slides.internal.v6g.k5.u3(var5.z3(), 14), false);
         float var22 = var12 * var21;
         float var23 = var3.e5().l6() + var15 / 2.0F + var22;
         List var24 = new List();

         for (int var25 = 0; var25 < var4.size(); var25++) {
            g3y var26 = (g3y)var4.get_Item(var25);
            int var27 = var26.l6();
            List var28 = var26.c8();
            int var29 = var19;
            if (var5.c8().isPlotOrderReversed()) {
               var29 = var17 - 1 - var19;
            }

            t9z var30 = (t9z)var28.get_Item(var29);
            if (var30 != null && !var30.c8()) {
               double var31 = g6z.n5(var4, var29);
               if (var31 != 0.0) {
                  double var33 = var30.n5();
                  double var35 = var33;
                  double[] var37 = new double[]{var33};
                  double[] var38 = new double[]{var35};
                  boolean var39 = g6z.n5(var37, var38, var4, var25, var29, var31, var6);
                  var33 = var37[0];
                  var35 = var38[0];
                  if (var39) {
                     float var40 = (float)var33 * 100.0F / (float)var31 / (float)(var6.z3() - var6.q0()) * var3.e5().a6();
                     float var41 = (float)var35 * 100.0F / (float)var31 / (float)(var6.z3() - var6.q0()) * var3.e5().a6();
                     float var42;
                     if (var6.c8().isPlotOrderReversed()) {
                        var42 = var0 + (var41 - var40);
                     } else {
                        var42 = var0 - (var41 - var40);
                        var40 = -var40;
                     }

                     d0c$n5 var43 = new d0c$n5(var30, var23, var42, var40, var35);
                     n5(var33, var43, var24, var6);
                     com.aspose.slides.internal.o9b.w1 var44 = n5(var3, var23, var13, var14, var42, var40).u3();
                     v2o var45 = new v2o(var27, var29, var44.u3());
                     var7.addItem(var45);
                  }
               }
            }
         }

         double var46 = 1.0;

         for (int var49 = 0; var49 < var24.size(); var49++) {
            d0c$n5 var50 = (d0c$n5)var24.get_Item(var49);
            double[] var51 = new double[]{var46};
            n5(var50.n5(), var50.l6(), var13, var14, var50.k5(), var50.u3(), var50.a6(), var51, var3);
            var46 = var51[0];
         }

         var24.clear();
         n5(var7, var3);
         var7.clear();
      }
   }

   static void l6(float var0, double var1, int var3, n1g var4) {
      List var5 = var4.y4();
      l5 var6 = var4.q0();
      l5 var7 = var4.m1();
      if (var4.q0().c8().getCategoryAxisType() == 1) {
         u3(var0, var1, var4);
      } else {
         float var8 = var4.j5() / 100.0F;
         float var9 = (var4.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F;
         float var10 = (var4.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) / 100.0F;
         List var11 = new List();
         float var12 = var4.e5().u3() / var3;
         float var13 = var12 / (1.0F + var10);
         float var14 = var13 * var10;
         float var15 = var12 * var8 / (1.0F + var9);
         if (var4.p8() >= 0 && var4.p8() < 90 || var4.p8() >= 180 && var4.p8() < 270) {
            for (int var32 = 0; var32 < var5.size(); var32++) {
               int var33 = var5.size() - 1 - var32;
               if (var4.p8() >= 180 && var4.p8() < 270) {
                  var33 = var5.size() - 1 - var33;
               }

               if (var4.m3().c8().isPlotOrderReversed()) {
                  var33 = var5.size() - 1 - var33;
               }

               g3y var34 = (g3y)var5.get_Item(var33);
               int var35 = var34.l6();
               List var36 = var34.c8();

               for (int var37 = 0; var37 < var3; var37++) {
                  int var39 = var37;
                  if (var4.p8() >= 180 && var4.p8() < 270) {
                     var39 = var3 - 1 - var39;
                  }

                  float var40 = var12 * var39 + var14 / 2.0F;
                  var40 = var4.e5().l6() + var40;
                  int var42 = var39;
                  if (var6.c8().isPlotOrderReversed()) {
                     var42 = var3 - 1 - var39;
                  }

                  t9z var43 = (t9z)var36.get_Item(var42);
                  if (var43 != null && !var43.c8()) {
                     double var44 = var7.k5(var43.n5());
                     float var45 = (float)g6z.n5(var1, var44) / (float)(var7.z3() - var7.q0()) * var4.e5().a6();
                     if (var7.c8().isPlotOrderReversed()) {
                        var45 = -var45;
                     }

                     n5(var43, var0, var45, var40, var13, var15, var35 + 1, var5.size(), var4);
                     boolean var46 = g6z.n5(var45, 0.0) < 0.0;
                     com.aspose.slides.internal.o9b.w1 var47 = n5(var0, var45, var40, var13, var15, var35 + 1, var5.size(), var46, var4).u3();
                     var11.clear();
                     v2o var48 = new v2o(var35, var42, var47.u3(), var46);
                     var11.addItem(var48);
                     n5(var11, var4);
                  }
               }
            }
         } else if (var4.p8() >= 90 && var4.p8() < 180 || var4.p8() >= 270 && var4.p8() < 360) {
            for (int var16 = 0; var16 < var3; var16++) {
               int var17 = var16;
               if (var4.p8() >= 270 && var4.p8() < 360) {
                  var17 = var3 - 1 - var17;
               }

               for (int var18 = 0; var18 < var5.size(); var18++) {
                  int var19 = var18;
                  if (var4.p8() >= 270 && var4.p8() < 360) {
                     var19 = var5.size() - 1 - var19;
                  }

                  if (var4.m3().c8().isPlotOrderReversed()) {
                     var19 = var5.size() - 1 - var19;
                  }

                  g3y var20 = (g3y)var5.get_Item(var19);
                  int var21 = var20.l6();
                  float var22 = var12 * var17 + var14 / 2.0F;
                  var22 = var4.e5().l6() + var22;
                  List var23 = var20.c8();
                  int var24 = var17;
                  if (var6.c8().isPlotOrderReversed()) {
                     var24 = var3 - 1 - var17;
                  }

                  t9z var25 = (t9z)var23.get_Item(var24);
                  if (var25 != null && !var25.c8()) {
                     double var26 = var7.k5(var25.n5());
                     float var28 = (float)g6z.n5(var1, var26) / (float)(var7.z3() - var7.q0()) * var4.e5().a6();
                     if (var7.c8().isPlotOrderReversed()) {
                        var28 = -var28;
                     }

                     n5(var25, var0, var28, var22, var13, var15, var21 + 1, var5.size(), var4);
                     boolean var29 = g6z.n5(var28, 0.0) < 0.0;
                     com.aspose.slides.internal.o9b.w1 var30 = n5(var0, var28, var22, var13, var15, var21 + 1, var5.size(), var29, var4).u3();
                     var11.clear();
                     v2o var31 = new v2o(var21, var24, var30.u3(), var29);
                     var11.addItem(var31);
                     n5(var11, var4);
                  }
               }
            }
         }
      }
   }

   private static void u3(float var0, double var1, n1g var3) {
      List var4 = var3.y4();
      l5 var5 = var3.q0();
      l5 var6 = var3.m1();
      l5 var7 = var3.m3();
      float var8 = var3.j5() / 100.0F;
      float var9 = (var3.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F;
      float var10 = (var3.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) / 100.0F;
      List var11 = new List();
      int var12 = com.aspose.slides.internal.v6g.k5.u3(var5.z3(), 14);
      int var13 = com.aspose.slides.internal.v6g.k5.u3(var5.q0(), 14);
      int var14 = var5.c8().getBaseUnitScale();
      int var15 = p4.n5(var14, var12, var13, var12, false) + 1;
      float var16 = var3.e5().u3() / var15;
      float var17 = var16 / (1.0F + var10);
      float var18 = var17 * var10;
      float var19 = var16 * var8 / (1.0F + var9);
      List var20 = o9b.n5(var3.l6(), false);
      int var21 = var20.size();
      if (var3.p8() >= 0 && var3.p8() < 90 || var3.p8() >= 180 && var3.p8() < 270) {
         for (int var41 = 0; var41 < var4.size(); var41++) {
            int var42 = var4.size() - 1 - var41;
            if (var3.p8() >= 180 && var3.p8() < 270) {
               var42 = var4.size() - 1 - var42;
            }

            if (var7.c8().isPlotOrderReversed()) {
               var42 = var4.size() - 1 - var42;
            }

            g3y var44 = (g3y)var4.get_Item(var42);
            int var45 = var44.l6();
            List var46 = var44.c8();

            for (int var47 = 0; var47 < var21; var47++) {
               int var48 = var47;
               if (var3.p8() >= 180 && var3.p8() < 270) {
                  var48 = var21 - 1 - var48;
               }

               int var49 = (Integer)var20.get_Item(var48);
               var49 = p4.n5(var14, var49, false);
               int var51 = p4.n5(var14, var49, com.aspose.slides.internal.v6g.k5.u3(var5.q0(), 14), com.aspose.slides.internal.v6g.k5.u3(var5.z3(), 14), false);
               float var52 = var16 * var51;
               float var53 = var3.e5().l6() + var52 + var18 / 2.0F;
               int var54 = var48;
               if (var5.c8().isPlotOrderReversed()) {
                  var54 = var21 - 1 - var48;
               }

               t9z var55 = (t9z)var46.get_Item(var54);
               if (var55 != null && !var55.c8()) {
                  double var56 = var6.k5(var55.n5());
                  float var57 = (float)g6z.n5(var1, var56) / (float)(var6.z3() - var6.q0()) * var3.e5().a6();
                  if (var6.c8().isPlotOrderReversed()) {
                     var57 = -var57;
                  }

                  n5(var55, var0, var57, var53, var17, var19, var45 + 1, var4.size(), var3);
                  boolean var58 = g6z.n5(var57, 0.0) < 0.0;
                  com.aspose.slides.internal.o9b.w1 var59 = n5(var0, var57, var53, var17, var19, var45 + 1, var4.size(), var58, var3).u3();
                  var11.clear();
                  v2o var60 = new v2o(var45, var54, var59.u3(), var58);
                  var11.addItem(var60);
                  n5(var11, var3);
               }
            }
         }
      } else if (var3.p8() >= 90 && var3.p8() < 180 || var3.p8() >= 270 && var3.p8() < 360) {
         for (int var22 = 0; var22 < var21; var22++) {
            int var23 = var22;
            if (var3.p8() >= 270 && var3.p8() < 360) {
               var23 = var21 - 1 - var23;
            }

            int var24 = (Integer)var20.get_Item(var23);
            var24 = p4.n5(var14, var24, false);
            int var25 = p4.n5(var14, var24, com.aspose.slides.internal.v6g.k5.u3(var5.q0(), 14), com.aspose.slides.internal.v6g.k5.u3(var5.z3(), 14), false);
            float var26 = var16 * var25;
            float var27 = var3.e5().l6() + var26 + var18 / 2.0F;

            for (int var28 = 0; var28 < var4.size(); var28++) {
               int var29 = var28;
               if (var3.p8() >= 270 && var3.p8() < 360) {
                  var29 = var4.size() - 1 - var29;
               }

               if (var7.c8().isPlotOrderReversed()) {
                  var29 = var4.size() - 1 - var29;
               }

               g3y var30 = (g3y)var4.get_Item(var29);
               int var31 = var30.l6();
               List var32 = var30.c8();
               int var33 = var23;
               if (var5.c8().isPlotOrderReversed()) {
                  var33 = var21 - 1 - var23;
               }

               t9z var34 = (t9z)var32.get_Item(var33);
               if (var34 != null && !var34.c8()) {
                  double var35 = var6.k5(var34.n5());
                  float var37 = (float)g6z.n5(var1, var35) / (float)(var6.z3() - var6.q0()) * var3.e5().a6();
                  if (var6.c8().isPlotOrderReversed()) {
                     var37 = -var37;
                  }

                  n5(var34, var0, var37, var27, var17, var19, var31 + 1, var4.size(), var3);
                  boolean var38 = g6z.n5(var37, 0.0) < 0.0;
                  com.aspose.slides.internal.o9b.w1 var39 = n5(var0, var37, var27, var17, var19, var31 + 1, var4.size(), var38, var3).u3();
                  var11.clear();
                  v2o var40 = new v2o(var31, var33, var39.u3(), var38);
                  var11.addItem(var40);
                  n5(var11, var3);
               }
            }
         }
      }
   }

   static void k5(float var0, double var1, int var3, n1g var4) {
      List var5 = var4.y4();
      l5 var6 = var4.q0();
      l5 var7 = var4.m1();
      if (var4.q0().c8().getCategoryAxisType() == 1) {
         a6(var0, var1, var4);
      } else {
         float var8 = var4.j5() / 100.0F;
         float var9 = (var4.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F;
         List var10 = new List();
         double var11 = var7.e2();
         double var13 = var7.t9();
         var1 = var7.c8().isLogarithmic() ? var7.n5(var1) : var1;
         int var15 = 0;
         boolean var16 = var6.a0() || var4.n3().hasDataTable();
         if (var16) {
            var15 = var3;
         } else {
            var15 = var3 - 1;
            if (var15 == 0) {
               var15 = 1;
            }
         }

         float var17 = var4.e5().u3() / var15;
         float var18 = var17 * var8 / (1.0F + var9);
         List var19 = new List();
         if (var4.p8() >= 0 && var4.p8() < 90 || var4.p8() >= 180 && var4.p8() < 270) {
            for (int var38 = 0; var38 < var5.size(); var38++) {
               int var39 = var5.size() - 1 - var38;
               if (var4.p8() >= 180 && var4.p8() < 270) {
                  var39 = var5.size() - 1 - var39;
               }

               if (var4.m3().c8().isPlotOrderReversed()) {
                  var39 = var5.size() - 1 - var39;
               }

               g3y var40 = (g3y)var5.get_Item(var39);
               int var41 = var40.l6();
               List var42 = var40.c8();

               for (int var43 = 0; var43 < var3; var43++) {
                  int var44 = var43;
                  if (var4.p8() >= 180 && var4.p8() < 270) {
                     var44 = var3 - 1 - var44;
                  }

                  float var46 = var17 * var44;
                  var46 = var4.e5().l6() + var46;
                  if (var16) {
                     var46 += var17 / 2.0F;
                  }

                  int var48 = var44;
                  if (var6.c8().isPlotOrderReversed()) {
                     var48 = var3 - 1 - var44;
                  }

                  t9z var49 = (t9z)var42.get_Item(var48);
                  if (var49 != null && !var49.c8()) {
                     double var50 = var7.k5(var49.n5());
                     float var51 = (float)(var1 - var50) / (float)(var11 - var13) * var4.e5().a6();
                     if (var7.c8().isPlotOrderReversed()) {
                        var51 = -var51;
                     }

                     d0c$l6 var52 = new d0c$l6(var49, n5(var0, var51, var46, var18, var41 + 1, var5.size(), var4));
                     var19.addItem(var52);
                     byte var53 = 0;
                     if (var4.p8() >= 90 && var4.p8() < 270) {
                        var53 = 1;
                     }

                     v2o var54 = new v2o(var41, var48, var52.l6()[var53].u3());
                     var10.addItem(var54);
                  } else {
                     var19.addItem(null);
                  }
               }

               n5(var4, var19);
               var19.clear();
               n5(var10, var4);
               var10.clear();
            }
         } else if (var4.p8() >= 90 && var4.p8() < 180 || var4.p8() >= 270 && var4.p8() < 360) {
            for (int var20 = 0; var20 < var5.size(); var20++) {
               int var21 = var20;
               if (var4.p8() >= 270 && var4.p8() < 360) {
                  var21 = var5.size() - 1 - var21;
               }

               if (var4.m3().c8().isPlotOrderReversed()) {
                  var21 = var5.size() - 1 - var21;
               }

               g3y var22 = (g3y)var5.get_Item(var21);
               int var23 = var22.l6();
               List var24 = var22.c8();

               for (int var25 = 0; var25 < var3; var25++) {
                  int var26 = var25;
                  if (var4.p8() >= 270 && var4.p8() < 360) {
                     var26 = var3 - 1 - var26;
                  }

                  float var27 = var17 * var26;
                  var27 = var4.e5().l6() + var27;
                  if (var16) {
                     var27 += var17 / 2.0F;
                  }

                  int var28 = var26;
                  if (var6.c8().isPlotOrderReversed()) {
                     var28 = var3 - 1 - var26;
                  }

                  t9z var29 = (t9z)var24.get_Item(var28);
                  if (var29 != null && !var29.c8()) {
                     double var30 = var7.k5(var29.n5());
                     float var32 = (float)(var1 - var30) / (float)(var7.z3() - var7.q0()) * var4.e5().a6();
                     if (var7.c8().isPlotOrderReversed()) {
                        var32 = -var32;
                     }

                     d0c$l6 var33 = new d0c$l6(var29, n5(var0, var32, var27, var18, var23 + 1, var5.size(), var4));
                     var19.addItem(var33);
                     byte var34 = 0;
                     if (var4.p8() >= 90 && var4.p8() < 270) {
                        var34 = 1;
                     }

                     v2o var35 = new v2o(var23, var28, var33.l6()[var34].u3());
                     var10.addItem(var35);
                  }
               }

               n5(var4, var19);
               var19.clear();
               n5(var10, var4);
               var10.clear();
            }
         }
      }
   }

   private static void a6(float var0, double var1, n1g var3) {
      List var4 = var3.y4();
      l5 var5 = var3.q0();
      l5 var6 = var3.m1();
      float var7 = var3.j5() / 100.0F;
      float var8 = (var3.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F;
      List var9 = new List();
      int var10 = var5.c8().getBaseUnitScale();
      int var11 = var5.d5();
      boolean var12 = var5.a0() || var3.n3().hasDataTable();
      float var13 = var3.e5().u3() / var11;
      float var14 = var13 * var7 / (1.0F + var8);
      List var15 = new List();
      List var16 = o9b.n5(var3.l6(), false);
      int var17 = var16.size();
      if (var3.p8() >= 0 && var3.p8() < 90 || var3.p8() >= 180 && var3.p8() < 270) {
         for (int var37 = 0; var37 < var4.size(); var37++) {
            int var38 = var4.size() - 1 - var37;
            if (var3.p8() >= 180 && var3.p8() < 270) {
               var38 = var4.size() - 1 - var38;
            }

            if (var3.m3().c8().isPlotOrderReversed()) {
               var38 = var4.size() - 1 - var38;
            }

            g3y var39 = (g3y)var4.get_Item(var38);
            int var40 = var39.l6();
            List var41 = var39.c8();

            for (int var42 = 0; var42 < var17; var42++) {
               int var43 = var42;
               if (var3.p8() >= 180 && var3.p8() < 270) {
                  var43 = var17 - 1 - var43;
               }

               int var45 = (Integer)var16.get_Item(var43);
               var45 = p4.n5(var10, var45, false);
               int var47 = p4.n5(var10, var45, com.aspose.slides.internal.v6g.k5.u3(var5.q0(), 14), com.aspose.slides.internal.v6g.k5.u3(var5.z3(), 14), false);
               float var48 = var13 * var47;
               float var49 = var3.e5().l6() + var48;
               if (var12) {
                  var49 += var13 / 2.0F;
               }

               int var50 = var43;
               if (var5.c8().isPlotOrderReversed()) {
                  var50 = var17 - 1 - var43;
               }

               t9z var51 = (t9z)var41.get_Item(var50);
               if (var51 != null && !var51.c8()) {
                  double var52 = var6.k5(var51.n5());
                  float var53 = (float)(var1 - var52) / (float)(var6.z3() - var6.q0()) * var3.e5().a6();
                  if (var6.c8().isPlotOrderReversed()) {
                     var53 = -var53;
                  }

                  d0c$l6 var54 = new d0c$l6(var51, n5(var0, var53, var49, var14, var40 + 1, var4.size(), var3));
                  var15.addItem(var54);
                  byte var55 = 0;
                  if (var3.p8() >= 90 && var3.p8() < 270) {
                     var55 = 1;
                  }

                  v2o var56 = new v2o(var40, var50, var54.l6()[var55].u3());
                  var9.addItem(var56);
               } else {
                  var15.addItem(null);
               }
            }

            n5(var3, var15);
            var15.clear();
            n5(var9, var3);
            var9.clear();
         }
      } else if (var3.p8() >= 90 && var3.p8() < 180 || var3.p8() >= 270 && var3.p8() < 360) {
         for (int var18 = 0; var18 < var4.size(); var18++) {
            int var19 = var18;
            if (var3.p8() >= 270 && var3.p8() < 360) {
               var19 = var4.size() - 1 - var19;
            }

            if (var3.m3().c8().isPlotOrderReversed()) {
               var19 = var4.size() - 1 - var19;
            }

            g3y var20 = (g3y)var4.get_Item(var19);
            int var21 = var20.l6();
            List var22 = var20.c8();

            for (int var23 = 0; var23 < var17; var23++) {
               int var24 = var23;
               if (var3.p8() >= 270 && var3.p8() < 360) {
                  var24 = var17 - 1 - var24;
               }

               int var25 = (Integer)var16.get_Item(var24);
               var25 = p4.n5(var10, var25, false);
               int var26 = p4.n5(var10, var25, com.aspose.slides.internal.v6g.k5.u3(var5.q0(), 14), com.aspose.slides.internal.v6g.k5.u3(var5.z3(), 14), false);
               float var27 = var13 * var26;
               float var28 = var3.e5().l6() + var27;
               if (var12) {
                  var28 += var13 / 2.0F;
               }

               int var29 = var24;
               if (var5.c8().isPlotOrderReversed()) {
                  var29 = var17 - 1 - var24;
               }

               t9z var30 = (t9z)var22.get_Item(var29);
               if (var30 != null && !var30.c8()) {
                  double var31 = var6.k5(var30.n5());
                  float var33 = (float)(var1 - var31) / (float)(var6.z3() - var6.q0()) * var3.e5().a6();
                  if (var6.c8().isPlotOrderReversed()) {
                     var33 = -var33;
                  }

                  d0c$l6 var34 = new d0c$l6(var30, n5(var0, var33, var28, var14, var21 + 1, var4.size(), var3));
                  var15.addItem(var34);
                  byte var35 = 0;
                  if (var3.p8() >= 90 && var3.p8() < 270) {
                     var35 = 1;
                  }

                  v2o var36 = new v2o(var21, var29, var34.l6()[var35].u3());
                  var9.addItem(var36);
               }
            }

            n5(var3, var15);
            var15.clear();
            n5(var9, var3);
            var9.clear();
         }
      }
   }

   private static void n5(double var0, d0c$n5 var2, List<d0c$n5> var3, l5 var4) {
      n1g var5 = var4.d2();
      int var6 = com.aspose.slides.internal.v6g.k5.u3(var2.k5() + var2.u3() + 0.5F, 13);
      if (var3.size() == 0) {
         var3.addItem(var2);
      } else {
         for (int var7 = 0; var7 < var3.size(); var7++) {
            d0c$n5 var8 = (d0c$n5)var3.get_Item(var7);
            int var9 = com.aspose.slides.internal.v6g.k5.u3(var8.k5() + var8.u3() + 0.5F, 13);
            if (var5.s3() >= 0) {
               if (var6 > var9) {
                  var3.insertItem(var7, var2);
                  break;
               }

               if (var6 == var9) {
                  if (var4.c8().isPlotOrderReversed()) {
                     if (var0 > 0.0) {
                        var3.insertItem(var7, var2);
                     } else {
                        var3.insertItem(var7 + 1, var2);
                     }
                  } else if (var0 < 0.0) {
                     var3.insertItem(var7, var2);
                  } else {
                     var3.insertItem(var7 + 1, var2);
                  }
                  break;
               }

               if (var7 == var3.size() - 1) {
                  var3.addItem(var2);
                  break;
               }
            } else {
               if (var6 < var9) {
                  var3.insertItem(var7, var2);
                  break;
               }

               if (var6 == var9) {
                  if (!var4.c8().isPlotOrderReversed()) {
                     if (var0 > 0.0) {
                        var3.insertItem(var7, var2);
                     } else {
                        var3.insertItem(var7 + 1, var2);
                     }
                  } else if (var0 < 0.0) {
                     var3.insertItem(var7, var2);
                  } else {
                     var3.insertItem(var7 + 1, var2);
                  }
                  break;
               }

               if (var7 == var3.size() - 1) {
                  var3.addItem(var2);
                  break;
               }
            }
         }
      }
   }

   private static com.aspose.slides.internal.o9b.w1 n5(n1g var0, float var1, float var2, float var3, float var4, boolean var5) {
      float var6 = var2 / 2.0F;
      float var7 = 8.0F;
      if (var5) {
         var4 -= var7;
      } else {
         var4 += var7;
      }

      float var8 = var0.e5().u9();
      var1 += var6;
      if (var1 <= var8) {
         float var12 = 2.0F * (var8 - var1);
         return n5(var0, var3 + var4, var12, 0.0F, 0);
      } else {
         float var9 = 2.0F * (var1 - var8);
         return n5(var0, var3 + var4, var9, 0.0F, 1);
      }
   }

   static com.aspose.slides.internal.o9b.w1 n5(n1g var0, float var1, float var2, float var3, float var4, float var5) {
      int var6 = var0.p8() / 45;
      float var7 = 0.0F;
      byte var8 = 0;
      switch (var6) {
         case 0:
         case 8:
            var7 = var2 / 2.0F;
            break;
         case 1:
            var7 = var2;
            var3 = 0.0F;
            break;
         case 2:
            var7 = var2;
            var3 = 0.0F;
            break;
         case 3:
            var7 = var2 / 2.0F;
            var8 = 1;
            break;
         case 4:
            var7 = var2 / 2.0F;
            var8 = 2;
            break;
         case 5:
            var7 = 0.0F;
            var3 = 0.0F;
            break;
         case 6:
            var7 = 0.0F;
            var3 = 0.0F;
            break;
         case 7:
            var7 = var2 / 2.0F;
      }

      float var9 = var0.e5().u9();
      var1 += var7;
      if (var1 <= var9) {
         float var13 = 2.0F * (var9 - var1);
         byte var14;
         if (var8 == 0) {
            var14 = 0;
         } else {
            var14 = 3;
         }

         return n5(var0, var4 + var5 / 2.0F, var13, var3, var14);
      } else {
         float var10 = 2.0F * (var1 - var9);
         byte var11;
         if (var8 == 0) {
            var11 = 1;
         } else {
            var11 = 2;
         }

         return n5(var0, var4 + var5 / 2.0F, var10, var3, var11);
      }
   }

   static void n5(List<v2o> var0, n1g var1) {
      List var2 = var1.y4();

      for (int var3 = 0; var3 < var0.size(); var3++) {
         v2o var4 = (v2o)var0.get_Item(var3);
         int var5 = var4.n5();
         int var6 = var4.l6();
         com.aspose.slides.internal.o9b.w1 var7 = var4.k5().u3();
         boolean var8 = var4.a6();
         boolean var9 = var4.u3();
         g3y var10 = var1.y4().get_Item(var5);
         f3h var11 = var10.c8().get_Item(var6).t9();
         com.aspose.slides.internal.o9b.f2 var12 = t7k.n5(var2, var5, var6, com.aspose.slides.internal.v6g.k5.u3(var1.e5().u3(), 13), var1, var1.q0()).a6();
         float var13 = var7.l6() - var12.l6() / 2.0F;
         float var14 = var7.k5() - var12.k5() / 2.0F;
         if (var8) {
            if (var9) {
               var14 = var7.k5() - var12.k5();
            } else {
               var14 = var7.k5();
            }
         }

         t7k.n5(var13, var14, var11, var12.a6(), var1);
         t7k.n5(var2, var5, var6, var11.k5.n5.n3(), var1, var1.q0());
      }
   }

   private static void n5(t9z var0, float var1, float var2, float var3, float var4, float var5, double var6, double[] var8, n1g var9) {
      g3y var10 = var0.y4();
      double var11 = 1.0;
      double var13 = 1.0;
      switch (var10.u9().getBar3DShape()) {
         case 0:
            n5(var0, var9, var1, var2, var3, var4, var5, (float)var11, (float)var13);
            break;
         case 1:
            if (!ChartTypeCharacterizer.c8(var10.u9().getType()) && !ChartTypeCharacterizer.s7(var10.u9().getType())) {
               var11 = 0.0;
            } else {
               double var61 = 0.0;
               double var47 = 0.0;
               double[] var67 = new double[]{0.0};
               double[] var72 = new double[]{0.0};
               n5(var10.t2().y4(), var0.z1(), var67, var72);
               var61 = var67[0];
               var47 = var72[0];
               if (var0.n5() == 0.0) {
                  var11 = var8[0];
                  var13 = var8[0];
               } else if (var0.n5() > 0.0) {
                  var11 = var61 == 0.0 ? 1.0 : (var61 - var6) / var61;
                  var13 = var61 == 0.0 ? 1.0 : (var61 - (var6 - var0.n5())) / var61;
               } else {
                  var11 = var47 == 0.0 ? 1.0 : (var47 - var6) / var47;
                  var13 = var47 == 0.0 ? 1.0 : (var47 - (var6 - var0.n5())) / var47;
               }
            }

            l6(var0, var9, var1, var2, var3, var4, var5, (float)var11, (float)var13);
            break;
         case 2:
            if (ChartTypeCharacterizer.c8(var10.u9().getType())) {
               double var57 = 0.0;
               double var43 = 0.0;
               double[] var65 = new double[]{0.0};
               double[] var70 = new double[]{0.0};
               n5(var10.t2().y4(), var0.z1(), var65, var70, var9);
               var57 = var65[0];
               var43 = var70[0];
               if (var0.n5() == 0.0) {
                  var11 = var8[0];
                  var13 = var8[0];
               } else if (var0.n5() > 0.0) {
                  var11 = var57 == 0.0 ? 1.0 : (var57 - var6) / var57;
                  var13 = var57 == 0.0 ? 1.0 : (var57 - (var6 - var0.n5())) / var57;
               } else {
                  var11 = var43 == 0.0 ? 1.0 : (var43 - var6) / var43;
                  var13 = var43 == 0.0 ? 1.0 : (var43 - (var6 - var0.n5())) / var43;
               }
            } else if (ChartTypeCharacterizer.s7(var10.u9().getType())) {
               double var59 = 0.0;
               double var45 = 0.0;
               double[] var66 = new double[]{0.0};
               double[] var71 = new double[]{0.0};
               n5(var10.t2().y4(), var0.z1(), var66, var71);
               var59 = var66[0];
               var45 = var71[0];
               if (var0.n5() == 0.0) {
                  var11 = var8[0];
                  var13 = var8[0];
               } else if (var0.n5() > 0.0) {
                  var11 = var59 == 0.0 ? 1.0 : (var59 - var6) / var59;
                  var13 = var59 == 0.0 ? 1.0 : (var59 - (var6 - var0.n5())) / var59;
               } else {
                  var11 = var45 == 0.0 ? 1.0 : (var45 - var6) / var45;
                  var13 = var45 == 0.0 ? 1.0 : (var45 - (var6 - var0.n5())) / var45;
               }
            } else {
               var11 = (float)n5(var0, var9);
               var13 = 1.0;
            }

            l6(var0, var9, var1, var2, var3, var4, var5, (float)var11, (float)var13);
            break;
         case 3:
            l6(var0, var9, var1, var2, var3, var4, var5, (float)var11, (float)var13);
            break;
         case 4:
            if (ChartTypeCharacterizer.c8(var10.u9().getType())) {
               g3y var15 = var9.y4().get_Item(0);
               int var16 = o9b.n5(var9.y4());
               double var40 = 0.0;
               if (var16 == 1) {
                  var40 = var9.m1().q0();
               } else if (var16 == 2) {
                  var40 = var9.m1().z3();
               }

               double var19 = 0.0;
               double var21 = 0.0;
               double[] var23 = new double[]{0.0};
               double[] var24 = new double[]{0.0};
               n5(var10.t2().y4(), var0.z1(), var23, var24);
               var19 = var23[0];
               var21 = var24[0];
               if (var0.n5() == 0.0) {
                  var11 = var8[0];
                  var13 = var8[0];
               } else if (var0.n5() > 0.0) {
                  double var25 = var0.n5();
                  if (var10 == var15) {
                     var25 -= var40;
                  }

                  var11 = var19 == 0.0 ? 1.0 : (var19 - var6) / (var19 - var40);
                  var13 = var19 == 0.0 ? 1.0 : (var19 - (var6 - var25)) / (var19 - var40);
               } else {
                  double var51 = var0.n5();
                  if (var10 == var15) {
                     var51 -= var40;
                  }

                  var11 = var21 == 0.0 ? 1.0 : (var21 - var6) / (var21 - var40);
                  var13 = var21 == 0.0 ? 1.0 : (var21 - (var6 - var51)) / (var21 - var40);
               }
            } else if (ChartTypeCharacterizer.s7(var10.u9().getType())) {
               double var55 = 0.0;
               double var41 = 0.0;
               double[] var64 = new double[]{0.0};
               double[] var69 = new double[]{0.0};
               n5(var10.t2().y4(), var0.z1(), var64, var69);
               var55 = var64[0];
               var41 = var69[0];
               if (var0.n5() == 0.0) {
                  var11 = var8[0];
                  var13 = var8[0];
               } else if (var0.n5() > 0.0) {
                  var11 = var55 == 0.0 ? 1.0 : (var55 - var6) / var55;
                  var13 = var55 == 0.0 ? 1.0 : (var55 - (var6 - var0.n5())) / var55;
               } else {
                  var11 = var41 == 0.0 ? 1.0 : (var41 - var6) / var41;
                  var13 = var41 == 0.0 ? 1.0 : (var41 - (var6 - var0.n5())) / var41;
               }
            } else {
               var11 = 0.0;
            }

            n5(var0, var9, var1, var2, var3, var4, var5, (float)var11, (float)var13);
            break;
         case 5:
            if (ChartTypeCharacterizer.c8(var10.u9().getType())) {
               double var27 = 0.0;
               double var17 = 0.0;
               double[] var29 = new double[]{0.0};
               double[] var30 = new double[]{0.0};
               n5(var10.t2().y4(), var0.z1(), var29, var30, var9);
               var27 = var29[0];
               var17 = var30[0];
               if (var0.n5() == 0.0) {
                  var11 = var8[0];
                  var13 = var8[0];
               } else if (var0.n5() > 0.0) {
                  var11 = var27 == 0.0 ? 1.0 : (var27 - var6) / var27;
                  var13 = var27 == 0.0 ? 1.0 : (var27 - (var6 - var0.n5())) / var27;
               } else {
                  var11 = var17 == 0.0 ? 1.0 : (var17 - var6) / var17;
                  var13 = var17 == 0.0 ? 1.0 : (var17 - (var6 - var0.n5())) / var17;
               }
            } else if (ChartTypeCharacterizer.s7(var10.u9().getType())) {
               double var53 = 0.0;
               double var38 = 0.0;
               double[] var63 = new double[]{0.0};
               double[] var68 = new double[]{0.0};
               n5(var10.t2().y4(), var0.z1(), var63, var68);
               var53 = var63[0];
               var38 = var68[0];
               if (var0.n5() == 0.0) {
                  var11 = var8[0];
                  var13 = var8[0];
               } else if (var0.n5() > 0.0) {
                  var11 = var53 == 0.0 ? 1.0 : (var53 - var6) / var53;
                  var13 = var53 == 0.0 ? 1.0 : (var53 - (var6 - var0.n5())) / var53;
               } else {
                  var11 = var38 == 0.0 ? 1.0 : (var38 - var6) / var38;
                  var13 = var38 == 0.0 ? 1.0 : (var38 - (var6 - var0.n5())) / var38;
               }
            } else {
               var11 = (float)n5(var0, var9);
               var13 = 1.0;
            }

            n5(var0, var9, var1, var2, var3, var4, var5, (float)var11, (float)var13);
      }
   }

   static com.aspose.slides.internal.o9b.w1 n5(n1g var0, float var1, float var2, float var3, int var4) {
      com.aspose.slides.internal.o9b.w1 var5 = new com.aspose.slides.internal.o9b.w1(var0.e5().l6() + var0.e5().u3() / 2.0F, var1);
      int var6 = var0.p8() % 90;
      if (var6 >= 45) {
         var6 = 90 - var6;
      }

      int var7 = var0.p8() / 45;
      float var8;
      float var9;
      switch (var7) {
         case 0:
         case 3:
         case 4:
         case 7:
         case 8:
            var8 = var2;
            var9 = var3;
            break;
         case 1:
         case 2:
         case 5:
         case 6:
         default:
            var8 = var3;
            var9 = var2;
      }

      float var10 = var9 * (float)com.aspose.slides.ms.System.q1.h0(var6 * Math.PI / 180.0);
      float var11 = var9 * (float)com.aspose.slides.ms.System.q1.h0(var0.s3() * Math.PI / 180.0);
      com.aspose.slides.internal.o9b.w1[] var12 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 4)
      );
      switch (var7) {
         case 0:
         case 8:
            var12[0].n5(var5.l6() - (var8 + var10) / 2.0F);
            var12[1].n5(var12[0].l6() + var8);
            var12[2].n5(var12[1].l6() + var10);
            var12[3].n5(var12[0].l6() + var10);
            var12[0].l6(var5.k5() + var11 / 2.0F);
            var12[1].l6(var12[0].k5());
            var12[2].l6(var12[1].k5() - var11);
            var12[3].l6(var12[2].k5());
            break;
         case 1:
            var12[0].n5(var5.l6() - (var8 + var10) / 2.0F);
            var12[1].n5(var12[0].l6() + var10);
            var12[2].n5(var12[1].l6() + var8);
            var12[3].n5(var12[0].l6() + var8);
            var12[0].l6(var5.k5() - var11 / 2.0F);
            var12[1].l6(var12[0].k5() + var11);
            var12[2].l6(var12[1].k5());
            var12[3].l6(var12[0].k5());
            break;
         case 2:
            var12[1].n5(var5.l6() - (var8 + var10) / 2.0F);
            var12[0].n5(var12[1].l6() + var10);
            var12[2].n5(var12[1].l6() + var8);
            var12[3].n5(var12[0].l6() + var8);
            var12[0].l6(var5.k5() - var11 / 2.0F);
            var12[1].l6(var12[0].k5() + var11);
            var12[2].l6(var12[1].k5());
            var12[3].l6(var12[0].k5());
            break;
         case 3:
            var12[1].n5(var5.l6() - (var8 + var10) / 2.0F);
            var12[0].n5(var12[1].l6() + var8);
            var12[2].n5(var12[1].l6() + var10);
            var12[3].n5(var12[2].l6() + var8);
            var12[0].l6(var5.k5() - var11 / 2.0F);
            var12[1].l6(var12[0].k5());
            var12[2].l6(var12[1].k5() + var11);
            var12[3].l6(var12[2].k5());
            break;
         case 4:
            var12[0].n5(var5.l6() + (var8 + var10) / 2.0F);
            var12[1].n5(var12[0].l6() - var8);
            var12[2].n5(var12[1].l6() - var10);
            var12[3].n5(var12[2].l6() + var8);
            var12[0].l6(var5.k5() - var11 / 2.0F);
            var12[1].l6(var12[0].k5());
            var12[2].l6(var12[1].k5() + var11);
            var12[3].l6(var12[2].k5());
            break;
         case 5:
            var12[0].n5(var5.l6() + (var8 + var10) / 2.0F);
            var12[1].n5(var12[0].l6() - var10);
            var12[2].n5(var12[1].l6() - var8);
            var12[3].n5(var12[0].l6() - var8);
            var12[0].l6(var5.k5() + var11 / 2.0F);
            var12[1].l6(var12[0].k5() - var11);
            var12[2].l6(var12[1].k5());
            var12[3].l6(var12[0].k5());
            break;
         case 6:
            var12[1].n5(var5.l6() + (var8 + var10) / 2.0F);
            var12[0].n5(var12[1].l6() - var10);
            var12[2].n5(var12[1].l6() - var8);
            var12[3].n5(var12[0].l6() - var8);
            var12[0].l6(var5.k5() + var11 / 2.0F);
            var12[1].l6(var12[0].k5() - var11);
            var12[2].l6(var12[1].k5());
            var12[3].l6(var12[0].k5());
            break;
         case 7:
            var12[1].n5(var5.l6() + (var8 + var10) / 2.0F);
            var12[0].n5(var12[1].l6() - var8);
            var12[2].n5(var12[1].l6() - var10);
            var12[3].n5(var12[2].l6() - var8);
            var12[0].l6(var5.k5() + var11 / 2.0F);
            var12[1].l6(var12[0].k5());
            var12[2].l6(var12[1].k5() - var11);
            var12[3].l6(var12[2].k5());
      }

      return var12[var4];
   }

   static com.aspose.slides.internal.o9b.w1[] n5(float var0, float var1, float var2, float var3, int var4, int var5, n1g var6) {
      float var7 = var3 * (var6.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F;
      com.aspose.slides.internal.o9b.w1[] var8 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 2)
      );
      float var9 = var6.e5().u9();
      float var10 = var6.e5().h0() / var5;
      float var11 = var5 / 2.0F;
      if (var6.m3().c8().isPlotOrderReversed()) {
         var4 = var5 + 1 - var4;
      }

      if (var4 <= var11 && !var6.m3().c8().isPlotOrderReversed()) {
         float var16 = ((var11 - var4) * var10 + var7 / 2.0F + var3) * 2.0F;
         if (var2 <= var9) {
            float var20 = 2.0F * (var9 - var2);
            n5(var6, var0 + var1, var20, var16, 0).n5(var8[0]);
            var16 -= var3 * 2.0F;
            n5(var6, var0 + var1, var20, var16, 0).n5(var8[1]);
         } else {
            float var21 = 2.0F * (var2 - var9);
            n5(var6, var0 + var1, var21, var16, 1).n5(var8[0]);
            var16 -= var3 * 2.0F;
            n5(var6, var0 + var1, var21, var16, 1).n5(var8[1]);
         }
      } else {
         float var12 = ((var4 - var11) * var10 - var7 / 2.0F - var3) * 2.0F;
         if (var2 <= var9) {
            float var13 = 2.0F * (var9 - var2);
            n5(var6, var0 + var1, var13, var12, 3).n5(var8[0]);
            var12 += var3 * 2.0F;
            n5(var6, var0 + var1, var13, var12, 3).n5(var8[1]);
         } else {
            float var19 = 2.0F * (var2 - var9);
            n5(var6, var0 + var1, var19, var12, 2).n5(var8[0]);
            var12 += var3 * 2.0F;
            n5(var6, var0 + var1, var19, var12, 2).n5(var8[1]);
         }
      }

      return var8;
   }

   private static void n5(t9z var0, float var1, float var2, float var3, float var4, float var5, int var6, int var7, n1g var8) {
      g3y var9 = var0.y4();
      switch (var9.u9().getBar3DShape()) {
         case 0:
            n5(var0, var1, var2, var3, var4, var5, var6, var7, 1.0F, var8);
            break;
         case 1:
            l6(var0, var1, var2, var3, var4, var5, var6, var7, 0.0F, var8);
         case 2:
         default:
            break;
         case 3:
            l6(var0, var1, var2, var3, var4, var5, var6, var7, 1.0F, var8);
            break;
         case 4:
            n5(var0, var1, var2, var3, var4, var5, var6, var7, 0.0F, var8);
      }
   }

   private static void n5(t9z var0, float var1, float var2, float var3, float var4, float var5, int var6, int var7, float var8, n1g var9) {
      float var10 = var5 * (var9.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F;
      com.aspose.slides.internal.o9b.w1[] var11 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 8)
      );
      float var12 = var9.e5().u9();
      float var13 = var3;
      float var14 = var3 + var4 * (1.0F - var8) / 2.0F;
      float var15 = var9.e5().h0() / var7;
      float var16 = var7 / 2.0F;
      if (var9.m3().c8().isPlotOrderReversed()) {
         var6 = var7 + 1 - var6;
      }

      boolean var17 = var6 <= var16 && !var9.m3().c8().isPlotOrderReversed();
      float var18 = ((var6 - var16) * var15 - var10 / 2.0F - var5) * 2.0F;
      byte var19;
      byte var20;
      if (var17) {
         var18 = -var18;
         var19 = 0;
         var20 = 1;
      } else {
         var19 = 3;
         var20 = 2;
      }

      byte var21 = 3;
      com.aspose.slides.internal.o9b.w1 var22 = com.aspose.slides.internal.o9b.w1.n5.u3();

      for (int var23 = 0; var23 < 2; var23++) {
         if (var13 <= var12) {
            float var24 = 2.0F * (var12 - var13);
            n5(var9, var1, var24, var18, var19).n5(var11[var23]);
            if (var17) {
               var18 -= var5 * 2.0F;
            } else {
               var18 += var5 * 2.0F;
            }

            n5(var9, var1, var24, var18, var19).n5(var11[var23 + var21]);
         } else {
            float var28 = 2.0F * (var13 - var12);
            n5(var9, var1, var28, var18, var20).n5(var11[var23]);
            if (var17) {
               var18 -= var5 * 2.0F;
            } else {
               var18 += var5 * 2.0F;
            }

            n5(var9, var1, var28, var18, var20).n5(var11[var23 + var21]);
         }

         var18 = ((var6 - var16) * var15 - var10 / 2.0F - var5) * 2.0F;
         if (var17) {
            var18 = -var18;
         }

         if (var14 <= var12) {
            float var29 = 2.0F * (var12 - var14);
            n5(var9, var1, var29, n5(var18, var17, var5, var8), var19).n5(var22);
            var11[var23 + 4].n5(var22.l6());
            var11[var23 + 4].l6(var22.k5() + var2);
            if (var8 == 1.0F) {
               if (var17) {
                  var18 -= var5 * 2.0F;
               } else {
                  var18 += var5 * 2.0F;
               }
            }

            n5(var9, var1, var29, n5(var18, var17, var5, var8), var19).n5(var22);
            var11[var23 + var21 + 4].n5(var22.l6());
            var11[var23 + var21 + 4].l6(var22.k5() + var2);
         } else {
            float var30 = 2.0F * (var14 - var12);
            n5(var9, var1, var30, n5(var18, var17, var5, var8), var20).n5(var22);
            var11[var23 + 4].n5(var22.l6());
            var11[var23 + 4].l6(var22.k5() + var2);
            if (var8 == 1.0F) {
               if (var17) {
                  var18 -= var5 * 2.0F;
               } else {
                  var18 += var5 * 2.0F;
               }
            }

            n5(var9, var1, var30, n5(var18, var17, var5, var8), var20).n5(var22);
            var11[var23 + var21 + 4].n5(var22.l6());
            var11[var23 + var21 + 4].l6(var22.k5() + var2);
         }

         var21 = 1;
         var13 += var4;
         var14 += var4 * var8;
         var18 = ((var6 - var16) * var15 - var10 / 2.0F - var5) * 2.0F;
         if (var17) {
            var18 = -var18;
         }
      }

      n5(var9, var0, var11, var2);
   }

   private static void l6(t9z var0, float var1, float var2, float var3, float var4, float var5, int var6, int var7, float var8, n1g var9) {
      float var10 = var9.e5().u9();
      Dictionary var11 = new Dictionary();
      Dictionary var12 = new Dictionary();
      float var13 = var3 + var4 / 2.0F;
      float var14 = var5 * (var9.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F;
      float var15 = var9.e5().h0() / var7;
      float var16 = var7 / 2.0F;
      if (var9.m3().c8().isPlotOrderReversed()) {
         var6 = var7 + 1 - var6;
      }

      boolean var17 = var6 <= var16 && !var9.m3().c8().isPlotOrderReversed();
      float var18 = ((var6 - var16) * var15 - var14 / 2.0F - var5 / 2.0F) * 2.0F;
      byte var19;
      byte var20;
      if (var17) {
         var18 = -var18;
         var19 = 0;
         var20 = 1;
      } else {
         var19 = 3;
         var20 = 2;
      }

      for (int var21 = 0; var21 <= 180; var21++) {
         double var22 = var21 * Math.PI / 180.0;
         float var24 = (float)(var5 * com.aspose.slides.ms.System.q1.h0(var22));
         float var25 = (float)(var13 + var4 / 2.0F * com.aspose.slides.ms.System.q1.c8(var22));
         if (var25 <= var10) {
            float var26 = 2.0F * (var10 - var25);
            if (!var11.containsKey(360 - var21)) {
               var11.addItem(360 - var21, n5(var9, var1, var26, n5(360 - var21, var17, var18, var24), var19).u3());
            }

            if (!var11.containsKey(var21)) {
               var11.addItem(var21, n5(var9, var1, var26, n5(var21, var17, var18, var24), var19).u3());
            }
         } else {
            float var30 = 2.0F * (var25 - var10);
            if (!var11.containsKey(360 - var21)) {
               var11.addItem(360 - var21, n5(var9, var1, var30, n5(360 - var21, var17, var18, var24), var20).u3());
            }

            if (!var11.containsKey(var21)) {
               var11.addItem(var21, n5(var9, var1, var30, n5(var21, var17, var18, var24), var20).u3());
            }
         }

         var25 = (float)(var13 + var4 / 2.0F * var8 * com.aspose.slides.ms.System.q1.c8(var22));
         var24 = (float)(var5 * var8 * com.aspose.slides.ms.System.q1.h0(var22));
         if (var25 <= var10) {
            float var31 = 2.0F * (var10 - var25);
            if (!var12.containsKey(360 - var21)) {
               com.aspose.slides.internal.o9b.w1 var27 = n5(var9, var1, var31, n5(360 - var21, var17, var18, var24), var19).u3();
               var27.l6(var27.k5() + var2);
               var12.addItem(360 - var21, var27.u3());
            }

            if (!var12.containsKey(var21)) {
               com.aspose.slides.internal.o9b.w1 var33 = n5(var9, var1, var31, n5(var21, var17, var18, var24), var19).u3();
               var33.l6(var33.k5() + var2);
               var12.addItem(var21, var33.u3());
            }
         } else {
            float var32 = 2.0F * (var25 - var10);
            if (!var12.containsKey(360 - var21)) {
               com.aspose.slides.internal.o9b.w1 var34 = n5(var9, var1, var32, n5(360 - var21, var17, var18, var24), var20).u3();
               var34.l6(var34.k5() + var2);
               var12.addItem(360 - var21, var34.u3());
            }

            if (!var12.containsKey(var21)) {
               com.aspose.slides.internal.o9b.w1 var35 = n5(var9, var1, var32, n5(var21, var17, var18, var24), var20).u3();
               var35.l6(var35.k5() + var2);
               var12.addItem(var21, var35.u3());
            }
         }
      }

      n5(var0, var11, var12, var2);
   }

   private static float n5(int var0, boolean var1, float var2, float var3) {
      if (var1) {
         return var0 <= 180 ? var2 - var3 : var2 + var3;
      } else {
         return var0 <= 180 ? var2 + var3 : var2 - var3;
      }
   }

   private static float n5(float var0, boolean var1, float var2, float var3) {
      if (var1) {
         var0 -= var2 * (1.0F - var3);
      } else {
         var0 += var2 * (1.0F - var3);
      }

      return var0;
   }

   private static void n5(n1g var0, List<d0c$l6> var1) {
      if (var1.size() > 1) {
         com.aspose.slides.internal.o9b.w1[] var2 = null;

         int var3;
         for (var3 = 0; var3 < var1.size(); var3++) {
            if (var1.get_Item(var3) != null) {
               d0c$l6 var4 = (d0c$l6)var1.get_Item(var3);
               var2 = var4.l6();
               var3++;
               break;
            }
         }

         for (int var5 = var3; var5 < var1.size(); var5++) {
            if (var1.get_Item(var5) != null) {
               d0c$l6 var6 = (d0c$l6)var1.get_Item(var5);
               t9z var8 = var6.n5();
               com.aspose.slides.internal.o9b.w1[] var7 = var6.l6();
               n5(var0, var8, var2, var7);
               var2 = var7;
            } else {
               var2 = null;
            }
         }
      }
   }

   private static void n5(n1g var0, t9z var1, com.aspose.slides.internal.o9b.w1[] var2, com.aspose.slides.internal.o9b.w1[] var3) {
      if (var2 != null && var3 != null && var1 != null) {
         com.aspose.slides.internal.x4g.s7 var4 = new com.aspose.slides.internal.x4g.s7();
         var4.k5(new com.aspose.slides.internal.o9b.w1[]{var2[0], var3[0], var3[1], var2[1]});
         var4.x8();
         float var5 = 1.0F;
         if (var0.p8() != 0 && var0.p8() != 360 && var0.p8() != 180) {
            if (var0.p8() != 90 && var0.p8() != 270) {
               if (var2[1].l6() != var3[1].l6() && var2[1].k5() != var3[1].k5()) {
                  float var6 = 0.0F;
                  float var7 = (var6 - var2[1].k5() - (var6 - var3[1].k5())) / (var2[1].l6() - var3[1].l6());
                  float var8 = var6 - var3[1].k5() - var7 * var3[1].l6();
                  float var9 = var6 - var3[0].k5();
                  float var10 = var7 * var3[0].l6() + var8;
                  if (var0.p8() > 0 && var0.p8() < 90 || var0.p8() > 270 && var0.p8() < 360) {
                     if (var9 > var10) {
                        var5 = 0.6666667F;
                     }
                  } else if (var0.p8() > 90 && var0.p8() < 270 && var9 < var10) {
                     var5 = 0.6666667F;
                  }
               }
            } else if (!(var3[0].k5() > var2[0].k5())) {
               var5 = 0.6666667F;
            }
         } else if (var3[1].k5() > var3[0].k5()) {
            if (var0.p8() == 0 || var0.p8() == 360) {
               var5 = 0.6666667F;
            }
         } else if (var0.p8() != 0 && var0.p8() != 360) {
            var5 = 0.6666667F;
         }

         var1.n5(var4, var5);
         var1.n5(var2[0].u3(), var3[0].u3());
         var1.n5(var3[0].u3(), var3[1].u3());
         var1.n5(var3[1].u3(), var2[1].u3());
         var1.n5(var2[1].u3(), var2[0].u3());
      }
   }

   private static com.aspose.slides.internal.o9b.w1 n5(float var0, float var1, float var2, float var3, float var4, int var5, int var6, boolean var7, n1g var8) {
      int var9 = var8.p8() / 45;
      float var10 = 0.0F;
      float var11 = 0.0F;
      switch (var9) {
         case 0:
         case 8:
            var10 = var3 / 2.0F;
            break;
         case 1:
            var10 = var3;
            var11 = var4 / 2.0F;
            break;
         case 2:
            var10 = var3;
            var11 = var4 / 2.0F;
            break;
         case 3:
            var10 = var3 / 2.0F;
            var11 = var4;
            break;
         case 4:
            var10 = var3 / 2.0F;
            var11 = var4;
            break;
         case 5:
            var10 = 0.0F;
            var11 = var4 / 2.0F;
            break;
         case 6:
            var10 = 0.0F;
            var11 = var4 / 2.0F;
            break;
         case 7:
            var10 = var3 / 2.0F;
      }

      float var12 = var8.e5().u9();
      var2 += var10;
      float var13 = 8.0F;
      if (var7) {
         var1 -= var13;
      } else {
         var1 += var13;
      }

      com.aspose.slides.internal.o9b.w1 var14 = new com.aspose.slides.internal.o9b.w1();
      float var15 = var4 * (var8.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F;
      float var16 = var8.e5().h0() / var6;
      float var17 = var6 / 2.0F;
      if (var8.m3().c8().isPlotOrderReversed()) {
         var5 = var6 + 1 - var5;
      }

      if (var5 <= var17 && !var8.m3().c8().isPlotOrderReversed()) {
         float var22 = ((var17 - var5) * var16 + var15 / 2.0F + var4 - var11) * 2.0F;
         if (var2 <= var12) {
            float var24 = 2.0F * (var12 - var2);
            n5(var8, var0 + var1, var24, var22, 0).n5(var14);
         } else {
            float var25 = 2.0F * (var2 - var12);
            n5(var8, var0 + var1, var25, var22, 1).n5(var14);
         }
      } else {
         float var18 = ((var5 - var17) * var16 - var15 / 2.0F - var4 + var11) * 2.0F;
         if (var2 <= var12) {
            float var19 = 2.0F * (var12 - var2);
            n5(var8, var0 + var1, var19, var18, 3).n5(var14);
         } else {
            float var23 = 2.0F * (var2 - var12);
            n5(var8, var0 + var1, var23, var18, 2).n5(var14);
         }
      }

      return var14;
   }

   static double n5(t9z var0, n1g var1) {
      double var2 = 0.0;
      double var4 = 0.0;
      double var6 = var1.m1().z1();
      List var8 = var1.y4();

      for (int var9 = 0; var9 < var0.y4().c8().size(); var9++) {
         for (int var10 = 0; var10 < var8.size(); var10++) {
            t9z var11 = ((g3y)var8.get_Item(var10)).c8().get_Item(var9);
            if (var11 != null) {
               double var12 = var11.n5();
               if (var12 > var6 && var2 < var12 - var6) {
                  var2 = var12 - var6;
               }

               if (var12 < var6 && var4 < var6 - var12) {
                  var4 = var6 - var12;
               }
            }
         }
      }

      double var14 = var1.m1().k5(var0.n5());
      if (var0.n5() >= var6) {
         return var2 == 0.0 ? 1.0 : (var2 - (var14 - var6)) / var2;
      } else {
         return var4 == 0.0 ? 1.0 : (var4 - (var6 - var14)) / var4;
      }
   }

   static void n5(List<g3y> var0, int var1, double[] var2, double[] var3) {
      var2[0] = 0.0;
      var3[0] = 0.0;

      for (int var4 = 0; var4 < var0.size(); var4++) {
         g3y var5 = (g3y)var0.get_Item(var4);
         double var6 = var5.c8().get_Item(var1).n5();
         if (var6 > 0.0) {
            var2[0] += var6;
         }

         if (var6 < 0.0) {
            var3[0] += var6;
         }
      }
   }

   static void n5(List<g3y> var0, int var1, double[] var2, double[] var3, n1g var4) {
      var2[0] = 0.0;
      var3[0] = 0.0;
      int var5 = n1g.u3(var0);

      for (int var6 = 0; var6 < var5; var6++) {
         double var7 = 0.0;
         double var9 = 0.0;
         double[] var11 = new double[]{0.0};
         double[] var12 = new double[]{0.0};
         n5(var0, var6, var11, var12);
         var7 = var11[0];
         var9 = var12[0];
         if (var7 > var2[0]) {
            var2[0] = var7;
         }

         if (var9 < var3[0]) {
            var3[0] = var9;
         }
      }
   }

   private static void n5(t9z var0, n1g var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      com.aspose.slides.internal.o9b.w1[] var9 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 8)
      );
      float var10 = var1.e5().u9();
      byte var11 = 3;
      com.aspose.slides.internal.o9b.w1 var12 = com.aspose.slides.internal.o9b.w1.n5.u3();
      float var13 = var2 + var3 * (1.0F - var7) / 2.0F;
      float var14 = var2 + var3 * (1.0F - var8) / 2.0F;

      for (int var15 = 0; var15 < 2; var15++) {
         if (var14 <= var10) {
            float var16 = 2.0F * (var10 - var14);
            n5(var1, var5, var16, var4 * var8, 0).n5(var9[var15]);
            n5(var1, var5, var16, var4 * var8, 3).n5(var9[var15 + var11]);
         } else {
            float var17 = 2.0F * (var14 - var10);
            n5(var1, var5, var17, var4 * var8, 1).n5(var9[var15]);
            n5(var1, var5, var17, var4 * var8, 2).n5(var9[var15 + var11]);
         }

         if (var13 <= var10) {
            float var18 = 2.0F * (var10 - var13);
            n5(var1, var5, var18, var4 * var7, 0).n5(var12);
            var9[var15 + 4].n5(var12.l6());
            var9[var15 + 4].l6(var12.k5() + var6);
            n5(var1, var5, var18, var4 * var7, 3).n5(var12);
            var9[var15 + var11 + 4].n5(var12.l6());
            var9[var15 + var11 + 4].l6(var12.k5() + var6);
         } else {
            float var19 = 2.0F * (var13 - var10);
            n5(var1, var5, var19, var4 * var7, 1).n5(var12);
            var9[var15 + 4].n5(var12.l6());
            var9[var15 + 4].l6(var12.k5() + var6);
            n5(var1, var5, var19, var4 * var7, 2).n5(var12);
            var9[var15 + var11 + 4].n5(var12.l6());
            var9[var15 + var11 + 4].l6(var12.k5() + var6);
         }

         var11 = 1;
         var14 += var3 * var8;
         var13 += var3 * var7;
      }

      n5(var1, var0, var9, var6);
   }

   private static void n5(n1g var0, t9z var1, com.aspose.slides.internal.o9b.w1[] var2, float var3) {
      com.aspose.slides.internal.x4g.s7 var4 = new com.aspose.slides.internal.x4g.s7();
      var4.k5(var2);
      var1.n5(var2[0].u3(), var2[1].u3());
      var1.n5(var2[1].u3(), var2[2].u3());
      var1.n5(var2[2].u3(), var2[3].u3());
      var1.n5(var2[0].u3(), var2[3].u3());
      if (var3 != 0.0F) {
         var1.n5(var2[4].u3(), var2[5].u3());
         var1.n5(var2[5].u3(), var2[6].u3());
         var1.n5(var2[6].u3(), var2[7].u3());
         var1.n5(var2[4].u3(), var2[7].u3());
         var1.n5(var2[0].u3(), var2[4].u3());
         var1.n5(var2[1].u3(), var2[5].u3());
         var1.n5(var2[2].u3(), var2[6].u3());
         var1.n5(var2[3].u3(), var2[7].u3());
      }

      if (var3 != 0.0F) {
         if (var0.p8() <= 45 || var0.p8() == 360) {
            com.aspose.slides.internal.x4g.s7 var13 = new com.aspose.slides.internal.x4g.s7();
            var13.k5(new com.aspose.slides.internal.o9b.w1[]{var2[0], var2[1], var2[5], var2[4]});
            var1.k5(var13);
            com.aspose.slides.internal.x4g.s7 var25 = new com.aspose.slides.internal.x4g.s7();
            var25.k5(new com.aspose.slides.internal.o9b.w1[]{var2[1], var2[2], var2[6], var2[5]});
            var1.n5(var25, 0.5F);
            var1.n5(var13);
            var1.n5(var25);
         } else if (var0.p8() > 45 && var0.p8() <= 90) {
            com.aspose.slides.internal.x4g.s7 var12 = new com.aspose.slides.internal.x4g.s7();
            var12.k5(new com.aspose.slides.internal.o9b.w1[]{var2[1], var2[2], var2[6], var2[5]});
            var1.k5(var12);
            com.aspose.slides.internal.x4g.s7 var24 = new com.aspose.slides.internal.x4g.s7();
            var24.k5(new com.aspose.slides.internal.o9b.w1[]{var2[0], var2[1], var2[5], var2[4]});
            var1.n5(var24, 0.5F);
            var1.n5(var12);
            var1.n5(var24);
         } else if (var0.p8() > 90 && var0.p8() <= 135) {
            com.aspose.slides.internal.x4g.s7 var11 = new com.aspose.slides.internal.x4g.s7();
            var11.k5(new com.aspose.slides.internal.o9b.w1[]{var2[1], var2[2], var2[6], var2[5]});
            var1.k5(var11);
            com.aspose.slides.internal.x4g.s7 var23 = new com.aspose.slides.internal.x4g.s7();
            var23.k5(new com.aspose.slides.internal.o9b.w1[]{var2[2], var2[3], var2[7], var2[6]});
            var1.n5(var23, 0.5F);
            var1.n5(var11);
            var1.n5(var23);
         } else if (var0.p8() > 135 && var0.p8() <= 180) {
            com.aspose.slides.internal.x4g.s7 var10 = new com.aspose.slides.internal.x4g.s7();
            var10.k5(new com.aspose.slides.internal.o9b.w1[]{var2[2], var2[3], var2[7], var2[6]});
            var1.k5(var10);
            com.aspose.slides.internal.x4g.s7 var22 = new com.aspose.slides.internal.x4g.s7();
            var22.k5(new com.aspose.slides.internal.o9b.w1[]{var2[1], var2[2], var2[6], var2[5]});
            var1.n5(var22, 0.5F);
            var1.n5(var10);
            var1.n5(var22);
         } else if (var0.p8() > 180 && var0.p8() <= 225) {
            com.aspose.slides.internal.x4g.s7 var9 = new com.aspose.slides.internal.x4g.s7();
            var9.k5(new com.aspose.slides.internal.o9b.w1[]{var2[2], var2[3], var2[7], var2[6]});
            var1.k5(var9);
            com.aspose.slides.internal.x4g.s7 var21 = new com.aspose.slides.internal.x4g.s7();
            var21.k5(new com.aspose.slides.internal.o9b.w1[]{var2[3], var2[0], var2[4], var2[7]});
            var1.n5(var21, 0.5F);
            var1.n5(var9);
            var1.n5(var21);
         } else if (var0.p8() > 225 && var0.p8() <= 270) {
            com.aspose.slides.internal.x4g.s7 var8 = new com.aspose.slides.internal.x4g.s7();
            var8.k5(new com.aspose.slides.internal.o9b.w1[]{var2[3], var2[0], var2[4], var2[7]});
            var1.k5(var8);
            com.aspose.slides.internal.x4g.s7 var20 = new com.aspose.slides.internal.x4g.s7();
            var20.k5(new com.aspose.slides.internal.o9b.w1[]{var2[2], var2[3], var2[7], var2[6]});
            var1.n5(var20, 0.5F);
            var1.n5(var8);
            var1.n5(var20);
         } else if (var0.p8() > 270 && var0.p8() <= 315) {
            com.aspose.slides.internal.x4g.s7 var7 = new com.aspose.slides.internal.x4g.s7();
            var7.k5(new com.aspose.slides.internal.o9b.w1[]{var2[3], var2[0], var2[4], var2[7]});
            var1.k5(var7);
            com.aspose.slides.internal.x4g.s7 var19 = new com.aspose.slides.internal.x4g.s7();
            var19.k5(new com.aspose.slides.internal.o9b.w1[]{var2[0], var2[1], var2[5], var2[4]});
            var1.n5(var19, 0.5F);
            var1.n5(var7);
            var1.n5(var19);
         } else if (var0.p8() > 315 && var0.p8() < 360) {
            com.aspose.slides.internal.x4g.s7 var5 = new com.aspose.slides.internal.x4g.s7();
            var5.k5(new com.aspose.slides.internal.o9b.w1[]{var2[0], var2[1], var2[5], var2[4]});
            var1.k5(var5);
            com.aspose.slides.internal.x4g.s7 var6 = new com.aspose.slides.internal.x4g.s7();
            var6.k5(new com.aspose.slides.internal.o9b.w1[]{var2[3], var2[0], var2[4], var2[7]});
            var1.n5(var6, 0.5F);
            var1.n5(var5);
            var1.n5(var6);
         }

         if (var0.s3() > 0) {
            if (var3 <= 0.0F) {
               com.aspose.slides.internal.x4g.s7 var14 = new com.aspose.slides.internal.x4g.s7();
               var14.k5(new com.aspose.slides.internal.o9b.w1[]{var2[4], var2[5], var2[6], var2[7]});
               var1.n5(var14, 0.6666667F);
               var1.n5(var14);
            } else {
               com.aspose.slides.internal.x4g.s7 var15 = new com.aspose.slides.internal.x4g.s7();
               var15.k5(new com.aspose.slides.internal.o9b.w1[]{var2[0], var2[1], var2[2], var2[3]});
               var1.n5(var15, 0.6666667F);
               var1.n5(var15);
            }
         } else if (var0.s3() < 0) {
            if (var3 <= 0.0F) {
               com.aspose.slides.internal.x4g.s7 var16 = new com.aspose.slides.internal.x4g.s7();
               var16.k5(new com.aspose.slides.internal.o9b.w1[]{var2[0], var2[1], var2[2], var2[3]});
               var1.n5(var16, 0.33333334F);
               var1.n5(var16);
            } else {
               com.aspose.slides.internal.x4g.s7 var17 = new com.aspose.slides.internal.x4g.s7();
               var17.k5(new com.aspose.slides.internal.o9b.w1[]{var2[4], var2[5], var2[6], var2[7]});
               var1.n5(var17, 0.33333334F);
               var1.n5(var17);
            }
         }
      } else {
         com.aspose.slides.internal.x4g.s7 var18 = new com.aspose.slides.internal.x4g.s7();
         var18.k5(new com.aspose.slides.internal.o9b.w1[]{var2[0], var2[1], var2[2], var2[3]});
         if (var0.s3() > 0) {
            var1.n5(var18, 0.6666667F);
         } else {
            var1.n5(var18, 0.33333334F);
         }

         var1.n5(var18);
      }
   }

   private static void l6(t9z var0, n1g var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = var1.e5().u9();
      Dictionary var10 = new Dictionary();
      Dictionary var11 = new Dictionary();
      float var12 = var2 + var3 / 2.0F;

      for (int var13 = 0; var13 <= 180; var13++) {
         double var14 = var13 * Math.PI / 180.0;
         float var16 = (float)(var4 * com.aspose.slides.ms.System.q1.h0(var14));
         float var17 = (float)(var12 + var3 * var8 / 2.0F * com.aspose.slides.ms.System.q1.c8(var14));
         if (var17 <= var9) {
            float var18 = 2.0F * (var9 - var17);
            if (!var10.containsKey(360 - var13)) {
               var10.addItem(360 - var13, n5(var1, var5, var18, var16 * var8, 0).u3());
            }

            if (!var10.containsKey(var13)) {
               var10.addItem(var13, n5(var1, var5, var18, var16 * var8, 3).u3());
            }
         } else {
            float var21 = 2.0F * (var17 - var9);
            if (!var10.containsKey(360 - var13)) {
               var10.addItem(360 - var13, n5(var1, var5, var21, var16 * var8, 1).u3());
            }

            if (!var10.containsKey(var13)) {
               var10.addItem(var13, n5(var1, var5, var21, var16 * var8, 2).u3());
            }
         }

         var17 = (float)(var12 + var3 * var7 / 2.0F * com.aspose.slides.ms.System.q1.c8(var14));
         if (var17 <= var9) {
            float var22 = 2.0F * (var9 - var17);
            if (!var11.containsKey(360 - var13)) {
               com.aspose.slides.internal.o9b.w1 var19 = n5(var1, var5, var22, var16 * var7, 0).u3();
               var19.l6(var19.k5() + var6);
               var11.addItem(360 - var13, var19.u3());
            }

            if (!var11.containsKey(var13)) {
               com.aspose.slides.internal.o9b.w1 var24 = n5(var1, var5, var22, var16 * var7, 3).u3();
               var24.l6(var24.k5() + var6);
               var11.addItem(var13, var24.u3());
            }
         } else {
            float var23 = 2.0F * (var17 - var9);
            if (!var11.containsKey(360 - var13)) {
               com.aspose.slides.internal.o9b.w1 var25 = n5(var1, var5, var23, var16 * var7, 1).u3();
               var25.l6(var25.k5() + var6);
               var11.addItem(360 - var13, var25.u3());
            }

            if (!var11.containsKey(var13)) {
               com.aspose.slides.internal.o9b.w1 var26 = n5(var1, var5, var23, var16 * var7, 2).u3();
               var26.l6(var26.k5() + var6);
               var11.addItem(var13, var26.u3());
            }
         }
      }

      n5(var0, var10, var11, var6);
   }

   private static void n5(
      t9z var0, Dictionary<Integer, com.aspose.slides.internal.o9b.w1> var1, Dictionary<Integer, com.aspose.slides.internal.o9b.w1> var2, float var3
   ) {
      g3y var4 = var0.y4();
      n1g var5 = var4.t2();
      int var6 = var5.p8();
      com.aspose.slides.internal.o9b.w1 var7 = new com.aspose.slides.internal.o9b.w1();
      com.aspose.slides.internal.o9b.w1 var8 = new com.aspose.slides.internal.o9b.w1();
      int var9 = 0;
      int var10 = 0;
      com.aspose.slides.internal.o9b.w1[] var11 = new com.aspose.slides.internal.o9b.w1[]{var7};
      com.aspose.slides.internal.o9b.w1[] var12 = new com.aspose.slides.internal.o9b.w1[]{var8};
      int[] var13 = new int[]{0};
      int[] var14 = new int[]{0};
      n5(var1, var11, var12, var13, var14);
      var11[0].n5(var7);
      var12[0].n5(var8);
      var9 = var13[0];
      var10 = var14[0];
      com.aspose.slides.internal.o9b.w1 var15 = new com.aspose.slides.internal.o9b.w1();
      com.aspose.slides.internal.o9b.w1 var16 = new com.aspose.slides.internal.o9b.w1();
      int var17 = 0;
      int var18 = 0;
      com.aspose.slides.internal.o9b.w1[] var19 = new com.aspose.slides.internal.o9b.w1[]{var15};
      com.aspose.slides.internal.o9b.w1[] var20 = new com.aspose.slides.internal.o9b.w1[]{var16};
      int[] var21 = new int[]{0};
      int[] var22 = new int[]{0};
      n5(var2, var19, var20, var21, var22);
      var19[0].n5(var15);
      var20[0].n5(var16);
      var17 = var21[0];
      var18 = var22[0];
      com.aspose.slides.internal.o9b.w1[] var23 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 360)
      );
      int var24 = 0;

      for (float var25 = 180.0F + var6; var25 <= 360.0F + var6; var25++) {
         int var26 = com.aspose.slides.internal.v6g.k5.u3(var25 % 360.0F, 13);
         com.aspose.slides.internal.o9b.w1 var27 = ((com.aspose.slides.internal.o9b.w1)var1.get_Item(var26)).u3();
         com.aspose.slides.internal.o9b.w1 var28 = ((com.aspose.slides.internal.o9b.w1)var2.get_Item(var26)).u3();
         var28.n5(var23[var24]);
         var27.n5(var23[var23.length - 1 - var24]);
         var24++;
      }

      com.aspose.slides.internal.x4g.s7 var38 = new com.aspose.slides.internal.x4g.s7();
      var38.k5(var23);
      var0.k5(var38);
      com.aspose.slides.internal.x4g.s7 var39 = new com.aspose.slides.internal.x4g.s7();
      var39.k5(var23);
      FillFormat var40 = new FillFormat(var0.s7());
      var40.setFillType((byte)2);
      var40.getGradientFormat().setGradientShape((byte)0);
      var40.getGradientFormat().setLinearGradientAngle(0.0F);
      com.aspose.slides.internal.o9b.c8 var41 = var0.s7().a6().o8();
      if (var6 >= 0 && var6 < 30) {
         ((GradientStopCollection)var40.getGradientFormat().getGradientStops()).n5(0.0F, com.aspose.slides.internal.o9b.c8.n5(143, 0, 0, 0).o8());
         ((GradientStopCollection)var40.getGradientFormat().getGradientStops())
            .n5(0.64F, com.aspose.slides.internal.o9b.c8.n5(130, var41.x8() & 255, var41.n3() & 255, var41.y4() & 255).o8());
         ((GradientStopCollection)var40.getGradientFormat().getGradientStops()).n5(1.0F, com.aspose.slides.internal.o9b.c8.n5(0, 255, 255, 255).o8());
      } else if (var6 >= 30 && var6 < 160) {
         ((GradientStopCollection)var40.getGradientFormat().getGradientStops()).n5(1.0F, com.aspose.slides.internal.o9b.c8.n5(143, 0, 0, 0).o8());
         ((GradientStopCollection)var40.getGradientFormat().getGradientStops())
            .n5(0.36F, com.aspose.slides.internal.o9b.c8.n5(130, var41.x8() & 255, var41.n3() & 255, var41.y4() & 255).o8());
         ((GradientStopCollection)var40.getGradientFormat().getGradientStops()).n5(0.0F, com.aspose.slides.internal.o9b.c8.n5(0, 255, 255, 255).o8());
      } else if (var6 >= 160 && var6 < 200) {
         ((GradientStopCollection)var40.getGradientFormat().getGradientStops()).n5(0.0F, com.aspose.slides.internal.o9b.c8.n5(143, 0, 0, 0).o8());
         ((GradientStopCollection)var40.getGradientFormat().getGradientStops())
            .n5(0.64F, com.aspose.slides.internal.o9b.c8.n5(130, var41.x8() & 255, var41.n3() & 255, var41.y4() & 255).o8());
         ((GradientStopCollection)var40.getGradientFormat().getGradientStops()).n5(1.0F, com.aspose.slides.internal.o9b.c8.n5(0, 255, 255, 255).o8());
      } else if (var6 >= 200 && var6 < 240) {
         ((GradientStopCollection)var40.getGradientFormat().getGradientStops()).n5(0.0F, com.aspose.slides.internal.o9b.c8.n5(170, 0, 0, 0).o8());
         ((GradientStopCollection)var40.getGradientFormat().getGradientStops())
            .n5(0.64F, com.aspose.slides.internal.o9b.c8.n5(130, var41.x8() & 255, var41.n3() & 255, var41.y4() & 255).o8());
         ((GradientStopCollection)var40.getGradientFormat().getGradientStops()).n5(1.0F, com.aspose.slides.internal.o9b.c8.n5(0, 255, 255, 255).o8());
      } else if (var6 > 240 && var6 < 320) {
         ((GradientStopCollection)var40.getGradientFormat().getGradientStops()).n5(0.0F, com.aspose.slides.internal.o9b.c8.n5(200, 0, 0, 0).o8());
         ((GradientStopCollection)var40.getGradientFormat().getGradientStops())
            .n5(0.64F, com.aspose.slides.internal.o9b.c8.n5(130, var41.x8() & 255, var41.n3() & 255, var41.y4() & 255).o8());
         ((GradientStopCollection)var40.getGradientFormat().getGradientStops()).n5(1.0F, com.aspose.slides.internal.o9b.c8.n5(0, 255, 255, 255).o8());
      } else if (var6 >= 320 && var6 < 340) {
         ((GradientStopCollection)var40.getGradientFormat().getGradientStops()).n5(0.0F, com.aspose.slides.internal.o9b.c8.n5(170, 0, 0, 0).o8());
         ((GradientStopCollection)var40.getGradientFormat().getGradientStops())
            .n5(0.64F, com.aspose.slides.internal.o9b.c8.n5(130, var41.x8() & 255, var41.n3() & 255, var41.y4() & 255).o8());
         ((GradientStopCollection)var40.getGradientFormat().getGradientStops()).n5(1.0F, com.aspose.slides.internal.o9b.c8.n5(0, 255, 255, 255).o8());
      } else {
         ((GradientStopCollection)var40.getGradientFormat().getGradientStops()).n5(0.0F, com.aspose.slides.internal.o9b.c8.n5(143, 0, 0, 0).o8());
         ((GradientStopCollection)var40.getGradientFormat().getGradientStops())
            .n5(0.64F, com.aspose.slides.internal.o9b.c8.n5(130, var41.x8() & 255, var41.n3() & 255, var41.y4() & 255).o8());
         ((GradientStopCollection)var40.getGradientFormat().getGradientStops()).n5(1.0F, com.aspose.slides.internal.o9b.c8.n5(0, 255, 255, 255).o8());
      }

      w5k.n5(com.aspose.slides.internal.o9b.c8.u3.o8(), var0.y4().t2(), var39, var40, 1.0F, null);
      com.aspose.slides.internal.x4g.s7 var29 = new com.aspose.slides.internal.x4g.s7();
      com.aspose.slides.internal.x4g.s7 var30 = new com.aspose.slides.internal.x4g.s7();
      com.aspose.slides.internal.o9b.w1[] var31 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var1.size())
      );
      com.aspose.slides.internal.o9b.w1[] var32 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var1.size())
      );

      for (int var33 = 0; var33 <= 360; var33++) {
         ((com.aspose.slides.internal.o9b.w1)var1.get_Item(var33)).n5(var31[var33]);
         ((com.aspose.slides.internal.o9b.w1)var2.get_Item(var33)).n5(var32[var33]);
      }

      var29.u3(var31);
      var30.u3(var32);
      if (var5.s3() > 0) {
         if (var3 < 0.0F) {
            var0.n5(var30, 0.7F);
            var0.n5(var30);
            n5(var0, var9, var10, var1);
         } else if (var3 > 0.0F) {
            var0.n5(var29, 0.7F);
            var0.n5(var29);
            n5(var0, var9, var10, var2);
         } else {
            var0.n5(var29, 0.7F);
            var0.n5(var29);
         }
      } else if (var5.s3() < 0) {
         if (var3 < 0.0F) {
            var0.n5(var29, 0.33333334F);
            var0.n5(var29);
            n5(var0, var9, var10, var2);
         } else if (var3 > 0.0F) {
            var0.n5(var30, 0.33333334F);
            var0.n5(var30);
            n5(var0, var9, var10, var1);
         } else {
            var0.n5(var29, 0.33333334F);
            var0.n5(var29);
         }
      } else {
         com.aspose.slides.internal.x4g.s7 var42 = new com.aspose.slides.internal.x4g.s7();
         var42.l6(var8.l6(), var8.k5(), var7.l6(), var7.k5());
         var42.l6(var16.l6(), var16.k5(), var15.l6(), var15.k5());
         var0.n5(var42);
      }

      if (var3 != 0.0F) {
         com.aspose.slides.internal.x4g.s7 var43 = new com.aspose.slides.internal.x4g.s7();
         var43.t9();
         var43.l6(var8.l6(), var8.k5(), var16.l6(), var16.k5());
         var43.t9();
         var43.l6(var7.l6(), var7.k5(), var15.l6(), var15.k5());
         var0.n5(var43);
      }
   }

   private static void n5(
      Dictionary<Integer, com.aspose.slides.internal.o9b.w1> var0,
      com.aspose.slides.internal.o9b.w1[] var1,
      com.aspose.slides.internal.o9b.w1[] var2,
      int[] var3,
      int[] var4
   ) {
      com.aspose.slides.internal.o9b.w1.n5.n5(var1[0]);
      com.aspose.slides.internal.o9b.w1.n5.n5(var2[0]);
      var3[0] = 0;
      var4[0] = 0;
      Dictionary$Enumerator var5 = var0.iterator();

      try {
         while (var5.hasNext()) {
            KeyValuePair var6 = (KeyValuePair)var5.next();
            if (com.aspose.slides.internal.o9b.w1.n5(var1[0], com.aspose.slides.internal.o9b.w1.n5)
               || ((com.aspose.slides.internal.o9b.w1)var6.getValue()).l6() > var1[0].l6()) {
               ((com.aspose.slides.internal.o9b.w1)var6.getValue()).n5(var1[0]);
               var3[0] = (Integer)var6.getKey();
            }

            if (com.aspose.slides.internal.o9b.w1.n5(var2[0], com.aspose.slides.internal.o9b.w1.n5)
               || ((com.aspose.slides.internal.o9b.w1)var6.getValue()).l6() < var2[0].l6()) {
               ((com.aspose.slides.internal.o9b.w1)var6.getValue()).n5(var2[0]);
               var4[0] = (Integer)var6.getKey();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }
   }

   static void n5(t9z var0, int var1, int var2, Dictionary<Integer, com.aspose.slides.internal.o9b.w1> var3) {
      if (var2 > var1) {
         var1 += 360;
      }

      com.aspose.slides.internal.o9b.w1[] var4 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), com.aspose.slides.ms.System.q1.n5(var1 - var2 + 1)
         )
      );
      int var5 = 0;

      for (int var6 = var2; var6 <= var1; var6++) {
         ((com.aspose.slides.internal.o9b.w1)var3.get_Item(var6 % 360)).n5(var4[var5]);
         var5++;
      }

      com.aspose.slides.internal.x4g.s7 var7 = new com.aspose.slides.internal.x4g.s7();
      var7.u3(var4);
      var0.n5(var7);
   }

   public void n5(d0c var1) {
   }

   public d0c n5() {
      d0c var1 = new d0c();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(d0c var1) {
      return true;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof d0c) ? false : this.l6((d0c)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public d0c Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(d0c bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
