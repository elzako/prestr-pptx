package com.aspose.slides;

public interface IGradientFormat extends IFillParamSource {
   int getTileFlip();

   void setTileFlip(int var1);

   int getGradientDirection();

   void setGradientDirection(int var1);

   float getLinearGradientAngle();

   void setLinearGradientAngle(float var1);

   byte getLinearGradientScaled();

   void setLinearGradientScaled(byte var1);

   byte getGradientShape();

   void setGradientShape(byte var1);

   IGradientStopCollection getGradientStops();
}
