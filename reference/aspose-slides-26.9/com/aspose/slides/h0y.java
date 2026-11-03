package com.aspose.slides;

class h0y {
   public static void n5(IDataLabelCollection var0, com.aspose.slides.internal.k4y.t7m var1, t5w var2) {
      if (var1 != null) {
         a9t var3 = ((DataLabelCollection)var0).l6();
         if (var1.t2() != null) {
            k5r.n5(var0.getDefaultDataLabelFormat().getFormat(), var1.t2(), var2);
         }

         if (var1.s7() != null) {
            y4k.n5(var0.getDefaultDataLabelFormat().getTextFormat(), var1.s7(), var2);
         }

         switch (var1.h0()) {
            case 0:
               ((DataLabelFormat)var0.getDefaultDataLabelFormat()).n5(-1);
               break;
            case 1:
               ((DataLabelFormat)var0.getDefaultDataLabelFormat()).n5(1);
               break;
            case 2:
               ((DataLabelFormat)var0.getDefaultDataLabelFormat()).n5(0);
               break;
            case 3:
               ((DataLabelFormat)var0.getDefaultDataLabelFormat()).n5(2);
               break;
            case 4:
               ((DataLabelFormat)var0.getDefaultDataLabelFormat()).n5(3);
               break;
            case 5:
               ((DataLabelFormat)var0.getDefaultDataLabelFormat()).n5(4);
               break;
            case 6:
               ((DataLabelFormat)var0.getDefaultDataLabelFormat()).n5(5);
               break;
            case 7:
               ((DataLabelFormat)var0.getDefaultDataLabelFormat()).n5(6);
               break;
            case 8:
               ((DataLabelFormat)var0.getDefaultDataLabelFormat()).n5(7);
               break;
            case 9:
               ((DataLabelFormat)var0.getDefaultDataLabelFormat()).n5(8);
         }

         if (var1.c8() != null) {
            var0.getDefaultDataLabelFormat().setNumberFormat(var1.c8().n5());
            var0.getDefaultDataLabelFormat().setNumberFormatLinkedToSource(var1.c8().l6() == 1);
         }

         if (var1.t9() != null) {
            var3.n5(var1.t9());
         }

         if (var1.n3() != null) {
            var0.getDefaultDataLabelFormat().setSeparator(var1.n3());
         }

         IDataLabelFormat var4 = var0.getDefaultDataLabelFormat();
         if (var1.x8() != null) {
            var4.setShowCategoryName(var1.x8().l6() == 1);
            var4.setShowSeriesName(var1.x8().n5() == 1);
            var4.setShowValue(var1.x8().k5() == 1);
         } else {
            var4.setShowValue(true);
         }

         if (var1.y4() != null) {
            for (com.aspose.slides.internal.k4y.s7m var8 : var1.y4()) {
               IDataLabel var9 = n5(var0.getParentSeries(), var8.a6());
               if (var9 != null) {
                  n4m.n5(var9, var8, var2);
               }
            }
         }

         if (var1.e2() != null) {
            for (com.aspose.slides.internal.k4y.y8i var13 : var1.e2()) {
               IDataLabel var14 = n5(var0.getParentSeries(), var13.n5());
               if (var14 != null) {
                  var14.hide();
               }
            }
         }
      }
   }

   private static IDataLabel n5(IChartSeries var0, long var1) {
      if (var0.getType() == 76) {
         return (var1 & 4294967295L) >= ((ChartSeries)var0).s7().n5() ? null : ((ChartSeries)var0).s7().n5((int)var1).h0();
      }

      if (var0.getType() == 78) {
         int var3 = 0;

         for (int var4 = 0; var4 < ((ChartSeries)var0).s7().n5(); var4++) {
            a0 var5 = ((ChartSeries)var0).s7().n5(var4);
            int var6 = var3 + (int)var5.z8() + 3;
            if ((var1 & 4294967295L) >= var3 && (var1 & 4294967295L) <= var6) {
               if ((var1 & 4294967295L) == var3) {
                  return var5.a6();
               }

               if ((var1 & 4294967295L) == var3 + (int)var5.z8() - 1) {
                  return var5.u9();
               }

               if ((var1 & 4294967295L) == var3 + (int)var5.z8()) {
                  return var5.k5();
               }

               if ((var1 & 4294967295L) == var3 + (int)var5.z8() + 1) {
                  return var5.l6();
               }

               if ((var1 & 4294967295L) == var3 + (int)var5.z8() + 2) {
                  return var5.u3();
               }

               if ((var1 & 4294967295L) == var3 + (int)var5.z8() + 3) {
                  return var5.n5();
               }

               return var0.getDataPoints().getOrCreateDataPointByIdx(var1).getLabel();
            }

            var3 = var6 + 1;
         }
      }

      if (var0.getType() == 74 || var0.getType() == 75) {
         IChartDataPointLevel var7 = ((ChartDataPointCollection)var0.getDataPoints()).n5((int)var1);
         return var7 == null ? null : var7.getLabel();
      } else if (var0.getType() == 79 && var0.getDataPoints().size() > (var1 & 4294967295L)) {
         return var0.getDataPoints().get_Item((int)var1).getLabel();
      } else {
         return var0.getDataPoints().size() - 1 > (var1 & 4294967295L) ? var0.getDataPoints().get_Item((int)var1).getLabel() : null;
      }
   }

