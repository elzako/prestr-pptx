package com.aspose.slides;

class p7 extends r6o<AutoShape> {
   public p7(TemplateContext<AutoShape> var1, com.aspose.slides.internal.z0k.a0 var2) {
      super(var1, var2);
   }

   @Override
   public void n5() {
      this.l6("\r\n");
      AutoShape var1 = this.u3().getObject();
      com.aspose.slides.internal.o9b.j5 var2 = this.u3().getLocal().<com.aspose.slides.internal.o9b.j5>get("origin").k5();
      String var3 = com.aspose.slides.ms.System.d1.n5(
         "left: {0}px; top: {1}px; width: {2}px; height: {3}px;",
         com.aspose.slides.internal.v6g.k5.u3(var1.getX(), 13),
         com.aspose.slides.internal.v6g.k5.u3(var1.getY(), 13),
         com.aspose.slides.internal.v6g.k5.u3(var1.getWidth(), 13),
         com.aspose.slides.internal.v6g.k5.u3(var1.getHeight(), 13)
      );
      String var4 = com.aspose.slides.ms.System.d1.n5(
         "slide-", com.aspose.slides.ms.System.l4.l6(var1.getSlide().getSlideId()), "-shape-", com.aspose.slides.ms.System.l4.l6(var1.getUniqueId())
      );
      String var5 = "";
      if (this.u3().getLocal().containsKey("animationAttributes")) {
         var5 = this.u3().getLocal().get("animationAttributes");
      }

      this.l6("\r\n");
      this.l6("\r\n");
      this.l6("    <div class=\"shape\"");
      this.n5("id", " id=\"", 1597, "\"", 1605, 1);
      this.n5("", 1602, var4, 1602, 3, false);
      this.a6();
      this.n5("style", " style=\"", 1606, "\"", 1658, 2);
      this.n5("", 1614, var3, 1614, 14, false);
      this.n5(" ", 1628, this.n5(var1), 1629, 29, false);
      this.a6();
      this.l6(" ");
      this.k5(this.n5(var5));
      this.l6(">\r\n");
      TemplateContext var6 = this.u3().subModel((TextFrame)var1.getTextFrame());
      var6.getLocal().put("origin", var2.k5());
      var6.getLocal().put("parent", var1);
      this.k5(g2r.n5(TextFrame.class, this.n5, "textframe", var6));
      this.l6("    </div>\r\n");
   }

   private String n5(AutoShape var1) {
      String var2 = o8n.n5(var1.getFillFormat().getEffective(), this.u3());
      String var3 = com.aspose.slides.ms.System.d1.n5("border: {0};", new Object[]{g6k.n5(var1.getLineFormat().getEffective())});
      String var4 = com.aspose.slides.internal.v6g.k5.u3(var1.getRotation(), 13) == 0
         ? ""
         : com.aspose.slides.ms.System.d1.n5("transform: rotate({0}deg);", new Object[]{com.aspose.slides.internal.v6g.k5.u3(var1.getRotation(), 13)});
      return com.aspose.slides.ms.System.d1.n5(" ", new String[]{var2, var3, var4});
   }
}
