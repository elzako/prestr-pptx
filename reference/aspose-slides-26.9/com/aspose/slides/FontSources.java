package com.aspose.slides;

public class FontSources implements IFontSources {
   private String[] n5;
   private byte[][] l6;

   @Override
   public final String[] getFontFolders() {
      return this.n5;
   }

   @Override
   public final void setFontFolders(String[] value) {
      this.n5 = value;
   }

   @Override
   public final byte[][] getMemoryFonts() {
      return this.l6;
   }

   @Override
   public final void setMemoryFonts(byte[][] value) {
      this.l6 = value;
   }
}
