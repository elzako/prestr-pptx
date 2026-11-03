package com.aspose.slides;

public interface IPictureFrame extends IGeometryShape {
   IPictureFrameLock getPictureFrameLock();

   IPictureFillFormat getPictureFormat();

   float getRelativeScaleHeight();

   void setRelativeScaleHeight(float var1);

   float getRelativeScaleWidth();

   void setRelativeScaleWidth(float var1);
}
