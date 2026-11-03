package com.aspose.slides;

class v2$2 extends t1z$n5 {
   // $VF: synthetic field
   final ChartSeries[] n5;
   // $VF: synthetic field
   final v2 l6;

   v2$2(v2 var1, ChartSeries[] var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public void n5(IChartDataCell var1, IChartDataPoint var2) {
      var2.getYValue().setAsCell(var1);
      if (var2.getXValue().getAsCell() != null) {
         var2.getXValue().setAsCell(null);
      }

      if (this.n5[0].getDataPoints().getDataSourceTypeForBubbleSizes() == 2) {
         var2.getBubbleSize().setAsLiteralDouble(1.0);
      }
   }
}
