package com.aspose.slides;

public interface ILayoutSlide extends IBaseSlide, IOverrideThemeable {
   ILayoutSlideHeaderFooterManager getHeaderFooterManager();

   ILayoutPlaceholderManager getPlaceholderManager();

   IMasterSlide getMasterSlide();

   void setMasterSlide(IMasterSlide var1);

   byte getLayoutType();

   boolean hasDependingSlides();

   ISlide[] getDependingSlides();

   void remove();

   IDrawingGuidesCollection getDrawingGuides();
}
