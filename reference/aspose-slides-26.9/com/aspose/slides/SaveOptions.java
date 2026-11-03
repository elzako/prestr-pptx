package com.aspose.slides;

public abstract class SaveOptions implements ISaveOptions {
   private boolean n5;
   private int l6 = 0;
   private IWarningCallback k5;
   private IProgressCallback u3;
   private String a6;

   @Override
   public final IWarningCallback getWarningCallback() {
      return this.k5;
   }

   @Override
   public final void setWarningCallback(IWarningCallback value) {
      this.k5 = value;
   }

   @Override
   public final IProgressCallback getProgressCallback() {
      return this.u3;
   }

   @Override
   public final void setProgressCallback(IProgressCallback value) {
      this.u3 = value;
   }

   @Override
   public final String getDefaultRegularFont() {
      return this.a6;
   }

   @Override
   public final void setDefaultRegularFont(String value) {
      this.a6 = value;
   }

   @Override
   public final int getGradientStyle() {
      return this.l6;
   }

   @Override
   public final void setGradientStyle(int value) {
      this.l6 = value;
   }

   @Override
   public final boolean getSkipJavaScriptLinks() {
      return this.n5;
   }

   @Override
   public final void setSkipJavaScriptLinks(boolean value) {
      this.n5 = value;
   }
}
