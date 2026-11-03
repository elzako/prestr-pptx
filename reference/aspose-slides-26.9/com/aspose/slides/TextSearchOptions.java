package com.aspose.slides;

public class TextSearchOptions implements ITextSearchOptions {
   private boolean n5;
   private boolean l6;
   private boolean k5;

   public TextSearchOptions() {
      this.setCaseSensitive(false);
      this.setWholeWordsOnly(false);
      this.setIncludeNotes(false);
   }

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

   @Override
   public final boolean getIncludeNotes() {
      return this.k5;
   }

   @Override
   public final void setIncludeNotes(boolean value) {
      this.k5 = value;
   }
}
