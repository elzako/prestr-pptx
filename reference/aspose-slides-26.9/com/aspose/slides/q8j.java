package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class q8j extends r6o<Paragraph> {
   public q8j(TemplateContext<Paragraph> var1, com.aspose.slides.internal.z0k.a0 var2) {
      super(var1, var2);
   }

   @Override
   public void n5() {
      this.l6("\r\n");
      Paragraph var1 = this.u3().getObject();
      TextFrame var2 = this.u3().getLocal().get("parent");
      boolean var3 = this.u3().getLocal().<Boolean>get("tableContent");
      com.aspose.slides.internal.o9b.f2 var4 = this.u3().getLocal().<com.aspose.slides.internal.o9b.f2>get("parentContainerSize").a6();
      boolean var5 = this.u3().getLocal().containsKey("isFirst") && this.u3().getLocal().<Boolean>get("isFirst");
      boolean var6 = this.u3().getLocal().containsKey("isLast") && this.u3().getLocal().<Boolean>get("isLast");
      boolean var7 = this.u3().getLocal().containsKey("wideTextBoxLayout") && this.u3().getLocal().<Boolean>get("wideTextBoxLayout");
      IParagraphFormatEffectiveData var8 = var1.getParagraphFormat().getEffective();
      boolean var9 = var8.getBullet().getType() == 0 && this.l6(var1) == 1;
      String var10 = this.u3().getLocal().containsKey("animationAttributes") ? this.u3().getLocal().get("animationAttributes") : "";
      String var11 = this.u3().getLocal().containsKey("animationId") ? this.u3().getLocal().get("animationId") : null;
      double[] var12 = c6s.n5(var8, var2, var4.a6(), this.u3());
      String var13 = com.aspose.slides.ms.System.d1.n5(new String[]{
         "margin-left: ",
         com.aspose.slides.ms.System.a3.l6(com.aspose.slides.internal.v6g.k5.u3(var12[0], 14)),
         "px; margin-top: ",
         com.aspose.slides.ms.System.a3.l6(com.aspose.slides.internal.v6g.k5.u3(var12[1], 14)),
         "px; margin-right: ",
         com.aspose.slides.ms.System.a3.l6(com.aspose.slides.internal.v6g.k5.u3(var12[2], 14)),
         "px; margin-bottom: ",
         com.aspose.slides.ms.System.a3.l6(com.aspose.slides.internal.v6g.k5.u3(var12[3], 14)),
         "px; "
      });
      String var14 = "";
      float var15 = var1.getPortions().getCount() == 0 ? 0.0F : var1.getPortions().get_Item(0).getPortionFormat().getEffective().getFontHeight();
      double var16 = 1.25;
      if (!var5) {
         if (var8.getSpaceBefore() < 0.0F) {
            var14 = com.aspose.slides.ms.System.d1.n5(
               var14,
               com.aspose.slides.ms.System.d1.n5(new String[]{
                  "padding-top: ", com.aspose.slides.ms.System.a3.l6(com.aspose.slides.internal.v6g.k5.u3(-var8.getSpaceBefore(), 13)), "px; "
               })
            );
         } else {
            var14 = com.aspose.slides.ms.System.d1.n5(
               var14,
               com.aspose.slides.ms.System.d1.n5(new String[]{
                  "padding-top: ",
                  com.aspose.slides.ms.System.a3.l6(com.aspose.slides.internal.v6g.k5.u3(var16 * var15 * var8.getSpaceBefore() / 100.0, 14)),
                  "px; "
               })
            );
         }
      }

      if (!var6) {
         if (var8.getSpaceAfter() < 0.0F) {
            var14 = com.aspose.slides.ms.System.d1.n5(
               var14,
               com.aspose.slides.ms.System.d1.n5(new String[]{
                  "padding-bottom: ", com.aspose.slides.ms.System.a3.l6(com.aspose.slides.internal.v6g.k5.u3(-var8.getSpaceAfter(), 13)), "px; "
               })
            );
         } else {
            var14 = com.aspose.slides.ms.System.d1.n5(
               var14,
               com.aspose.slides.ms.System.d1.n5(new String[]{
                  "padding-bottom: ",
                  com.aspose.slides.ms.System.a3.l6(com.aspose.slides.internal.v6g.k5.u3(var16 * var15 * var8.getSpaceAfter() / 100.0, 14)),
                  "px; "
               })
            );
         }
      }

      com.aspose.slides.internal.o9b.y1 var18 = var1.l6().y4();
      String var19 = this.n5(var1);
      if (var7) {
         var19 = this.n5(var19, "line-height");
         var19 = com.aspose.slides.ms.System.d1.n5(var19, " white-space: nowrap;");
      }

      String var20 = com.aspose.slides.ms.System.d1.n5(new String[]{var13, var14});
      String var21 = com.aspose.slides.ms.System.d1.n5(new String[]{var20, var19});
      String var22 = com.aspose.slides.ms.System.d1.n5(new String[]{"position: relative; left: 0px; top: 0px; ", var20});
      String var23 = com.aspose.slides.ms.System.d1.n5(new String[]{"margin: 0px; ", var19});
      String var24 = var10;
      if (!com.aspose.slides.ms.System.d1.n5(var10)) {
         var24 = com.aspose.slides.ms.System.d1.n5(var24, com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-width=\"", f7i.n5(var18.s7()), "\" "}));
         var24 = com.aspose.slides.ms.System.d1.n5(var24, com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-height=\"", f7i.n5(var18.k5()), "\" "}));
      }

      String var25 = com.aspose.slides.ms.System.d1.n5(var10)
         ? com.aspose.slides.ms.System.d1.n5(new String[]{"<p style=\"", var21, "\">"})
         : com.aspose.slides.ms.System.d1.n5(new String[]{"<div id=\"", var11, "\" style=\"", var22, "\" ", var24, "><p style=\"", var23, "\">"});
      String var26 = com.aspose.slides.ms.System.d1.n5(var10) ? "</p>" : "</p></div>";
      this.l6("\r\n");
      this.l6("\r\n");
      this.k5(this.n5(var25));
      this.l6("\r\n");
      if (var1.getPortions().getCount() != 0) {
         if (var8.getBullet().getType() != 0) {
            this.k5(
               this.n5(
                  com.aspose.slides.ms.System.d1.n5(g2r.n5(Paragraph.class, this.n5, "bullet", this.u3()).toString(), com.aspose.slides.ms.System.p8.k5(), "")
               )
            );
         }

         IGenericEnumerator var27 = var1.getPortions().iterator();

         try {
            while (var27.hasNext()) {
               Portion var28 = (Portion)var27.next();
               TemplateContext var29 = this.u3().subModel(var28);
               var29.getLocal().put("parentTextFrame", var2);
               var29.getLocal().put("tableContent", var3);
               var29.getLocal().put("wideTextBoxLayout", var7);
               var29.getLocal().put("singleVisiblePortionParagraph", var9);
               var29.getLocal().put("isFirst", var28 == var1.getPortions().get_Item(0));
               var29.getLocal().put("isLast", var28 == var1.getPortions().get_Item(var1.getPortions().getCount() - 1));
               var29.getLocal().put("paragraph", var1);
               this.k5(
                  this.n5(
                     com.aspose.slides.ms.System.d1.n5(g2r.n5(Portion.class, this.n5, "portion", var29).toString(), com.aspose.slides.ms.System.p8.k5(), "")
                  )
               );
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var27, IDisposable.class)) {
               var27.dispose();
            }
         }
      }

      this.k5(this.n5(var26));
      this.l6("\r\n");
   }

   private String n5(Paragraph var1) {
      return c6s.n5(var1.getParagraphFormat().getEffective(), this.u3());
   }

   private int l6(Paragraph var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < var1.getPortions().getCount(); var3++) {
         IPortion var4 = var1.getPortions().get_Item(var3);
         if (!com.aspose.slides.ms.System.d1.n5(var4.getText())) {
            var2++;
         }
      }

      return var2;
   }

   private String n5(String var1, String var2) {
      List var3 = new List();

      for (String var7 : com.aspose.slides.ms.System.d1.n5(var1, new char[]{';'}, (short)1)) {
         String var8 = com.aspose.slides.ms.System.d1.l6(var7);
         if (!this.l6(var8, com.aspose.slides.ms.System.d1.n5(new String[]{var2, ":"}))) {
            var3.addItem(com.aspose.slides.ms.System.d1.n5(new String[]{var8, ";"}));
         }
      }

      return com.aspose.slides.ms.System.d1.n5(" ",(String[])( var3.toArray(new String[0])));
   }

   private boolean l6(String var1, String var2) {
      return var1 != null && var2 != null && var1.length() >= var2.length() && com.aspose.slides.ms.System.d1.n5(var1, 0, var2, 0, var2.length(), true) == 0;
   }
}
