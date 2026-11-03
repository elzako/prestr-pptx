package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class z6e {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "chart:bar",
      "chart:column",
      "chart:circle",
      "chart:ring",
      "chart:area",
      "chart:line",
      "chart:scatter",
      "chart:bubble",
      "chart:radar",
      "chart:filled-radar",
      "chart:stock"
   );

   public static Chart n5(ShapeCollection var0, com.aspose.slides.internal.k4y.b4f var1, com.aspose.slides.internal.k4y.n6k var2, z5q var3) {
      if (var0 == null) {
         throw new ArgumentNullException("shapes");
      }

      if (var2 == null) {
         throw new ArgumentNullException("objectElement");
      }

      com.aspose.slides.internal.o9b.y1 var4 = t2f.n5(var1.c8(), var1.t2(), var1.s7(), var1.x8()).y4();
      Chart var5 = null;
      String var6 = var2.n5();
      if (t2f.k5(var6) && com.aspose.slides.ms.System.d1.t2(var6, "Object")) {
         var6 = com.aspose.slides.ms.System.d1.n5(var6, "./", "");
         com.aspose.slides.internal.c8m.z5 var7 = var3.l6(com.aspose.slides.ms.System.d1.n5(new String[]{var6, "/styles.xml"}));
         if (var7 != null) {
            e8p var8 = new e8p(var7, var3);
            var8.n5();
         }

         String var23 = com.aspose.slides.ms.System.d1.n5(com.aspose.slides.internal.z0k.z1.l6(var6, "content.xml"), "\\", "/");
         com.aspose.slides.internal.c8m.z5 var9 = var3.l6(var23);
         if (var9 == null) {
            return null;
         }

         h3r var10 = new h3r(var9, var3);

         com.aspose.slides.internal.k4y.y9t var11;
         try {
            var11 = var10.n5();
         } catch (RuntimeException var21) {
            return null;
         }

         if (var11 == null) {
            return null;
         }

         com.aspose.slides.internal.k4y.r1l var12 = var11.k5();
         if (var12 == null || !"chart".equals(var12.n5().n5())) {
            return null;
         }

         h6j var13 = new h6j(var3, var11.l6());
         com.aspose.slides.internal.k4y.a5l var14 = com.aspose.slides.internal.v6g.k5.n5(var12.n5().l6(), com.aspose.slides.internal.k4y.a5l.class);
         if (var14 == null) {
            return null;
         }

         com.aspose.slides.internal.k4y.g5t var15 = var14.n5();
         if (var15 == null) {
            return null;
         }

         com.aspose.slides.internal.k4y.r6d var16 = var15.c8();
         com.aspose.slides.internal.k4y.y2i var17 = n7n.n5(var16.n5(), var13);
         com.aspose.slides.internal.k4y.a8k var18 = null;
         if (var17 != null) {
            var18 = t2f.n5(com.aspose.slides.internal.k4y.a8k.class, "chart-properties", var17.u3());
         }

         com.aspose.slides.internal.k4y.a8k var19 = null;
         if (var16.k5().length > 0) {
            var17 = n7n.n5(var16.k5()[0].a6(), var13);
            if (var17 != null) {
               var19 = t2f.n5(com.aspose.slides.internal.k4y.a8k.class, "chart-properties", var17.u3());
            }
         }

         var5 = var0.n5(n5(var15.n5(), var16, var18, var19));
         var5.setFrame(new ShapeFrame(var4.x8(), var4.n3(), var4.s7(), var4.k5(), (byte)0, (byte)0, 0.0F));
         com.aspose.slides.internal.v6g.k5.n5(var5.getChartData().getCategories(), ChartCategoryCollection.class).l6(true);
         n5(var5.getChartData(), var15.t2(), var5.getType());
         n5(var5.getFillFormat(), var5.getLineFormat(), var5.getTextFormat(), var15.u3(), var13);
         com.aspose.slides.internal.k4y.a6g var20 = var15.a6();
         if (var20 != null) {
            var5.setTitle(true);
            n5(var5.getChartTitle(), var15.a6(), var15.u9(), var13);
         }

         n5(var5, var15.h0(), var13);
         n5(var5, var16, var18, var19, var13);
         if (var18 != null && (var18.a0() != 1 || var18.y1() != 1)) {
            n5(com.aspose.slides.internal.v6g.k5.n5(var5.getPlotArea(), ChartPlotArea.class), var16, var15);
         }
      }

      return var5;
   }

   private static void n5(IChartData var0, com.aspose.slides.internal.k4y.y7e var1, int var2) {
      ChartDataWorksheet var3 = (ChartDataWorksheet)var0.getChartDataWorkbook().getWorksheets().get_Item(0);
      String var4 = var1.n5();
      if (var4 == null) {
         var4 = "local-table";
      }

      var3.n5(var4);
      int var5 = 0;
      int[] var6 = new int[]{0};
      n5(var3, var1.s7(), var6);
      var5 = var6[0];
      x6s var7 = var3.l6();
      if (var7.u3() > 0 && var7.l6() > 0) {
         if (ChartTypeCharacterizer.isChartTypeStock(var2) || ChartTypeCharacterizer.isChartTypeBubble(var2)) {
            return;
         }

         com.aspose.slides.internal.l7h.a5 var8 = new com.aspose.slides.internal.l7h.a5(var3.getName());
         var8.n5("!");
         var8.n5(var7.l6(0, 0).a6());
         var8.n5(":");
         var8.n5(var7.l6(var7.l6(), var7.u3()).a6());
         var0.setRange(var8.toString());
         if (var0.getSeriesGroups().size() > 1) {
            r7n var9 = (r7n)var0.getSeriesGroups();
            m4d var10 = (m4d)var9.get_Item(0).getSeries();

            for (int var11 = 1; var11 < var0.getSeries().size(); var11++) {
               ChartSeries var12 = (ChartSeries)var0.getSeries().get_Item(var11);
               var9.l6(var12);
               var10.n5(var12);
            }
         }
      }
   }

   private static void n5(ChartDataWorksheet var0, List<com.aspose.slides.internal.k4y.g7> var1, int[] var2) {
      List$Enumerator var3 = var1.iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var4 = (com.aspose.slides.internal.k4y.g7)var3.next();
            com.aspose.slides.internal.k4y.w1x var5 = com.aspose.slides.internal.v6g.k5.n5(var4.l6(), com.aspose.slides.internal.k4y.w1x.class);
            if (var5 == null) {
               com.aspose.slides.internal.k4y.u1j var6 = com.aspose.slides.internal.v6g.k5.n5(var4.l6(), com.aspose.slides.internal.k4y.u1j.class);
               if (var6 != null) {
                  var5 = var6.n5();
               } else {
                  com.aspose.slides.internal.k4y.h6i var7 = com.aspose.slides.internal.v6g.k5.n5(var4.l6(), com.aspose.slides.internal.k4y.h6i.class);
                  if (var7 != null) {
                     n5(var0, var7.n5(), var2);
                  }
               }
            }

            if (var5 != null) {
               n5(var0, var2[0], var5);
               var2[0]++;
            } else {
               com.aspose.slides.internal.k4y.p0w var11 = com.aspose.slides.internal.v6g.k5.n5(var4.l6(), com.aspose.slides.internal.k4y.p0w.class);
               if (var11 != null) {
                  n5(var0, var11.n5(), var2);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private static void n5(IChartTitle var0, com.aspose.slides.internal.k4y.a6g var1, com.aspose.slides.internal.k4y.o7o var2, h6j var3) {
      var0.setOverlay(false);
      h2k var4 = h2k.n5(var1.n5(), 12);
      if (var0.getTextFrameForOverriding() == null) {
         var0.addTextFrameForOverriding("");
         var0.getTextFrameForOverriding().getParagraphs().clear();
      }

      n5((TextFrame)var0.getTextFrameForOverriding(), var1.l6(), var3, var4);
      if (var2 != null) {
         n5((TextFrame)var0.getTextFrameForOverriding(), var2.n5(), var3, var4);
      }

      n5(var0.getFormat().getFill(), var0.getFormat().getLine(), null, var1.n5(), var3);
   }

   private static void n5(Chart var0, com.aspose.slides.internal.k4y.r3w var1, h6j var2) {
      if (var1 == null) {
         var0.setLegend(false);
      } else {
         Legend var3 = com.aspose.slides.internal.v6g.k5.n5(var0.getLegend(), Legend.class);
         switch (var1.n5()) {
            case 1:
               var3.setPosition(1);
               break;
            case 2:
               var3.setPosition(2);
               break;
            case 3:
               var3.setPosition(3);
               break;
            case 4:
               var3.setPosition(0);
               break;
            case 5:
            case 7:
               var3.setPosition(4);
               break;
            case 6:
            default:
               var3.setPosition(2);
         }

         var3.setOverlay(var1.k5() == 1);
         n5(var3.getFormat().getFill(), var3.getFormat().getLine(), var3.getTextFormat(), var1.l6(), var2);
      }
   }

   private static void n5(
      Chart var0, com.aspose.slides.internal.k4y.r6d var1, com.aspose.slides.internal.k4y.a8k var2, com.aspose.slides.internal.k4y.a8k var3, h6j var4
   ) {
      ChartDataWorkbook var5 = (ChartDataWorkbook)var0.getChartData().getChartDataWorkbook();
      ChartPlotArea var6 = com.aspose.slides.internal.v6g.k5.n5(var0.getPlotArea(), ChartPlotArea.class);
      int var7 = var0.getType();
      boolean var8 = ChartTypeCharacterizer.isChartTypePie(var7);
      boolean var9 = ChartTypeCharacterizer.isChartTypeDoughnut(var7);
      boolean var10 = ChartTypeCharacterizer.is3DChart(var7);
      if (!var8 && !var9 && !ChartTypeCharacterizer.isChartTypeRadar(var7)) {
         com.aspose.slides.internal.k4y.h2i var11 = var1.h0();
         if (var11 != null) {
            IFormat var12 = var10 ? var0.getBackWall().getFormat() : var6.getFormat();
            n5(var12.getFill(), var12.getLine(), null, var11.n5(), var4);
         }
      } else {
         long var13 = var3.s7();
         if ((var13 & 4294967295L) > 0L) {
            var0.getChartData().getSeries().get_Item(0).setExplosion(var8 ? (int)var13 : 15);
         }
      }

      if (var10) {
         ((Format)var0.getSideWall().getFormat()).n5(var0.getBackWall().getFormat());
         com.aspose.slides.internal.k4y.s1a var32 = var1.c8();
         if (var32 != null) {
            IFormat var34 = var0.getFloor().getFormat();
            n5(var34.getFill(), var34.getLine(), null, var32.n5(), var4);
         }
      }

      if (ChartTypeCharacterizer.isChartTypeStock(var7)) {
         n5(var0, var5, var1, var4);
      } else {
         boolean var33 = ChartTypeCharacterizer.isChartTypeBubble(var7);
         ChartSeriesGroup var35 = null;
         ChartSeriesGroup var15 = null;
         String var16 = "";
         String var17 = "";
         int var18 = 0;

         for (com.aspose.slides.internal.k4y.m4k var22 : var1.k5()) {
            IChartSeries var23 = null;
            if (var33) {
               var23 = var0.getChartData().getSeries().add(var7);
               int var24 = 0;

               for (com.aspose.slides.internal.k4y.a4l var28 : var22.h0()) {
                  String var29 = var28.n5();
                  if (!com.aspose.slides.ms.System.d1.n5(var29)) {
                     if (var24 == 0) {
                        var17 = n5(var29);
                     } else {
                        var16 = n5(var29);
                     }

                     var24++;
                  }
               }

               n5(var23, var16, var17, var5, var22);
            } else {
               if (var18 >= var0.getChartData().getSeries().size()) {
                  continue;
               }

               var23 = var0.getChartData().getSeries().get_Item(var18);
            }

            if (var18 == 0) {
               var35 = (ChartSeriesGroup)var0.getChartData().getSeriesGroups().get_Item(0);
            }

            if ("chart:line".equals(var22.k5()) && !ChartTypeCharacterizer.isChartTypeLine(var23.getType())) {
               var23.setType(19);
            }

            String var38 = var22.u3();
            if (!com.aspose.slides.ms.System.d1.n5(var38) && com.aspose.slides.ms.System.d1.l6(var38, "secondary-")) {
               var23.setPlotOnSecondAxis(true);
               var15 = (ChartSeriesGroup)var23.getParentSeriesGroup();
               var15.setGapWidth(var35.getGapWidth());
               var15.setOverlap(var35.getOverlap());
            }

            var23.setInvertIfNegative(true);
            if (var2 != null && var2.t2() > 1) {
               ((ChartSeries)var23).l6(true);
            }

            String var39 = n5(var22.l6());
            if (!com.aspose.slides.ms.System.d1.n5(var39)) {
               IChartCellCollection var40 = var5.getCellCollection(var39, true);
               if (var40.getCount() > 0) {
                  var23.getName().setFromOneCell(var40.get_Item(0));
               }
            }

            var23.getRelatedLegendEntry().setHide(var22.u9() == 1);
            n5(var23.getFormat().getFill(), var23.getFormat().getLine(), null, var22.a6(), var4);
            n5(var23.getMarker(), var22.a6(), var4);
            n5(var23, var8 || var9, var22, var4);
            var18++;
         }

         n5(var0, var1, var35, var15, var4);
         if (var7 == 47 || var9) {
            n5(var0.getChartData());
         }

         if (var8 || var9) {
            var35 = (ChartSeriesGroup)var0.getChartData().getSeriesGroups().get_Item(0);
            if (var9) {
               var35.setDoughnutHoleSize((byte)30);
            }

            long var30 = var2.c4();
            if ((var30 & 4294967295L) != 4294967295L) {
               var35.setFirstSliceAngle((int)((360L - (var30 & 4294967295L) & 4294967295L) + 90L & 4294967295L & 65535L));
            }
         }

         if (var10) {
            var35.setGapDepth(100);
            IRotation3D var36 = var0.getRotation3D();
            var36.setPerspective((byte)30);
            var36.setDepthPercents(100);
            var36.setRightAngleAxes(true);
            if (var8) {
               var36.setRotationX((byte)30);
               var36.setRotationY(0);
            } else {
               var36.setRotationX((byte)11);
               var36.setRotationY(25);
            }
         }
      }
   }

   private static void n5(Chart var0, ChartDataWorkbook var1, com.aspose.slides.internal.k4y.r6d var2, h6j var3) {
      IChartData var4 = var0.getChartData();
      com.aspose.slides.internal.k4y.u2l var5 = null;

      for (com.aspose.slides.internal.k4y.m3z var9 : var2.l6()) {
         var5 = var9.a6();
         if (var5 != null) {
            break;
         }
      }

      if (var5 != null) {
         String var21 = n5(var5.n5());
         if (!com.aspose.slides.ms.System.d1.n5(var21)) {
            List var23 = var1.u3(var21);
            if (var23.size() == 0) {
               return;
            }

            g1p var25 = (g1p)var23.get_Item(0);

            for (int var27 = var25.a6(); var27 <= var25.h0(); var27++) {
               var4.getCategories().add(var1.getCell(var25.n5(), var27, var25.l6()));
            }
         }
      }

      com.aspose.slides.internal.k4y.m4k var22 = null;
      com.aspose.slides.internal.k4y.m4k var24 = null;
      com.aspose.slides.internal.k4y.m4k var26 = null;
      com.aspose.slides.internal.k4y.m4k var28 = null;
      com.aspose.slides.internal.k4y.m4k var10 = null;
      int var11 = var2.k5().length;
      int var12 = 0;

      for (com.aspose.slides.internal.k4y.m4k var16 : var2.k5()) {
         if ("chart:bar".equals(var16.k5())) {
            var11--;
            var22 = var16;
         } else {
            if (var12 == 0) {
               if (var11 == 4) {
                  var24 = var16;
               } else {
                  var28 = var16;
               }
            } else if (var12 == 1) {
               if (var11 == 4) {
                  var28 = var16;
               } else {
                  var26 = var16;
               }
            } else if (var12 == 2) {
               if (var11 == 4) {
                  var26 = var16;
               } else {
                  var10 = var16;
               }
            } else {
               var10 = var16;
            }

            var12++;
         }
      }

      boolean var29 = false;
      if (var22 != null) {
         var29 = true;
         n5(var4, var1, 0, true, false, var22, var3);
      }

      boolean var30 = false;
      if (var24 != null) {
         var30 = true;
         n5(var4, var1, 59, var29, false, var24, var3);
      }

      if (var26 != null) {
         n5(var4, var1, var30 ? 59 : 58, var29, false, var26, var3);
      }

      IChartSeries var31 = null;
      ChartSeriesGroup var32 = null;
      if (var28 != null) {
         var31 = n5(var4, var1, var30 ? 59 : 58, var29, false, var28, var3);
         if (var10 == null) {
            throw new NullPointerException("Close Series Element can't be null.");
         }

         if (var31 == null) {
            throw new NullPointerException("Series can't be null.");
         }

         String var17 = var10.u3();
         if (!com.aspose.slides.ms.System.d1.n5(var17) && com.aspose.slides.ms.System.d1.l6(var17, "secondary-")) {
            var32 = (ChartSeriesGroup)var31.getParentSeriesGroup();
         }
      }

      if (var10 != null) {
         var31 = n5(var4, var1, var30 ? 59 : 58, var29, true, var10, var3);
      }

      if (var30) {
         IUpDownBarsManager var33 = var32 != null ? var32.getUpDownBars() : var4.getSeriesGroups().get_Item(0).getUpDownBars();
         var33.setGapWidth(100);
         var33.setUpDownBars(true);
         com.aspose.slides.internal.k4y.k2a var18 = var2.u3();
         if (var18 != null) {
            com.aspose.slides.internal.k4y.y2i var19 = n5(var33.getUpBarsFormat().getFill(), var33.getUpBarsFormat().getLine(), null, var18.n5(), var3);
            if (var19 == null) {
               throw new NullPointerException("Style Graphic can't be null.");
            }

            com.aspose.slides.internal.k4y.p3w var20 = t2f.n5(com.aspose.slides.internal.k4y.p3w.class, "graphic-properties", var19.u3());
            if (var20 != null && var20.n5() == 0 && com.aspose.slides.ms.System.d1.n5(var20.u3())) {
               var33.getUpBarsFormat().getLine().getFillFormat().setFillType((byte)1);
               ((ColorFormat)var33.getUpBarsFormat().getLine().getFillFormat().getSolidFillColor()).n5(com.aspose.slides.internal.o9b.c8.m3().o8());
            }
         }

         com.aspose.slides.internal.k4y.t3n var36 = var2.a6();
         if (var36 != null) {
            n5(var33.getDownBarsFormat().getFill(), var33.getDownBarsFormat().getLine(), null, var36.n5(), var3);
         }
      }

      com.aspose.slides.internal.k4y.q8v var34 = var2.u9();
      if (var34 != null) {
         ILineFormat var35 = var32 != null ? var32.getHiLowLinesFormat().getLine() : var4.getSeriesGroups().get_Item(0).getHiLowLinesFormat().getLine();
         n5(null, var35, null, var2.u9().n5(), var3);
         if (!var30 && var31 != null) {
            IMarker var37 = var31.getMarker();
            var37.setSymbol(1);
            var37.setSize(10);
            var37.getFormat().getLine().getFillFormat().setFillType((byte)0);
            var37.getFormat().getFill().setFillType((byte)1);
            ((ColorFormat)var37.getFormat().getFill().getSolidFillColor()).n5(((ColorFormat)var35.getFillFormat().getSolidFillColor()).u3().o8());
         }
      }

      n5(var0, var2, (ChartSeriesGroup)var4.getSeriesGroups().get_Item(0), var32, var3);
   }

   private static IChartSeries n5(
      IChartData var0, ChartDataWorkbook var1, int var2, boolean var3, boolean var4, com.aspose.slides.internal.k4y.m4k var5, h6j var6
   ) {
      String var7 = n5(var5.n5());
      if (com.aspose.slides.ms.System.d1.n5(var7)) {
         return null;
      }

      IChartSeries var8 = var0.getSeries().add(var2);
      String var9 = n5(var5.l6());
      if (!com.aspose.slides.ms.System.d1.n5(var9)) {
         IChartCellCollection var10 = var1.getCellCollection(var9, true);
         if (var10.getCount() > 0) {
            var8.getName().setFromOneCell(var10.get_Item(0));
         }
      }

      n5(var1, var8, n5(var5.n5()), new z6e$1());
      n5(var8.getFormat().getFill(), var8.getFormat().getLine(), null, var5.a6(), var6);
      if (var2 != 0) {
         var8.getFormat().getLine().getFillFormat().setFillType((byte)0);
         ((ChartSeries)var8).l6(true);
         var8.getMarker().setSymbol(4);
         if (!var4) {
            var8.getRelatedLegendEntry().setHide(true);
         }

         if (var3) {
            var8.setPlotOnSecondAxis(true);
         }
      }

      return var8;
   }

   private static void n5(IChartSeries var0, String var1, String var2, ChartDataWorkbook var3, com.aspose.slides.internal.k4y.m4k var4) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         var0.getDataPoints().setDataSourceTypeForXValues(2);
      }

      var0.getDataPoints().setDataSourceTypeForYValues(0);
      var0.getDataPoints().setDataSourceTypeForBubbleSizes(0);
      n5(var3, var0, var2, new z6e$2());
      n5(var3, var0, var1, new z6e$3());
      n5(var3, var0, n5(var4.n5()), new z6e$4());
   }

   private static void n5(IChartSeries var0, boolean var1, com.aspose.slides.internal.k4y.m4k var2, h6j var3) {
      int[] var4 = new int[]{0};
      ChartDataPointCollection var5 = (ChartDataPointCollection)var0.getDataPoints();

      for (com.aspose.slides.internal.k4y.x6b var9 : var2.c8()) {
         ChartDataPoint var10 = com.aspose.slides.internal.v6g.k5.n5(var5.n5(new z6e$5(var4)), ChartDataPoint.class);
         if (var10 == null) {
            var10 = (ChartDataPoint)var5.n5();
            var10.n5(var4[0] & 4294967295L);
         }

         com.aspose.slides.internal.k4y.y2i var11 = n5(var10.getFormat().getFill(), var10.getFormat().getLine(), null, var9.n5(), var3);
         if (var11 != null && var1) {
            com.aspose.slides.internal.k4y.a8k var12 = t2f.n5(com.aspose.slides.internal.k4y.a8k.class, "chart-properties", var11.u3());
            long var13 = var12.s7();
            if ((var13 & 4294967295L) > 0L) {
               var10.setExplosion((int)var13);
            }
         }

         var4[0]++;
      }
   }

   private static void n5(IMarker var0, String var1, h6j var2) {
      Format var3 = new Format((Marker)var0);
      com.aspose.slides.internal.k4y.y2i var4 = n5(var3.getFill(), var3.getLine(), null, var1, var2);
      if (var4 != null) {
         com.aspose.slides.internal.k4y.a8k var5 = t2f.n5(com.aspose.slides.internal.k4y.a8k.class, "chart-properties", var4.u3());
         if (var5 != null && var5.l6() != 0) {
            switch (var5.l6()) {
               case 1:
                  var0.setSymbol(4);
                  return;
               case 3:
                  var0.setSymbol(n5(var5.k5()));
                  break;
               default:
                  var0.setSymbol(-1);
            }

            double var6 = t2f.u9(var5.u3());
            if (com.aspose.slides.ms.System.d2.k5(var6)) {
               var6 = t2f.u9(var5.a6());
            }

            if (!com.aspose.slides.ms.System.d2.k5(var6)) {
               var0.setSize(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var6), 14));
            }

            ((Format)var0.getFormat()).n5(var3);
            FillFormat var8 = (FillFormat)var0.getFormat().getFill();
            LineFormat var9 = (LineFormat)var0.getFormat().getLine();
            if (var8.getFillType() == 1 && (var0.getSymbol() == 10 || var0.getSymbol() == 6 || var0.getSymbol() == 8)) {
               var9.setWidth(1.5);
               var9.getFillFormat().setFillType((byte)1);
               var9.getFillFormat().getSolidFillColor().copyFrom(var8.getSolidFillColor());
               var8.setFillType((byte)0);
            }
         }
      }
   }

   private static void n5(Chart var0, com.aspose.slides.internal.k4y.r6d var1, ChartSeriesGroup var2, ChartSeriesGroup var3, h6j var4) {
      IAxesManager var5 = var0.getAxes();
      boolean var6 = false;
      boolean var7 = false;

      for (com.aspose.slides.internal.k4y.m3z var11 : var1.l6()) {
         switch (var11.n5()) {
            case 1:
               n5(var5.getHorizontalAxis(), var5.getSecondaryHorizontalAxis(), var2, var3, var11, var4);
               if (com.aspose.slides.ms.System.d1.l6(var11.l6(), "secondary-")) {
                  var6 = true;
               }
               break;
            case 2:
               n5(var5.getVerticalAxis(), var5.getSecondaryVerticalAxis(), var2, var3, var11, var4);
               if (com.aspose.slides.ms.System.d1.l6(var11.l6(), "secondary-")) {
                  var7 = true;
               }
               break;
            case 3:
               IAxis var12 = var5.getSeriesAxis();
               if (var12 != null) {
                  n5(var12, null, var2, var3, var11, var4);
                  ((Axis)var12).n5().u3(((Axis)var5.getHorizontalAxis()).n5().c8());
               }
         }
      }

      if (var6 && !var7 && var5.getSecondaryVerticalAxis() != null) {
         var5.getSecondaryVerticalAxis().setVisible(false);
      }

      if (var7 && !var6 && var5.getSecondaryHorizontalAxis() != null) {
         var5.getSecondaryHorizontalAxis().setVisible(false);
      }
   }

   private static void n5(IAxis var0, IAxis var1, ChartSeriesGroup var2, ChartSeriesGroup var3, com.aspose.slides.internal.k4y.m3z var4, h6j var5) {
      boolean var6 = var4.n5() == 2;
      if (com.aspose.slides.ms.System.d1.l6(var4.l6(), "primary-")) {
         if (var0 != null) {
            n5(var0, var6, false, var2, var4, var5);
         }

         if (var1 != null) {
            n5(var1, var6, true, var3, var4, var5);
         }
      } else if (com.aspose.slides.ms.System.d1.l6(var4.l6(), "secondary-") && var1 != null) {
         n5(var1, var6, true, var3, var4, var5);
      }
   }

   private static void n5(IAxis var0, boolean var1, boolean var2, ChartSeriesGroup var3, com.aspose.slides.internal.k4y.m3z var4, h6j var5) {
      int var6 = var3.getChart().getType();
      Axis var7 = ((Axis)var0).a6();
      n5(var7 != null && ChartTypeCharacterizer.isChartTypeBar(var6) ? var7 : var0, var4.u9(), var5);
      com.aspose.slides.internal.k4y.a6g var8 = var4.u3();
      if (var8 != null) {
         var0.setTitle(true);
         n5(var0.getTitle(), var8, null, var5);
      }

      com.aspose.slides.internal.k4y.y2i var9 = n5(var0.getFormat().getFill(), var0.getFormat().getLine(), var0.getTextFormat(), var4.k5(), var5);
      if (var9 != null) {
         com.aspose.slides.internal.k4y.a8k var10 = t2f.n5(com.aspose.slides.internal.k4y.a8k.class, "chart-properties", var9.u3());
         if (var10 != null) {
            var3.setGapWidth((var10.h0() > 0 ? var10.h0() : 100) & 65535);
            int var11 = var3.getSeries().get_Item(0).getType();
            if (!ChartTypeCharacterizer.c8(var11) && !ChartTypeCharacterizer.s7(var11)) {
               if (var10.c8() != 0) {
                  var3.setOverlap((byte)var10.c8());
               }
            } else {
               var3.setOverlap((byte)(var10.c8() > 0 ? var10.c8() : 100));
            }

            boolean var12 = !var1 && (ChartTypeCharacterizer.isChartTypeScatter(var6) || ChartTypeCharacterizer.isChartTypeBubble(var6));
            double var13 = var10.t4();
            if (!com.aspose.slides.ms.System.d2.k5(var13)) {
               var0.setAutomaticMinValue(false);
               var0.setMinValue(var13);
            } else if (var12) {
               var0.setAutomaticMinValue(false);
               var0.setMinValue(0.5);
            }

            double var15 = var10.z1();
            if (!com.aspose.slides.ms.System.d2.k5(var15)) {
               var0.setAutomaticMaxValue(false);
               var0.setMaxValue(var15);
            }

            double var17 = var10.q0();
            if (!com.aspose.slides.ms.System.d2.k5(var17)) {
               var0.setAutomaticMajorUnit(false);
               var0.setMajorUnit(var17);
            } else if (var12) {
               var0.setAutomaticMajorUnit(false);
               var0.setMajorUnit(0.5);
            }

            long var19 = var10.z3();
            if ((var19 & 4294967295L) != 4294967295L) {
               var0.setAutomaticMinorUnit(false);
               var0.setMinorUnit(var19 & 4294967295L);
            }

            var0.setLogarithmic(var10.t9() == 1);
            var0.setPlotOrderReversed(var10.j5());
            var0.setVisible(var10.e2() != 0);
            if (var10.m3() == 0) {
               var0.setTickLabelPosition(3);
            } else {
               switch (var10.r4()) {
                  case 3:
                     var0.setTickLabelPosition(0);
                     break;
                  case 4:
                     var0.setTickLabelPosition(1);
                     break;
                  default:
                     var0.setTickLabelPosition(2);
               }
            }

            if ((var10.z8() & 4294967295L) != 4294967295L) {
               var0.getTextFormat().getTextBlockFormat().setRotationAngle((float)(360L - (var10.z8() & 4294967295L) & 4294967295L));
            }

            if (var10.m1() != -1) {
               var0.setMajorTickMark(var10.m1() == 1 ? 1 : 3);
            } else if (var0.getMajorTickMark() == 0) {
               var0.setMajorTickMark(2);
            }

            if (var10.k7() != -1) {
               var0.setMinorTickMark(var10.k7() == 1 ? 1 : 3);
            } else if (var0.getMinorTickMark() == 0) {
               var0.setMinorTickMark(2);
            }

            if (var7 != null) {
               float var21 = 0.0F;
               float[] var22 = new float[]{0.0F};
               boolean var23 = com.aspose.slides.ms.System.n1.n5(var10.w1(), var22);
               var21 = var22[0];
               if ("end".equals(var10.w1())) {
                  var7.setCrossType(1);
                  if (var2 && var7.isPlotOrderReversed()) {
                     var0.setPosition(var1 ? 1 : 0);
                  } else {
                     var0.setPosition(var1 ? 2 : 3);
                  }
               } else if (!"start".equals(var10.w1()) && (!var23 || var21 != 0.0F)) {
                  if (var23) {
                     var7.setCrossType(2);
                     var7.setCrossAt(var21);
                  }
               } else {
                  var7.setCrossType(0);
               }

               if (!var1) {
                  boolean var24 = ChartTypeCharacterizer.isChartTypeArea(var6) || ChartTypeCharacterizer.isChartTypeLine(var6);
                  double var25 = var10.y2();
                  if (var25 == 0.5) {
                     var7.n5().l6(var24 ? 0 : 1);
                  } else {
                     var7.n5().l6(var24 ? 1 : 0);
                  }
               }
            }
         }
      }
   }

   private static void n5(IAxis var0, com.aspose.slides.internal.k4y.g1h[] var1, h6j var2) {
      IChartLinesFormat var3 = var0.getMajorGridLinesFormat();
      IChartLinesFormat var4 = var0.getMinorGridLinesFormat();
      boolean var5 = false;
      boolean var6 = false;

      for (com.aspose.slides.internal.k4y.g1h var10 : var1) {
         if (var10.n5() == 1) {
            var5 = true;
            n5(null, var3.getLine(), null, var10.l6(), var2);
            var0.setMajorTickMark(3);
         } else if (var10.n5() == 2) {
            var6 = true;
            n5(null, var4.getLine(), null, var10.l6(), var2);
            var0.setMinorTickMark(3);
         }
      }

      if (!var5) {
         var3.getLine().getFillFormat().setFillType((byte)0);
      }

      if (!var6) {
         var4.getLine().getFillFormat().setFillType((byte)0);
      }
   }

   private static void n5(ChartPlotArea var0, com.aspose.slides.internal.k4y.r6d var1, com.aspose.slides.internal.k4y.g5t var2) {
      com.aspose.slides.internal.k4y.s8d var3 = var1.t2();
      if (var3 != null) {
         float var4 = (float)t2f.u9(var2.l6());
         float var5 = (float)t2f.u9(var2.k5());
         if (!com.aspose.slides.ms.System.n1.k5(var4) && !com.aspose.slides.ms.System.n1.k5(var5)) {
            com.aspose.slides.internal.o9b.y1 var6 = t2f.n5(var3.n5(), var3.l6(), var3.k5(), var3.u3()).y4();
            if (!var6.u3() && !com.aspose.slides.ms.System.n1.k5(var6.s7()) && !com.aspose.slides.ms.System.n1.k5(var6.k5())) {
               var0.setX(var6.x8() / var4);
               var0.setY(var6.n3() / var5);
               var0.setWidth(var6.s7() / var4);
               var0.setHeight(var6.k5() / var5);
               l1b var7 = var0.n5();
               var7.n5(new com.aspose.slides.internal.k4y.f3h());
               var7.u9().n5(1);
               var7.l6(var7.u9());
            }
         }
      }
   }

   private static void n5(ChartDataWorksheet var0, int var1, com.aspose.slides.internal.k4y.w1x var2) {
      if (var2 != null) {
         for (int var3 = 0; var3 < var2.k5().size(); var3++) {
            ChartDataCell var4 = var0.l6().l6(var1, var3);
            com.aspose.slides.internal.k4y.g7 var5 = var2.k5().get_Item(var3);
            com.aspose.slides.internal.k4y.p6d var6 = (com.aspose.slides.internal.k4y.p6d)var5.l6();
            switch (var6.l6()) {
               case 1:
                  var4.setValue(var6.k5());
                  continue;
               case 2:
                  var4.setValue(var6.k5());
                  var4.setPresetNumberFormat((byte)10);
                  continue;
               case 3:
                  var4.setValue(com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.d2.u9(var6.k5()), var6.u3()}));
                  continue;
               case 4:
                  var4.setValue(var6.a6().m3());
                  var4.setPresetNumberFormat((byte)15);
                  continue;
               case 5:
                  var4.setValue(var6.u9().n3());
                  var4.setPresetNumberFormat((byte)21);
                  continue;
               case 6:
                  var4.setValue(var6.h0());
                  continue;
            }

            com.aspose.slides.internal.l7h.a5 var7 = new com.aspose.slides.internal.l7h.a5(var6.c8());
            if (var7.l6() == 0) {
               List var8 = var6.x8();
               IGenericEnumerator var9 = var8.iterator();

               try {
                  while (var9.hasNext()) {
                     com.aspose.slides.internal.k4y.g7 var10 = (com.aspose.slides.internal.k4y.g7)var9.next();
                     com.aspose.slides.internal.k4y.u1x var11 = com.aspose.slides.internal.v6g.k5.n5(var10.l6(), com.aspose.slides.internal.k4y.u1x.class);
                     if (var11 != null) {
                        var7.l6(n5(var11));
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                     var9.dispose();
                  }
               }
            }

            if (var7.l6() > 0) {
               var4.setValue(com.aspose.slides.ms.System.d1.a6(var7.toString(), new char[]{}));
            }
         }
      }
   }

   private static void n5(TextFrame var0, com.aspose.slides.internal.k4y.u1x var1, h6j var2, h2k var3) {
      if (var1 != null) {
         Paragraph var4 = new Paragraph();
         var0.getParagraphs().add(var4);
         i3h.n5(var4, var0, var1, var2, var3);
         IGenericEnumerator var5 = var4.getPortions().iterator();

         try {
            while (var5.hasNext()) {
               IPortion var6 = (IPortion)var5.next();
               if (var6.getPortionFormat().getFontBold() == -1) {
                  var6.getPortionFormat().setFontBold((byte)0);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      }
   }

   private static com.aspose.slides.internal.k4y.y2i n5(IFillFormat var0, ILineFormat var1, IChartTextFormat var2, String var3, h6j var4) {
      com.aspose.slides.internal.k4y.y2i var5 = n7n.n5(var3, var4);
      if (var5 == null) {
         return null;
      }

      if (var2 != null) {
         ParagraphFormat var6 = (ParagraphFormat)var2.getParagraphFormat();
         if (var6 != null) {
            q8e.n5(var6, null, var5, var4);
         }

         BasePortionFormat var7 = (BasePortionFormat)var2.getPortionFormat();
         if (var7 != null) {
            v7w.n5(var7, var5, var4);
         }
      }

      com.aspose.slides.internal.k4y.p3w var8 = t2f.n5(com.aspose.slides.internal.k4y.p3w.class, "graphic-properties", var5.u3());
      if (var8 != null) {
         if (var8.n5() == 0 && t2f.k5(var8.u3())) {
            var8.n5(3);
         }

         if (var0 != null) {
            t4e.n5(var0, var8, var4);
         }

         if (var1 != null) {
            w7s.n5(var1, var8, var4);
         }
      }

      return var5;
   }

   private static void n5(IChartData var0) {
      ChartSeriesCollection var1 = (ChartSeriesCollection)var0.getSeries();
      int var2 = var1.size() - 1;
      if (var2 > 0) {
         List var3 = new List();
         IGenericEnumerator var4 = var1.iterator();

         try {
            while (var4.hasNext()) {
               IChartSeries var5 = (IChartSeries)var4.next();
               var3.addItem(var5);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         r7n var22 = (r7n)var0.getSeriesGroups();
         List$Enumerator var6 = var3.iterator();

         try {
            while (var6.hasNext()) {
               ChartSeries var7 = (ChartSeries)var6.next();
               var22.l6(var7);
               var1.n5(0, var7);
               var7.setOrder(var2--);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }

         IGenericEnumerator var23 = var1.iterator();

         try {
            while (var23.hasNext()) {
               ChartSeries var8 = (ChartSeries)var23.next();
               ((r7n)var0.getSeriesGroups()).n5(var8);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var23, IDisposable.class)) {
               var23.dispose();
            }
         }
      }
   }

   private static void n5(ChartDataWorkbook var0, IChartSeries var1, String var2, t1z$n5 var3) {
      if (!com.aspose.slides.ms.System.d1.n5(var2)) {
         List var4 = var0.u3(var2);
         if (var4.size() != 0) {
            g1p var5 = (g1p)var4.get_Item(0);
            int var6 = var5.h0();
            if (var6 != 0) {
               t1z.n5(var0, var1, var5, var3);
            }
         }
      }
   }

   private static int n5(String var0, com.aspose.slides.internal.k4y.r6d var1, com.aspose.slides.internal.k4y.a8k var2, com.aspose.slides.internal.k4y.a8k var3) {
      boolean var4 = var2 != null && var2.n5() == 1;
      switch (n5.n5(com.aspose.slides.ms.System.d1.a6(var0))) {
         case 0:
         case 1:
            if (var4) {
               return n5(var2);
            } else if (var2 == null) {
               return 0;
            } else if (var2.u9()) {
               if (var2.n3()) {
                  return 35;
               } else {
                  if (var2.y4()) {
                     return 32;
                  }

                  return 34;
               }
            } else if (var2.n3()) {
               return 1;
            } else {
               if (var2.y4()) {
                  return 2;
               }

               return 0;
            }
         case 2:
            if (var3 != null && (var3.s7() & 4294967295L) > 0L) {
               return var4 ? 30 : 29;
            }

            return var4 ? 27 : 26;
         case 3:
            if (var3 != null && (var3.s7() & 4294967295L) > 0L) {
               return 67;
            }

            return 66;
         case 4:
            if (var2 == null) {
               return 47;
            } else if (var2.n3()) {
               return var4 ? 51 : 48;
            } else {
               if (var2.y4()) {
                  return var4 ? 52 : 49;
               }

               return var4 ? 50 : 47;
            }
         case 5:
            if (var4) {
               return 25;
            } else if (var2 == null) {
               return 19;
            } else {
               boolean var5 = var2.l6() > 0;
               if (var2.n3()) {
                  return var5 ? 23 : 20;
               } else {
                  if (var2.y4()) {
                     return var5 ? 24 : 21;
                  }

                  return var5 ? 22 : 19;
               }
            }
         case 6:
            if (var2 == null) {
               return 57;
            } else {
               boolean var6 = var2.t2() > 1;
               if (var2.l6() > 0) {
                  return var6 ? 54 : 53;
               }

               return var6 ? 55 : 57;
            }
         case 7:
            return 68;
         case 8:
            if (var2 == null) {
               return 70;
            } else {
               if (var2.l6() > 0) {
                  return 71;
               }

               return 70;
            }
         case 9:
            return 72;
         case 10:
            int var7 = var1.k5().length;
            if (var7 > 0) {
               if ("chart:bar".equals(var1.k5()[0].k5())) {
                  if (var7 == 4) {
                     return 60;
                  }

                  if (var7 == 5) {
                     return 61;
                  }
               } else if (var7 == 4) {
                  return 59;
               }
            }

            return 58;
         default:
            return 34;
      }
   }

   private static int n5(com.aspose.slides.internal.k4y.a8k var0) {
      byte var1;
      switch (var0.x8()) {
         case 2:
            var1 = 3;
            break;
         case 3:
            var1 = 1;
            break;
         case 4:
            var1 = 4;
            break;
         default:
            var1 = 0;
      }

      int var2 = var0.u9() ? 1 : 2;
      byte var3 = 2;
      if (var0.n3()) {
         var3 = 4;
      } else if (var0.y4()) {
         var3 = 1;
      }

      IGenericEnumerator var4 = g4u.n5().iterator();

      try {
         while (var4.hasNext()) {
            KeyValuePair var5 = (KeyValuePair)var4.next();
            if (var2 == ((g4u$n5)var5.getValue()).n5() && var3 == ((g4u$n5)var5.getValue()).l6() && ((g4u$n5)var5.getValue()).n5(var1)) {
               return (Integer)var5.getKey();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return var0.u9() ? 33 : 3;
   }

   private static int n5(int var0) {
      switch (var0) {
         case 1:
         case 15:
            return 7;
         case 2:
            return 2;
         case 3:
         case 4:
         case 5:
         case 6:
            return 9;
         case 7:
         case 8:
         case 10:
         default:
            return -1;
         case 9:
            return 0;
         case 11:
            return 10;
         case 12:
            return 6;
         case 13:
            return 8;
         case 14:
            return 1;
      }
   }

   private static String n5(String var0) {
      return com.aspose.slides.ms.System.d1.n5(var0)
         ? null
         : com.aspose.slides.ms.System.d1.n5(
            com.aspose.slides.ms.System.d1.n5(var0, ".", ""), "local-table", com.aspose.slides.ms.System.d1.n5(new String[]{"local-table", "!"})
         );
   }

   private static String n5(com.aspose.slides.internal.k4y.u1x var0) {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      List$Enumerator var2 = var0.k5().iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var3 = (com.aspose.slides.internal.k4y.g7)var2.next();
            if ("_TEXT".equals(var3.n5())) {
               var1.l6(var3.k5().toString());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return com.aspose.slides.ms.System.d1.a6(var1.toString(), new char[]{});
   }
}
