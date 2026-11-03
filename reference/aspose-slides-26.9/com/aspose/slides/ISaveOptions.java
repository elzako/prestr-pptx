package com.aspose.slides;

public interface ISaveOptions {
   IWarningCallback getWarningCallback();

   void setWarningCallback(IWarningCallback var1);

   IProgressCallback getProgressCallback();

   void setProgressCallback(IProgressCallback var1);

   String getDefaultRegularFont();

   void setDefaultRegularFont(String var1);

   int getGradientStyle();

   void setGradientStyle(int var1);

   boolean getSkipJavaScriptLinks();

   void setSkipJavaScriptLinks(boolean var1);
}
