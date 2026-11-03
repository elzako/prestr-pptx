package com.aspose.slides;

public class Html5Options extends SaveOptions implements IHtml5Options {
   private boolean n5;
   private String l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private ISlidesLayoutOptions u9;
   private final r3d h0 = new r3d(5, true);

   @Override
   public final boolean getAnimateTransitions() {
      return this.u3;
   }

   @Override
   public final void setAnimateTransitions(boolean value) {
      this.u3 = value;
   }

   @Override
   public final boolean getAnimateShapes() {
      return this.a6;
   }

   @Override
   public final void setAnimateShapes(boolean value) {
      this.a6 = value;
   }

   @Override
   public final boolean getEmbedImages() {
      return this.n5;
   }

   @Override
   public final void setEmbedImages(boolean value) {
      this.n5 = value;
   }

   @Override
   public final String getOutputPath() {
      return this.l6;
   }

   @Override
   public final void setOutputPath(String value) {
      this.l6 = value;
   }

   public Html5Options() {
      this.setEmbedImages(true);
   }

   @Override
   public final int getPicturesCompression() {
      return this.h0.n5();
   }

   @Override
   public final void setPicturesCompression(int value) {
      this.h0.n5(value);
   }

   @Override
   public final boolean getDisableFontLigatures() {
      return this.k5;
   }

   @Override
   public final void setDisableFontLigatures(boolean value) {
      this.k5 = value;
   }

   @Override
   public final ISlidesLayoutOptions getSlidesLayoutOptions() {
      return this.u9;
   }

   @Override
   public final void setSlidesLayoutOptions(ISlidesLayoutOptions value) {
      this.u9 = value;
   }
}
