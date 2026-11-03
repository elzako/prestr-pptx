package com.aspose.slides;

import java.awt.Color;

public interface IPatternFormat {
   byte getPatternStyle();

   void setPatternStyle(byte var1);

   IColorFormat getForeColor();

   IColorFormat getBackColor();

   IImage getTile(Color var1, Color var2);

   IImage getTile(Color var1);
}
