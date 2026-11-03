package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class z4 extends t1z {
   @Override
   void n5(List<g1p> var1, IChartData var2) {
      ChartDataWorkbook var3 = (ChartDataWorkbook)var2.getChartDataWorkbook();
      int var4 = this.l6(var1, var3);
      g1p var5 = (g1p)var1.get_Item(0);
      int var6 = this.n5(var1, var3) - var5.a6();
      int var7 = var5.k5() - var4 + 1;

      for (int var8 = 1; var8 < var1.size(); var8++) {
         g1p var9 = (g1p)var1.get_Item(var8);
         var7 += var9.l6() - var9.k5() + 1;
      }

      this.n5(var7, var2.getSeries());
      int var14 = 0;

      for (int var15 = 0; var15 < var1.size(); var15++) {
         g1p var10 = (g1p)var1.get_Item(var15);

         for (int var11 = var10.l6(); var11 <= var10.k5(); var11++) {
            if (var11 >= var4) {
               ChartSeries[] var12 = new ChartSeries[]{(ChartSeries)var2.getSeries().get_Item(var14)};
               var12[0].n5(new StringChartValue((ChartData)var2, new v1y(), false));
               if (var6 > 0) {
                  for (int var13 = 0; var13 < var6; var13++) {
                     var12[0].getName().getAsCells().add(var3.getCell(var10.n5(), var10.a6() + var13, var11));
                  }
               }

               g1p var16 = new g1p(var10.n5(), var11, var11, var10.a6() + var6, var10.u9());
               n5(var3, var12[0], var16, new z4$1(this, var12));
               var14++;
            }
         }
      }
   }

   @Override
   void l6(List<g1p> var1, IChartData var2) {
      ChartDataWorkbook var3 = (ChartDataWorkbook)var2.getChartDataWorkbook();
      g1p var4 = (g1p)var1.get_Item(0);
      var2.getCategories().clear();
      int var5 = this.l6(var1, var3) - var4.l6();
      if (var5 != 0) {
         String[] var6 = new String[var5 - 1];
         int var7 = this.n5(var1, var3);

         for (int var8 = var7; var8 <= var4.u9(); var8++) {
            for (int var9 = var5 - 1; var9 >= 0; var9--) {
               int var10 = var4.l6() + var9;
               IChartDataCell var11 = var3.getCell(var4.n5(), var8, var10);
               if (var9 == var5 - 1) {
                  var2.getCategories().add(var11);
               } else {
                  int var12 = var5 - 1 - var9;
                  if (var11.getValue() != null
                     && !com.aspose.slides.ms.System.d1.n5(var11.getValue().toString())
                     && !com.aspose.slides.ms.System.d1.a6(var11.getValue().toString(), var6[var9])) {
                     var2.getCategories().get_Item(var2.getCategories().size() - 1).getGroupingLevels().setGroupingItem(var12, var11.getValue().toString());
                     var6[var9] = var11.getValue().toString();
                  }
               }
            }
         }
      }
   }
}
