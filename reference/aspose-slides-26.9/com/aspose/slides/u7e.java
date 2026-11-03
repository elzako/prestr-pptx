package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class u7e {
   public static com.aspose.slides.internal.k4y.j9d n5(Portion var0, TextFrame var1, boolean var2, com.aspose.slides.internal.k4y.u1x var3, x0a var4) {
      if (var0 == null) {
         throw new ArgumentNullException("portion");
      }

      if (var3 == null) {
         throw new ArgumentNullException("pElementData");
      }

      com.aspose.slides.internal.k4y.y2i var5 = var4.n5("T", 1);
      n5(var0, var2, var3, var5);
      com.aspose.slides.internal.k4y.j9d var6 = (com.aspose.slides.internal.k4y.j9d)var5.n5("text-properties").l6();
      c9g var7 = var0.l6().r4();
      var6.t2(t2f.h0(var7.getFontHeight()));
      if (var7.getTextCapType() == 2) {
         var6.l6(3);
      }

      com.aspose.slides.internal.o9b.c8 var8 = n5(var0, var7, (BaseSlide)var1.getSlide()).o8();
      if (var7.getFillFormat().getFillType() != 0) {
         var6.n5(
            com.aspose.slides.internal.o9b.c8.n5(var8, com.aspose.slides.internal.o9b.c8.u3)
               ? t2f.n5(((f6a)var7.getFillFormat()).h0().o8())
               : t2f.n5(var8.o8())
         );
      } else if (var7.getLineFormat().getFillFormat().getFillType() == 1) {
         var6.n5(t2f.n5(((z1a)var7.getLineFormat().getFillFormat()).u3().o8()));
      }

      if (com.aspose.slides.internal.o9b.c8.l6(var7.u9(), com.aspose.slides.internal.o9b.c8.u3)) {
         var6.k7(t2f.n5(var7.u9().o8()));
      }

      if (var7.getEffectFormat().getOuterShadowEffect() != null) {
         var6.y4("1pt 1pt");
         if (com.aspose.slides.internal.o9b.c8.l6(((k0p)var7.getEffectFormat().getOuterShadowEffect()).l6(), com.aspose.slides.internal.o9b.c8.u3)) {
            var6.y4(
               com.aspose.slides.ms.System.d1.n5(new String[]{
                  var6.y4(), com.aspose.slides.ms.System.d1.n5(new String[]{" 0pc ", t2f.n5(((k0p)var7.getEffectFormat().getOuterShadowEffect()).l6().o8())})
               })
            );
         }
      }

      IFontData var9 = n5(var0, null, var7, var1);
      var6.u9(com.aspose.slides.ms.System.d1.n5(new String[]{"'", var9.getFontName(), "'"}));
      if (var7.getEastAsianFont() != null) {
         var6.h0(com.aspose.slides.ms.System.d1.n5(new String[]{"'", var7.getEastAsianFont().getFontName(var0.x8().getSlide().createThemeEffective()), "'"}));
      }

      if (var7.getComplexScriptFont() != null) {
         var6.c8(com.aspose.slides.ms.System.d1.n5(new String[]{"'", var7.getComplexScriptFont().getFontName(), "'"}));
      }

      if (var7.getFontBold()) {
         var6.t2(2);
      }

      if (var7.getFontItalic()) {
         var6.a6(2);
      }

      if (!com.aspose.slides.ms.System.n1.k5(var7.getSpacing())) {
         if (var7.getSpacing() == 0.0F) {
            var6.s7("normal");
         } else {
            var6.s7(t2f.n5(var7.getSpacing()));
         }
      }

      byte var10 = 0;
      IFillFormatEffectiveData var11 = null;
      ILineFormatEffectiveData var12 = null;
      byte[] var13 = new byte[]{0};
      ILineFormatEffectiveData[] var14 = new ILineFormatEffectiveData[]{var12};
      IFillFormatEffectiveData[] var15 = new IFillFormatEffectiveData[]{var11};
      j5u.n5(var7, var13, var14, var15);
      var10 = var13[0];
      var12 = var14[0];
      var11 = var15[0];
      if (var10 != 0 && var10 != -1) {
         var6.h0(2);
         var6.z3("auto");
         if (var11 != null && var11.getFillType() == 1) {
            var6.m1(t2f.n5(((f6a)var11).h0().o8()));
         }
      }

      if (var7.getStrikethroughType() != 0 && var7.getStrikethroughType() != -1) {
         var6.u3(2);
         var6.l6("auto");
      }

      if (!com.aspose.slides.ms.System.n1.k5(var7.getEscapement())) {
         if (var7.getEscapement() == 0.0F) {
            var6.a6("0% 100%");
         } else {
            var6.a6(com.aspose.slides.ms.System.d1.n5("{0}% 66.6667%", new Object[]{var7.getEscapement()}));
         }
      }

      if (var7.getKerningMinimalSize() > 0.0F && var7.getFontHeight() >= var7.getKerningMinimalSize()) {
         var6.l6((byte)1);
      }

      var6.n5((byte)0);
      var6.u9(1);
      return var6;
   }

   private static com.aspose.slides.internal.o9b.c8 n5(Portion var0, c9g var1, BaseSlide var2) {
      boolean var3 = var1.getHyperlinkClick() != null && var1.getHyperlinkClick().getColorSource() == 0
         || var1.getHyperlinkMouseOver() != null && var1.getHyperlinkMouseOver().getColorSource() == 0;
      if (var3) {
         com.aspose.slides.internal.o9b.c8 var4 = com.aspose.slides.internal.o9b.c8.n5(0, 153, 153).o8();
         if (var2 != null) {
            var2.n5(10).u3().n5(var4);
         }

         return var4;
      } else if (var0.getPortionFormat().getFillFormat().getFillType() != -1) {
         return ((ColorFormat)var0.getPortionFormat().getFillFormat().getSolidFillColor()).u3();
      } else {
         return var0.n3() != null && var0.n3().getParagraphFormat().getDefaultPortionFormat().getFillFormat().getFillType() != -1
            ? ((ColorFormat)var0.n3().getParagraphFormat().getDefaultPortionFormat().getFillFormat().getSolidFillColor()).u3()
            : com.aspose.slides.internal.o9b.c8.u3.o8();
      }
   }

   public static IFontData n5(Portion var0, PortionFormat var1, IPortionFormatEffectiveData var2, TextFrame var3) {
      IFontData var4 = null;
      if (var0.getPortionFormat().getLatinFont() != null) {
         var4 = var0.getPortionFormat().getLatinFont();
      } else {
         Paragraph var5 = var0.n3();
         if (var5 != null && var5.getParagraphFormat().getDefaultPortionFormat().getLatinFont() != null) {
            var4 = var0.n3().getParagraphFormat().getDefaultPortionFormat().getLatinFont();
         } else {
            IParagraphFormat var6 = ((TextFrameFormat)var3.getTextFrameFormat()).h0().getDefaultParagraphFormat();
            if (var6.getDefaultPortionFormat().getLatinFont() != null) {
               var4 = var6.getDefaultPortionFormat().getLatinFont();
            } else if (var1 != null && var1.getLatinFont() != null) {
               var4 = var1.getLatinFont();
            }
         }
      }

      if (var4 == null || var2 != null && com.aspose.slides.ms.System.u3.n5(j5u.t2, var4.getFontName()) >= 0) {
         return var2 != null && var2.getLatinFont() != null ? var2.getLatinFont() : v6v.n5;
      } else {
         return var4;
      }
   }

   private static void n5(Portion var0, boolean var1, com.aspose.slides.internal.k4y.u1x var2, com.aspose.slides.internal.k4y.y2i var3) {
      String var4 = var0.u9();
      if ("\u000b".equals(var4)) {
         var2.n5(a3l.k5);
      } else if (com.aspose.slides.ms.System.d1.t2(var4, "\u000b")) {
         String[] var5 = com.aspose.slides.ms.System.d1.n5(var4, '\u000b');

         for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            n5(var7, var0.l6(), var2, var3);
            if (var6 < var5.length - 1) {
               com.aspose.slides.internal.k4y.w5k var8 = (com.aspose.slides.internal.k4y.w5k)var2.n5(a3l.u9).l6();
               var8.l6(var3.n5());
               var8.n5(a3l.k5);
            }
         }
      } else if (com.aspose.slides.ms.System.d1.t2(var4, "\t")) {
         String[] var9 = com.aspose.slides.ms.System.d1.n5(var4, '\t');

         for (int var11 = 0; var11 < var9.length; var11++) {
            String var13 = var9[var11];
            if (var13.length() > 0) {
               n5(var13, var0.l6(), var2, var3);
            }

            if (var11 < var9.length - 1) {
               com.aspose.slides.internal.k4y.w5k var15 = (com.aspose.slides.internal.k4y.w5k)var2.n5(a3l.u9).l6();
               var15.l6(var3.n5());
               var15.n5(a3l.l6);
            }
         }
      } else if (com.aspose.slides.ms.System.d1.t2(var4, "\n") && !com.aspose.slides.ms.System.d1.k5(var4, "\n")) {
         String[] var10 = com.aspose.slides.ms.System.d1.n5(var4, '\n');

         for (int var12 = 0; var12 < var10.length; var12++) {
            String var14 = var10[var12];
            n5(var14, var0.l6(), var2, var3);
            if (var12 < var10.length - 1) {
               var2.n5(a3l.k5);
            }
         }
      } else {
         if (var1) {
            var4 = "\u200b";
         }

         n5(var4, var0.l6(), var2, var3);
      }
   }

   private static void n5(String var0, PortionFormat var1, com.aspose.slides.internal.k4y.u1x var2, com.aspose.slides.internal.k4y.y2i var3) {
      com.aspose.slides.internal.k4y.w5k var4 = (com.aspose.slides.internal.k4y.w5k)var2.n5(a3l.u9).l6();
      var4.l6(var3.n5());
      Hyperlink var5 = (Hyperlink)var1.getHyperlinkClick();
      if (var5 == null) {
         com.aspose.slides.internal.k4y.g7 var6 = var4.n5("_TEXT");
         var6.n5(t2f.z1(var0));
      } else {
         com.aspose.slides.internal.k4y.t6t var8 = (com.aspose.slides.internal.k4y.t6t)var4.n5(a3l.n5).l6();
         var8.n5(1);
         if (var5.getTargetSlide() != null) {
            if (!com.aspose.slides.ms.System.d1.n5(var5.h0())) {
               var8.l6(var5.h0());
            } else {
               var8.l6(com.aspose.slides.ms.System.d1.n5(new String[]{"#Slide ", com.aspose.slides.ms.System.a3.l6(var5.getTargetSlide().getSlideNumber())}));
            }
         } else {
            var8.l6(var5.getExternalUrlOriginal());
         }

         com.aspose.slides.internal.k4y.g7 var7 = var8.n5("_TEXT");
         var7.n5(t2f.z1(var0));
      }
   }
}
