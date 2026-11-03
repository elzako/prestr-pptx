package com.aspose.slides;

import java.awt.Color;

public interface IPatternFormatEffectiveData {
   byte getPatternStyle();

   Color getForeColor();

   Color getBackColor();

   IImage getTileIImage(Color var1, Color var2);
}
