package com.aspose.slides;

public interface IMasterSlide extends IBaseSlide, IMasterThemeable {
   IMasterSlideHeaderFooterManager getHeaderFooterManager();

   ITextStyle getTitleStyle();

   IMasterSlide applyExternalThemeToDependingSlides(String var1);

   ITextStyle getBodyStyle();

   ITextStyle getOtherStyle();

   IMasterLayoutSlideCollection getLayoutSlides();

   boolean getPreserve();

   void setPreserve(boolean var1);

   boolean hasDependingSlides();

   ISlide[] getDependingSlides();

   IDrawingGuidesCollection getDrawingGuides();
}
