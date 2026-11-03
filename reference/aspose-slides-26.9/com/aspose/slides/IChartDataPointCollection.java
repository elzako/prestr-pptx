package com.aspose.slides;

public interface IChartDataPointCollection extends IGenericCollection<IChartDataPoint> {
   IChartDataPoint get_Item(int var1);

   int get_Item(IChartDataPoint var1);

   int getDataSourceTypeForXValues();

   void setDataSourceTypeForXValues(int var1);

   int getDataSourceTypeForYValues();

   void setDataSourceTypeForYValues(int var1);

   int getDataSourceTypeForBubbleSizes();

   void setDataSourceTypeForBubbleSizes(int var1);

   int getDataSourceTypeForValues();

   void setDataSourceTypeForValues(int var1);

   IDataSourceTypeForErrorBarsCustomValues getDataSourceTypeForErrorBarsCustomValues();

   IChartDataPoint getOrCreateDataPointByIdx(long var1);

   IChartDataPoint addDataPointForStockSeries(IChartDataCell var1);

   IChartDataPoint addDataPointForStockSeries(double var1);

   IChartDataPoint addDataPointForLineSeries(IChartDataCell var1);

   IChartDataPoint addDataPointForLineSeries(double var1);

   IChartDataPoint addDataPointForScatterSeries(IChartDataCell var1, IChartDataCell var2);

   IChartDataPoint addDataPointForScatterSeries(double var1, IChartDataCell var3);

   IChartDataPoint addDataPointForScatterSeries(String var1, IChartDataCell var2);

   IChartDataPoint addDataPointForScatterSeries(IChartDataCell var1, double var2);

   IChartDataPoint addDataPointForScatterSeries(double var1, double var3);

   IChartDataPoint addDataPointForScatterSeries(String var1, double var2);

   IChartDataPoint addDataPointForRadarSeries(IChartDataCell var1);

   IChartDataPoint addDataPointForRadarSeries(double var1);

   IChartDataPoint addDataPointForBarSeries(IChartDataCell var1);

   IChartDataPoint addDataPointForBarSeries(double var1);

   IChartDataPoint addDataPointForAreaSeries(IChartDataCell var1);

   IChartDataPoint addDataPointForAreaSeries(double var1);

   IChartDataPoint addDataPointForPieSeries(IChartDataCell var1);

   IChartDataPoint addDataPointForPieSeries(double var1);

   IChartDataPoint addDataPointForDoughnutSeries(IChartDataCell var1);

   IChartDataPoint addDataPointForDoughnutSeries(double var1);

   IChartDataPoint addDataPointForBubbleSeries(IChartDataCell var1, IChartDataCell var2, IChartDataCell var3);

   IChartDataPoint addDataPointForBubbleSeries(double var1, IChartDataCell var3, IChartDataCell var4);

   IChartDataPoint addDataPointForBubbleSeries(String var1, IChartDataCell var2, IChartDataCell var3);

   IChartDataPoint addDataPointForBubbleSeries(IChartDataCell var1, double var2, IChartDataCell var4);

   IChartDataPoint addDataPointForBubbleSeries(double var1, double var3, IChartDataCell var5);

   IChartDataPoint addDataPointForBubbleSeries(String var1, double var2, IChartDataCell var4);

   IChartDataPoint addDataPointForBubbleSeries(IChartDataCell var1, IChartDataCell var2, double var3);

   IChartDataPoint addDataPointForBubbleSeries(double var1, IChartDataCell var3, double var4);

   IChartDataPoint addDataPointForBubbleSeries(String var1, IChartDataCell var2, double var3);

   IChartDataPoint addDataPointForBubbleSeries(IChartDataCell var1, double var2, double var4);

   IChartDataPoint addDataPointForBubbleSeries(double var1, double var3, double var5);

   IChartDataPoint addDataPointForBubbleSeries(String var1, double var2, double var4);

   IChartDataPoint addDataPointForSurfaceSeries(IChartDataCell var1);

   IChartDataPoint addDataPointForSurfaceSeries(double var1);

   IChartDataPoint addDataPointForSunburstSeries(IChartDataCell var1);

   IChartDataPoint addDataPointForWaterfallSeries(IChartDataCell var1);

   IChartDataPoint addDataPointForBoxAndWhiskerSeries(IChartDataCell var1);

   IChartDataPoint addDataPointForTreemapSeries(IChartDataCell var1);

   IChartDataPoint addDataPointForHistogramSeries(IChartDataCell var1);

   IChartDataPoint addDataPointForFunnelSeries(IChartDataCell var1);

   IChartDataPoint addDataPointForMapSeries(IChartDataCell var1);

   void clear();

   void remove(IChartDataPoint var1);

   void removeAt(int var1);
}
