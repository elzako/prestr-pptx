package com.aspose.slides;

class m0t extends n5u {
   @Override
   public String n5(IChart var1, s8z var2) {
      String var3 = var2.k5();
      com.aspose.slides.internal.l7h.a5 var4 = new com.aspose.slides.internal.l7h.a5();
      var4.n5(com.aspose.slides.ms.System.d1.n5("### {0} chart{1}",new Object[]{ com.aspose.slides.ms.System.s3.n5(ChartType.class, var1.getType()), var3}));
      if (var1.hasTitle() && var1.getChartTitle() != null && var1.getChartTitle().getTextFrameForOverriding() != null) {
         String var5 = var1.getChartTitle().getTextFrameForOverriding().getText();
         var4.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"Chart title: ", n5(var5), var3}));
      }

      IChartSeriesCollection var12 = var1.getChartData().getSeries();
      IChartCategoryCollection var6 = var1.getChartData().getCategories();
      var4.n5("||");

      for (int var7 = 0; var7 < var12.size(); var7++) {
         var4.n5(n5(var12.get_Item(var7).getName().toString()));
         var4.n5("|");
      }

      var4.n5(var3);
      var4.n5("|-|");

      for (int var13 = 0; var13 < var12.size(); var13++) {
         var4.n5("-|");
      }

      var4.n5(var3);

      for (int var14 = 0; var14 < var6.size(); var14++) {
         var4.n5('|');
         var4.n5(n5(n5(var6.get_Item(var14), var1)));
         var4.n5('|');

         for (int var8 = 0; var8 < var12.size(); var8++) {
            IChartDataPointCollection var9 = var12.get_Item(var8).getDataPoints();
            String var10 = "";
            if (var14 < var9.size()) {
               IChartDataPoint var11 = var9.get_Item(var14);
               if (var11 != null && var11.getValue() != null && var11.getValue().getData() != null) {
                  var10 = com.aspose.slides.ms.System.z3.t9(var11.getValue().getData(), com.aspose.slides.internal.x7n.l6.k5());
               }
            }

            var4.n5(n5(var10));
            var4.n5('|');
         }

         var4.n5(var3);
      }

      return var4.toString();
   }
}
