package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class a2s {
   private static final char[] l6 = new char[]{'\'', '\\', '\n'};
   static final float[] n5 = new float[]{7.5F, 10.0F, 12.0F, 14.0F, 18.0F, 24.0F, 36.0F};
   private static final com.aspose.slides.internal.n8e.e2 k5 = new com.aspose.slides.internal.n8e.e2(-1, true, "inherit", "ltr", "rtl");
   private static final com.aspose.slides.internal.n8e.e2 u3 = new com.aspose.slides.internal.n8e.e2(-1, true, "inherit", "left", "center", "right", "justify");
   private static final com.aspose.slides.internal.n8e.e2 a6 = new com.aspose.slides.internal.n8e.e2(0, true, "simple", "hanging");
   private static final com.aspose.slides.internal.n8e.e2 u9 = new com.aspose.slides.internal.n8e.e2(1, true, "solid", "gradient");
   private static final com.aspose.slides.internal.n8e.e2 h0 = new com.aspose.slides.internal.n8e.e2(
      0,
      true,
      "background1",
      "text1",
      "background2",
      "text2",
      "accent1",
      "accent2",
      "accent3",
      "accent4",
      "accent5",
      "accent6",
      "hyperlink",
      "followedhyperlink",
      "stylecolor",
      "dark1",
      "light1",
      "dark2",
      "light2"
   );
   private static final com.aspose.slides.internal.n8e.e2 c8 = new com.aspose.slides.internal.n8e.e2(
      0, true, "linear", "path-rect", "path-circle", "path-shape"
   );
   private static final com.aspose.slides.internal.n8e.e2 t2 = new com.aspose.slides.internal.n8e.e2(0, true, "no", "yes");
   private static final com.aspose.slides.internal.n8e.e2 s7 = new com.aspose.slides.internal.n8e.e2(
      0,
      true,
      "solid",
      "dotgel",
      "dashgel",
      "longdashgel",
      "dashdotgel",
      "longdashdotgel",
      "longdashdotdotgel",
      "dashsys",
      "dotsys",
      "dashdotsys",
      "dashdotdotsys"
   );
   private static final com.aspose.slides.internal.n8e.e2 x8 = new com.aspose.slides.internal.n8e.e2(0, true, "round", "bevel", "miter");
   private static final com.aspose.slides.internal.n8e.e2 n3 = new com.aspose.slides.internal.n8e.e2(0, true, "round", "square", "flat");
   private static final com.aspose.slides.internal.n8e.e2 y4 = new com.aspose.slides.internal.n8e.e2(
      0, true, "simple", "double", "thinthick", "thickthin", "triple"
   );
   private static final com.aspose.slides.internal.n8e.e2 e2 = new com.aspose.slides.internal.n8e.e2(0, true, "center", "inset");
   private static final com.aspose.slides.internal.n8e.e2 t9 = new com.aspose.slides.internal.n8e.e2(
      0, true, "inherit", "baseline", "bottom", "middle", "sub", "super", "text-bottom", "text-top", "top"
   );
   private static final com.aspose.slides.internal.n8e.e2 z1 = new com.aspose.slides.internal.n8e.e2(0, true, "left", "center", "right", "decimal");
   private static final com.aspose.slides.internal.v6g.u9 t4 = new com.aspose.slides.internal.v6g.u9(
      "x-small", "xx-small", "1", "small", "2", "medium", "3", "large", "4", "x-large", "5", "xx-large", "6", "1em"
   );

   public static void n5(n6h$n5 var0, IParagraphFormat var1, float var2, float var3, float var4) {
      var1.setSpaceBefore(u3(var0, "margin-top", var3) / 2.0F);
      var1.setSpaceWithin(u3(var0, "line-height", Float.NaN));
      var1.setSpaceAfter(u3(var0, "margin-bottom", var4) / 2.0F);
      var1.setIndent(n5(var0, "text-indent", Float.NaN));
      var1.setMarginLeft(n5(var0, "margin-left", Float.NaN));
      var1.setMarginRight(n5(var0, "margin-right", Float.NaN));
      var1.setAlignment(n5(var0, "text-align", u3, -1));
      var1.setRightToLeft((byte)n5(var0, "direction", k5, -1));
      var1.setHangingPunctuation((byte)n5(var0, "punctuation-wrap", a6, -1));
      String var5 = var0.n5("tab-stops");
      if (var5 != null) {
         byte var6 = 0;
         com.aspose.slides.internal.n8e.u5 var7 = new com.aspose.slides.internal.n8e.u5(var5);

         while (true) {
            int var8 = var7.n5();
            float var9 = var7.u3(Float.NaN);
            if (!com.aspose.slides.ms.System.n1.k5(var9)) {
               var1.getTabs().add(new Tab(var2 / 100.0 * var9, var6));
            } else {
               var7.n5(var8);
               float var10 = var7.l6(Float.NaN);
               if (!com.aspose.slides.ms.System.n1.k5(var10)) {
                  var1.getTabs().add(new Tab(var10, var6));
               } else {
                  var7.n5(var8);
                  String var11 = var7.l6();
                  if (var11 == null || "".equals(var11)) {
                     break;
                  }

                  if (com.aspose.slides.ms.System.d1.a6(var11, z1.n5(0), (short)3) == 0) {
                     var6 = 0;
                  } else if (com.aspose.slides.ms.System.d1.a6(var11, z1.n5(1), (short)3) == 0) {
                     var6 = 1;
                  } else if (com.aspose.slides.ms.System.d1.a6(var11, z1.n5(2), (short)3) == 0) {
                     var6 = 2;
                  } else if (com.aspose.slides.ms.System.d1.a6(var11, z1.n5(3), (short)3) == 0) {
                     var6 = 3;
                  }
               }
            }
         }
      }
   }

   private static String n5(String[] var0) {
      if (var0 == null) {
         throw new ArgumentNullException("cssFontNameParts");
      } else {
         return n5(var0[0]);
      }
   }

   static String n5(String var0) {
      String var1 = var0;
      if (com.aspose.slides.ms.System.d1.u3(var1, ',') > 0) {
         String[] var2 = com.aspose.slides.ms.System.d1.n5(var1, ',');
         var1 = com.aspose.slides.ms.System.d1.k5(var2[0],new char[]{ '"'});
         if (var1.length() > 0) {
            return var1;
         }
      }

      return var1;
   }

   public static void n5(n6h$n5 var0, PortionFormat var1, boolean var2) {
      String[] var3 = n5(var0, "mso-ascii-font-family");
      String[] var4 = n5(var0, "mso-fareast-font-family");
      String[] var5 = n5(var0, "mso-bidi-font-family");
      String[] var6 = n5(var0, "font-family");
      if (var6 != null && var6.length > 0) {
         var1.setLatinFont(new FontData(n5(var6)));
      } else if (var3 != null && var3.length > 0) {
         var1.setLatinFont(new FontData(n5(var3)));
      }

      if (var4 != null && var4.length > 0) {
         var1.setEastAsianFont(new FontData(n5(var4)));
      }

      if (var5 != null && var5.length > 0) {
         var1.setComplexScriptFont(new FontData(n5(var5)));
      }

      String var7 = var0.n5("font-size");
      if (var7 != null) {
         var1.setFontHeight(l6(var7));
      }

      byte var8 = 3;
      var7 = var0.n5("font-style");
      if (var7 != null) {
         if (com.aspose.slides.ms.System.d1.a6(var7, "normal", var8) == 0) {
            var1.setFontItalic((byte)0);
         } else if (com.aspose.slides.ms.System.d1.a6(var7, "italic", var8) == 0) {
            var1.setFontItalic((byte)1);
         } else if (com.aspose.slides.ms.System.d1.a6(var7, "oblique", var8) == 0) {
            var1.setFontItalic((byte)1);
         }
      } else {
         var1.setFontItalic((byte)-1);
      }

      var7 = var0.n5("font-weight");
      if (var7 != null) {
         com.aspose.slides.internal.n8e.u5 var9 = new com.aspose.slides.internal.n8e.u5(var7);
         var9.t2();
         if (var9.s7() >= '0' && var9.s7() <= '9') {
            int var19 = var9.l6(Integer.MIN_VALUE);
            if (var19 != Integer.MIN_VALUE) {
               if (var19 >= 700) {
                  var1.setFontBold((byte)1);
               } else {
                  var1.setFontBold((byte)0);
               }
            } else {
               var1.setFontBold((byte)-1);
            }
         } else {
            String var10 = var9.l6();
            if (com.aspose.slides.ms.System.d1.a6(var10, "bold", var8) == 0 || com.aspose.slides.ms.System.d1.a6(var10, "bolder", var8) == 0) {
               var1.setFontBold((byte)1);
            } else if (com.aspose.slides.ms.System.d1.a6(var10, "normal", var8) != 0 && com.aspose.slides.ms.System.d1.a6(var10, "lighter", var8) != 0) {
               var1.setFontBold((byte)-1);
            } else {
               var1.setFontBold((byte)0);
            }
         }
      } else {
         var1.setFontBold((byte)-1);
      }

      var7 = var0.n5("text-decoration");
      if (var7 == null) {
         var7 = var0.n5("text-decoration-line");
      }

      if (var7 != null) {
         com.aspose.slides.internal.n8e.u5 var16 = new com.aspose.slides.internal.n8e.u5(var7);
         String var20 = var16.l6();
         if (com.aspose.slides.ms.System.d1.a6(var20, "line", var8) == 0) {
            var1.setStrikethroughType((byte)1);
         } else if (com.aspose.slides.ms.System.d1.a6(var20, "underline", var8) == 0) {
            var1.setFontUnderline((byte)2);
         }
      }

      var7 = var0.n5("mso-font-kerning");
      if (var7 != null) {
         var1.setKerningMinimalSize(new com.aspose.slides.internal.n8e.u5(var7).l6(Float.NaN));
      }

      var7 = var0.n5("language");
      if (var7 != null) {
         var1.setLanguageId(var7);
      }

      n5(var0, "mso-style-textoutline", var1.getLineFormat());
      n5(var0, "mso-style-textfill", var1.getFillFormat());
      if (var1.getFillFormat().getFillType() == -1 && var0.l6("color")) {
         var1.getFillFormat().setFillType((byte)1);
         new com.aspose.slides.internal.n8e.u5(var0.n5("color")).n5(var1.getFillFormat().getSolidFillColor());
      }

      if (!var2 && var0.l6("background-color")) {
         new com.aspose.slides.internal.n8e.u5(var0.n5("background-color")).n5(var1.h0());
      }

      float var17 = k5(var0, "mso-text-raise", Float.NaN);
      if (!com.aspose.slides.ms.System.n1.k5(var17)) {
         var1.setEscapement(var17);
      } else if (!var2) {
         var17 = k5(var0, "vertical-align", Float.NaN);
         if (!com.aspose.slides.ms.System.n1.k5(var17)) {
            var1.setEscapement(-var17);
         } else {
            switch (n5(var0, "vertical-align", t9, -1)) {
               case -1:
               case 0:
                  var1.setEscapement(Float.NaN);
                  break;
               case 1:
                  var1.setEscapement(0.0F);
                  break;
               case 2:
               case 6:
                  var1.setEscapement(40.0F);
                  break;
               case 3:
                  var1.setEscapement(20.0F);
                  break;
               case 4:
                  var1.setEscapement(-25.0F);
                  break;
               case 5:
                  var1.setEscapement(30.0F);
                  break;
               case 7:
               case 8:
                  var1.setEscapement(40.0F);
            }
         }
      }

      n5(var0, var1);
   }

   private static void n5(n6h$n5 var0, PortionFormat var1) {
      byte var2 = 3;
      String var3 = var0.n5("font");
      if (var3 != null) {
         com.aspose.slides.internal.n8e.u5 var4 = new com.aspose.slides.internal.n8e.u5(var3);
         var4.t2();
         String var5 = "";

         while (!com.aspose.slides.ms.System.d1.n5(var5 = var4.l6())) {
            if (com.aspose.slides.ms.System.d1.a6(var5, "bold", var2) == 0 || com.aspose.slides.ms.System.d1.a6(var5, "bolder", var2) == 0) {
               var1.setFontBold((byte)1);
            } else if (com.aspose.slides.ms.System.d1.a6(var5, "normal", var2) == 0 || com.aspose.slides.ms.System.d1.a6(var5, "lighter", var2) == 0) {
               var1.setFontBold((byte)0);
            } else if (com.aspose.slides.ms.System.d1.a6(var3, "normal", var2) == 0) {
               var1.setFontItalic((byte)0);
            } else if (com.aspose.slides.ms.System.d1.a6(var3, "italic", var2) == 0) {
               var1.setFontItalic((byte)1);
            } else if (com.aspose.slides.ms.System.d1.a6(var3, "oblique", var2) == 0) {
               var1.setFontItalic((byte)1);
            } else if (com.aspose.slides.ms.System.d1.k5(var5, "pt")) {
               String var6 = com.aspose.slides.ms.System.d1.l6(var5, 0, var5.length() - 2);
               float var7 = 0.0F;
               float[] var8 = new float[]{0.0F};
               boolean var9 = com.aspose.slides.ms.System.n1.n5(var6, var8);
               var7 = var8[0];
               if (var9) {
                  var1.setFontHeight(var7);
               }
            }
         }

         String var11 = com.aspose.slides.ms.System.d1.l6(var3, var4.n5(), var3.length() - var4.n5());
         var11 = com.aspose.slides.ms.System.d1.k5(var11,new char[]{ '"'});
         if (!com.aspose.slides.ms.System.d1.n5(var11)) {
            FontData var14 = new FontData(var11);
            var1.setLatinFont(var14);
            var1.setEastAsianFont(var14);
            var1.setComplexScriptFont(var14);
         }
      }
   }

   public static float l6(String var0) {
      switch (t4.n5(var0)) {
         case 0:
         case 1:
         case 2:
            return n5[0];
         case 3:
         case 4:
            return n5[1];
         case 5:
         case 6:
            return n5[2];
         case 7:
         case 8:
            return n5[3];
         case 9:
         case 10:
            return n5[4];
         case 11:
         case 12:
            return n5[5];
         case 13:
            return Float.NaN;
         default:
            float var1 = 0.0F;
            float[] var2 = new float[]{0.0F};
            boolean var3 = com.aspose.slides.ms.System.n1.n5(var0, var2);
            var1 = var2[0];
            if (var3) {
               return var1 * 0.75F;
            } else {
               com.aspose.slides.internal.n8e.u5 var4 = new com.aspose.slides.internal.n8e.u5(var0);
               return var4.l6(Float.NaN);
            }
      }
   }

   public static String n5(IParagraphFormat var0) {
      SortedList var1 = new SortedList<>(com.aspose.slides.ms.System.p6.l6());
      if (var0.getSpaceBefore() > 0.0F) {
         n5(var1, "margin-top", var0.getSpaceBefore(), Float.NaN);
      } else {
         n5(var1, "margin-top", -var0.getSpaceBefore(), Float.NaN);
      }

      if (var0.getSpaceWithin() > 0.0F) {
         k5(var1, "line-height", var0.getSpaceWithin(), Float.NaN);
      } else {
         n5(var1, "line-height", -var0.getSpaceWithin(), Float.NaN);
      }

      if (var0.getSpaceBefore() > 0.0F) {
         n5(var1, "margin-bottom", var0.getSpaceAfter(), Float.NaN);
      } else {
         n5(var1, "margin-bottom", -var0.getSpaceAfter(), Float.NaN);
      }

      n5(var1, "text-indent", var0.getIndent(), Float.NaN);
      n5(var1, "margin-left", var0.getMarginLeft(), Float.NaN);
      n5(var1, "margin-right", var0.getMarginRight(), Float.NaN);
      n5(var1, "text-align", u3, var0.getAlignment(), -1);
      n5(var1, "direction", k5, var0.getRightToLeft(), -1);
      n5(var1, "punctuation-wrap", a6, var0.getHangingPunctuation(), -1);
      if (((ParagraphFormat)var0).x8() > 0) {
         int var2 = var0.getTabs().get_Item(0).getAlignment();
         com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5(z1.n5(var0.getTabs().get_Item(0).getAlignment()));
         IGenericEnumerator var4 = var0.getTabs().iterator();

         try {
            while (var4.hasNext()) {
               ITab var5 = (ITab)var4.next();
               if (var2 != var5.getAlignment()) {
                  var2 = var5.getAlignment();
                  var3.n5(' ');
                  var3.n5(z1.n5(var5.getAlignment()));
               }

               var3.n5(' ');
               var3.n5(com.aspose.slides.ms.System.Xml.f4.n5(var5.getPosition()));
               var3.n5("pt");
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         var1.set_Item("tab-stops", var3.toString());
      }

      return n5(var1);
   }

   public static String n5(IPortionFormat var0, boolean var1, BaseSlide var2, r0s var3) {
      SortedList var4 = new SortedList<>(com.aspose.slides.ms.System.p6.l6());
      if (var1) {
         if (var0.getLatinFont() != null) {
            n5(var4, "mso-ascii-font-family", var0.getLatinFont().getFontName());
         }

         if (var0.getEastAsianFont() != null) {
            n5(var4, "mso-fareast-font-family", var0.getEastAsianFont().getFontName());
         }

         if (var0.getComplexScriptFont() != null) {
            n5(var4, "mso-bidi-font-family", var0.getComplexScriptFont().getFontName());
         }

         n5(var4, "mso-font-kerning", var0.getKerningMinimalSize(), Float.NaN);
         n5(var4, "mso-style-textoutline", var0.getLineFormat(), var2, var3);
         n5(var4, "mso-style-textfill", var0.getFillFormat(), var2, var3);
         if (!com.aspose.slides.ms.System.n1.k5(var0.getEscapement())) {
            k5(var4, "mso-text-raise", var0.getEscapement(), 0.0F);
         }
      }

      if (var0.getLatinFont() != null) {
         n5(var4, "font-family", var0.getLatinFont().getFontName(var2.createThemeEffective()));
      }

      n5(var4, "font-size", var0.getFontHeight(), Float.NaN);
      if (var0.getFontItalic() == 1) {
         var4.set_Item("font-style", "italic");
      }

      if (var0.getFontBold() == 1) {
         var4.set_Item("font-weight", "bold");
      }

      var4.set_Item("language", var0.getLanguageId());
      if (!com.aspose.slides.ms.System.n1.k5(var0.getEscapement()) && var0.getEscapement() != 0.0F) {
         var4.set_Item("vertical-align", var0.getEscapement() > 0.0F ? "super" : "sub");
      }

      if (var0.getSpacing() > 0.0F) {
         n5(var4, "letter-spacing", var0.getSpacing(), Float.NaN);
      }

      return n5(var4);
   }

   public static String n5(Paragraph var0, boolean var1, BaseSlide var2, r0s var3) {
      SortedList var4 = new SortedList();
      if (var0.getParagraphFormat().getBullet().isBulletHardFont() == 1 && var0.getParagraphFormat().getBullet().getFont() != null) {
         n5(var4, "font-family", var0.getParagraphFormat().getBullet().getFont().getFontName(var2.createThemeEffective()));
      } else if (var0.getPortions().getCount() > 0 && var0.getPortions().get_Item(0).getPortionFormat().getLatinFont() != null) {
         n5(var4, "font-family", var0.getPortions().get_Item(0).getPortionFormat().getLatinFont().getFontName(var2.createThemeEffective()));
      }

      if (var0.getPortions().getCount() > 0) {
         n5(
            var4,
            "font-size",
            var0.getParagraphFormat().getBullet().getHeight() / 100.0F * var0.getPortions().get_Item(0).getPortionFormat().getFontHeight(),
            Float.NaN
         );
      }

      if (var0.getParagraphFormat().getBullet().isBulletHardColor() == 1) {
         com.aspose.slides.internal.o9b.c8 var5 = ((ColorFormat)var0.getParagraphFormat().getBullet().getColor()).k5(var2, var3).o8();
         var4.set_Item("color", com.aspose.slides.ms.System.d1.n5("#{0:x2}{1:x2}{2:x2}",new Object[]{ var5.x8(), var5.n3(), var5.y4()}));
      }

      if (var1) {
         if (var0.getParagraphFormat().getBullet().getType() == 2) {
            var4.set_Item(
               "mso-special-format",
               com.aspose.slides.ms.System.d1.n5(
                  "'numbullet{0}\\,{1}'",new Object[]{
                  Integer.valueOf(var0.getParagraphFormat().getBullet().getNumberedBulletStyle()),
                  var0.getParagraphFormat().getBullet().getNumberedBulletStartWith()
               })
            );
         } else {
            var4.set_Item("mso-special-format", "bullet");
         }
      }

      return n5(var4);
   }

   private static String n5(IGenericDictionary<String, String> var0) {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      IGenericEnumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            var1.n5(";{0}:{1}", var3.getKey(), var3.getValue());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1.l6() == 0 ? null : var1.n5(1, var1.l6() - 1);
   }

   private static void n5(n6h$n5 var0, String var1, ILineFormat var2) {
      var2.getFillFormat().setFillType((byte)n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-type"}), u9, -1));
      switch (var2.getFillFormat().getFillType()) {
         case 1:
            n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-fill"}), var2.getFillFormat().getSolidFillColor());
            break;
         case 2:
            n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-fill-gradientfill"}), var2.getFillFormat().getGradientFormat());
      }

      var2.setDashStyle((byte)n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-outlinestyle-dash"}), s7, -1));
      var2.setJoinStyle((byte)n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-outlinestyle-join"}), x8, -1));
      var2.setCapStyle((byte)n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-outlinestyle-linecap"}), n3, -1));
      var2.setStyle((byte)n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-outlinestyle-compound"}), y4, -1));
      var2.setAlignment((byte)n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-outlinestyle-align"}), e2, -1));
   }

   private static void n5(IGenericDictionary<String, String> var0, String var1, ILineFormat var2, BaseSlide var3, r0s var4) {
      switch (var2.getFillFormat().getFillType()) {
         case 1:
            n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-type"}), u9, var2.getFillFormat().getFillType(), -1);
            n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-fill"}), (ColorFormat)var2.getFillFormat().getSolidFillColor(), var3, var4);
            break;
         case 2:
            n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-type"}), u9, var2.getFillFormat().getFillType(), -1);
            n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-fill-gradientfill"}), (GradientFormat)var2.getFillFormat().getGradientFormat(), var3, var4);
      }

      n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-outlinestyle-dash"}), s7, var2.getDashStyle(), -1);
      n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-outlinestyle-join"}), x8, var2.getJoinStyle(), -1);
      n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-outlinestyle-linecap"}), n3, var2.getCapStyle(), -1);
      n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-outlinestyle-compound"}), y4, var2.getStyle(), -1);
      n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-outlinestyle-align"}), e2, var2.getAlignment(), -1);
   }

   private static void n5(n6h$n5 var0, String var1, IFillFormat var2) {
      var2.setFillType((byte)n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-type"}), u9, -1));
      switch (var2.getFillType()) {
         case 1:
            n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-fill"}), var2.getSolidFillColor());
            break;
         case 2:
            n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-fill-gradientfill"}), var2.getGradientFormat());
      }
   }

   private static void n5(IGenericDictionary<String, String> var0, String var1, IFillFormat var2, BaseSlide var3, r0s var4) {
      switch (var2.getFillType()) {
         case 1:
            n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-type"}), u9, var2.getFillType(), -1);
            n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-fill"}), (ColorFormat)var2.getSolidFillColor(), var3, var4);
            com.aspose.slides.internal.o9b.c8 var5 = ((ColorFormat)var2.getSolidFillColor()).k5(var3, var4).o8();
            var0.set_Item("color", com.aspose.slides.ms.System.d1.n5("#{0:x2}{1:x2}{2:x2}",new Object[]{ var5.x8(), var5.n3(), var5.y4()}));
            break;
         case 2:
            n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-type"}), u9, var2.getFillType(), -1);
            n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-fill-gradientfill"}), (GradientFormat)var2.getGradientFormat(), var3, var4);
      }
   }

   private static void n5(n6h$n5 var0, String var1, IColorFormat var2) {
      String var3 = var0.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-color"}));
      if (var3 != null) {
         new com.aspose.slides.internal.n8e.u5(var3).n5(var2);
      }

      int var4 = n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-themecolor"}), h0, -1);
      if (var4 != -1) {
         var2.setSchemeColor(var4);
      }

      float var5 = k5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-alpha"}), Float.NaN);
      if (!com.aspose.slides.ms.System.n1.k5(var5)) {
         var2.getColorTransform().add(5, var5 / 100.0F);
      }

      var3 = var0.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-colortransforms"}));
      if (var3 != null) {
         com.aspose.slides.internal.n8e.u5 var6 = new com.aspose.slides.internal.n8e.u5(var3);
         n5(var6, var2);
      }
   }

   private static void n5(IGenericDictionary<String, String> var0, String var1, ColorFormat var2, BaseSlide var3, r0s var4) {
      com.aspose.slides.internal.o9b.c8 var5 = var2.n5(var3, var4).n5().o8();
      var0.set_Item(
         com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-color"}), com.aspose.slides.ms.System.d1.n5("#{0:x2}{1:x2}{2:x2}",new Object[]{ var5.x8(), var5.n3(), var5.y4()})
      );
      if (var2.getColorType() == 3) {
         n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-themecolor"}), h0, var2.getSchemeColor(), -1);
      }

      float var6 = var2.l6(var3, var4).n5;
      k5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-alpha"}), var6 * 100.0F, 100.0F);
      String var7 = n5(var2);
      if (var7 != null && !"".equals(var7)) {
         var0.set_Item(com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-colortransforms"}), var7);
      }
   }

   private static void n5(com.aspose.slides.internal.n8e.u5 var0, IColorFormat var1) {
      byte var2 = 3;

      while (var0.h0() > 0) {
         var0.t2();
         char var3 = var0.s7();
         if ((var3 < 'A' || var3 > 'Z') && (var3 < 'a' || var3 > 'z')) {
            break;
         }

         String var4 = var0.l6();
         if (!"".equals(var4)) {
            var0.t2();
            if (var0.c8() == '=') {
               int var5 = var0.l6(Integer.MIN_VALUE);
               if (var5 != Integer.MIN_VALUE) {
                  if (com.aspose.slides.ms.System.d1.a6(var4, "tint", var2) == 0) {
                     var1.getColorTransform().add(0, var5 / 100000.0F);
                  } else if (com.aspose.slides.ms.System.d1.a6(var4, "shade", var2) == 0) {
                     var1.getColorTransform().add(1, var5 / 100000.0F);
                  } else if (com.aspose.slides.ms.System.d1.a6(var4, "huem", var2) == 0) {
                     var1.getColorTransform().add(10, var5 / 100000.0F);
                  } else if (com.aspose.slides.ms.System.d1.a6(var4, "sat", var2) == 0) {
                     var1.getColorTransform().add(11, var5 / 100000.0F);
                  } else if (com.aspose.slides.ms.System.d1.a6(var4, "sato", var2) == 0) {
                     var1.getColorTransform().add(12, var5 / 100000.0F);
                  } else if (com.aspose.slides.ms.System.d1.a6(var4, "satm", var2) == 0) {
                     var1.getColorTransform().add(13, var5 / 100000.0F);
                  } else if (com.aspose.slides.ms.System.d1.a6(var4, "lum", var2) == 0) {
                     var1.getColorTransform().add(14, var5 / 100000.0F);
                  } else if (com.aspose.slides.ms.System.d1.a6(var4, "lumo", var2) == 0) {
                     var1.getColorTransform().add(15, var5 / 100000.0F);
                  } else if (com.aspose.slides.ms.System.d1.a6(var4, "lumm", var2) == 0) {
                     var1.getColorTransform().add(16, var5 / 100000.0F);
                  }
               }
            }
         }
      }
   }

   private static String n5(ColorFormat var0) {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();

      for (int var2 = 0; var2 < var0.getColorTransform().size(); var2++) {
         switch (var0.getColorTransform().get_Item(var2).getOperationType()) {
            case 0:
               var1.n5(" tint={0}", com.aspose.slides.internal.v6g.k5.u3(var0.getColorTransform().get_Item(var2).getParameter() * 100000.0, 14));
               break;
            case 1:
               var1.n5(" shade={0}", com.aspose.slides.internal.v6g.k5.u3(var0.getColorTransform().get_Item(var2).getParameter() * 100000.0F + 0.5F, 13));
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            default:
               break;
            case 10:
               var1.n5(" huem={0}", com.aspose.slides.internal.v6g.k5.u3(var0.getColorTransform().get_Item(var2).getParameter() * 100000.0F + 0.5F, 13));
               break;
            case 11:
               var1.n5(" sat={0}", com.aspose.slides.internal.v6g.k5.u3(var0.getColorTransform().get_Item(var2).getParameter() * 100000.0F + 0.5F, 13));
               break;
            case 12:
               var1.n5(" sato={0}", com.aspose.slides.internal.v6g.k5.u3(var0.getColorTransform().get_Item(var2).getParameter() * 100000.0F + 0.5F, 13));
               break;
            case 13:
               var1.n5(" satm={0}", com.aspose.slides.internal.v6g.k5.u3(var0.getColorTransform().get_Item(var2).getParameter() * 100000.0F + 0.5F, 13));
               break;
            case 14:
               var1.n5(" lum={0}", com.aspose.slides.internal.v6g.k5.u3(var0.getColorTransform().get_Item(var2).getParameter() * 100000.0F + 0.5F, 13));
               break;
            case 15:
               var1.n5(" lumo={0}", com.aspose.slides.internal.v6g.k5.u3(var0.getColorTransform().get_Item(var2).getParameter() * 100000.0F + 0.5F, 13));
               break;
            case 16:
               var1.n5(" lumm={0}", com.aspose.slides.internal.v6g.k5.u3(var0.getColorTransform().get_Item(var2).getParameter() * 100000.0F + 0.5F, 13));
         }
      }

      return var1.l6() > 0 ? var1.n5(1, var1.l6() - 1) : null;
   }

   private static void n5(n6h$n5 var0, String var1, IGradientFormat var2) {
      var2.setGradientShape((byte)n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-shadetype"}), c8, -1));
      switch (var2.getGradientShape()) {
         case 0:
            var2.setLinearGradientAngle(l6(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-shade-linearshade-angle"}), Float.NaN) / 60000.0F);
            var2.setLinearGradientScaled((byte)n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-shade-linearshade-fscaled"}), t2, -1));
            break;
         case 1:
         case 2:
         case 3:
            float var3 = k5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-shade-rectfill-pctleft"}), Float.NaN);
            float var4 = k5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-shade-rectfill-pctright"}), Float.NaN);
            float var5 = k5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-shade-rectfill-pcttop"}), Float.NaN);
            float var6 = k5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-shade-rectfill-pctbottom"}), Float.NaN);
            ((GradientFormat)var2).n5(var3, var5, var4 - var3, var6 - var5);
      }

      String var10 = var0.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-stoplist"}));
      com.aspose.slides.internal.n8e.u5 var11 = new com.aspose.slides.internal.n8e.u5(var10);
      if (var11.s7() == '\'' || var11.s7() == '"') {
         var11.c8();
      }

      while (var11.h0() > 0) {
         float var12 = var11.n5(Float.NaN);
         if (com.aspose.slides.ms.System.n1.k5(var12)) {
            break;
         }

         ((GradientStopCollection)var2.getGradientStops()).n5(var12 / 100000.0F, com.aspose.slides.internal.o9b.c8.m3().o8());
         IGradientStop var13 = var2.getGradientStops().get_Item(var2.getGradientStops().size() - 1);
         var11.t2();
         char var7 = var11.c8();
         var11.n5(var13.getColor());
         int var8 = var11.l6(-1);
         if (var8 >= 0) {
            var13.getColor().setSchemeColor(var8);
         }

         var11.t2();
         float var9 = var11.n5(Float.NaN) / 100000.0F;
         if (!com.aspose.slides.ms.System.n1.k5(var9)) {
            var13.getColor().getColorTransform().insert(0, 5, var9);
         }

         n5(var11, (ColorFormat)var13.getColor());
         var11.t2();
         if (var11.s7() == '\\') {
            var11.c8();
         }

         if (var11.s7() == ',') {
            var11.c8();
         }
      }
   }

   private static void n5(IGenericDictionary<String, String> var0, String var1, GradientFormat var2, BaseSlide var3, r0s var4) {
      n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-shadetype"}), c8, var2.getGradientShape(), -1);
      switch (var2.getGradientShape()) {
         case 0:
            l6(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-shade-linearshade-angle"}), var2.getLinearGradientAngle() * 60000.0F, Float.NaN);
            n5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-shade-linearshade-fscaled"}), t2, var2.getLinearGradientScaled(), -1);
            break;
         case 1:
         case 2:
         case 3:
            s4s var5 = var2.u9().l6();
            k5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-shade-rectfill-pctleft"}), var5.n5.n5, Float.NaN);
            k5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-shade-rectfill-pctright"}), var5.n5.n5 + var5.l6.n5, Float.NaN);
            k5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-shade-rectfill-pcttop"}), var5.n5.l6, Float.NaN);
            k5(var0, com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-shade-rectfill-pctbottom"}), var5.n5.l6 + var5.l6.l6, Float.NaN);
      }

      com.aspose.slides.internal.l7h.a5 var10 = new com.aspose.slides.internal.l7h.a5();

      for (int var6 = 0; var6 < var2.getGradientStops().size(); var6++) {
         IGradientStop var7 = var2.getGradientStops().get_Item(var6);
         com.aspose.slides.internal.o9b.c8 var8 = ((ColorFormat)var2.getGradientStops().get_Item(var6).getColor()).k5(var3, var4).o8();
         var10.n5(
            "\\,{0} \\#{1:x2}{2:x2}{3:x2} {4}",new Object[]{
            com.aspose.slides.internal.v6g.k5.u3(var7.getPosition() * 100000.0F + 0.5F, 13),
            var8.x8(),
            var8.n3(),
            var8.y4(),
            var7.getColor().getSchemeColor()
         });
         var10.n5(" {0}",new Object[]{ com.aspose.slides.internal.v6g.k5.u3((var8.s7() & 0xFF) * 100000.0F / 255.0F, 13)});
         String var9 = n5((ColorFormat)var7.getColor());
         if (var9 != null) {
            var10.n5(" {0}",new Object[]{ var9});
         }
      }

      if (var10.l6() > 2) {
         var0.set_Item(com.aspose.slides.ms.System.d1.n5(new String[]{var1, "-stoplist"}), var10.n5(2, var10.l6() - 2));
      }
   }

   static String[] n5(n6h$n5 var0, String var1) {
      String var2 = var0.n5(var1);
      if (var2 == null) {
         return null;
      }

      com.aspose.slides.internal.n8e.u5 var3 = new com.aspose.slides.internal.n8e.u5(var2);
      List var4 = new List();
      String var5 = "";

      String var6;
      while (!"".equals(var6 = var3.k5())) {
         var5 = com.aspose.slides.ms.System.d1.n5(var5, var6);
         if (var3.s7() == ' ' && var5.length() > 0) {
            var5 = com.aspose.slides.ms.System.d1.n5(var5, " ");
         }

         var3.t2();
         if (var3.s7() == ',') {
            var4.addItem(com.aspose.slides.ms.System.d1.l6(var5));
            var5 = "";
            var3.c8();
         }
      }

      var4.addItem(com.aspose.slides.ms.System.d1.l6(var5));
      return (String[])var4.toArray(new String[0]);
   }

   private static void n5(IGenericDictionary<String, String> var0, String var1, String var2) {
      var0.set_Item(var1, k5(var2));
   }

   private static String k5(String var0) {
      if (com.aspose.slides.ms.System.d1.n5(var0, l6) >= 0) {
         int var1 = 0;
         com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();

         while (var1 < var0.length()) {
            int var3 = com.aspose.slides.ms.System.d1.n5(var0, l6, var1);
            if (var3 < 0) {
               var3 = var0.length();
            }

            if (var1 < var3) {
               var2.n5(var0, var1, var3);
            }

            if (var3 < var0.length()) {
               switch (var0.charAt(var3)) {
                  case '\n':
                     var2.n5("\\0000000a");
                     break;
                  case '\'':
                     var2.n5("\\'");
                     break;
                  case '\\':
                     var2.n5("\\\\");
               }

               var3++;
            }

            var1 = var3;
         }

         return var2.toString();
      } else {
         return com.aspose.slides.ms.System.d1.n5("'{0}'", new Object[]{var0});
      }
   }

   static float n5(n6h$n5 var0, String var1, float var2) {
      String var3 = var0.n5(var1);
      if (var3 != null && !"auto".equals(var3)) {
         com.aspose.slides.internal.n8e.u5 var4 = new com.aspose.slides.internal.n8e.u5(var3);
         return var4.x8();
      } else {
         return var2;
      }
   }

   private static void n5(IGenericDictionary<String, String> var0, String var1, float var2, float var3) {
      if (com.aspose.slides.internal.n8e.v4.n5(var2, var3)) {
         var0.removeItemByKey(var1);
      } else {
         var0.set_Item(var1, com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(var2), "pt"}));
      }
   }

   private static float l6(n6h$n5 var0, String var1, float var2) {
      String var3 = var0.n5(var1);
      if (var3 == null) {
         return var2;
      }

      com.aspose.slides.internal.n8e.u5 var4 = new com.aspose.slides.internal.n8e.u5(var3);
      return var4.n5(var2);
   }

   private static void l6(IGenericDictionary<String, String> var0, String var1, float var2, float var3) {
      if (com.aspose.slides.internal.n8e.v4.n5(var2, var3)) {
         var0.removeItemByKey(var1);
      } else {
         var0.set_Item(var1, com.aspose.slides.ms.System.Xml.f4.n5(var2));
      }
   }

   private static float k5(n6h$n5 var0, String var1, float var2) {
      String var3 = var0.n5(var1);
      if (var3 == null) {
         return var2;
      }

      com.aspose.slides.internal.n8e.u5 var4 = new com.aspose.slides.internal.n8e.u5(var3);
      return var4.u3(var2);
   }

   private static void k5(IGenericDictionary<String, String> var0, String var1, float var2, float var3) {
      if (com.aspose.slides.internal.n8e.v4.n5(var2, var3)) {
         var0.removeItemByKey(var1);
      } else {
         var0.set_Item(var1, com.aspose.slides.ms.System.d1.n5(new Object[]{com.aspose.slides.ms.System.Xml.f4.n5(var2), '%'}));
      }
   }

   private static float u3(n6h$n5 var0, String var1, float var2) {
      String var3 = var0.n5(var1);
      if (var3 != null && !"normal".equals(var3) && !"auto".equals(var3)) {
         com.aspose.slides.internal.n8e.u5 var4 = new com.aspose.slides.internal.n8e.u5(var3);
         if (com.aspose.slides.ms.System.d1.c8(var3, "var") >= 0) {
            var4.l6();
            String[] var5 = var4.a6();
            if (var0.l6(var5[0])) {
               var3 = var0.n5(var5[0]);
            } else {
               var3 = var5[1];
            }

            var4 = new com.aspose.slides.internal.n8e.u5(var3);
         }

         if (com.aspose.slides.ms.System.d1.c8(var3, "%") >= 0) {
            return var4.n3();
         } else {
            return com.aspose.slides.ms.System.d1.c8(var3, "em") > 0 ? var4.x8() * 100.0F : -var4.x8();
         }
      } else {
         return var2;
      }
   }

   private static int n5(n6h$n5 var0, String var1, com.aspose.slides.internal.n8e.e2 var2, int var3) {
      String var4 = var0.n5(var1);
      return var4 != null && var2.l6(var4) ? var2.n5(var4) : var3;
   }

   private static void n5(IGenericDictionary<String, String> var0, String var1, com.aspose.slides.internal.n8e.e2 var2, int var3, int var4) {
      if (var3 == var4) {
         var0.removeItemByKey(var1);
      } else {
         var0.set_Item(var1, var2.n5(var3));
      }
   }
}
