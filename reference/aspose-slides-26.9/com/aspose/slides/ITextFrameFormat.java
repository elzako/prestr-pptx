package com.aspose.slides;

public interface ITextFrameFormat {
   ITextStyle getTextStyle();

   double getMarginLeft();

   void setMarginLeft(double var1);

   double getMarginRight();

   void setMarginRight(double var1);

   double getMarginTop();

   void setMarginTop(double var1);

   double getMarginBottom();

   void setMarginBottom(double var1);

   byte getWrapText();

   void setWrapText(byte var1);

   byte getAnchoringType();

   void setAnchoringType(byte var1);

   byte getCenterText();

   void setCenterText(byte var1);

   byte getTextVerticalType();

   void setTextVerticalType(byte var1);

   byte getAutofitType();

   void setAutofitType(byte var1);

   int getColumnCount();

   void setColumnCount(int var1);

   double getColumnSpacing();

   void setColumnSpacing(double var1);

   IThreeDFormat getThreeDFormat();

   boolean getKeepTextFlat();

   void setKeepTextFlat(boolean var1);

   float getRotationAngle();

   void setRotationAngle(float var1);

   byte getTransform();

   void setTransform(byte var1);

   ITextFrameFormatEffectiveData getEffective();
}
