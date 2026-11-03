package com.aspose.slides;

import java.awt.Color;

public interface IPdfOptions extends ISaveOptions {
   int getTextCompression();

   void setTextCompression(int var1);

   boolean getBestImagesCompressionRatio();

   void setBestImagesCompressionRatio(boolean var1);

   boolean getEmbedTrueTypeFontsForASCII();

   void setEmbedTrueTypeFontsForASCII(boolean var1);

   boolean getShowHiddenSlides();

   void setShowHiddenSlides(boolean var1);

   String[] getAdditionalCommonFontFamilies();

   void setAdditionalCommonFontFamilies(String[] var1);

   boolean getEmbedFullFonts();

   void setEmbedFullFonts(boolean var1);

   boolean getRasterizeUnsupportedFontStyles();

   void setRasterizeUnsupportedFontStyles(boolean var1);

   byte getJpegQuality();

   void setJpegQuality(byte var1);

   int getCompliance();

   void setCompliance(int var1);

   String getPassword();

   void setPassword(String var1);

   int getAccessPermissions();

   void setAccessPermissions(int var1);

   boolean getSaveMetafilesAsPng();

   void setSaveMetafilesAsPng(boolean var1);

   float getSufficientResolution();

   void setSufficientResolution(float var1);

   boolean getDrawSlidesFrame();

   void setDrawSlidesFrame(boolean var1);

   ISlidesLayoutOptions getSlidesLayoutOptions();

   void setSlidesLayoutOptions(ISlidesLayoutOptions var1);

   Color getImageTransparentColor();

   void setImageTransparentColor(Color var1);

   boolean getApplyImageTransparent();

   void setApplyImageTransparent(boolean var1);

   IInkOptions getInkOptions();

   boolean getIncludeOleData();

   void setIncludeOleData(boolean var1);
}
