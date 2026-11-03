package com.aspose.slides;

public interface IFillFormat extends IFillParamSource {
   byte getFillType();

   void setFillType(byte var1);

   IColorFormat getSolidFillColor();

   IGradientFormat getGradientFormat();

   IPatternFormat getPatternFormat();

   IPictureFillFormat getPictureFillFormat();

   byte getRotateWithShape();

   void setRotateWithShape(byte var1);

   IFillFormatEffectiveData getEffective();
}
