package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;

class o6t {
   public static void n5(IChartPlotArea var0, com.aspose.slides.internal.k4y.w4c var1, t5w var2) {
      if (var1 == null) {
         throw new Exception("plotAreaElementData must not be null.");
      }

      k5r.n5(var0.getFormat(), var1.c8(), var2);
      l1b var3 = ((ChartPlotArea)var0).n5();
      c4f.n5(var3, var1.u3());
      if (!com.aspose.slides.ms.System.n1.k5(var3.getWidth())
         && !com.aspose.slides.ms.System.n1.k5(var3.getHeight())
         && !com.aspose.slides.ms.System.n1.k5(var3.getX())
         && !com.aspose.slides.ms.System.n1.k5(var3.getY())) {
         ((ChartPlotArea)var0).n5 = false;
      }

      var3.n5(var1.t2());
   }

   public static void n5(IChartPlotArea var0, com.aspose.slides.internal.k4y.w4c var1, g6c var2) {
      k5r.n5(var0.getFormat(), new o6t$1(var1), var2, null, false);
      l1b var3 = ((ChartPlotArea)var0).n5();
      c4f.n5(var3, new o6t$2(var1));
      var1.n5(var3.a6());
   }
}
