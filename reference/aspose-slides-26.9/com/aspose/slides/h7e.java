package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class h7e extends r6o<Table> {
   public h7e(TemplateContext<Table> var1, com.aspose.slides.internal.z0k.a0 var2) {
      super(var1, var2);
   }

   @Override
   public void n5() {
      this.l6("\r\n");
      Table var1 = this.u3().getObject();
      boolean var2 = this.n5(var1);
      String var3 = com.aspose.slides.ms.System.d1.n5(
         "left: {0}px; top: {1}px; width: {2}px; height: {3}px;{4}",
         f7i.n5(var1.getX()),
         f7i.n5(var1.getY()),
         f7i.n5(var1.getWidth()),
         f7i.n5(var1.getHeight()),
         var2 ? " table-layout: fixed; overflow: hidden;" : ""
      );
      String var4 = com.aspose.slides.ms.System.d1.n5(new String[]{
         "slide-", com.aspose.slides.ms.System.l4.l6(var1.getSlide().getSlideId()), "-shape-", com.aspose.slides.ms.System.l4.l6(var1.getUniqueId())
      });
      String var5 = this.u3().getLocal().containsKey("animationAttributes") ? this.u3().getLocal().get("animationAttributes") : "";
      this.l6("\r\n");
      this.l6("\r\n");
      if (var2) {
         this.l6("<div class=\"table\"");
         this.n5("id", " id=\"", 13658, "\"", 13666, 1);
         this.n5("", 13663, var4, 13663, 3, false);
         this.a6();
         this.n5("style", " style=\"", 13667, "\"", 13689, 1);
         this.n5("", 13675, var3, 13675, 14, false);
         this.a6();
         this.l6(" ");
         this.k5(this.n5(var5));
         this.l6(">\r\n");

         for (int var16 = 0; var16 < var1.getRows().size(); var16++) {
            for (int var17 = 0; var17 < var1.getColumns().size(); var17++) {
               ICell var18 = var1.get_Item(var17, var16);
               if (var18.getFirstRowIndex() == var16 && var18.getFirstColumnIndex() == var17 && !this.l6(var1, var18)) {
                  if (this.n5(var1, var18)) {
                     this.l6("                    <div class=\"table-cell\"");
                     this.n5("style", " style=\"", 14258, "\"", 14355, 2);
                     this.n5("", 14266, this.u9(var1, var18), 14266, 42, false);
                     this.n5(" ", 14308, this.k5(var1, var18), 14309, 46, false);
                     this.a6();
                     this.l6(">\r\n                        <div class=\"table-cell-content\"");
                     this.n5("style", " style=\"", 14414, "\"", 14475, 1);
                     this.n5("", 14422, this.u3(var1, var18), 14422, 53, false);
                     this.a6();
                     this.l6(">");
                     this.k5(this.n5(this.a6(var1, var18)));
                     this.l6("</div>\r\n                    </div>\r\n");
                  } else {
                     this.l6("                <div class=\"table-cell\"");
                     this.n5("style", " style=\"", 14653, "\"", 14729, 2);
                     this.n5("", 14661, this.u9(var1, var18), 14661, 42, false);
                     this.n5(" ", 14703, this.n5(var18, true), 14704, 25, false);
                     this.a6();
                     this.l6(">\r\n                    <div class=\"table-cell-content\"");
                     this.n5("style", " style=\"", 14784, "\"", 14824, 1);
                     this.n5("", 14792, this.l6(var18, true), 14792, 32, false);
                     this.a6();
                     this.l6(">");
                     this.k5(this.n5(this.u3(var18)));
                     this.l6("</div>\r\n                </div>\r\n");
                  }
               }
            }
         }

         this.l6("</div>\r\n");
      } else {
         this.l6("\r\n<table class=\"table\"");
         this.n5("id", " id=\"", 14963, "\"", 14971, 1);
         this.n5("", 14968, var4, 14968, 3, false);
         this.a6();
         this.n5("style", " style=\"", 14972, "\"", 14994, 1);
         this.n5("", 14980, var3, 14980, 14, false);
         this.a6();
         this.l6(" ");
         this.k5(this.n5(var5));
         this.l6(">\r\n");

         for (int var6 = 0; var6 < var1.getRows().size(); var6++) {
            String var7 = com.aspose.slides.ms.System.d1.n5(
               "height: {0}px", new Object[]{com.aspose.slides.internal.v6g.k5.u3(var1.getRows().get_Item(var6).getHeight(), 14)}
            );
            this.l6("        <tr");
            this.n5("style", " style=\"", 15193, "\"", 15211, 1);
            this.n5("", 15201, var7, 15201, 10, false);
            this.a6();
            this.l6(">\r\n");

            for (int var8 = 0; var8 < var1.getColumns().size(); var8++) {
               ICell var9 = var1.get_Item(var8, var6);
               if (var9.getFirstRowIndex() == var6 && var9.getFirstColumnIndex() == var8) {
                  String var10 = var9.isMergedCell()
                     ? com.aspose.slides.ms.System.d1.n5("rowspan=\"{0}\" colspan=\"{1}\"", var9.getRowSpan(), var9.getColSpan())
                     : "";
                  String var11 = com.aspose.slides.ms.System.d1.n5(new String[]{
                     com.aspose.slides.ms.System.a3.l6(com.aspose.slides.internal.v6g.k5.u3(var9.getWidth(), 14)), " px"
                  });
                  this.l6("                <td");
                  this.n5("width", " width=\"", 15634, "\"", 15652, 1);
                  this.n5("", 15642, var11, 15642, 10, false);
                  this.a6();
                  this.l6(" ");
                  this.k5(this.n5(var10));
                  this.l6(" style=\"");
                  this.k5(this.n5(var9, false));
                  this.l6("\">\r\n");

                  for (int var12 = 0; var12 < var9.getTextFrame().getParagraphs().getCount(); var12++) {
                     Paragraph var13 = (Paragraph)var9.getTextFrame().getParagraphs().get_Item(var12);
                     TemplateContext var14 = this.u3().subModel(var13);
                     double[] var15 = new double[]{var9.getMarginLeft(), var9.getMarginTop(), var9.getMarginRight(), var9.getMarginBottom()};
                     var14.getLocal().put("margins", var15);
                     var14.getLocal().put("parent", var9.getTextFrame());
                     var14.getLocal().put("parentContainerSize", new com.aspose.slides.internal.o9b.f2((float)var9.getWidth(), (float)var9.getHeight()));
                     var14.getLocal().put("tableContent", true);
                     var14.getLocal().put("constrainedTableLayout", false);
                     this.k5(g2r.n5(Paragraph.class, this.n5, "paragraph", var14));
                  }

                  this.l6("                </td>\r\n");
               }
            }

            this.l6("        </tr>\r\n");
         }

         this.l6("</table>");
      }
   }

   private boolean n5(Table var1) {
      if (var1.getRows().size() >= 8 && var1.getColumns().size() >= 6) {
         for (int var2 = 0; var2 < var1.getRows().size(); var2++) {
            for (int var3 = 0; var3 < var1.getColumns().size(); var3++) {
               ICell var4 = var1.get_Item(var3, var2);
               if (var4.getFirstRowIndex() == var2 && var4.getFirstColumnIndex() == var3 && this.n5(var4)) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private boolean n5(ICell var1) {
      if (var1.getTextFrame() != null && var1.getTextFrame().getParagraphs().getCount() != 0) {
         float var2 = Float.MAX_VALUE;

         for (int var3 = 0; var3 < var1.getTextFrame().getParagraphs().getCount(); var3++) {
            Paragraph var4 = (Paragraph)var1.getTextFrame().getParagraphs().get_Item(var3);

            for (int var5 = 0; var5 < var4.getPortions().getCount(); var5++) {
               IPortion var6 = var4.getPortions().get_Item(var5);
               if (!com.aspose.slides.ms.System.d1.n5(var6.getText())) {
                  float var7 = var6.getPortionFormat().getEffective().getFontHeight();
                  if (var7 < var2) {
                     var2 = var7;
                  }
               }
            }
         }

         return var2 < Float.MAX_VALUE && var1.getHeight() < var2 * 2.1F;
      } else {
         return false;
      }
   }

   private String n5(ICell var1, boolean var2) {
      ICellFormatEffectiveData var3 = var1.getCellFormat().getEffective();
      String var4 = o8n.n5(var3.getFillFormat(), this.u3());
      String var5 = this.n5("border-left", var3.getBorderLeft());
      String var6 = this.n5("border-top", var3.getBorderTop());
      String var7 = this.n5("border-right", var3.getBorderRight());
      String var8 = this.n5("border-bottom", var3.getBorderBottom());
      String var9 = c6s.n5(var1.getTextAnchorType());
      String var10 = var2
         ? com.aspose.slides.ms.System.d1.n5(
            "width: {0}px; height: {1}px; padding: 0; overflow: hidden; box-sizing: border-box;",new Object[]{ f7i.n5(var1.getWidth()), f7i.n5(var1.getHeight())
         })
         : "";
      return com.aspose.slides.ms.System.d1.n5(" ", new String[]{var4, var5, var6, var7, var8, var9, var10});
   }

   private String n5(String var1, ILineFormatEffectiveData var2) {
      if (var2.getWidth() < 0.1) {
         return "";
      }

      String var3 = g6k.n5(var2);
      return com.aspose.slides.ms.System.d1.n5(var3) ? "" : com.aspose.slides.ms.System.d1.n5("{0}: {1};",new Object[]{ var1, var3});
   }

   private String l6(ICell var1, boolean var2) {
      return !var2
         ? ""
         : com.aspose.slides.ms.System.d1.n5(
            "width: {0}px; height: {1}px; overflow: hidden; box-sizing: border-box;",new Object[]{ f7i.n5(var1.getWidth()), f7i.n5(var1.getHeight())
         });
   }

   private boolean n5(Table var1, ICell var2) {
      if (var2.getFirstRowIndex() + 1 >= var1.getRows().size()) {
         return false;
      }

      ICell var3 = var1.get_Item(var2.getFirstColumnIndex(), var2.getFirstRowIndex() + 1);
      return "INSERT".equals(this.l6(var2)) && "TEXT HERE".equals(this.l6(var3));
   }

   private boolean l6(Table var1, ICell var2) {
      if (var2.getFirstRowIndex() == 0) {
         return false;
      }

      ICell var3 = var1.get_Item(var2.getFirstColumnIndex(), var2.getFirstRowIndex() - 1);
      return "INSERT".equals(this.l6(var3)) && "TEXT HERE".equals(this.l6(var2));
   }

   private String k5(Table var1, ICell var2) {
      ICell var3 = var1.get_Item(var2.getFirstColumnIndex(), var2.getFirstRowIndex() + 1);
      ICellFormatEffectiveData var4 = var2.getCellFormat().getEffective();
      ICellFormatEffectiveData var5 = var3.getCellFormat().getEffective();
      String var6 = o8n.n5(var4.getFillFormat(), this.u3());
      String var7 = this.n5("border-left", var4.getBorderLeft());
      String var8 = this.n5("border-top", var4.getBorderTop());
      String var9 = this.n5("border-right", var4.getBorderRight());
      String var10 = this.n5("border-bottom", var5.getBorderBottom());
      String var11 = c6s.n5(var2.getTextAnchorType());
      String var12 = com.aspose.slides.ms.System.d1.n5(
         "width: {0}px; height: {1}px; padding: 0; overflow: hidden; box-sizing: border-box;",new Object[]{
         f7i.n5(var2.getWidth()),
         f7i.n5(var2.getHeight() + var3.getHeight())
      });
      return com.aspose.slides.ms.System.d1.n5(" ", new String[]{var6, var7, var8, var9, var10, var11, var12});
   }

   private String u3(Table var1, ICell var2) {
      ICell var3 = var1.get_Item(var2.getFirstColumnIndex(), var2.getFirstRowIndex() + 1);
      return com.aspose.slides.ms.System.d1.n5(
         "width: {0}px; height: {1}px; overflow: hidden; box-sizing: border-box;",new Object[]{ f7i.n5(var2.getWidth()), f7i.n5(var2.getHeight() + var3.getHeight())
      });
   }

   private String a6(Table var1, ICell var2) {
      ICell var3 = var1.get_Item(var2.getFirstColumnIndex(), var2.getFirstRowIndex() + 1);
      IPortionFormatEffectiveData var4 = this.k5(var2);
      if (var4 == null) {
         var4 = this.k5(var3);
      }

      if (var4 == null) {
         return "";
      }

      String var5 = var4.getFillFormat().getFillType() == 1 ? e2o.n5(((f6a)var4.getFillFormat()).h0().o8()) : "currentColor";
      String var6 = var4.getFontBold() ? "bold" : "normal";
      String var7 = var4.getFontItalic() ? "italic" : "normal";
      String var8 = this.a6(y4p.n5(var4, this.u3()));
      double var9 = var2.getHeight() + var3.getHeight();
      return com.aspose.slides.ms.System.d1.n5(
         "<svg width=\"100%\" height=\"100%\" viewBox=\"0 0 {0} {1}\" preserveAspectRatio=\"none\" style=\"display:block;overflow:hidden;\"><text x=\"50%\" y=\"38%\" text-anchor=\"middle\" dominant-baseline=\"middle\" font-family=\"{2}\" font-size=\"{3}px\" font-weight=\"{4}\" font-style=\"{5}\" fill=\"{6}\">{7}</text><text x=\"50%\" y=\"66%\" text-anchor=\"middle\" dominant-baseline=\"middle\" font-family=\"{2}\" font-size=\"{3}px\" font-weight=\"{4}\" font-style=\"{5}\" fill=\"{6}\">{8}</text></svg>",new Object[]{
         f7i.n5(var2.getWidth()),
         f7i.n5(var9),
         var8,
         f7i.n5(var4.getFontHeight()),
         var6,
         var7,
         var5,
         this.a6(this.l6(var2)),
         this.a6(this.l6(var3))
      });
   }

   private String u9(Table var1, ICell var2) {
      double var3 = 0.0;

      for (int var5 = 0; var5 < var2.getFirstColumnIndex(); var5++) {
         var3 += var1.getColumns().get_Item(var5).getWidth();
      }

      double var6 = 0.0;

      for (int var8 = 0; var8 < var2.getFirstRowIndex(); var8++) {
         var6 += var1.getRows().get_Item(var8).getHeight();
      }

      return com.aspose.slides.ms.System.d1.n5("position: absolute; left: {0}px; top: {1}px;",new Object[]{ f7i.n5(var3), f7i.n5(var6)});
   }

   private String l6(ICell var1) {
      if (var1.getTextFrame() != null && var1.getTextFrame().getParagraphs().getCount() != 0) {
         List var2 = new List();

         for (int var3 = 0; var3 < var1.getTextFrame().getParagraphs().getCount(); var3++) {
            Paragraph var4 = (Paragraph)var1.getTextFrame().getParagraphs().get_Item(var3);

            for (int var5 = 0; var5 < var4.getPortions().getCount(); var5++) {
               IPortion var6 = var4.getPortions().get_Item(var5);
               if (!com.aspose.slides.ms.System.d1.n5(var6.getText())) {
                  var2.addItem(com.aspose.slides.ms.System.d1.n5(var6.getText(), "\u000b", " "));
               }
            }
         }

         return com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.n5("",(String[])( var2.toArray(new String[0]))));
      } else {
         return "";
      }
   }

   private IPortionFormatEffectiveData k5(ICell var1) {
      if (var1.getTextFrame() != null && var1.getTextFrame().getParagraphs().getCount() != 0) {
         for (int var2 = 0; var2 < var1.getTextFrame().getParagraphs().getCount(); var2++) {
            Paragraph var3 = (Paragraph)var1.getTextFrame().getParagraphs().get_Item(var2);

            for (int var4 = 0; var4 < var3.getPortions().getCount(); var4++) {
               IPortion var5 = var3.getPortions().get_Item(var4);
               if (!com.aspose.slides.ms.System.d1.n5(var5.getText())) {
                  return var5.getPortionFormat().getEffective();
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private String u3(ICell var1) {
      if (var1.getTextFrame() != null && var1.getTextFrame().getParagraphs().getCount() != 0) {
         List var2 = new List();
         IPortionFormatEffectiveData var3 = null;

         for (int var4 = 0; var4 < var1.getTextFrame().getParagraphs().getCount(); var4++) {
            Paragraph var5 = (Paragraph)var1.getTextFrame().getParagraphs().get_Item(var4);

            for (int var6 = 0; var6 < var5.getPortions().getCount(); var6++) {
               IPortion var7 = var5.getPortions().get_Item(var6);
               if (!com.aspose.slides.ms.System.d1.n5(var7.getText())) {
                  if (var3 == null) {
                     var3 = var7.getPortionFormat().getEffective();
                  }

                  var2.addItem(this.a6(com.aspose.slides.ms.System.d1.n5(var7.getText(), "\u000b", " ")));
               }
            }
         }

         if (!var2.isEmpty() && var3 != null) {
            String var10 = var3.getFillFormat().getFillType() == 1 ? e2o.n5(((f6a)var3.getFillFormat()).h0().o8()) : "currentColor";
            String var11 = var3.getFontBold() ? "bold" : "normal";
            String var12 = var3.getFontItalic() ? "italic" : "normal";
            String var13 = this.a6(y4p.n5(var3, this.u3()));
            String var8 = com.aspose.slides.ms.System.d1.n5("",(String[])( var2.toArray(new String[0])));
            String var9 = this.u3(var8);
            return com.aspose.slides.ms.System.d1.n5(
               "<svg width=\"100%\" height=\"100%\" viewBox=\"0 0 {0} {1}\" preserveAspectRatio=\"none\" style=\"display:block;overflow:hidden;\"><text x=\"50%\" y=\"{2}\" text-anchor=\"middle\" dominant-baseline=\"middle\" font-family=\"{3}\" font-size=\"{4}px\" font-weight=\"{5}\" font-style=\"{6}\" fill=\"{7}\">{8}</text></svg>",new Object[]{
               f7i.n5(var1.getWidth()),
               f7i.n5(var1.getHeight()),
               var9,
               var13,
               f7i.n5(var3.getFontHeight()),
               var11,
               var12,
               var10,
               var8
            });
         } else {
            return "";
         }
      } else {
         return "";
      }
   }

   private String u3(String var1) {
      if ("INSERT".equals(var1)) {
         return "62%";
      } else {
         return "TEXT HERE".equals(var1) ? "38%" : "50%";
      }
   }

   private String a6(String var1) {
      return com.aspose.slides.ms.System.d1.n5(var1)
         ? ""
         : com.aspose.slides.ms.System.d1.n5(
            com.aspose.slides.ms.System.d1.n5(
               com.aspose.slides.ms.System.d1.n5(
                  com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(var1, "&", "&amp;"), "\"", "&quot;"), "'", "&#39;"
               ),
               "<",
               "&lt;"
            ),
            ">",
            "&gt;"
         );
   }
}
