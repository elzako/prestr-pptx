package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class v3 extends com.aspose.slides.internal.v6g.h0<v3> {
   public v3() {
   }

   static void n5(float var0, double var1, int var3, n1g var4) {
      if (var3 >= 2) {
         List var5 = var4.y4();
         l5 var6 = var4.m1();
         if (var4.q0().c8().getCategoryAxisType() == 1) {
            n5(var0, var1, var4);
         } else {
            float var7 = var4.j5() / 100.0F;
            float var8 = (var4.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F;
            List var9 = new List();
            int var10 = 0;
            boolean var11 = var4.q0().a0() || var4.n3().hasDataTable();
            if (var11) {
               var10 = var3;
            } else {
               var10 = var3 - 1;
               if (var10 == 0) {
                  var10 = 1;
               }
            }

            float var12 = var4.e5().u3() / var10;
            float var13 = var12 * var7 / (1.0F + var8);
            List var14 = new List();
            List var15 = var5;
            if (var4.p8() >= 0 && var4.p8() < 90 || var4.p8() >= 180 && var4.p8() < 270) {
               for (int var35 = 0; var35 < var15.size(); var35++) {
                  int var36 = var15.size() - 1 - var35;
                  if (var4.p8() >= 180 && var4.p8() < 270) {
                     var36 = var15.size() - 1 - var36;
                  }

                  if (var4.m3().c8().isPlotOrderReversed()) {
                     var36 = var15.size() - 1 - var36;
                  }

                  g3y var37 = (g3y)var15.get_Item(var36);
                  int var38 = var37.l6();
                  List var39 = var37.c8();
                  t9z var40 = null;

                  for (int var41 = 0; var41 < var3; var41++) {
                     int var42 = var41;
                     if (var4.p8() >= 180 && var4.p8() < 270) {
                        var42 = var3 - 1 - var42;
                     }

                     float var44 = var12 * var42;
                     var44 = var4.e5().l6() + var44;
                     if (var11) {
                        var44 += var12 / 2.0F;
                     }

                     int var46 = var42;
                     if (var4.q0().c8().isPlotOrderReversed()) {
                        var46 = var3 - 1 - var42;
                     }

                     t9z var47 = (t9z)var39.get_Item(var46);
                     double var48 = 0.0;
                     if (var47 != null && !var47.c8()) {
                        var48 = var47.n5();
                        var40 = var47;
                     }

                     float var49 = (float)(var1 - var48) / (float)(var6.z3() - var6.q0()) * var4.e5().a6();
                     if (var4.m1().c8().isPlotOrderReversed()) {
                        var49 = -var49;
                     }

                     com.aspose.slides.internal.o9b.w1[] var50 = d0c.n5(var0, 0.0F, var44, var13, var38 + 1, var15.size(), var4);
                     var14.addItem(var50);
                     com.aspose.slides.internal.o9b.w1[] var51 = d0c.n5(var0, var49, var44, var13, var38 + 1, var15.size(), var4);
                     var14.addItem(var51);
                     if (var47 != null && !var47.c8()) {
                        com.aspose.slides.internal.o9b.w1 var52 = new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F);
                        if (var4.p8() >= 90 && var4.p8() < 270) {
                           var52.n5((var50[1].l6() + var51[1].l6()) / 2.0F);
                           var52.l6((var50[1].k5() + var51[1].k5()) / 2.0F);
                        } else {
                           var52.n5((var50[0].l6() + var51[0].l6()) / 2.0F);
                           var52.l6((var50[0].k5() + var51[0].k5()) / 2.0F);
                        }

                        v2o var53 = new v2o(var38, var46, var52.u3());
                        var9.addItem(var53);
                     } else {
                        var14.addItem(null);
                     }
                  }

                  n5(var4, var40, var14);
                  var14.clear();
                  d0c.n5(var9, var4);
                  var9.clear();
               }
            } else if (var4.p8() >= 90 && var4.p8() < 180 || var4.p8() >= 270 && var4.p8() < 360) {
               for (int var16 = 0; var16 < var15.size(); var16++) {
                  int var17 = var16;
                  if (var4.p8() >= 270 && var4.p8() < 360) {
                     var17 = var15.size() - 1 - var17;
                  }

                  if (var4.m3().c8().isPlotOrderReversed()) {
                     var17 = var15.size() - 1 - var17;
                  }

                  g3y var18 = (g3y)var15.get_Item(var17);
                  int var19 = var18.l6();
                  List var20 = var18.c8();
                  t9z var21 = null;

                  for (int var22 = 0; var22 < var3; var22++) {
                     int var23 = var22;
                     if (var4.p8() >= 270 && var4.p8() < 360) {
                        var23 = var3 - 1 - var23;
                     }

                     float var24 = var12 * var23;
                     var24 = var4.e5().l6() + var24;
                     if (var11) {
                        var24 += var12 / 2.0F;
                     }

                     int var25 = var23;
                     if (var4.q0().c8().isPlotOrderReversed()) {
                        var25 = var3 - 1 - var23;
                     }

                     t9z var26 = (t9z)var20.get_Item(var25);
                     double var27 = var26.n5();
                     if (var26 != null && !var26.c8()) {
                        var27 = var26.n5();
                        var21 = var26;
                     }

                     float var29 = (float)(var1 - var27) / (float)(var6.z3() - var6.q0()) * var4.e5().a6();
                     if (var4.m1().c8().isPlotOrderReversed()) {
                        var29 = -var29;
                     }

                     com.aspose.slides.internal.o9b.w1[] var30 = d0c.n5(var0, 0.0F, var24, var13, var19 + 1, var15.size(), var4);
                     var14.addItem(var30);
                     com.aspose.slides.internal.o9b.w1[] var31 = d0c.n5(var0, var29, var24, var13, var19 + 1, var15.size(), var4);
                     var14.addItem(var31);
                     if (var26 != null && !var26.c8()) {
                        com.aspose.slides.internal.o9b.w1 var32 = new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F);
                        if (var4.p8() >= 90 && var4.p8() < 270) {
                           var32.n5((var30[1].l6() + var31[1].l6()) / 2.0F);
                           var32.l6((var30[1].k5() + var31[1].k5()) / 2.0F);
                        } else {
                           var32.n5((var30[0].l6() + var31[0].l6()) / 2.0F);
                           var32.l6((var30[0].k5() + var31[0].k5()) / 2.0F);
                        }

                        v2o var33 = new v2o(var19, var25, var32.u3());
                        var9.addItem(var33);
                     } else {
                        var14.addItem(null);
                     }
                  }

                  n5(var4, var21, var14);
                  var14.clear();
                  d0c.n5(var9, var4);
                  var9.clear();
               }
            }
         }
      }
   }

   private static void n5(float var0, double var1, n1g var3) {
      List var4 = var3.y4();
      l5 var5 = var3.q0();
      l5 var6 = var3.m1();
      float var7 = var3.j5() / 100.0F;
      float var8 = (var3.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F;
      List var9 = new List();
      int var10 = var5.c8().getBaseUnitScale();
      boolean var11 = var3.q0().a0() || var3.n3().hasDataTable();
      int var12 = var3.q0().d5();
      float var13 = var3.e5().u3() / var12;
      float var14 = var13 * var7 / (1.0F + var8);
      List var15 = new List();
      List var16 = var4;
      List var17 = o9b.n5(var3.l6(), false);
      int var18 = var17.size();
      if (var3.p8() >= 0 && var3.p8() < 90 || var3.p8() >= 180 && var3.p8() < 270) {
         for (int var40 = 0; var40 < var16.size(); var40++) {
            int var41 = var16.size() - 1 - var40;
            if (var3.p8() >= 180 && var3.p8() < 270) {
               var41 = var16.size() - 1 - var41;
            }

            if (var3.m3().c8().isPlotOrderReversed()) {
               var41 = var16.size() - 1 - var41;
            }

            g3y var42 = (g3y)var16.get_Item(var41);
            int var43 = var42.l6();
            List var44 = var42.c8();
            t9z var45 = null;

            for (int var46 = 0; var46 < var18; var46++) {
               int var47 = var46;
               if (var3.p8() >= 180 && var3.p8() < 270) {
                  var47 = var18 - 1 - var47;
               }

               int var49 = (Integer)var17.get_Item(var47);
               var49 = p4.n5(var10, var49, false);
               int var51 = p4.n5(var10, var49, com.aspose.slides.internal.v6g.k5.u3(var5.q0(), 14), com.aspose.slides.internal.v6g.k5.u3(var5.z3(), 14), false);
               float var52 = var13 * var51;
               float var53 = var3.e5().l6() + var52;
               if (var11) {
                  var53 += var13 / 2.0F;
               }

               int var54 = var47;
               if (var3.q0().c8().isPlotOrderReversed()) {
                  var54 = var18 - 1 - var47;
               }

               t9z var55 = (t9z)var44.get_Item(var54);
               double var56 = 0.0;
               if (var55 != null && !var55.c8()) {
                  var56 = var55.n5();
                  var45 = var55;
               }

               float var57 = (float)(var1 - var56) / (float)(var6.z3() - var6.q0()) * var3.e5().a6();
               if (var3.m1().c8().isPlotOrderReversed()) {
                  var57 = -var57;
               }

               com.aspose.slides.internal.o9b.w1[] var58 = d0c.n5(var0, 0.0F, var53, var14, var43 + 1, var16.size(), var3);
               var15.addItem(var58);
               com.aspose.slides.internal.o9b.w1[] var59 = d0c.n5(var0, var57, var53, var14, var43 + 1, var16.size(), var3);
               var15.addItem(var59);
               if (var55 != null && !var55.c8()) {
                  com.aspose.slides.internal.o9b.w1 var60 = new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F);
                  if (var3.p8() >= 90 && var3.p8() < 270) {
                     var60.n5((var58[1].l6() + var59[1].l6()) / 2.0F);
                     var60.l6((var58[1].k5() + var59[1].k5()) / 2.0F);
                  } else {
                     var60.n5((var58[0].l6() + var59[0].l6()) / 2.0F);
                     var60.l6((var58[0].k5() + var59[0].k5()) / 2.0F);
                  }

                  v2o var61 = new v2o(var43, var54, var60.u3());
                  var9.addItem(var61);
               } else {
                  var15.addItem(null);
               }
            }

            n5(var3, var45, var15);
            var15.clear();
            d0c.n5(var9, var3);
            var9.clear();
         }
      } else if (var3.p8() >= 90 && var3.p8() < 180 || var3.p8() >= 270 && var3.p8() < 360) {
         for (int var19 = 0; var19 < var16.size(); var19++) {
            int var20 = var19;
            if (var3.p8() >= 270 && var3.p8() < 360) {
               var20 = var16.size() - 1 - var20;
            }

            if (var3.m3().c8().isPlotOrderReversed()) {
               var20 = var16.size() - 1 - var20;
            }

            g3y var21 = (g3y)var16.get_Item(var20);
            int var22 = var21.l6();
            List var23 = var21.c8();
            t9z var24 = null;

            for (int var25 = 0; var25 < var18; var25++) {
               int var26 = var25;
               if (var3.p8() >= 270 && var3.p8() < 360) {
                  var26 = var18 - 1 - var26;
               }

               int var27 = (Integer)var17.get_Item(var26);
               var27 = p4.n5(var10, var27, false);
               int var28 = p4.n5(var10, var27, com.aspose.slides.internal.v6g.k5.u3(var5.q0(), 14), com.aspose.slides.internal.v6g.k5.u3(var5.z3(), 14), false);
               float var29 = var13 * var28;
               float var30 = var3.e5().l6() + var29;
               if (var11) {
                  var30 += var13 / 2.0F;
               }

               int var31 = var26;
               if (var3.q0().c8().isPlotOrderReversed()) {
                  var31 = var18 - 1 - var26;
               }

               t9z var32 = (t9z)var23.get_Item(var31);
               double var33 = var32.n5();
               if (var32 != null && !var32.c8()) {
                  var33 = var32.n5();
                  var24 = var32;
               }

               float var35 = (float)(var1 - var33) / (float)(var6.z3() - var6.q0()) * var3.e5().a6();
               if (var3.m1().c8().isPlotOrderReversed()) {
                  var35 = -var35;
               }

               com.aspose.slides.internal.o9b.w1[] var36 = d0c.n5(var0, 0.0F, var30, var14, var22 + 1, var16.size(), var3);
               var15.addItem(var36);
               com.aspose.slides.internal.o9b.w1[] var37 = d0c.n5(var0, var35, var30, var14, var22 + 1, var16.size(), var3);
               var15.addItem(var37);
               if (var32 != null && !var32.c8()) {
                  com.aspose.slides.internal.o9b.w1 var38 = new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F);
                  if (var3.p8() >= 90 && var3.p8() < 270) {
                     var38.n5((var36[1].l6() + var37[1].l6()) / 2.0F);
                     var38.l6((var36[1].k5() + var37[1].k5()) / 2.0F);
                  } else {
                     var38.n5((var36[0].l6() + var37[0].l6()) / 2.0F);
                     var38.l6((var36[0].k5() + var37[0].k5()) / 2.0F);
                  }

                  v2o var39 = new v2o(var22, var31, var38.u3());
                  var9.addItem(var39);
               } else {
                  var15.addItem(null);
               }
            }

            n5(var3, var24, var15);
            var15.clear();
            d0c.n5(var9, var3);
            var9.clear();
         }
      }
   }

   static void n5(float var0, double var1, int var3, boolean var4, n1g var5) {
      if (var3 >= 2) {
         List var6 = var5.y4();
         l5 var7 = var5.m1();
         if (var5.q0().c8().getCategoryAxisType() == 1) {
            n5(var0, var1, var4, var5);
         } else {
            float var8 = var5.j5() / 100.0F;
            float var9 = (var5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F;
            float var10 = 0.0F;
            if (!var5.m1().c8().isPlotOrderReversed()) {
               var10 = var5.e5().k5() - var5.e5().a6() + (float)var7.z3() / (float)(var7.z3() - var7.q0()) * var5.e5().a6();
            } else {
               var10 = var5.e5().k5() - (float)var7.z3() / (float)(var7.z3() - var7.q0()) * var5.e5().a6();
            }

            List var11 = new List();
            int var12 = 0;
            boolean var13 = var5.q0().a0() || var5.n3().hasDataTable();
            if (var13) {
               var12 = var3;
            } else {
               var12 = var3 - 1;
               if (var12 == 0) {
                  var12 = 1;
               }
            }

            float var14 = var5.e5().u3() / var12;
            float var15 = var14 * var8 / (1.0F + var9);
            List var16 = new List();
            List var17 = new List();

            for (int var18 = 0; var18 < var3; var18++) {
               float var19 = var5.e5().l6() + var14 * var18;
               if (var13) {
                  var19 += var14 / 2.0F;
               }

               com.aspose.slides.internal.o9b.w1[] var20 = n5(var5, var19, var15, var0);
               var17.addItem(var20);
            }

            var16.addItem(var17);
            List var48 = var6;
            t9z[] var49 = new t9z[var48.size()];
            List var50 = null;

            for (int var21 = 0; var21 < var48.size(); var21++) {
               g3y var22 = (g3y)var48.get_Item(var21);
               int var23 = var22.l6();
               int var24 = var21;
               List var25 = var22.c8();
               List var26 = new List();
               if (var21 == 0) {
                  var50 = var17;
               }

               for (int var27 = 0; var27 < var3; var27++) {
                  int var28 = var27;
                  float var29 = var14 * var28;
                  var29 = var5.e5().l6() + var29;
                  if (var13) {
                     var29 += var14 / 2.0F;
                  }

                  int var30 = var28;
                  if (var5.q0().c8().isPlotOrderReversed()) {
                     var30 = var3 - 1 - var28;
                  }

                  t9z var31 = (t9z)var25.get_Item(var30);
                  double var32 = 0.0;
                  double var34 = 0.0;
                  double var36 = 0.0;
                  if (var31 != null && !var31.c8()) {
                     var49[var21] = var31;
                     var32 = var31.n5();
                     var34 = var32;

                     for (int var38 = 0; var38 < var24; var38++) {
                        t9z var39 = ((g3y)var48.get_Item(var38)).c8().get_Item(var30);
                        if (var39 != null) {
                           double var40 = var39.n5();
                           var34 += var40;
                        }
                     }
                  }

                  for (int var53 = 0; var53 < var48.size(); var53++) {
                     t9z var55 = ((g3y)var48.get_Item(var53)).c8().get_Item(var30);
                     if (var55 != null) {
                        double var57 = var55.n5();
                        var36 += com.aspose.slides.ms.System.q1.n5(var57);
                     }
                  }

                  float var54;
                  if (!var4) {
                     var54 = (float)com.aspose.slides.ms.System.q1.n5(var34) / (float)(var7.z3() - var7.q0()) * var5.e5().a6();
                  } else {
                     if (var36 == 0.0) {
                        continue;
                     }

                     var54 = (float)com.aspose.slides.ms.System.q1.n5(var34) * 100.0F / (float)var36 / (float)(var7.z3() - var7.q0()) * var5.e5().a6();
                  }

                  float var56;
                  if (!var5.m1().c8().isPlotOrderReversed()) {
                     if (var34 <= 0.0) {
                        var56 = var10 + var54;
                     } else {
                        var56 = var10 - var54;
                     }
                  } else if (var34 <= 0.0) {
                     var56 = var10 - var54;
                  } else {
                     var56 = var10 + var54;
                  }

                  com.aspose.slides.internal.o9b.w1[] var42 = n5(var5, var29, var15, var56);
                  var26.addItem(var42);
                  if (var31 != null && !var31.c8()) {
                     com.aspose.slides.internal.o9b.w1 var43 = new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F);
                     com.aspose.slides.internal.o9b.w1[] var44 = (com.aspose.slides.internal.o9b.w1[])var50.get_Item(var28);
                     if (var5.p8() >= 90 && var5.p8() < 270) {
                        var43.n5(var42[1].l6());
                        var43.l6((var44[1].k5() + var42[1].k5()) / 2.0F);
                     } else {
                        var43.n5(var42[0].l6());
                        var43.l6((var44[0].k5() + var42[0].k5()) / 2.0F);
                     }

                     v2o var45 = new v2o(var23, var30, var43.u3());
                     var11.addItem(var45);
                  }
               }

               var16.addItem(var26);
               var50 = var26;
            }

            n5(var49, var16, var5);
            d0c.n5(var11, var5);
         }
      }
   }

   static void n5(float var0, double var1, boolean var3, n1g var4) {
      List var5 = var4.y4();
      l5 var6 = var4.m1();
      l5 var7 = var4.q0();
      float var8 = var4.j5() / 100.0F;
      float var9 = (var4.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F;
      float var10 = 0.0F;
      if (!var4.m1().c8().isPlotOrderReversed()) {
         var10 = var4.e5().k5() - var4.e5().a6() + (float)var6.z3() / (float)(var6.z3() - var6.q0()) * var4.e5().a6();
      } else {
         var10 = var4.e5().k5() - (float)var6.z3() / (float)(var6.z3() - var6.q0()) * var4.e5().a6();
      }

      List var11 = new List();
      int var12 = var7.c8().getBaseUnitScale();
      boolean var13 = var4.q0().a0() || var4.n3().hasDataTable();
      int var14 = var4.q0().d5();
      float var15 = var4.e5().u3() / var14;
      float var16 = var15 * var8 / (1.0F + var9);
      List var17 = o9b.n5(var4.l6(), false);
      int var18 = var17.size();
      List var19 = new List();
      List var20 = new List();

      for (int var21 = 0; var21 < var18; var21++) {
         int var22 = (Integer)var17.get_Item(var21);
         var22 = p4.n5(var12, var22, false);
         int var23 = p4.n5(var12, var22, com.aspose.slides.internal.v6g.k5.u3(var7.q0(), 14), com.aspose.slides.internal.v6g.k5.u3(var7.z3(), 14), false);
         float var24 = var15 * var23;
         float var25 = var4.e5().l6() + var24;
         if (var13) {
            var25 += var15 / 2.0F;
         }

         com.aspose.slides.internal.o9b.w1[] var26 = n5(var4, var25, var16, var0);
         var20.addItem(var26);
      }

      var19.addItem(var20);
      List var53 = var5;
      t9z[] var55 = new t9z[var53.size()];
      List var56 = null;

      for (int var57 = 0; var57 < var53.size(); var57++) {
         g3y var58 = (g3y)var53.get_Item(var57);
         int var59 = var58.l6();
         int var27 = var57;
         List var28 = var58.c8();
         List var29 = new List();
         if (var57 == 0) {
            var56 = var20;
         }

         for (int var30 = 0; var30 < var18; var30++) {
            int var31 = var30;
            int var32 = (Integer)var17.get_Item(var31);
            var32 = p4.n5(var12, var32, false);
            int var33 = p4.n5(var12, var32, com.aspose.slides.internal.v6g.k5.u3(var7.q0(), 14), com.aspose.slides.internal.v6g.k5.u3(var7.z3(), 14), false);
            float var34 = var15 * var33;
            float var35 = var4.e5().l6() + var34;
            if (var13) {
               var35 += var15 / 2.0F;
            }

            int var36 = var31;
            if (var4.q0().c8().isPlotOrderReversed()) {
               var36 = var18 - 1 - var31;
            }

            t9z var37 = (t9z)var28.get_Item(var36);
            double var38 = 0.0;
            double var40 = 0.0;
            double var42 = 0.0;
            if (var37 != null && !var37.c8()) {
               var55[var57] = var37;
               var38 = var37.n5();
               var40 = var38;

               for (int var44 = 0; var44 < var27; var44++) {
                  t9z var45 = ((g3y)var53.get_Item(var44)).c8().get_Item(var36);
                  if (var45 != null) {
                     double var46 = var45.n5();
                     var40 += var46;
                  }
               }
            }

            for (int var62 = 0; var62 < var53.size(); var62++) {
               t9z var64 = ((g3y)var53.get_Item(var62)).c8().get_Item(var36);
               if (var64 != null && !var37.c8()) {
                  double var66 = var64.n5();
                  var42 += com.aspose.slides.ms.System.q1.n5(var66);
               }
            }

            float var63;
            if (!var3) {
               var63 = (float)com.aspose.slides.ms.System.q1.n5(var40) / (float)(var6.z3() - var6.q0()) * var4.e5().a6();
            } else {
               if (var42 == 0.0) {
                  continue;
               }

               var63 = (float)com.aspose.slides.ms.System.q1.n5(var40) * 100.0F / (float)var42 / (float)(var6.z3() - var6.q0()) * var4.e5().a6();
            }

            float var65;
            if (!var4.m1().c8().isPlotOrderReversed()) {
               if (var40 <= 0.0) {
                  var65 = var10 + var63;
               } else {
                  var65 = var10 - var63;
               }
            } else if (var40 <= 0.0) {
               var65 = var10 - var63;
            } else {
               var65 = var10 + var63;
            }

            com.aspose.slides.internal.o9b.w1[] var48 = n5(var4, var35, var16, var65);
            var29.addItem(var48);
            if (var37 != null && !var37.c8()) {
               com.aspose.slides.internal.o9b.w1 var49 = new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F);
               com.aspose.slides.internal.o9b.w1[] var50 = com.aspose.slides.internal.v6g.k5.k5(
                  var56.get_Item(var31), com.aspose.slides.internal.o9b.w1[].class
               );
               if (var4.p8() >= 90 && var4.p8() < 270) {
                  var49.n5(var48[1].l6());
                  var49.l6((var50[1].k5() + var48[1].k5()) / 2.0F);
               } else {
                  var49.n5(var48[0].l6());
                  var49.l6((var50[0].k5() + var48[0].k5()) / 2.0F);
               }

               v2o var51 = new v2o(var59, var36, var49.u3());
               var11.addItem(var51);
            }
         }

         var56 = var29;
         var19.addItem(var29);
      }

      n5(var55, var19, var4);
      d0c.n5(var11, var4);
   }

   private static void n5(n1g var0, t9z var1, List<com.aspose.slides.internal.o9b.w1[]> var2) {
      if (var2.size() >= 4 && var1 != null) {
         int var3 = var2.size() / 2;
         com.aspose.slides.internal.o9b.w1[] var4 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var3)
         );
         com.aspose.slides.internal.o9b.w1[] var5 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var3)
         );
         com.aspose.slides.internal.o9b.w1[] var6 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var3)
         );
         com.aspose.slides.internal.o9b.w1[] var7 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var3)
         );

         for (int var8 = 0; var8 < var2.size(); var8 += 2) {
            com.aspose.slides.internal.o9b.w1[] var9 = (com.aspose.slides.internal.o9b.w1[])var2.get_Item(var8);
            com.aspose.slides.internal.o9b.w1[] var10 = (com.aspose.slides.internal.o9b.w1[])var2.get_Item(var8 + 1);
            var9[0].n5(var4[var8 / 2]);
            var9[1].n5(var5[var8 / 2]);
            var10[0].n5(var6[var8 / 2]);
            var10[1].n5(var7[var8 / 2]);
         }

         for (int var16 = 1; var16 < var3; var16++) {
            com.aspose.slides.internal.o9b.w1[] var17 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
               com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 8)
            );
            com.aspose.slides.internal.o9b.w1 var18 = new com.aspose.slides.internal.o9b.w1();
            com.aspose.slides.internal.o9b.w1 var11 = new com.aspose.slides.internal.o9b.w1();
            com.aspose.slides.internal.o9b.w1[] var12 = new com.aspose.slides.internal.o9b.w1[]{var18};
            boolean var13 = n5(var4[var16 - 1].u3(), var4[var16].u3(), var6[var16 - 1].u3(), var6[var16].u3(), var12);
            var12[0].n5(var18);
            if (var13) {
               com.aspose.slides.internal.o9b.w1[] var14 = new com.aspose.slides.internal.o9b.w1[]{var11};
               boolean var15 = n5(var5[var16 - 1].u3(), var5[var16].u3(), var7[var16 - 1].u3(), var7[var16].u3(), var14);
               var14[0].n5(var11);
               if (var15) {
                  var4[var16 - 1].n5(var17[0]);
                  var18.n5(var17[1]);
                  var11.n5(var17[2]);
                  var5[var16 - 1].n5(var17[3]);
                  var6[var16 - 1].n5(var17[4]);
                  var18.n5(var17[5]);
                  var11.n5(var17[6]);
                  var7[var16 - 1].n5(var17[7]);
                  n5(var0, var1, var17);
                  var18.n5(var17[0]);
                  var4[var16].n5(var17[1]);
                  var5[var16].n5(var17[2]);
                  var11.n5(var17[3]);
                  var18.n5(var17[4]);
                  var6[var16].n5(var17[5]);
                  var7[var16].n5(var17[6]);
                  var11.n5(var17[7]);
                  n5(var0, var1, var17);
               }
            } else {
               var4[var16 - 1].n5(var17[0]);
               var4[var16].n5(var17[1]);
               var5[var16].n5(var17[2]);
               var5[var16 - 1].n5(var17[3]);
               var6[var16 - 1].n5(var17[4]);
               var6[var16].n5(var17[5]);
               var7[var16].n5(var17[6]);
               var7[var16 - 1].n5(var17[7]);
               n5(var0, var1, var17);
            }
         }

         n5(var0, var1, var4, var5, var6, var7);
      }
   }

   private static boolean n5(
      com.aspose.slides.internal.o9b.w1 var0,
      com.aspose.slides.internal.o9b.w1 var1,
      com.aspose.slides.internal.o9b.w1 var2,
      com.aspose.slides.internal.o9b.w1 var3,
      com.aspose.slides.internal.o9b.w1[] var4
   ) {
      var4[0] = new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F);
      if (var0.l6() != var1.l6() && var2.l6() != var3.l6()) {
         float var5 = (var0.k5() - var1.k5()) / (var0.l6() - var1.l6());
         float var6 = var0.k5() - var5 * var0.l6();
         float var7 = (var2.k5() - var3.k5()) / (var2.l6() - var3.l6());
         float var8 = var2.k5() - var7 * var2.l6();
         if (var5 == var7) {
            return false;
         }

         var4[0].n5((var8 - var6) / (var5 - var7));
         var4[0].l6(var5 * var4[0].l6() + var6);
         return var0.l6() < var4[0].l6() && var1.l6() > var4[0].l6() && var2.l6() < var4[0].l6() && var3.l6() > var4[0].l6()
            || var0.l6() > var4[0].l6() && var1.l6() < var4[0].l6() && var2.l6() > var4[0].l6() && var3.l6() < var4[0].l6();
      } else {
         return false;
      }
   }

   private static void n5(n1g var0, t9z var1, com.aspose.slides.internal.o9b.w1[] var2) {
      com.aspose.slides.internal.x4g.s7 var3 = new com.aspose.slides.internal.x4g.s7();
      var3.k5(var2);
      boolean var4 = var2[0].k5() + var2[1].k5() + var2[2].k5() + var2[3].k5() > var2[4].k5() + var2[5].k5() + var2[6].k5() + var2[7].k5();
      if (var0.s3() > 0) {
         if (var4) {
            com.aspose.slides.internal.x4g.s7 var5 = new com.aspose.slides.internal.x4g.s7();
            var5.k5(new com.aspose.slides.internal.o9b.w1[]{var2[0], var2[1], var2[2], var2[3]});
            var1.n5(var5, 0.6666667F);
            var1.n5(var5);
            com.aspose.slides.internal.x4g.s7 var6 = new com.aspose.slides.internal.x4g.s7();
            var6.k5(new com.aspose.slides.internal.o9b.w1[]{var2[4], var2[5], var2[6], var2[7]});
            var1.n5(var6, 0.6666667F);
            var1.n5(var6);
         } else {
            com.aspose.slides.internal.x4g.s7 var7 = new com.aspose.slides.internal.x4g.s7();
            var7.k5(new com.aspose.slides.internal.o9b.w1[]{var2[4], var2[5], var2[6], var2[7]});
            var1.n5(var7, 0.6666667F);
            var1.n5(var7);
            com.aspose.slides.internal.x4g.s7 var14 = new com.aspose.slides.internal.x4g.s7();
            var14.k5(new com.aspose.slides.internal.o9b.w1[]{var2[0], var2[1], var2[2], var2[3]});
            var1.n5(var14, 0.6666667F);
            var1.n5(var14);
         }
      } else if (!var4) {
         com.aspose.slides.internal.x4g.s7 var8 = new com.aspose.slides.internal.x4g.s7();
         var8.k5(new com.aspose.slides.internal.o9b.w1[]{var2[0], var2[1], var2[2], var2[3]});
         var1.n5(var8, 0.6666667F);
         var1.n5(var8);
         com.aspose.slides.internal.x4g.s7 var15 = new com.aspose.slides.internal.x4g.s7();
         var15.k5(new com.aspose.slides.internal.o9b.w1[]{var2[4], var2[5], var2[6], var2[7]});
         var1.n5(var15, 0.6666667F);
         var1.n5(var15);
      } else {
         com.aspose.slides.internal.x4g.s7 var9 = new com.aspose.slides.internal.x4g.s7();
         var9.k5(new com.aspose.slides.internal.o9b.w1[]{var2[4], var2[5], var2[6], var2[7]});
         var1.n5(var9, 0.6666667F);
         var1.n5(var9);
         com.aspose.slides.internal.x4g.s7 var16 = new com.aspose.slides.internal.x4g.s7();
         var16.k5(new com.aspose.slides.internal.o9b.w1[]{var2[0], var2[1], var2[2], var2[3]});
         var1.n5(var16, 0.6666667F);
         var1.n5(var16);
      }

      if (var0.p8() <= 90 || var0.p8() == 360) {
         com.aspose.slides.internal.x4g.s7 var13 = new com.aspose.slides.internal.x4g.s7();
         var13.k5(new com.aspose.slides.internal.o9b.w1[]{var2[1], var2[2], var2[6], var2[5]});
         var1.n5(var13, 0.5F);
         var1.n5(var13);
      } else if (var0.p8() > 90 && var0.p8() <= 180) {
         com.aspose.slides.internal.x4g.s7 var12 = new com.aspose.slides.internal.x4g.s7();
         var12.k5(new com.aspose.slides.internal.o9b.w1[]{var2[1], var2[2], var2[6], var2[5]});
         var1.n5(var12, 0.5F);
         var1.n5(var12);
      } else if (var0.p8() > 180 && var0.p8() <= 270) {
         com.aspose.slides.internal.x4g.s7 var11 = new com.aspose.slides.internal.x4g.s7();
         var11.k5(new com.aspose.slides.internal.o9b.w1[]{var2[1], var2[2], var2[6], var2[5]});
         var1.n5(var11, 0.5F);
         var1.n5(var11);
      } else if (var0.p8() > 270 && var0.p8() < 360) {
         com.aspose.slides.internal.x4g.s7 var10 = new com.aspose.slides.internal.x4g.s7();
         var10.k5(new com.aspose.slides.internal.o9b.w1[]{var2[1], var2[2], var2[6], var2[5]});
         var1.n5(var10, 0.5F);
         var1.n5(var10);
      }
   }

   private static void n5(
      n1g var0,
      t9z var1,
      com.aspose.slides.internal.o9b.w1[] var2,
      com.aspose.slides.internal.o9b.w1[] var3,
      com.aspose.slides.internal.o9b.w1[] var4,
      com.aspose.slides.internal.o9b.w1[] var5
   ) {
      if (var0.p8() <= 90 || var0.p8() == 360 || var0.p8() > 270 && var0.p8() < 360) {
         com.aspose.slides.internal.o9b.w1[] var8 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var2.length * 2)
         );

         for (int var10 = 0; var10 < var2.length; var10++) {
            var2[var10].n5(var8[var10]);
            var4[var10].n5(var8[var8.length - 1 - var10]);
         }

         com.aspose.slides.internal.x4g.s7 var11 = new com.aspose.slides.internal.x4g.s7();
         var11.k5(var8);
         var1.k5(var11);
         var1.n5(var11);
      } else if (var0.p8() > 90 && var0.p8() <= 180 || var0.p8() > 180 && var0.p8() <= 270) {
         com.aspose.slides.internal.o9b.w1[] var6 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var3.length * 2)
         );

         for (int var7 = 0; var7 < var3.length; var7++) {
            var3[var7].n5(var6[var7]);
            var5[var7].n5(var6[var6.length - 1 - var7]);
         }

         com.aspose.slides.internal.x4g.s7 var9 = new com.aspose.slides.internal.x4g.s7();
         var9.k5(var6);
         var1.k5(var9);
         var1.n5(var9);
      }
   }

   private static com.aspose.slides.internal.o9b.w1[] n5(n1g var0, float var1, float var2, float var3) {
      com.aspose.slides.internal.o9b.w1[] var4 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 2)
      );
      float var5 = var0.e5().u9();
      if (var1 <= var5) {
         float var6 = 2.0F * (var5 - var1);
         d0c.n5(var0, var3, var6, var2, 0).n5(var4[0]);
         d0c.n5(var0, var3, var6, var2, 3).n5(var4[1]);
      } else {
         float var7 = 2.0F * (var1 - var5);
         d0c.n5(var0, var3, var7, var2, 1).n5(var4[0]);
         d0c.n5(var0, var3, var7, var2, 2).n5(var4[1]);
      }

      return var4;
   }

   private static void n5(t9z[] var0, List<List<com.aspose.slides.internal.o9b.w1[]>> var1, n1g var2) {
      if (var1.size() >= 2) {
         List var3 = (List)var1.get_Item(0);
         if (var1.size() >= 2) {
            List var4 = (List)var1.get_Item(var1.size() - 1);
            com.aspose.slides.internal.o9b.w1[] var5 = null;

            for (int var6 = 1; var6 < var3.size(); var6++) {
               if (var2.s3() >= 0) {
                  int var7 = var1.size() - 1;
                  t9z var8 = var0[var7 - 1];
                  com.aspose.slides.internal.o9b.w1[][] var9 = new com.aspose.slides.internal.o9b.w1[][]{var5};
                  boolean var10 = n5(var4, var3, var6, var9);
                  var5 = var9[0];
                  if (!var2.m1().c8().isPlotOrderReversed()) {
                     if (n5(var4, var3, var6)) {
                        List var11 = (List)var1.get_Item(var7);
                        com.aspose.slides.internal.o9b.w1[] var12 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
                           com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 4)
                        );
                        com.aspose.slides.internal.o9b.w1[] var13 = com.aspose.slides.internal.v6g.k5.k5(
                           var11.get_Item(var6 - 1), com.aspose.slides.internal.o9b.w1[].class
                        );
                        var13[0].n5(var12[0]);
                        var13[1].n5(var12[1]);
                        var13 = (com.aspose.slides.internal.o9b.w1[])var11.get_Item(var6);
                        var13[1].n5(var12[2]);
                        var13[0].n5(var12[3]);
                        com.aspose.slides.internal.x4g.s7 var14 = new com.aspose.slides.internal.x4g.s7();
                        var14.k5(var12);
                        var8.n5(var14, 0.6666667F);
                        var8.n5(var14);
                     }
                  } else if (var10) {
                     List var26 = (List)var1.get_Item(var7);
                     com.aspose.slides.internal.o9b.w1[] var29 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
                        com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 4)
                     );
                     com.aspose.slides.internal.o9b.w1[] var34 = (com.aspose.slides.internal.o9b.w1[])var26.get_Item(var6 - 1);
                     if (var5[0].k5() >= var34[0].k5()) {
                        com.aspose.slides.internal.o9b.w1[] var37 = (com.aspose.slides.internal.o9b.w1[])var3.get_Item(var6 - 1);
                        var37[0].n5(var29[0]);
                        var37[1].n5(var29[1]);
                        var5[1].n5(var29[2]);
                        var5[0].n5(var29[3]);
                        com.aspose.slides.internal.x4g.s7 var15 = new com.aspose.slides.internal.x4g.s7();
                        var15.k5(var29);
                        var8.n5(var15, 0.6666667F);
                        var8.n5(var15);
                     } else {
                        var34[0].n5(var29[0]);
                        var34[1].n5(var29[1]);
                        var5[1].n5(var29[2]);
                        var5[0].n5(var29[3]);
                        com.aspose.slides.internal.x4g.s7 var38 = new com.aspose.slides.internal.x4g.s7();
                        var38.k5(var29);
                        var8.n5(var38, 0.6666667F);
                        var8.n5(var38);
                     }

                     var34 = (com.aspose.slides.internal.o9b.w1[])var26.get_Item(var6);
                     if (var5[0].k5() >= var34[0].k5()) {
                        com.aspose.slides.internal.o9b.w1[] var39 = (com.aspose.slides.internal.o9b.w1[])var3.get_Item(var6);
                        var39[0].n5(var29[0]);
                        var39[1].n5(var29[1]);
                        var5[1].n5(var29[2]);
                        var5[0].n5(var29[3]);
                        com.aspose.slides.internal.x4g.s7 var42 = new com.aspose.slides.internal.x4g.s7();
                        var42.k5(var29);
                        var8.n5(var42, 0.6666667F);
                        var8.n5(var42);
                     } else {
                        var34[0].n5(var29[0]);
                        var34[1].n5(var29[1]);
                        var5[1].n5(var29[2]);
                        var5[0].n5(var29[3]);
                        com.aspose.slides.internal.x4g.s7 var40 = new com.aspose.slides.internal.x4g.s7();
                        var40.k5(var29);
                        var8.n5(var40, 0.6666667F);
                        var8.n5(var40);
                     }
                  }
               }
            }

            for (int var16 = 1; var16 < var1.size(); var16++) {
               t9z var18 = var0[var16 - 1];
               List var20 = (List)var1.get_Item(var16 - 1);
               List var22 = (List)var1.get_Item(var16);
               com.aspose.slides.internal.o9b.w1[] var24;
               com.aspose.slides.internal.o9b.w1[] var27;
               if (var2.p8() <= 180) {
                  var24 = (com.aspose.slides.internal.o9b.w1[])var20.get_Item(var20.size() - 1);
                  var27 = (com.aspose.slides.internal.o9b.w1[])var22.get_Item(var22.size() - 1);
               } else {
                  var24 = (com.aspose.slides.internal.o9b.w1[])var20.get_Item(0);
                  var27 = (com.aspose.slides.internal.o9b.w1[])var22.get_Item(0);
               }

               com.aspose.slides.internal.x4g.s7 var30 = new com.aspose.slides.internal.x4g.s7();
               var30.k5(new com.aspose.slides.internal.o9b.w1[]{var24[0], var24[1], var27[1], var27[0]});
               var18.n5(var30, 0.5F);
               var18.n5(var30);
            }

            for (int var17 = 1; var17 < var1.size(); var17++) {
               t9z var19 = var0[var17 - 1];
               List var21 = (List)var1.get_Item(var17 - 1);
               List var23 = (List)var1.get_Item(var17);
               int var25 = var23.size() * 2;
               com.aspose.slides.internal.o9b.w1[] var28 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
                  com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var25)
               );

               for (int var31 = 0; var31 < var21.size(); var31++) {
                  com.aspose.slides.internal.o9b.w1[] var36 = (com.aspose.slides.internal.o9b.w1[])var21.get_Item(var31);
                  com.aspose.slides.internal.o9b.w1[] var41 = (com.aspose.slides.internal.o9b.w1[])var23.get_Item(var31);
                  if (var2.p8() > 90 && var2.p8() != 360 && (var2.p8() <= 270 || var2.p8() >= 360)) {
                     var36[1].n5(var28[var31]);
                     var41[1].n5(var28[var25 - var31 - 1]);
                  } else {
                     var36[0].n5(var28[var31]);
                     var41[0].n5(var28[var25 - var31 - 1]);
                  }
               }

               com.aspose.slides.internal.x4g.s7 var32 = new com.aspose.slides.internal.x4g.s7();
               var32.k5(var28);
               var19.k5(var32);
               var19.n5(var32);
            }
         }
      }
   }

   private static boolean n5(List<com.aspose.slides.internal.o9b.w1[]> var0, List<com.aspose.slides.internal.o9b.w1[]> var1, int var2) {
      com.aspose.slides.internal.o9b.w1 var3 = ((com.aspose.slides.internal.o9b.w1[])var0.get_Item(var2 - 1))[0].u3();
      com.aspose.slides.internal.o9b.w1 var4 = ((com.aspose.slides.internal.o9b.w1[])var0.get_Item(var2))[0].u3();
      com.aspose.slides.internal.o9b.w1 var5 = ((com.aspose.slides.internal.o9b.w1[])var1.get_Item(var2 - 1))[0].u3();
      com.aspose.slides.internal.o9b.w1 var6 = ((com.aspose.slides.internal.o9b.w1[])var1.get_Item(var2))[0].u3();
      return var3.k5() < var5.k5() && var4.k5() < var6.k5();
   }

   private static boolean n5(
      List<com.aspose.slides.internal.o9b.w1[]> var0, List<com.aspose.slides.internal.o9b.w1[]> var1, int var2, com.aspose.slides.internal.o9b.w1[][] var3
   ) {
      com.aspose.slides.internal.o9b.w1 var4 = ((com.aspose.slides.internal.o9b.w1[])var0.get_Item(var2 - 1))[0].u3();
      com.aspose.slides.internal.o9b.w1 var5 = ((com.aspose.slides.internal.o9b.w1[])var0.get_Item(var2))[0].u3();
      com.aspose.slides.internal.o9b.w1 var6 = ((com.aspose.slides.internal.o9b.w1[])var1.get_Item(var2 - 1))[0].u3();
      com.aspose.slides.internal.o9b.w1 var7 = ((com.aspose.slides.internal.o9b.w1[])var1.get_Item(var2))[0].u3();
      com.aspose.slides.internal.o9b.w1 var8 = new com.aspose.slides.internal.o9b.w1();
      com.aspose.slides.internal.o9b.w1 var9 = new com.aspose.slides.internal.o9b.w1();
      com.aspose.slides.internal.o9b.w1[] var10 = new com.aspose.slides.internal.o9b.w1[]{var8};
      boolean var11 = n5(var4.u3(), var5.u3(), var6.u3(), var7.u3(), var10);
      var10[0].n5(var8);
      ((com.aspose.slides.internal.o9b.w1[])var0.get_Item(var2 - 1))[1].n5(var4);
      ((com.aspose.slides.internal.o9b.w1[])var0.get_Item(var2))[1].n5(var5);
      ((com.aspose.slides.internal.o9b.w1[])var1.get_Item(var2 - 1))[1].n5(var6);
      ((com.aspose.slides.internal.o9b.w1[])var1.get_Item(var2))[1].n5(var7);
      com.aspose.slides.internal.o9b.w1[] var12 = new com.aspose.slides.internal.o9b.w1[]{var9};
      boolean var13 = n5(var4.u3(), var5.u3(), var6.u3(), var7.u3(), var12);
      var12[0].n5(var9);
      var3[0] = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 2)
      );
      var8.n5(var3[0][0]);
      var9.n5(var3[0][1]);
      return var11;
   }

   public void n5(v3 var1) {
   }

   public v3 n5() {
      v3 var1 = new v3();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(v3 var1) {
      return true;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof v3) ? false : this.l6((v3)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public v3 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(v3 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
