package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

final class i4u {
   private IMasterTheme n5;
   private m0l l6;
   private final x1u k5;
   private static final Dictionary<String, Integer> u3 = new Dictionary<>();
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "b", "i", "color", "scheme", "patternFill", "gradientFill", "name", "rFont", "charset", "strike", "sz", "u", "vertAlign"
   );

   i4u(ChartDataWorkbook var1, IPresentation var2) {
      this.k5 = var1.u9();
      w7m var3 = var1.h0();
      b8o var4 = var3.m1().find(new i4u$1(this));
      if (var4 != null) {
         h0o var5 = var3.z3().n5(var4.k5());
         this.n5 = this.n5(var5, var2);
         this.l6 = new m0l();
      }
   }

   final void n5(Cell var1, ChartDataCell var2) {
      t3u var3 = var2.c8();
      this.n5(var1.x8().getFillFormat(), var3);
      this.n5(var1, var2, var3);
      this.n5(var1, var3);
   }

   final void n5(Table var1, l4a var2) {
      String var3 = var2.u9().w1().n5();
      if (!com.aspose.slides.ms.System.d1.n5(var3)) {
         int var4 = 0;
         Integer[] var5 = new Integer[]{var4};
         boolean var6 = u3.tryGetValue(var3, var5);
         var4 = var5[0];
         if (var6) {
            var1.setStylePreset(var4);
            this.n5(var1);
         } else {
            com.aspose.slides.internal.k4y.l2h var7 = null;

            for (com.aspose.slides.internal.k4y.l2h var11 : this.k5.h0().n5()) {
               if (com.aspose.slides.ms.System.d1.a6(var11.n5(), var3)) {
                  var7 = var11;
                  break;
               }
            }

            if (var7 != null) {
               var1.setStylePreset(-1);
               z2x var16 = var1.u9();

               for (com.aspose.slides.internal.k4y.z2v var12 : var7.l6()) {
                  x6q var13;
                  c7e var14;
                  switch (var12.n5()) {
                     case 1:
                        var13 = var16.k5();
                        var14 = var16.z1();
                        break;
                     case 2:
                        var13 = var16.y4();
                        var14 = var16.r4();
                        break;
                     case 3:
                        var13 = var16.s7();
                        var14 = var16.z8();
                        break;
                     case 4:
                        var13 = var16.t2();
                        var14 = var16.m3();
                        break;
                     case 5:
                        var13 = var16.c8();
                        var14 = var16.k7();
                        break;
                     case 6:
                        var13 = var16.u3();
                        var14 = var16.t4();
                        break;
                     case 7:
                        var13 = var16.a6();
                        var14 = var16.q0();
                        break;
                     case 8:
                        var13 = var16.u9();
                        var14 = var16.z3();
                        break;
                     case 9:
                        var13 = var16.h0();
                        var14 = var16.m1();
                        break;
                     case 10:
                        var13 = var16.t9();
                        var14 = var16.y2();
                        break;
                     case 11:
                        var13 = var16.e2();
                        var14 = var16.c4();
                        break;
                     case 12:
                        var13 = var16.n3();
                        var14 = var16.w1();
                        break;
                     case 13:
                        var13 = var16.x8();
                        var14 = var16.j5();
                        break;
                     default:
                        continue;
                  }

                  this.n5(var13, var14, var12);
               }

               this.n5(var1);
            }
         }
      }
   }

   private void n5(x6q var1, c7e var2, com.aspose.slides.internal.k4y.z2v var3) {
      com.aspose.slides.internal.k4y.m1k[] var4 = this.k5.u9().n5();
      if (var4 != null && var4.length > (var3.l6() & 4294967295L)) {
         com.aspose.slides.internal.k4y.m1k var5 = var4[(int)var3.l6()];
         com.aspose.slides.internal.k4y.w0l var6 = var5.n5();
         if (var6 != null) {
            var2.u3((byte)1);
            List$Enumerator var7 = var6.n5().iterator();

            try {
               while (var7.hasNext()) {
                  com.aspose.slides.internal.k4y.g7 var8 = (com.aspose.slides.internal.k4y.g7)var7.next();
                  switch (a6.n5(var8.n5())) {
                     case 0:
                        com.aspose.slides.internal.k4y.w7c var9 = com.aspose.slides.internal.v6g.k5.n5(var8.l6(), com.aspose.slides.internal.k4y.w7c.class);
                        if (var9 != null && var9.n5()) {
                           var2.n5((byte)1);
                        }
                        break;
                     case 1:
                        com.aspose.slides.internal.k4y.w7c var10 = com.aspose.slides.internal.v6g.k5.n5(var8.l6(), com.aspose.slides.internal.k4y.w7c.class);
                        if (var10 != null && var10.n5()) {
                           var2.l6((byte)1);
                        }
                        break;
                     case 2:
                        com.aspose.slides.internal.k4y.v6p var11 = com.aspose.slides.internal.v6g.k5.n5(var8.l6(), com.aspose.slides.internal.k4y.v6p.class);
                        if (var11 != null) {
                           this.n5(var2.h0(), var11);
                        }
                        break;
                     case 3:
                        com.aspose.slides.internal.k4y.a8v var12 = com.aspose.slides.internal.v6g.k5.n5(var8.l6(), com.aspose.slides.internal.k4y.a8v.class);
                        if (var12 != null && this.n5 != null) {
                           switch (var12.n5()) {
                              case 2:
                                 var2.u3((byte)2);
                                 break;
                              case 3:
                                 var2.u3((byte)1);
                           }
                        }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                  var7.dispose();
               }
            }
         }

         com.aspose.slides.internal.k4y.c5y var16 = var5.l6();
         if (var16 != null) {
            var1.t2().n5((byte)1);
            this.n5(var1.t2().l6(), var5.l6());
         }

         com.aspose.slides.internal.k4y.p2b var17 = var5.k5();
         if (var17 != null) {
            if (var17.n5() != null) {
               var1.n5().n5((byte)1);
               this.n5(var1.n5().l6(), var17.n5());
            }

            if (var17.k5() != null) {
               var1.k5().n5((byte)1);
               this.n5(var1.k5().l6(), var17.k5());
            }

            if (var17.l6() != null) {
               var1.l6().n5((byte)1);
               this.n5(var1.l6().l6(), var17.l6());
            }

            if (var17.u3() != null) {
               var1.u3().n5((byte)1);
               this.n5(var1.u3().l6(), var17.u3());
            }
         }
      }
   }

   private void n5(Table var1) {
      IOverrideTheme var2 = null;
      IOverrideTheme var3 = null;
      IOverrideThemeManager var4 = null;
      if (this.n5 != null) {
         Slide var5 = com.aspose.slides.internal.v6g.k5.n5(var1.j9(), Slide.class);
         if (var5 != null) {
            var4 = var5.getThemeManager();
         }

         if (var4 != null) {
            if (var4.isOverrideThemeEnabled()) {
               var3 = var4.getOverrideTheme();
            }

            var4.setOverrideTheme(new OverrideTheme((BaseOverrideThemeManager)var4));
            var2 = var4.getOverrideTheme();
            var2.initColorSchemeFrom(this.n5.getColorScheme());
            var2.initFontSchemeFrom(this.n5.getFontScheme());
            var2.initFormatSchemeFrom(this.n5.getFormatScheme());
         }
      }

      IGenericEnumerator var39 = var1.getRows().iterator();

      try {
         while (var39.hasNext()) {
            Row var6 = (Row)var39.next();
            List$Enumerator var7 = var6.u3.iterator();

            try {
               while (var7.hasNext()) {
                  Cell var8 = (Cell)var7.next();
                  var8.x8().n5(var8.x8().getEffective());
                  c7e var9 = var8.n3().l6();
                  if (var9 != null && var9.c8()) {
                     IGenericEnumerator var10 = var8.getTextFrame().getParagraphs().iterator();

                     try {
                        while (var10.hasNext()) {
                           IParagraph var11 = (IParagraph)var10.next();
                           IGenericEnumerator var12 = var11.getPortions().iterator();

                           try {
                              while (var12.hasNext()) {
                                 IPortion var13 = (IPortion)var12.next();
                                 PortionFormat var14 = (PortionFormat)var13.getPortionFormat();
                                 if (!((ColorFormat)var9.h0()).n3()) {
                                    var14.a6().setFillType((byte)1);
                                    var14.a6().getSolidFillColor().copyFrom(var9.h0());
                                 }

                                 if (var9.n5() != -1) {
                                    var14.setFontBold(var9.n5());
                                 }

                                 if (var9.l6() != -1) {
                                    var14.setFontItalic(var9.l6());
                                 }
                              }
                           } finally {
                              if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
                                 var12.dispose();
                              }
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                           var10.dispose();
                        }
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                  var7.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var39, IDisposable.class)) {
            var39.dispose();
         }
      }

      if (var2 != null) {
         var2.clear();
      }

      if (var3 != null) {
         var4.setOverrideTheme(var3);
      }

      var1.setStylePreset(0);
   }

   private void n5(IFillFormat var1, t3u var2) {
      com.aspose.slides.internal.k4y.c5y[] var3 = this.k5.l6().n5();
      if (var2.x8() != 0 && var3 != null && var3.length > (var2.u9() & 4294967295L)) {
         this.n5(var1, var3[(int)var2.u9()]);
      }
   }

   private void n5(IFillFormat var1, com.aspose.slides.internal.k4y.c5y var2) {
      if (var2 != null) {
         switch (a6.n5(var2.n5().n5())) {
            case 4:
               com.aspose.slides.internal.k4y.o5z var3 = com.aspose.slides.internal.v6g.k5.n5(var2.n5().l6(), com.aspose.slides.internal.k4y.o5z.class);
               byte var4 = 0;
               switch (var3.n5()) {
                  case 1:
                     if (var1.getFillType() == -1) {
                        var1.setFillType((byte)0);
                     }
                     break;
                  case 2:
                  default:
                     var1.setFillType((byte)1);
                     this.n5(var1.getSolidFillColor(), var3.l6());
                     break;
                  case 3:
                     var4 = 7;
                     break;
                  case 4:
                     var4 = 10;
                     break;
                  case 5:
                     var4 = 4;
                     break;
                  case 6:
                     var4 = 13;
                     break;
                  case 7:
                     var4 = 14;
                     break;
                  case 8:
                     var4 = 52;
                     break;
                  case 9:
                     var4 = 53;
                     break;
                  case 10:
                     var4 = 17;
                     break;
                  case 11:
                     var4 = 54;
                     break;
                  case 12:
                     var4 = 19;
                     break;
                  case 13:
                     var4 = 20;
                     break;
                  case 14:
                     var4 = 21;
                     break;
                  case 15:
                     var4 = 22;
                     break;
                  case 16:
                     var4 = 51;
                     break;
                  case 17:
                     var4 = 54;
                     break;
                  case 18:
                     var4 = 3;
                     break;
                  case 19:
                     var4 = 2;
               }

               if (var4 > 0) {
                  var1.setFillType((byte)3);
                  var1.getPatternFormat().setPatternStyle(var4);
                  IColorFormat var13 = var1.getPatternFormat().getBackColor();
                  this.n5(var1.getPatternFormat().getForeColor(), var3.l6());
                  this.n5(var13, var3.k5());
                  if (var13.getColorType() != 0) {
                     ((ColorFormat)var13).n5(com.aspose.slides.internal.o9b.c8.w4().o8());
                  }
               }
               break;
            case 5:
               com.aspose.slides.internal.k4y.w9d var5 = com.aspose.slides.internal.v6g.k5.n5(var2.n5().l6(), com.aspose.slides.internal.k4y.w9d.class);
               IGradientFormat var6 = var1.getGradientFormat();
               switch (var5.n5()) {
                  case 1:
                     var6.setGradientShape((byte)0);
                     var6.setLinearGradientAngle((float)var5.l6());
                     break;
                  case 2:
                     var6.setGradientShape((byte)3);
               }

               if (var6.getGradientShape() > -1) {
                  var1.setFillType((byte)2);
                  com.aspose.slides.internal.k4y.n8c[] var7 = var5.k5();

                  for (com.aspose.slides.internal.k4y.n8c var11 : var7) {
                     ColorFormat var12 = new ColorFormat(null);
                     this.n5(var12, var11.l6());
                     ((GradientStopCollection)var6.getGradientStops()).n5((float)var11.n5(), var12.u3().o8());
                  }
               }
         }
      }
   }

   private void n5(Cell var1, t3u var2) {
      com.aspose.slides.internal.k4y.p2b[] var3 = this.k5.k5().n5();
      if (var2.n3() != 0 && var3 != null && var3.length > (var2.h0() & 4294967295L)) {
         Cell var4 = null;
         Cell var5 = null;
         int var6 = var1.getFirstColumnIndex() - 1;
         int var7 = var1.getFirstRowIndex() - 1;
         if (var6 >= 0) {
            var4 = var1.u9().n5(var6);
         }

         if (var7 >= 0) {
            var5 = var1.u3().n5(var7);
         }

         com.aspose.slides.internal.k4y.p2b var8 = var3[(int)var2.h0()];
         CellFormat var9 = var1.x8();
         this.n5(var9.getBorderLeft(), var8.n5());
         if (var4 != null && var9.getBorderLeft().getFillFormat().getFillType() == 0) {
            ((LineFormat)var9.getBorderLeft()).n5(var4.x8().getBorderRight());
         }

         this.n5(var9.getBorderTop(), var8.k5());
         if (var5 != null && var9.getBorderTop().getFillFormat().getFillType() == 0) {
            ((LineFormat)var9.getBorderTop()).n5(var5.x8().getBorderBottom());
         }

         this.n5(var9.getBorderRight(), var8.l6());
         this.n5(var9.getBorderBottom(), var8.u3());
      }
   }

   private void n5(ILineFormat var1, com.aspose.slides.internal.k4y.l6l var2) {
      if (var2 != null && var2.n5() != 0) {
         switch (var2.n5()) {
            case 1:
               if (var1.getFillFormat().getFillType() == -1) {
                  var1.getFillFormat().setFillType((byte)0);
               }

               return;
            case 2:
               var1.setWidth(0.5);
               break;
            case 3:
               var1.setWidth(1.0);
               break;
            case 4:
               var1.setDashStyle((byte)2);
               break;
            case 5:
            case 8:
               var1.setDashStyle((byte)1);
               break;
            case 6:
               var1.setWidth(1.5);
               break;
            case 7:
               var1.setStyle((byte)1);
               var1.setWidth(2.0);
               break;
            case 9:
               var1.setDashStyle((byte)2);
               var1.setWidth(1.0);
               break;
            case 10:
               var1.setDashStyle((byte)4);
               break;
            case 11:
            case 14:
               var1.setDashStyle((byte)4);
               var1.setWidth(1.0);
               break;
            case 12:
               var1.setDashStyle((byte)6);
               break;
            case 13:
               var1.setDashStyle((byte)6);
               var1.setWidth(1.0);
         }

         var1.getFillFormat().setFillType((byte)1);
         if (var1.getStyle() == -1) {
            var1.setStyle((byte)0);
         }

         if (com.aspose.slides.ms.System.d2.k5(var1.getWidth())) {
            var1.setWidth(0.5);
         }

         this.n5(var1.getFillFormat().getSolidFillColor(), var2.l6());
      }
   }

   private void n5(Cell var1, ChartDataCell var2, t3u var3) {
      var1.setMarginRight(0.75);
      var1.setMarginTop(0.75);
      var1.setMarginLeft(0.75);
      var1.setMarginBottom(0.0);
      com.aspose.slides.internal.k4y.h7x var4 = null;
      g4l var5 = var2.k5().l6;
      if (var2.t2().n3() == 3 && var2.y4() > -1 && var5.l6() > var2.y4()) {
         var4 = var2.k5().l6.l6(var2.y4());
      }

      Paragraph var6 = (Paragraph)var1.getTextFrame().getParagraphs().get_Item(0);
      if (var4 != null && var4.l6().length > 0) {
         var6.getPortions().clear();
         Portion var17 = null;
         boolean var19 = false;

         for (com.aspose.slides.internal.k4y.c5f var12 : var4.l6()) {
            String var13 = var12.l6();
            if (var13 != null) {
               com.aspose.slides.internal.k4y.j2w var14 = var12.n5();
               boolean var15 = var14 != null;
               boolean var16 = var17 == null || var19 && var15;
               if (var16) {
                  var17 = new Portion(var13);
                  var6.getPortions().add(var17);
               } else {
                  var17.setText(com.aspose.slides.ms.System.d1.n5(new String[]{var17.getText(), var13}));
               }

               if (var15) {
                  this.n5(var17.l6(), var14.n5(), true);
               }

               var19 = var15;
            }
         }
      } else {
         Object var7 = var2.getValue();
         IPortion var8 = var6.getPortions().get_Item(0);
         var8.setText(var7 == null ? "" : t7k.n5(var7, this.n5(var2, var3), false));
         com.aspose.slides.internal.k4y.w0l[] var9 = this.k5.n5().n5();
         if (var3.s7() != 0 && var9 != null && var9.length > (var3.a6() & 4294967295L)) {
            this.n5((PortionFormat)var8.getPortionFormat(), this.k5.n5().n5()[(int)var3.a6()].n5(), var3.s7() == 1);
         }
      }

      if (var3.y4() != 0) {
         com.aspose.slides.internal.k4y.t4d var18 = this.k5.u3().l6()[(int)var3.n5()];
         com.aspose.slides.internal.k4y.g4t var20 = var3.e2();
         if (var20 == null) {
            var20 = var18.e2();
         }

         com.aspose.slides.internal.k4y.g4t var22 = var20;
         if (var22 != null) {
            var1.getTextFrame().getTextFrameFormat().setWrapText(var22.u3());
            ParagraphFormat var23 = var6.n5();
            switch (var22.l6()) {
               case 1:
                  var1.setTextAnchorType((byte)0);
                  break;
               case 2:
                  var1.setTextAnchorType((byte)1);
                  break;
               case 3:
               default:
                  var1.setTextAnchorType((byte)2);
                  break;
               case 4:
                  var1.setTextAnchorType((byte)3);
                  break;
               case 5:
                  var1.setTextAnchorType((byte)4);
            }

            var23.setFontAlignment(2);
            switch (var22.n5()) {
               case 2:
                  var23.setAlignment(0);
                  break;
               case 3:
               case 7:
                  var23.setAlignment(1);
                  break;
               case 4:
                  var23.setAlignment(2);
                  break;
               case 5:
               default:
                  var23.setAlignment(var2.n5() == 1 ? 2 : 0);
                  break;
               case 6:
                  var23.setAlignment(3);
                  break;
               case 8:
                  var23.setAlignment(5);
            }

            float var24 = var6.getPortions().get_Item(0).getPortionFormat().getFontHeight();
            if ((var22.a6() & 4294967295L) > 0L && (var22.a6() & 4294967295L) != 4294967295L && !com.aspose.slides.ms.System.n1.k5(var24)) {
               float var25 = (float)(var22.a6() & 4294967295L) * var24 * 0.6F;
               if (var23.getAlignment() == 0) {
                  var1.setMarginLeft(var25);
               } else if (var23.getAlignment() == 2) {
                  var1.setMarginRight(var25);
               }
            }
         }
      }
   }

   private void n5(PortionFormat var1, List<com.aspose.slides.internal.k4y.g7> var2, boolean var3) {
      String var4 = "";
      byte var5 = 0;
      IFontData var6 = null;
      if (var1.getFontBold() == -1) {
         var1.setFontBold((byte)0);
      }

      if (var1.getFontItalic() == -1) {
         var1.setFontItalic((byte)0);
      }

      List$Enumerator var7 = var2.iterator();

      try {
         while (var7.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var8 = (com.aspose.slides.internal.k4y.g7)var7.next();
            switch (a6.n5(var8.n5())) {
               case 0:
                  com.aspose.slides.internal.k4y.w7c var11 = com.aspose.slides.internal.v6g.k5.n5(var8.l6(), com.aspose.slides.internal.k4y.w7c.class);
                  if (var11 != null && var3) {
                     var1.setFontBold((byte)(var11.n5() ? 1 : 0));
                  }
                  break;
               case 1:
                  com.aspose.slides.internal.k4y.w7c var12 = com.aspose.slides.internal.v6g.k5.n5(var8.l6(), com.aspose.slides.internal.k4y.w7c.class);
                  if (var12 != null && var3) {
                     var1.setFontItalic((byte)(var12.n5() ? 1 : 0));
                  }
                  break;
               case 2:
                  com.aspose.slides.internal.k4y.v6p var14 = com.aspose.slides.internal.v6g.k5.n5(var8.l6(), com.aspose.slides.internal.k4y.v6p.class);
                  if (var14 == null) {
                     break;
                  }

                  FillFormat var15 = var1.a6();
                  if (var15.getFillType() == -1 || var3) {
                     var15.setFillType((byte)1);
                     this.n5(var15.getSolidFillColor(), var14);
                  }
                  break;
               case 3:
                  com.aspose.slides.internal.k4y.a8v var18 = com.aspose.slides.internal.v6g.k5.n5(var8.l6(), com.aspose.slides.internal.k4y.a8v.class);
                  if (var18 != null && this.n5 != null) {
                     switch (var18.n5()) {
                        case 2:
                           var6 = this.n5.getFontScheme().getMajor().getLatinFont();
                           break;
                        case 3:
                           var6 = this.n5.getFontScheme().getMinor().getLatinFont();
                     }
                  }
               case 4:
               case 5:
               case 12:
               default:
                  break;
               case 6:
               case 7:
                  com.aspose.slides.internal.k4y.q2z var9 = com.aspose.slides.internal.v6g.k5.n5(var8.l6(), com.aspose.slides.internal.k4y.q2z.class);
                  if (var9 != null) {
                     var4 = var9.n5();
                  }
                  break;
               case 8:
                  com.aspose.slides.internal.k4y.p2k var10 = com.aspose.slides.internal.v6g.k5.n5(var8.l6(), com.aspose.slides.internal.k4y.p2k.class);
                  if (var10 != null) {
                     var5 = (byte)var10.n5();
                  }
                  break;
               case 9:
                  com.aspose.slides.internal.k4y.w7c var13 = com.aspose.slides.internal.v6g.k5.n5(var8.l6(), com.aspose.slides.internal.k4y.w7c.class);
                  if (var13 != null) {
                     var1.setStrikethroughType((byte)(var13.n5() ? 1 : 0));
                  }
                  break;
               case 10:
                  com.aspose.slides.internal.k4y.o4f var16 = com.aspose.slides.internal.v6g.k5.n5(var8.l6(), com.aspose.slides.internal.k4y.o4f.class);
                  if (var16 != null && (com.aspose.slides.ms.System.n1.k5(var1.getFontHeight()) || var3)) {
                     var1.setFontHeight((float)var16.n5());
                  }
                  break;
               case 11:
                  com.aspose.slides.internal.k4y.y5v var17 = com.aspose.slides.internal.v6g.k5.n5(var8.l6(), com.aspose.slides.internal.k4y.y5v.class);
                  if (var17 != null) {
                     switch (var17.n5()) {
                        case 1:
                        case 3:
                           var1.setFontUnderline((byte)2);
                           break;
                        case 2:
                        case 4:
                           var1.setFontUnderline((byte)3);
                           break;
                        case 5:
                           var1.setFontUnderline((byte)0);
                     }
                  }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      if (!com.aspose.slides.ms.System.d1.n5(var4)) {
         var1.setLatinFont((var5 & 255) > 0 ? new FontData(var4, var5) : new FontData(var4));
      } else if (var6 != null) {
         var1.setLatinFont(var6);
      }
   }

   private IMasterTheme n5(h0o var1, IPresentation var2) {
      if (var1 == null) {
         return var2 != null ? var2.getMasterTheme() : null;
      }

      com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2(var1.l6());

      try {
         com.aspose.slides.internal.c8m.j1 var4 = new com.aspose.slides.internal.c8m.j1();
         com.aspose.slides.ms.System.Xml.c7 var5 = com.aspose.slides.internal.n8e.s9.n5(
            new com.aspose.slides.internal.z0k.m3(var3, true), var4.u3(), var4.a6(), var4.n5(), var4.u9()
         );

         while (var5.u9()) {
            if (var5.s7() == 1 && "theme".equals(var5.n3())) {
               com.aspose.slides.internal.k4y.b6 var6 = new com.aspose.slides.internal.k4y.b6(var5);
               MasterTheme var7 = new MasterTheme((Presentation)var2);
               var7.setName(var6.l6());
               g3j.n5(var7.getColorScheme(), var6.k5().n5());
               f5w.n5(var7.getFontScheme(), var6.k5().l6());
               v2z.n5(var7.getFormatScheme(), var6.k5().k5(), new t5w(var2, InterruptionToken.getNone()));
               if (var6.a6() != null) {
                  for (com.aspose.slides.internal.k4y.c0 var11 : var6.a6().l6()) {
                     IExtraColorScheme var12 = ((ExtraColorSchemeCollection)var7.getExtraColorSchemes()).n5(var7);
                     e9b.n5(var12, var11);
                  }
               }

               return var7;
            }
         }

         return null;
      } finally {
         var3.dispose();
      }
   }

   private void n5(IColorFormat var1, com.aspose.slides.internal.k4y.v6p var2) {
      if (var2 != null) {
         if (this.n5 != null && (var2.l6() & 4294967295L) <= 16L) {
            ((ColorFormat)var1).n5(((ColorFormat)this.n5.getColorScheme().getByColorSchemeIndex(this.l6.n5((int)var2.l6()))).u3().o8());
         } else {
            ((ColorFormat)var1).n5(com.aspose.slides.internal.o9b.c8.n5((int)var2.n5()).o8());
         }

         if (var2.k5() != Double.MAX_VALUE) {
            IColorOperationCollection var3 = var1.getColorTransform();
            float var4 = (float)com.aspose.slides.ms.System.q1.n5((double)(var2.k5()), 2);
            if (var4 > 0.0F) {
               var3.add(16, 1.0F - var4);
               var3.add(15, var4);
            } else if (var4 < 0.0F) {
               var3.add(16, 1.0F + var4);
            }
         }
      }
   }

   private String n5(ChartDataCell var1, t3u var2) {
      if (var2.t2() != 0) {
         h6g var3 = var1.x8();
         if (var3 != null) {
            return var3.n5();
         }
      }

      return var1.n5(true);
   }

   static {
      u3.addItem("None", 0);
      u3.addItem("TableStyleLight1", 17);
      u3.addItem("TableStyleLight2", 18);
      u3.addItem("TableStyleLight3", 19);
      u3.addItem("TableStyleLight4", 20);
      u3.addItem("TableStyleLight5", 21);
      u3.addItem("TableStyleLight6", 74);
      u3.addItem("TableStyleLight7", 23);
      u3.addItem("TableStyleLight8", 24);
      u3.addItem("TableStyleLight9", 25);
      u3.addItem("TableStyleLight10", 26);
      u3.addItem("TableStyleLight11", 27);
      u3.addItem("TableStyleLight12", 32);
      u3.addItem("TableStyleLight13", 22);
      u3.addItem("TableStyleLight14", 31);
      u3.addItem("TableStyleLight15", 33);
      u3.addItem("TableStyleLight16", 34);
      u3.addItem("TableStyleLight17", 36);
      u3.addItem("TableStyleLight18", 37);
      u3.addItem("TableStyleLight19", 38);
      u3.addItem("TableStyleLight20", 39);
      u3.addItem("TableStyleLight21", 40);
      u3.addItem("TableStyleMedium1", 41);
      u3.addItem("TableStyleMedium2", 42);
      u3.addItem("TableStyleMedium3", 43);
      u3.addItem("TableStyleMedium4", 44);
      u3.addItem("TableStyleMedium5", 45);
      u3.addItem("TableStyleMedium6", 46);
      u3.addItem("TableStyleMedium7", 47);
      u3.addItem("TableStyleMedium8", 2);
      u3.addItem("TableStyleMedium9", 1);
      u3.addItem("TableStyleMedium10", 35);
      u3.addItem("TableStyleMedium11", 28);
      u3.addItem("TableStyleMedium12", 29);
      u3.addItem("TableStyleMedium13", 30);
      u3.addItem("TableStyleMedium14", 48);
      u3.addItem("TableStyleMedium15", 49);
      u3.addItem("TableStyleMedium16", 50);
      u3.addItem("TableStyleMedium17", 51);
      u3.addItem("TableStyleMedium18", 52);
      u3.addItem("TableStyleMedium19", 53);
      u3.addItem("TableStyleMedium20", 54);
      u3.addItem("TableStyleMedium21", 55);
      u3.addItem("TableStyleMedium22", 56);
      u3.addItem("TableStyleMedium23", 57);
      u3.addItem("TableStyleMedium24", 58);
      u3.addItem("TableStyleMedium25", 59);
      u3.addItem("TableStyleMedium26", 60);
      u3.addItem("TableStyleMedium27", 61);
      u3.addItem("TableStyleMedium28", 62);
      u3.addItem("TableStyleDark1", 63);
      u3.addItem("TableStyleDark2", 64);
      u3.addItem("TableStyleDark3", 65);
      u3.addItem("TableStyleDark4", 66);
      u3.addItem("TableStyleDark5", 67);
      u3.addItem("TableStyleDark6", 68);
      u3.addItem("TableStyleDark7", 69);
      u3.addItem("TableStyleDark8", 70);
      u3.addItem("TableStyleDark9", 71);
      u3.addItem("TableStyleDark10", 72);
      u3.addItem("TableStyleDark11", 73);
   }
}
