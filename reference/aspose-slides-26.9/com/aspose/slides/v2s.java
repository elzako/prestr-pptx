package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class v2s {
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
         float var15 = var4.u9();
         n5(var2, var5, var6, var11.k5.n5.n3(), var1, var1.q0(), var15);
      }
   }

   static com.aspose.slides.internal.o9b.w1 n5(float var0, float var1, float var2, float var3, boolean var4) {
      float var5 = var1 / 2.0F;
      float var6 = 4.0F;
      if (var4) {
         var3 -= var6;
      } else {
         var3 += var6;
      }

      var0 += var5;
      float var7 = var2 + var3;
      return new com.aspose.slides.internal.o9b.w1(var0, var7);
   }

   static void n5(List<g3y> var0, int var1, int var2, com.aspose.slides.internal.o9b.y2 var3, n1g var4, l5 var5, float var6) {
      com.aspose.slides.internal.o9b.y1 var7 = new com.aspose.slides.internal.o9b.y1(var3.s7(), var3.x8(), var3.t2(), var3.l6());
      n5(var0, var1, var2, var7.y4(), var4, var5, var6);
   }

   static void n5(List<g3y> var0, int var1, int var2, com.aspose.slides.internal.o9b.y1 var3, n1g var4, l5 var5, float var6) {
      g3y var7 = (g3y)var0.get_Item(var1);
      t9z var8 = var7.c8().get_Item(var2);
      f3h var9 = var8.t9();
      if (var9.l6().isVisible() || !com.aspose.slides.ms.System.d1.n5(var9.k5().getText())) {
         if (!com.aspose.slides.ms.System.n1.k5(var9.l6().getY()) || !(var3.n3() < 0.0F) && !(var3.l6() > var4.a0() + var4.y2())) {
            if (ChartTypeCharacterizer.is3DChart(var4.n3().getType())) {
               n5(var3.x8(), var3.n3(), var9, var3.c8().a6(), var4);
               com.aspose.slides.internal.o9b.y2 var10 = var9.k5.n5.n3();
               var3 = new com.aspose.slides.internal.o9b.y1(var10.s7(), var10.x8(), var10.t2(), var10.l6());
            }

            boolean var12;
            List var13;
            List var47;
            if (var5.y4() == 0) {
               IChartCategoryCollection var11 = var4.n3().getChartData().getCategories();
               var12 = var11 != null && var11.size() > 0;
               var47 = var4.l6();
               var13 = var47;
            } else {
               IChartCategoryCollection var48 = var4.n3().getChartData().getSecondaryCategories();
               var12 = var48 != null && var48.size() > 0;
               var47 = var4.k5();
               var13 = var47;
            }

            String var49 = var9.l6().getDataLabelFormat().getNumberFormat();
            boolean var14 = false;
            boolean var15 = var9.l6().getDataLabelFormat().isNumberFormatLinkedToSource() || "General".equals(var9.l6().getDataLabelFormat().getNumberFormat());
            String var16 = var7.k5();
            boolean var17 = false;
            String var19;
            if (ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(var7.u9().getType())) {
               Double var18 = var8.l6();
               var19 = t7k.n5(var18, var49, var14);
               if (var15) {
                  var19 = t7k.n5(var18, var8.u9(), false);
                  var17 = t7k.n5(var18, var8.u9());
               }
            } else if (var12) {
               String var50 = var2 < var47.size() ? ((x4)var13.get_Item(var2)).u9() : "";
               boolean var20 = var2 < var47.size() && ((x4)var13.get_Item(var2)).a6();
               if (var15) {
                  var49 = var50;
                  var14 = var20;
               }

               if (var49 == null) {
                  var49 = var5.c8().getNumberFormat();
               }

               if (var2 < var47.size()) {
                  Object var21 = ((x4)var47.get_Item(var2)).l6();
                  int var22 = o9b.n5(var21, false);
                  Object var23 = ((x4)var13.get_Item(var2)).l6();
                  if (var22 == -1) {
                     var19 = com.aspose.slides.ms.System.d1.n5;
                  } else {
                     var19 = t7k.n5(var23, var49, var14);
                  }

                  if (var15) {
                     var17 = t7k.n5(var21, var49);
                  }
               } else {
                  var19 = com.aspose.slides.ms.System.d1.n5;
               }
            } else {
               var19 = var2 >= var5.h0.size() ? com.aspose.slides.ms.System.d1.n5 : t7k.n5(var5.h0.get_Item(var2), var49, var14);
               if (var2 < var5.h0.size() && var15) {
                  var17 = t7k.n5(var5.h0.get_Item(var2), var49);
               }
            }

            l5 var51 = p4.l6(var5);
            double var24 = var8.n5();
            var24 = var51.c8().isLogarithmic() ? var51.l6(var24) : var24;
            var24 = var51.c8().isLogarithmic() ? var24 : var24 * p4.n5(var51);
            String var52 = t7k.n5(var24, var49, var14);
            boolean var53 = false;
            if (var15) {
               String var26;
               if (var9.l6().c8().getLabels().getDefaultDataLabelFormat().isNumberFormatLinkedToSource()) {
                  var26 = var8.a6();
               } else {
                  var26 = var8.u3();
               }

               var52 = t7k.n5(var24, var26, false);
               var53 = t7k.n5(var24, var8.u3());
            }

            String var56 = t7k.n5(var8.k5(), var49, var14);
            if (var15) {
               var56 = t7k.n5(var56, var8.h0(), false);
            }

            String var27 = ",";
            if (!com.aspose.slides.ms.System.d1.n5(var9.l6().getDataLabelFormat().getSeparator())) {
               var27 = var9.l6().getDataLabelFormat().getSeparator();
            }

            com.aspose.slides.internal.o9b.n3 var28 = var9.t2();
            com.aspose.slides.internal.o9b.c8 var29 = var9.s7().o8();
            int var30 = com.aspose.slides.internal.v6g.k5.u3(var9.h0(), 13);
            com.aspose.slides.internal.o9b.f2 var31 = z7d.n5(var4).a6();
            int var32 = com.aspose.slides.internal.v6g.k5.u3(var3.x8(), 13);
            int var33 = com.aspose.slides.internal.v6g.k5.u3(var3.n3(), 13);
            int var34 = com.aspose.slides.internal.v6g.k5.u3(var3.s7(), 13);
            int var35 = com.aspose.slides.internal.v6g.k5.u3(var3.k5(), 13);
            IDataLabelFormat var36 = var9.l6().getDataLabelFormat();
            byte var37 = 3;
            int var38 = var36.getShowLegendKey() ? var32 - var37 : var32;
            int var39 = var33 - var37;
            int var40 = var36.getShowLegendKey() ? var34 + 2 * var37 : var34;
            int var41 = var35 + 2 * var37;
            var9.k5.n5 = new com.aspose.slides.internal.o9b.y2(var38, var39, var40, var41);
            var9.k5.n5();
            if (var36.getShowLegendKey()) {
               com.aspose.slides.internal.o9b.y1 var42 = new com.aspose.slides.internal.o9b.y1(var3.x8(), var3.n3(), var31.l6(), var31.k5());
               z7d.n5(var42.y4(), var7, var8);
               var32 += com.aspose.slides.internal.v6g.k5.u3(var31.l6(), 13);
               var34 -= com.aspose.slides.internal.v6g.k5.u3(var31.l6(), 13);
            }

            String var57 = com.aspose.slides.ms.System.d1.n5;
            if (com.aspose.slides.ms.System.d1.n5(var9.k5().getText())) {
               if (var36.getShowSeriesName()) {
                  var57 = com.aspose.slides.ms.System.d1.n5(var57, var16);
               }

               if (var36.getShowCategoryName()) {
                  if (!com.aspose.slides.ms.System.d1.n5(var57)) {
                     var57 = com.aspose.slides.ms.System.d1.n5(var57, var27);
                  }

                  var57 = com.aspose.slides.ms.System.d1.n5(var57, var19);
               }

               if (var36.getShowValue()) {
                  if (!com.aspose.slides.ms.System.d1.n5(var57)) {
                     var57 = com.aspose.slides.ms.System.d1.n5(var57, var27);
                  }

                  var57 = com.aspose.slides.ms.System.d1.n5(var57, var52);
               }

               if (var36.getShowBubbleSize() && ChartTypeCharacterizer.isChartTypeBubble(var7.u9().getType())) {
                  if (!com.aspose.slides.ms.System.d1.n5(var57)) {
                     var57 = com.aspose.slides.ms.System.d1.n5(var57, var27);
                  }

                  var57 = com.aspose.slides.ms.System.d1.n5(var57, var56);
               }
            } else {
               var57 = var9.k5().getText();
            }

            com.aspose.slides.internal.o9b.y2 var43 = new com.aspose.slides.internal.o9b.y2(var32, var33, var34, var35);
            if (var17 || var53) {
               com.aspose.slides.internal.o9b.c8.z0().n5(var29);
            }

            byte var44 = 1;
            e3m var45 = new e3m(var57, com.aspose.slides.internal.o9b.y1.n5(var43).y4(), 2, var44, var28, var29.o8());
            h3d var46 = new h3d(var9.e2(), var9.t9(), var30);
            j9e.n5(var45, var46, var4, var6);
         }
      }
   }

   private static void n5(float var0, float var1, f3h var2, com.aspose.slides.internal.o9b.f2 var3, n1g var4) {
      if (var2.n3()) {
         var2.k5.n5 = new com.aspose.slides.internal.o9b.y2(g6z.k5(var0), g6z.k5(var1), g6z.n5(var3.l6()), g6z.n5(var3.k5()));
         float var5 = (float)var2.k5.n5.s7() + var2.k5.n5.t2();
         float var6 = var4.n3().getX() + var4.n3().getWidth();
         if (var5 > var6) {
            var2.k5.n5.l6(com.aspose.slides.internal.v6g.k5.u3(var2.k5.n5.t2() - (var5 - var6), 13));
         }
      } else {
         var0 = var0 >= 0.0F ? var0 : var4.y1();
         var1 = var1 >= 0.0F ? var1 : var4.a0();
         var0 = var0 + var3.l6() <= var4.y1() + var4.c4() ? var0 : var4.c4() - var3.l6() + var4.y1();
         var1 = var1 + var3.k5() <= var4.a0() + var4.y2() ? var1 : var4.y2() - var3.k5() + var4.a0();
         float var11 = var2.l6().getX();
         float var12 = var2.l6().getY();
         if (ChartTypeCharacterizer.isChartTypeBar(var2.n5().n3().getType())) {
            if (var2.n5().q0().c8() != null && var2.n5().q0().c8().isPlotOrderReversed()) {
               var12 *= -1.0F;
            }

            if (var2.n5().m1().c8() != null && var2.n5().m1().c8().isPlotOrderReversed()) {
               var11 *= -1.0F;
            }
         }

         if (ChartTypeCharacterizer.isChartTypeColumn(var2.n5().n3().getType())) {
            if (var2.n5().q0().c8() != null && var2.n5().q0().c8().isPlotOrderReversed()) {
               var11 *= -1.0F;
            }

            if (var2.n5().m1().c8() != null && var2.n5().m1().c8().isPlotOrderReversed()) {
               var12 *= -1.0F;
            }
         }

         var2.k5.n5 = new com.aspose.slides.internal.o9b.y2(
            com.aspose.slides.internal.v6g.k5.u3(g6z.k5(var0) + var4.c4() * var11, 13),
            g6z.k5(var1) + com.aspose.slides.internal.v6g.k5.u3(var4.y2() * var12, 13),
            g6z.n5(var3.l6()),
            g6z.n5(var3.k5())
         );
      }
   }
}
