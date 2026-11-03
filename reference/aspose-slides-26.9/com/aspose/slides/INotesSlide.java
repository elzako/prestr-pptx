package com.aspose.slides;

public interface INotesSlide extends IBaseSlide, IOverrideThemeable {
   INotesSlideHeaderFooterManager getHeaderFooterManager();

   ITextFrame getNotesTextFrame();

   ISlide getParentSlide();
}
