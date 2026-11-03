package com.aspose.slides;

class z4$1 extends t1z$n5 {
   // $VF: synthetic field
   final ChartSeries[] n5;
   // $VF: synthetic field
   final z4 l6;

   z4$1(z4 var1, ChartSeries[] var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public void n5(IChartDataCell var1, IChartDataPoint var2) {
      if (ChartTypeCharacterizer.n3(this.n5[0].getType())) {
         var2.getSizeValue().setAsCell(var1);
      } else {
         var2.getValue().setAsCell(var1);
      }
   }
}
