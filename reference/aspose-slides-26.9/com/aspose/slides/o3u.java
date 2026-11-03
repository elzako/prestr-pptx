package com.aspose.slides;

class o3u {
   public static boolean n5(IPortionFormat var0, IPortionFormat var1) {
      if (com.aspose.slides.ms.System.j8.l6(var0, var1)) {
         return true;
      } else {
         return var0 != null && var1 != null
            ? com.aspose.slides.ms.System.d1.a6(var0.getBookmarkId(), var1.getBookmarkId())
               && var0.getSmartTagClean() == var1.getSmartTagClean()
               && var0.getFontBold() == var1.getFontBold()
               && var0.getFontItalic() == var1.getFontItalic()
               && var0.getKumimoji() == var1.getKumimoji()
               && var0.getNormaliseHeight() == var1.getNormaliseHeight()
               && var0.getProofDisabled() == var1.getProofDisabled()
               && var0.getFontUnderline() == var1.getFontUnderline()
               && var0.getTextCapType() == var1.getTextCapType()
               && var0.getStrikethroughType() == var1.getStrikethroughType()
               && var0.isHardUnderlineLine() == var1.isHardUnderlineLine()
               && var0.isHardUnderlineFill() == var1.isHardUnderlineFill()
               && com.aspose.slides.internal.n8e.v4.n5(var0.getFontHeight(), var1.getFontHeight())
               && com.aspose.slides.internal.n8e.v4.n5(var0.getEscapement(), var1.getEscapement())
               && com.aspose.slides.internal.n8e.v4.n5(var0.getKerningMinimalSize(), var1.getKerningMinimalSize())
               && com.aspose.slides.ms.System.d1.a6(var0.getLanguageId(), var1.getLanguageId())
               && com.aspose.slides.ms.System.d1.a6(var0.getAlternativeLanguageId(), var1.getAlternativeLanguageId())
               && com.aspose.slides.internal.n8e.v4.n5(var0.getSpacing(), var1.getSpacing())
               && com.aspose.slides.ms.System.j8.n5(var0.getLatinFont(), var1.getLatinFont())
               && com.aspose.slides.ms.System.j8.n5(var0.getEastAsianFont(), var1.getEastAsianFont())
               && com.aspose.slides.ms.System.j8.n5(var0.getComplexScriptFont(), var1.getComplexScriptFont())
               && com.aspose.slides.ms.System.j8.n5(var0.getSymbolFont(), var1.getSymbolFont())
               && y7o.n5.equals(var0.getLineFormat(), var1.getLineFormat())
               && f4q.n5.equals(var0.getFillFormat(), var1.getFillFormat())
               && u3t.n5.equals(var0.getEffectFormat(), var1.getEffectFormat())
               && s5r.n5.equals(var0.getHighlightColor(), var1.getHighlightColor())
               && y7o.n5.equals(var0.getUnderlineLineFormat(), var1.getUnderlineLineFormat())
               && f4q.n5.equals(var0.getUnderlineFillFormat(), var1.getUnderlineFillFormat())
               && a6c.n5.equals(var0, var1)
            : false;
      }
   }
}
