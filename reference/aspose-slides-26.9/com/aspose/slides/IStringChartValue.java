package com.aspose.slides;

public interface IStringChartValue extends IMultipleCellChartValue {
   String getAsLiteralString();

   void setAsLiteralString(String var1);

   @Override
   String toString();

   void setFromOneCell(IChartDataCell var1);

   String getCellsAddressInWorkbook();
}
