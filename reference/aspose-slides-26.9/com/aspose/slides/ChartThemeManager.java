package com.aspose.slides;

public class ChartThemeManager extends BaseOverrideThemeManager {
   @Override
   IThemeable n5() {
      return ((Chart)this.l6()).getSlide();
   }

   ChartThemeManager(Chart parentImmediate) {
      super(parentImmediate);
   }
}
