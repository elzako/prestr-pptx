package com.aspose.slides;

class i0t extends n5u {
   @Override
   public String n5(IChart var1, s8z var2) {
      String var3 = var2.k5();
      com.aspose.slides.internal.l7h.a5 var4 = new com.aspose.slides.internal.l7h.a5();
      var4.n5(com.aspose.slides.ms.System.d1.n5("### {0} chart{1}",new Object[]{ com.aspose.slides.ms.System.s3.n5(ChartType.class, var1.getType()), var3}));
      if (var1.hasTitle() && var1.getChartTitle() != null && var1.getChartTitle().getTextFrameForOverriding() != null) {
         String var5 = var1.getChartTitle().getTextFrameForOverriding().getText();
         var4.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"Chart title: ", n5(var5), var3}));
      }

      IChartSeriesCollection var16 = var1.getChartData().getSeries();
      boolean var6 = ChartTypeCharacterizer.isChartTypeBubble(var1.getType());
      var4.n5("|X|");

      for (int var7 = 0; var7 < var16.size(); var7++) {
         String var8 = var16.get_Item(var7).getName() == null ? "" : n5(var16.get_Item(var7).getName().toString());
         var4.n5(com.aspose.slides.ms.System.d1.n5(new Object[]{var8, '|'}));
         if (var6) {
            var4.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var8, " Size|"}));
         }
      }

      var4.n5(var3);
      int var17 = 1 + var16.size() * (var6 ? 2 : 1);
      var4.n5('|');

      for (int var18 = 0; var18 < var17; var18++) {
         var4.n5("-|");
      }

      var4.n5(var3);
      int var19 = 0;

      for (int var9 = 0; var9 < var16.size(); var9++) {
         if (var16.get_Item(var9).getDataPoints().size() > var19) {
            var19 = var16.get_Item(var9).getDataPoints().size();
         }
      }

      for (int var20 = 0; var20 < var19; var20++) {
         String var10 = "";

         for (int var11 = 0; var11 < var16.size(); var11++) {
            IChartDataPointCollection var12 = var16.get_Item(var11).getDataPoints();
            if (var20 < var12.size()
               && var12.get_Item(var20) != null
               && var12.get_Item(var20).getXValue() != null
               && var12.get_Item(var20).getXValue().getData() != null) {
               var10 = com.aspose.slides.ms.System.z3.t9(var12.get_Item(var20).getXValue().getData(), com.aspose.slides.internal.x7n.l6.k5());
               break;
            }
         }

         var4.n5('|');
         var4.n5(n5(var10));
         var4.n5('|');

         for (int var21 = 0; var21 < var16.size(); var21++) {
            IChartDataPointCollection var22 = var16.get_Item(var21).getDataPoints();
            IChartDataPoint var13 = var20 < var22.size() ? var22.get_Item(var20) : null;
            String var14 = "";
            if (var13 != null && var13.getYValue() != null && var13.getYValue().getData() != null) {
               var14 = com.aspose.slides.ms.System.z3.t9(var13.getYValue().getData(), com.aspose.slides.internal.x7n.l6.k5());
            }

            var4.n5(n5(var14));
            var4.n5('|');
            if (var6) {
               String var15 = "";
               if (var13 != null && var13.getBubbleSize() != null && var13.getBubbleSize().getData() != null) {
                  var15 = com.aspose.slides.ms.System.z3.t9(var13.getBubbleSize().getData(), com.aspose.slides.internal.x7n.l6.k5());
               }

               var4.n5(n5(var15));
               var4.n5('|');
            }
         }

         var4.n5(var3);
      }

      return var4.toString();
   }
}
