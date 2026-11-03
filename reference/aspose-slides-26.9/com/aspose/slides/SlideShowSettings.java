package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

public class SlideShowSettings {
   private final IColorFormat l6;
   private SlideShowType k5 = null;
   final com.aspose.slides.internal.k4y.k6n n5;
   private SlidesRange u3;
   private boolean a6;

   SlideShowSettings(Presentation presentation, com.aspose.slides.internal.k4y.k6n data) {
      if (data == null) {
         this.n5 = new com.aspose.slides.internal.k4y.k6n();
         this.n5.l6(true);
      } else {
         this.n5 = data;
      }

      this.l6 = new ColorFormat(presentation);
   }

   public final SlideShowType getSlideShowType() {
      return this.k5;
   }

   public final void setSlideShowType(SlideShowType value) {
      if (value == null) {
         throw new ArgumentNullException("value");
      }

      this.k5 = value;
   }

   public final boolean getLoop() {
      return this.n5.k5();
   }

   public final void setLoop(boolean value) {
      this.n5.n5(value);
   }

   public final boolean getShowNarration() {
      return this.n5.u3();
   }

   public final void setShowNarration(boolean value) {
      this.n5.l6(value);
   }

   public final boolean getShowAnimation() {
      return this.n5.a6();
   }

   public final void setShowAnimation(boolean value) {
      this.n5.k5(value);
   }

   public final IColorFormat getPenColor() {
      return this.l6;
   }

   public final SlidesRange getSlides() {
      return this.u3;
   }

   public final void setSlides(SlidesRange value) {
      this.u3 = value;
   }

   public final boolean getUseTimings() {
      return this.n5.u9();
   }

   public final void setUseTimings(boolean value) {
      this.n5.u3(value);
   }

   public final boolean getShowMediaControls() {
      return this.a6;
   }

   public final void setShowMediaControls(boolean value) {
      this.a6 = value;
   }
}
