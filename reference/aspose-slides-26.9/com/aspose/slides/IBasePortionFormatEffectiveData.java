package com.aspose.slides;

import java.awt.Color;

public interface IBasePortionFormatEffectiveData {
   ILineFormatEffectiveData getLineFormat();

   IFillFormatEffectiveData getFillFormat();

   IEffectFormatEffectiveData getEffectFormat();

   Color getHighlightColor();

   ILineFormatEffectiveData getUnderlineLineFormat();

   IFillFormatEffectiveData getUnderlineFillFormat();

   boolean getFontBold();

   boolean getFontItalic();

   boolean getKumimoji();

   boolean getNormaliseHeight();

   boolean getProofDisabled();

   byte getFontUnderline();

   byte getTextCapType();

   byte getStrikethroughType();

   boolean getSmartTagClean();

   boolean isHardUnderlineLine();

   boolean isHardUnderlineFill();

   float getFontHeight();

   IFontData getLatinFont();

   IFontData getEastAsianFont();

   IFontData getComplexScriptFont();

   IFontData getSymbolFont();

   float getEscapement();

   float getKerningMinimalSize();

   String getLanguageId();

   String getAlternativeLanguageId();

   float getSpacing();
}
