package com.aspose.slides;

public abstract class BaseHandoutNotesSlideHeaderFooterManager extends BaseSlideHeaderFooterManager implements IBaseHandoutNotesSlideHeaderFooterManag {
   @Override
   public final boolean isHeaderVisible() {
      return this.l6((byte)7);
   }

   @Override
   public final void setHeaderVisibility(boolean isVisible) {
      this.n5((byte)7, isVisible);
   }

   @Override
   public final void setHeaderText(String text) {
      this.n5((byte)7, text, false);
   }

   BaseHandoutNotesSlideHeaderFooterManager(BaseSlide baseSlide) {
      super(baseSlide);
   }
}
