package com.aspose.slides;

@Deprecated
public class TextHighlightingOptions implements ITextHighlightingOptions {
   private boolean n5 = false;
   private boolean l6 = false;

   @Override
   public final boolean getCaseSensitive() {
      return this.n5;
   }

   @Override
   public final void setCaseSensitive(boolean value) {
      this.n5 = value;
   }

   @Override
   public final boolean getWholeWordsOnly() {
      return this.l6;
   }

   @Override
   public final void setWholeWordsOnly(boolean value) {
      this.l6 = value;
   }
}
