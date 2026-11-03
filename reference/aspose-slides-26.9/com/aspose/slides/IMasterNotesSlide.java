package com.aspose.slides;

public interface IMasterNotesSlide extends IBaseSlide, IMasterThemeable {
   IMasterNotesSlideHeaderFooterManager getHeaderFooterManager();

   ITextStyle getNotesStyle();

   IDrawingGuidesCollection getDrawingGuides();
}
