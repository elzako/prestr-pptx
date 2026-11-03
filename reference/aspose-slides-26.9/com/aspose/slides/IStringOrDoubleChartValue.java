package com.aspose.slides;

public interface IStringOrDoubleChartValue extends ISingleCellChartValue {
   String getAsLiteralString();

   void setAsLiteralString(String var1);

   double getAsLiteralDouble();

   void setAsLiteralDouble(double var1);

   double toDouble();
}
