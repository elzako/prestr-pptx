package com.aspose.slides;

public final class TextToHtmlConversionOptions implements ITextToHtmlConversionOptions {
   private boolean n5 = false;
   private int l6 = 0;
   private ILinkEmbedController k5 = null;
   private String u3 = "utf-8";

   @Override
   public final boolean getAddClipboardFragmentHeader() {
      return this.n5;
   }

   @Override
   public final void setAddClipboardFragmentHeader(boolean value) {
      this.n5 = value;
   }

   @Override
   public final int getTextInheritanceLimit() {
      return this.l6;
   }

   @Override
   public final void setTextInheritanceLimit(int value) {
      this.l6 = value;
   }

   @Override
   public final ILinkEmbedController getLinkEmbedController() {
      return this.k5;
   }

   @Override
   public final void setLinkEmbedController(ILinkEmbedController value) {
      this.k5 = value;
   }

   @Override
   public final String getEncodingName() {
      return this.u3;
   }

   @Override
   public final void setEncodingName(String value) {
      this.u3 = value;
   }
}
