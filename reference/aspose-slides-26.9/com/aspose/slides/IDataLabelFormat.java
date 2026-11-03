package com.aspose.slides;

public interface IDataLabelFormat extends IFormattedTextContainer {
   boolean isNumberFormatLinkedToSource();

   void setNumberFormatLinkedToSource(boolean var1);

   String getNumberFormat();

   void setNumberFormat(String var1);

   IFormat getFormat();

   int getPosition();

   void setPosition(int var1);

   boolean getShowLegendKey();

   void setShowLegendKey(boolean var1);

   boolean getShowValue();

   void setShowValue(boolean var1);

   boolean getShowCategoryName();

   void setShowCategoryName(boolean var1);

   boolean getShowSeriesName();

   void setShowSeriesName(boolean var1);

   boolean getShowPercentage();

   void setShowPercentage(boolean var1);

   boolean getShowBubbleSize();

   void setShowBubbleSize(boolean var1);

   boolean getShowLeaderLines();

   void setShowLeaderLines(boolean var1);

   boolean getShowLabelAsDataCallout();

   void setShowLabelAsDataCallout(boolean var1);

   boolean getShowLabelValueFromCell();

   void setShowLabelValueFromCell(boolean var1);

   String getSeparator();

   void setSeparator(String var1);
}
