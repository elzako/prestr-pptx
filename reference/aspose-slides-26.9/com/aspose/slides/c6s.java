package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class c6s {
   public static String n5(ITextFrameFormatEffectiveData var0) {
      String var1 = "";
      if (var0.getColumnCount() > 1) {
         float var2 = var0.getColumnSpacing();
         var1 = com.aspose.slides.ms.System.d1.n5(
            "column-count: {0}; column-gap: {1}px;",new Object[]{ var0.getColumnCount(), com.aspose.slides.ms.System.d2.k5(var2) ? 0.0F : var2
         });
      }

      return var1;
   }

   public static String n5(byte var0) {
      switch (var0) {
         case 0:
            return "vertical-align: top;";
         case 2:
            return "vertical-align: bottom;";
         default:
            return "vertical-align: center;";
      }
   }

   public static String n5(TextFrame var0, AutoShape var1) {
      ITextFrameFormatEffectiveData var2 = var0.getTextFrameFormat().getEffective();
      float var3 = 0.0F;
      IGenericEnumerator var4 = var0.getParagraphs().iterator();

      try {
         while (var4.hasNext()) {
            IParagraph var5 = (IParagraph)var4.next();
            var3 += ((Paragraph)var5).l6().k5();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      boolean var20 = var2.getTextVerticalType() == 1 || var2.getTextVerticalType() == 3 || var2.getTextVerticalType() == 2;
      double var7 = 0.0;
      double var9 = 0.0;
      String var11 = "";
      String var12 = "";
      String var13 = "";
      if (!var20) {
         if (o6c.l6(var1)) {
            com.aspose.slides.internal.o9b.y1 var14 = var1.t4().n5(d2k.k5.u3(), new d2k(var1.getWidth(), var1.getHeight())).y4();
            double var15 = var14.s7();
            if (var2.getAnchoringType() == 1) {
               var12 = com.aspose.slides.ms.System.d1.n5(
                  "height: {0}px; display: flex; flex-direction: column; justify-content: center;",
                  new Object[]{com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)var1.getHeight()), 14)}
               );
            }

            var9 = var14.a6() + var2.getMarginLeft();
            var11 = com.aspose.slides.ms.System.d1.n5(
               "width: {0}px;", new Object[]{com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6(var15), 14)}
            );
         }

         switch (var2.getAnchoringType()) {
            case 1:
               var7 = (var1.getHeight() - var3 - var2.getMarginTop() - var2.getMarginBottom()) / 2.0;
               break;
            case 2:
               var7 = var1.getHeight() - var3 - var2.getMarginTop() - var2.getMarginBottom();
         }

         if (!com.aspose.slides.ms.System.d1.n5(var12)) {
            var7 = 0.0;
         }
      } else {
         if (var2.getTextVerticalType() == 3) {
            var13 = "width: 1px; word-wrap: break-word; white-space: pre-wrap;";
         } else {
            var13 = "writing-mode: vertical-rl;";
         }

         if (var2.getAnchoringType() == 0 && (var2.getTextVerticalType() == 1 || var2.getTextVerticalType() == 3)
            || var2.getAnchoringType() == 2 && var2.getTextVerticalType() == 2) {
            var9 = var1.getWidth() - var3 - var2.getMarginLeft() - var2.getMarginRight();
         }

         if (var2.getAnchoringType() == 1) {
            if (var2.getTextVerticalType() != 0 && var0.getParagraphs().getCount() != 1) {
               var9 = var1.getWidth() - var3 - var2.getMarginLeft() - var2.getMarginRight();
            } else {
               var9 = (var1.getWidth() - var3 - var2.getMarginLeft() - var2.getMarginRight()) / 2.0;
            }
         }

         if (var2.getTextVerticalType() == 2) {
            var13 = com.aspose.slides.ms.System.d1.n5(var13, "transform: rotate(180deg);");
         }
      }

      String var21 = com.aspose.slides.ms.System.d1.n5("padding-top: {0}px;", new Object[]{com.aspose.slides.internal.v6g.k5.u3(var7, 14)});
      String var17 = com.aspose.slides.ms.System.d1.n5("padding-left: {0}px;", new Object[]{com.aspose.slides.internal.v6g.k5.u3(var9, 14)});
      return com.aspose.slides.ms.System.d1.n5(" ", new String[]{var21, var17, var11, var12, var13});
   }

   public static String n5(int var0) {
      switch (var0) {
         case 1:
         case 3:
         case 4:
         case 5:
            return "text-align: center;";
         case 2:
            return "text-align: right;";
         default:
            return "text-align: left;";
      }
   }

   public static String n5(IParagraphFormatEffectiveData var0, float var1) {
      String var2 = "";
      if (var0.getSpaceWithin() < 0.0F) {
         var2 = com.aspose.slides.ms.System.d1.n5("line-height: {0}px;", new Object[]{-com.aspose.slides.internal.v6g.k5.u3(var0.getSpaceWithin(), 13)});
      } else {
         var2 = com.aspose.slides.ms.System.d1.n5(
            "line-height: {0}px;", new Object[]{com.aspose.slides.internal.v6g.k5.u3(1.1428572F * var1 * var0.getSpaceWithin() / 100.0F, 13)}
         );
      }

      return var2;
   }

   public static <T> String n5(IPortionFormatEffectiveData var0, ITextFrameFormatEffectiveData var1, boolean var2, TemplateContext<T> var3, boolean var4) {
      boolean var5 = false;
      float var6 = var0.getFontHeight();
      String var7 = var4 ? "font-variant-ligatures : none;" : "";
      String var8 = o8n.n5(var0.getFillFormat(), var3);
      TemplateContext var9 = com.aspose.slides.internal.v6g.k5.n5(var3, TemplateContext.class);
      if (var9 != null && ((Portion)var9.getObject()).getPortionFormat().getHyperlinkClick() != null) {
         var5 = true;
         TextFrame var10 = var3.getLocal().get("parentTextFrame");
         String var11 = e2o.n5(((ColorFormat)var10.getPresentation().getMasterTheme().getColorScheme().getHyperlink()).u3().o8());
         if (((Portion)var9.getObject()).getPortionFormat().getHyperlinkClick().getColorSource() == 0) {
            var8 = com.aspose.slides.ms.System.d1.n5("background-color: {0}; ", new Object[]{var11});
         }

         var8 = com.aspose.slides.ms.System.d1.n5(var8, com.aspose.slides.ms.System.d1.n5("text-decoration: underline solid {0}; ", new Object[]{var11}));
      }

      if (com.aspose.slides.ms.System.d1.l6(var8, "background-color: ")) {
         var8 = com.aspose.slides.ms.System.d1.n5(var8, "background-color: ", "color: ");
      } else {
         var8 = com.aspose.slides.ms.System.d1.n5(var8, " -webkit-text-fill-color: transparent; -webkit-background-clip: text;");
      }

      String var25 = "";
      if (var0.getEscapement() != 0.0F) {
         var25 = com.aspose.slides.ms.System.d1.n5("position: relative; top: {0}px;", new Object[]{f7i.n5(-var6 * var0.getEscapement() / 100.0F)});
         var6 *= 0.67F;
      }

      String var26 = "";
      if (var0.getStrikethroughType() != 0) {
         String var12 = "";
         switch (var0.getStrikethroughType()) {
            case 2:
               var12 = "double";
               break;
            default:
               var12 = "solid";
         }

         var26 = com.aspose.slides.ms.System.d1.n5("text-decoration: line-through {0};", new Object[]{var12});
      }

      if (var0.getFontUnderline() != 0 && !var5) {
         String var28 = "";
         switch (var0.getFontUnderline()) {
            case 3:
               var28 = "double";
               break;
            case 4:
            default:
               var28 = "solid";
               break;
            case 5:
            case 6:
               var28 = "dotted";
               break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
               var28 = "dashed";
               break;
            case 15:
            case 16:
            case 17:
               var28 = "wavy";
         }

         var26 = com.aspose.slides.ms.System.d1.n5("text-decoration: underline {0} {1};",new Object[]{ var28, e2o.n5(((f6a)var0.getUnderlineFillFormat()).h0().o8())});
      }

      TemplateContext var30 = com.aspose.slides.internal.v6g.k5.n5(var3, TemplateContext.class);
      String var13 = n5(var0, var1, var2, var30 != null ? (Portion)var30.getObject() : null, var3.getLocal().get("parentTextFrame"));
      String var14 = "";
      if (var0.getLineFormat().getFillFormat().getFillType() == 1) {
         var14 = com.aspose.slides.ms.System.d1.n5(
            "-webkit-text-stroke: {0}px {1};",new Object[]{ var0.getLineFormat().getWidth(), e2o.n5(((z1a)var0.getLineFormat().getFillFormat()).u3().o8())
         });
      } else if (var0.getLineFormat().getFillFormat().getFillType() == 2) {
         var14 = "";
      }

      String var15 = "";
      if (var0.getSpacing() != 0.0F) {
         var15 = com.aspose.slides.ms.System.d1.n5("letter-spacing: {0}px;", new Object[]{f7i.n5(var0.getSpacing())});
      }

      String var16 = n5(var0);
      String var17 = com.aspose.slides.ms.System.d1.n5("font-family: '{0}';", new Object[]{y4p.n5(var0, var3)});
      String var18 = com.aspose.slides.ms.System.d1.n5("font-size: {0}px;", new Object[]{f7i.n5(var6)});
      String var19 = "";
      if (var0.getTextCapType() == 2) {
         var19 = "text-transform: uppercase;";
      } else if (var0.getTextCapType() == 1) {
         var19 = "font-variant: small-caps;";
      }

      String var20 = "white-space: pre-wrap;";
      String var21 = "";
      if (var3.getLocal().containsKey("paragraph")) {
         Paragraph var22 = var3.getLocal().get("paragraph");
         IParagraphFormatEffectiveData var23 = var22.getParagraphFormat().getEffective();
         var21 = n5(var23, var6);
      }

      String var31 = null;
      if (!((c9g)var0).u9().t2()) {
         var31 = com.aspose.slides.ms.System.d1.n5(
            var31, com.aspose.slides.ms.System.d1.n5("background-color: {0};", new Object[]{e2o.n5(((c9g)var0).u9().o8())})
         );
      }

      return com.aspose.slides.ms.System.d1.n5(
         " ", new String[]{var16, var17, var18, var8, var25, var26, var13, var14, var15, var19, var20, var31, var21, var7}
      );
   }

   private static String n5(IPortionFormatEffectiveData var0, ITextFrameFormatEffectiveData var1, boolean var2, Portion var3, TextFrame var4) {
      float var5 = (var1.getTextVerticalType() != 1 && var1.getTextVerticalType() != 2 ? 1 : -1) * (var2 ? 0.5F : 1.0F);
      List var6 = new List();
      if (var0.getEffectFormat().getOuterShadowEffect() != null) {
         var6.addItem(
            com.aspose.slides.ms.System.d1.n5(
               " {0}px {1}px {2}px {3}",new Object[]{
               f7i.n5(
                  var5
                     * var0.getEffectFormat().getOuterShadowEffect().getDistance()
                     * com.aspose.slides.ms.System.q1.c8((Math.PI / 180.0) * var0.getEffectFormat().getOuterShadowEffect().getDirection())
               ),
               f7i.n5(
                  var5
                     * var0.getEffectFormat().getOuterShadowEffect().getDistance()
                     * com.aspose.slides.ms.System.q1.h0((Math.PI / 180.0) * var0.getEffectFormat().getOuterShadowEffect().getDirection())
               ),
               f7i.n5(var0.getEffectFormat().getOuterShadowEffect().getBlurRadius()),
               e2o.n5(((k0p)var0.getEffectFormat().getOuterShadowEffect()).l6().o8())
            })
         );
      }

      IShape var7 = var4.getParentShape();
      if (var7 != null) {
         IOuterShadow var8 = var7.getEffectFormat().getOuterShadowEffect();
         if (var8 != null) {
            double var9 = com.aspose.slides.ms.System.q1.c8((Math.PI * 2) * var8.getDirection() / 360.0) * var8.getDistance();
            double var11 = com.aspose.slides.ms.System.q1.h0((Math.PI * 2) * var8.getDirection() / 360.0) * var8.getDistance();
            double var13 = var8.getBlurRadius();
            byte var15 = 0;
            String var16 = e2o.n5(((ColorFormat)var8.getShadowColor()).u3().o8());
            if (var7.getFillFormat().getFillType() == 0) {
               var6.addItem(
                  com.aspose.slides.ms.System.d1.n5(
                     "{0}px {1}px {2}px {4}",new Object[]{ f7i.n5(var9, 1, true), f7i.n5(var11, 1, true), f7i.n5(var13, 1, true), Integer.valueOf(var15), var16
                  })
               );
            }
         }
      }

      return var6.size() > 0
         ? com.aspose.slides.ms.System.d1.n5("text-shadow: {0};", new Object[]{com.aspose.slides.ms.System.d1.n5(", ",(String[])( var6.toArray(new String[0])))})
         : "";
   }

   public static String n5(IParagraphFormatEffectiveData var0, TemplateContext<Paragraph> var1) {
      String var2 = n5(var0.getAlignment());
      float var3 = Float.MAX_VALUE;
      Paragraph var4 = (Paragraph)var1.getObject();
      IPortionCollection var5 = var4.getPortions();
      IGenericEnumerator var6 = var5.iterator();

      try {
         while (var6.hasNext()) {
            Portion var7 = (Portion)var6.next();
            float var8 = var7.getPortionFormat().getEffective().getFontHeight();
            if (var8 < var3) {
               var3 = var8;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      String var12 = "";
      if (var3 < Float.MAX_VALUE) {
         var12 = n5(var0, var3);
      }

      if (var5.getCount() < 2 && var0.getBullet().getType() == 0) {
         var12 = "";
      }

      return com.aspose.slides.ms.System.d1.n5(" ", new String[]{var2, var12});
   }

   public static <T> String n5(IParagraphFormatEffectiveData var0, ITextFrameFormatEffectiveData var1, boolean var2, TemplateContext<T> var3) {
      IPortionFormatEffectiveData var4 = com.aspose.slides.internal.v6g.k5.n5(var3.getObject(), Paragraph.class).getPortions().getCount() == 0
         ? null
         : com.aspose.slides.internal.v6g.k5.n5(var3.getObject(), Paragraph.class).getPortions().get_Item(0).getPortionFormat().getEffective();
      String var5 = n5(var4);
      String var6 = "";
      switch (var0.getBullet().getType()) {
         case 1:
         case 2:
            if (var0.getBullet().isBulletHardColor()) {
               var6 = com.aspose.slides.ms.System.d1.n5("color: {0};", new Object[]{e2o.n5(((f6a)var0.getBullet().getFillFormat()).h0().o8())});
            } else if (var4 != null) {
               var6 = o8n.n5(var4.getFillFormat(), var3);
               if (com.aspose.slides.ms.System.d1.l6(var6, "background-color: ")) {
                  var6 = com.aspose.slides.ms.System.d1.n5(var6, "background-color: ", "color: ");
               } else {
                  var6 = com.aspose.slides.ms.System.d1.n5(var6, " -webkit-text-fill-color: transparent; -webkit-background-clip: text;");
               }
            }
         case 3:
         default:
            IFontData var7 = var4 != null ? var4.getLatinFont() : null;
            if (var0.getBullet().isBulletHardFont() && var0.getBullet().getType() != 2) {
               var7 = var0.getBullet().getFont();
            }

            float var8 = (var1.getTextVerticalType() != 1 && var1.getTextVerticalType() != 2 ? 1 : -1) * (var2 ? 0.5F : 1.0F);
            String var9 = "";
            if (var4 != null && var4.getEffectFormat().getOuterShadowEffect() != null) {
               var9 = com.aspose.slides.ms.System.d1.n5(
                  "text-shadow: {0}px {1}px {2}px {3};",new Object[]{
                  f7i.n5(
                     var8
                        * var4.getEffectFormat().getOuterShadowEffect().getDistance()
                        * com.aspose.slides.ms.System.q1.c8((Math.PI / 180.0) * var4.getEffectFormat().getOuterShadowEffect().getDirection())
                  ),
                  f7i.n5(
                     var8
                        * var4.getEffectFormat().getOuterShadowEffect().getDistance()
                        * com.aspose.slides.ms.System.q1.h0((Math.PI / 180.0) * var4.getEffectFormat().getOuterShadowEffect().getDirection())
                  ),
                  f7i.n5(var4.getEffectFormat().getOuterShadowEffect().getBlurRadius()),
                  e2o.n5(((k0p)var4.getEffectFormat().getOuterShadowEffect()).l6().o8())
               });
            }

            String var10;
            if (var4 != null) {
               var10 = com.aspose.slides.ms.System.d1.n5(
                  "font-size: {0}px;", new Object[]{f7i.n5(var0.getBullet().getHeight() * var4.getFontHeight() / 100.0F)}
               );
            } else {
               var10 = "";
            }

            String var11 = com.aspose.slides.ms.System.d1.n5("font-family: '{0}';", new Object[]{var7});
            return com.aspose.slides.ms.System.d1.n5(" ", new String[]{var5, var6, var9, var10, var11});
      }
   }

   public static <T> String l6(IParagraphFormatEffectiveData var0, TemplateContext<T> var1) {
      return com.aspose.slides.ms.System.d1.n5("width: {0}px; height: {0}px;", new Object[]{k5(var0, var1)});
   }

   public static <T> float k5(IParagraphFormatEffectiveData var0, TemplateContext<T> var1) {
      float var2 = com.aspose.slides.internal.v6g.k5.n5(var1.getObject(), Paragraph.class).getPortions().getCount() == 0
         ? 0.0F
         : com.aspose.slides.internal.v6g.k5.n5(var1.getObject(), Paragraph.class).getPortions().get_Item(0).getPortionFormat().getEffective().getFontHeight();
      return var0.getBullet().getHeight() * var2 / 100.0F * 0.75F;
   }

   public static <T> double[] n5(IParagraphFormatEffectiveData var0, TextFrame var1, com.aspose.slides.internal.o9b.f2 var2, TemplateContext<T> var3) {
      Paragraph var4 = com.aspose.slides.internal.v6g.k5.n5(var3.getObject(), Paragraph.class);
      ITextFrameFormatEffectiveData var5 = var1.getTextFrameFormat().getEffective();
      float var6 = com.aspose.slides.internal.v6g.k5.n5(var3.getObject(), Paragraph.class).getPortions().getCount() == 0
         ? 0.0F
         : com.aspose.slides.internal.v6g.k5.n5(var3.getObject(), Paragraph.class).getPortions().get_Item(0).getPortionFormat().getEffective().getFontHeight();
      double[] var7 = new double[]{var0.getMarginLeft() + var5.getMarginLeft(), 0.0, var0.getMarginRight() + var5.getMarginRight(), 0.0};
      switch (var0.getAlignment()) {
         case 0:
            if (var5.getTextVerticalType() == 2) {
               var7[3] = var2.k5() - var4.l6().s7();
            } else if (var5.getTextVerticalType() == 3) {
               var7[1] = -(var2.k5() - var4.l6().s7());
            }
            break;
         case 1:
         case 3:
         case 4:
         case 5:
            if (var5.getTextVerticalType() == 1) {
               var7[1] += (var2.k5() - var4.l6().s7()) / 2.0F;
            } else if (var5.getTextVerticalType() == 3) {
               var7[1] = -((var2.k5() - var4.l6().s7()) / 2.0F);
            } else if (var5.getTextVerticalType() == 2) {
               var7[3] += (var2.k5() - var4.l6().s7()) / 2.0F;
            }
            break;
         case 2:
            if (var5.getTextVerticalType() == 1) {
               var7[1] += var2.k5() - var4.l6().s7();
            }
      }

      switch (var5.getAnchoringType()) {
         case 1:
         case 3:
         case 4:
            if (var5.getTextVerticalType() == 2) {
               var7[2] = (var2.l6() - var4.l6().k5()) / 2.0F;
            }
            break;
         case 2:
            if (var5.getTextVerticalType() == 2) {
               var7[2] = var2.l6() - var4.l6().k5();
            }
      }

      if ((var5.getTextVerticalType() == 1 || var5.getTextVerticalType() == 2) && var1.getParagraphs().getCount() > 1) {
         var7[0] = 0.0;
         var7[2] = 0.0;
      }

      if (var5.getTextVerticalType() == 0) {
         double var8 = 0.0;
         if (var6 > 25.0F) {
            var8 = -var6 / 10.0F;
         }

         var7[1] = var8;
         var7[3] = var8;
      }

      return var7;
   }

   private static String n5(IPortionFormatEffectiveData var0) {
      String var1 = var0 != null && var0.getFontBold() ? "font-weight: bold;" : "";
      String var2 = var0 != null && var0.getFontItalic() ? "font-style: italic;" : "";
      return com.aspose.slides.ms.System.d1.n5(" ", new String[]{var1, var2});
   }

   public static String n5(String var0) {
      return com.aspose.slides.internal.r7c.c8.n5(var0, "span>\\s+<span", "span><span");
   }
}
