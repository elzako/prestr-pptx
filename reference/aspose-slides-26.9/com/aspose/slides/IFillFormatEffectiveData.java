package com.aspose.slides;

import java.awt.Color;

public interface IFillFormatEffectiveData extends IFillParamSource {
   byte getFillType();

   Color getSolidFillColor();

   int getSolidFillSchemeColor();

   IGradientFormatEffectiveData getGradientFormat();

   IPatternFormatEffectiveData getPatternFormat();

   IPictureFillFormatEffectiveData getPictureFillFormat();

   boolean getRotateWithShape();
}
