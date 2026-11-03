package com.aspose.slides;

public class FontDataFactory implements IFontDataFactory {
   @Override
   public final IFontData createFontData(String fontName) {
      return new FontData(fontName);
   }
}
