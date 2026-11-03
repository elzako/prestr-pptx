package com.aspose.slides;

public interface IZoomObject extends IGraphicalObject {
   int getImageType();

   void setImageType(int var1);

   boolean getReturnToParent();

   void setReturnToParent(boolean var1);

   boolean getShowBackground();

   void setShowBackground(boolean var1);

   IPPImage getZoomImage();

   void setZoomImage(IPPImage var1);

   float getTransitionDuration();

   void setTransitionDuration(float var1);
}
