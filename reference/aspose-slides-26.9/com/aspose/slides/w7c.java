package com.aspose.slides;

class w7c {
   private final d2k u3 = new d2k();
   private IFontSchemeEffectiveData a6;
   public final BaseSlide n5;
   public final LoadOptions l6;
   public final TextFrame k5;

   public w7c(BaseSlide var1, LoadOptions var2, TextFrame var3, d2k var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      var4.n5(this.u3);
      IThemeEffectiveData var5 = var1.createThemeEffective();
      if (var5 != null) {
         this.a6 = var5.getFontScheme();
      }
   }

   public final TextParam n5(y6e var1, float var2) {
      byte var3 = 0;
      byte[] var4 = new byte[]{0};
      TextParam var5 = this.n5(var1, var4, var2);
      var3 = var4[0];
      return var5;
   }

   public final TextParam n5(y6e var1, byte[] var2, float var3) {
      var2[0] = var1.k5();
      return this.n5(var1.n5(), var2[0], var1.u3(), var3);
   }

   public final TextParam n5(m4i var1, byte var2, char var3, float var4) {
      if (com.aspose.slides.ms.System.t9.x8(var3)) {
         String var5 = var1.n5.getLanguageId();
         int var6 = 0;
         Fonts$n5 var7 = null;
         Fonts$n5[] var8 = new Fonts$n5[]{var7};
         boolean var9 = !com.aspose.slides.ms.System.d1.n5(var5) && Fonts.l6.tryGetValue(var5, var8);
         var7 = var8[0];
         if (var9) {
            var6 = var7.k5;
         }

         switch (var6) {
            case 1:
               var2 = 1;
               break;
            case 2:
               var2 = 2;
         }
      }

      switch (var2) {
         case 0:
         default:
            return this.n5(null, var1, null, var4);
         case 1:
            return this.n5((s5u)null, var1, var4);
         case 2:
            return this.l6(null, var1, var4);
         case 3:
            return this.k5(null, var1, var4);
         case 4:
            TextParam var10 = null;
            TextParam[] var12 = new TextParam[]{var10};
            boolean var14 = this.n5(var1, var3, var4, var12);
            var10 = var12[0];
            return var14 ? var10 : this.u3(null, var1, var4);
      }
   }

   public final TextParam n5(s5u var1, byte var2, m4i var3, String var4, float var5) {
      switch (var2) {
         case 0:
         default:
            return this.n5(var1, var3, var4, var5);
         case 1:
            return this.n5((s5u)null, var3, var5);
         case 2:
            return this.l6(var1, var3, var5);
         case 3:
            return this.k5(var1, var3, var5);
         case 4:
            if (!com.aspose.slides.ms.System.d1.n5(var4)) {
               int var6 = com.aspose.slides.internal.n2d.u9.n5(var4, 0);
               TextParam var7 = null;
               TextParam[] var8 = new TextParam[]{var7};
               boolean var9 = this.n5(var3, var6, var5, var8);
               var7 = var8[0];
               if (var9) {
                  return var7;
               }
            }

            return this.u3(var1, var3, var5);
      }
   }

   public final TextParam n5(s5u var1, m4i var2, String var3, float var4) {
      FontData var5 = j5u.n5(var2, var3 == null ? var2.l6 : var3);
      return this.n5(var1, var2.k5, var2.n5, var5, var4);
   }

   public final TextParam n5(s5u var1, Portion var2, c9g var3, FontData var4, float var5) {
      TextParam$FontArgs var6 = new TextParam$FontArgs();
      var6.Name = var4.getFontName();
      var6.Height = j5u.u3(var3.h0(), var5);
      var6.set(var3, this.l6.getDefaultRegularFont());
      return new TextParam(
         var2,
         var3,
         var6.Clone(),
         var4.n5(),
         var4.l6(),
         var4.k5(),
         this.l6.getDefaultRegularFont(),
         this.u3.u3(),
         this.n5,
         var1,
         this.k5.getTextFrameFormat().getEffective().getTextVerticalType()
      );
   }

