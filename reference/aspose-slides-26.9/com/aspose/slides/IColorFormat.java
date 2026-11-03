package com.aspose.slides;

import java.awt.Color;

public interface IColorFormat extends IFillParamSource {
   int getColorType();

   void setColorType(int var1);

   Color getColor();

   void setColor(Color var1);

   int getPresetColor();

   void setPresetColor(int var1);

   int getSystemColor();

   void setSystemColor(int var1);

   int getSchemeColor();

   void setSchemeColor(int var1);

   byte getR();

   void setR(byte var1);

   byte getG();

   void setG(byte var1);

   byte getB();

   void setB(byte var1);

   float getFloatR();

   void setFloatR(float var1);

   float getFloatG();

   void setFloatG(float var1);

   float getFloatB();

   void setFloatB(float var1);

   float getHue();

   void setHue(float var1);

   float getSaturation();

   void setSaturation(float var1);

   float getLuminance();

   void setLuminance(float var1);

   IColorOperationCollection getColorTransform();

   String toString(int var1);

   void copyFrom(IColorFormat var1);
}
