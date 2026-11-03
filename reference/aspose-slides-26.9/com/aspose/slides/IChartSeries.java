package com.aspose.slides;

import java.awt.Color;

public interface IChartSeries extends IChartComponent {
   int getExplosion();

   void setExplosion(int var1);

   boolean getSmooth();

   void setSmooth(boolean var1);

   IMarker getMarker();

   int getBar3DShape();

   void setBar3DShape(int var1);

   IStringChartValue getName();

   IChartDataPointCollection getDataPoints();

   int getType();

   void setType(int var1);

   IChartSeriesGroup getParentSeriesGroup();

   IFormat getFormat();

   int getOrder();

   void setOrder(int var1);

   IDataLabelCollection getLabels();

   ITrendlineCollection getTrendLines();

   IErrorBarsFormat getErrorBarsXFormat();

   IErrorBarsFormat getErrorBarsYFormat();

   boolean getPlotOnSecondAxis();

   void setPlotOnSecondAxis(boolean var1);

   String getNumberFormatOfValues();

   void setNumberFormatOfValues(String var1);

   String getNumberFormatOfXValues();

   void setNumberFormatOfXValues(String var1);

   String getNumberFormatOfYValues();

   void setNumberFormatOfYValues(String var1);

   String getNumberFormatOfBubbleSizes();

   void setNumberFormatOfBubbleSizes(String var1);

   boolean getInvertIfNegative();

   void setInvertIfNegative(boolean var1);

   IColorFormat getInvertedSolidFillColor();

   ILegendEntryProperties getRelatedLegendEntry();

   Color getAutomaticSeriesColor();

   boolean getShowInnerPoints();

   void setShowInnerPoints(boolean var1);

   boolean getShowOutlierPoints();

   void setShowOutlierPoints(boolean var1);

   boolean getShowMeanMarkers();

   void setShowMeanMarkers(boolean var1);

   boolean getShowMeanLine();

   void setShowMeanLine(boolean var1);

   int getQuartileMethod();

   void setQuartileMethod(int var1);

   boolean getShowConnectorLines();

   void setShowConnectorLines(boolean var1);

   int getParentLabelLayout();

   void setParentLabelLayout(int var1);

   int getBubbleSizeScale();

   boolean hasUpDownBars();

   int getGapWidth();

   int getGapDepth();

   boolean isColorVaried();

   boolean hasSeriesLines();

   byte getOverlap();

   int getSecondPieSize();

   double getPieSplitPosition();

   int getPieSplitBy();

   byte getDoughnutHoleSize();

   int getFirstSliceAngle();

   IPieSplitCustomPointCollection getPieSplitCustomPoints();

   int getBubbleSizeRepresentation();
}
