package com.aspose.slides;

public class SlideThemeManager extends BaseOverrideThemeManager {
   @Override
   IThemeable n5() {
      return ((Slide)this.l6()).getLayoutSlide();
   }

   SlideThemeManager(Slide parentImmediate) {
      super(parentImmediate);
   }
}
