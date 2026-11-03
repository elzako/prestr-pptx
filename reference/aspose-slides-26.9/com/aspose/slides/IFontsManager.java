package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;

/** Presentation-scoped font substitution, fallback, embedding and inspection. */
public interface IFontsManager {
   IFontSubstRuleCollection getFontSubstRuleList();

   void setFontSubstRuleList(IFontSubstRuleCollection value);

   IFontFallBackRulesCollection getFontFallBackRulesCollection();

   void setFontFallBackRulesCollection(IFontFallBackRulesCollection value);

   IFontData[] getFonts();

   IGenericEnumerable<FontSubstitutionInfo> getSubstitutions();

   IGenericEnumerable<FontSubstitutionInfo> getSubstitutions(int[] slides);

   IFontData[] getEmbeddedFonts();

   void removeEmbeddedFont(IFontData font);

   void addEmbeddedFont(IFontData font, int embedFontCharacters);

   void addEmbeddedFont(byte[] fontData, int embedFontCharacters);

   void replaceFont(IFontData sourceFont, IFontData destinationFont);

   void replaceFont(IFontSubstRule rule);

   void replaceFont(IFontSubstRuleCollection rules);

   byte[] getFontBytes(IFontData font, int style);

   int getFontEmbeddingLevel(byte[] fontData, String fontName);
}