   public static void n5(IDataLabelCollection var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.t7m> var1, g6c var2) {
      if (k6r.n5(var0)) {
         com.aspose.slides.internal.k4y.t7m var3 = (com.aspose.slides.internal.k4y.t7m)var1.invoke();
         a9t var4 = ((DataLabelCollection)var0).l6();
         k5r.n5(var0.getDefaultDataLabelFormat().getFormat(), new h0y$1(var3), var2, null, false);
         y4k.n5(var0.getDefaultDataLabelFormat().getTextFormat(), new h0y$2(var3), var2);
         IDataLabelFormat var5 = var0.getDefaultDataLabelFormat();
         if (var5.getPosition() != -1) {
            switch (var5.getPosition()) {
               case 0:
                  var3.n5(2);
                  break;
               case 1:
                  var3.n5(1);
                  break;
               case 2:
                  var3.n5(3);
                  break;
               case 3:
                  var3.n5(4);
                  break;
               case 4:
                  var3.n5(5);
                  break;
               case 5:
                  var3.n5(6);
                  break;
               case 6:
                  var3.n5(7);
                  break;
               case 7:
                  var3.n5(8);
                  break;
               case 8:
                  var3.n5(9);
            }
         }

         if (!"".equals(var5.getNumberFormat())) {
            com.aspose.slides.internal.k4y.n9v var6 = var3.n5();
            var6.n5(var5.getNumberFormat());
            var6.n5((byte)(var5.isNumberFormatLinkedToSource() ? 1 : 0));
         }

         com.aspose.slides.internal.k4y.e5k var7 = var3.u3();
         var7.l6((byte)(var5.getShowCategoryName() ? 1 : 0));
         var7.n5((byte)(var5.getShowSeriesName() ? 1 : 0));
         var7.k5((byte)(var5.getShowValue() ? 1 : 0));
         if (!"".equals(var5.getSeparator())) {
            var3.n5(var5.getSeparator());
         }

         n5(var0.getParentSeries(), var3, var2);
         if (var4.l6() != null) {
            var3.n5(var4.l6());
         }
      }
   }

   private static void n5(IChartSeries var0, com.aspose.slides.internal.k4y.t7m var1, g6c var2) {
      if (var0.getType() == 78) {
         int var7 = 0;

         for (int var8 = 0; var8 < ((ChartSeries)var0).s7().n5(); var8++) {
            a0 var5 = ((ChartSeries)var0).s7().n5(var8);
            n5(var1, var5.a6(), var7 & 4294967295L, var0.getLabels(), var2);
            n5(var1, var5.u9(), ((var7 & 4294967295L) + (var5.z8() & 4294967295L) & 4294967295L) - 1L & 4294967295L, var0.getLabels(), var2);
            n5(var1, var5.k5(), (var7 & 4294967295L) + (var5.z8() & 4294967295L) & 4294967295L, var0.getLabels(), var2);
            n5(var1, var5.l6(), ((var7 & 4294967295L) + (var5.z8() & 4294967295L) & 4294967295L) + 1L & 4294967295L, var0.getLabels(), var2);
            n5(var1, var5.u3(), ((var7 & 4294967295L) + (var5.z8() & 4294967295L) & 4294967295L) + 2L & 4294967295L, var0.getLabels(), var2);
            n5(var1, var5.n5(), ((var7 & 4294967295L) + (var5.z8() & 4294967295L) & 4294967295L) + 3L & 4294967295L, var0.getLabels(), var2);
            var7 = var7 + (int)var5.z8() + 4;
         }
      } else {
         if (var0.getType() == 76) {
            for (int var3 = 0; var3 < ((ChartSeries)var0).s7().n5(); var3++) {
               a0 var4 = ((ChartSeries)var0).s7().n5(var3);
               n5(var1, var4.h0(), var3 & 4294967295L, var0.getLabels(), var2);
            }
         } else if (var0.getType() != 74 && var0.getType() != 75) {
            for (int var6 = 0; var6 < var0.getDataPoints().size(); var6++) {
               n5(var1, var0.getDataPoints().get_Item(var6).getLabel(), var6 & 4294967295L, var0.getLabels(), var2);
            }
         } else {
            l6(var0, var1, var2);
         }
      }
   }

   private static void l6(IChartSeries var0, com.aspose.slides.internal.k4y.t7m var1, g6c var2) {
      ChartCategoryCollection var3 = (ChartCategoryCollection)var0.getChart().getChartData().getCategories();

      for (int var4 = 0; var4 < var3.size(); var4++) {
         for (int var5 = var3.getGroupingLevelCount() - 1; var5 >= 0 && var4 <= var0.getDataPoints().size() - 1; var5--) {
            ChartDataPointLevel var6 = com.aspose.slides.internal.v6g.k5.n5(
               var0.getDataPoints().get_Item(var4).getDataPointLevels().get_Item(var5), ChartDataPointLevel.class
            );
            if (var6.c8() != -1) {
               n5(var1, var6.getLabel(), var6.c8() & 4294967295L, var0.getLabels(), var2);
            }
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.t7m var0, IDataLabel var1, long var2, IDataLabelCollection var4, g6c var5) {
      if (a6z.n5(var1, var4.getDefaultDataLabelFormat())) {
         n4m.n5(var1, new h0y$3(var0), var2, var4.getDefaultDataLabelFormat(), var5);
      } else if ((
            var4.getDefaultDataLabelFormat().getShowValue()
               || var4.getDefaultDataLabelFormat().getShowSeriesName()
               || var4.getDefaultDataLabelFormat().getShowCategoryName()
         )
         && !var1.isVisible()) {
         com.aspose.slides.internal.k4y.y8i var6 = var0.u9();
         var6.n5(var2 & 4294967295L);
      }
   }
}
