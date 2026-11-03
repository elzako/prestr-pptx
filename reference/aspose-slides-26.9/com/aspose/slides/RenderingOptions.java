package com.aspose.slides;

public class RenderingOptions extends SaveOptions implements IRenderingOptions {
   private boolean n5;
   private ISlidesLayoutOptions l6;
   private InkOptions k5 = new InkOptions();

   @Override
   public final ISlidesLayoutOptions getSlidesLayoutOptions() {
      return this.l6;
   }

   @Override
   public final void setSlidesLayoutOptions(ISlidesLayoutOptions value) {
      this.l6 = value;
   }

   @Override
   public final IInkOptions getInkOptions() {
      return this.k5;
   }

   @Override
   public final boolean getDisableFontLigatures() {
      return this.n5;
   }

   @Override
   public final void setDisableFontLigatures(boolean value) {
      this.n5 = value;
   }
}
