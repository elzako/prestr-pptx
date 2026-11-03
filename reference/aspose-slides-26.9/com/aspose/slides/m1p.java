package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class m1p implements r8k {
   private int n5;
   private List<o9z> l6;
   private boolean k5;
   private float u3;
   private float a6;
   private float u9;
   private float h0;
   private String c8;
   private XamlOptions t2;

   public final int n5() {
      return this.n5;
   }

   private void n5(int var1) {
      this.n5 = var1;
   }

   public final List<o9z> l6() {
      return this.l6;
   }

   private void n5(List<o9z> var1) {
      this.l6 = var1;
   }

   public final boolean k5() {
      return this.k5;
   }

   private void n5(boolean var1) {
      this.k5 = var1;
   }

   public final float u3() {
      return this.u3;
   }

   private void n5(float var1) {
      this.u3 = var1;
   }

   public final float a6() {
      return this.a6;
   }

   private void l6(float var1) {
      this.a6 = var1;
   }

   public final float u9() {
      return this.u9;
   }

   private void k5(float var1) {
      this.u9 = var1;
   }

   public final float h0() {
      return this.h0;
   }

   private void u3(float var1) {
      this.h0 = var1;
   }

   @Override
   public String toString() {
      return this.c8();
   }

   public m1p(IParagraph var1, XamlOptions var2) {
      if (var1 == null) {
         String var4 = com.aspose.slides.ms.System.d1.n5("In the '{0}' class was put a parameter '{1}' equal 'null'.",new Object[]{ "WpfTextBoxObject", "paragraph"});
         throw new t1c(var4);
      }

      if (var2 == null) {
         String var3 = com.aspose.slides.ms.System.d1.n5("In the '{0}' class was put a parameter '{1}' equal 'null'.",new Object[]{ "WpfTextBoxObject", "options"});
         throw new t1c(var3);
      }

      this.n5(0.0F);
      this.l6(0.0F);
      this.c8 = "&#x2022; ";
      this.n5(new List<>());
      this.t2 = var2;
      this.n5(var1);
   }

   private void n5(IParagraph var1) {
      this.n5(var1.getParagraphFormat().getAlignment());
      IParagraphFormat var2 = var1.getParagraphFormat();
      IBulletFormat var3 = var2.getBullet();
      if (var3.getType() == 1) {
         this.n5(true);
      }

      com.aspose.slides.internal.o9b.y1 var4 = ((Paragraph)var1).l6().y4();
      if (var4 != null) {
         if (this.k5()) {
            this.n5(p7f.n5(this.t2, this.t2.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var4.x8()) - 40.0F);
         } else {
            this.n5(p7f.n5(this.t2, this.t2.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var4.x8()));
         }

         this.n5((float)com.aspose.slides.ms.System.q1.n5((double)(this.u3()), 2));
         this.l6(p7f.n5(this.t2, this.t2.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var4.n3()));
         this.l6((float)com.aspose.slides.ms.System.q1.n5((double)(this.a6()), 2));
         if (this.k5()) {
            this.k5(p7f.n5(this.t2, this.t2.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var4.s7()) + 1.0F + 40.0F);
         } else {
            this.k5(p7f.n5(this.t2, this.t2.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var4.s7()) + 1.0F);
         }

         this.k5((float)com.aspose.slides.ms.System.q1.n5((double)(this.u9()), 2));
         this.u3(p7f.n5(this.t2, this.t2.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var4.k5()));
         this.u3((float)com.aspose.slides.ms.System.q1.n5((double)(this.h0()), 2));
      }

      IGenericEnumerator var5 = var1.getPortions().iterator();

      try {
         while (var5.hasNext()) {
            IPortion var6 = (IPortion)var5.next();
            IPortionFormat var7 = var6.getPortionFormat();
            IPortionFormatEffectiveData var8 = var7.getEffective();
            String var9 = this.n5(var6.getText());
            com.aspose.slides.internal.o9b.c8 var10 = ((f6a)var8.getFillFormat()).h0().o8();
            com.aspose.slides.internal.o9b.c8 var11 = ((c9g)var8).u9().o8();
            float var12 = com.aspose.slides.internal.v6g.k5.u3(
               p7f.n5(this.t2, this.t2.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var8.getFontHeight()), 13
            );
            var12 = (float)com.aspose.slides.ms.System.q1.n5((double)(var12), 2);
            String var13 = var8.getLatinFont() != null ? var8.getLatinFont().getFontName() : com.aspose.slides.ms.System.d1.n5;
            boolean var14 = var8.getFontUnderline() != 0 && var8.getFontUnderline() != -1;
            if (var8.getHyperlinkClick() != null && var8.getHyperlinkClick().getColorSource() == 0) {
               IMasterTheme var15 = var1.getPresentation().getMasterTheme();
               IColorScheme var16 = var15.getColorScheme();
               ((ColorFormat)var16.getHyperlink()).u3().n5(var10);
               var14 = true;
            }

            h2p var21 = new h2p();
            var21.n5(var13);
            var21.n5(var8.getFontBold());
            var21.n5(var12);
            var21.l6(var8.getFontItalic());
            var21.k5(var14);
            o9z var22 = new o9z();
            var22.n5(var9);
            var22.n5(var10.o8());
            var22.l6(var11.o8());
            var22.n5(var21);
            var22.n5(var8.getHyperlinkClick());
            this.l6().addItem(var22);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }
   }

   private String n5(String var1) {
      String var2 = com.aspose.slides.ms.System.d1.n5(var1, "\"", "&quot;");
      var2 = com.aspose.slides.ms.System.d1.n5(var2, "<", "&lt;");
      var2 = com.aspose.slides.ms.System.d1.n5(var2, ">", "&gt;");
      var2 = com.aspose.slides.ms.System.d1.n5(var2, "&", "&amp;");
      var2 = com.aspose.slides.ms.System.d1.n5(var2, "'", "&apos;");
      return com.aspose.slides.ms.System.d1.n5(var2, "\u000b", "");
   }

   private String c8() {
      if (this.l6().size() < 1) {
         return com.aspose.slides.ms.System.d1.n5;
      }

      String var1 = this.x8();
      String var2 = this.t2();
      String var3 = this.s7();
      String var4 = com.aspose.slides.ms.System.d1.n5("<TextBlock TextWrapping=\"Wrap\"{0}{1}{2}>",new Object[]{ var2, var3, var1});
      if (this.k5()) {
         String var5 = this.l6(this.l6().get_Item(0).u3().n5());
         String var6 = this.a6(this.l6().get_Item(0).u3().l6());
         String var7 = this.n5(this.l6().get_Item(0).l6().o8(), "Foreground");
         var4 = com.aspose.slides.ms.System.d1.n5(var4, com.aspose.slides.ms.System.d1.n5("<Run Text=\"{0}\"{1}{2}{3}/>",new Object[]{ this.c8, var5, var6, var7}));
      }

      List$Enumerator var17 = this.l6().iterator();

      try {
         while (var17.hasNext()) {
            o9z var18 = (o9z)var17.next();
            String var19 = this.l6(var18.u3().n5());
            String var8 = this.a6(var18.u3().l6());
            String var9 = this.n5(var18.l6().o8(), "Foreground");
            String var10 = this.n5(var18.u3());
            String var11 = this.l6(var18.u3());
            String var12 = this.k5(var18.u3());
            String var13 = this.n5(var18.k5().o8(), "Background");
            if (var18.a6() != null) {
               var4 = com.aspose.slides.ms.System.d1.n5(
                  var4,
                  com.aspose.slides.ms.System.d1.n5(
                     "<Hyperlink NavigateUri=\"{0}\"><Run Text=\"{1}\"{2}{3}{4}{5}{6}{7}{8}/></Hyperlink>",new Object[]{
                     var18.a6().getExternalUrl(),
                     var18.n5(),
                     var19,
                     var8,
                     var9,
                     var10,
                     var11,
                     var12,
                     var13
                  })
               );
            } else {
               var4 = com.aspose.slides.ms.System.d1.n5(
                  var4,
                  com.aspose.slides.ms.System.d1.n5("<Run Text=\"{0}\"{1}{2}{3}{4}{5}{6}{7}/>",new Object[]{ var18.n5(), var19, var8, var9, var10, var11, var12, var13})
               );
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var17, IDisposable.class)) {
            var17.dispose();
         }
      }

      return com.aspose.slides.ms.System.d1.n5(var4, "</TextBlock>");
   }

   private String t2() {
      return com.aspose.slides.ms.System.d1.n5(
         " Margin=\"{0}, {1}\"",new Object[]{
         com.aspose.slides.ms.System.n1.n5(this.u3(), com.aspose.slides.internal.x7n.l6.k5()),
         com.aspose.slides.ms.System.n1.n5(this.a6(), com.aspose.slides.internal.x7n.l6.k5())
      });
   }

   private String s7() {
      return com.aspose.slides.ms.System.d1.n5(
         " Width=\"{0}\" Height=\"{1}\"",new Object[]{
         com.aspose.slides.ms.System.n1.n5(this.u9(), com.aspose.slides.internal.x7n.l6.k5()),
         com.aspose.slides.ms.System.n1.n5(this.h0(), com.aspose.slides.internal.x7n.l6.k5())
      });
   }

   private String l6(String var1) {
      return com.aspose.slides.ms.System.d1.n5(var1)
         ? com.aspose.slides.ms.System.d1.n5
         : com.aspose.slides.ms.System.d1.n5(" FontFamily=\"{0}\"", new Object[]{var1});
   }

   private String a6(float var1) {
      return com.aspose.slides.ms.System.n1.k5(var1)
         ? com.aspose.slides.ms.System.d1.n5
         : com.aspose.slides.ms.System.d1.n5(" FontSize=\"{0}\"", new Object[]{com.aspose.slides.ms.System.n1.n5(var1, com.aspose.slides.internal.x7n.l6.k5())});
   }

   private String n5(com.aspose.slides.internal.o9b.c8 var1, String var2) {
      return var1 != null && !com.aspose.slides.internal.o9b.c8.n5(var1, com.aspose.slides.internal.o9b.c8.u3)
         ? com.aspose.slides.ms.System.d1.n5(
            " {0}=\"#{1}{2}{3}{4}\"",new Object[]{
            var2,
            com.aspose.slides.ms.System.e2.n5(var1.s7(), "X2"),
            com.aspose.slides.ms.System.e2.n5(var1.x8(), "X2"),
            com.aspose.slides.ms.System.e2.n5(var1.n3(), "X2"),
            com.aspose.slides.ms.System.e2.n5(var1.y4(), "X2")
         })
         : com.aspose.slides.ms.System.d1.n5;
   }

   private String n5(h2p var1) {
      if (var1 == null) {
         return com.aspose.slides.ms.System.d1.n5;
      } else {
         return var1.k5() ? " FontWeight=\"Bold\"" : com.aspose.slides.ms.System.d1.n5;
      }
   }

   private String l6(h2p var1) {
      if (var1 == null) {
         return com.aspose.slides.ms.System.d1.n5;
      } else {
         return var1.u3() ? " FontStyle=\"Italic\"" : com.aspose.slides.ms.System.d1.n5;
      }
   }

   private String k5(h2p var1) {
      if (var1 == null) {
         return com.aspose.slides.ms.System.d1.n5;
      } else {
         return var1.a6() ? " TextDecorations=\"Underline\"" : com.aspose.slides.ms.System.d1.n5;
      }
   }

   private String x8() {
      String var1 = this.l6(this.n5());
      return com.aspose.slides.ms.System.d1.n5(" HorizontalAlignment=\"{0}\" VerticalAlignment=\"Top\"", new Object[]{var1});
   }

   private String l6(int var1) {
      switch (var1) {
         case 0:
            return "Left";
         case 1:
            return "Center";
         case 2:
            return "Right";
         default:
            return "Left";
      }
   }
}
