package com.aspose.slides;

public class PresentationText implements IPresentationText {
   private final ISlideText[] n5;

   PresentationText(ISlideText[] slidesText) {
      this.n5 = slidesText;
   }

   @Override
   public final ISlideText[] getSlidesText() {
      return this.n5;
   }
}
