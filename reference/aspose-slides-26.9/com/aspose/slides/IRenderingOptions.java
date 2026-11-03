package com.aspose.slides;

public interface IRenderingOptions extends ISaveOptions {
   ISlidesLayoutOptions getSlidesLayoutOptions();

   void setSlidesLayoutOptions(ISlidesLayoutOptions var1);

   IInkOptions getInkOptions();

   boolean getDisableFontLigatures();

   void setDisableFontLigatures(boolean var1);
}
