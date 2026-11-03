package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class x3s extends p2v {
   private static final char[] l6 = new char[]{'•', '–', '•', '–', '»', '•'};
   private final List<x3s$n5> k5 = new List<>();
   private final List<n6h$l6> u3 = new List<>();
   private final List<List<n6h$l6>> a6 = new List<>();
   private int u9;
   private final f7s h0;
   private x3s$n5 c8 = new x3s$n5();
   private final ParagraphCollection t2;
   private final String s7;
   static final char[] n5 = new char[]{'\r', '\n'};
   private final List<Portion> x8 = new List<>();
   private final n6h n3 = new n6h();
   private final boolean y4;
   private c0h e2;
   private n9p t9;
   private static final com.aspose.slides.internal.v6g.u9 z1 = new com.aspose.slides.internal.v6g.u9(
      "font-size",
      "line-height",
      "font-family",
      "color",
      "i",
      "em",
      "b",
      "strong",
      "u",
      "font",
      "a",
      "br",
      "s",
      "strike",
      "ul",
      "ol",
      "span",
      "body",
      "center",
      "div",
      "p",
      "h1",
      "h2",
      "h3",
      "h4",
      "h5",
      "h6",
      "noscript",
      "hr",
      "li",
      "td",
      "blockquote",
      "img",
      "sub",
      "sup",
      "math",
      "1",
      "A",
      "I",
      "disc",
      "arrow",
      "circle",
      "square",
      "list-style-image"
   );

   public x3s(ParagraphCollection var1, f7s var2, String var3, boolean var4) {
      this.h0 = var2;
      this.s7 = var3;
      this.t2 = var1;
      this.u9 = var1.getCount();
      this.y4 = var4;
      if (this.t2.getCount() == 0 || !this.y4) {
         this.n5(this.c8.l6);
      }
   }

   void u3(String var1) {
      if (com.aspose.slides.ms.System.d1.t2(var1, com.aspose.slides.ms.System.d1.n5(new String[]{"<", "math"}))) {
         try {
            com.aspose.slides.internal.j4.n5 var2 = new com.aspose.slides.internal.j4.n5();
            var2.n5(this.s7);
            com.aspose.slides.internal.f5.k5 var3 = new com.aspose.slides.internal.f5.k5(new r9l(this.h0), var2, null);
            com.aspose.slides.internal.j3.z1 var4 = var3.n5(var1);
            if (var4.p8()) {
               this.n5((com.aspose.slides.internal.f5.r4)var4.y1().n5(0));
               return;
            }
         } catch (RuntimeException var5) {
         }
      }

      super.k5(var1);
   }

   @Override
   void n5(String var1) {
      IParagraph var2 = this.t2.get_Item(this.t2.getCount() - 1);
      this.c8.n5(var2.getParagraphFormat());
      this.n5(this.c8.n5);
      this.l6(this.c8.n5);
      this.t9 = null;
      String var3 = var1;
      int var4 = var1.length();
      if (this.c8.a6) {
         int var5 = 0;

         while (var5 < var4 && var1.charAt(var5) <= ' ') {
            var5++;
         }

         if (var5 < var4) {
            var2.getParagraphFormat().getBullet().setChar(var1.charAt(var5));
            var5++;
            if (var5 < var4 && var1.charAt(var5) <= ' ') {
               var5++;
            }

            var3 = var4 > var5 ? com.aspose.slides.ms.System.d1.k5(var1, var5) : null;
         }
      }

      if (!this.c8.u3 && var3 != null && this.k5.size() != 0) {
         if (var2.getParagraphFormat().getBullet().getNumberedBulletStyle() > -1 && (this.c8.n5.getFontBold() == 1 || this.c8.n5.getFontItalic() == 1)) {
            Portion var13 = new Portion(this.c8.n5);
            var13.n5("\u200b");
            IPortionFormat var6 = var13.getPortionFormat();
            var6.setFontBold((byte)0);
            var6.setFontItalic((byte)0);
            var2.getPortions().add(var13);
         }

         if (com.aspose.slides.ms.System.d1.n5(var3, n5) >= 0) {
            var4 = var3.length();
            boolean var14 = false;
            int var17 = 0;

            while (var17 < var4) {
               int var7 = com.aspose.slides.ms.System.d1.n5(var3, n5, var17);
               if (var7 < 0) {
                  var7 = var4;
               }

               if (var17 < var7) {
                  String var8 = com.aspose.slides.ms.System.d1.l6(var3, var17, var7 - var17);
                  boolean var9 = com.aspose.slides.ms.System.d1.l6(var8).length() == 0;
                  if (var9) {
                     var8 = var2.getPortions().getCount() > 0 ? " " : "";
                  } else if (var14) {
                     var14 = false;
                     var8 = com.aspose.slides.ms.System.d1.u3(var8,new char[]{ ' '});
                     if (var2.getPortions().getCount() > 0) {
                        var8 = com.aspose.slides.ms.System.d1.n5(new Object[]{' ', var8});
                     }
                  }

                  Portion var10 = new Portion(this.c8.n5);
                  var10.n5(var8);
                  var2.getPortions().add(var10);
                  if (this.c8.u9) {
                     this.x8.addItem(var10);
                  }
               }

               if (var7 < var4) {
                  var17 = var7 + 1;
                  if (var17 < var4
                     && (var3.charAt(var17 - 1) == '\r' && var3.charAt(var17++) == '\n' || var3.charAt(var17 - 1) == '\n')
                     && var17 < var4
                     && var3.charAt(var17) == ' ') {
                     var14 = true;
                  }
               } else if (var7 == var4) {
                  break;
               }
            }
         } else {
            Portion var15 = new Portion(this.c8.n5);
            var15.n5(var3);
            if (this.c8.k5 && com.aspose.slides.ms.System.d1.l6(var3).length() == 0 && !this.c8.n5.z3()) {
               var15.l6().setFontHeight(14.0F);
            }

            if (this.c8.u9) {
               this.x8.addItem(var15);
            }

            var2.getPortions().add(var15);
         }

         IBulletFormat var16 = var2.getParagraphFormat().getBullet();
         if (var16.getType() > -1 && var2.getPortions().getCount() == 1 && !com.aspose.slides.ms.System.n1.k5(var16.getHeight())) {
            float var18 = var2.getPortions().get_Item(0).getPortionFormat().getFontHeight();
            var16.setHeight(com.aspose.slides.ms.System.n1.k5(var18) ? 100.0F : var16.getHeight() / var18 * 100.0F);
         }
      }
   }

   @Override
   void n5(com.aspose.slides.internal.h6.n5 var1) {
      o2o var2 = new o2o();
      MathBlock var3 = var2.n5(var1);
      if (var3 != null && var3.getCount() > 0) {
         MathPortion var4 = new MathPortion();
         MathParagraph var5 = (MathParagraph)var4.getMathParagraph();
         var5.add(var3);
         var4.l6().l6(this.c8.n5);
         IParagraph var6 = this.t2.get_Item(this.t2.getCount() - 1);
         var6.getPortions().add(var4);
      }
   }

   final void n5(IParagraphFormat var1) {
      Paragraph var2 = new Paragraph((ParagraphFormat)var1);
      if (this.y4) {
         var2.getParagraphFormat().getDefaultPortionFormat().setFontHeight(a2s.n5[2]);
      }

      this.t2.add(var2);
   }

   private void n5(PortionFormat var1) {
      if (var1 == null) {
         throw new ArgumentNullException("portionFormat");
      }

      if (this.e2 != null && this.e2.n5().size() != 0) {
         if (this.u3.size() != 0) {
            n6h$l6 var2 = this.u3.get_Item(this.u3.size() - 1);
            if (var2 != null) {
               if (var2.l6.containsKey("class")) {
                  this.n5(var1, var2.l6.get_Item("class"));
               }
            }
         }
      }
   }

   private void l6(PortionFormat var1) {
      if (var1 == null) {
         throw new ArgumentNullException("portionFormat");
      }

      if (this.t9 != null && this.t9.l6().length != 0) {
         for (l3a var5 : this.t9.l6()) {
            this.n5(var1, var5);
         }
      }
   }

   private void n5(PortionFormat var1, String var2) {
      if (!com.aspose.slides.ms.System.d1.n5(var2)) {
         String var3 = com.aspose.slides.ms.System.d1.n5(".{0}", new Object[]{var2});
         if (this.e2.n5().containsKey(var3)) {
            for (l3a var7 : this.e2.n5().get_Item(var3)) {
               this.n5(var1, var7);
            }
         }
      }
   }

   private void n5(PortionFormat var1, l3a var2) {
      if (!com.aspose.slides.ms.System.d1.n5(var2.l6())) {
         switch (z1.n5(var2.n5())) {
            case 0:
               var1.setFontHeight(a6(var2.l6()));
               break;
            case 1:
               float var6 = 0.0F;
               float[] var4 = new float[]{0.0F};
               boolean var5 = com.aspose.slides.ms.System.n1.n5(var2.l6(), 511, com.aspose.slides.internal.x7n.l6.k5(), var4);
               var6 = var4[0];
               if (var5) {
                  var6 *= -var1.getEffective().getFontHeight();
               } else {
                  var6 = u9(var2.l6());
               }

               this.c8.l6.setSpaceWithin(var6);
               break;
            case 2:
               if (var1.getLatinFont() == null && var1.getEastAsianFont() == null && var1.getComplexScriptFont() == null) {
                  FontData var3 = new FontData(a2s.n5(var2.l6()));
                  var1.setLatinFont(var3);
                  var1.setEastAsianFont(var3);
                  var1.setComplexScriptFont(var3);
               }
               break;
            case 3:
               n5(var2.l6(), var1.getFillFormat().getSolidFillColor());
               if (var1.getFillFormat().getSolidFillColor().getColorType() != -1) {
                  var1.getFillFormat().setFillType((byte)1);
               }
         }
      }
   }

   static void n5(String var0, IColorFormat var1) {
      com.aspose.slides.internal.n8e.u5 var2 = new com.aspose.slides.internal.n8e.u5(var0);
      var2.n5(var1);
   }

   @Override
   void n5(String var1, IGenericDictionary<String, String> var2) {
      if (var2 == null) {
         var2 = new Dictionary();
      }

      this.k5.addItem(this.c8);
      this.u3.addItem(new n6h$l6(var1, var2));
      this.a6.addItem(null);
      this.c8 = new x3s$n5(this.c8);
      PortionFormat var3 = new PortionFormat();
      n6h$n5 var4 = this.n3.n5(this.u3, this.a6);
      a2s.n5(var4, var3, "td".equals(var1) || "th".equals(var1));
      this.c8.n5.l6(var3);
      switch (z1.n5(var1)) {
         case 4:
         case 5:
            this.c8.n5.setFontItalic((byte)1);
            break;
         case 6:
         case 7:
            this.c8.n5.setFontBold((byte)1);
            break;
         case 8:
            this.c8.n5.setFontUnderline((byte)2);
            break;
         case 9:
            String var18 = null;
            String[] var23 = new String[]{var18};
            boolean var24 = var2.tryGetValue("size", var23);
            var18 = var23[0];
            if (var24) {
               this.c8.n5.setFontHeight(a6(var18));
            }

            var23[0] = var18;
            var2.tryGetValue("face", var23);
            var18 = var23[0];
            if (!com.aspose.slides.ms.System.d1.n5(var18)) {
               FontData var27 = new FontData(var18);
               this.c8.n5.setLatinFont(var27);
               this.c8.n5.setEastAsianFont(var27);
               this.c8.n5.setComplexScriptFont(var27);
            }

            var23[0] = var18;
            var2.tryGetValue("color", var23);
            var18 = var23[0];
            if (!com.aspose.slides.ms.System.d1.n5(var18)) {
               n5(var18, this.c8.n5.getFillFormat().getSolidFillColor());
               if (this.c8.n5.getFillFormat().getSolidFillColor().getColorType() != -1) {
                  this.c8.n5.getFillFormat().setFillType((byte)1);
               }
            }
            break;
         case 10:
            String var16 = null;
            String[] var22 = new String[]{var16};
            var2.tryGetValue("href", var22);
            var16 = var22[0];
            if (!com.aspose.slides.ms.System.d1.n5(var16)) {
               this.c8.n5.setHyperlinkClick(new Hyperlink(var16));
            }
            break;
         case 11:
            this.n5();
            break;
         case 12:
         case 13:
            this.c8.n5.setStrikethroughType((byte)1);
            break;
         case 14:
            this.l6(var2, var4);
            this.n5(var4, var2, Float.NaN, Float.NaN);
            this.c8.l6.setDepth((short)(this.c8.l6.getDepth() + 1));
            break;
         case 15:
            this.n5(var2, var4);
            this.n5(var4, var2, Float.NaN, Float.NaN);
            this.c8.l6.setDepth((short)(this.c8.l6.getDepth() + 1));
            break;
         case 16:
            IFontData var5 = null;
            String[] var6 = a2s.n5(var4, "font-family");
            if (var6 != null && var6.length > 0) {
               var5 = new FontData(var6[0]);
               this.c8.n5.setLatinFont(var5);
               this.c8.n5.setEastAsianFont(var5);
               this.c8.n5.setComplexScriptFont(var5);
            }

            if (com.aspose.slides.ms.System.d1.a6(var4.n5("mso-spacerun"), "yes", (short)3) == 0) {
               this.c8.u9 = true;
            }

            String var7 = var4.n5("mso-special-format");
            if (var7 != null) {
               BulletFormat var25 = ((ParagraphFormat)this.t2.get_Item(this.t2.getCount() - 1).getParagraphFormat()).l6();
               if (com.aspose.slides.ms.System.d1.a6(var7, "bullet", (short)3) == 0) {
                  this.c8.a6 = true;
                  var25.setType((byte)1);
               } else if (com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.u9(var7), "\"numbullet")
                  || com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.u9(var7), "'numbullet")) {
                  this.c8.u3 = true;
                  int var29 = "\"numbullet".length();
                  com.aspose.slides.internal.n8e.u5 var32 = new com.aspose.slides.internal.n8e.u5(var7, var29, var7.length() - 1 - var29);
                  int var36 = var32.l6(-1);
                  var32.t2();
                  if (var32.s7() == '\\') {
                     var32.c8();
                  }

                  var32.c8();
                  int var41 = var32.l6(-1);
                  if (var36 >= 0 && var41 >= 0) {
                     var25.setType((byte)2);
                     var25.setNumberedBulletStyle((byte)var36);
                     var25.setNumberedBulletStartWith((short)var41);
                  }
               }

               if (var25.t2()) {
                  if (this.c8.n5.getLatinFont() != null) {
                     var25.setBulletHardFont((byte)1);
                     var25.setFont(this.c8.n5.getLatinFont());
                  }

                  String var30 = var4.n5("color");
                  if (!com.aspose.slides.ms.System.d1.n5(var30)) {
                     n5(var30, var25.getColor());
                     if (var25.getColor().getColorType() != -1) {
                        var25.setBulletHardColor((byte)1);
                     }
                  }

                  String var33 = var4.n5("font-size");
                  if (!com.aspose.slides.ms.System.d1.n5(var33)) {
                     var25.setHeight(a6(var33));
                     this.c8.n5.setFontHeight(var25.getHeight());
                  }

                  IParagraph var37 = this.t2.get_Item(this.t2.getCount() - 1);
                  if (!com.aspose.slides.ms.System.n1.k5(var37.getParagraphFormat().getIndent())
                     && !com.aspose.slides.ms.System.n1.k5(var37.getParagraphFormat().getMarginLeft())) {
                     var37.getParagraphFormat().setMarginLeft(var37.getParagraphFormat().getMarginLeft() + var37.getParagraphFormat().getIndent());
                     var37.getParagraphFormat().setIndent(Float.NaN);
                  }
               }
            } else if (var4.l6("mso-tab-count")) {
               String var26 = var4.n5("mso-tab-count");
               int var31 = new com.aspose.slides.internal.n8e.u5(var26).l6(-1);
               if (var31 > 0) {
                  this.n5(com.aspose.slides.ms.System.d1.n5('\t', var31));
               }

               this.c8.u3 = true;
            }
            break;
         case 17:
            String var8 = var4.n5("background");
            if (!com.aspose.slides.ms.System.d1.n5(var8)) {
               n5(var8, this.t2.getSlide().getBackground().getFillFormat().getSolidFillColor());
               if (this.t2.getSlide().getBackground().getFillFormat().getSolidFillColor().getColorType() != -1) {
                  this.t2.getSlide().getBackground().getFillFormat().setFillType((byte)1);
                  this.t2.getSlide().getBackground().setType((byte)1);
               }
            }
            break;
         case 18:
            this.n5(var4, var2, Float.NaN, Float.NaN);
            break;
         case 19:
            this.n5(var4, var2, Float.NaN, Float.NaN);
            break;
         case 20:
            this.n5(var4, var2, 1.0F, 1.0F);
            break;
         case 21:
            this.c8.n5.setFontHeight(a2s.n5[5]);
            this.n5(var4, var2, 0.67F, 0.67F);
            break;
         case 22:
            this.c8.n5.setFontHeight(a2s.n5[4]);
            this.n5(var4, var2, 0.83F, 0.83F);
            break;
         case 23:
            this.c8.n5.setFontHeight(a2s.n5[3]);
            this.n5(var4, var2, 1.0F, 1.0F);
            break;
         case 24:
            this.c8.n5.setFontHeight(a2s.n5[2]);
            this.n5(var4, var2, 1.33F, 1.33F);
            break;
         case 25:
            this.c8.n5.setFontHeight(a2s.n5[1]);
            this.n5(var4, var2, 1.67F, 1.67F);
            break;
         case 26:
            this.c8.n5.setFontHeight(a2s.n5[0]);
            this.n5(var4, var2, 2.33F, 2.33F);
            break;
         case 27:
            this.n5(var4, var2, Float.NaN, Float.NaN);
            break;
         case 28:
            this.n5(var4, var2, Float.NaN, Float.NaN);
            break;
         case 29:
            this.n5(var4, var2, Float.NaN, Float.NaN);
            break;
         case 30:
            this.n5(var4, var2, Float.NaN, Float.NaN);
            break;
         case 31:
            this.n5(var4, var2, 1.0F, 1.0F);
            break;
         case 32:
            IParagraph var13 = this.t2.get_Item(this.t2.getCount() - 1);
            String var9 = null;
            String[] var10 = new String[]{var9};
            var2.tryGetValue("src", var10);
            var9 = var10[0];
            if (var13.getPortions().getCount() == 0 && !com.aspose.slides.ms.System.d1.n5(var9)) {
               com.aspose.slides.internal.z0k.t4 var35 = this.t2(var9);
               if (var35 != null) {
                  IPPImage var38 = ((ImageCollection)this.t2.getPresentation().getImages()).n5(var35);
                  ((BulletFormat)var13.getParagraphFormat().getBullet()).getPicture().setImage(var38);
                  var13.getParagraphFormat().getBullet().setType((byte)3);
               } else {
                  String var39 = null;
                  String[] var42 = new String[]{var39};
                  var2.tryGetValue("alt", var42);
                  var39 = var42[0];
                  if (!com.aspose.slides.ms.System.d1.n5(var39)) {
                     var13.getParagraphFormat().getBullet().setType((byte)1);
                     var13.getParagraphFormat().getBullet().setChar(var39.charAt(0));
                  }
               }
            } else {
               String var11 = null;
               String[] var12 = new String[]{var11};
               boolean var14 = var2.tryGetValue("alt", var12);
               var11 = var12[0];
               if (var14) {
                  this.n5(var11);
               }
            }
            break;
         case 33:
            this.c8.n5.setEscapement(-25.0F);
            this.c8.n5.setFontHeight(Float.NaN);
            break;
         case 34:
            this.c8.n5.setEscapement(30.0F);
            this.c8.n5.setFontHeight(Float.NaN);
            break;
         case 35:
            this.c8.n5.setFontItalic((byte)1);
      }
   }

   private void n5(n6h$n5 var1, IGenericDictionary<String, String> var2, float var3, float var4) {
      ParagraphFormat var5 = new ParagraphFormat(null);
      a2s.n5(
         var1, var5, 1024.0F, com.aspose.slides.ms.System.n1.k5(var3) ? Float.NaN : n5(var3), com.aspose.slides.ms.System.n1.k5(var4) ? Float.NaN : n5(var4)
      );
      String var6 = null;
      String[] var7 = new String[]{var6};
      var2.tryGetValue("class", var7);
      var6 = var7[0];
      if (!com.aspose.slides.ms.System.d1.n5(var6) && (var6.charAt(0) == 'O' || var6.charAt(0) == 'o')) {
         com.aspose.slides.internal.n8e.u5 var8 = new com.aspose.slides.internal.n8e.u5(var6, 1, var6.length() - 1);
         int var9 = var8.l6(-1);
         if (var9 > 0 && var9 < 8 && var8.h0() == 0) {
            var5.setDepth((short)var9);
         }
      }

      if (this.c8.l6.getBullet().getType() > 0 && this.c8.l6.getMarginLeft() > 0.0F) {
         if (var5.getMarginLeft() == 0.0F) {
            var5.setMarginLeft(this.c8.l6.getMarginLeft());
         } else {
            var5.setMarginLeft(var5.getMarginLeft() + (this.c8.l6.getMarginLeft() + this.c8.l6.getIndent()));
         }

         if (var5.getSpaceAfter() == 0.0F && this.t2.k5().getParentCell() != null && this.c8.l6.getSpaceAfter() != 0.0F) {
            var5.setSpaceAfter(Float.NaN);
         }
      }

      var5.k5((ParagraphFormat)this.c8.l6);
      this.c8.l6 = var5;
      this.c8.k5 = true;
      this.n5(this.c8.l6);
   }

   private static float n5(float var0) {
      return var0 * 10.0F * 3.5F * 1.25F;
   }

   static float a6(String var0) {
      if (!com.aspose.slides.ms.System.d1.n5(var0)) {
         com.aspose.slides.internal.n8e.u5 var1 = new com.aspose.slides.internal.n8e.u5(var0);
         var1.t2();
         if (var1.s7() != '-' && var1.s7() != '+') {
            return a2s.l6(var0);
         }

         float var2 = var1.n5(Float.NaN);
         if (!com.aspose.slides.ms.System.n1.k5(var2)) {
            return a2s.n5[com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.internal.n8e.v4.n5(com.aspose.slides.ms.System.q1.u3(var2), -2.0, 4.0), 14)
               + 2];
         }
      }

      return Float.NaN;
   }

   static float u9(String var0) {
      if (!com.aspose.slides.ms.System.d1.n5(var0)) {
         com.aspose.slides.internal.n8e.u5 var1 = new com.aspose.slides.internal.n8e.u5(var0);
         var1.t2();
         return var1.k5(Float.NaN);
      } else {
         return Float.NaN;
      }
   }

   private void n5() {
      IParagraph var1 = this.t2.get_Item(this.t2.getCount() - 1);
      if (var1.getPortions().getCount() > 0) {
         var1.getPortions()
            .get_Item(var1.getPortions().getCount() - 1)
            .setText(com.aspose.slides.ms.System.d1.n5(new String[]{var1.getPortions().get_Item(var1.getPortions().getCount() - 1).getText(), "\u000b"}));
      } else {
         var1.getPortions().add(new Portion("\u000b"));
      }
   }

   private void n5(IGenericDictionary<String, String> var1, n6h$n5 var2) {
      IShape var3 = com.aspose.slides.internal.v6g.k5.n5(this.t2.k5().k5(), IShape.class);
      boolean var4 = var3 != null && var3.getPlaceholder() != null;
      if (!var4) {
         this.l6();
         this.c8.l6.getBullet().setType((byte)2);
         short var5 = 0;
         String var6 = null;
         String[] var7 = new String[]{var6};
         var1.tryGetValue("start", var7);
         var6 = var7[0];
         short[] var8 = new short[]{0};
         boolean var9 = !com.aspose.slides.ms.System.f0.n5(var6, var8);
         var5 = var8[0];
         if (var9) {
            var5 = 1;
         }

         this.c8.l6.getBullet().setNumberedBulletStartWith(var5);
      }

      String var11 = null;
      String[] var14 = new String[]{var11};
      boolean var15 = !var1.tryGetValue("type", var14) && var2.l6("list-style-type");
      var11 = var14[0];
      if (var15) {
         var11 = var2.n5("list-style-type");
      }

      boolean var16 = com.aspose.slides.ms.System.d1.n5(var11);
      if (!var16) {
         switch (z1.n5(var11)) {
            case 4:
               this.c8.l6.getBullet().setNumberedBulletStyle((byte)6);
               break;
            case 10:
               this.c8.l6.getBullet().setNumberedBulletStyle((byte)0);
               break;
            case 36:
               this.c8.l6.getBullet().setNumberedBulletStyle((byte)3);
               break;
            case 37:
               this.c8.l6.getBullet().setNumberedBulletStyle((byte)1);
               break;
            case 38:
               this.c8.l6.getBullet().setNumberedBulletStyle((byte)7);
               break;
            default:
               var16 = true;
         }
      }

      if (var16 && !var4) {
         this.c8.l6.getBullet().setNumberedBulletStyle((byte)3);
      }

      this.c8.l6.getBullet().setBulletHardFont((byte)1);
      this.c8.l6.getBullet().setFont(new FontData("+mj-lt"));
   }

   private void l6(IGenericDictionary<String, String> var1, n6h$n5 var2) {
      IShape var3 = com.aspose.slides.internal.v6g.k5.n5(this.t2.k5().k5(), IShape.class);
      boolean var4 = var3 != null && var3.getPlaceholder() != null;
      if (!var4) {
         this.l6();
      }

      this.c8.l6.getBullet().setType((byte)1);
      String var5 = null;
      String[] var6 = new String[]{var5};
      boolean var7 = !var1.tryGetValue("type", var6) && var2.l6("list-style-type");
      var5 = var6[0];
      if (var7) {
         var5 = var2.n5("list-style-type");
      }

      boolean var8 = com.aspose.slides.ms.System.d1.n5(var5);
      if (!var8) {
         var8 = !this.h0(var5);
      }

      if (this.k5(var1, var2)) {
         var8 = false;
      }

      if (var8 && !var4) {
         int var9 = this.c8.l6.getDepth();
         if (var9 >= l6.length) {
            var9 = l6.length - 1;
         }

         this.c8.l6.getBullet().setChar(l6[var9]);
      }
   }

   private void l6() {
      if (this.y4) {
         IParagraphFormat var1 = this.t2.getSlide().getPresentation().getMasters().get_Item(0).getBodyStyle().getLevel(this.c8.l6.getDepth());
         this.c8.l6.setIndent(var1.getIndent());
         this.c8.l6.setMarginLeft(var1.getMarginLeft());
      } else {
         this.c8.l6.setIndent(-22.5F);
      }
   }

   private boolean h0(String var1) {
      this.c8.l6.getBullet().setBulletHardFont((byte)1);
      switch (z1.n5(var1)) {
         case 39:
         case 40:
            FontData var4 = new FontData("Arial", (byte)0, (byte)34);
            this.c8.l6.getBullet().setFont(var4);
            this.c8.l6.getBullet().setChar('•');
            break;
         case 41:
            FontData var3 = new FontData("Courier New", (byte)0, (byte)49);
            this.c8.l6.getBullet().setFont(var3);
            this.c8.l6.getBullet().setChar('o');
            break;
         case 42:
            FontData var2 = new FontData("Wingdings", (byte)2, (byte)2);
            this.c8.l6.getBullet().setFont(var2);
            this.c8.l6.getBullet().setChar('§');
            break;
         default:
            return false;
      }

      return true;
   }

   private boolean k5(IGenericDictionary<String, String> var1, n6h$n5 var2) {
      String var3 = null;
      String[] var4 = new String[]{var3};
      var1.tryGetValue("style", var4);
      var3 = var4[0];
      if (com.aspose.slides.ms.System.d1.n5(var3)) {
         return false;
      }

      com.aspose.slides.internal.n8e.u5 var5 = new com.aspose.slides.internal.n8e.u5(var3);
      String var6 = var5.l6();
      switch (z1.n5(var6)) {
         case 43:
            String var7 = var2.n5("list-style-image");
            if (!com.aspose.slides.ms.System.d1.n5(var7) && com.aspose.slides.ms.System.d1.l6(var7, "url")) {
               String var8 = com.aspose.slides.ms.System.d1.l6(var7, 4, var7.length() - 5);
               IPPImage var9 = this.c8(var8);
               if (var9 != null) {
                  this.c8.l6.getBullet().setType((byte)3);
                  ((BulletFormat)this.c8.l6.getBullet()).getPicture().setImage(this.c8(var8));
                  return true;
               }
            }

            return false;
         default:
            return false;
      }
   }

   private IPPImage c8(String var1) {
      com.aspose.slides.internal.z0k.t4 var2 = this.t2(var1);
      return var2 != null ? ((ImageCollection)this.t2.getPresentation().getImages()).n5(var2) : null;
   }

   private com.aspose.slides.internal.z0k.t4 t2(String var1) {
      String var2 = this.h0.n5(this.s7, var1);
      return var2 != null ? this.h0.n5(var2) : null;
   }

   @Override
   void l6(String var1) {
      x3s$n5 var2 = this.c8;
      int var3 = this.k5.size() - 1;
      this.c8 = this.k5.get_Item(var3);
      this.k5.removeAt(var3);
      if (var2.k5) {
         this.n5(this.c8.l6);
      }

      n6h$l6 var4 = this.u3.get_Item(var3);
      this.u3.removeAt(var3);
      if (var3 == this.a6.size()) {
         this.a6.removeAt(var3 + 1);
      }

      List var5 = this.a6.get_Item(var3);
      if (var5 == null) {
         List var6 = new List();
         var5 = var6;
         this.a6.set_Item(var3, var6);
      }

      var5.addItem(var4);
      if (this.u3.size() == 0) {
         while (this.u9 < this.t2.getCount()) {
            Paragraph var19 = (Paragraph)this.t2.get_Item(this.u9);
            String var7 = com.aspose.slides.ms.System.d1.k5(var19.u3(),new char[]{ ' '});
            if ("".equals(var7) || " ".equals(var7)) {
               boolean var8 = false;
               IGenericEnumerator var9 = var19.getPortions().iterator();

               try {
                  while (var9.hasNext()) {
                     IPortion var10 = (IPortion)var9.next();
                     if (com.aspose.slides.internal.v6g.k5.l6(var10, MathPortion.class)) {
                        var8 = true;
                        break;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                     var9.dispose();
                  }
               }

               if (!var8) {
                  this.t2.removeAt(this.u9);
                  continue;
               }
            } else if ("\u000b".equals(var7)) {
               var19.setText("");
               var19.n5(true);
            }

            this.u9++;
         }

         List$Enumerator var20 = this.x8.iterator();

         try {
            while (var20.hasNext()) {
               Portion var21 = (Portion)var20.next();
               var21.setText(com.aspose.slides.ms.System.d1.n5(var21.getText(), ' ', ' '));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
               var20.dispose();
            }
         }

         this.x8.clear();
      }
   }

   @Override
   void n5(String var1, String var2) {
      if ("style".equals(var1)) {
         this.x8(var2);
      }
   }

   @Override
   void l6(String var1, String var2) {
      if ("style".equals(var2)) {
         this.s7(var1);
      }
   }

   private void s7(String var1) {
      try {
         this.e2 = new c0h(w3o.n5(var1));
      } catch (RuntimeException var3) {
      }
   }

   private void x8(String var1) {
      try {
         this.t9 = w3o.l6(var1);
      } catch (RuntimeException var3) {
      }
   }
}
