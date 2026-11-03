package com.aspose.slides;

public interface ISlidesPicture extends ISlideComponent {
   IPPImage getImage();

   void setImage(IPPImage var1);

   String getLinkPathLong();

   void setLinkPathLong(String var1);

   IImageTransformOperationCollection getImageTransform();
}
