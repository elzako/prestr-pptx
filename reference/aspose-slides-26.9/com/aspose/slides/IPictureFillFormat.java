package com.aspose.slides;

public interface IPictureFillFormat extends IFillParamSource {
   int getDpi();

   void setDpi(int var1);

   int getPictureFillMode();

   void setPictureFillMode(int var1);

   ISlidesPicture getPicture();

   float getCropLeft();

   void setCropLeft(float var1);

   float getCropTop();

   void setCropTop(float var1);

   float getCropRight();

   void setCropRight(float var1);

   float getCropBottom();

   void setCropBottom(float var1);

   float getStretchOffsetLeft();

   void setStretchOffsetLeft(float var1);

   float getStretchOffsetTop();

   void setStretchOffsetTop(float var1);

   float getStretchOffsetRight();

   void setStretchOffsetRight(float var1);

   float getStretchOffsetBottom();

   void setStretchOffsetBottom(float var1);

   IPPImage deletePictureCroppedAreas();

   boolean compressImage(boolean var1, int var2);

   boolean compressImage(boolean var1, float var2);

   float getTileOffsetX();

   void setTileOffsetX(float var1);

   float getTileOffsetY();

   void setTileOffsetY(float var1);

   float getTileScaleX();

   void setTileScaleX(float var1);

   float getTileScaleY();

   void setTileScaleY(float var1);

   byte getTileAlignment();

   void setTileAlignment(byte var1);

   int getTileFlip();

   void setTileFlip(int var1);
}
