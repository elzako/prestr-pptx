package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.IDisposable;

class o9b extends com.aspose.slides.internal.v6g.h0<o9b> {
   public o9b() {
   }

   static void n5(n1g var0, com.aspose.slides.internal.o9b.y2[] var1) {
      int var2 = com.aspose.slides.internal.v6g.k5.u3(var0.c4(), 13);
      int var3 = com.aspose.slides.internal.v6g.k5.u3(var0.y2(), 13);
      IChartPlotArea var4 = var0.n3().getPlotArea();
      var1[0].k5(com.aspose.slides.internal.v6g.k5.u3(var0.y1(), 13) + com.aspose.slides.internal.v6g.k5.u3(var2 * var4.getX(), 13));
      var1[0].u3(com.aspose.slides.internal.v6g.k5.u3(var0.a0(), 13) + com.aspose.slides.internal.v6g.k5.u3(var3 * var4.getY(), 13));
      var1[0].l6(com.aspose.slides.internal.v6g.k5.u3(var2 * var4.getWidth(), 13));
      var1[0].n5(com.aspose.slides.internal.v6g.k5.u3(var3 * var4.getHeight(), 13));
      if (var1[0].x8() < var0.a0()) {
         var1[0].n5(var1[0].l6() + (int)(var0.a0() - var1[0].x8()));
         var1[0].u3(com.aspose.slides.internal.v6g.k5.u3(var0.a0(), 13));
      }

      if (var1[0].s7() < var0.y1()) {
         var1[0].l6(var1[0].t2() + (int)(var0.y1() - var1[0].s7()));
         var1[0].k5(com.aspose.slides.internal.v6g.k5.u3(var0.y1(), 13));
      }

      if (var1[0].t2() + var1[0].s7() > var0.y1() + var2) {
         var1[0].k5(com.aspose.slides.internal.v6g.k5.u3(var0.y1(), 13) + var2 - var1[0].t2());
         var0.l6(true);
      }

      if (var1[0].l6() + var1[0].x8() > var0.a0() + var3) {
         var1[0].u3(com.aspose.slides.internal.v6g.k5.u3(var0.a0(), 13) + var3 - var1[0].l6());
         var0.l6(true);
      }

      if (var1[0].u9() > var0.y1() + var0.c4()) {
         var1[0].l6(com.aspose.slides.internal.v6g.k5.u3(var0.y1(), 13) + com.aspose.slides.internal.v6g.k5.u3(var0.c4(), 13) - var1[0].s7());
      }

      if (var1[0].n5() > var0.a0() + var0.y2()) {
         var1[0].n5(com.aspose.slides.internal.v6g.k5.u3(var0.a0(), 13) + com.aspose.slides.internal.v6g.k5.u3(var0.y2(), 13) - var1[0].x8());
      }
   }

   static void l6(n1g var0, com.aspose.slides.internal.o9b.y2[] var1) {
      if (var0.n3().hasTitle()) {
         com.aspose.slides.internal.o9b.f2 var2 = new com.aspose.slides.internal.o9b.f2(var1[0].t2() * 0.83F, var1[0].l6() * 0.5F);
         com.aspose.slides.internal.o9b.p8 var3 = var0.x8().n5(var2.a6()).u3();
         var0.x8().n5.n5 = new com.aspose.slides.internal.o9b.y2(
            com.aspose.slides.internal.v6g.k5.u3(var0.y1(), 13) + (com.aspose.slides.internal.v6g.k5.u3(var0.c4(), 13) - var3.l6()) / 2,
            com.aspose.slides.internal.v6g.k5.u3(var0.a0(), 13) + 8,
            var3.l6(),
            var3.k5()
         );
         if (!var0.n3().getChartTitle().getOverlay()) {
            var1[0].u3(var1[0].x8() + var3.k5() + 6);
            var1[0].n5(var1[0].l6() - (var3.k5() + 6));
         }
      }
   }

   static float n5(int var0, int var1, boolean var2, l5 var3) {
      if (var3.c8() == null) {
         return 0.0F;
      }

      float var4 = 0.0F;
      boolean var5;
      if (var2) {
         var5 = !var3.c8().isPlotOrderReversed();
      } else {
         var5 = var3.c8().isPlotOrderReversed();
      }

      double var6 = var3.z1();
      double var8 = var3.e2();
      double var10 = var3.t9();
      if (var3.c8().getCrossType() == 1) {
         var6 = var8;
      }

      if (var6 > var8) {
         var6 = var8;
      }

      if (var6 < var10) {
         var6 = var10;
      }

      var3.n5(var3.c8().isLogarithmic() ? (float)var3.l6(var6) : (float)var6);
      if (!var5) {
         var4 = (float)(var0 + (var8 - var6) / (var8 - var10) * var1);
      } else {
         var4 = (float)(var0 + (var6 - var10) / (var8 - var10) * var1);
      }

      return var4;
   }

   static void n5(List<g3y> var0, double[] var1, double[] var2, l5 var3) {
      List var4 = l6(var0);
      var1[0] = 0.0;
      var2[0] = 0.0;
      if (var3.c8() != null) {
         int var5 = 0;

         for (int var6 = 0; var6 < var4.size(); var6++) {
            double var7 = 0.0;
            double var9 = 0.0;
            double[] var11 = new double[]{0.0};
            double[] var12 = new double[]{0.0};
            boolean var13 = l6((List<g3y>)var4.get_Item(var6), var11, var12, var3);
            var7 = var11[0];
            var9 = var12[0];
            if (var6 == var5 && !var13) {
               var5++;
            } else if (var6 == var5) {
               var1[0] = var7;
               var2[0] = var9;
            } else {
               if (var7 < var1[0]) {
                  var1[0] = var7;
               }

               if (var9 > var2[0]) {
                  var2[0] = var9;
               }
            }
         }

         if (var5 == var4.size() && var3.c8().isAutomaticMinValue() != var3.c8().isAutomaticMaxValue()) {
            var1[0] = 0.0;
            var2[0] = 1.0;
            if (!var3.c8().isAutomaticMinValue()) {
               var3.u3(0.0);
            }

            if (!var3.c8().isAutomaticMaxValue()) {
               var3.a6(1.0);
            }
         } else {
            if (!var3.c8().isAutomaticMinValue()) {
               var1[0] = var3.t9();
            }

            if (!var3.c8().isAutomaticMaxValue()) {
               var2[0] = var3.e2();
            }
         }
      }
   }

