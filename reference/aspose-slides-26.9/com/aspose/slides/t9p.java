package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

class t9p {
   public static void n5(IChartData var0, com.aspose.slides.internal.k4y.w4c var1, c1x var2) {
      if (var1 != null) {
         t5w var3 = var2.n5().n5();

         for (int var4 = 0; var4 < var1.a6().size(); var4++) {
            com.aspose.slides.internal.k4y.g7 var5 = var1.a6().get_Item(var4);
            com.aspose.slides.internal.k4y.k7 var6 = (com.aspose.slides.internal.k4y.k7)var5.l6();
            ChartSeriesGroup var7 = null;
            boolean var8 = true;

            for (com.aspose.slides.internal.k4y.m3 var12 : var6.l6()) {
               boolean var13 = false;
               if (var12.aG_() != null) {
                  com.aspose.slides.internal.k4y.z3o var14 = com.aspose.slides.internal.v6g.k5.n5(
                     var12.aG_().a6().l6(), com.aspose.slides.internal.k4y.z3o.class
                  );
                  if (var14 != null && var14.k5() == null) {
                     var13 = true;
                  }
               }

               if (var12.aB_() != null) {
                  com.aspose.slides.internal.k4y.z3o var25 = com.aspose.slides.internal.v6g.k5.n5(
                     var12.aB_().a6().l6(), com.aspose.slides.internal.k4y.z3o.class
                  );
                  if (var25 != null && var25.k5() == null) {
                     var13 = true;
                  }
               }

               int var26 = 0;
               int[] var15 = new int[]{0};
               int var16 = g4u.n5(var1, var4, var15);
               var26 = var15[0];
               int var17 = g4u.n5(var16, var12);
               boolean var18 = p2i.n5(var6, var2);
               IChartSeries var19;
               if (var7 == null) {
                  var19 = ((ChartSeriesCollection)var0.getSeries()).n5(var17, var18);
                  var7 = (ChartSeriesGroup)var19.getParentSeriesGroup();
                  f3l var20 = var7.u9();
                  x1f.n5(var7.k5(), var6.t4(), var3);
                  x1f.n5(var7.getHiLowLinesFormat(), var6.q0(), var3);
                  x1f.n5(var7.l6(), var6.m3() != null && var6.m3().length > 0 ? var6.m3()[0] : null, var3);
                  var7.setGapWidth(var6.t9() == null ? 150 : var6.t9().n5());
                  var7.setGapDepth(var6.e2() == null ? 150 : var6.e2().n5());
                  h1j.n5(var7.getUpDownBars(), var6.ax_(), var3);
                  if (var6.z3() != null) {
                     var7.setFirstSliceAngle(var6.z3().n5());
                  }

                  if (var6.m1() != null) {
                     var7.setDoughnutHoleSize(var6.m1().n5());
                  }

                  if (var6.z1() != null) {
                     var7.setOverlap(var6.z1().n5());
                  }

                  if (var6.k7() != null) {
                     var7.setSecondPieSize(var6.k7().n5());
                  }

                  if (var6.z8() != null) {
                     var20.n5(var6.z8().n5());
                  }

                  if (var6.j5() != null) {
                     var7.setBubbleSizeRepresentation(var6.j5().n5());
                  }

                  if (var6.w1() != null) {
                     var7.setPieSplitPosition(var6.w1().n5());
                  }

                  if (var6.r4() != null) {
                     var7.setPieSplitBy(var6.r4().n5());
                  }

                  if (var6.y4() != null) {
                     var7.setColorVaried(var6.y4().n5());
                  }

                  if (var6.y1() != null) {
                     var7.setBubbleSizeScale((int)var6.y1().n5());
                  }

                  var20.n5(var6.s3());
                  var20.n5(var6.c8());
               } else {
                  var19 = ((ChartSeriesCollection)var0.getSeries()).n5(var17, var7, var18);
               }

               p2i.n5(var19, var12, var6, var2);
               ((ChartSeries)var19).n5(var13);
               if (var2.l6() != null) {
                  if (!var2.l6().containsKey(var12.n5().n5())) {
                     var2.l6().addItem(var12.n5().n5(), var19);
                  } else {
                     var2.n5((SortedList<Long, IChartSeries>)null);
                  }
               }

               if (var19.getPlotOnSecondAxis()) {
                  if (!var0.getUseSecondaryCategories()) {
                     var0.setUseSecondaryCategories(true);
                  }

                  m6n.n5(var0.getSecondaryCategories(), var12.aF_(), n5(var6, var2), var19.getDataPoints().size(), var8);
               } else {
                  m6n.n5(var0.getCategories(), var12.aF_(), n5(var6, var2), var19.getDataPoints().size(), var8);
               }

               var8 = false;
            }

            if (var7 != null && var6.d2() != null) {
               for (com.aspose.slides.internal.k4y.b8n var24 : var6.d2().l6()) {
                  var7.getPieSplitCustomPoints().add((int)var24.n5());
               }
            }
         }

         l6(var0);
      }
   }

