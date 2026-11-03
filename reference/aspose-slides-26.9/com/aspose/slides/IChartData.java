package com.aspose.slides;

public interface IChartData {
   IChartDataWorkbook getChartDataWorkbook();

   IChartSeriesCollection getSeries();

   IChartSeriesGroupCollection getSeriesGroups();

   IChartCategoryCollection getCategories();

   boolean getUseSecondaryCategories();

   void setUseSecondaryCategories(boolean var1);

   IChartCategoryCollection getSecondaryCategories();

   byte[] readWorkbookStream();

   void writeWorkbookStream(byte[] var1);

   void setRange(String var1);

   String getRange();

   int getDataSourceType();

   String getExternalWorkbookPath();

   int getEmbeddedWorkbookType();

   void switchRowColumn();

   void setExternalWorkbook(String var1);

   void setExternalWorkbook(String var1, boolean var2);
}