   private static List<List<g3y>> l6(List<g3y> var0) {
      g3y var1 = (g3y)var0.get_Item(0);
      List var2 = new List();
      List var3 = new List();
      List var4 = new List();
      List$Enumerator var5 = var0.iterator();

      try {
         while (var5.hasNext()) {
            g3y var6 = (g3y)var5.next();
            if (var6.n5(new int[]{var1.u9().getType()})) {
               var4.addItem(var6);
            } else {
               var3.addItem(var6);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      if (var4.size() > 0) {
         var2.addItem(var4);
      }

      List var18 = new List();
      if (var3.size() > 0) {
         var1 = (g3y)var3.get_Item(0);
         List var7 = new List(var3);
         var3.clear();
         List$Enumerator var8 = var7.iterator();

         try {
            while (var8.hasNext()) {
               g3y var9 = (g3y)var8.next();
               if (var9.n5(new int[]{var1.u9().getType()})) {
                  var18.addItem(var9);
               } else {
                  var3.addItem(var9);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
               var8.dispose();
            }
         }
      }

      if (var18.size() > 0) {
         var2.addItem(var18);
      }

      if (var3.size() > 0) {
         var2.addItem(var3);
      }

      return var2;
   }

   private static boolean l6(List<g3y> var0, double[] var1, double[] var2, l5 var3) {
      boolean var4 = false;
      var1[0] = 0.0;
      var2[0] = 0.0;
      g3y var5 = (g3y)var0.get_Item(0);
      boolean var6 = !ChartTypeCharacterizer.isChartTypeBar(var3.d2().n3().getType()) && (var3.y4() == 2 || var3.y4() == 3);
      if (ChartTypeCharacterizer.c8(var5.u9().getType())) {
         if (ChartTypeCharacterizer.t2(var5.u9().getType())) {
            int var7 = n1g.u3(var0);
            boolean var8 = true;

            for (int var9 = 0; var9 < var7; var9++) {
               double var10 = 0.0;

               for (int var12 = 0; var12 < var0.size(); var12++) {
                  g3y var13 = (g3y)var0.get_Item(var12);
                  if (!ChartTypeCharacterizer.c8(var13.u9().getType())) {
                     break;
                  }

                  t9z var14 = var13.c8().get_Item(var9);
                  if (var14 != null && !var14.c8() && var14 != null) {
                     double var15 = var14.n5();
                     var10 += var15;
                     if (var8) {
                        var8 = false;
                        var4 = true;
                        var1[0] = var10;
                        var2[0] = var10;
                     } else {
                        if (var10 < var1[0]) {
                           var1[0] = var10;
                        }

                        if (var10 > var2[0]) {
                           var2[0] = var10;
                        }
                     }
                  }
               }
            }
         } else {
            int var39 = n5(var0);
            int var44 = n1g.u3(var0);
            boolean var49 = true;

            for (int var17 = 0; var17 < var44; var17++) {
               double var18 = 0.0;
               double var20 = 0.0;
               boolean var22 = false;
               boolean var23 = false;
               boolean var24 = true;

               for (int var25 = 0; var25 < var0.size(); var25++) {
                  g3y var26 = (g3y)var0.get_Item(var25);
                  if (!ChartTypeCharacterizer.c8(var26.u9().getType())) {
                     break;
                  }

                  t9z var27 = var26.c8().get_Item(var17);
                  if (var27 != null && !var27.c8()) {
                     IErrorBarsFormat var28 = var6 ? var26.u9().getErrorBarsYFormat() : var26.u9().getErrorBarsXFormat();
                     if (var27 != null) {
                        double var29 = var27.n5();
                        if (var49) {
                           var49 = false;
                           var24 = false;
                           var4 = true;
                           if (var39 == 1) {
                              var1[0] = var29;
                           } else if (var39 == 2) {
                              var2[0] = var29;
                           }
                        } else if (var24) {
                           var24 = false;
                           if (var39 == 1 && var29 < var1[0]) {
                              var1[0] = var29;
                           } else if (var39 == 2 && var29 > var2[0]) {
                              var2[0] = var29;
                           }
                        }

                        if (var29 < 0.0) {
                           var23 = true;
                           var20 += var29;
                        }

                        if (var29 > 0.0) {
                           var22 = true;
                           var18 += var29;
                        }

                        n5(var1, var2, var28, var6, var29, var26, var17);
                     }
                  }
               }

               if (var23 && var20 < var1[0]) {
                  var1[0] = var20;
               }

               if (var22 && var18 > var2[0]) {
                  var2[0] = var18;
               }
            }
         }
      } else if (ChartTypeCharacterizer.s7(var5.u9().getType())) {
         var4 = true;
         if (ChartTypeCharacterizer.u9(var5.u9().getType())) {
            int var40 = n1g.u3(var0);

            for (int var45 = 0; var45 < var40; var45++) {
               double var31 = 0.0;
               double var56 = 0.0;
               double var60 = 0.0;
               double var52 = 0.0;

               for (int var66 = 0; var66 < var0.size(); var66++) {
                  g3y var70 = (g3y)var0.get_Item(var66);
                  if (!ChartTypeCharacterizer.s7(var70.u9().getType())) {
                     break;
                  }

                  t9z var71 = var70.c8().get_Item(var45);
                  if (var71 != null) {
                     double var33 = var71.n5();
                     var31 += var33;
                     var56 += com.aspose.slides.ms.System.q1.n5(var33);
                     if (var31 < var60) {
                        var60 = var31;
                     }

                     if (var31 > var52) {
                        var52 = var31;
                     }
                  }
               }

               if (var56 != 0.0) {
                  int var67 = com.aspose.slides.internal.v6g.k5.u3(100.0 * var60 / var56, 14);
                  if (var67 < var1[0]) {
                     var1[0] = var67;
                  }

                  var67 = com.aspose.slides.internal.v6g.k5.u3(100.0 * var52 / var56, 14);
                  if (var67 > var2[0]) {
                     var2[0] = var67;
                  }
               }
            }
         } else {
            int var41 = n1g.u3(var0);

            for (int var46 = 0; var46 < var41; var46++) {
               double var72 = 0.0;
               double var57 = 0.0;
               double var61 = 0.0;

               for (int var63 = 0; var63 < var0.size(); var63++) {
                  g3y var65 = (g3y)var0.get_Item(var63);
                  if (!ChartTypeCharacterizer.s7(var65.u9().getType())) {
                     break;
                  }

                  t9z var69 = var65.c8().get_Item(var46);
                  if (var69 != null) {
                     double var35 = var69.n5();
                     var72 += com.aspose.slides.ms.System.q1.n5(var35);
                     if (var35 < 0.0) {
                        var61 += var35;
                     }

                     if (var35 > 0.0) {
                        var57 += var35;
                     }
                  }
               }

               if (var72 != 0.0) {
                  if (com.aspose.slides.internal.v6g.k5.u3(100.0 * var61 / var72, 14) < var1[0]) {
                     var1[0] = com.aspose.slides.internal.v6g.k5.u3(100.0 * var61 / var72, 14);
                  }

                  if (com.aspose.slides.internal.v6g.k5.u3(100.0 * var57 / var72, 14) > var2[0]) {
                     var2[0] = com.aspose.slides.internal.v6g.k5.u3(100.0 * var57 / var72, 14);
                  }
               }
            }
         }
      } else {
         boolean var42 = true;

         for (int var47 = 0; var47 < var0.size(); var47++) {
            List var50 = ((g3y)var0.get_Item(var47)).c8();

            for (int var54 = 0; var54 < var50.size(); var54++) {
               if (var50.get_Item(var54) == null || !((t9z)var50.get_Item(var54)).c8()) {
                  double var58 = var50.get_Item(var54) == null ? 0.0 : ((t9z)var50.get_Item(var54)).n5();
                  if (var42) {
                     var1[0] = var58;
                     var2[0] = var58;
                     var4 = true;
                     var42 = false;
                  } else {
                     if (var58 < var1[0]) {
                        var1[0] = var58;
                     }

                     if (var58 > var2[0]) {
                        var2[0] = var58;
                     }
                  }
               }
            }
         }
      }

      for (int var43 = 0; var43 < var0.size(); var43++) {
         List var48 = ((g3y)var0.get_Item(var43)).c8();
         g3y var51 = (g3y)var0.get_Item(var43);
         IErrorBarsFormat var55 = var6 ? var51.u9().getErrorBarsYFormat() : var51.u9().getErrorBarsXFormat();
         if (var55 != null && var55.isVisible()) {
            double var59 = 0.0;
            double var62 = 0.0;

            for (int var64 = 0; var64 < var48.size(); var64++) {
               double var37 = var48.get_Item(var64) == null ? 0.0 : ((t9z)var48.get_Item(var64)).n5();
               if (var64 == 0) {
                  var59 = var37;
                  var62 = var37;
               } else {
                  if (var59 < var37) {
                     var59 = var37;
                  }

                  if (var62 > var37) {
                     var62 = var37;
                  }
               }

               if (var55.getValueType() != 4) {
                  n5(var1, var2, var55, var6, var37, var51, var64);
               }
            }

            if (var55.getValueType() == 4) {
               double var53 = (var59 - var62) / 4.0;
               var51.n5(var53);
               if (!ChartTypeCharacterizer.isChartTypeLine(var5.u9().getType())) {
                  if (var2[0] + var53 > var2[0] && (var55.getType() == 0 || var55.getType() == 2)) {
                     var2[0] += var53;
                  }

                  if (var1[0] - var53 < var1[0] && (var55.getType() == 0 || var55.getType() == 1)) {
                     var1[0] -= var53;
                  }
               }
            }
         }
      }

      return var4;
   }

   private static void n5(double[] var0, double[] var1, IErrorBarsFormat var2, boolean var3, double var4, g3y var6, int var7) {
      if (var2 != null && var2.isVisible()) {
         double var8 = 0.0;
         double var10 = 0.0;
         switch (var2.getValueType()) {
            case 0:
               double var12 = 0.0;

               try {
                  if (var3) {
                     var12 = var6.c8().size() > var7 ? DoubleChartValue.l6(var6.c8().get_Item(var7).s7().getErrorBarsCustomValues().getYMinus()) : 0.0;
                  } else {
                     var12 = var6.c8().size() > var7 ? DoubleChartValue.l6(var6.c8().get_Item(var7).s7().getErrorBarsCustomValues().getXMinus()) : 0.0;
                  }
               } catch (RuntimeException var16) {
                  com.aspose.slides.internal.n8e.v4.n5(var16);
               }

               var8 = var12;

               try {
                  if (var3) {
                     var12 = var6.c8().size() > var7 ? DoubleChartValue.l6(var6.c8().get_Item(var7).s7().getErrorBarsCustomValues().getYPlus()) : 0.0;
                  } else {
                     var12 = var6.c8().size() > var7 ? DoubleChartValue.l6(var6.c8().get_Item(var7).s7().getErrorBarsCustomValues().getXPlus()) : 0.0;
                  }
               } catch (RuntimeException var15) {
                  com.aspose.slides.internal.n8e.v4.n5(var15);
               }

               var10 = var12;
               break;
            case 1:
               var8 = var2.getValue();
               var10 = var8;
               break;
            case 2:
               var8 = var2.getValue() * var4 / 100.0;
               var10 = var8;
         }

         if (var10 > 0.0 && var10 + var4 >= var1[0] && (var2.getType() == 0 || var2.getType() == 2)) {
            var1[0] = var10 + var4;
         }

         if (var10 < 0.0 && var4 + var10 <= var0[0] && (var2.getType() == 0 || var2.getType() == 2)) {
            var0[0] = var4 + var10;
         }

         if (var8 > 0.0 && var4 - var8 <= var0[0] && (var2.getType() == 0 || var2.getType() == 1)) {
            var0[0] = var4 - var8;
         }

         if (var8 < 0.0 && -var8 + var4 >= var1[0] && (var2.getType() == 0 || var2.getType() == 1)) {
            var1[0] = -var8 + var4;
         }
      }
   }

   static int n5(List<g3y> var0) {
      boolean var1 = false;
      boolean var2 = false;

      for (int var3 = 0; var3 < var0.size(); var3++) {
         List var4 = ((g3y)var0.get_Item(var3)).c8();

         for (int var5 = 0; var5 < var4.size(); var5++) {
            if (var4.get_Item(var5) != null) {
               double var6 = ((t9z)var4.get_Item(var5)).n5();
               if (var6 > 0.0) {
                  var1 = true;
               } else if (var6 < 0.0) {
                  var2 = true;
               }
            }
         }
      }

      if (var1 && !var2) {
         return 1;
      } else {
         return !var1 && var2 ? 2 : 3;
      }
   }

   private static void k5(List<g3y> var0, double[] var1, double[] var2, l5 var3) {
      var1[0] = 2.147483647E9;
      var2[0] = -2.1474836E9F;
      boolean var4 = var3.y4() == 2 || var3.y4() == 3;

      for (int var5 = 0; var5 < var0.size(); var5++) {
         g3y var6 = (g3y)var0.get_Item(var5);
         g3y var7 = var3.d2().y4().get_Item(var5);
         List var8 = var6.c8();
         double var9 = 2.147483647E9;
         double var11 = -2.1474836E9F;
         boolean var13 = true;
         IErrorBarsFormat var14 = var4 ? var7.u9().getErrorBarsYFormat() : var7.u9().getErrorBarsXFormat();
         if (var8.size() != 1 || !((t9z)var8.get_Item(0)).c8()) {
            for (int var15 = 0; var15 < var8.size(); var15++) {
               if (var8.get_Item(var15) != null) {
                  double var16 = ((t9z)var8.get_Item(var15)).l6();
                  if (!com.aspose.slides.ms.System.d2.k5(var16)) {
                     if (var13) {
                        var9 = var16;
                        var11 = var16;
                        var13 = false;
                     }

                     if (var16 < var9) {
                        var9 = var16;
                     }

                     if (var16 > var11) {
                        var11 = var16;
                     }

                     if (var14 != null && var14.isVisible() && !var4) {
                        double var18 = 0.0;
                        double var20 = 0.0;
                        switch (var14.getValueType()) {
                           case 0:
                              double var22 = 0.0;

                              try {
                                 if (var4) {
                                    var22 = var7.c8().size() > var15
                                       ? DoubleChartValue.l6(var7.c8().get_Item(var15).s7().getErrorBarsCustomValues().getYMinus())
                                       : 0.0;
                                 } else {
                                    var22 = var7.c8().size() > var15
                                       ? DoubleChartValue.l6(var7.c8().get_Item(var15).s7().getErrorBarsCustomValues().getXMinus())
                                       : 0.0;
                                 }
                              } catch (RuntimeException var40) {
                                 com.aspose.slides.internal.n8e.v4.n5(var40);
                              }

                              var18 = var22;

                              try {
                                 if (var4) {
                                    var22 = var7.c8().size() > var15
                                       ? DoubleChartValue.l6(var7.c8().get_Item(var15).s7().getErrorBarsCustomValues().getYPlus())
                                       : 0.0;
                                 } else {
                                    var22 = var7.c8().size() > var15
                                       ? DoubleChartValue.l6(var7.c8().get_Item(var15).s7().getErrorBarsCustomValues().getXPlus())
                                       : 0.0;
                                 }
                              } catch (RuntimeException var39) {
                                 com.aspose.slides.internal.n8e.v4.n5(var39);
                              }

                              var20 = var22;
                              break;
                           case 1:
                              var18 = var14.getValue();
                              var20 = var18;
                              break;
                           case 2:
                              var18 = var14.getValue() * var16 / 100.0;
                              var20 = var18;
                        }

                        double var43 = var3.c8().isLogarithmic() ? com.aspose.slides.ms.System.q1.a6(var3.c8().getLogBase(), var16) : var16;
                        double var25 = var43 - var18;
                        double var27 = var43 + var20;
                        if (var3.c8().isLogarithmic()) {
                           var25 = com.aspose.slides.ms.System.q1.n5((double)(var25), (double)(var3.c8().getLogBase()));
                           var27 = com.aspose.slides.ms.System.q1.n5((double)(var27), (double)(var3.c8().getLogBase()));
                        }

                        if (var20 > 0.0 && var27 >= var11 && (var14.getType() == 0 || var14.getType() == 2)) {
                           var11 = var27;
                        }

                        if (var20 < 0.0 && var27 <= var9 && (var14.getType() == 0 || var14.getType() == 2)) {
                           var9 = var27;
                        }

                        if (var18 > 0.0 && var25 <= var9 && (var14.getType() == 0 || var14.getType() == 1)) {
                           var9 = var25;
                        }

                        if (var18 < 0.0 && -var18 + var16 >= var11 && (var14.getType() == 0 || var14.getType() == 1)) {
                           var11 = -var18 + var16;
                        }
                     }
                  }
               }
            }

            if (var13) {
               var9 = 0.0;
               var11 = 0.0;
            }

            double var29 = 0.0;
            double var31 = 0.0;

            for (int var33 = 0; var33 < var7.a6().size(); var33++) {
               w3q var34 = var7.a6().get_Item(var33);
               double var35 = com.aspose.slides.ms.System.d2.k5(var34.k5().getForward()) ? 0.0 : var34.k5().getForward();
               double var37 = com.aspose.slides.ms.System.d2.k5(var34.k5().getBackward()) ? 0.0 : var34.k5().getBackward();
               if (var34.k5().getFormat().getLine().getFillFormat().getFillType() == 0) {
                  if (var35 > var29) {
                     var29 = var35;
                  }

                  if (var37 > var31) {
                     var31 = var37;
                  }
               }
            }

            var9 -= var31;
            var11 += var29;
            if (var9 < var1[0]) {
               var1[0] = var9;
            }

            if (var11 > var2[0]) {
               var2[0] = var11;
            }
         }
      }

      if (!var3.c8().isAutomaticMinValue()) {
         var1[0] = var3.t9();
      }

      if (!var3.c8().isAutomaticMaxValue()) {
         var2[0] = var3.e2();
      }
   }

   static void n5(double var0, double var2, List<Object> var4, int var5, com.aspose.slides.internal.o9b.y2 var6, boolean var7, g3y var8, l5 var9) {
      n5(var0, var2, var4, var5, var6.n3(), var7, var8, var9, null);
   }

   static void n5(
      double var0,
      double var2,
      List<Object> var4,
      int var5,
      com.aspose.slides.internal.o9b.y2 var6,
      boolean var7,
      g3y var8,
      l5 var9,
      com.aspose.slides.internal.o9b.n3 var10
   ) {
      if (var9.c8() != null) {
         n1g var11 = var9.d2();
         if (var9.c8().isLogarithmic()) {
            l6(var0, var2, var4, var5, var6.n3(), var7, var8, var9);
         } else {
            double var12 = var0;
            double var14 = var2;
            if (var0 == var2 && var0 == 0.0) {
               if (var9.c8().isPlotOrderReversed()) {
                  var9.a6(0.0);
                  var0 = 0.0;
                  var12 = 0.0;
                  var9.u3(-1.0);
               } else {
                  var9.a6(1.0);
                  var0 = 1.0;
                  var12 = 1.0;
                  var9.u3(0.0);
               }
            } else if (var0 <= var2) {
               if (!var9.c8().isAutomaticMaxValue() && var9.c8().isAutomaticMinValue()) {
                  var9.u3(var0 - 1.0);
                  var2 = var9.q0();
               } else if (var9.c8().isAutomaticMaxValue() && !var9.c8().isAutomaticMinValue()) {
                  var9.a6(var2 + 1.0);
                  var0 = var9.z3();
               }
            }

            boolean var16 = var9.c8().isAutomaticMaxValue();
            boolean var17 = var9.c8().isAutomaticMinValue();
            double var18 = 0.0;
            int var20 = 1;
            boolean var21 = ChartTypeCharacterizer.s7(var5 != 73 ? var5 : var11.n3().getChartData().getSeries().get_Item(0).getType());
            if (var21) {
               if (var0 == 100.0 && var9.c8().isAutomaticMaxValue()) {
                  var9.a6(100.0);
               }

               if (var2 == -100.0 && var9.c8().isAutomaticMinValue()) {
                  var9.u3(-100.0);
               }

               var9.h0(var9.w1() * 100.0);
            }

            double var22 = 0.0;
            double var24 = 0.0;
            double[] var26 = new double[]{0.0};
            double[] var27 = new double[]{0.0};
            double[] var28 = new double[]{var2};
            double[] var29 = new double[]{var0};
            double[] var30 = new double[]{0.0};
            int[] var31 = new int[]{1};
            n5(var26, var27, var28, var29, var30, var31, var7, var12, var14, var16, var17, var9);
            var22 = var26[0];
            var24 = var27[0];
            var2 = var28[0];
            var0 = var29[0];
            var18 = var30[0];
            var20 = var31[0];
            if (!var9.z8()) {
               if (!var9.m3() && var9.w1() < var9.j5()) {
                  throw new ArgumentException(
                     com.aspose.slides.ms.System.d1.n5(new String[]{
                        "The numbers you specified can't be used because the interval for the minor unit",
                        "tick marks must be less than or equal to the interval for the major unit tick marks!"
                     })
                  );
               }

               if (var18 < var9.j5()) {
                  var18 = var9.j5();
               }
            }

            if (ChartTypeCharacterizer.isBar3DChart(var11.n3().getType()) && !ChartTypeCharacterizer.isChartTypeColumn(var11.n3().getType())) {
               if (var21) {
                  if (com.aspose.slides.ms.System.q1.n5((double)(var11.e5().n3()), 2) < 1.25) {
                     var18 /= 2.0;
                  } else if (var11.e5().n3() > 2.4) {
                     var18 *= 2.5;
                  }
               } else {
                  n5(var20, var18, var24, var22, var4, var12, var14, var16, var17, var21, var9);
                  float var48 = n5(var7, var8, var6.n3(), var9, var10);
                  float var50 = 3.0F * var48;
                  float var52 = var50 / var11.e5().u3();
                  if (var52 > 0.5F && var11.e5().n3() > 1.4) {
                     var18 *= var11.e5().n3();
                  }

                  var9.h0.clear();
                  var4.clear();
               }
            }

            n5(var20, var18, var24, var22, var4, var12, var14, var16, var17, var21, var9);
            float var49 = n5(var7, var8, var6.n3(), var9, var10);
            Chart var51 = var9.d2().n3();
            boolean var53 = com.aspose.slides.ms.System.n1.k5(var51.getPlotArea().getWidth())
               && com.aspose.slides.ms.System.n1.k5(var51.getPlotArea().getHeight())
               && com.aspose.slides.ms.System.n1.k5(var51.getPlotArea().getX())
               && com.aspose.slides.ms.System.n1.k5(var51.getPlotArea().getY());
            boolean var54 = false;
            int var55;
            if (ChartTypeCharacterizer.is3DChart(var11.n3().getType())) {
               if (var7) {
                  var55 = com.aspose.slides.internal.v6g.k5.u3(var11.e5().u3(), 13);
               } else {
                  var55 = com.aspose.slides.internal.v6g.k5.u3(var11.e5().a6(), 13);
               }
            } else if (var7) {
               if (ChartTypeCharacterizer.isChartTypeBar(var11.n3().getType()) && var53) {
                  var55 = com.aspose.slides.internal.v6g.k5.u3(var6.t2() * 0.45, 14);
               } else {
                  var55 = var6.t2();
               }
            } else {
               var55 = var6.l6();
            }

            if (ChartTypeCharacterizer.isChartTypeBar(var11.n3().getType()) && !ChartTypeCharacterizer.is3DChart(var11.n3().getType())) {
               while (var9.m3() && var4.size() > 2 && var49 > var55 && var55 != 0) {
                  double var32 = 0.0;
                  double[] var34 = new double[]{var18};
                  double[] var35 = new double[]{0.0};
                  n5(var34[0], var34, var35, var9);
                  double var44 = var34[0];
                  var32 = var35[0];
                  var18 = var44 * 10.0;
                  n5(var20, var18, var24, var22, var4, var12, var14, var16, var17, var21, var9);
                  var49 = n5(var7, var8, var6.n3(), var9, var10);
               }
            } else {
               float var56 = (float)var55 / (var9.h0.size() - 1);

               for (float var57 = n5(var7, var8, var6.n3(), var9, var10) / (var9.h0.size() - 1);
                  var9.m3() && var4.size() > 2 && (var49 > var55 && var55 != 0 || !var53 && var7 && var57 * 3.937 >= var56);
                  var57 = n5(var7, var8, var6.n3(), var9, var10) / (var9.h0.size() - 1)
               ) {
                  double var36 = 0.0;
                  double[] var38 = new double[]{var18};
                  double[] var39 = new double[]{0.0};
                  n5(var38[0], var38, var39, var9);
                  double var43 = var38[0];
                  var36 = var39[0];
                  var18 = var43 * 10.0;
                  n5(var20, var18, var24, var22, var4, var12, var14, var16, var17, var21, var9);
                  var49 = n5(var7, var8, var6.n3(), var9, var10);
                  var56 = (float)var55 / (var9.h0.size() - 1);
               }
            }

            if (var4.size() >= 2) {
               var9.a6(com.aspose.slides.internal.v6g.k5.u3(var4.get_Item(0), double.class));
               var9.u3(com.aspose.slides.internal.v6g.k5.u3(var4.get_Item(var4.size() - 1), double.class));
               if (var9.m3()) {
                  var9.h0(var18);
               }

               if (var9.z8()) {
                  var9.u9(var9.w1() / 5.0);
               }
            }
         }
      }
   }

   public static void n5(
      double[] var0,
      double[] var1,
      double[] var2,
      double[] var3,
      double[] var4,
      int[] var5,
      boolean var6,
      double var7,
      double var9,
      boolean var11,
      boolean var12,
      l5 var13
   ) {
      if (var13.m3()) {
         l6(var0, var1, var2, var3, var4, var5, var6, var7, var9, var11, var12, var13);
      } else {
         n5(var0, var1, var2, var3, var4, var5, var13);
      }
   }

   private static void n5(double[] var0, double[] var1, double[] var2, double[] var3, double[] var4, int[] var5, l5 var6) {
      boolean var7 = var6.c8().isAutomaticMinValue();
      boolean var8 = var6.c8().isAutomaticMaxValue();
      var4[0] = var6.w1();
      var1[0] = var2[0];
      var0[0] = var3[0];
      if (var3[0] != var2[0] && var3[0] > 0.0 && var2[0] > 0.0) {
         double var24 = var3[0] - var2[0];
         double var26 = 0.0;
         double var29 = 0.0;
         double[] var31 = new double[]{0.0};
         double[] var32 = new double[]{0.0};
         n5(var24, var31, var32, var6);
         var26 = var31[0];
         var29 = var32[0];
         if (var2[0] / var24 >= 5.0) {
            var1[0] = var2[0];
            var0[0] = var2[0] + var29;
            double var33 = com.aspose.slides.ms.System.q1.n5(var26);
            int var35 = g6z.u3(var33);
            double var38 = 0.0;

            while (var38 < var1[0]) {
               var38 = com.aspose.slides.ms.System.q1.n5(var38, var35);
               var38 += var33;
            }

            if (var7 && var8) {
               var35 = g6z.u3(var4[0]);
               double var41 = 0.0;

               while (var41 <= var38) {
                  var41 = com.aspose.slides.ms.System.q1.n5(var41, var35);
                  var41 += var4[0];
               }

               var6.u3(var38 - var4[0]);
               var7 = false;
               var2[0] = var6.q0();
               var1[0] = var6.q0();
            }
         } else {
            if (var7 && var8) {
               var6.u3(0.0);
               var7 = false;
               var2[0] = var6.q0();
            }

            var1[0] = 0.0;
         }
      } else if (var3[0] != var2[0] && var3[0] < 0.0 && var2[0] < 0.0) {
         double var9 = var2[0] - var3[0];
         double var11 = 0.0;
         double var13 = 0.0;
         double[] var15 = new double[]{0.0};
         double[] var16 = new double[]{0.0};
         n5(var9, var15, var16, var6);
         var11 = var15[0];
         var13 = var16[0];
         if (var2[0] / var9 >= 5.0) {
            var0[0] = var3[0] - var13 / 2.0;
            var1[0] = var3[0] + var13;
            double var17 = com.aspose.slides.ms.System.q1.n5(var11);
            int var19 = g6z.u3(var17);
            double var20 = 0.0;

            while (var20 > var0[0]) {
               var20 = com.aspose.slides.ms.System.q1.n5(var20, var19);
               var20 -= var17;
            }

            if (var7 && var8) {
               var19 = g6z.u3(var4[0]);
               double var22 = 0.0;

               while (var22 >= var20) {
                  var22 = com.aspose.slides.ms.System.q1.n5(var22, var19);
                  var22 -= var4[0];
               }

               var6.a6(var22 + var4[0]);
               var3[0] = var6.z3();
               var8 = false;
               var0[0] = var6.z3();
            }
         } else {
            if (var7 && var8) {
               var6.a6(0.0);
               var8 = false;
               var3[0] = var6.z3();
            }

            var0[0] = 0.0;
         }
      }

      if (var7 && var8) {
         var5[0] = 3;
         if (var2[0] == 0.0) {
            var6.u3(0.0);
            var5[0] = 2;
            var1[0] = 0.0;
         }

         if (var3[0] == 0.0) {
            var6.a6(0.0);
            var5[0] = 1;
            var0[0] = 0.0;
         }
      } else if (var7 && !var8) {
         var5[0] = 1;
         var0[0] = var6.z3();
         var3[0] = var6.z3();
      } else if (!var7 && var8) {
         var5[0] = 2;
         var1[0] = var6.q0();
         var2[0] = var6.q0();
      } else {
         var5[0] = 2;
         var1[0] = var6.q0();
         var0[0] = var6.z3();
         var2[0] = var6.q0();
         var3[0] = var6.z3();
      }
   }

   private static void l6(
      double[] var0,
      double[] var1,
      double[] var2,
      double[] var3,
      double[] var4,
      int[] var5,
      boolean var6,
      double var7,
      double var9,
      boolean var11,
      boolean var12,
      l5 var13
   ) {
      boolean var14 = var13.c8().isAutomaticMinValue();
      boolean var15 = var13.c8().isAutomaticMaxValue();
      double var16 = 0.0;
      double var18 = 0.0;
      double var20 = 0.0;
      double var22 = 0.0;
      double[] var24 = new double[]{0.0};
      double[] var25 = new double[]{0.0};
      n5(var2[0], var24, var25, var13);
      var16 = var24[0];
      var18 = var25[0];
      double[] var26 = new double[]{0.0};
      double[] var27 = new double[]{0.0};
      n5(var3[0], var26, var27, var13);
      var20 = var26[0];
      var22 = var27[0];
      var1[0] = var2[0] < var18 ? var2[0] : var18;
      if (ChartTypeCharacterizer.is3DChart(var13.d2().n3().getType())) {
         var22 = var3[0];
      }

      var0[0] = var3[0] > var22 ? var3[0] : var22;
      if (com.aspose.slides.ms.System.q1.n5(var20) > com.aspose.slides.ms.System.q1.n5(var16)) {
         var4[0] = com.aspose.slides.ms.System.q1.n5(var20);
      } else {
         var4[0] = com.aspose.slides.ms.System.q1.n5(var16);
      }

      if (var3[0] != var2[0] && var3[0] > 0.0 && var2[0] > 0.0) {
         double var50 = g6z.n5(var3[0], var2[0]);
         double var55 = 0.0;
         double var62 = 0.0;
         double[] var67 = new double[]{0.0};
         double[] var70 = new double[]{0.0};
         n5(var50, var67, var70, var13);
         var55 = var67[0];
         var62 = var70[0];
         if (var2[0] / var50 >= 5.0) {
            var0[0] = var2[0] + var62;
            var4[0] = com.aspose.slides.ms.System.q1.n5(var55);
            if (g6z.n5(var3[0], var2[0]) / var4[0] >= 8.0) {
               n5(var4);
            }

            int var72 = g6z.u3(var4[0]);
            double var74 = 0.0;
            double var39 = 3.0 * var2[0] - var3[0];
            var39 = com.aspose.slides.ms.System.q1.n5(var39, 10);
            double var41 = 2.0 * var4[0];
            double var43 = com.aspose.slides.ms.System.q1.k5(var39 / var41);
            var74 = com.aspose.slides.ms.System.q1.n5(var43 * var4[0], var72);
            if (var14 && var15) {
               var13.u3(var74);
               var14 = false;
               var1[0] = var74;
            }
         } else {
            if (var14 && var15) {
               var13.u3(0.0);
               var14 = false;
            }

            var1[0] = 0.0;
         }
      } else if (var3[0] != var2[0] && var3[0] < 0.0 && var2[0] < 0.0) {
         double var49 = var2[0] - var3[0];
         double var53 = 0.0;
         double var60 = 0.0;
         double[] var66 = new double[]{0.0};
         double[] var69 = new double[]{0.0};
         n5(var49, var66, var69, var13);
         var53 = var66[0];
         var60 = var69[0];
         if (var2[0] / var49 >= 5.0) {
            var0[0] = var3[0] - var60 / 2.0;
            var1[0] = var3[0] + var60;
            var4[0] = com.aspose.slides.ms.System.q1.n5(var53);
            if ((var3[0] - var2[0]) / var4[0] >= 8.0) {
               n5(var4);
            }

            int var36 = g6z.u3(var4[0]);
            double var37 = 0.0;

            while (var37 - 3.0 * var4[0] > var3[0]) {
               var37 = com.aspose.slides.ms.System.q1.n5(var37, var36);
               var37 -= var4[0];
            }

            if (var14 && var15) {
               var13.a6(var37);
               var0[0] = var37;
            }
         } else {
            if (var14 && var15) {
               var13.a6(0.0);
               var15 = false;
            }

            var0[0] = 0.0;
         }
      } else if (var3[0] != var2[0] && var3[0] > 0.0 && var2[0] < 0.0) {
         double var28 = var3[0] - var2[0];
         double var30 = 0.0;
         double var32 = 0.0;
         double[] var34 = new double[]{0.0};
         double[] var35 = new double[]{0.0};
         n5(var28, var34, var35, var13);
         var30 = var34[0];
         var32 = var35[0];
         var4[0] = com.aspose.slides.ms.System.q1.n5(var30);
         if ((var3[0] - var2[0]) / var4[0] > 9.0) {
            n5(var4);
         }
      }

      if (var14 && var15) {
         var5[0] = 3;
         if (var2[0] == 0.0 || var3[0] == var2[0] && var3[0] > 0.0) {
            var13.u3(0.0);
            var5[0] = 2;
            var1[0] = 0.0;
         }

         if (var3[0] == 0.0 || var3[0] == var2[0] && var3[0] < 0.0) {
            var13.a6(0.0);
            var5[0] = 1;
            var0[0] = 0.0;
         }
      } else if (var14 && !var15) {
         var5[0] = 1;
         if (ChartTypeCharacterizer.is3DChart(var13.d2().n3().getType())) {
            if (var0[0] - var3[0] >= var4[0]) {
               var0[0] = var3[0];
            }
         } else {
            var0[0] = var13.z3();
         }

         var3[0] = var13.z3();
      } else if (!var14 && var15) {
         var5[0] = 2;
         var1[0] = var13.q0();
         var2[0] = var13.q0();
      } else {
         var5[0] = 2;
         var1[0] = var13.q0();
         var0[0] = var13.z3();
         var2[0] = var13.q0();
         var3[0] = var13.z3();
         double var51 = g6z.n5(var3[0], var2[0]);
         double var57 = 0.0;
         double var64 = 0.0;
         double[] var68 = new double[]{0.0};
         double[] var71 = new double[]{0.0};
         n5(var51, var68, var71, var13);
         var57 = var68[0];
         var64 = var71[0];
         var4[0] = var57;
      }

      if (!var6 || ChartTypeCharacterizer.isChartTypeBubble(var13.d2().n3().getType())) {
         n5(var1[0], var0[0], var4, var5[0], var7, var9, var11, var12, var13);
      }
   }

   public static void n5(
      int var0, double var1, double var3, double var5, List<Object> var7, double var8, double var10, boolean var12, boolean var13, boolean var14, l5 var15
   ) {
      var7.clear();
      if (var0 == 1) {
         com.aspose.slides.ms.System.c4 var16 = com.aspose.slides.internal.v6g.k5.s7(var5, 14).l6();
         int var17 = g6z.u3(var1);

         while (
            com.aspose.slides.ms.System.c4.s7(var16, com.aspose.slides.internal.v6g.k5.s7(var3, 14))
               || com.aspose.slides.ms.System.c4.x8(
                  com.aspose.slides.ms.System.c4.u3(com.aspose.slides.internal.v6g.k5.s7(var3, 14), var16), com.aspose.slides.internal.v6g.k5.s7(var1, 14)
               )
         ) {
            double var18 = com.aspose.slides.ms.System.q1.n5((double)(com.aspose.slides.internal.v6g.k5.t2(var16, 15)), var17);
            if (!var15.c8().isAutomaticMinValue() && var18 < var15.q0()) {
               var7.addItem(var15.q0());
            } else {
               var7.addItem(var18);
            }

            com.aspose.slides.ms.System.c4.u3(var16, com.aspose.slides.internal.v6g.k5.s7(var1, 14)).k7(var16);
         }

         if (var13) {
            double var27 = 2.147483647E9;
            if (var7.size() > 0) {
               var27 = com.aspose.slides.internal.v6g.k5.u3(var7.get_Item(var7.size() - 1), double.class);
            }

            double var20 = var10 - var27;
            if (var20 > var1 && var27 != 0.0) {
               var27 += var1;
               if ((var10 - var5) / (var27 - var5) <= 0.9523809523809523) {
                  var7.removeAt(var7.size() - 1);
               }
            } else if ((var10 - var5) / (var27 - var5) > 0.9523809523809523 && var27 != 0.0) {
               com.aspose.slides.internal.v6g.k5.s7(com.aspose.slides.ms.System.q1.n5((double)(var27 - var1), var17), 14).k7(var16);
               var7.addItem(var16.l6());
            }
         }

         for (int var22 = 0; var22 < var7.size(); var22++) {
            var7.set_Item(var22, com.aspose.slides.ms.System.z3.n3(var7.get_Item(var22)));
         }
      } else if (var0 == 2) {
         double var23 = var3;
         int var29 = g6z.u3(var1);

         while (var23 <= var5 || var23 < var5 + var1) {
            var23 = com.aspose.slides.ms.System.q1.n5((double)(var23), var29);
            if (!var15.c8().isAutomaticMaxValue() && var23 > var15.z3()) {
               var7.addItem(var15.z3());
            } else {
               var7.addItem(var23);
            }

            var23 += var1;
         }

         if (var12) {
            double var25 = -2.1474836E9F;
            if (var7.size() > 0) {
               var25 = com.aspose.slides.internal.v6g.k5.u3(var7.get_Item(var7.size() - 1), double.class);
            }

            if (g6z.n5(var25, var8) > var1 && var25 != 0.0) {
               var25 -= var1;
               if ((var8 - var3) / (var25 - var3) <= 0.9523809523809523) {
                  var7.removeAt(var7.size() - 1);
               }
            } else if ((var8 - var3) / (var25 - var3) > 0.9523809523809523 && var25 != 0.0) {
               var23 = com.aspose.slides.ms.System.q1.n5((double)(var25 + var1), var29);
               var7.addItem(var23);
            }
         }

         var7.reverse();
      } else {
         double var33 = 0.0;
         int var30 = g6z.u3(var1);

         while (var33 <= var5 || g6z.n5(var33, var5) < var1) {
            var33 = com.aspose.slides.ms.System.q1.n5((double)(var33), var30);
            if (!var15.c8().isAutomaticMaxValue() && var33 > var15.z3()) {
               var7.addItem(var15.z3());
            } else {
               var7.addItem(var33);
            }

            var33 += var1;
         }

         if (var12) {
            double var40 = -2.1474836E9F;
            if (var7.size() > 0) {
               var40 = com.aspose.slides.internal.v6g.k5.u3(var7.get_Item(var7.size() - 1), double.class);
            }

            if (var40 - var8 > var1) {
               var40 -= var1;
               if ((var8 - var10) / (var40 - var10) <= 0.9523809523809523) {
                  var7.removeAt(var7.size() - 1);
               }
            } else if ((var8 - var10) / (var40 - var10) > 0.9523809523809523) {
               var33 = com.aspose.slides.ms.System.q1.n5((double)(var40 + var1), var30);
               var7.addItem(var33);
            }
         }

         var7.reverse();
         var33 = 0.0 - var1;

         while (var33 >= var3 || g6z.n5(var3, var33) < var1) {
            var33 = com.aspose.slides.ms.System.q1.n5((double)(var33), var30);
            if (!var15.c8().isAutomaticMinValue() && var33 < var15.q0()) {
               var7.addItem(var15.q0());
            } else {
               var7.addItem(var33);
            }

            var33 -= var1;
         }

         if (var13) {
            double var42 = 2.147483647E9;
            if (var7.size() > 0) {
               var42 = com.aspose.slides.internal.v6g.k5.u3(var7.get_Item(var7.size() - 1), double.class);
            }

            if (var10 - var42 > var1) {
               var42 += var1;
               if ((var10 - var8) / (var42 - var8) <= 0.9523809523809523) {
                  var7.removeAt(var7.size() - 1);
               }
            } else if ((var10 - var8) / (var42 - var8) > 0.9523809523809523) {
               var33 = com.aspose.slides.ms.System.q1.n5((double)(var42 - var1), var30);
               var7.addItem(var33);
            }
         }
      }

      if (var7.size() >= 2) {
         if ((var14 || ChartTypeCharacterizer.n5(var15.d2().n3()))
            && com.aspose.slides.internal.v6g.k5.u3(var7.get_Item(0), double.class) >= var8 + var1
            && com.aspose.slides.internal.v6g.k5.u3(var7.get_Item(0), double.class) != 0.0
            && var12
            && var7.size() >= 3) {
            var7.removeAt(0);
         }

         if ((var14 || ChartTypeCharacterizer.n5(var15.d2().n3()))
            && com.aspose.slides.internal.v6g.k5.u3(var7.get_Item(var7.size() - 1), double.class) <= g6z.n5(var10, var1)
            && com.aspose.slides.internal.v6g.k5.u3(var7.get_Item(var7.size() - 1), double.class) != 0.0
            && var13
            && var7.size() >= 3) {
            var7.removeAt(var7.size() - 1);
         }
      }
   }

   static float n5(boolean var0, g3y var1, com.aspose.slides.internal.o9b.y2 var2, l5 var3) {
      return n5(var0, var1, var2.n3(), var3, var3.k5());
   }

   static float n5(boolean var0, g3y var1, com.aspose.slides.internal.o9b.y2 var2, l5 var3, com.aspose.slides.internal.o9b.n3 var4) {
      if (var3.c8() != null && var3.c8().getTickLabelPosition() != 3) {
         int var5 = var1.u9().getType();
         String var6 = "";
         boolean var7 = false;
         String var8 = "";

         for (int var9 = 0; var9 < var3.h0.size(); var9++) {
            double var10 = com.aspose.slides.internal.v6g.k5.u3(var3.h0.get_Item(var9), double.class);
            if (var5 == 32 || var5 == 2) {
               var10 /= 100.0;
               var6 = "0%";
            }

            String var12 = var3.n3() ? t7k.n5(var10, var6, var7) : p4.n5(var10, var3);
            if (var12.length() > var8.length()) {
               var8 = var12;
            }
         }

         com.aspose.slides.internal.o9b.p8 var15 = new com.aspose.slides.internal.o9b.p8(var2.t2(), var2.l6());
         com.aspose.slides.internal.o9b.f2 var13 = new com.aspose.slides.internal.o9b.f2();
         h6l.l6(var8, var3.u9(), var4 != null ? var4 : var3.k5(), com.aspose.slides.internal.o9b.p8.n5(var15).a6(), 1, 1).l6(var13);
         float var14 = 0.0F;
         if (var0) {
            var14 = var13.l6() * (var3.h0.size() - 1);
         } else {
            var14 = var13.k5() * (var3.h0.size() - 1);
         }

         return var14;
      } else {
         return 0.0F;
      }
   }

   public static void n5(double var0, double[] var2, double[] var3, l5 var4) {
      boolean var5 = !(var0 < 0.0);
      var0 = com.aspose.slides.ms.System.q1.n5(var0);
      var2[0] = 0.0;
      var3[0] = 0.0;
      if (var0 > 1.0) {
         n5(var0, var2, var3);
      } else {
         if (var0 == 0.0) {
            return;
         }

         int var6 = g6z.u3(var0);
         double var7 = var0 * com.aspose.slides.ms.System.q1.a6(10.0, var6);
         n5(var7, var2, var3);
         var2[0] /= com.aspose.slides.ms.System.q1.a6(10.0, var6);
         var3[0] /= com.aspose.slides.ms.System.q1.a6(10.0, var6);
      }

      if (!var5) {
         var2[0] = -var2[0];
         var3[0] = -var3[0];
      }
   }

   private static void n5(double var0, double[] var2, double[] var3) {
      char var4 = com.aspose.slides.ms.System.z3.l6(com.aspose.slides.internal.x7n.s7.s7().q0());
      var0 = com.aspose.slides.ms.System.q1.n5(var0);
      String var5 = com.aspose.slides.ms.System.d2.u9(var0);
      String var6 = "";
      if (com.aspose.slides.ms.System.d1.c8(var5, "E") > 0) {
         String[] var7 = com.aspose.slides.ms.System.d1.n5(var5, 'E');
         var5 = var7[0];
         var6 = com.aspose.slides.ms.System.d1.n5(new String[]{"E", var7[1]});
      }

      int var15 = com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.t9.q0(var5.charAt(0)));
      int var8 = 0;
      if (var5.length() > 1) {
         var8 = com.aspose.slides.ms.System.a3.n5(
            var5.charAt(1) != var4 ? com.aspose.slides.ms.System.t9.q0(var5.charAt(1)) : com.aspose.slides.ms.System.t9.q0(var5.charAt(2))
         );
      }

      if (var15 == 1) {
         double var9 = var5.length() <= 5 ? 19047.0 : 19047.0 * com.aspose.slides.ms.System.q1.a6(10.0, var5.length() - 5.0);
         if (var0 > var9) {
            if (var8 % 5 > 0) {
               var15++;
               var8 = 0;
            } else {
               var8 = 5;
            }

            var2[0] = 5.0;
         } else {
            int var11 = var8 / 2;
            var8 = ++var11 * 2;
            var2[0] = 2.0;
         }
      } else if (var15 < 5) {
         if (var8 % 5 > 0) {
            var15++;
            var8 = 0;
         } else {
            var8 = 5;
         }

         var2[0] = 5.0;
      } else {
         var15++;
         var2[0] = 10.0;
         var8 = 0;
      }

      int var12 = var5.length();
      int var13 = com.aspose.slides.ms.System.d1.l6(var5, var4, 0);
      if (var13 > 0) {
         var12 = var13;
      }

      if ("".equals(var6)) {
         var2[0] *= com.aspose.slides.ms.System.q1.a6(10.0, var12 - 2.0);
         var3[0] = (var15 * 10 + var8) * com.aspose.slides.ms.System.q1.a6(10.0, var12 - 2.0);
      } else {
         var2[0] *= com.aspose.slides.ms.System.q1.a6(10.0, var12 - 2.0);
         var3[0] = (var15 * 10 + var8) * com.aspose.slides.ms.System.q1.a6(10.0, var12 - 2.0);
         var2[0] = com.aspose.slides.ms.System.z3.h0(com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.d2.u9(var2[0]), var6}));
         var3[0] = com.aspose.slides.ms.System.z3.h0(com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.d2.u9(var3[0]), var6}));
      }
   }

   private static void n5(double[] var0) {
      char var1 = com.aspose.slides.ms.System.z3.l6(com.aspose.slides.internal.x7n.s7.s7().q0());
      boolean var2 = !(var0[0] < 0.0);
      var0[0] = com.aspose.slides.ms.System.q1.n5(var0[0]);
      int var3 = 1;
      if (var0[0] > 1.0) {
         String var4 = com.aspose.slides.ms.System.d2.u9(var0[0]);
         var3 = com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.t9.q0(var4.charAt(0)));
      } else if (var0[0] == 0.0) {
         var0[0] = 0.0;
         return;
      }

      if (var0[0] < 1.0) {
         String var6 = com.aspose.slides.ms.System.d2.u9(var0[0]);

         for (int var5 = 0; var5 < var6.length(); var5++) {
            if (var6.charAt(var5) != '0' && var6.charAt(var5) != var1) {
               var3 = com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.t9.q0(var6.charAt(var5)));
               break;
            }
         }
      }

      if (var3 != 1 && var3 != 5) {
         var0[0] = var0[0] * 5.0 / 2.0;
      } else {
         var0[0] = 2.0 * var0[0];
      }

      if (!var2) {
         var0[0] = -var0[0];
      }
   }

   private static void l6(double[] var0) {
      char var1 = com.aspose.slides.ms.System.z3.l6(com.aspose.slides.internal.x7n.s7.s7().q0());
      boolean var2 = !(var0[0] < 0.0);
      var0[0] = com.aspose.slides.ms.System.q1.n5(var0[0]);
      int var3 = 1;
      if (var0[0] > 1.0) {
         String var4 = com.aspose.slides.ms.System.d2.u9(var0[0]);
         var3 = com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.t9.q0(var4.charAt(0)));
      } else if (var0[0] == 0.0) {
         var0[0] = 0.0;
         return;
      }

      if (var0[0] < 1.0) {
         String var6 = com.aspose.slides.ms.System.d2.u9(var0[0]);

         for (int var5 = 0; var5 < var6.length(); var5++) {
            if (var6.charAt(var5) != '0' && var6.charAt(var5) != var1) {
               var3 = com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.t9.q0(var6.charAt(var5)));
               break;
            }
         }
      }

      if (var3 != 1 && var3 != 2) {
         var0[0] = var0[0] * 2.0 / 5.0;
      } else {
         var0[0] /= 2.0;
      }

      if (!var2) {
         var0[0] = -var0[0];
      }
   }

   static void n5(double var0, double var2, double[] var4, int var5, double var6, double var8, boolean var10, boolean var11, l5 var12) {
      double var13 = var0;
      double var15 = var2;
      int var17 = g6z.u3(var4[0]);
      if (var5 == 1) {
         double var18 = var2;
         if (!var12.c8().isAutomaticMinValue()) {
            var13 = var12.q0();
         } else {
            while (var18 >= var0 || var0 - var18 < var4[0]) {
               var18 = com.aspose.slides.ms.System.q1.n5((double)(var18), var17);
               var13 = var18;
               double var20 = var4[0];
               var18 = g6z.n5(var18, var20);
            }

            if ((!(g6z.n5(var8, var13) > var4[0]) || var13 == 0.0) && (var8 - var2) / (var13 - var2) > 0.9523809523809523 && var13 != 0.0) {
               var13 = com.aspose.slides.ms.System.q1.n5((double)(var13 - var4[0]), var17);
            }
         }
      } else if (var5 == 2) {
         double var24 = var0;
         if (!var12.c8().isAutomaticMaxValue()) {
            var15 = var12.z3();
         } else {
            while (var24 <= var2 || var24 < var2 + var4[0]) {
               var24 = com.aspose.slides.ms.System.q1.n5((double)(var24), var17);
               var15 = var24;
               double var31 = var4[0];
               var24 = g6z.l6(var24, var31);
            }

            if ((!(g6z.n5(var15, var6) > var4[0]) || var15 == 0.0)
               && !ChartTypeCharacterizer.is3DChart(var12.d2().n3().getType())
               && (var6 - var0) / (var15 - var0) > 0.9523809523809523
               && var15 != 0.0) {
               var15 = com.aspose.slides.ms.System.q1.n5((double)(var15 + var4[0]), var17);
            }
         }
      } else {
         double var26 = 0.0;
         if (!var12.c8().isAutomaticMinValue()) {
            var13 = var12.q0();
         } else {
            while (var26 >= var0 || var0 - var26 < var4[0]) {
               var26 = com.aspose.slides.ms.System.q1.n5((double)(var26), var17);
               var13 = var26;
               double var32 = var4[0];
               var26 = g6z.n5(var26, var32);
            }

            if ((!(g6z.n5(var8, var13) > var4[0]) || var13 == 0.0) && (var8 - var2) / (var13 - var2) > 0.9523809523809523 && var13 != 0.0) {
               var13 = com.aspose.slides.ms.System.q1.n5((double)(var13 - var4[0]), var17);
            }
         }

         var26 = 0.0;
         if (!var12.c8().isAutomaticMaxValue()) {
            var15 = var12.q0();
         } else {
            while (var26 <= var2 || var26 < var2 + var4[0]) {
               var26 = com.aspose.slides.ms.System.q1.n5((double)(var26), var17);
               var15 = var26;
               double var33 = var4[0];
               var26 = g6z.l6(var26, var33);
            }

            if ((!(g6z.n5(var15, var6) > var4[0]) || var15 == 0.0) && (var6 - var0) / (var15 - var0) > 0.9523809523809523 && var15 != 0.0) {
               var15 = com.aspose.slides.ms.System.q1.n5((double)(var15 + var4[0]), var17);
            }
         }
      }

      double var30 = var4[0];
      double var34 = (var15 - var13) / var4[0];
      int var22 = ChartTypeCharacterizer.isChartTypeBubble(var12.d2().n3().getType()) ? 10 : 11;
      if (var34 > var22) {
         n5(var4);
      } else {
         l6(var4);
         if (var15 - var13 > 10.0 * var4[0]) {
            var4[0] = var30;
         }
      }
   }

   static void n5(List<Object> var0, com.aspose.slides.internal.o9b.y2 var1, int var2, List<g3y> var3, boolean var4, l5 var5) {
      var0.clear();
      n1g var6 = var5.d2();
      int var7 = n1g.u3(var3);
      if (!ChartTypeCharacterizer.isChartTypeScatter(var2) && !ChartTypeCharacterizer.isChartTypeBubble(var2)) {
         n5(var5);
         if (var5.c8() != null && var5.c8().getCategoryAxisType() == 1) {
            n5(var1.n3(), var2, var3, var4, var5);
         } else {
            List var25 = var5.y4() == 0 ? var6.l6() : var6.k5();
            if (var25.size() > 0) {
               boolean var40 = k5(var25);

               for (int var43 = 0; var43 < var25.size() && var43 < var7; var43++) {
                  x4 var45 = (x4)var25.get_Item(var43);
                  if (var45.k5() && var40) {
                     com.aspose.slides.ms.System.j5 var33 = g6z.n5(com.aspose.slides.ms.System.z3.n3(var45.l6()), false).m3();
                     String var35 = f6z.n5(var33.m3(), var45.u9(), var45.a6());
                     var0.addItem(var35);
                  } else {
                     var0.addItem(var45.l6());
                  }
               }

               for (int var44 = 0; var44 < var3.size(); var44++) {
                  g3y var46 = (g3y)var3.get_Item(var44);
                  if (!ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(var46.u9().getType())) {
                     for (int var34 = 0; var34 < var46.c8().size(); var34++) {
                        var46.c8().get_Item(var34).l6(var34 + 1.0);
                     }
                  }
               }
            } else if (var2 == 26) {
               for (int var39 = 1; var39 <= ((g3y)var3.get_Item(0)).c8().size(); var39++) {
                  var0.addItem(var39);
                  x4 var42 = new x4(null, var39);
                  var25.addItem(var42);
               }
            } else {
               for (int var26 = 1; var26 <= var7; var26++) {
                  var0.addItem(var26);
                  x4 var27 = new x4(null, var26);
                  var25.addItem(var27);
               }

               for (int var38 = 0; var38 < var3.size(); var38++) {
                  g3y var41 = (g3y)var3.get_Item(var38);

                  for (int var28 = 0; var28 < var41.c8().size(); var28++) {
                     var41.c8().get_Item(var28).l6(var28 + 1.0);
                  }
               }
            }

            if (!var5.a0() && !var5.d2().n3().hasDataTable()) {
               var5.u3(1.0);
               var5.a6((double)var7);
            } else {
               var5.u3(0.5);
               var5.a6(var7 + 0.5);
            }

            var5.h0(1.0);
            var5.u9(var5.w1() / 2.0);
         }
      } else {
         double var8 = 0.0;
         double var10 = 0.0;
         double[] var12 = new double[]{0.0};
         double[] var13 = new double[]{0.0};
         k5(var3, var12, var13, var5);
         var8 = var12[0];
         var10 = var13[0];
         if (ChartTypeCharacterizer.isChartTypeBubble(var2) && var8 == 0.0 && var10 == 0.0) {
            var5.h0(1.0);
         }

         for (int var14 = 0; var14 < var3.size(); var14++) {
            g3y var15 = (g3y)var3.get_Item(var14);
            double var16 = 0.0;
            double var18 = 0.0;
            List var20 = new List();
            var20.addItem(var15);
            double[] var21 = new double[]{0.0};
            double[] var22 = new double[]{0.0};
            k5(var20, var21, var22, var5);
            var16 = var21[0];
            var18 = var22[0];
            if (var16 == 0.0 && var18 == 0.0) {
               List var23 = var15.c8();

               for (int var24 = 0; var24 < var23.size(); var24++) {
                  ((t9z)var23.get_Item(var24)).l6(var24 + 1.0);
               }
            }
         }

         var12[0] = var8;
         var13[0] = var10;
         k5(var3, var12, var13, var5);
         var8 = var12[0];
         var10 = var13[0];
         n5(var10, var8, var0, var2, var1.n3(), true, (g3y)var3.get_Item(0), var5);
      }
   }

   private static boolean k5(List<x4> var0) {
      for (int var1 = 0; var1 < var0.size(); var1++) {
         x4 var2 = (x4)var0.get_Item(var1);
         if (com.aspose.slides.internal.v6g.k5.l6(var2.l6(), String.class)) {
            return true;
         }
      }

      return false;
   }

   private static void n5(l5 var0) {
      if (var0.c8() != null && var0.c8().getCategoryAxisType() != 1) {
         n1g var1 = var0.d2();
         List var2;
         if (var0.y4() == 0) {
            var2 = var1.l6();
         } else {
            var2 = var1.k5();
         }

         if (var2.size() > 0) {
            x4 var3 = (x4)var2.get_Item(0);
            if (var3.k5() && n5(var3.u9())) {
               boolean var4 = true;

               for (int var5 = 0; var5 < var2.size(); var5++) {
                  x4 var6 = (x4)var2.get_Item(var5);
                  if (!var6.u3()) {
                     boolean var7 = var6.l6() == null;
                     if (var6.l6().equals("")) {
                        var7 = true;
                     }

                     if (var7) {
                        var4 = false;
                        break;
                     }

                     boolean var8 = com.aspose.slides.internal.v6g.k5.l6(var6.l6(), Double.class)
                        || com.aspose.slides.internal.v6g.k5.l6(var6.l6(), Integer.class)
                        || com.aspose.slides.internal.v6g.k5.l6(var6.l6(), Boolean.class)
                        || com.aspose.slides.internal.v6g.k5.l6(var6.l6(), com.aspose.slides.ms.System.j5.class);
                     if (!var8) {
                        var4 = false;
                        break;
                     }
                  }
               }

               if (var4) {
                  var0.c8().setCategoryAxisType(1);
               }
            }
         }
      }
   }

   private static boolean n5(String var0) {
      if (var0 == null) {
         return false;
      }

      var0 = com.aspose.slides.ms.System.d1.u9(var0);
      return com.aspose.slides.ms.System.d1.c8(var0, "y") != -1
         || com.aspose.slides.ms.System.d1.c8(var0, "d") != -1
         || com.aspose.slides.ms.System.d1.c8(var0, "m") != -1
            && com.aspose.slides.ms.System.d1.c8(var0, "h") == -1
            && com.aspose.slides.ms.System.d1.c8(var0, "s") == -1;
   }

   private static void n5(com.aspose.slides.internal.o9b.y2 var0, int var1, List<g3y> var2, boolean var3, l5 var4) {
      List var5 = var4.h0;
      n1g var6 = var4.d2();
      List var7 = var4.y4() == 0 ? var6.l6() : var6.k5();
      int var8 = n1g.u3(var2);
      boolean var9 = var7.size() == 0;
      List var10 = new List();
      if (var7.size() > 0) {
         while (var7.size() > var8) {
            var7.removeAt(var7.size() - 1);
         }

         for (int var11 = 0; var11 < var7.size(); var11++) {
            x4 var12 = (x4)var7.get_Item(var11);
            if (var12.l6() != null && com.aspose.slides.ms.System.d1.a6(var12.l6().toString(), "#N/A")) {
               var7.removeAt(var11);
               var11--;
            } else {
               int var13 = n5(var12.l6(), false);
               if (var13 >= 0) {
                  var10.addItem(var13);
               } else if (!var12.u3()) {
                  var9 = true;
                  var10.clear();
                  var7.clear();
                  break;
               }
            }
         }
      }

      if (var9) {
         String var18 = "";
         if (var4.c8().getBaseUnitScale() != 1 && var4.c8().getBaseUnitScale() != 0) {
            if (var4.c8().getBaseUnitScale() == 2) {
               var18 = "MMM-yy";
            } else {
               var18 = "yyyy";
            }
         } else {
            var18 = "M/d/yyyy";
         }

         for (int var22 = 1; var22 <= var8; var22++) {
            x4 var25 = new x4(null, var22);
            var25.l6(false);
            var25.n5(var18);
            var7.addItem(var25);
            var10.addItem(var22);
         }
      }

      for (int var20 = 0; var20 < var2.size(); var20++) {
         g3y var23 = (g3y)var2.get_Item(var20);
         int var26 = com.aspose.slides.ms.System.q1.l6(var7.size(), var23.c8().size());

         for (int var14 = 0; var14 < var26; var14++) {
            t9z var15 = var23.c8().get_Item(var14);
            if (var15 != null) {
               x4 var16 = (x4)var7.get_Item(var14);
               int var17 = n5(var16.l6(), false);
               var15.l6(var17);
            }
         }
      }

      List var21 = new List(var10);
      var21.sort();
      if (var4.c8().isAutomaticMaxValue()) {
         var4.a6((double)p4.n5(var4.c8().getBaseUnitScale(), (Integer)var21.get_Item(var21.size() - 1), false));
      }

      if (var4.c8().isAutomaticMinValue()) {
         var4.u3((double)p4.n5(var4.c8().getBaseUnitScale(), (Integer)var21.get_Item(0), false));
      }

      n5(var0.n3(), var3, var9, var4);
      if (var4.c8().isAutomaticMajorUnit() && var4.c8().isAutomaticMinorUnit() && var4.c8().getBaseUnitScale() != 1) {
         var4.u3(var4.c8().getBaseUnitScale());
         var4.a6(1);
         var4.h0(1.0);
         var4.u9(1.0);
         var4.k5(true);
         var4.u3(true);
      }

      int var24 = com.aspose.slides.internal.v6g.k5.u3(var4.q0(), 14);
      int var27 = com.aspose.slides.internal.v6g.k5.u3(var4.z3(), 14);
      int var28 = var24;
      var5.clear();
      var5.addItem(var24);

      for (int var29 = p4.l6(var4.c8().getBaseUnitScale(), var4.m1(), com.aspose.slides.internal.v6g.k5.u3(var4.w1(), 14), var28, false);
         var27 - var29 >= 0;
         var29 = p4.l6(var4.c8().getBaseUnitScale(), var4.m1(), com.aspose.slides.internal.v6g.k5.u3(var4.w1(), 14), var29, false)
      ) {
         var5.addItem(var29);
      }
   }

   static int n5(Object var0, boolean var1) {
      short var2 = -10000;
      if (var0 == null) {
         return var2;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0, String.class)) {
         String var9 = var0.toString();
         if ("".equals(var9)) {
            return var2;
         }

         double var4 = 0.0;
         double[] var6 = new double[]{0.0};
         boolean var7 = com.aspose.slides.ms.System.d2.n5(var9, 7, com.aspose.slides.internal.x7n.l6.u3(), var6);
         var4 = var6[0];
         return var7 ? com.aspose.slides.ms.System.a3.n5(var9) : var2;
      } else {
         if (com.aspose.slides.internal.v6g.k5.l6(var0, Double.class)
            || com.aspose.slides.internal.v6g.k5.l6(var0, Integer.class)
            || com.aspose.slides.internal.v6g.k5.l6(var0, Boolean.class)) {
            return com.aspose.slides.ms.System.z3.h0(var0);
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.ms.System.j5.class)) {
            com.aspose.slides.ms.System.j5 var3 = com.aspose.slides.internal.v6g.k5.u3(var0, com.aspose.slides.ms.System.j5.class).m3();
            return p4.n5(var3.m3(), false);
         }

         try {
            return com.aspose.slides.ms.System.z3.a6(var0);
         } catch (RuntimeException var8) {
            com.aspose.slides.internal.n8e.v4.n5(var8);
            return var2;
         }
      }
   }

   private static void n5(com.aspose.slides.internal.o9b.y2 var0, boolean var1, boolean var2, l5 var3) {
      float var4 = 0.0F;
      String var5 = p4.n5(var3.z3(), var3);
      com.aspose.slides.internal.o9b.f2 var6 = new com.aspose.slides.internal.o9b.f2(var0.t2(), var0.l6());
      boolean var7 = var3.t2();
      com.aspose.slides.internal.o9b.p8 var8 = h6l.k5(var5, 0, var3.k5(), var6.a6(), 1, 1).u3();
      com.aspose.slides.internal.o9b.p8 var9 = h6l.n5("0", var3.k5()).u3();
      float var10;
      float var11;
      if (var1) {
         var10 = var0.l6();
         var11 = var8.k5();
      } else {
         var10 = var0.t2();
         if (var7) {
            var11 = (float)var8.l6() + var9.l6();
         } else if (var3.u9() == 0) {
            var11 = var8.l6();
         } else if (var3.u9() != 90 && var3.u9() != -90) {
            var11 = (float)(var8.k5() / com.aspose.slides.ms.System.q1.h0(com.aspose.slides.ms.System.q1.n5(var3.u9()) * Math.PI / 180.0));
         } else {
            var11 = var8.k5();
         }
      }

      int var12 = var3.c8().getBaseUnitScale();
      int var13 = var3.d5();
      if (var3.m3() && var3.z8()) {
         if (var7 && !var2) {
            var3.u3(1);
            var3.a6(1);
            var3.h0(1.0);
            var3.u9(1.0);

            while (var13 * (var11 + var4) > var10) {
               switch (var3.u9()) {
                  case 0:
                     var3.n5(45);
                     var11 = (float)(var8.k5() / com.aspose.slides.ms.System.q1.h0(com.aspose.slides.ms.System.q1.n5(var3.u9()) * Math.PI / 180.0));
                     break;
                  case 45:
                     var3.n5(90);
                     var11 = var8.k5() * 2.0F;
                     break;
                  case 90:
                     switch (var12) {
                        case 1:
                           if (var3.w1() == 1.0) {
                              var3.h0(2.0);
                           } else if (var3.w1() == 2.0) {
                              var3.h0(7.0);
                           } else {
                              var3.h0(1.0);
                              var12 = 2;
                              var3.u3(2);
                              var3.a6(2);
                           }
                           break;
                        case 2:
                           if (var3.w1() == 1.0) {
                              var3.h0(2.0);
                           } else {
                              var3.h0(1.0);
                              var12 = 3;
                              var3.u3(3);
                              var3.a6(3);
                           }
                           break;
                        case 3:
                           var3.h0(var3.w1() + 1.0);
                     }

                     var3.n5(0);
                     var11 = var8.l6();
                     var13 = var3.h0(var12);
                     if (var13 == 0) {
                        var13 = 1;
                     }

                     var13 = com.aspose.slides.internal.v6g.k5.u3(var13 / var3.w1(), 14);
               }
            }
         } else {
            n5(var3, var13, var11, var10);
         }
      } else if (var3.m3() && !var3.z8()) {
         n5(var13, var2, var3, var11, var10, var8.u3());
      } else if (!var3.m3() && var3.z8()) {
         l6(var13, var2, var3, var11, var10, var8.u3());
      } else {
         k5(var13, var2, var3, var11, var10, var8.u3());
      }
   }

   private static void n5(l5 var0, int var1, float var2, float var3) {
      float var4 = 0.0F;
      if (var1 * (var2 + var4) < var3) {
         var0.h0(1.0);
         var0.u9(1.0);
         var0.u3(var0.c8().getBaseUnitScale());
         var0.a6(var0.c8().getBaseUnitScale());
      } else {
         int var5 = com.aspose.slides.internal.v6g.k5.u3(var3 / (var2 + var4), 13);
         int var6 = var1 % var5 == 0 ? var1 / var5 : var1 / var5 + 1;
         if (var0.c8().getBaseUnitScale() == 1) {
            if (var6 <= 2) {
               var0.h0((double)var6);
               var0.u9(1.0);
               var0.u3(var0.c8().getBaseUnitScale());
               var0.a6(var0.c8().getBaseUnitScale());
            } else if (var6 > 2 && var6 <= 7) {
               var0.h0(7.0);
               var0.u9(1.0);
               var0.u3(var0.c8().getBaseUnitScale());
               var0.a6(var0.c8().getBaseUnitScale());
            } else if (var6 > 7 && var6 <= 14) {
               var0.h0(14.0);
               var0.u9(7.0);
               var0.u3(var0.c8().getBaseUnitScale());
               var0.a6(var0.c8().getBaseUnitScale());
            } else if (var6 > 14 && var6 <= 30) {
               var0.h0(1.0);
               var0.u9(1.0);
               var0.u3(2);
               var0.a6(2);
            } else if (var6 > 30 && var6 <= 360) {
               var0.h0((double)(var6 % 30 == 0 ? var6 / 30 : var6 / 30 + 1));
               var0.u9(com.aspose.slides.internal.v6g.k5.u3(var0.w1() / 2.0, 14) == 0 ? 1.0 : com.aspose.slides.internal.v6g.k5.u3(var0.w1() / 2.0, 14));
               var0.u3(2);
               var0.a6(2);
            } else {
               var0.h0((double)(var6 % 360 == 0 ? var6 / 360 : var6 / 360 + 1));
               var0.u9(com.aspose.slides.internal.v6g.k5.u3(var0.w1() / 2.0, 14) == 0 ? 1.0 : com.aspose.slides.internal.v6g.k5.u3(var0.w1() / 2.0, 14));
               var0.u3(3);
               var0.a6(3);
            }
         } else if (var0.c8().getBaseUnitScale() == 2) {
            if (var6 < 12) {
               var0.h0((double)var6);
               var0.u9(com.aspose.slides.internal.v6g.k5.u3(var0.w1() / 2.0, 14) == 0 ? 1.0 : com.aspose.slides.internal.v6g.k5.u3(var0.w1() / 2.0, 14));
               var0.u3(2);
               var0.a6(2);
            } else {
               var0.h0((double)(var6 % 12 == 0 ? var6 / 12 : var6 / 12 + 1));
               var0.u9(com.aspose.slides.internal.v6g.k5.u3(var0.w1() / 2.0, 14) == 0 ? 1.0 : com.aspose.slides.internal.v6g.k5.u3(var0.w1() / 2.0, 14));
               var0.u3(3);
               var0.a6(3);
            }
         } else {
            var0.h0((double)var6);
            var0.u9(com.aspose.slides.internal.v6g.k5.u3(var0.w1() / 2.0, 14) == 0 ? 1.0 : com.aspose.slides.internal.v6g.k5.u3(var0.w1() / 2.0, 14));
            var0.u3(3);
            var0.a6(3);
         }
      }
   }

   private static void n5(int var0, boolean var1, l5 var2, float var3, float var4, com.aspose.slides.internal.o9b.p8 var5) {
      int var7 = com.aspose.slides.internal.v6g.k5.u3(var2.z3(), 14);
      int var8 = com.aspose.slides.internal.v6g.k5.u3(var2.q0(), 14);
      float var9 = 0.0F;
      boolean var10 = var2.t2();
      int var11 = g6z.n5((float)(p4.n5(var2.k7(), var7, var8, false) / var2.j5()));
      int var6;
      if (!var2.a0() && !var2.d2().n3().hasDataTable()) {
         var6 = var11;
         if (var6 == 0) {
            var6 = 1;
         }
      } else {
         var6 = var11 + 1;
      }

      while (true) {
         if (var6 * (var3 + var9) < var4) {
            var2.u3(var2.k7());
            var2.h0(var2.j5());
            break;
         }

         if (var10 && !var1) {
            if (var2.u9() == 0) {
               var2.n5(45);
               var3 = (float)(var5.k5() / com.aspose.slides.ms.System.q1.h0(com.aspose.slides.ms.System.q1.n5(var2.u9()) * Math.PI / 180.0));
               continue;
            }

            if (var2.u9() == 45) {
               var2.n5(90);
               var3 = var5.k5();
            }
         }

         if (var10 && !var1 && var2.u9() > 0) {
            var3 *= 2.0F;
         }

         int var12 = com.aspose.slides.internal.v6g.k5.u3(var4 / (var3 + var9), 13);
         int var13 = var6 % var12 == 0 ? var6 / var12 : var6 / var12 + 1;
         if (var2.c8().getBaseUnitScale() == 1) {
            if (var13 <= 2) {
               if (var2.k7() > var2.c8().getBaseUnitScale()) {
                  var2.u3(var2.k7());
                  var2.h0(var2.j5());
               } else {
                  var2.u3(var2.c8().getBaseUnitScale());
                  var2.h0((double)var13);
                  if (var2.w1() < var2.j5()) {
                     var2.h0(var2.j5());
                  }
               }
            } else if (var13 > 2 && var13 <= 7) {
               if (var2.k7() > var2.c8().getBaseUnitScale()) {
                  var2.u3(var2.k7());
                  var2.h0(var2.j5());
               } else {
                  var2.u3(var2.c8().getBaseUnitScale());
                  var2.h0(7.0);
                  if (var2.w1() < var2.j5()) {
                     var2.h0(var2.j5());
                  }
               }
            } else if (var13 > 7 && var13 <= 14) {
               if (var2.k7() > var2.c8().getBaseUnitScale()) {
                  var2.u3(var2.k7());
                  var2.h0(var2.j5());
               } else {
                  var2.u3(var2.c8().getBaseUnitScale());
                  var2.h0(14.0);
                  if (var2.w1() < var2.j5()) {
                     var2.h0(var2.j5());
                  }
               }
            } else if (var13 > 14 && var13 <= 30) {
               if (var2.k7() == 3) {
                  var2.u3(var2.k7());
                  var2.h0(var2.j5());
               } else {
                  var2.u3(2);
                  var2.h0(1.0);
                  if (var2.w1() < var2.j5() && var2.k7() == 2) {
                     var2.h0(var2.j5());
                  }
               }
            } else if (var13 > 30 && var13 <= 360) {
               if (var2.k7() == 3) {
                  var2.u3(var2.k7());
                  var2.h0(var2.j5());
               } else {
                  var2.u3(2);
                  var2.h0((double)(var13 % 30 == 0 ? var13 / 30 : var13 / 30 + 1));
                  if (var2.w1() < var2.j5() && var2.k7() == 2) {
                     var2.h0(var2.j5());
                  }
               }
            } else {
               var2.h0((double)(var13 % 360 == 0 ? var13 / 360 : var13 / 360 + 1));
               var2.u3(3);
               if (var2.w1() < var2.j5() && var2.k7() == 3) {
                  var2.h0(var2.j5());
               }
            }
         } else if (var2.c8().getBaseUnitScale() == 2) {
            if (var13 < 12) {
               if (var2.k7() == 2) {
                  if (var2.j5() <= var13) {
                     var2.h0((double)var13);
                     var2.u3(2);
                  } else {
                     var2.h0(var2.j5());
                     var2.u3(2);
                  }
               } else {
                  var2.h0(var2.j5());
                  var2.u3(3);
               }
            } else {
               var13 = var13 % 12 == 0 ? var13 / 12 : var13 / 12 + 1;
               if (var2.k7() == 2) {
                  var2.h0((double)var13);
                  var2.u3(3);
               } else if (var2.j5() <= var13) {
                  var2.h0((double)var13);
                  var2.u3(3);
               } else {
                  var2.h0(var2.j5());
                  var2.u3(3);
               }
            }
         } else {
            if (var2.j5() <= var13) {
               var2.h0((double)var13);
            } else {
               var2.h0(var2.j5());
            }

            var2.u3(3);
         }
         break;
      }
   }

   private static void l6(int var0, boolean var1, l5 var2, float var3, float var4, com.aspose.slides.internal.o9b.p8 var5) {
      boolean var6 = var2.t2();
      int var7 = com.aspose.slides.internal.v6g.k5.u3(var2.z3(), 14);
      int var8 = com.aspose.slides.internal.v6g.k5.u3(var2.q0(), 14);
      float var9 = 0.0F;
      var2.u9(com.aspose.slides.internal.v6g.k5.u3(var2.w1() / 2.0, 14) == 0 ? 1.0 : com.aspose.slides.internal.v6g.k5.u3(var2.w1() / 2.0, 14));
      var2.a6(var2.m1());
      if (var6 && !var1) {
         int var11 = g6z.n5((float)(p4.n5(var2.m1(), var7, var8, false) / var2.w1()));
         int var10;
         if (!var2.a0() && !var2.d2().n3().hasDataTable()) {
            var10 = var11;
            if (var10 == 0) {
               var10 = 1;
            }
         } else {
            var10 = var11 + 1;
         }

         while (var10 * (var3 + var9) > var4) {
            if (var2.u9() == 0) {
               var2.n5(45);
               var3 = (float)(var5.k5() / com.aspose.slides.ms.System.q1.h0(com.aspose.slides.ms.System.q1.n5(var2.u9()) * Math.PI / 180.0));
            } else if (var2.u9() == 45) {
               var2.n5(90);
               break;
            }
         }
      }
   }

   private static void k5(int var0, boolean var1, l5 var2, float var3, float var4, com.aspose.slides.internal.o9b.p8 var5) {
      boolean var6 = var2.t2();
      int var7 = com.aspose.slides.internal.v6g.k5.u3(var2.z3(), 14);
      int var8 = com.aspose.slides.internal.v6g.k5.u3(var2.q0(), 14);
      float var9 = 0.0F;
      if (var6 && !var1) {
         int var10 = g6z.n5(p4.n5(var2.m1(), var7, var8, false));
         if (var10 == 0) {
            var10 = 1;
         }

         while (var10 * (var3 + var9) > var4) {
            if (var2.u9() == 0) {
               var2.n5(45);
               var3 = (float)(var5.k5() / com.aspose.slides.ms.System.q1.h0(com.aspose.slides.ms.System.q1.n5(var2.u9()) * Math.PI / 180.0));
            } else if (var2.u9() == 45) {
               var2.n5(90);
               break;
            }
         }
      }
   }

   static List<Integer> n5(List<x4> var0, boolean var1) {
      List var2 = new List();

      for (int var3 = 0; var3 < var0.size(); var3++) {
         int var4 = n5(((x4)var0.get_Item(var3)).l6(), false);
         var2.addItem(var4);
      }

      return var2;
   }

   static void l6(double var0, double var2, List<Object> var4, int var5, com.aspose.slides.internal.o9b.y2 var6, boolean var7, g3y var8, l5 var9) {
      n1g var10 = var9.d2();
      if (var0 == var2 && var0 == 0.0) {
         var9.a6(10.0);
         var0 = 10.0;
         var9.u3(1.0);
      }

      double var11 = 0.0;
      int var13 = 1;
      boolean var14 = ChartTypeCharacterizer.s7(var8.u9().getType());
      if (var14) {
         if (var0 == 100.0 && var9.c8().isAutomaticMaxValue()) {
            var9.a6(100.0);
         }

         if (var2 >= 1.0 && var9.c8().isAutomaticMinValue()) {
            var9.u3(1.0);
         }
      }

      double var15 = 0.0;
      double var17 = 0.0;
      double[] var19 = new double[]{0.0};
      double[] var20 = new double[]{0.0};
      double[] var21 = new double[]{var2};
      double[] var22 = new double[]{var0};
      double[] var23 = new double[]{0.0};
      int[] var24 = new int[]{1};
      n5(var19, var20, var21, var22, var23, var24, var7, var9);
      var15 = var19[0];
      var17 = var20[0];
      var2 = var21[0];
      var0 = var22[0];
      var11 = var23[0];
      var13 = var24[0];
      n5(var13, var11, var17, var15, var4, var9);
      int var25 = l6(var7, var8, var6.n3(), var9);
      int var26 = 0;
      if (ChartTypeCharacterizer.is3DChart(var10.n3().getType())) {
         if (var7) {
            var26 = com.aspose.slides.internal.v6g.k5.u3(var10.e5().u3(), 13);
         } else {
            var26 = com.aspose.slides.internal.v6g.k5.u3(var10.e5().a6(), 13);
         }
      } else if (var7) {
         var26 = var6.t2();
      } else {
         var26 = var6.l6();
      }

      while (var9.m3() && var4.size() > 3 && var25 > var26 && var26 != 0) {
         n5(var13, ++var11, var17, var15, var4, var9);
         var25 = l6(var7, var8, var6.n3(), var9);
      }

      if (var4.size() >= 2) {
         if (var9.c8().isAutomaticMaxValue()) {
            var9.a6(var9.l6(com.aspose.slides.internal.v6g.k5.u3(var4.get_Item(0), double.class)));
         }

         if (var9.c8().isAutomaticMinValue()) {
            var9.u3(var9.l6(com.aspose.slides.internal.v6g.k5.u3(var4.get_Item(var4.size() - 1), double.class)));
         }

         if (var9.m3()) {
            var9.h0(var9.l6(var11));
         }

         if (var9.z8()) {
            var9.u9(var9.w1());
         }
      }
   }

   private static void n5(double[] var0, double[] var1, double[] var2, double[] var3, double[] var4, int[] var5, boolean var6, l5 var7) {
      var4[0] = 1.0;
      if (!var7.m3() && var7.n5(var7.w1()) != 0.0) {
         var4[0] = var7.n5(var7.w1());
         double var12 = com.aspose.slides.internal.v6g.k5.u3(var2[0], 14);
         double var13 = com.aspose.slides.internal.v6g.k5.u3(var3[0], 14) + var4[0];
         var1[0] = var12;
         var0[0] = var13;
         if (var7.c8().isAutomaticMaxValue() && var7.c8().isAutomaticMinValue()) {
            if (var12 >= 0.0 && var13 >= 0.0) {
               var7.u3(var7.l6(0.0));
               var5[0] = 2;
               var1[0] = 0.0;
            } else {
               var7.u3(var7.l6(var12));
               var5[0] = 2;
               var1[0] = var12;
            }
         } else if (!var7.c8().isAutomaticMaxValue() && var7.c8().isAutomaticMinValue()) {
            var5[0] = 1;
            var0[0] = var7.n5(var7.z3());
            var3[0] = var0[0];
         } else if (var7.c8().isAutomaticMaxValue() && !var7.c8().isAutomaticMinValue()) {
            var5[0] = 2;
            var1[0] = var7.n5(var7.q0());
            var2[0] = var1[0];
         } else {
            var5[0] = 2;
            var1[0] = var7.n5(var7.q0());
            var0[0] = var7.n5(var7.z3());
            var2[0] = var7.n5(var7.q0());
            var3[0] = var7.n5(var7.z3());
         }
      } else {
         double var8 = l6(var2[0]);
         double var10 = n5(var3[0]);
         var1[0] = var8;
         var0[0] = var10;
         if (var7.c8().isAutomaticMaxValue() && var7.c8().isAutomaticMinValue()) {
            if (var8 >= 0.0 && var10 >= 0.0) {
               var7.u3(var7.l6(0.0));
               var5[0] = 2;
               var1[0] = 0.0;
            } else {
               var7.u3(var7.l6(var8));
               var5[0] = 2;
               var1[0] = var8;
            }
         } else if (!var7.c8().isAutomaticMaxValue() && var7.c8().isAutomaticMinValue()) {
            var5[0] = 1;
            var0[0] = var7.n5(var7.z3());
            var3[0] = var0[0];
         } else if (var7.c8().isAutomaticMaxValue() && !var7.c8().isAutomaticMinValue()) {
            var5[0] = 2;
            var1[0] = var7.n5(var7.q0());
            var2[0] = var1[0];
         } else {
            var5[0] = 2;
            var1[0] = var7.n5(var7.q0());
            var0[0] = var7.n5(var7.z3());
            var2[0] = var7.n5(var7.q0());
            var3[0] = var7.n5(var7.z3());
         }
      }
   }

   private static void n5(int var0, double var1, double var3, double var5, List<Object> var7, l5 var8) {
      var7.clear();
      if (var0 == 1) {
         double var9 = var5;

         while (var9 >= var3 || g6z.n5(var3, var9) < var1) {
            if (!var8.c8().isAutomaticMinValue() && var9 < var8.t9()) {
               var7.addItem(var8.t9());
            } else {
               var7.addItem(var9);
            }

            var9 -= var1;
         }
      } else if (var0 == 2) {
         double var11 = var3;

         while (var11 <= var5 || var11 < var5 + var1) {
            if (!var8.c8().isAutomaticMaxValue() && var11 > var8.e2()) {
               var7.addItem(var8.e2());
            } else {
               var7.addItem(var11);
            }

            var11 += var1;
         }

         var7.reverse();
      } else {
         double var12 = 0.0;

         while (var12 <= var5 || g6z.n5(var12, var5) < var1) {
            if (!var8.c8().isAutomaticMaxValue() && var12 > var8.e2()) {
               var7.addItem(var8.e2());
            } else {
               var7.addItem(var12);
            }

            var12 += var1;
         }

         var7.reverse();

         for (double var13 = 0.0 - var1; var13 >= var3 || g6z.n5(var3, var13) < var1; var13 -= var1) {
            if (!var8.c8().isAutomaticMinValue() && var13 < var8.t9()) {
               var7.addItem(var8.t9());
            } else {
               var7.addItem(var13);
            }
         }
      }
   }

   private static int l6(boolean var0, g3y var1, com.aspose.slides.internal.o9b.y2 var2, l5 var3) {
      if (var3.c8().getTickLabelPosition() == 3) {
         return 0;
      }

      t9z var4 = var1.c8().get_Item(0);
      String var5 = var4.u3();
      boolean var6 = false;
      int var14 = 0;

      for (int var8 = 0; var8 < var3.h0.size(); var8++) {
         double var9 = var3.l6(com.aspose.slides.internal.v6g.k5.u3(var3.h0.get_Item(var8), double.class));
         if (ChartTypeCharacterizer.s7(var1.u9().getType())) {
            var9 /= 100.0;
            var5 = "0%";
         }

         String var11 = var3.n3() ? t7k.n5(var9, var5, var6) : p4.n5(var9, var3);
         com.aspose.slides.internal.o9b.p8 var12 = new com.aspose.slides.internal.o9b.p8(var2.t2(), var2.l6());
         com.aspose.slides.internal.o9b.p8 var13 = h6l.l6(var11, var3.u9(), var3.k5(), var12.u3(), 1, 1).u3();
         if (var0) {
            if (var8 != 0 && var8 != var3.h0.size() - 1) {
               var14 += var13.l6();
            } else {
               var14 += var13.l6() / 2;
            }
         } else if (var8 != 0 && var8 != var3.h0.size() - 1) {
            var14 += var13.k5();
         } else {
            var14 += var13.k5() / 2;
         }

         if (var8 != 0 && var8 != var3.h0.size() - 1) {
            var14 -= 2;
         } else {
            var14--;
         }
      }

      return com.aspose.slides.internal.v6g.k5.u3(var14 + 0.5, 14);
   }

   private static double n5(double var0) {
      boolean var2 = !(var0 < 0.0);
      var0 = com.aspose.slides.ms.System.q1.n5(var0);
      if (var2) {
         double var6 = g6z.l6(var0);
         if (var6 != var0) {
            var6++;
         }

         return var6;
      } else {
         double var3 = g6z.l6(var0);
         return -var3;
      }
   }

   private static double l6(double var0) {
      boolean var2 = var0 >= 0.0;
      var0 = com.aspose.slides.ms.System.q1.n5(var0);
      if (!var2) {
         double var3 = g6z.l6(var0);
         if (var3 != var0) {
            var3++;
         }

         return -var3;
      } else {
         return g6z.l6(var0);
      }
   }

   public void n5(o9b var1) {
   }

   public o9b n5() {
      o9b var1 = new o9b();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(o9b var1) {
      return true;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof o9b) ? false : this.l6((o9b)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public o9b Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(o9b bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
