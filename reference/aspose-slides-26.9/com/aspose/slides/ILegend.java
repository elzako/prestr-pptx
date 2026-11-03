package com.aspose.slides;

public interface ILegend extends IActualLayout, IFormattedTextContainer, ILayoutable {
   boolean getOverlay();

   void setOverlay(boolean var1);

   int getPosition();

   void setPosition(int var1);

   IFormat getFormat();

   ILegendEntryCollection getEntries();
}
