package com.aspose.slides;

import java.awt.Dimension;

public interface IGifOptions extends ISaveOptions {
   Dimension getFrameSize();

   void setFrameSize(Dimension var1);

   boolean getExportHiddenSlides();

   void setExportHiddenSlides(boolean var1);

   int getTransitionFps();

   void setTransitionFps(int var1);

   int getDefaultDelay();

   void setDefaultDelay(int var1);
}
