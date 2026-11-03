package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

abstract class k3h {
   abstract void n5(IChartSeries var1, com.aspose.slides.internal.k4y.z8 var2, int var3, t5w var4, boolean var5);

   abstract void n5(IChartSeries var1, com.aspose.slides.internal.k4y.m3 var2);

   abstract void n5(IChartSeries var1, com.aspose.slides.internal.k4y.z8 var2, int var3);

   static boolean n5(String var0, double[] var1) {
      if (com.aspose.slides.ms.System.d2.n5(var0, 511, com.aspose.slides.internal.x7n.s7.x8(), var1)) {
         return true;
      } else {
         String var2 = com.aspose.slides.ms.System.d1.l6(var0);
         if ("Infinity".equals(var2) || "INF".equals(var0)) {
            var1[0] = Double.POSITIVE_INFINITY;
            return true;
         } else if ("-Infinity".equals(var2) || "-INF".equals(var2)) {
            var1[0] = Double.NEGATIVE_INFINITY;
            return true;
         } else if ("-".equals(var2)) {
            var1[0] = -0.0;
            return true;
         } else if ("#N/A".equals(var2)) {
            var1[0] = 0.0;
            return true;
         } else {
            var1[0] = 0.0;
            return false;
         }
      }
   }

   static ISingleCellChartValue n5(IChartDataPoint var0, int var1) {
      switch (var1) {
         case 0:
            return var0.getXValue();
         case 1:
            return var0.getYValue();
         case 2:
            return var0.getBubbleSize();
         case 3:
            return var0.getValue();
         case 4:
            return ((ChartDataPoint)var0).getErrorBarsCustomValues().getXPlus();
         case 5:
            return ((ChartDataPoint)var0).getErrorBarsCustomValues().getXMinus();
         case 6:
            return ((ChartDataPoint)var0).getErrorBarsCustomValues().getYPlus();
         case 7:
            return ((ChartDataPoint)var0).getErrorBarsCustomValues().getYMinus();
         case 8:
            return var0.getSizeValue();
         case 9:
            return var0.getColorValue();
         default:
            throw new ArgumentOutOfRangeException();
      }
   }

   boolean n5(IChartSeries var1, int var2) {
      return true;
   }

   protected final void l6(IChartSeries var1, com.aspose.slides.internal.k4y.z8 var2, int var3) {
      int var4 = var2.n5();
      w4w var5 = ((ChartDataPointCollection)var1.getDataPoints()).k5();
      switch (var3) {
         case 0:
            var1.getDataPoints().setDataSourceTypeForXValues(var4);
            var5.n5(var2.k5());
            break;
         case 1:
            var1.getDataPoints().setDataSourceTypeForYValues(var4);
            var5.l6(var2.k5());
            break;
         case 2:
            var1.getDataPoints().setDataSourceTypeForBubbleSizes(var4);
            var5.k5(var2.k5());
            break;
         case 3:
            var1.getDataPoints().setDataSourceTypeForValues(var4);
            var5.u3(var2.k5());
            break;
         case 4:
            ((ChartDataPointCollection)var1.getDataPoints()).getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForXPlusValues(var4);
            var5.u9(var2.k5());
            break;
         case 5:
            ((ChartDataPointCollection)var1.getDataPoints()).getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForXMinusValues(var4);
            var5.a6(var2.k5());
            break;
         case 6:
            ((ChartDataPointCollection)var1.getDataPoints()).getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForYPlusValues(var4);
            var5.u9(var2.k5());
            break;
         case 7:
            ((ChartDataPointCollection)var1.getDataPoints()).getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForYMinusValues(var4);
            var5.h0(var2.k5());
            break;
         default:
            throw new ArgumentOutOfRangeException();
      }
   }
}
