package com.aspose.slides;

public interface IPPImage {
   byte[] getBinaryData();

   IImage getImage();

   ISvgImage getSvgImage();

   void setSvgImage(ISvgImage var1);

   void replaceImage(byte[] var1);

   void replaceImage(IImage var1);

   void replaceImage(IPPImage var1);

   String getContentType();

   int getWidth();

   int getHeight();

   int getX();

   int getY();
}
