package com.aspose.slides;

public interface IHtmlOptions extends ISaveOptions {
   IHtmlFormatter getHtmlFormatter();

   void setHtmlFormatter(IHtmlFormatter var1);

   ISlideImageFormat getSlideImageFormat();

   void setSlideImageFormat(ISlideImageFormat var1);

   boolean getShowHiddenSlides();

   void setShowHiddenSlides(boolean var1);

   byte getJpegQuality();

   void setJpegQuality(byte var1);

   int getPicturesCompression();

   void setPicturesCompression(int var1);

   boolean getDeletePicturesCroppedAreas();

   void setDeletePicturesCroppedAreas(boolean var1);

   boolean getSvgResponsiveLayout();

   void setSvgResponsiveLayout(boolean var1);

   boolean getDisableFontLigatures();

   void setDisableFontLigatures(boolean var1);

   ISlidesLayoutOptions getSlidesLayoutOptions();

   void setSlidesLayoutOptions(ISlidesLayoutOptions var1);

   IInkOptions getInkOptions();
}
