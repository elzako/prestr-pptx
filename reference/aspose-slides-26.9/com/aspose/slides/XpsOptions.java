package com.aspose.slides;

public class XpsOptions extends SaveOptions implements IXpsOptions {
   private boolean n5 = true;
   private boolean l6;
   private boolean k5;

   @Override
   public final boolean getShowHiddenSlides() {
      return this.k5;
   }

   @Override
   public final void setShowHiddenSlides(boolean value) {
      this.k5 = value;
   }

   @Override
   public final boolean getSaveMetafilesAsPng() {
      return this.n5;
   }

   @Override
   public final void setSaveMetafilesAsPng(boolean value) {
      this.n5 = value;
   }

   @Override
   public final boolean getDrawSlidesFrame() {
      return this.l6;
   }

   @Override
   public final void setDrawSlidesFrame(boolean value) {
      this.l6 = value;
   }
}
