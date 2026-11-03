package com.aspose.slides;

public interface ILineFormat extends ILineParamSource {
   boolean isFormatNotDefined();

   ILineFillFormat getFillFormat();

   ISketchFormat getSketchFormat();

   double getWidth();

   void setWidth(double var1);

   byte getDashStyle();

   void setDashStyle(byte var1);

   float[] getCustomDashPattern();

   void setCustomDashPattern(float[] var1);

   byte getCapStyle();

   void setCapStyle(byte var1);

   byte getStyle();

   void setStyle(byte var1);

   byte getAlignment();

   void setAlignment(byte var1);

   byte getJoinStyle();

   void setJoinStyle(byte var1);

   float getMiterLimit();

   void setMiterLimit(float var1);

   byte getBeginArrowheadStyle();

   void setBeginArrowheadStyle(byte var1);

   byte getEndArrowheadStyle();

   void setEndArrowheadStyle(byte var1);

   byte getBeginArrowheadWidth();

   void setBeginArrowheadWidth(byte var1);

   byte getEndArrowheadWidth();

   void setEndArrowheadWidth(byte var1);

   byte getBeginArrowheadLength();

   void setBeginArrowheadLength(byte var1);

   byte getEndArrowheadLength();

   void setEndArrowheadLength(byte var1);

   boolean equals(ILineFormat var1);

   ILineFormatEffectiveData getEffective();
}
