package com.aspose.slides;

import java.util.Arrays;

class r6o<TObject> extends w2a {
   private String k5 = null;

   protected r6o(TemplateContext<TObject> var1, com.aspose.slides.internal.z0k.a0 var2) {
      this.n5(var1);
      this.n5 = var2;
   }

   protected final TemplateContext<TObject> l6() {
      return com.aspose.slides.internal.v6g.k5.n5(this.l6, TemplateContext.class);
   }

   protected final void n5(TemplateContext<TObject> var1) {
      this.l6 = var1;
   }

   public final TemplateContext<TObject> k5() {
      return this.l6();
   }

   final TemplateContext<TObject> u3() {
      return this.l6();
   }

   public final String n5(String var1) {
      return var1;
   }

   public final void l6(String var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(this.k5().getObject(), Presentation.class)
         && com.aspose.slides.ms.System.d1.t2(var1, "<link rel=\"stylesheet\" type=\"text/css\" href=\"master.css\" />")
         && !new License().isLicensed()) {
         var1 = com.aspose.slides.ms.System.d1.n5(
            var1,
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"master.css\" />",
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "<link rel=\"stylesheet\" type=\"text/css\" href=\"master.css\" /><style type=\"text/css\">", this.u9(), "</style>"
            })
         );
      }

      this.n5.n5(var1);
   }

   private String u9() {
      String[] var1 = null;
      Presentation var2 = com.aspose.slides.internal.v6g.k5.n5(this.k5().getObject(), Presentation.class);
      String[][] var3 = new String[][]{var1};
      byte[] var4 = null;
      byte[][] var5 = new byte[][]{var4};
      int[] var6 = Presentation.n5((s4e)var2.t4(), var5);
      var4 = var5[0];
      var3[0] = com.aspose.slides.internal.n8e.w1.u3();
      if (Arrays.equals(var6, i7t.l6) && var4 != null && var4.length > 0) {
         var3[0] = com.aspose.slides.ms.System.d1.n5(Presentation.n5(var4), new String[]{"\r\n", "\n", "\r", "\n\r"}, 0);
      }

      int[] var7 = com.aspose.slides.internal.n8e.z7.n5;
      if (com.aspose.slides.internal.n8e.f2.l6() == com.aspose.slides.internal.n8e.z7.l6) {
         try {
            var7 = com.aspose.slides.internal.n8e.f2.l6();
         } catch (IllegalStateException var9) {
            var7 = com.aspose.slides.internal.n8e.z7.n5;
            com.aspose.slides.internal.n8e.v4.n5(var9);
         }
      }

      boolean var8 = var2 != null
         && (
            !Arrays.equals(com.aspose.slides.internal.n8e.w1.n5(), com.aspose.slides.internal.n8e.r4.l6)
               || com.aspose.slides.internal.n8e.j5.n5() == null
               || !(com.aspose.slides.internal.n8e.j5.n5() instanceof com.aspose.slides.internal.n8e.w1)
         )
         && !Arrays.equals(var6, i7t.k5)
         && !Arrays.equals(var7, com.aspose.slides.internal.n8e.z7.l6);
      var1 = var3[0];
      return var8
         ? com.aspose.slides.ms.System.d1.n5(
            com.aspose.slides.ms.System.d1.n5(
               ".master-bg:after{{",
               "content: '{0}';",
               "white-space: pre-wrap;",
               "position: absolute;",
               "display: flex;",
               "align-items: center;",
               "justify-content: center;",
               "width: 90%;",
               "height: 90%;",
               "font-size: 24pt;",
               "font-family: sans-serif;",
               "font-weight: bold;",
               "color: #cfb1abc0;",
               "margin: 5%;",
               "text-shadow: -1px -1px 1px #000000aa;",
               "text-align: center;}}"
            ),
            new Object[]{com.aspose.slides.ms.System.d1.n5("\\a ", var1)}
         )
         : "";
   }

   public final void n5(String var1, String var2, int var3, String var4, int var5, int var6) {
      this.k5 = var4;
      this.n5.n5(var2);
   }

   public final void a6() {
      this.n5.n5(this.k5);
      this.k5 = null;
   }

   public final void n5(String var1, int var2, Object var3, int var4, int var5, boolean var6) {
      this.n5.n5(var1);
      this.n5.n5(var3);
   }

   public final void n5(int var1) {
      this.n5.n5(var1);
   }

   public final void k5(String var1) {
      this.n5.n5(var1);
   }
}
