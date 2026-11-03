package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class t6 {
   static void n5(float var0, double var1, int var3, n1g var4) {
      List var5 = var4.y4();
      int var6 = var5.size();
      l5 var7 = var4.q0();
      l5 var8 = var4.m1();
      if (var4.q0().c8().getCategoryAxisType() == 1) {
         n5(var0, var1, var4);
      } else {
         List var9 = new List();
         float var10 = var4.e5().a6() / var3;
         float var11 = var4.e5().n5(true, var3, var6);
         float var12 = var4.e5().c8();
         float var13 = var11
            * com.aspose.slides.internal.v6g.k5.c8(var4.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth(), 8)
            / 100.0F;

         for (int var14 = 0; var14 < var3; var14++) {
            List var15 = var5;
            if (var7.c8().isPlotOrderReversed()) {
               var15.reverse();
            }

            for (int var16 = 0; var16 < var15.size(); var16++) {
               g3y var17 = (g3y)var15.get_Item(var16);
               int var18 = var17.l6();
               float var19 = var16 * var11;
               float var20 = var10 * var14 + var13 / 2.0F + var19;
               var20 = var4.e5().k5() - var20;
               List var21 = var17.c8();
               int var22 = var14;
               if (var7.c8().isPlotOrderReversed()) {
                  var22 = var3 - 1 - var22;
               }

               t9z var23 = (t9z)var21.get_Item(var22);
               if (var23 != null && !var23.c8()) {
                  double var24 = var8.k5(var23.n5());
                  float var26 = (float)(var24 - var1) / (float)(var8.z3() - var8.q0()) * var4.e5().u3();
                  if (var8.c8().isPlotOrderReversed()) {
                     var26 = -var26;
                  }

                  n5(var23, var20, var11, var12, var0, var26, Double.NaN, var4);
                  com.aspose.slides.internal.o9b.w1 var27 = n5(var4, var20, var11, var12, var0, var26).u3();
                  w2f var28 = new w2f(var18, var22, var27.u3(), 0.0F);
                  var9.addItem(var28);
               }
            }
         }

         n5(var9, var4);
      }
   }

   private static void n5(float var0, double var1, n1g var3) {
      List var4 = var3.y4();
      y9r var5 = var3.e5();
      int var6 = var4.size();
      l5 var7 = var3.q0();
      l5 var8 = var3.m1();
      List var9 = new List();
      int var10 = com.aspose.slides.internal.v6g.k5.u3(var7.z3(), 14);
      int var11 = com.aspose.slides.internal.v6g.k5.u3(var7.q0(), 14);
      int var12 = var7.c8().getBaseUnitScale();
      int var13 = p4.n5(var12, var10, var11, var10, false) + 1;
      float var14 = var5.a6() / var13;
      float var15 = var3.e5().n5(true, var13, var6);
      float var16 = var3.e5().c8();
      float var17 = var15
         * com.aspose.slides.internal.v6g.k5.c8(var3.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth(), 8)
         / 100.0F;
      List var18 = o9b.n5(var3.l6(), false);
      int var19 = var18.size();

      for (int var20 = 0; var20 < var19; var20++) {
         int var21 = (Integer)var18.get_Item(var20);
         var21 = p4.n5(var12, var21, false);
         int var22 = p4.n5(var12, var21, com.aspose.slides.internal.v6g.k5.u3(var7.q0(), 14), com.aspose.slides.internal.v6g.k5.u3(var7.z3(), 14), false);
         float var23 = var14 * var22;
         float var24 = var23 + var17 / 2.0F;
         var24 = var3.e5().k5() - var24 + var15;
         List var25 = var4;

         for (int var26 = 0; var26 < var25.size(); var26++) {
            g3y var27 = (g3y)var25.get_Item(var26);
            int var28 = var27.l6();
            float var29 = var15;
            var24 -= var29;
            List var30 = var27.c8();
            int var31 = var20;
            if (var7.c8().isPlotOrderReversed()) {
               var31 = var19 - 1 - var31;
            }

            t9z var32 = (t9z)var30.get_Item(var31);
            if (var32 != null && !var32.c8()) {
               double var33 = var8.k5(var32.n5());
               float var35 = (float)(var33 - var1) / (float)(var8.z3() - var8.q0()) * var3.e5().u3();
               if (var8.c8().isPlotOrderReversed()) {
                  var35 = -var35;
               }

               n5(var32, var24, var15, var16, var0, var35, Double.NaN, var3);
               com.aspose.slides.internal.o9b.w1 var36 = n5(var3, var24, var15, var16, var0, var35).u3();
               w2f var37 = new w2f(var28, var31, var36.u3(), 0.0F);
               var9.addItem(var37);
            }
         }
      }

      n5(var9, var3);
   }

   static void n5(double var0, int var2, n1g var3) {
      List var4 = var3.y4();
      l5 var5 = var3.q0();
      l5 var6 = var3.m1();
      float var7 = 0.0F;
      if (var6.c8().isPlotOrderReversed()) {
         var7 = var3.e5().l6() + (float)com.aspose.slides.ms.System.q1.n5(var6.z3() / (float)(var6.z3() - var6.q0())) * var3.e5().u3();
      } else {
         var7 = var3.e5().l6() + var3.e5().u3() - (float)var6.z3() / (float)(var6.z3() - var6.q0()) * var3.e5().u3();
      }

      if (var3.q0().c8().getCategoryAxisType() == 1) {
         l6(var7, var0, var3);
      } else {
         List var8 = new List();
         float var9 = var3.e5().a6() / var2;
         float var10 = var3.e5().n5(true, var2, 1);
         float var11 = var3.e5().c8();
         float var12 = var10
            * com.aspose.slides.internal.v6g.k5.c8(var3.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth(), 8)
            / 100.0F;

         for (int var13 = 0; var13 < var2; var13++) {
            List var14 = new List();
            List var15 = var4;

            for (int var16 = 0; var16 < var15.size(); var16++) {
               g3y var17 = (g3y)var15.get_Item(var16);
               int var18 = var17.l6();
               float var19 = var9 * var13 + var12 / 2.0F;
               var19 = var3.e5().k5() - var19;
               List var20 = var17.c8();
               int var21 = var13;
               if (var5.c8().isPlotOrderReversed()) {
                  var21 = var2 - 1 - var21;
               }

               t9z var22 = (t9z)var20.get_Item(var21);
               int var23 = var16;
               if (var22 != null && !var22.c8()) {
                  double var24 = var22.n5();
                  double var26 = 0.0;
                  double[] var28 = new double[]{var24};
                  double[] var29 = new double[]{0.0};
                  boolean var30 = g6z.n5(var28, var29, var15, var23, var21, var6.z3(), var6.q0());
                  var24 = var28[0];
                  var26 = var29[0];
                  if (var30) {
                     float var31 = (float)var24 / (float)(var6.z3() - var6.q0()) * var3.e5().u3();
                     float var32 = (float)var26 / (float)(var6.z3() - var6.q0()) * var3.e5().u3();
                     float var33;
                     if (var6.c8().isPlotOrderReversed()) {
                        var33 = var7 - (var32 - var31);
                        var31 = -var31;
                     } else {
                        var33 = var7 + (var32 - var31);
                        if (var33 < var3.e5().l6()) {
                           var31 -= var3.e5().l6() - var33;
                           var33 = var3.e5().l6();
                        }
                     }

                     t6$n5 var34 = new t6$n5(var22, var19, var33, var31, var26);
                     n5(var24, var34, var14, var6);
                     com.aspose.slides.internal.o9b.w1 var35 = l6(var3, var19, var10, var11, var33, var31).u3();
                     w2f var36 = new w2f(var18, var21, var35.u3(), 0.0F);
                     var8.addItem(var36);
                  }
               }
            }

            for (int var38 = 0; var38 < var14.size(); var38++) {
               t6$n5 var39 = (t6$n5)var14.get_Item(var38);
               n5(var39.n5(), var39.l6(), var10, var11, var39.k5(), var39.u3(), var39.a6(), var3);
            }

            var14.clear();
         }

         n5(var8, var3);
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
      float var12 = var3.e5().a6() / var11;
      float var13 = var3.e5().n5(true, var11, 1);
      float var14 = var3.e5().c8();
      float var15 = var13
         * com.aspose.slides.internal.v6g.k5.c8(var3.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth(), 8)
         / 100.0F;
      List var16 = o9b.n5(var3.l6(), false);
      int var17 = var16.size();

      for (int var18 = 0; var18 < var17; var18++) {
         List var19 = new List();
         int var20 = (Integer)var16.get_Item(var18);
         var20 = p4.n5(var10, var20, false);
         int var21 = p4.n5(var10, var20, com.aspose.slides.internal.v6g.k5.u3(var5.q0(), 14), com.aspose.slides.internal.v6g.k5.u3(var5.z3(), 14), false);
         float var22 = var12 * var21;
         float var23 = var22 + var15 / 2.0F;
         var23 = var3.e5().k5() - var23;
         List var24 = var4;

         for (int var25 = 0; var25 < var24.size(); var25++) {
            g3y var26 = (g3y)var24.get_Item(var25);
            int var27 = var26.l6();
            List var28 = var26.c8();
            int var29 = var18;
            if (var5.c8().isPlotOrderReversed()) {
               var29 = var17 - 1 - var29;
            }

            t9z var30 = (t9z)var28.get_Item(var29);
            int var31 = var25;
            if (var30 != null && !var30.c8()) {
               double var32 = var30.n5();
               double var34 = 0.0;
               double[] var36 = new double[]{var32};
               double[] var37 = new double[]{0.0};
               boolean var38 = g6z.n5(var36, var37, var24, var31, var29, var6.z3(), var6.q0());
               var32 = var36[0];
               var34 = var37[0];
               if (var38) {
                  float var39 = (float)var32 / (float)(var6.z3() - var6.q0()) * var3.e5().u3();
                  float var40 = (float)var34 / (float)(var6.z3() - var6.q0()) * var3.e5().u3();
                  float var41;
                  if (var6.c8().isPlotOrderReversed()) {
                     var41 = var0 - (var40 - var39);
                     var39 = -var39;
                  } else {
                     var41 = var0 + (var40 - var39);
                  }

                  t6$n5 var42 = new t6$n5(var30, var23, var41, var39, var34);
                  n5(var32, var42, var19, var6);
                  com.aspose.slides.internal.o9b.w1 var43 = l6(var3, var23, var13, var14, var41, var39).u3();
                  w2f var44 = new w2f(var27, var29, var43.u3(), 0.0F);
                  var7.addItem(var44);
               }
            }
         }

         for (int var47 = 0; var47 < var19.size(); var47++) {
            t6$n5 var48 = (t6$n5)var19.get_Item(var47);
            n5(var48.n5(), var48.l6(), var13, var14, var48.k5(), var48.u3(), var48.a6(), var3);
         }

         var19.clear();
      }

      n5(var7, var3);
   }

   static void l6(double var0, int var2, n1g var3) {
      List var4 = var3.y4();
      l5 var5 = var3.q0();
      l5 var6 = var3.m1();
      float var7 = 0.0F;
      if (var6.c8().isPlotOrderReversed()) {
         var7 = var3.e5().l6() + (float)com.aspose.slides.ms.System.q1.n5(var6.z3() / (float)(var6.z3() - var6.q0())) * var3.e5().u3();
      } else {
         var7 = var3.e5().l6() + (float)com.aspose.slides.ms.System.q1.n5(var6.q0() / (float)(var6.z3() - var6.q0())) * var3.e5().u3();
      }

      if (var3.q0().c8().getCategoryAxisType() == 1) {
         k5(var7, var0, var3);
      } else {
         List var8 = new List();
         float var9 = var3.e5().a6() / var2;
         float var10 = var3.e5().n5(true, var2, 1);
         float var11 = var3.e5().c8();
         float var12 = var10
            * com.aspose.slides.internal.v6g.k5.c8(var3.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth(), 8)
            / 100.0F;

         for (int var13 = 0; var13 < var2; var13++) {
            List var14 = new List();
            List var15 = var4;

            for (int var16 = 0; var16 < var15.size(); var16++) {
               g3y var17 = (g3y)var15.get_Item(var16);
               int var18 = var17.l6();
               float var19 = var9 * var13 + var12 / 2.0F;
               var19 = var3.e5().k5() - var19;
               List var20 = var17.c8();
               int var21 = var13;
               if (var5.c8().isPlotOrderReversed()) {
                  var21 = var2 - 1 - var21;
               }

               t9z var22 = (t9z)var20.get_Item(var21);
               int var23 = var16;
               if (var22 != null && !var22.c8()) {
                  double var24 = g6z.n5(var15, var21);
                  if (var24 != 0.0) {
                     double var26 = var22.n5();
                     double var28 = var26;
                     double[] var30 = new double[]{var26};
                     double[] var31 = new double[]{var28};
                     boolean var32 = g6z.n5(var30, var31, var15, var23, var21, var24, var6);
                     var26 = var30[0];
                     var28 = var31[0];
                     if (var32) {
                        float var33 = (float)var26 * 100.0F / (float)var24 / (float)(var6.z3() - var6.q0()) * var3.e5().u3();
                        float var34 = (float)var28 * 100.0F / (float)var24 / (float)(var6.z3() - var6.q0()) * var3.e5().u3();
                        float var35;
                        if (var6.c8().isPlotOrderReversed()) {
                           var35 = var7 - (var34 - var33);
                           var33 = -var33;
                        } else {
                           var35 = var7 + (var34 - var33);
                        }

                        t6$n5 var36 = new t6$n5(var22, var19, var35, var33, var28);
                        n5(var26, var36, var14, var6);
                        com.aspose.slides.internal.o9b.w1 var37 = l6(var3, var19, var10, var11, var35, var33).u3();
                        w2f var38 = new w2f(var18, var21, var37.u3(), 0.0F);
                        var8.addItem(var38);
                     }
                  }
               }
            }

            for (int var40 = 0; var40 < var14.size(); var40++) {
               t6$n5 var41 = (t6$n5)var14.get_Item(var40);
               n5(var41.n5(), var41.l6(), var10, var11, var41.k5(), var41.u3(), var41.a6(), var3);
            }

            var14.clear();
         }

         n5(var8, var3);
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
      float var12 = var3.e5().a6() / var11;
      float var13 = var3.e5().n5(true, var11, 1);
      float var14 = var3.e5().c8();
      float var15 = var13
         * com.aspose.slides.internal.v6g.k5.c8(var3.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth(), 8)
         / 100.0F;
      List var16 = o9b.n5(var3.l6(), false);
      int var17 = var16.size();

      for (int var18 = 0; var18 < var17; var18++) {
         List var19 = new List();
         int var20 = (Integer)var16.get_Item(var18);
         var20 = p4.n5(var10, var20, false);
         int var21 = p4.n5(var10, var20, com.aspose.slides.internal.v6g.k5.u3(var5.q0(), 14), com.aspose.slides.internal.v6g.k5.u3(var5.z3(), 14), false);
         float var22 = var12 * var21;
         float var23 = var22 + var15 / 2.0F;
         var23 = var3.e5().k5() - var23;
         List var24 = var4;

         for (int var25 = 0; var25 < var24.size(); var25++) {
            g3y var26 = (g3y)var24.get_Item(var25);
            int var27 = var26.l6();
            List var28 = var26.c8();
            int var29 = var18;
            if (var5.c8().isPlotOrderReversed()) {
               var29 = var17 - 1 - var29;
            }

            t9z var30 = (t9z)var28.get_Item(var29);
            int var31 = var25;
            if (var30 != null && !var30.c8()) {
               double var32 = g6z.n5(var24, var29);
               if (var32 != 0.0) {
                  double var34 = var30.n5();
                  double var36 = var34;
                  double[] var38 = new double[]{var34};
                  double[] var39 = new double[]{var36};
                  boolean var40 = g6z.n5(var38, var39, var24, var31, var29, var32, var6);
                  var34 = var38[0];
                  var36 = var39[0];
                  if (var40) {
                     float var41 = (float)var34 * 100.0F / (float)var32 / (float)(var6.z3() - var6.q0()) * var3.e5().u3();
                     float var42 = (float)var36 * 100.0F / (float)var32 / (float)(var6.z3() - var6.q0()) * var3.e5().u3();
                     float var43;
                     if (var6.c8().isPlotOrderReversed()) {
                        var43 = var0 - (var42 - var41);
                        var41 = -var41;
                     } else {
                        var43 = var0 + (var42 - var41);
                     }

                     t6$n5 var44 = new t6$n5(var30, var23, var43, var41, var36);
                     n5(var34, var44, var19, var6);
                     com.aspose.slides.internal.o9b.w1 var45 = l6(var3, var23, var13, var14, var43, var41).u3();
                     w2f var46 = new w2f(var27, var29, var45.u3(), 0.0F);
                     var7.addItem(var46);
                  }
               }
            }
         }

         for (int var49 = 0; var49 < var19.size(); var49++) {
            t6$n5 var50 = (t6$n5)var19.get_Item(var49);
            n5(var50.n5(), var50.l6(), var13, var14, var50.k5(), var50.u3(), var50.a6(), var3);
         }

         var19.clear();
      }

      n5(var7, var3);
   }

   private static void n5(double var0, t6$n5 var2, List<t6$n5> var3, l5 var4) {
      float var5 = var2.k5() + var2.u3();
      if (var3.size() == 0) {
         var3.addItem(var2);
      } else {
         for (int var6 = 0; var6 < var3.size(); var6++) {
            t6$n5 var7 = (t6$n5)var3.get_Item(var6);
            float var8 = var7.k5() + var7.u3();
            if (var5 < var8) {
               var3.insertItem(var6, var2);
               break;
            }

            if (var5 == var8) {
               if (var4.c8().isPlotOrderReversed()) {
                  if (var0 > 0.0) {
                     var3.insertItem(var6, var2);
                  } else {
                     var3.insertItem(var6 + 1, var2);
                  }
               } else if (var0 < 0.0) {
                  var3.insertItem(var6, var2);
               } else {
                  var3.insertItem(var6 + 1, var2);
               }
               break;
            }

            if (var6 == var3.size() - 1) {
               var3.addItem(var2);
               break;
            }
         }
      }
   }

   private static com.aspose.slides.internal.o9b.w1 n5(n1g var0, float var1, float var2, float var3, float var4, float var5) {
      com.aspose.slides.internal.o9b.w1 var6 = new com.aspose.slides.internal.o9b.w1();
      float var7 = var4 + var5;
      float var8 = var0.e5().u9();
      if (var7 <= var8) {
         float var9 = 2.0F * (var8 - var7);
         byte var10;
         if (var4 > var7) {
            var10 = 0;
         } else {
            var10 = 3;
         }

         d0c.n5(var0, var1, var9, var3, var10).n5(var6);
      } else {
         byte var14;
         if (var4 > var7) {
            var14 = 1;
         } else {
            var14 = 2;
         }

         float var13 = 2.0F * (var7 - var8);
         d0c.n5(var0, var1, var13, var3, var14).n5(var6);
      }

      com.aspose.slides.internal.o9b.w1 var11 = d0c.n5(var0, var1, 1.0F, var3, 0).u3();
      float var12 = var3 * (float)com.aspose.slides.ms.System.q1.h0(var0.s3() * Math.PI / 180.0);
      return new com.aspose.slides.internal.o9b.w1(var6.l6(), var11.k5() - (var2 + var12) / 2.0F);
   }

   private static com.aspose.slides.internal.o9b.w1 l6(n1g var0, float var1, float var2, float var3, float var4, float var5) {
      var4 += var5 / 2.0F;
      float var6 = var0.e5().u9();
      if (var4 <= var6) {
         float var9 = 2.0F * (var6 - var4);
         return d0c.n5(var0, var1 - var2 / 2.0F, var9, var3, 0);
      } else {
         float var7 = 2.0F * (var4 - var6);
         return d0c.n5(var0, var1 - var2 / 2.0F, var7, var3, 1);
      }
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
         t7k.n5(var2, var5, var6, var9.y4(), var1, var1.q0());
      }
   }

   private static void n5(t9z var0, float var1, float var2, float var3, float var4, float var5, double var6, n1g var8) {
      g3y var9 = var0.y4();
      double var10 = 1.0;
      double var12 = 1.0;
      switch (var9.u9().getBar3DShape()) {
         case 0:
            n5(var0, var8, var1, var2, var3, var4, var5, (float)var10, (float)var12);
            break;
         case 1:
            if (!ChartTypeCharacterizer.c8(var9.u9().getType()) && !ChartTypeCharacterizer.s7(var9.u9().getType())) {
               var10 = 0.0;
            } else {
               double var35 = 0.0;
               double var46 = 0.0;
               double[] var52 = new double[]{0.0};
               double[] var57 = new double[]{0.0};
               d0c.n5(var9.t2().y4(), var0.z1(), var52, var57);
               var35 = var52[0];
               var46 = var57[0];
               if (var0.n5() > 0.0) {
                  var10 = var35 == 0.0 ? 1.0 : (var35 - var6) / var35;
                  var12 = var35 == 0.0 ? 1.0 : (var35 - (var6 - var0.n5())) / var35;
               } else {
                  var10 = var46 == 0.0 ? 1.0 : (var46 - var6) / var46;
                  var12 = var46 == 0.0 ? 1.0 : (var46 - (var6 - var0.n5())) / var46;
               }
            }

            l6(var0, var8, var1, var2, var3, var4, var5, (float)var10, (float)var12);
            break;
         case 2:
            if (ChartTypeCharacterizer.c8(var9.u9().getType())) {
               double var31 = 0.0;
               double var42 = 0.0;
               double[] var50 = new double[]{0.0};
               double[] var55 = new double[]{0.0};
               d0c.n5(var9.t2().y4(), var0.z1(), var50, var55, var8);
               var31 = var50[0];
               var42 = var55[0];
               if (var0.n5() > 0.0) {
                  var10 = var31 == 0.0 ? 1.0 : (var31 - var6) / var31;
                  var12 = var31 == 0.0 ? 1.0 : (var31 - (var6 - var0.n5())) / var31;
               } else {
                  var10 = var42 == 0.0 ? 1.0 : (var42 - var6) / var42;
                  var12 = var42 == 0.0 ? 1.0 : (var42 - (var6 - var0.n5())) / var42;
               }
            } else if (ChartTypeCharacterizer.s7(var9.u9().getType())) {
               double var33 = 0.0;
               double var44 = 0.0;
               double[] var51 = new double[]{0.0};
               double[] var56 = new double[]{0.0};
               d0c.n5(var9.t2().y4(), var0.z1(), var51, var56);
               var33 = var51[0];
               var44 = var56[0];
               if (var0.n5() > 0.0) {
                  var10 = var33 == 0.0 ? 1.0 : (var33 - var6) / var33;
                  var12 = var33 == 0.0 ? 1.0 : (var33 - (var6 - var0.n5())) / var33;
               } else {
                  var10 = var44 == 0.0 ? 1.0 : (var44 - var6) / var44;
                  var12 = var44 == 0.0 ? 1.0 : (var44 - (var6 - var0.n5())) / var44;
               }
            } else {
               var10 = (float)d0c.n5(var0, var8);
               var12 = 1.0;
            }

            l6(var0, var8, var1, var2, var3, var4, var5, (float)var10, (float)var12);
            break;
         case 3:
            l6(var0, var8, var1, var2, var3, var4, var5, (float)var10, (float)var12);
            break;
         case 4:
            if (!ChartTypeCharacterizer.c8(var9.u9().getType()) && !ChartTypeCharacterizer.s7(var9.u9().getType())) {
               var10 = 0.0;
            } else {
               double var29 = 0.0;
               double var40 = 0.0;
               double[] var49 = new double[]{0.0};
               double[] var54 = new double[]{0.0};
               d0c.n5(var9.t2().y4(), var0.z1(), var49, var54);
               var29 = var49[0];
               var40 = var54[0];
               if (var0.n5() > 0.0) {
                  var10 = var29 == 0.0 ? 1.0 : (var29 - var6) / var29;
                  var12 = var29 == 0.0 ? 1.0 : (var29 - (var6 - var0.n5())) / var29;
               } else {
                  var10 = var40 == 0.0 ? 1.0 : (var40 - var6) / var40;
                  var12 = var40 == 0.0 ? 1.0 : (var40 - (var6 - var0.n5())) / var40;
               }
            }

            n5(var0, var8, var1, var2, var3, var4, var5, (float)var10, (float)var12);
            break;
         case 5:
            if (ChartTypeCharacterizer.c8(var9.u9().getType())) {
               double var14 = 0.0;
               double var16 = 0.0;
               double[] var18 = new double[]{0.0};
               double[] var19 = new double[]{0.0};
               d0c.n5(var9.t2().y4(), var0.z1(), var18, var19, var8);
               var14 = var18[0];
               var16 = var19[0];
               if (var0.n5() > 0.0) {
                  var10 = var14 == 0.0 ? 1.0 : (var14 - var6) / var14;
                  var12 = var14 == 0.0 ? 1.0 : (var14 - (var6 - var0.n5())) / var14;
               } else {
                  var10 = var16 == 0.0 ? 1.0 : (var16 - var6) / var16;
                  var12 = var16 == 0.0 ? 1.0 : (var16 - (var6 - var0.n5())) / var16;
               }
            } else if (ChartTypeCharacterizer.s7(var9.u9().getType())) {
               double var27 = 0.0;
               double var38 = 0.0;
               double[] var48 = new double[]{0.0};
               double[] var53 = new double[]{0.0};
               d0c.n5(var9.t2().y4(), var0.z1(), var48, var53);
               var27 = var48[0];
               var38 = var53[0];
               if (var0.n5() > 0.0) {
                  var10 = var27 == 0.0 ? 1.0 : (var27 - var6) / var27;
                  var12 = var27 == 0.0 ? 1.0 : (var27 - (var6 - var0.n5())) / var27;
               } else {
                  var10 = var38 == 0.0 ? 1.0 : (var38 - var6) / var38;
                  var12 = var38 == 0.0 ? 1.0 : (var38 - (var6 - var0.n5())) / var38;
               }
            } else {
               var10 = (float)d0c.n5(var0, var8);
               var12 = 1.0;
            }

            n5(var0, var8, var1, var2, var3, var4, var5, (float)var10, (float)var12);
      }
   }

   private static void n5(t9z var0, n1g var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      com.aspose.slides.internal.o9b.w1[] var9 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 8)
      );
      float var10 = var1.e5().u9();
      float var11 = var5;
      byte var12 = 3;
      com.aspose.slides.internal.o9b.w1 var13 = com.aspose.slides.internal.o9b.w1.n5.u3();
      float var14 = var4 * var8;
      float var15 = var3 * var8;
      float var16 = var2 - var3 * (1.0F - var8) / 2.0F;

      for (int var17 = 0; var17 < 2; var17++) {
         if (var11 <= var10) {
            float var18 = 2.0F * (var10 - var11);
            d0c.n5(var1, var16, var18, var14, 0).n5(var9[var17]);
            var9[var17 + 4].n5(var9[var17].l6());
            var9[var17 + 4].l6(var9[var17].k5() - var15);
            d0c.n5(var1, var16, var18, var14, 3).n5(var9[var17 + var12]);
            var9[var17 + var12 + 4].n5(var9[var17 + var12].l6());
            var9[var17 + var12 + 4].l6(var9[var17 + var12].k5() - var15);
         } else {
            float var24 = 2.0F * (var11 - var10);
            d0c.n5(var1, var16, var24, var14, 1).n5(var9[var17]);
            var9[var17 + 4].n5(var9[var17].l6());
            var9[var17 + 4].l6(var9[var17].k5() - var15);
            d0c.n5(var1, var16, var24, var14, 2).n5(var9[var17 + var12]);
            var9[var17 + var12 + 4].n5(var9[var17 + var12].l6());
            var9[var17 + var12 + 4].l6(var9[var17 + var12].k5() - var15);
         }

         var12 = 1;
         var11 += var6;
         var16 = var2 - var3 * (1.0F - var7) / 2.0F;
         var14 = var4 * var7;
         var15 = var3 * var7;
      }

      if (var6 != 0.0F) {
         com.aspose.slides.internal.x4g.s7 var20 = new com.aspose.slides.internal.x4g.s7();
         var20.k5(new com.aspose.slides.internal.o9b.w1[]{var9[0], var9[1], var9[5], var9[4]});
         var0.k5(var20);
         com.aspose.slides.internal.x4g.s7 var19 = new com.aspose.slides.internal.x4g.s7();
         var19.k5(new com.aspose.slides.internal.o9b.w1[]{var9[4], var9[5], var9[6], var9[7]});
         var0.n5(var19, 0.6666667F);
         var0.n5(var20);
         var0.n5(var19);
      }

      if (var6 > 0.0F) {
         com.aspose.slides.internal.x4g.s7 var21 = new com.aspose.slides.internal.x4g.s7();
         var21.k5(new com.aspose.slides.internal.o9b.w1[]{var9[1], var9[2], var9[6], var9[5]});
         var0.n5(var21, 0.5F);
         var0.n5(var21);
      } else if (var6 < 0.0F) {
         com.aspose.slides.internal.x4g.s7 var22 = new com.aspose.slides.internal.x4g.s7();
         var22.k5(new com.aspose.slides.internal.o9b.w1[]{var9[0], var9[3], var9[7], var9[4]});
         var0.n5(var22, 0.0F);
         var0.n5(var22);
      } else {
         com.aspose.slides.internal.x4g.s7 var23 = new com.aspose.slides.internal.x4g.s7();
         var23.k5(new com.aspose.slides.internal.o9b.w1[]{var9[0], var9[3], var9[7], var9[4]});
         var0.n5(var23, 0.5F);
         var0.n5(var23);
      }
   }

   private static void l6(t9z var0, n1g var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = var5;
      float var10 = var1.e5().u9();
      Dictionary var11 = new Dictionary();
      Dictionary var12 = new Dictionary();
      float var13 = var2 - var3 / 2.0F;

      for (int var14 = 0; var14 <= 90; var14++) {
         double var15 = var14 * Math.PI / 180.0;
         float var17 = (float)(var4 * var8 * com.aspose.slides.ms.System.q1.c8(var15));
         float var18 = (float)(var13 - var3 * var8 / 2.0F * com.aspose.slides.ms.System.q1.h0(var15));
         float var19 = (float)(var13 + var3 * var8 / 2.0F * com.aspose.slides.ms.System.q1.h0(var15));
         if (var9 <= var10) {
            float var20 = 2.0F * (var10 - var9);
            if (!var11.containsKey(180 - var14)) {
               var11.addItem(180 - var14, d0c.n5(var1, var18, var20, var17, 0).u3());
            }

            if (!var11.containsKey(180 + var14)) {
               var11.addItem(180 + var14, d0c.n5(var1, var19, var20, var17, 0).u3());
            }

            if (!var11.containsKey(var14)) {
               var11.addItem(var14, d0c.n5(var1, var18, var20, var17, 3).u3());
            }

            if (!var11.containsKey(360 - var14)) {
               var11.addItem(360 - var14, d0c.n5(var1, var19, var20, var17, 3).u3());
            }
         } else {
            float var58 = 2.0F * (var9 - var10);
            if (!var11.containsKey(180 - var14)) {
               var11.addItem(180 - var14, d0c.n5(var1, var18, var58, var17, 1).u3());
            }

            if (!var11.containsKey(180 + var14)) {
               var11.addItem(180 + var14, d0c.n5(var1, var19, var58, var17, 1).u3());
            }

            if (!var11.containsKey(var14)) {
               var11.addItem(var14, d0c.n5(var1, var18, var58, var17, 2).u3());
            }

            if (!var11.containsKey(360 - var14)) {
               var11.addItem(360 - var14, d0c.n5(var1, var19, var58, var17, 2).u3());
            }
         }

         float var21 = var9 + var6;
         float var22 = (float)(var4 * var7 * com.aspose.slides.ms.System.q1.c8(var15));
         var18 = (float)(var13 - var3 * var7 / 2.0F * com.aspose.slides.ms.System.q1.h0(var15));
         var19 = (float)(var13 + var3 * var7 / 2.0F * com.aspose.slides.ms.System.q1.h0(var15));
         if (var21 <= var10) {
            float var59 = 2.0F * (var10 - var21);
            if (!var12.containsKey(180 - var14)) {
               var12.addItem(180 - var14, d0c.n5(var1, var18, var59, var22, 0).u3());
            }

            if (!var12.containsKey(180 + var14)) {
               var12.addItem(180 + var14, d0c.n5(var1, var19, var59, var22, 0).u3());
            }

            if (!var12.containsKey(var14)) {
               var12.addItem(var14, d0c.n5(var1, var18, var59, var22, 3).u3());
            }

            if (!var12.containsKey(360 - var14)) {
               var12.addItem(360 - var14, d0c.n5(var1, var19, var59, var22, 3).u3());
            }
         } else {
            float var60 = 2.0F * (var21 - var10);
            if (!var12.containsKey(180 - var14)) {
               var12.addItem(180 - var14, d0c.n5(var1, var18, var60, var22, 1).u3());
            }

            if (!var12.containsKey(180 + var14)) {
               var12.addItem(180 + var14, d0c.n5(var1, var19, var60, var22, 1).u3());
            }

            if (!var12.containsKey(var14)) {
               var12.addItem(var14, d0c.n5(var1, var18, var60, var22, 2).u3());
            }

            if (!var12.containsKey(360 - var14)) {
               var12.addItem(360 - var14, d0c.n5(var1, var19, var60, var22, 2).u3());
            }
         }
      }

      com.aspose.slides.internal.o9b.w1 var51 = new com.aspose.slides.internal.o9b.w1();
      com.aspose.slides.internal.o9b.w1 var23 = new com.aspose.slides.internal.o9b.w1();
      int var24 = 0;
      int var52 = 0;
      com.aspose.slides.internal.o9b.w1[] var55 = new com.aspose.slides.internal.o9b.w1[]{var51};
      com.aspose.slides.internal.o9b.w1[] var57 = new com.aspose.slides.internal.o9b.w1[]{var23};
      int[] var61 = new int[]{0};
      int[] var62 = new int[]{0};
      n5(var11, var55, var57, var61, var62);
      var55[0].n5(var51);
      var57[0].n5(var23);
      var24 = var61[0];
      var52 = var62[0];
      com.aspose.slides.internal.o9b.w1 var25 = new com.aspose.slides.internal.o9b.w1();
      com.aspose.slides.internal.o9b.w1 var26 = new com.aspose.slides.internal.o9b.w1();
      int var27 = 0;
      int var28 = 0;
      com.aspose.slides.internal.o9b.w1[] var29 = new com.aspose.slides.internal.o9b.w1[]{var25};
      com.aspose.slides.internal.o9b.w1[] var30 = new com.aspose.slides.internal.o9b.w1[]{var26};
      int[] var31 = new int[]{0};
      int[] var32 = new int[]{0};
      n5(var12, var29, var30, var31, var32);
      var29[0].n5(var25);
      var30[0].n5(var26);
      var27 = var31[0];
      var28 = var32[0];
      if (var6 != 0.0F) {
         byte var33 = 90;
         short var34 = 270;
         float var35 = 0.5F;
         int var36 = var1.s3();
         float var37 = 11.75F;
         float var38 = (float)var33 - var36;

         while (var38 <= (float)var34 - var36) {
            int var39 = com.aspose.slides.internal.v6g.k5.u3(var38 % 360.0F, 13);
            com.aspose.slides.internal.o9b.w1 var40 = ((com.aspose.slides.internal.o9b.w1)var11.get_Item(var39)).u3();
            com.aspose.slides.internal.o9b.w1 var41 = ((com.aspose.slides.internal.o9b.w1)var12.get_Item(var39)).u3();
            if (var38 == var33 - var36) {
               var23.n5(var40);
               var26.n5(var41);
            }

            float var42 = var37;
            if (var38 - var33 == 30.0F && var36 <= 30 || var38 - var33 == 75.0F || var38 - var33 == 120.0F && var36 > 30) {
               var42 = 2.0F * var37;
            }

            if (var38 == var33 - var36 && var36 % var37 != 0.0F) {
               var42 = var36 % var37;
            }

            int var43 = var38 + var42 > var34 - var36 ? (var34 - var36) % 360 : com.aspose.slides.internal.v6g.k5.u3((var38 + var42) % 360.0F, 13);
            com.aspose.slides.internal.o9b.w1 var44 = ((com.aspose.slides.internal.o9b.w1)var11.get_Item(var43)).u3();
            com.aspose.slides.internal.o9b.w1 var45 = ((com.aspose.slides.internal.o9b.w1)var12.get_Item(var43)).u3();
            if (var38 + var42 >= var34 - var36) {
               var51.n5(var44);
               var25.n5(var45);
            }

            com.aspose.slides.internal.x4g.s7 var46 = new com.aspose.slides.internal.x4g.s7();
            com.aspose.slides.internal.o9b.w1[] var47 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
               com.aspose.slides.ms.System.u3.n5(
                  com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), com.aspose.slides.internal.v6g.k5.u3(var42, 13) + 1
               )
            );
            int var48 = 0;

            for (int var49 = com.aspose.slides.internal.v6g.k5.u3(var38, 13);
               var49 <= com.aspose.slides.internal.v6g.k5.u3(var38, 13) + com.aspose.slides.internal.v6g.k5.u3(var42, 13);
               var49++
            ) {
               ((com.aspose.slides.internal.o9b.w1)var11.get_Item(var49 % 360)).n5(var47[var48]);
               var48++;
            }

            var46.n5(var40.u3(), var44.u3());
            var46.n5(var44.u3(), var45.u3());
            com.aspose.slides.internal.o9b.w1[] var74 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
               com.aspose.slides.ms.System.u3.n5(
                  com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), com.aspose.slides.internal.v6g.k5.u3(var42, 13) + 1
               )
            );
            var48 = 0;

            for (int var50 = com.aspose.slides.internal.v6g.k5.u3(var38, 13) + com.aspose.slides.internal.v6g.k5.u3(var42, 13);
               var50 >= com.aspose.slides.internal.v6g.k5.u3(var38, 13);
               var50--
            ) {
               ((com.aspose.slides.internal.o9b.w1)var12.get_Item(var50 % 360)).n5(var74[var48]);
               var48++;
            }

            var46.n5(var45.u3(), var41.u3());
            var46.n5(var41.u3(), var40.u3());
            if (var36 >= 0 && var36 <= 30) {
               if (var38 - var33 <= 30.0F) {
                  var35 = 0.9166667F + 0.5F * ((var38 - var33) / 180.0F);
               } else {
                  var35 = 1.0833334F - 0.5F * ((var38 - var33) / 180.0F);
               }
            } else if (var38 - var33 <= 120.0F) {
               var35 = 0.6666666F + 0.5F * ((var38 - var33) / 180.0F);
            } else {
               var35 = 1.3333334F - 0.5F * ((var38 - var33) / 180.0F);
            }

            if (var35 == 1.0F) {
               var35 -= 0.011111111F;
            }

            var0.n5(var46, var35);
            var38 += var42 - var37;
            var38 += var37;
         }
      }

      com.aspose.slides.internal.o9b.w1[] var66 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var11.size())
      );
      com.aspose.slides.internal.o9b.w1[] var67 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var12.size())
      );

      for (int var69 = 0; var69 <= 360; var69++) {
         ((com.aspose.slides.internal.o9b.w1)var11.get_Item(var69)).n5(var66[var69]);
         ((com.aspose.slides.internal.o9b.w1)var12.get_Item(var69)).n5(var67[var69]);
      }

      com.aspose.slides.internal.x4g.s7 var70 = new com.aspose.slides.internal.x4g.s7();
      var70.u3(var66);
      com.aspose.slides.internal.x4g.s7 var71 = new com.aspose.slides.internal.x4g.s7();
      var71.u3(var67);
      if (var1.p8() != 0) {
         if (var6 > 0.0F) {
            var0.n5(var71, 0.7F);
            var0.n5(var71);
            d0c.n5(var0, var24, var52, var11);
         } else if (var6 < 0.0F) {
            var0.n5(var70, 0.0F);
            var0.n5(var70);
            d0c.n5(var0, var24, var52, var12);
         } else {
            var0.n5(var70, 0.7F);
            var0.n5(var70);
         }
      } else {
         var0.n5(new com.aspose.slides.internal.o9b.w1(var23.l6(), var23.k5()), new com.aspose.slides.internal.o9b.w1(var51.l6(), var51.k5()));
         var0.n5(new com.aspose.slides.internal.o9b.w1(var26.l6(), var26.k5()), new com.aspose.slides.internal.o9b.w1(var25.l6(), var25.k5()));
      }

      if (var6 != 0.0F) {
         var0.n5(new com.aspose.slides.internal.o9b.w1(var23.l6(), var23.k5()), new com.aspose.slides.internal.o9b.w1(var26.l6(), var26.k5()));
         var0.n5(new com.aspose.slides.internal.o9b.w1(var51.l6(), var51.k5()), new com.aspose.slides.internal.o9b.w1(var25.l6(), var25.k5()));
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
               || ((com.aspose.slides.internal.o9b.w1)var6.getValue()).k5() > var1[0].k5()) {
               ((com.aspose.slides.internal.o9b.w1)var6.getValue()).n5(var1[0]);
               var3[0] = (Integer)var6.getKey();
            }

            if (com.aspose.slides.internal.o9b.w1.n5(var2[0], com.aspose.slides.internal.o9b.w1.n5)
               || ((com.aspose.slides.internal.o9b.w1)var6.getValue()).k5() < var2[0].k5()) {
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
}
