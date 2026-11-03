package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class u8n extends t1z {
   @Override
   void n5(List<g1p> var1, IChartData var2) {
      ChartDataWorkbook var3 = (ChartDataWorkbook)var2.getChartDataWorkbook();
      g1p var4 = (g1p)var1.get_Item(0);
      int var5 = 0;

      for (int var6 = 0; var6 < var1.size(); var6++) {
         g1p var7 = (g1p)var1.get_Item(var6);
         var5 += var7.u3();
      }

      int var15 = var5 > 1 ? var5 - 1 : var5;
      int var16 = this.n5(var1, var3) - var4.a6();
      g1p var8 = var5 > 1 ? new g1p(var4.n5(), var4.l6(), var4.l6(), var4.a6() + var16, var4.u9()) : null;
      this.n5(var15, var2.getSeries());
      int var9 = 0;

      for (int var10 = 0; var10 < var1.size(); var10++) {
         g1p var11 = (g1p)var1.get_Item(var10);

         for (int var12 = var11.l6(); var12 <= var11.k5(); var12++) {
            if (var12 != var4.l6() || var8 == null) {
               ChartSeries var13 = (ChartSeries)var2.getSeries().get_Item(var9);
               var13.n5(new StringChartValue((ChartData)var2, new v1y(), false));
               if (var16 > 0) {
                  for (int var14 = 0; var14 < var16; var14++) {
                     var13.getName().getAsCells().add(var3.getCell(var11.n5(), var11.a6() + var14, var12));
                  }
               }

               g1p var17 = new g1p(var11.n5(), var12, var12, var11.a6() + var16, var11.u9());
               if (var8 != null) {
                  n5(var3, var13, var8, new u8n$1(this));
               }

               n5(var3, var13, var17, new u8n$2(this));
               var9++;
            }
         }
      }
   }
}
