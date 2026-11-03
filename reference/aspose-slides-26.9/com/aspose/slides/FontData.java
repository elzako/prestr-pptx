package com.aspose.slides;

public final class FontData implements IFontData {
   private String n5 = null;
   private byte l6;
   private int k5;
   private byte u3 = 1;
   private byte[] a6 = null;

   public FontData(String fontName) {
      this.n5 = fontName;
   }

   FontData(String fontName, byte charSet) {
      this.n5 = fontName;
      this.u3 = charSet;
   }

   FontData(String fontName, byte charSet, byte pitchFamily) {
      this.n5 = fontName;
      this.u3 = charSet;
      this.l6 = pitchFamily;
   }

   FontData(String fontName, byte charSet, byte pitchFamily, int fontStyle, byte[] panose) {
      this.n5 = fontName;
      this.u3 = charSet;
      this.l6 = pitchFamily;
      this.k5 = fontStyle;
      this.a6 = panose;
   }

   FontData(FontData fontData) {
      this(fontData, fontData.n5);
   }

   FontData(FontData fontData, String fontName) {
      this.n5 = fontName;
      this.l6 = fontData.l6();
      this.k5 = fontData.k5;
      this.u3 = fontData.n5();
      this.a6 = fontData.a6;
   }

   FontData(FontData fontData, String fontName, byte charSet) {
      this.n5 = fontName;
      this.u3 = charSet;
      this.l6 = fontData.l6();
      this.k5 = fontData.k5;
      this.a6 = fontData.a6;
   }

   FontData(FontData fontData, int fontStyle) {
      this(fontData);
      this.k5 = fontStyle;
   }

   FontData(String fontName, com.aspose.slides.internal.k0r.z0 fatom) {
      this(fontName, fatom.k5(), (byte)(fatom.u9() & 0xFF | fatom.a6() & 0xFF));
   }

   @Override
   public final String getFontName() {
      return this.n5;
   }

   final byte n5() {
      return this.u3;
   }

   final byte l6() {
      return this.l6;
   }

   final byte[] k5() {
      return this.a6;
   }

   final int u3() {
      return this.k5;
   }

   @Override
   public final String getFontName(IThemeEffectiveData theme) {
      if (this.n5 != null && this.n5.length() == 6 && this.n5.charAt(0) == '+' && theme != null) {
         IFontsEffectiveData var2 = null;
         if (com.aspose.slides.ms.System.d1.n5(this.n5, 1, "mn-", 0, 3) == 0) {
            var2 = theme.getFontScheme().getMinor();
         } else {
            if (com.aspose.slides.ms.System.d1.n5(this.n5, 1, "mj-", 0, 3) != 0) {
               return this.n5;
            }

            var2 = theme.getFontScheme().getMajor();
         }

         if (this.n5 != null && this.n5.length() > 5 && com.aspose.slides.ms.System.d1.n5(this.n5, 4, "lt", 0, 2) == 0) {
            return var2.getLatinFont().getFontName();
         } else if (this.n5 != null && this.n5.length() > 5 && com.aspose.slides.ms.System.d1.n5(this.n5, 4, "ea", 0, 2) == 0) {
            return var2.getEastAsianFont().getFontName();
         } else {
            return this.n5 != null && this.n5.length() > 5 && com.aspose.slides.ms.System.d1.n5(this.n5, 4, "cs", 0, 2) == 0
               ? var2.getComplexScriptFont().getFontName()
               : this.n5;
         }
      } else {
         return this.n5;
      }
   }

   final FontData n5(IThemeEffectiveData var1) {
      if (this.n5 != null && this.n5.length() == 6 && this.n5.charAt(0) == '+' && var1 != null) {
         IFontsEffectiveData var2 = null;
         if (com.aspose.slides.ms.System.d1.n5(this.n5, 1, "mn-", 0, 3) == 0) {
            var2 = var1.getFontScheme().getMinor();
         } else {
            if (com.aspose.slides.ms.System.d1.n5(this.n5, 1, "mj-", 0, 3) != 0) {
               return this;
            }

            var2 = var1.getFontScheme().getMajor();
         }

         if (this.n5 != null && this.n5.length() > 5 && com.aspose.slides.ms.System.d1.n5(this.n5, 4, "lt", 0, 2) == 0) {
            return (FontData)var2.getLatinFont();
         } else if (this.n5 != null && this.n5.length() > 5 && com.aspose.slides.ms.System.d1.n5(this.n5, 4, "ea", 0, 2) == 0) {
            return (FontData)var2.getEastAsianFont();
         } else {
            return this.n5 != null && this.n5.length() > 5 && com.aspose.slides.ms.System.d1.n5(this.n5, 4, "cs", 0, 2) == 0
               ? (FontData)var2.getComplexScriptFont()
               : this;
         }
      } else {
         return this;
      }
   }

   final boolean n5(FontData var1, boolean var2) {
      if (var1 == null) {
         return false;
      }

      boolean var3 = com.aspose.slides.internal.n8e.v4.n5(this.getFontName(), var1.getFontName());
      return var2 || this.getFontName() == null && var1.getFontName() == null
         ? var3
            & (
               com.aspose.slides.internal.n8e.v4.n5((float)(this.l6() & 0xFF), (float)(var1.l6() & 0xFF))
                  && com.aspose.slides.internal.n8e.v4.n5((float)(this.n5() & 0xFF), (float)(var1.n5() & 0xFF))
            )
         : var3;
   }

   @Override
   public boolean equals(Object obj) {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(obj, FontData.class), false);
   }

   @Override
   public int hashCode() {
      return this.n5.hashCode();
   }

   @Override
   public String toString() {
      return this.getFontName();
   }

   static FontData a6() {
      return (FontData)s3p.l6().n5(65535).l6();
   }
}
