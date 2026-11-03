package com.aspose.slides;

public interface IRow extends IBulkTextFormattable, ICellCollection {
   double getHeight();

   double getMinimalHeight();

   void setMinimalHeight(double var1);

   IRowFormat getRowFormat();
}
