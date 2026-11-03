package com.aspose.slides;

public class BrowsedByIndividual extends SlideShowType {
   private boolean n5;

   public BrowsedByIndividual() {
      this.setShowScrollbar(true);
   }

   BrowsedByIndividual(com.aspose.slides.internal.k4y.t1u data) {
      this.setShowScrollbar(data.n5());
   }

   public final boolean getShowScrollbar() {
      return this.n5;
   }

   public final void setShowScrollbar(boolean value) {
      this.n5 = value;
   }
}