   public final TextParam n5(s5u var1, m4i var2, float var3) {
      IFontData var4 = var2.k5.getPortionFormat().getEastAsianFont();
      IFontData var5 = var2.k5.getPortionFormat().getLatinFont();
      IFontData var6 = var2.n5.getLatinFont();
      byte var7 = ((FontData)var6).n5();
      FontData var8;
      if (var4 != null
         || var7 != -128
            && (
               var7 != 1
                  || var5 == null
                  || !com.aspose.slides.ms.System.d1.a6("+mn-ea", var5.getFontName()) && !com.aspose.slides.ms.System.d1.a6("+mj-ea", var5.getFontName())
            )) {
         var8 = (FontData)var2.n5.getEastAsianFont();
      } else {
         var8 = (FontData)var6;
      }

      TextParam$FontArgs var9 = new TextParam$FontArgs();
      var9.Name = var8.getFontName();
      var9.Height = j5u.u3(var2.n5.h0(), var3);
      var9.set(var2.n5, this.l6.getDefaultAsianFont());
      return new TextParam(
         var2.k5,
         var2.n5,
         var9.Clone(),
         var8.n5(),
         var8.l6(),
         var8.k5(),
         this.l6.getDefaultAsianFont(),
         this.u3.u3(),
         this.n5,
         var1,
         this.k5.getTextFrameFormat().getEffective().getTextVerticalType()
      );
   }

   public final TextParam l6(s5u var1, m4i var2, float var3) {
      FontData var4 = (FontData)var2.n5.getComplexScriptFont();
      TextParam$FontArgs var5 = new TextParam$FontArgs();
      var5.Name = var4.getFontName();
      var5.Height = j5u.u3(var2.n5.h0(), var3);
      var5.set(var2.n5, this.l6.getDefaultAsianFont());
      return new TextParam(
         var2.k5,
         var2.n5,
         var5.Clone(),
         var4.n5(),
         var4.l6(),
         var4.k5(),
         this.l6.getDefaultAsianFont(),
         this.u3.u3(),
         this.n5,
         var1,
         this.k5.getTextFrameFormat().getEffective().getTextVerticalType()
      );
   }

   public final TextParam k5(s5u var1, m4i var2, float var3) {
      c9g var4 = var2.n5;
      Portion var5 = var2.k5;
      IFontData var6 = var5.getPortionFormat().getSymbolFont();
      FontData var7;
      if (var6 == null) {
         var7 = (FontData)var4.getLatinFont();
      } else {
         var7 = (FontData)var4.getSymbolFont();
      }

      return this.l6(var1, var5, var2.n5, var7, var3);
   }

   public final TextParam l6(s5u var1, Portion var2, c9g var3, FontData var4, float var5) {
      String var6;
      byte var7;
      byte var8;
      byte[] var9;
      if (var4 != null && !com.aspose.slides.ms.System.d1.a6(var4.getFontName(), FontData.a6().getFontName())) {
         var6 = var4.getFontName();
         var7 = var4.n5();
         var8 = var4.l6();
         var9 = var4.k5();
      } else {
         var6 = "Wingdings";
         var7 = 2;
         var8 = 0;
         var9 = null;
      }

      TextParam$FontArgs var10 = new TextParam$FontArgs();
      var10.Name = var6;
      var10.Height = j5u.u3(var3.h0(), var5);
      var10.set(var3, this.l6.getDefaultSymbolFont());
      return new TextParam(
         var2,
         var3,
         var10.Clone(),
         var7,
         var8,
         var9,
         this.l6.getDefaultSymbolFont(),
         this.u3.u3(),
         this.n5,
         var1,
         this.k5.getTextFrameFormat().getEffective().getTextVerticalType()
      );
   }

