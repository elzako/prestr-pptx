package com.aspose.slides;

class c5p extends r6o<Shape> {
   public c5p(TemplateContext<Shape> var1, com.aspose.slides.internal.z0k.a0 var2) {
      super(var1, var2);
   }

   @Override
   public void n5() {
      this.l6("\r\n");
      Shape var1 = this.u3().getObject();
      com.aspose.slides.internal.o9b.j5 var2 = this.u3().getLocal().<com.aspose.slides.internal.o9b.j5>get("origin").k5();
      String var3 = o6c.n5(var1, var2.k5());
      String var4 = "position: absolute; top: 50%; left: 50%; transform: translate(-50%, -50%);";
      String var5 = o6c.n5(var1, this.u3());
      boolean var6 = o6c.l6(var1);
      String var7 = com.aspose.slides.ms.System.d1.n5(new String[]{
         "slide-", com.aspose.slides.ms.System.l4.l6(var1.getSlide().getSlideId()), "-shape-", com.aspose.slides.ms.System.l4.l6(var1.getUniqueId())
      });
      String var8 = "";
      if (this.u3().getLocal().containsKey("animationAttributes")) {
         var8 = this.u3().getLocal().get("animationAttributes");
      }

      String var9 = var3;
      if (!var6) {
         var9 = com.aspose.slides.ms.System.d1.n5(var9, com.aspose.slides.ms.System.d1.n5(new String[]{" background-image: ", var5, "; background-size: 100% 100%;"}));
      }

      var9 = com.aspose.slides.ms.System.d1.n5(
         var9, com.aspose.slides.ms.System.d1.n5(" transform: rotate({0}deg);", new Object[]{com.aspose.slides.internal.v6g.k5.u3(var1.getRotation(), 13)})
      );
      String var10 = var6 ? com.aspose.slides.ms.System.d1.n5(new String[]{o6c.n5(var1), " background-image: ", var5, "; background-size: 100% 100%;"}) : "";
      this.l6("\r\n");
      this.l6("    <div class=\"shape\"");
      this.n5("id", " id=\"", 1499, "\"", 1507, 1);
      this.n5("", 1504, var7, 1504, 3, false);
      this.a6();
      this.n5("style", " style=\"", 1508, "\"", 1532, 1);
      this.n5("", 1516, this.n5(var9), 1516, 16, false);
      this.a6();
      this.l6(" ");
      this.k5(this.n5(var8));
      this.l6(">\r\n");
      if (var6) {
         this.l6("        <div");
         this.n5("style", " style=\"", 1620, "\"", 1644, 1);
         this.n5("", 1628, this.n5(var10), 1628, 16, false);
         this.a6();
         this.l6("></div>\r\n");
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, AutoShape.class)) {
         AutoShape var11 = com.aspose.slides.internal.v6g.k5.n5(var1, AutoShape.class);
         TemplateContext var12 = this.u3().subModel((TextFrame)var11.getTextFrame());
         var12.getLocal().put("origin", var2.k5());
         var12.getLocal().put("parent", var11);
         this.k5(g2r.n5(TextFrame.class, this.n5, "textframe", var12));
      }

      this.l6("    </div>\r\n");
   }
}
