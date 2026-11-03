package com.aspose.slides;

public interface IBaseSlide extends IThemeable {
   IShapeCollection getShapes();

   IControlCollection getControls();

   String getName();

   void setName(String var1);

   long getSlideId();

   ICustomData getCustomData();

   IAnimationTimeLine getTimeline();

   ISlideShowTransition getSlideShowTransition();

   IBackground getBackground();

   IHyperlinkQueries getHyperlinkQueries();

   boolean getShowMasterShapes();

   void setShowMasterShapes(boolean var1);

   IShape findShapeByAltText(String var1);

   void joinPortionsWithSameFormatting();

   boolean equals(IBaseSlide var1);
}
