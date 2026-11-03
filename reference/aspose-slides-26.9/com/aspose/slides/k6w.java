package com.aspose.slides;

class k6w extends n5u {
   @Override
   public String n5(IChart var1, s8z var2) {
      String var3 = var2.k5();
      com.aspose.slides.internal.l7h.a5 var4 = new com.aspose.slides.internal.l7h.a5();
      var4.n5(com.aspose.slides.ms.System.d1.n5("### {0} chart{1}",new Object[]{ com.aspose.slides.ms.System.s3.n5(ChartType.class, var1.getType()), var3}));
      if (var1.hasTitle() && var1.getChartTitle() != null && var1.getChartTitle().getTextFrameForOverriding() != null) {
         String var5 = var1.getChartTitle().getTextFrameForOverriding().getText();
         var4.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"Chart title: ", n5(var5), var3}));
      }

      IChartSeriesCollection var11 = var1.getChartData().getSeries();
      if (var11.size() == 0) {
         return var4.toString();
      }

      ChartSeries var6 = com.aspose.slides.internal.v6g.k5.n5(var11.get_Item(0), ChartSeries.class);
      if (var6 == null) {
         return var4.toString();
      }

      d2 var7 = var6.s7();
      var4.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"|Bin|Frequency|", var3}));
      var4.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"|-|-|", var3}));

      for (int var8 = 0; var8 < var7.n5(); var8++) {
         String var9 = var7.n5(var8).t2() == null ? "" : n5(var7.n5(var8).t2());
         String var10 = com.aspose.slides.ms.System.z3.n5(var7.n5(var8).n3(), com.aspose.slides.internal.x7n.l6.k5());
         var4.n5('|');
         var4.n5(n5(var9));
         var4.n5('|');
         var4.n5(n5(var10));
         var4.n5('|');
         var4.n5(var3);
      }

      return var4.toString();
   }
}
