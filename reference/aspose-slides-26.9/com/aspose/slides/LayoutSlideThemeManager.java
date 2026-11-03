package com.aspose.slides;

public class LayoutSlideThemeManager extends BaseOverrideThemeManager {
   @Override
   IThemeable n5() {
      return ((LayoutSlide)this.l6()).getMasterSlide();
   }

   LayoutSlideThemeManager(LayoutSlide parentImmediate) {
      super(parentImmediate);
   }
}
