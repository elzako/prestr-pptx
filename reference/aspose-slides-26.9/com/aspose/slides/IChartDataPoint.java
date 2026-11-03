package com.aspose.slides;

import java.awt.Color;

public interface IChartDataPoint extends IActualLayout {
   IStringOrDoubleChartValue getXValue();

   IDoubleChartValue getYValue();

   IDoubleChartValue getBubbleSize();

   IDoubleChartValue getValue();

   IDoubleChartValue getSizeValue();

   IDoubleChartValue getColorValue();

   IErrorBarsCustomValues getErrorBarsCustomValues();

   IDataLabel getLabel();

   boolean isBubble3D();

   void setBubble3D(boolean var1);

   int getExplosion();

   void setExplosion(int var1);

   IFormat getFormat();

   void setFormat(IFormat var1);

   IMarker getMarker();

   void remove();

   Color getAutomaticDataPointColor();

   ILegendEntryProperties getRelatedLegendEntry();

   boolean getSetAsTotal();

   void setSetAsTotal(boolean var1);

   boolean getInvertIfNegative();

   void setInvertIfNegative(boolean var1);

   IChartDataPointLevelsManager getDataPointLevels();

   long getIndex();
}
