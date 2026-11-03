package com.aspose.slides;

public interface IChartSeriesCollection extends IGenericCollection<IChartSeries> {
   IChartSeries get_Item(int var1);

   IChartSeries add(int var1);

   IChartSeries insert(int var1, int var2);

   IChartSeries add(IChartDataCell var1, int var2);

   IChartSeries add(IChartCellCollection var1, int var2);

   IChartSeries add(String var1, int var2);

   int indexOf(IChartSeries var1);

   void remove(IChartSeries var1);

   void removeAt(int var1);

   void clear();
}
