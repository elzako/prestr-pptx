package com.aspose.slides;

public interface IChartSeriesGroup extends IChartComponent {
   int getType();

   boolean getPlotOnSecondAxis();

   IChartSeriesReadonlyCollection getSeries();

   IChartSeries get_Item(int var1);

   IUpDownBarsManager getUpDownBars();

   int getGapWidth();

   void setGapWidth(int var1);

   int getGapDepth();

   void setGapDepth(int var1);

   int getFirstSliceAngle();

   void setFirstSliceAngle(int var1);

   boolean isColorVaried();

   void setColorVaried(boolean var1);

   boolean hasSeriesLines();

   void setSeriesLines(boolean var1);

   byte getOverlap();

   void setOverlap(byte var1);

   int getSecondPieSize();

   void setSecondPieSize(int var1);

   double getPieSplitPosition();

   void setPieSplitPosition(double var1);

   int getPieSplitBy();

   void setPieSplitBy(int var1);

   IPieSplitCustomPointCollection getPieSplitCustomPoints();

   byte getDoughnutHoleSize();

   void setDoughnutHoleSize(byte var1);

   int getBubbleSizeScale();

   void setBubbleSizeScale(int var1);

   IChartLinesFormat getHiLowLinesFormat();

   int getBubbleSizeRepresentation();

   void setBubbleSizeRepresentation(int var1);
}
