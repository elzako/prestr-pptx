package com.aspose.slides;

public interface IAxis extends IFormattedTextContainer {
   boolean getAxisBetweenCategories();

   void setAxisBetweenCategories(boolean var1);

   float getCrossAt();

   void setCrossAt(float var1);

   int getDisplayUnit();

   void setDisplayUnit(int var1);

   double getActualMaxValue();

   double getActualMinValue();

   double getActualMajorUnit();

   double getActualMinorUnit();

   int getActualMajorUnitScale();

   int getActualMinorUnitScale();

   boolean isAutomaticMaxValue();

   void setAutomaticMaxValue(boolean var1);

   double getMaxValue();

   void setMaxValue(double var1);

   double getMinorUnit();

   void setMinorUnit(double var1);

   boolean isAutomaticMinorUnit();

   void setAutomaticMinorUnit(boolean var1);

   double getMajorUnit();

   void setMajorUnit(double var1);

   boolean isAutomaticMajorUnit();

   void setAutomaticMajorUnit(boolean var1);

   boolean isAutomaticMinValue();

   void setAutomaticMinValue(boolean var1);

   double getMinValue();

   void setMinValue(double var1);

   boolean isLogarithmic();

   void setLogarithmic(boolean var1);

   double getLogBase();

   void setLogBase(double var1);

   boolean isPlotOrderReversed();

   void setPlotOrderReversed(boolean var1);

   boolean isVisible();

   void setVisible(boolean var1);

   int getMajorTickMark();

   void setMajorTickMark(int var1);

   int getMinorTickMark();

   void setMinorTickMark(int var1);

   int getTickLabelPosition();

   void setTickLabelPosition(int var1);

   int getMajorUnitScale();

   void setMajorUnitScale(int var1);

   int getMinorUnitScale();

   void setMinorUnitScale(int var1);

   int getBaseUnitScale();

   void setBaseUnitScale(int var1);

   IChartLinesFormat getMinorGridLinesFormat();

   IChartLinesFormat getMajorGridLinesFormat();

   boolean getShowMinorGridLines();

   boolean getShowMajorGridLines();

   IAxisFormat getFormat();

   IChartTitle getTitle();

   int getCrossType();

   void setCrossType(int var1);

   int getPosition();

   void setPosition(int var1);

   boolean hasTitle();

   void setTitle(boolean var1);

   String getNumberFormat();

   void setNumberFormat(String var1);

   boolean isNumberFormatLinkedToSource();

   void setNumberFormatLinkedToSource(boolean var1);

   float getTickLabelRotationAngle();

   void setTickLabelRotationAngle(float var1);

   long getTickLabelSpacing();

   void setTickLabelSpacing(long var1);

   boolean isAutomaticTickLabelSpacing();

   void setAutomaticTickLabelSpacing(boolean var1);

   long getTickMarksSpacing();

   void setTickMarksSpacing(long var1);

   boolean isAutomaticTickMarksSpacing();

   void setAutomaticTickMarksSpacing(boolean var1);

   int getLabelOffset();

   void setLabelOffset(int var1);

   int getCategoryAxisType();

   void setCategoryAxisType(int var1);

   void setCategoryAxisTypeAutomatically();

   int getAggregationType();

   void setAggregationType(int var1);

   double getBinWidth();

   void setBinWidth(double var1);

   long getNumberOfBins();

   void setNumberOfBins(long var1);

   boolean isOverflowBin();

   void setOverflowBin(boolean var1);

   boolean isAutomaticOverflowBin();

   void setAutomaticOverflowBin(boolean var1);

   double getOverflowBin();

   void setOverflowBin(double var1);

   boolean isUnderflowBin();

   void setUnderflowBin(boolean var1);

   boolean isAutomaticUnderflowBin();

   void setAutomaticUnderflowBin(boolean var1);

   double getUnderflowBin();

   void setUnderflowBin(double var1);
}
