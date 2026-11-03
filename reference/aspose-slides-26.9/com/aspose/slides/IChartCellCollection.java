package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;

public interface IChartCellCollection extends IGenericEnumerable<IChartDataCell> {
   String getCellsAddress();

   String getConcatenatedValuesFromCells();

   IChartDataCell get_Item(int var1);

   void add(IChartDataCell var1);

   void add(Object var1);

   void removeAt(int var1);

   int getCount();
}
