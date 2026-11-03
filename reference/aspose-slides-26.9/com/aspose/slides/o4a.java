package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class o4a extends r6o<Portion> {
   public o4a(TemplateContext<Portion> var1, com.aspose.slides.internal.z0k.a0 var2) {
      super(var1, var2);
   }

   @Override
   public void n5() {
      this.l6("\r\n");
      Portion var1 = this.u3().getObject();
      TextFrame var2 = this.u3().getLocal().get("parentTextFrame");
      boolean var3 = this.u3().getLocal().<Boolean>get("tableContent");
      boolean var4 = this.u3().getLocal().containsKey("isLast") && this.u3().getLocal().<Boolean>get("isLast");
      boolean var5 = this.u3().getLocal().containsKey("isFirst") && this.u3().getLocal().<Boolean>get("isFirst");
      IHyperlink var6 = var1.getPortionFormat().getEffective().getHyperlinkClick();
      boolean var7 = this.u3().getGlobal().containsKey("skipJavaScriptLinks") && this.u3().getGlobal().<Boolean>get("skipJavaScriptLinks");
      String var8 = var6 != null ? var6.getExternalUrl() : "";
      boolean var9 = this.u3().getGlobal().containsKey("disableFontLigatures") && this.u3().getGlobal().<Boolean>get("disableFontLigatures");
      this.l6("\r\n");
      this.l6("\r\n");
      if (!com.aspose.slides.ms.System.d1.n5(var8) && (!var7 || !((Hyperlink)var6).k5(false))) {
         this.k5(this.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"<a href=\"", var8, "\" style=\"text-decoration: none;\">"})));
      }

      this.l6("<span class=\"portion\"");
      this.n5("style", " style=\"", 3563, "\"", 3661, 1);
      this.n5("", 3571, this.n5(this.n5(var1, var2, var3, var9)), 3571, 90, false);
      this.a6();
      this.l6(">");
      this.k5(this.n5(this.n5(var1.getText(), var4, var5)));
      this.l6("</span>\r\n");
      if (!com.aspose.slides.ms.System.d1.n5(var8)) {
         this.k5(this.n5("</a>"));
      }
   }

   private String n5(Portion var1, TextFrame var2, boolean var3, boolean var4) {
      String var5 = c6s.n5(var1.getPortionFormat().getEffective(), var2.getTextFrameFormat().getEffective(), var3, this.u3(), var4);
      if (this.u3().getLocal().containsKey("wideTextBoxLayout") && this.u3().getLocal().<Boolean>get("wideTextBoxLayout")) {
         var5 = this.n5(var5, "line-height");
         var5 = this.n5(var5, "white-space");
         var5 = com.aspose.slides.ms.System.d1.n5(var5, " white-space: nowrap;");
      }

      if (!var3 && this.u3().getLocal().containsKey("singleVisiblePortionParagraph") && this.u3().getLocal().<Boolean>get("singleVisiblePortionParagraph")) {
         var5 = com.aspose.slides.ms.System.d1.n5(var5, " display: block;");
      }

      return var5;
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

   private String n5(String var1, boolean var2, boolean var3) {
      if (this.u3().getLocal().containsKey("wideTextBoxLayout") && this.u3().getLocal().<Boolean>get("wideTextBoxLayout")) {
         if (com.aspose.slides.ms.System.d1.n5(var1) && var2 && var3) {
            var1 = " ";
         }

         return com.aspose.slides.ms.System.d1.n5(var1, "\u000b", " ");
      } else {
         if (var1.length() > 1 && com.aspose.slides.ms.System.d1.k5(var1, "\u000b") && var2) {
            var1 = com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.d1.l6(var1, 0, var1.length() - 1), "<br /><br />"});
         } else if (com.aspose.slides.ms.System.d1.n5(var1) && var2 && var3) {
            var1 = " ";
         }

         return com.aspose.slides.ms.System.d1.n5(var1, "\u000b", "<br />");
      }
   }
}
