package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;

abstract class t1z {
   void n5(List<g1p> var1, IChartData var2) {
   }

   void l6(List<g1p> var1, IChartData var2) {
   }

   protected final void n5(int var1, IChartSeriesCollection var2) {
      while (var2.size() > var1) {
         var2.removeAt(var2.size() - 1);
      }

      while (var2.size() < var1) {
         if (var2.size() == 0) {
            var2.add(((ChartSeriesCollection)var2).n5().getType());
         } else {
            var2.add(var2.get_Item(var2.size() - 1).getType());
         }
      }
   }

   protected static void n5(int var0, IChartSeries var1) {
      while (var1.getDataPoints().size() > var0) {
         var1.getDataPoints().removeAt(var1.getDataPoints().size() - 1);
      }

      while (var1.getDataPoints().size() < var0) {
         ((ChartDataPointCollection)var1.getDataPoints()).n5();
      }
   }

   protected static boolean n5(IChartDataCell var0) {
      if (var0 == null) {
         return false;
      }

      Object var1 = var0.getValue();
      return var1 == null
         ? false
         : com.aspose.slides.internal.v6g.k5.l6(var1, Byte.class)
            || com.aspose.slides.internal.v6g.k5.l6(var1, Integer.class)
            || com.aspose.slides.internal.v6g.k5.l6(var1, Short.class)
            || com.aspose.slides.internal.v6g.k5.l6(var1, Long.class)
            || com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.ms.System.c4.class)
            || com.aspose.slides.internal.v6g.k5.l6(var1, Double.class)
            || com.aspose.slides.internal.v6g.k5.l6(var1, Float.class);
   }

   protected final int n5(List<g1p> var1, ChartDataWorkbook var2) {
      boolean var3 = false;
      int var4 = Integer.MAX_VALUE;

      for (int var5 = var1.size() - 1; var5 >= 0; var5--) {
         for (int var6 = ((g1p)var1.get_Item(var5)).k5(); var6 >= ((g1p)var1.get_Item(var5)).l6(); var6--) {
            for (int var7 = ((g1p)var1.get_Item(var5)).a6(); var7 <= ((g1p)var1.get_Item(var5)).u9(); var7++) {
               IChartDataCell var8 = var2.getCell(((g1p)var1.get_Item(var5)).n5(), var7, var6);
               if (n5(var8)) {
                  if (!var3) {
                     var3 = true;
                  }

                  if (var7 < var4) {
                     var4 = var7;
                  }
                  break;
               }
            }
         }
      }

      if (var3) {
         return var4;
      } else {
         throw new InvalidOperationException("Numeric data not found");
      }
   }

   protected final int l6(List<g1p> var1, ChartDataWorkbook var2) {
      int var3 = Integer.MAX_VALUE;

      for (int var4 = 0; var4 < var1.size(); var4++) {
         g1p var5 = (g1p)var1.get_Item(var4);
         if (var5.l6() < var3) {
            for (int var6 = var5.a6(); var6 <= var5.u9(); var6++) {
               for (int var7 = var5.l6(); var7 <= var5.k5() && var7 < var3; var7++) {
                  IChartDataCell var8 = var2.getCell(((g1p)var1.get_Item(var4)).n5(), var6, var7);
                  if (n5(var8)) {
                     var3 = var7;
                     break;
                  }
               }
            }
         }
      }

      if (var3 == Integer.MAX_VALUE) {
         throw new InvalidOperationException("Numeric data not found");
      } else {
         return var3;
      }
   }

   static boolean n5(ChartDataWorkbook var0, IChartSeries var1, g1p var2, t1z$n5 var3) {
      if (var2.h0() > 0) {
         int var4 = var2.h0();
         n5(var4, var1);
         ChartDataPointCollection var5 = (ChartDataPointCollection)var1.getDataPoints();
         int var6 = 0;

         for (int var7 = var2.a6(); var7 <= var2.u9(); var7++) {
            IChartDataPoint var8 = var5.get_Item(var6);
            IChartDataCell var9 = var0.getCell(var2.n5(), var7, var2.l6());
            var3.n5(var9, var8);
            DataLabel var10 = com.aspose.slides.internal.v6g.k5.n5(var8.getLabel(), DataLabel.class);
            if (!com.aspose.slides.ms.System.d1.n5(var10.n5())) {
               var10.n5(var10.getValueFromCell().getValue().toString());
            }

            var6++;
         }
      }

      return false;
   }
}
