package com.aspose.slides;

final class z6e$2 extends t1z$n5 {
   @Override
   public void n5(IChartDataCell var1, IChartDataPoint var2) {
      var2.getYValue().setAsCell(var1);
      if (var2.getXValue().getDataSourceType() == 2) {
         var2.getXValue().setAsLiteralDouble((var2.getIndex() & 4294967295L) + 1L & 4294967295L);
      }
   }
}
