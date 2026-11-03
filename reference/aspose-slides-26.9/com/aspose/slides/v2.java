package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class v2 extends t1z {
   @Override
   void n5(List<g1p> var1, IChartData var2) {
      ChartDataWorkbook var3 = (ChartDataWorkbook)var2.getChartDataWorkbook();
      g1p var4 = (g1p)var1.get_Item(0);
      int var5 = 0;

      for (int var6 = 0; var6 < var1.size(); var6++) {
         g1p var7 = (g1p)var1.get_Item(var6);
         var5 += var7.u3();
      }

      int var16 = (var5 - 1) % 2 == 0 ? (var5 - 1) / 2 : (var5 - 1) / 2 + 1;
      if (var16 == 0) {
         var16 = 1;
      }

      int var17 = this.n5(var1, var3) - var4.a6();
      g1p var8 = var5 > 1 ? new g1p(var4.n5(), var4.l6(), var4.l6(), var4.a6() + var17, var4.u9()) : null;
      this.n5(var16, var2.getSeries());
      int var9 = 0;
      boolean var10 = false;

      for (int var11 = 0; var11 < var1.size(); var11++) {
         g1p var12 = (g1p)var1.get_Item(var11);

         for (int var13 = var12.l6(); var13 <= var12.k5(); var13++) {
            if (var13 != var4.l6() || var8 == null) {
               ChartSeries[] var14 = new ChartSeries[]{(ChartSeries)var2.getSeries().get_Item(var9)};
               if (!var10) {
                  var14[0].n5(new StringChartValue((ChartData)var2, new v1y(), false));
                  if (var17 > 0) {
                     for (int var15 = 0; var15 < var17; var15++) {
                        var14[0].getName().getAsCells().add(var3.getCell(var12.n5(), var12.a6() + var15, var13));
                     }
                  }
               }

               g1p var18 = new g1p(var12.n5(), var13, var13, var12.a6() + var17, var12.u9());
               if (var5 <= 2) {
                  var14[0].getDataPoints().setDataSourceTypeForBubbleSizes(2);
               }

               if (var10) {
                  n5(var3, var2.getSeries().get_Item(var9), var18, new v2$1(this));
                  var10 = false;
                  var9++;
               } else {
                  n5(var3, var14[0], var18, new v2$2(this, var14));
                  if (var8 != null) {
                     n5(var3, var14[0], var8, new v2$3(this));
                  }

                  var10 = true;
               }
            }
         }
      }
   }
}
