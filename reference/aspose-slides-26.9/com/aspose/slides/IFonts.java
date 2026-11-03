package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;

public interface IFonts {
   IFontData getLatinFont();

   void setLatinFont(IFontData var1);

   IFontData getEastAsianFont();

   void setEastAsianFont(IFontData var1);

   IFontData getComplexScriptFont();

   void setComplexScriptFont(IFontData var1);

   Dictionary<String, String> getScriptFontMap();

   String getScriptFont(String var1);

   void setScriptFont(String var1, String var2);

   void removeScriptFont(String var1);
}
