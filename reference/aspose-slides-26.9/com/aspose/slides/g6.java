package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class g6 extends n5u {
   @Override
   public String n5(IChart var1, s8z var2) {
      String var3 = var2.k5();
      com.aspose.slides.internal.l7h.a5 var4 = new com.aspose.slides.internal.l7h.a5();
      var4.n5(com.aspose.slides.ms.System.d1.n5("### {0} chart{1}",new Object[]{ com.aspose.slides.ms.System.s3.n5(ChartType.class, var1.getType()), var3}));
      if (var1.hasTitle() && var1.getChartTitle() != null && var1.getChartTitle().getTextFrameForOverriding() != null) {
         String var5 = var1.getChartTitle().getTextFrameForOverriding().getText();
         var4.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"Chart title: ", n5(var5), var3}));
      }

      IChartSeriesCollection var13 = var1.getChartData().getSeries();
      boolean var6 = false;

      for (int var7 = 0; var7 < var13.size(); var7++) {
         ChartSeries var8 = com.aspose.slides.internal.v6g.k5.n5(var13.get_Item(var7), ChartSeries.class);
         if (var8 != null && var8.getShowOutlierPoints()) {
            var6 = true;
            break;
         }
      }

      var4.n5("|Series|Min|Q1|Median|Q3|Max|Mean|");
      if (var6) {
         var4.n5("Outliers|");
      }

      var4.n5(var3);
      var4.n5("|-|-|-|-|-|-|-|");
      if (var6) {
         var4.n5("-|");
      }

      var4.n5(var3);

      for (int var14 = 0; var14 < var13.size(); var14++) {
         ChartSeries var15 = com.aspose.slides.internal.v6g.k5.n5(var13.get_Item(var14), ChartSeries.class);
         if (var15 != null) {
            String var9 = var15.getName() == null ? "" : n5(var15.getName().toString());
            d2 var10 = var15.s7();

            for (int var11 = 0; var11 < var10.n5(); var11++) {
               a0 var12 = var10.n5(var11);
               var4.n5('|');
               var4.n5(var9);
               var4.n5('|');
               var4.n5(n5(var12.z3()));
               var4.n5('|');
               var4.n5(n5(var12.t4()));
               var4.n5('|');
               var4.n5(n5(var12.z1()));
               var4.n5('|');
               var4.n5(n5(var12.q0()));
               var4.n5('|');
               var4.n5(n5(var12.m1()));
               var4.n5('|');
               var4.n5(n5(var12.t9()));
               var4.n5('|');
               if (var6) {
                  var4.n5(n5(n5(var12.k7())));
                  var4.n5('|');
               }

               var4.n5(var3);
            }
         }
      }

      return var4.toString();
   }

   private static String n5(double var0) {
      return com.aspose.slides.ms.System.d2.n5(var0, "G17", com.aspose.slides.internal.x7n.l6.k5());
   }

   private static String n5(List<IChartDataPoint> var0) {
      if (var0 != null && !var0.isEmpty()) {
         com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();

         for (int var2 = 0; var2 < var0.size(); var2++) {
            IChartDataPoint var3 = (IChartDataPoint)var0.get_Item(var2);
            if (var3 != null && var3.getValue() != null && var3.getValue().getData() != null) {
               Object var4 = n5(var3.getValue().getData());
               if (var4 != null) {
                  if (var1.l6() > 0) {
                     var1.n5(", ");
                  }

                  var1.n5(com.aspose.slides.ms.System.z3.t9(var4, com.aspose.slides.internal.x7n.l6.k5()));
               }
            }
         }

         return var1.toString();
      } else {
         return "";
      }
   }

   private static Object n5(Object var0) {
      IChartDataCell var1 = com.aspose.slides.internal.v6g.k5.n5(var0, IChartDataCell.class);
      return var1 != null ? var1.getValue() : var0;
   }
}
