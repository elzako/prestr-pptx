package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class g1u implements r8k {
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

   public g1u(IParagraph var1, XamlOptions var2) {
      if (var1 == null) {
         String var4 = com.aspose.slides.ms.System.d1.n5("In the '{0}' class was put a parameter '{1}' equal 'null'.",new Object[]{ "XamarinLabelObject", "paragraph"});
         throw new t1c(var4);
      }

      if (var2 == null) {
         String var3 = com.aspose.slides.ms.System.d1.n5("In the '{0}' class was put a parameter '{1}' equal 'null'.",new Object[]{ "XamarinLabelObject", "options"});
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
      com.aspose.slides.internal.o9b.y1 var2 = ((Paragraph)var1).l6().y4();
      if (var2 != null) {
         this.n5(p7f.n5(this.t2, this.t2.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var2.x8()));
         this.n5((float)com.aspose.slides.ms.System.q1.n5((double)(this.u3()), 2));
         this.l6(p7f.n5(this.t2, this.t2.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var2.n3()));
         this.l6((float)com.aspose.slides.ms.System.q1.n5((double)(this.a6()), 2));
         this.k5(p7f.n5(this.t2, this.t2.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var2.s7()));
         this.k5((float)com.aspose.slides.ms.System.q1.n5((double)(this.u9()), 2));
         this.u3(p7f.n5(this.t2, this.t2.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var2.k5()));
         this.u3((float)com.aspose.slides.ms.System.q1.n5((double)(this.h0()), 2));
      }

      IGenericEnumerator var3 = var1.getPortions().iterator();

      try {
         while (var3.hasNext()) {
            IPortion var4 = (IPortion)var3.next();
            IPortionFormat var5 = var4.getPortionFormat();
            IPortionFormatEffectiveData var6 = var5.getEffective();
            String var7 = this.n5(var4.getText());
            com.aspose.slides.internal.o9b.c8 var8 = ((f6a)var6.getFillFormat()).h0().o8();
            com.aspose.slides.internal.o9b.c8 var9 = ((c9g)var6).u9().o8();
            float var10 = com.aspose.slides.internal.v6g.k5.u3(
               p7f.n5(this.t2, this.t2.l6().a6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6(), var6.getFontHeight()), 13
            );
            String var11 = var6.getLatinFont() != null ? var6.getLatinFont().getFontName() : com.aspose.slides.ms.System.d1.n5;
            boolean var12 = var6.getFontUnderline() != 0 && var6.getFontUnderline() != -1;
            if (var6.getHyperlinkClick() != null && var6.getHyperlinkClick().getColorSource() == 0) {
               IMasterTheme var13 = var1.getPresentation().getMasterTheme();
               IColorScheme var14 = var13.getColorScheme();
               ((ColorFormat)var14.getHyperlink()).u3().n5(var8);
               var12 = true;
            }

            h2p var20 = new h2p();
            var20.n5(var11);
            var20.n5(var6.getFontBold());
            var20.n5(var10);
            var20.l6(var6.getFontItalic());
            var20.k5(var12);
            o9z var21 = new o9z();
            var21.n5(var7);
            var21.n5(var8.o8());
            var21.l6(var9.o8());
            var21.n5(var20);
            var21.n5(var6.getHyperlinkClick());
            this.l6().addItem(var21);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      IParagraphFormat var18 = var1.getParagraphFormat();
      IBulletFormat var19 = var18.getBullet();
      if (var19.getType() == 1) {
         this.n5(true);
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

      String var1 = this.s7();
      String var2 = this.t2();
      String var3 = com.aspose.slides.ms.System.d1.n5(
         "<Label LineBreakMode=\"WordWrap\"{0}{1}>\n    <Label.FormattedText>\n        <FormattedString>",new Object[]{ var2, var1
      });
      if (this.k5()) {
         String var4 = this.l6(this.l6().get_Item(0).u3().n5());
         String var5 = this.a6(this.l6().get_Item(0).u3().l6());
         String var6 = this.n5(this.l6().get_Item(0).l6().o8(), "TextColor");
         var3 = com.aspose.slides.ms.System.d1.n5(var3, com.aspose.slides.ms.System.d1.n5("<Span Text=\"{0}\"{1}{2}{3}/>",new Object[]{ this.c8, var4, var5, var6}));
      }

      List$Enumerator var16 = this.l6().iterator();

      try {
         while (var16.hasNext()) {
            o9z var17 = (o9z)var16.next();
            String var18 = this.n5(var17.l6().o8(), "TextColor");
            String var7 = this.l6(var17.u3().n5());
            String var8 = this.a6(var17.u3().l6());
            String var9 = this.n5(var17.u3());
            String var10 = this.l6(var17.u3());
            String var11 = this.n5(var17.k5().o8(), "BackgroundColor");
            if (var17.a6() != null) {
               String var12 = this.n5(var17.a6());
               var3 = com.aspose.slides.ms.System.d1.n5(
                  var3,
                  com.aspose.slides.ms.System.d1.n5("<Span Text=\"{0}\"{1}{2}{3}{4}{5}{6}>{7}</Span>",new Object[]{ var17.n5(), var7, var8, var18, var9, var10, var11, var12})
               );
            } else {
               var3 = com.aspose.slides.ms.System.d1.n5(
                  var3, com.aspose.slides.ms.System.d1.n5("<Span Text=\"{0}\"{1}{2}{3}{4}{5}{6}/>",new Object[]{ var17.n5(), var7, var8, var18, var9, var10, var11})
               );
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var16, IDisposable.class)) {
            var16.dispose();
         }
      }

      return com.aspose.slides.ms.System.d1.n5(var3, "      </FormattedString>\n    </Label.FormattedText>\n</Label>");
   }

   private String t2() {
      return com.aspose.slides.ms.System.d1.n5(
         " AbsoluteLayout.LayoutBounds=\"{0}, {1}, {2}, {3}\"",new Object[]{
         com.aspose.slides.ms.System.n1.n5(this.u3(), com.aspose.slides.internal.x7n.l6.k5()),
         com.aspose.slides.ms.System.n1.n5(this.a6(), com.aspose.slides.internal.x7n.l6.k5()),
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
      }

      String var2 = com.aspose.slides.ms.System.d1.n5(
         " FontAttributes=\"{0}{1}{2}\"",new Object[]{
         var1.k5() ? "Bold" : com.aspose.slides.ms.System.d1.n5,
         var1.k5() && var1.u3() ? ", " : com.aspose.slides.ms.System.d1.n5,
         var1.u3() ? "Italic" : com.aspose.slides.ms.System.d1.n5
      });
      return !var1.k5() && !var1.u3() ? com.aspose.slides.ms.System.d1.n5 : var2;
   }

   private String l6(h2p var1) {
      if (var1 == null) {
         return com.aspose.slides.ms.System.d1.n5;
      } else {
         return var1.a6() ? " TextDecorations=\"Underline\"" : com.aspose.slides.ms.System.d1.n5;
      }
   }

   private String s7() {
      String var1 = this.l6(this.n5());
      return com.aspose.slides.ms.System.d1.n5(" HorizontalTextAlignment=\"{0}\"", new Object[]{var1});
   }

   private String l6(int var1) {
      switch (var1) {
         case 0:
            return "Start";
         case 1:
            return "Center";
         case 2:
            return "End";
         default:
            return "Start";
      }
   }

   private String n5(IHyperlink var1) {
      return com.aspose.slides.ms.System.d1.n5(
         "<Span.GestureRecognizers>\n                    <TapGestureRecognizer Command=\"{0}\" CommandParameter=\"{1}\"/>\n                </Span.GestureRecognizers>",new Object[]{
         "{Binding ClickCommand}",
         var1.getExternalUrl()
      });
   }
}
