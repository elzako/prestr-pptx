package com.aspose.slides;

import java.awt.Color;

public interface ILineFillFormatEffectiveData extends IFillParamSource {
   byte getFillType();

   Color getSolidFillColor();

   IGradientFormatEffectiveData getGradientFormat();

   IPatternFormatEffectiveData getPatternFormat();

   boolean getRotateWithShape();
}
