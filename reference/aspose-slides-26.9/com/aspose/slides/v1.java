package com.aspose.slides;

class v1 extends r6o<Paragraph> {
   public v1(TemplateContext<Paragraph> var1, com.aspose.slides.internal.z0k.a0 var2) {
      super(var1, var2);
   }

   @Override
   public void n5() {
      this.l6("\r\n");
      Paragraph var1 = this.u3().getObject();
      TextFrame var2 = this.u3().getLocal().get("parent");
      boolean var3 = this.u3().getLocal().<Boolean>get("tableContent");
      IParagraphFormatEffectiveData var4 = var1.getParagraphFormat().getEffective();
      double[] var5 = new double[]{-com.aspose.slides.ms.System.q1.n5(var4.getIndent()), 0.0, 0.0, 0.0};
      if (var4.getBullet().getType() == 3) {
         var5[2] -= c6s.k5(var4, this.u3());
      }

      String var6 = var4.getBullet().getActualBulletValue();
      String var7 = com.aspose.slides.ms.System.d1.n5(new String[]{
         "margin-left: ",
         com.aspose.slides.ms.System.a3.l6(com.aspose.slides.internal.v6g.k5.u3(var5[0], 14)),
         "px; margin-top: ",
         com.aspose.slides.ms.System.a3.l6(com.aspose.slides.internal.v6g.k5.u3(var5[1], 14)),
         "px; margin-right: ",
         com.aspose.slides.ms.System.a3.l6(com.aspose.slides.internal.v6g.k5.u3(var5[2], 14)),
         "px; margin-bottom: ",
         com.aspose.slides.ms.System.a3.l6(com.aspose.slides.internal.v6g.k5.u3(var5[3], 14)),
         "px; "
      });
      String var8 = com.aspose.slides.ms.System.d1.n5(new String[]{
         "display: inline-block; width: ",
         com.aspose.slides.ms.System.a3.l6(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var4.getIndent()), 13)),
         "px; "
      });
      String var9 = com.aspose.slides.ms.System.d1.n5(new String[]{var7, this.n5(var1, var2, var3), var8});
      this.l6("\r\n");
      this.l6("\r\n<span class=\"portion\"");
      this.n5("style", " style=\"", 2091, "\"", 2116, 1);
      this.n5("", 2099, this.n5(var9), 2099, 17, false);
      this.a6();
      this.l6(">\r\n    ");
      this.k5(this.n5(var6));
      this.l6("\r\n");
      if (var4.getBullet().getType() == 3) {
         this.l6("        <img");
         this.n5("src", " src=\"", 2233, "\"", 2272, 1);
         this.n5("", 2239, this.n5(var1), 2239, 33, false);
         this.a6();
         this.n5("style", " style=\"", 2273, "\"", 2318, 1);
         this.n5("", 2281, this.l6(var1), 2281, 37, false);
         this.a6();
         this.l6(" />\r\n");
      }

      this.l6("</span>");
   }

   private String n5(Paragraph var1, TextFrame var2, boolean var3) {
      return c6s.n5(var1.getParagraphFormat().getEffective(), var2.getTextFrameFormat().getEffective(), var3, this.u3());
   }

   private String n5(Paragraph var1) {
      return m4w.n5(var1.getParagraphFormat().getEffective().getBullet().getPicture().getImage(), this.u3());
   }

   private String l6(Paragraph var1) {
      return c6s.l6(var1.getParagraphFormat().getEffective(), this.u3());
   }
}
