package com.aspose.slides;

import java.awt.Dimension;

public interface ITiffOptions extends ISaveOptions {
   Dimension getImageSize();

   void setImageSize(Dimension var1);

   long getDpiX();

   void setDpiX(long var1);

   long getDpiY();

   void setDpiY(long var1);

   boolean getShowHiddenSlides();

   void setShowHiddenSlides(boolean var1);

   int getCompressionType();

   void setCompressionType(int var1);

   int getPixelFormat();

   void setPixelFormat(int var1);

   ISlidesLayoutOptions getSlidesLayoutOptions();

   void setSlidesLayoutOptions(ISlidesLayoutOptions var1);

   int getBwConversionMode();

   void setBwConversionMode(int var1);

   IInkOptions getInkOptions();
}
