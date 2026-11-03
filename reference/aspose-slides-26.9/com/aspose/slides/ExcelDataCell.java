package com.aspose.slides;

public class ExcelDataCell implements IExcelDataCell {
   private final IChartDataCell n5;

   ExcelDataCell(IChartDataCell chartDataCell) {
      this.n5 = chartDataCell;
   }

   @Override
   public final Object getValue() {
      return this.n5.getValue();
   }

   @Override
   public final String getName() {
      return ((ChartDataCell)this.n5).a6();
   }

   @Override
   public final int getRow() {
      return this.n5.getRow();
   }

   @Override
   public final int getColumn() {
      return this.n5.getColumn();
   }
}
