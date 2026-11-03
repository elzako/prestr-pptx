package com.aspose.slides;

public interface ICamera {
   int getCameraType();

   void setCameraType(int var1);

   float getFieldOfViewAngle();

   void setFieldOfViewAngle(float var1);

   float getZoom();

   void setZoom(float var1);

   void setRotation(float var1, float var2, float var3);

   float[] getRotation();
}
