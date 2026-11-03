package com.aspose.slides;

class p7x {
   public static void n5(IChartPlotArea var0, com.aspose.slides.internal.k4y.a1v var1, t5w var2) {
      ((ChartPlotArea)var0).n5 = true;
      l1b var3 = ((ChartPlotArea)var0).n5();
      var3.n5(var1.a6());
      var3.l6(var1.l6().a6());
      var3.n5(var1.u3());
      if (var1.l6().k5() != null) {
         var3.k5(var1.l6().k5().k5());
         k5r.n5(var0.getFormat(), var1.l6().k5().l6(), var2);
      }
   }

   public static void n5(IChartPlotArea var0, com.aspose.slides.internal.k4y.w2p var1, j8m var2) {
      com.aspose.slides.internal.k4y.a1v var3 = var1.k5().u3();
      l1b var4 = ((ChartPlotArea)var0).n5();
      var3.n5(var4.u3());
      var3.n5(var4.n5());
      var3.l6().n5(var4.l6());
      var3.l6().n5();
      var3.l6().k5().n5(var4.k5());
      k5r.n5(var0.getFormat(), new p7x$1(var3), var2.n5().n5(), null, false);
   }
}
