package com.aspose.slides;

public class FontSubstRule implements IFontSubstRule {
   private final IFontData n5;
   private final IFontData l6;
   private final int k5;

   public FontSubstRule(IFontData sourceFont, IFontData destFont) {
      this.n5 = sourceFont;
      this.l6 = destFont;
      this.k5 = 1;
   }

   public FontSubstRule(IFontData sourceFont, IFontData destFont, int fontSubstRule) {
      this.n5 = sourceFont;
      this.l6 = destFont;
      this.k5 = fontSubstRule;
   }

   @Override
   public final IFontData getSourceFont() {
      return this.n5;
   }

   @Override
   public final IFontData getDestFont() {
      return this.l6;
   }

   @Override
   public final int getReplaceFontCondition() {
      return this.k5;
   }
}
