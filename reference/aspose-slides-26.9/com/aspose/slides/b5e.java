package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;

class b5e extends r6o<TextFrame> {
   public b5e(TemplateContext<TextFrame> var1, com.aspose.slides.internal.z0k.a0 var2) {
      super(var1, var2);
   }

   @Override
   public void n5() {
      this.l6("\r\n");
      TextFrame var1 = this.u3().getObject();
      AutoShape var2 = this.u3().getLocal().get("parent");
      ISlide var3 = com.aspose.slides.internal.v6g.k5.n5(var2.getSlide(), ISlide.class);
      Dictionary var4 = var1 != null && var3 != null ? q8s.a6(var3) : new Dictionary();
      this.l6("\r\n");
      if (var1 != null) {
         this.l6("<div class=\"textframe\"");
         this.n5("style", " style=\"", 2315, "\"", 2356, 1);
         this.n5("", 2323, this.n5(var1), 2323, 33, false);
         this.a6();
         this.l6(">\r\n");

         for (int var5 = 0; var5 < var1.getParagraphs().getCount(); var5++) {
            IParagraph var6 = var1.getParagraphs().get_Item(var5);
            TemplateContext var7 = this.u3().subModel((Paragraph)var6);
            var7.getLocal().put("parent", var1);
            var7.getLocal().put("parentContainerSize", new com.aspose.slides.internal.o9b.f2(var2.getWidth(), var2.getHeight()));
            var7.getLocal().put("tableContent", false);
            var7.getLocal().put("wideTextBoxLayout", this.n5(var1, var2));
            var7.getLocal().put("isFirst", var5 == 0);
            var7.getLocal().put("isLast", var5 == var1.getParagraphs().getCount() - 1);
            if (var4.containsKey(var6)) {
               m0j var8 = (m0j)var4.get_Item(var6);
               String var9 = "";
               var9 = com.aspose.slides.ms.System.d1.n5(var9, com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-type=\"", (String)var8.n5(), "\" "}));
               var9 = com.aspose.slides.ms.System.d1.n5(var9, com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-subtype=\"", (String)var8.l6(), "\" "}));
               var9 = com.aspose.slides.ms.System.d1.n5(var9, com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-duration=\"", f7i.n5((Float)var8.k5()), "\" "}));
               var9 = com.aspose.slides.ms.System.d1.n5(var9, com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-delay=\"", f7i.n5((Float)var8.u3()), "\" "}));
               var9 = com.aspose.slides.ms.System.d1.n5(var9, com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-clickTarget=\"", (String)var8.a6(), "\" "}));
               var9 = com.aspose.slides.ms.System.d1.n5(var9, com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-extra=\"", (String)var8.u9(), "\" "}));
               var9 = com.aspose.slides.ms.System.d1.n5(
                  var9, com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-sound=\"", q8s.n5(((z6)var8.c8()).n5(), this.u3()), "\" "})
               );
               var9 = com.aspose.slides.ms.System.d1.n5(
                  var9, com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-repeat=\"", f7i.n5(((z6)var8.c8()).l6()), "\" "})
               );
               var9 = com.aspose.slides.ms.System.d1.n5(
                  var9,
                  com.aspose.slides.ms.System.d1.n5(new String[]{
                     "data-animation-auto-reverse=\"", com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.n3.l6(((z6)var8.c8()).k5())), "\" "
                  })
               );
               var9 = com.aspose.slides.ms.System.d1.n5(
                  var9, com.aspose.slides.ms.System.d1.n5(new String[]{"data-animation-index=\"", com.aspose.slides.ms.System.a3.l6((Integer)var8.h0()), "\" "})
               );
               String var10 = com.aspose.slides.ms.System.d1.n5(new String[]{
                  "slide-",
                  com.aspose.slides.ms.System.l4.l6(var3.getSlideId()),
                  "-shape-",
                  com.aspose.slides.ms.System.l4.l6(var2.getUniqueId()),
                  "-paragraph-",
                  com.aspose.slides.ms.System.a3.l6(var5)
               });
               var7.getLocal().put("animationAttributes", var9);
               var7.getLocal().put("animationId", var10);
            }

            this.k5(this.n5(c6s.n5(g2r.n5(Paragraph.class, this.n5, "paragraph", var7).toString())));
         }

         this.l6("</div>\r\n");
      }
   }

   private String n5(TextFrame var1) {
      AutoShape var2 = this.u3().getLocal().get("parent");
      String var3 = c6s.n5(var1, var2);
      String var4 = c6s.n5(var1.getTextFrameFormat().getEffective());
      String var5 = o6c.l6(var2) ? "position: relative; z-index: 1;" : "";
      if (this.n5(var1, var2)) {
         var3 = com.aspose.slides.ms.System.d1.n5(
            "padding-top: {0}px; padding-left: 0px;", new Object[]{f7i.n5(var1.getTextFrameFormat().getEffective().getMarginTop())}
         );
      }

      return com.aspose.slides.ms.System.d1.n5(" ", new String[]{var3, var4, var5});
   }

   private boolean n5(TextFrame var1, AutoShape var2) {
      ITextFrameFormatEffectiveData var3 = var1.getTextFrameFormat().getEffective();
      return var2 != null
         && var2.getWidth() > 700.0F
         && var2.getHeight() < 60.0F
         && var3.getMarginTop() > 0.5
         && var3.getMarginTop() < 20.0
         && var3.getTextVerticalType() == 0;
   }
}
