package com.aspose.slides;

final class c5z implements IFontsEffectiveData, i7b {
   private Fonts l6;
   private c5z k5;
   a6k n5;

   c5z(Fonts var1) {
      this.l6 = var1;
      this.k5 = null;
      this.n5 = new a6k();
      if (var1 != null) {
         this.n5.n5(var1.n5());
      }
   }

   @Override
   public final IFontData getLatinFont() {
      if (this.l6 != null) {
         IFontData var1 = this.l6.getLatinFont();
         if (var1 != null) {
            return var1;
         }
      }

      return this.k5 != null ? this.k5.getLatinFont() : null;
   }

   @Override
   public final IFontData getEastAsianFont() {
      if (this.l6 != null) {
         IFontData var1 = this.l6.getEastAsianFont();
         if (var1 != null) {
            return var1;
         }
      }

      return this.k5 != null ? this.k5.getEastAsianFont() : null;
   }

   @Override
   public final IFontData getComplexScriptFont() {
      if (this.l6 != null) {
         IFontData var1 = this.l6.getComplexScriptFont();
         if (var1 != null) {
            return var1;
         }
      }

      return this.k5 != null ? this.k5.getComplexScriptFont() : null;
   }

   final String n5(String var1) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         return null;
      }

      Fonts$n5 var2 = null;
      Fonts$n5[] var3 = new Fonts$n5[]{var2};
      boolean var4 = !Fonts.l6.tryGetValue(var1, var3);
      var2 = var3[0];
      if (var4) {
         return null;
      }

      String var5 = null;
      String[] var6 = new String[]{var5};
      boolean var7 = this.n5.n5().tryGetValue(var2.l6, var6);
      var5 = var6[0];
      return var7 ? var5 : null;
   }

   final void n5(c5z var1, Fonts var2) {
      this.l6 = var2;
      this.k5 = var1;
      if (var2 != null) {
         this.n5.n5(var2.n5());
      } else if (var1 != null) {
         this.n5.n5(var1.n5);
      }
   }
}
