package com.aspose.slides;

public interface IBasePortionFormat {
   ILineFormat getLineFormat();

   IFillFormat getFillFormat();

   IEffectFormat getEffectFormat();

   IColorFormat getHighlightColor();

   ILineFormat getUnderlineLineFormat();

   IFillFormat getUnderlineFillFormat();

   byte getFontBold();

   void setFontBold(byte var1);

   byte getFontItalic();

   void setFontItalic(byte var1);

   byte getKumimoji();

   void setKumimoji(byte var1);

   byte getNormaliseHeight();

   void setNormaliseHeight(byte var1);

   byte getProofDisabled();

   void setProofDisabled(byte var1);

   byte getFontUnderline();

   void setFontUnderline(byte var1);

   byte getTextCapType();

   void setTextCapType(byte var1);

   byte getStrikethroughType();

   void setStrikethroughType(byte var1);

   byte isHardUnderlineLine();

   void setHardUnderlineLine(byte var1);

   byte isHardUnderlineFill();

   void setHardUnderlineFill(byte var1);

   float getFontHeight();

   void setFontHeight(float var1);

   IFontData getLatinFont();

   void setLatinFont(IFontData var1);

   IFontData getEastAsianFont();

   void setEastAsianFont(IFontData var1);

   IFontData getComplexScriptFont();

   void setComplexScriptFont(IFontData var1);

   IFontData getSymbolFont();

   void setSymbolFont(IFontData var1);

   float getEscapement();

   void setEscapement(float var1);

   float getKerningMinimalSize();

   void setKerningMinimalSize(float var1);

   String getLanguageId();

   void setLanguageId(String var1);

   String getAlternativeLanguageId();

   void setAlternativeLanguageId(String var1);

   float getSpacing();

   void setSpacing(float var1);

   boolean getSpellCheck();

   void setSpellCheck(boolean var1);
}
