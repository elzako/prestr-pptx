package com.aspose.slides;

public interface ISwfOptions extends ISaveOptions {
   boolean getCompressed();

   void setCompressed(boolean var1);

   boolean getViewerIncluded();

   void setViewerIncluded(boolean var1);

   boolean getShowPageBorder();

   void setShowPageBorder(boolean var1);

   boolean getShowHiddenSlides();

   void setShowHiddenSlides(boolean var1);

   boolean getShowFullScreen();

   void setShowFullScreen(boolean var1);

   boolean getShowPageStepper();

   void setShowPageStepper(boolean var1);

   boolean getShowSearch();

   void setShowSearch(boolean var1);

   boolean getShowTopPane();

   void setShowTopPane(boolean var1);

   boolean getShowBottomPane();

   void setShowBottomPane(boolean var1);

   boolean getShowLeftPane();

   void setShowLeftPane(boolean var1);

   boolean getStartOpenLeftPane();

   void setStartOpenLeftPane(boolean var1);

   boolean getEnableContextMenu();

   void setEnableContextMenu(boolean var1);

   byte[] getLogoImageBytes();

   void setLogoImageBytes(byte[] var1);

   String getLogoLink();

   void setLogoLink(String var1);

   int getJpegQuality();

   void setJpegQuality(int var1);

   ISlidesLayoutOptions getSlidesLayoutOptions();

   void setSlidesLayoutOptions(ISlidesLayoutOptions var1);
}
