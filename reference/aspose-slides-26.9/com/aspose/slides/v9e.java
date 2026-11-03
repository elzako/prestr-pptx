package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class v9e {
   public static void n5(IChartData var0, com.aspose.slides.internal.k4y.w2p var1, c1x var2) {
      com.aspose.slides.internal.k4y.o3m var3 = var1.k5().u3().l6();
      ChartSeriesGroup var4 = null;

      for (int var5 = 0; var5 < var3.u3().length; var5++) {
         com.aspose.slides.internal.k4y.x1i var6 = var3.u3()[var5];
         int var7 = u7f.n5(var1.k5().u3(), var6);
         boolean var8 = var7 == 77;
         IChartSeries var9;
         if (var4 != null && var7 != 77 && var4.getType() != 54) {
            var9 = ((ChartSeriesCollection)var0.getSeries()).n5(var7, var4, var8);
         } else {
            var9 = ((ChartSeriesCollection)var0.getSeries()).n5(var7, var8);
            var4 = (ChartSeriesGroup)var9.getParentSeriesGroup();
         }

         com.aspose.slides.internal.v6g.k5.n5(var9, ChartSeries.class).n5().n5(var5 & 4294967295L);
         if (var0.getCategories().size() == 0) {
            w1n.n5((ChartCategoryCollection)var0.getCategories(), var6, var1);
         }

         x4a.n5(var9, var6, var1, var2);
      }
   }

   public static void n5(IChart var0, com.aspose.slides.internal.k4y.w2p var1, j8m var2) {
      IChartData var3 = var0.getChartData();
      IGenericEnumerator var4 = var3.getSeriesGroups().iterator();

      try {
         while (var4.hasNext()) {
            ChartSeriesGroup var5 = (ChartSeriesGroup)var4.next();
            IGenericEnumerator var6 = var5.getSeries().iterator();

            try {
               while (var6.hasNext()) {
                  IChartSeries var7 = (IChartSeries)var6.next();
                  com.aspose.slides.internal.k4y.x1i var8 = var1.k5().u3().l6().l6();
                  x4a.n5(var7, var8, var1, var2);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }
}
