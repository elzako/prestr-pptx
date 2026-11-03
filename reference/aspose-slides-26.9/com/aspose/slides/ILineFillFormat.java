package com.aspose.slides;

public interface ILineFillFormat extends IFillParamSource {
   byte getFillType();

   void setFillType(byte var1);

   IColorFormat getSolidFillColor();

   IGradientFormat getGradientFormat();

   IPatternFormat getPatternFormat();

   byte getRotateWithShape();

   void setRotateWithShape(byte var1);
}