   static void n5(IChartData var0) {
      IGenericEnumerator var1 = var0.getSeries().iterator();

      try {
         while (var1.hasNext()) {
            ChartSeries var2 = (ChartSeries)var1.next();
            ChartDataPointCollection var3 = (ChartDataPointCollection)var2.getDataPoints();
            if (var2.y4() == 0 && var2.getName().getDataSourceType() == 0 && !com.aspose.slides.ms.System.d1.n5(var2.n3())) {
               var2.getName().setAsCells(var0.getChartDataWorkbook().getCellCollection(var2.n3(), false));
            }

            if (var2.getDataPoints().getDataSourceTypeForValues() == 0 && !com.aspose.slides.ms.System.d1.n5(var3.n3())) {
               n5((ChartDataWorkbook)var0.getChartDataWorkbook(), 3, var2, var3.n3());
            }

            if (var2.getDataPoints().getDataSourceTypeForYValues() == 0 && !com.aspose.slides.ms.System.d1.n5(var3.x8())) {
               n5((ChartDataWorkbook)var0.getChartDataWorkbook(), 1, var2, var3.x8());
            }

            if (var2.getDataPoints().getDataSourceTypeForXValues() == 0 && !com.aspose.slides.ms.System.d1.n5(var3.s7())) {
               n5((ChartDataWorkbook)var0.getChartDataWorkbook(), 0, var2, var3.s7());
            }

            if (var2.getDataPoints().getDataSourceTypeForBubbleSizes() == 0 && !com.aspose.slides.ms.System.d1.n5(var3.y4())) {
               n5((ChartDataWorkbook)var0.getChartDataWorkbook(), 2, var2, var3.y4());
            }

            if (!com.aspose.slides.ms.System.d1.n5(var3.e2())) {
               n5((ChartDataWorkbook)var0.getChartDataWorkbook(), 4, var2, var3.e2());
            }

            if (!com.aspose.slides.ms.System.d1.n5(var3.t9())) {
               n5((ChartDataWorkbook)var0.getChartDataWorkbook(), 5, var2, var3.t9());
            }

            if (!com.aspose.slides.ms.System.d1.n5(var3.z1())) {
               n5((ChartDataWorkbook)var0.getChartDataWorkbook(), 6, var2, var3.z1());
            }

            if (!com.aspose.slides.ms.System.d1.n5(var3.t4())) {
               n5((ChartDataWorkbook)var0.getChartDataWorkbook(), 7, var2, var3.t4());
            }

            if (!com.aspose.slides.ms.System.d1.n5(var3.q0())) {
               n5((ChartDataWorkbook)var0.getChartDataWorkbook(), 8, var2, var3.q0());
            }

            if (!com.aspose.slides.ms.System.d1.n5(var3.z3())) {
               n5((ChartDataWorkbook)var0.getChartDataWorkbook(), 9, var2, var3.z3());
            }

            if (!com.aspose.slides.ms.System.d1.n5(com.aspose.slides.internal.v6g.k5.n5(var2.getLabels(), DataLabelCollection.class).n5())) {
               List var4 = ((ChartDataWorkbook)var0.getChartDataWorkbook())
                  .n5(com.aspose.slides.internal.v6g.k5.n5(var2.getLabels(), DataLabelCollection.class).n5(), true, false);
               int var5 = com.aspose.slides.ms.System.q1.l6(var2.getLabels().getCount(), var4.size());

               for (int var6 = 0; var6 < var5; var6++) {
                  var2.getLabels().get_Item(var6).setValueFromCell((IChartDataCell)var4.get_Item(var6));
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      if (var0.getCategories() != null && var0.getCategories().size() > 0 && var0.getCategories().getUseCells()) {
         String var10 = ((ChartCategoryCollection)var0.getCategories()).k5();
         int var12 = ((ChartCategory)var0.getCategories().get_Item(0)).k5().n5();
         if (var12 > 0) {
            m6n.n5(var0.getCategories(), var10, (ChartDataWorkbook)var0.getChartDataWorkbook(), var12);
         } else {
            m6n.n5(var0.getCategories(), var10, (ChartDataWorkbook)var0.getChartDataWorkbook(), false);
         }
      }

      if (var0.getSecondaryCategories() != null && var0.getSecondaryCategories().size() > 0 && var0.getSecondaryCategories().getUseCells()) {
         String var11 = ((ChartCategoryCollection)var0.getSecondaryCategories()).k5();
         int var13 = ((ChartCategory)var0.getSecondaryCategories().get_Item(0)).k5().n5();
         if (var13 > 0) {
            m6n.n5(var0.getSecondaryCategories(), var11, (ChartDataWorkbook)var0.getChartDataWorkbook(), var13);
         } else {
            m6n.n5(var0.getSecondaryCategories(), var11, (ChartDataWorkbook)var0.getChartDataWorkbook(), false);
         }
      }
   }

   private static void n5(ChartDataWorkbook var0, int var1, IChartSeries var2, String var3) {
      List var4 = var0.n5(var3, false, false);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         ISingleCellChartValue var6 = k3h.n5(var2.getDataPoints().getOrCreateDataPointByIdx(var5 & 4294967295L), var1);
         var6.setAsCell((IChartDataCell)var4.get_Item(var5));
      }
   }

   static boolean n5(com.aspose.slides.internal.k4y.k7 var0, c1x var1) {
      if (var0.aD_().length != 2 && var0.aD_().length != 4) {
         return false;
      }

      List var2 = var1.k5().u9();
      List$Enumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var4 = (com.aspose.slides.internal.k4y.g7)var3.next();
            com.aspose.slides.internal.k4y.c8 var5 = (com.aspose.slides.internal.k4y.c8)var4.l6();
            if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.k4y.c5e.class)
               && (var5.n5().n5() == var0.aw_().n5() || var5.n5().n5() == var0.u9().n5())) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return false;
   }

   private static void l6(IChartData var0) {
      if (var0.getUseSecondaryCategories()) {
         boolean var1 = true;
         if (var0.getCategories().getUseCells()
            && var0.getSecondaryCategories().getUseCells()
            && !com.aspose.slides.ms.System.d1.a6(
               ((ChartCategoryCollection)var0.getCategories()).k5(), ((ChartCategoryCollection)var0.getSecondaryCategories()).k5()
            )) {
            var1 = false;
         }

         if (var0.getCategories().getUseCells() != var0.getSecondaryCategories().getUseCells()
            || var0.getCategories().size() != var0.getSecondaryCategories().size()) {
            var1 = false;
         }

         if (var1) {
            for (int var2 = 0; var2 < var0.getCategories().size(); var2++) {
               if (com.aspose.slides.internal.v6g.k5.n5(var0.getCategories().get_Item(var2), ChartCategory.class).n5()
                  != com.aspose.slides.internal.v6g.k5.n5(var0.getSecondaryCategories().get_Item(var2), ChartCategory.class).n5()) {
                  var1 = false;
                  break;
               }
            }
         }

         if (var1) {
            com.aspose.slides.internal.v6g.k5.n5(var0.getSecondaryCategories(), ChartCategoryCollection.class).n5();
            var0.setUseSecondaryCategories(false);
         }
      }
   }

   public static void n5(IChart var0, com.aspose.slides.internal.k4y.w4c var1, j8m var2) {
      IChartData var3 = var0.getChartData();
      g6c var4 = var2.n5().n5();
      if (var3.getSeriesGroups().size() > 0) {
         IGenericEnumerator var5 = var3.getSeriesGroups().iterator();

         try {
            while (var5.hasNext()) {
               ChartSeriesGroup var6 = (ChartSeriesGroup)var5.next();
               f3l var7 = var6.u9();
               com.aspose.slides.internal.k4y.k7 var8 = n5(var6.getType(), var6.getSeries().get_Item(0).getType(), var1);
               List var9 = new List<>(var6.getSeries());
               var9.sort(new t9p$1());
               List$Enumerator var10 = var9.iterator();

               try {
                  while (var10.hasNext()) {
                     IChartSeries var11 = (IChartSeries)var10.next();
                     com.aspose.slides.internal.k4y.m3 var12 = var8.n5(var11.getType());
                     p2i.n5(var11, var12, var8, var2);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                     var10.dispose();
                  }
               }

               if (var6.u3() && com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.k4y.a5.class)) {
                  x1f.n5(var6.k5(), com.aspose.slides.internal.v6g.k5.n5(var8, com.aspose.slides.internal.k4y.a5.class).n5(), var4);
               }

               if (var6.a6() && com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.k4y.a3.class)) {
                  x1f.n5(var6.getHiLowLinesFormat(), com.aspose.slides.internal.v6g.k5.n5(var8, com.aspose.slides.internal.k4y.a3.class).u3(), var4);
               }

               if (var6.hasSeriesLines() && com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.k4y.x9.class)) {
                  x1f.n5(var6.l6(), com.aspose.slides.internal.v6g.k5.n5(var8, com.aspose.slides.internal.k4y.x9.class).u3(), var4);
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.k4y.f0.class)) {
                  com.aspose.slides.internal.v6g.k5.n5(var8, com.aspose.slides.internal.k4y.f0.class).h0().n5(var6.getGapWidth());
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.k4y.v0.class)) {
                  com.aspose.slides.internal.v6g.k5.n5(var8, com.aspose.slides.internal.k4y.v0.class).s7().n5(var6.getGapDepth());
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.k4y.a3.class) && var6.getUpDownBars().hasUpDownBars()) {
                  h1j.n5(var6.getUpDownBars(), com.aspose.slides.internal.v6g.k5.n5(var8, com.aspose.slides.internal.k4y.a3.class).h0(), var4);
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.k4y.h2.class)) {
                  com.aspose.slides.internal.v6g.k5.n5(var8, com.aspose.slides.internal.k4y.h2.class).n5().n5(var6.getFirstSliceAngle());
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.k4y.i2i.class)) {
                  com.aspose.slides.internal.v6g.k5.n5(var8, com.aspose.slides.internal.k4y.i2i.class).o0().n5(var6.getDoughnutHoleSize());
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.k4y.c9v.class)) {
                  com.aspose.slides.internal.v6g.k5.n5(var8, com.aspose.slides.internal.k4y.c9v.class).z7().n5(var6.getOverlap());
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.k4y.v9l.class)) {
                  com.aspose.slides.internal.v6g.k5.n5(var8, com.aspose.slides.internal.k4y.v9l.class).v4().n5(var6.getSecondPieSize());
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.k4y.w1g.class)) {
                  com.aspose.slides.internal.k4y.w1g var32 = com.aspose.slides.internal.v6g.k5.n5(var8, com.aspose.slides.internal.k4y.w1g.class);
                  var32.z7().n5(var7.n5());
                  if (var6.getBubbleSizeRepresentation() != com.aspose.slides.internal.k4y.g3x.n5) {
                     var32.v4().n5(var6.getBubbleSizeRepresentation());
                  }
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.k4y.v9l.class)) {
                  com.aspose.slides.internal.v6g.k5.n5(var8, com.aspose.slides.internal.k4y.v9l.class).z7().n5(var6.getPieSplitPosition());
                  com.aspose.slides.internal.v6g.k5.n5(var8, com.aspose.slides.internal.k4y.v9l.class).o0().n5(var6.getPieSplitBy());
               }

               if (var6.getPieSplitCustomPoints().size() > 0) {
                  com.aspose.slides.internal.k4y.t7q var33 = var8.d5();
                  IGenericEnumerator var36 = var6.getPieSplitCustomPoints().iterator();

                  try {
                     while (var36.hasNext()) {
                        IChartDataPoint var13 = (IChartDataPoint)var36.next();
                        var33.n5().n5(var6.getSeries().get_Item(0).getDataPoints().get_Item(var13) & 4294967295L);
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var36, IDisposable.class)) {
                        var36.dispose();
                     }
                  }
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.k4y.e9.class)) {
                  com.aspose.slides.internal.v6g.k5.n5(var8, com.aspose.slides.internal.k4y.e9.class).y2().n5(var6.isColorVaried());
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.k4y.w1g.class)) {
                  com.aspose.slides.internal.v6g.k5.n5(var8, com.aspose.slides.internal.k4y.w1g.class).o0().n5(var6.getBubbleSizeScale() & 4294967295L);
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.k4y.w2.class)) {
                  com.aspose.slides.internal.v6g.k5.n5(var8, com.aspose.slides.internal.k4y.w2.class).n5(var7.l6());
               }

               var8.n5(var7.k5());
               if (com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.k4y.t1.class)) {
                  com.aspose.slides.internal.k4y.a4s var34 = com.aspose.slides.internal.v6g.k5.n5(var8, com.aspose.slides.internal.k4y.t1.class).c4();
                  var34.u9().n5(false);
                  var34.h0().n5(false);
                  var34.c8().n5(false);
                  var34.t2().n5(false);
                  var34.s7().n5(false);
                  var34.x8().n5(false);
                  var34.n3().n5(false);
               }

               IAxis[] var35 = n5(var6.getType(), var6.getPlotOnSecondAxis(), var0.getAxes());

               for (int var37 = 0; var37 < var35.length; var37++) {
                  Axis var38 = (Axis)var35[var37];
                  if (com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.k4y.u6.class)) {
                     com.aspose.slides.internal.v6g.k5.n5(var8, com.aspose.slides.internal.k4y.u6.class).a6().n5(var38 == null ? 0 : var38.n5().c8());
                  } else {
                     if (var8.aD_().length <= 0) {
                        throw new Exception();
                     }

                     var8.aD_()[var37].n5(var38.n5().c8());
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      } else {
         com.aspose.slides.internal.k4y.k7 var28 = n5(ChartTypeCharacterizer.x8(var0.getType()), var0.getType(), var1);
         IAxis[] var29 = n5(ChartTypeCharacterizer.x8(var0.getType()), false, var0.getAxes());

         for (int var30 = 0; var30 < var29.length; var30++) {
            Axis var31 = (Axis)var29[var30];
            if (com.aspose.slides.internal.v6g.k5.l6(var28, com.aspose.slides.internal.k4y.u6.class)) {
               com.aspose.slides.internal.v6g.k5.n5(var28, com.aspose.slides.internal.k4y.u6.class).a6().n5(var31 == null ? 0 : var31.n5().c8());
            } else {
               if (var28.aD_().length <= 0) {
                  throw new Exception();
               }

               var28.aD_()[var30].n5(var31.n5().c8());
            }
         }
      }
   }

   private static com.aspose.slides.internal.k4y.k7 n5(int var0, int var1, com.aspose.slides.internal.k4y.w4c var2) {
      switch (var0) {
         case 0:
            com.aspose.slides.internal.k4y.v9l var23 = (com.aspose.slides.internal.k4y.v9l)var2.l6("ofPieChart").l6();
            var23.x8().n5(2);
            return var23;
         case 1:
            com.aspose.slides.internal.k4y.v9l var24 = (com.aspose.slides.internal.k4y.v9l)var2.l6("ofPieChart").l6();
            var24.x8().n5(1);
            return var24;
         case 2:
            return (com.aspose.slides.internal.k4y.i2i)var2.l6("doughnutChart").l6();
         case 3:
            return (com.aspose.slides.internal.k4y.q9r)var2.l6("pieChart").l6();
         case 4:
            return (com.aspose.slides.internal.k4y.d9r)var2.l6("areaChart").l6();
         case 5:
            com.aspose.slides.internal.k4y.d9r var3 = (com.aspose.slides.internal.k4y.d9r)var2.l6("areaChart").l6();
            var3.o0().n5(1);
            return var3;
         case 6:
            com.aspose.slides.internal.k4y.d9r var4 = (com.aspose.slides.internal.k4y.d9r)var2.l6("areaChart").l6();
            var4.o0().n5(3);
            return var4;
         case 7:
            com.aspose.slides.internal.k4y.c9v var18 = (com.aspose.slides.internal.k4y.c9v)var2.l6("barChart").l6();
            var18.av_().n5(1);
            var18.o0().n5(2);
            return var18;
         case 8:
            com.aspose.slides.internal.k4y.c9v var19 = (com.aspose.slides.internal.k4y.c9v)var2.l6("barChart").l6();
            var19.av_().n5(1);
            var19.o0().n5(4);
            return var19;
         case 9:
            com.aspose.slides.internal.k4y.c9v var20 = (com.aspose.slides.internal.k4y.c9v)var2.l6("barChart").l6();
            var20.av_().n5(1);
            var20.o0().n5(1);
            return var20;
         case 10:
            com.aspose.slides.internal.k4y.c9v var15 = (com.aspose.slides.internal.k4y.c9v)var2.l6("barChart").l6();
            var15.av_().n5(2);
            var15.o0().n5(2);
            return var15;
         case 11:
            com.aspose.slides.internal.k4y.c9v var16 = (com.aspose.slides.internal.k4y.c9v)var2.l6("barChart").l6();
            var16.av_().n5(2);
            var16.o0().n5(4);
            return var16;
         case 12:
            com.aspose.slides.internal.k4y.c9v var17 = (com.aspose.slides.internal.k4y.c9v)var2.l6("barChart").l6();
            var17.av_().n5(2);
            var17.o0().n5(1);
            return var17;
         case 13:
            com.aspose.slides.internal.k4y.x1j var7 = (com.aspose.slides.internal.k4y.x1j)var2.l6("lineChart").l6();
            var7.o0().n5(2);
            return var7;
         case 14:
            com.aspose.slides.internal.k4y.x1j var8 = (com.aspose.slides.internal.k4y.x1j)var2.l6("lineChart").l6();
            var8.o0().n5(3);
            return var8;
         case 15:
            com.aspose.slides.internal.k4y.x1j var9 = (com.aspose.slides.internal.k4y.x1j)var2.l6("lineChart").l6();
            var9.o0().n5(1);
            return var9;
         case 16:
            com.aspose.slides.internal.k4y.p5g var11 = (com.aspose.slides.internal.k4y.p5g)var2.l6("radarChart").l6();
            var11.n3().n5(1);
            return var11;
         case 17:
            com.aspose.slides.internal.k4y.p5g var12 = (com.aspose.slides.internal.k4y.p5g)var2.l6("radarChart").l6();
            var12.n3().n5(3);
            return var12;
         case 18:
         case 19:
         case 20:
         case 21:
            return (com.aspose.slides.internal.k4y.l9o)var2.l6("stockChart").l6();
         case 22:
            com.aspose.slides.internal.k4y.t2h var13 = (com.aspose.slides.internal.k4y.t2h)var2.l6("scatterChart").l6();
            var13.p8().n5(3);
            return var13;
         case 23:
            com.aspose.slides.internal.k4y.t2h var14 = (com.aspose.slides.internal.k4y.t2h)var2.l6("scatterChart").l6();
            var14.p8().n5(6);
            return var14;
         case 24:
            return (com.aspose.slides.internal.k4y.l1f)var2.l6("area3DChart").l6();
         case 25:
            com.aspose.slides.internal.k4y.l1f var5 = (com.aspose.slides.internal.k4y.l1f)var2.l6("area3DChart").l6();
            var5.o0().n5(3);
            return var5;
         case 26:
            com.aspose.slides.internal.k4y.l1f var6 = (com.aspose.slides.internal.k4y.l1f)var2.l6("area3DChart").l6();
            var6.o0().n5(1);
            return var6;
         case 27:
            com.aspose.slides.internal.k4y.d1z var10 = (com.aspose.slides.internal.k4y.d1z)var2.l6("line3DChart").l6();
            var10.o0().n5(2);
            return var10;
         case 28:
            return (com.aspose.slides.internal.k4y.q6f)var2.l6("pie3DChart").l6();
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
            com.aspose.slides.internal.k4y.u3r var21 = (com.aspose.slides.internal.k4y.u3r)var2.l6("bar3DChart").l6();
            g4u$n5 var22 = g4u.n5().get_Item(var1);
            var21.av_().n5(var22.n5());
            var21.o0().n5(var22.l6());
            var21.i1().n5(var22.k5());
            return var21;
         case 48:
            return (com.aspose.slides.internal.k4y.o8x)var2.l6("surfaceChart").l6();
         case 49:
            com.aspose.slides.internal.k4y.o8x var25 = (com.aspose.slides.internal.k4y.o8x)var2.l6("surfaceChart").l6();
            var25.az_().n5(true);
            return var25;
         case 50:
            return (com.aspose.slides.internal.k4y.o3n)var2.l6("surface3DChart").l6();
         case 51:
            com.aspose.slides.internal.k4y.o3n var26 = (com.aspose.slides.internal.k4y.o3n)var2.l6("surface3DChart").l6();
            var26.az_().n5(true);
            return var26;
         case 52:
            return (com.aspose.slides.internal.k4y.w1g)var2.l6("bubbleChart").l6();
         default:
            throw new Exception();
      }
   }

   private static IAxis[] n5(int var0, boolean var1, IAxesManager var2) {
      IAxis var3;
      IAxis var4;
      if (!var1) {
         var3 = var2.getHorizontalAxis();
         var4 = var2.getVerticalAxis();
      } else {
         var3 = var2.getSecondaryHorizontalAxis();
         var4 = var2.getSecondaryVerticalAxis();
      }

      switch (var0) {
         case 0:
         case 1:
            return new IAxis[0];
         case 2:
            return new IAxis[0];
         case 3:
            return new IAxis[0];
         case 4:
         case 5:
         case 6:
            return new IAxis[]{var3, var4};
         case 7:
         case 8:
         case 9:
            return new IAxis[]{var4, var3};
         case 10:
         case 11:
         case 12:
            return new IAxis[]{var3, var4};
         case 13:
         case 14:
         case 15:
            return new IAxis[]{var3, var4};
         case 16:
         case 17:
            return new IAxis[]{var3, var4};
         case 18:
         case 19:
         case 20:
         case 21:
            return new IAxis[]{var3, var4};
         case 22:
         case 23:
            return new IAxis[]{var3, var4};
         case 24:
         case 25:
         case 26:
            return new IAxis[]{var3, var4, var2.getSeriesAxis()};
         case 27:
            return new IAxis[]{var3, var4, var2.getSeriesAxis()};
         case 28:
            return new IAxis[0];
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
            return new IAxis[]{var3, var4, var2.getSeriesAxis()};
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
            return new IAxis[]{var4, var3, var2.getSeriesAxis()};
         case 48:
         case 49:
            return new IAxis[]{var3, var4, var2.getSeriesAxis()};
         case 50:
         case 51:
            return new IAxis[]{var3, var4, var2.getSeriesAxis()};
         case 52:
            return new IAxis[]{var3, var4};
         default:
            throw new Exception();
      }
   }
}
