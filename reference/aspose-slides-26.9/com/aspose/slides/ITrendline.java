package com.aspose.slides;

public interface ITrendline extends IOverridableText {
   String getTrendlineName();

   void setTrendlineName(String var1);

   int getTrendlineType();

   void setTrendlineType(int var1);

   IFormat getFormat();

   void setFormat(IFormat var1);

   double getBackward();

   void setBackward(double var1);

   double getForward();

   void setForward(double var1);

   double getIntercept();

   void setIntercept(double var1);

   boolean getDisplayEquation();

   void setDisplayEquation(boolean var1);

   byte getOrder();

   void setOrder(byte var1);

   byte getPeriod();

   void setPeriod(byte var1);

   boolean getDisplayRSquaredValue();

   void setDisplayRSquaredValue(boolean var1);

   ILegendEntryProperties getRelatedLegendEntry();
}
