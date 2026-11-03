package com.aspose.slides;

public interface IAutoShape extends IGeometryShape {
   IAutoShapeLock getAutoShapeLock();

   ITextFrame getTextFrame();

   boolean getUseBackgroundFill();

   void setUseBackgroundFill(boolean var1);

   ITextFrame addTextFrame(String var1);

   boolean isTextBox();
}
