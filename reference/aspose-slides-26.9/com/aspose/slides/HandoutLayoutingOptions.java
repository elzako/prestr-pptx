package com.aspose.slides;

public class HandoutLayoutingOptions implements ISlidesLayoutOptions {
   private int n5;
   private boolean l6;
   private boolean k5;
   private boolean u3;

   public final int getHandout() {
      return this.n5;
   }

   public final void setHandout(int value) {
      this.n5 = value;
   }

   public final boolean getPrintSlideNumbers() {
      return this.l6;
   }

   public final void setPrintSlideNumbers(boolean value) {
      this.l6 = value;
   }

   public final boolean getPrintFrameSlide() {
      return this.k5;
   }

   public final void setPrintFrameSlide(boolean value) {
      this.k5 = value;
   }

   public final boolean getPrintComments() {
      return this.u3;
   }

   public final void setPrintComments(boolean value) {
      this.u3 = value;
   }

   public HandoutLayoutingOptions() {
      this.setHandout(5);
      this.setPrintFrameSlide(true);
      this.setPrintSlideNumbers(true);
   }
}
