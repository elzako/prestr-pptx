package com.aspose.slides;

public interface ILineFormatEffectiveData extends ILineParamSource {
   ILineFillFormatEffectiveData getFillFormat();

   ISketchFormatEffectiveData getSketchFormat();

   double getWidth();

   byte getDashStyle();

   float[] getCustomDashPattern();

   byte getCapStyle();

   byte getStyle();

   byte getAlignment();

   byte getJoinStyle();

   float getMiterLimit();

   byte getBeginArrowheadStyle();

   byte getEndArrowheadStyle();

   byte getBeginArrowheadWidth();

   byte getEndArrowheadWidth();

   byte getBeginArrowheadLength();

   byte getEndArrowheadLength();

   boolean equals(ILineFormatEffectiveData var1);
}