   public final TextParam u3(s5u var1, m4i var2, float var3) {
      byte var4 = 2;
      byte var5 = 0;
      Object var6 = null;
      TextParam$FontArgs var7 = new TextParam$FontArgs();
      var7.Name = "Segoe UI Emoji";
      var7.Height = j5u.u3(var2.n5.h0(), var3);
      var7.set(var2.n5, this.l6.getDefaultSymbolFont());
      return new TextParam(
         var2.k5,
         var2.n5,
         var7.Clone(),
         var4,
         var5,
         (byte[])var6,
         this.l6.getDefaultSymbolFont(),
         this.u3.u3(),
         this.n5,
         var1,
         this.k5.getTextFrameFormat().getEffective().getTextVerticalType()
      );
   }

   public final TextParam n5(e2n var1, m4i var2, float var3) {
      FontData var4 = null;
      FontData[] var5 = new FontData[]{var4};
      TextParam$FontArgs var6 = this.n5(var1.n5, var2, var3, var5).Clone();
      var4 = var5[0];
      return new TextParam(
         var2.k5,
         var2.n5,
         var6.Clone(),
         var4.n5(),
         var4.l6(),
         var4.k5(),
         this.l6.getDefaultRegularFont(),
         this.u3.u3(),
         this.n5,
         null,
         this.k5.getTextFrameFormat().getEffective().getTextVerticalType()
      );
   }

   public final TextParam$FontArgs n5(t3x var1, m4i var2, float var3, FontData[] var4) {
      var4[0] = null;
      if (var1.k5.isBulletHardFont() && var1.getBullet().getType() != 2) {
         var4[0] = (FontData)var1.getBullet().getFont();
      }

      TextParam$FontArgs var5 = new TextParam$FontArgs();
      var5.Height = j5u.u3(var2.n5.h0(), var3);
      if (com.aspose.slides.internal.v6g.k5.l6(var2.k5, MathPortion.class)) {
         MathParagraph var6 = (MathParagraph)((MathPortion)var2.k5).getMathParagraph();
         MathBlock var7 = com.aspose.slides.internal.v6g.k5.n5(var6.get_Item(0), MathBlock.class);
         MathematicalText var8 = this.n5(var7);
         if (var8 != null) {
            var5.Height = var8.getFormat().getFontHeight();
         }
      }

      if (var4[0] == null) {
         var4[0] = j5u.n5(var2, var2.l6);
         var5.Name = var4[0].getFontName();
      } else {
         var5.Name = j5u.n5(var4[0], this.a6);
      }

      var5.set(var2.n5, this.l6.getDefaultRegularFont());
      if (!com.aspose.slides.ms.System.n1.k5(var1.getBullet().getHeight())) {
         if (var1.getBullet().getHeight() < 0.0F) {
            var5.Height = -var1.getBullet().getHeight();
         } else {
            var5.Height = var5.Height * var1.getBullet().getHeight() / 100.0F + 0.5F;
         }
      }

      if (var1.getBullet().getType() == 1) {
         var5.Italic = false;
         var5.Bold = false;
      }

      var5.Underline = false;
      return var5;
   }

   private MathematicalText n5(IMathElement var1) {
      MathematicalText var2 = com.aspose.slides.internal.v6g.k5.n5(var1, MathematicalText.class);
      if (var2 != null) {
         return var2;
      }

      for (IMathElement var6 : var1.getChildren()) {
         MathematicalText var7 = this.n5(var6);
         if (var7 != null) {
            return var7;
         }
      }

      return null;
   }

   private boolean n5(m4i var1, int var2, float var3, TextParam[] var4) {
      byte var5 = com.aspose.slides.internal.n2d.u9.u3(var2);
      if (var5 != 4) {
         TextParam var6 = this.n5(null, var5, var1, null, var3);
         if (var6.d2().n5(var2)) {
            var4[0] = var6;
            return true;
         }
      }

      var4[0] = null;
      return false;
   }
}
