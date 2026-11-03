package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.UriFormatException;
import com.aspose.slides.ms.System.IDisposable;
import java.awt.geom.Rectangle2D.Float;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

public final class Paragraph implements IParagraph, r0g {
   t6s n5;
   private ParagraphFormat l6 = new ParagraphFormat(this);
   private PortionFormat k5;
   private boolean u3;
   private ParagraphCollection a6;
   private final PortionCollection u9 = new PortionCollection(this);
   private IPresentationComponent h0;
   private ISlideComponent c8;
   private Portion t2;

   public Paragraph() {
      this.n5 = new t6s(this);
   }

   public Paragraph(Paragraph para) {
      this();
      this.n5(para);
   }

   @Override
   public final IPortionCollection getPortions() {
      return this.u9;
   }

   @Override
   public final IParagraphFormat getParagraphFormat() {
      return this.l6;
   }

   final ParagraphFormat n5() {
      return this.l6;
   }

   @Override
   public final void joinPortionsWithSameFormatting() {
      int var1 = 0;

      while (var1 < this.getPortions().getCount() - 1) {
         IPortion var2 = this.getPortions().get_Item(var1);
         IPortion var3 = this.getPortions().get_Item(var1 + 1);
         boolean var4 = var3.getPortionFormat().getSmartTagClean();
         var3.getPortionFormat().setSmartTagClean(var2.getPortionFormat().getSmartTagClean());

         try {
            if (var2.getField() == null && var3.getField() == null && var2.getPortionFormat().equals(var3.getPortionFormat())) {
               var2.setText(com.aspose.slides.ms.System.d1.n5(new String[]{var2.getText(), this.getPortions().get_Item(var1 + 1).getText()}));
               this.getPortions().removeAt(var1 + 1);
               var3 = null;
            } else {
               var1++;
            }
         } finally {
            if (var3 != null) {
               var3.getPortionFormat().setSmartTagClean(var4);
            }
         }
      }
   }

   @Override
   public final String getText() {
      s4e var1 = null;
      if (this.n3() != null && this.n3().getPresentation() != null) {
         var1 = (s4e)((Presentation)this.n3().getPresentation()).t4();
      }

      Object var2 = null;
      String[] var3 = new String[]{(String)var2};
      String[] var4 = null;
      String[][] var5 = new String[][]{var4};
      byte[] var6 = null;
      byte[][] var7 = new byte[][]{var6};
      int[] var8 = Presentation.n5(var1, var7);
      var6 = var7[0];
      var5[0] = com.aspose.slides.internal.n8e.w1.u3();
      if (Arrays.equals(var8, i7t.l6) && var6 != null && var6.length > 0) {
         var5[0] = com.aspose.slides.ms.System.d1.n5(Presentation.n5(var6), new String[]{"\r\n", "\n", "\r", "\n\r"}, 0);
      }

      int[] var9 = com.aspose.slides.internal.n8e.z7.n5;
      if (com.aspose.slides.internal.n8e.f2.l6() == com.aspose.slides.internal.n8e.z7.l6) {
         try {
            var9 = com.aspose.slides.internal.n8e.f2.l6();
         } catch (IllegalStateException var11) {
            var9 = com.aspose.slides.internal.n8e.z7.n5;
            com.aspose.slides.internal.n8e.v4.n5(var11);
         }
      }

      var4 = var5[0];
      var3[0] = com.aspose.slides.ms.System.d1.n5(" ", var4);
      return (
               !Arrays.equals(com.aspose.slides.internal.n8e.w1.n5(), com.aspose.slides.internal.n8e.r4.l6)
                  || com.aspose.slides.internal.n8e.j5.n5() == null
                  || !(com.aspose.slides.internal.n8e.j5.n5() instanceof com.aspose.slides.internal.n8e.w1)
            )
            && !Arrays.equals(var8, i7t.k5)
            && !Arrays.equals(var9, com.aspose.slides.internal.n8e.z7.l6)
            && !Arrays.equals(var8, i7t.l6)
         ? com.aspose.slides.internal.n8e.w1.n5(this.u3())
         : this.u3();
   }

   @Override
   public final void setText(String value) {
      if (com.aspose.slides.ms.System.d1.n5(value, ParagraphCollection.n5) != -1) {
         throw new PptxException("Can't assign string which contains paragraph break character");
      }

      PortionFormat var2 = null;
      if (this.getPortions().getCount() > 0) {
         var2 = (PortionFormat)this.getPortions().get_Item(0).getPortionFormat();
      }

      this.getPortions().clear();
      if (var2 == null) {
         this.getPortions().add(new Portion(value));
      } else {
         Portion var3 = new Portion(var2);
         var3.setText(value);
         this.getPortions().add(var3);
      }
   }

   @Override
   public final Float getRect() {
      return com.aspose.slides.internal.o9b.y1.u9(this.l6());
   }

   com.aspose.slides.internal.o9b.y1 l6() {
      return this.n5.l6();
   }

   @Override
   public final int getLinesCount() {
      return this.n5.n5();
   }

   @Override
   public final IImage getImage() {
      return this.getImage(1.0F, 1.0F);
   }

   @Override
   public final IImage getImage(float scaleX, float scaleY) {
      return u4i.n5(this.n5.n5(scaleX, scaleY));
   }

   @Override
   public final IPortionFormat getEndParagraphPortionFormat() {
      return this.k5;
   }

   @Override
   public final void setEndParagraphPortionFormat(IPortionFormat value) {
      this.k5 = (PortionFormat)value;
      Portion var2 = new Portion();
      var2.l6 = this.k5;
      this.t2 = var2;
      if (this.k5.getParent_Immediate() == null) {
         this.t2.n5((PortionCollection)this.getPortions());
      }

      this.z1();
   }

   final IPortionFormat k5() {
      if (this.k5 == null) {
         return null;
      }

      Portion var1 = new Portion();
      var1.l6 = this.k5;
      this.t2 = var1;
      this.t2.n5((PortionCollection)this.getPortions());
      this.z1();
      return this.k5;
   }

   Paragraph(ParagraphFormat paraFormat) {
      this.l6.n5(paraFormat);
   }

   final void n5(Paragraph var1) {
      this.l6.n5((ParagraphFormat)var1.getParagraphFormat());
      this.u3 = var1.u3;
      this.k5 = var1.k5;
      IGenericEnumerator var2 = var1.getPortions().iterator();

      try {
         while (var2.hasNext()) {
            Portion var3 = (Portion)var2.next();
            MathPortion var4 = com.aspose.slides.internal.v6g.k5.n5(var3, MathPortion.class);
            if (var4 != null) {
               this.u9.add(new MathPortion(var4));
            } else {
               this.u9.add(new Portion(var3));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   final void l6(Paragraph var1) {
      this.l6.n5(var1.l6);
      this.t9();
   }

   final String u3() {
      String var1 = "";

      for (int var2 = 0; var2 < this.u9.getCount(); var2++) {
         var1 = com.aspose.slides.ms.System.d1.n5(var1, ((Portion)this.u9.get_Item(var2)).u9());
      }

      return var1;
   }

   final boolean a6() {
      return this.u3;
   }

   final void n5(boolean var1) {
      this.u3 = var1;
      this.u9();
   }

   final void u9() {
      this.t9();
   }

   final void n5(IPortionFormat var1) {
      this.t9();
   }

   private void t9() {
      if (this.a6 != null) {
         this.a6.l6(this);
      }
   }

   final Paragraph n5(IParagraphFormat var1) {
      Paragraph var2 = new Paragraph((ParagraphFormat)var1);
      this.l6.l6(var2.l6);
      var2.u3 = this.u3;
      if (this.u9.getCount() > 0) {
         for (int var3 = 0; var3 < this.u9.getCount(); var3++) {
            var2.u9.add(((Portion)this.u9.get_Item(var3)).n5(var2.l6.u3()));
         }
      } else {
         var2.u9.add(new Portion(var2.l6.u3()));
      }

      return var2;
   }

   final int h0() {
      ParagraphCollection var1 = this.x8();
      return var1 != null ? var1.n5(this) : -1;
   }

   final void c8() {
      int var1 = 0;

      while (var1 < this.getPortions().getCount()) {
         com.aspose.slides.ms.System.r8 var2 = null;
         int var3 = 0;
         int var4 = 0;
         int[] var5 = new int[]{0};
         int[] var6 = new int[]{0};
         com.aspose.slides.ms.System.r8[] var7 = new com.aspose.slides.ms.System.r8[]{var2};
         this.n5(var1, var5, var6, var7);
         var3 = var5[0];
         var4 = var6[0];
         var2 = var7[0];
         if (var2 != null && var3 >= 0 && var4 >= 0) {
            Hyperlink var8 = (Hyperlink)this.n5(var3, var4);
            if (var8 != null
               && !com.aspose.slides.ms.System.d1.n5(var8.getExternalUrlOriginal())
               && !com.aspose.slides.ms.System.d1.l6(var8.getExternalUrlOriginal(), "mailto")) {
               this.n5(var3, var4, var2, var8);
            }
         }

         if (var4 == -1) {
            break;
         }

         var1 = var4 + 1;
      }
   }

   private void n5(int var1, int var2, com.aspose.slides.ms.System.r8 var3, Hyperlink var4) {
      if (var3 == null) {
         throw new ArgumentNullException("uri");
      }

      if (var4 == null) {
         throw new ArgumentNullException("hyperlink");
      }

      if (var1 < 0) {
         throw new ArgumentException("startPortionIndex");
      }

      if (var2 < var1) {
         throw new ArgumentException("lastPortionIndex");
      }

      com.aspose.slides.ms.System.r8 var5;
      try {
         var5 = com.aspose.slides.ms.System.r8.n5(new URI(var4.getExternalUrlOriginal()));
      } catch (UriFormatException var10) {
         com.aspose.slides.internal.n8e.v4.n5(var10);
         return;
      } catch (URISyntaxException var11) {
         com.aspose.slides.internal.n8e.v4.n5(var11);
         return;
      }

      if (!com.aspose.slides.ms.System.r8.n5(var3, var5)) {
         String var6 = com.aspose.slides.ms.System.d1.n5;
         if (!var3.z3() || !com.aspose.slides.ms.System.d1.n5(var3.n3()) && !com.aspose.slides.ms.System.d1.a6("/", var3.n3())) {
            if (!var3.z3()) {
               var6 = com.aspose.slides.ms.System.d1.n5(new String[]{var5.a6(), "/".equals(var5.n3()) ? "" : var5.n3()});
            }
         } else {
            var6 = var4.getExternalUrlOriginal();
         }

         if (!com.aspose.slides.ms.System.d1.n5(var6)) {
            IPortion var7 = this.getPortions().get_Item(var1);
            var7.setText(var6);
            if (var1 < var2) {
               for (int var8 = var1 + 1; var8 <= var2; var8++) {
                  IPortion var9 = this.getPortions().get_Item(var8);
                  var9.setText("");
                  ((PortionFormat)var9.getPortionFormat()).n5((BasePortionFormat)var7.getPortionFormat());
               }
            }
         }
      }
   }

   private IHyperlink n5(int var1, int var2) {
      for (int var3 = var1; var3 <= var2; var3++) {
         if (this.getPortions().get_Item(var3).getPortionFormat().getHyperlinkClick() != null) {
            return this.getPortions().get_Item(var3).getPortionFormat().getHyperlinkClick();
         }
      }

      return null;
   }

   private void n5(int var1, int[] var2, int[] var3, com.aspose.slides.ms.System.r8[] var4) {
      var4[0] = null;
      var2[0] = var3[0] = -1;
      if (var1 >= 0 && var1 < this.getPortions().getCount()) {
         com.aspose.slides.internal.l7h.a5 var5 = new com.aspose.slides.internal.l7h.a5();

         for (int var6 = var1; var6 < this.getPortions().getCount(); var6++) {
            if (this.getPortions().get_Item(var6).getPortionFormat().getHyperlinkClick() == null) {
               if (var2[0] == -1) {
                  var2[0] = var6;
                  var3[0] = var6;
               }
               break;
            }

            String var7 = com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.n5(this.getPortions().get_Item(var6).getText(), "\u000b", ""));
            if (var4[0] != null && !"".equals(var7)) {
               var3[0] = var6;
            }

            if (!"".equals(var7)) {
               var5.n5(this.getPortions().get_Item(var6).getText());
               if (var6 == var1) {
                  if (com.aspose.slides.ms.System.d1.l6(this.getPortions().get_Item(var6).getText(), "www.")) {
                     if (!com.aspose.slides.ms.System.r8.n5(var5.toString(), 0, var4)) {
                        return;
                     }
                  } else if (!com.aspose.slides.ms.System.r8.n5(var5.toString(), 1, var4)
                     && !com.aspose.slides.ms.System.d1.l6(this.getPortions().get_Item(var6).getText(), "http")) {
                     return;
                  }
               } else if (!com.aspose.slides.ms.System.r8.n5(var5.toString(), 0, var4)) {
                  return;
               }

               if (var6 == this.getPortions().getCount()) {
                  return;
               }

               if (var2[0] == -1) {
                  var2[0] = var6;
               }

               var3[0] = var6;
            }
         }
      }
   }

   private void z1() {
      this.k5.n5(this.t2);
   }

   final void t2() {
      if (this.x8() == null) {
         throw new InvalidOperationException("Paragraph should be assigned to the ParagraphCollection");
      }

      if (this.x8().k5() == null) {
         throw new InvalidOperationException("Paragraph should be assigned to the TextFrame");
      }
   }

   final boolean s7() {
      if (this.n5().h0()) {
         return true;
      }

      if (this.k5 != null && this.k5.n3()) {
         return true;
      }

      IGenericEnumerator var1 = this.getPortions().iterator();

      try {
         while (var1.hasNext()) {
            Portion var2 = (Portion)var1.next();
            if (var2.c8()) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return false;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.a6;
   }

   final ParagraphCollection x8() {
      return this.a6;
   }

   final void n5(ParagraphCollection var1) {
      if (!com.aspose.slides.ms.System.j8.l6(var1, this.a6)) {
         this.a6 = var1;
         this.h0 = null;
         this.c8 = null;
      }
   }

   final IPresentationComponent n3() {
      if (this.h0 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.h0};
         d0u.n5(IPresentationComponent.class, this.a6, var1);
         this.h0 = var1[0];
      }

      return this.h0;
   }

   final ISlideComponent y4() {
      if (this.c8 == null) {
         ISlideComponent[] var1 = new ISlideComponent[]{this.c8};
         d0u.n5(ISlideComponent.class, this.a6, var1);
         this.c8 = var1[0];
      }

      return this.c8;
   }

   final void e2() {
      this.l6.z1();
      IGenericEnumerator var1 = this.getPortions().iterator();

      try {
         while (var1.hasNext()) {
            Portion var2 = (Portion)var1.next();
            var2.y4();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   @Override
   public final IBaseSlide getSlide() {
      return this.y4() != null ? this.y4().getSlide() : null;
   }

   @Override
   public final IPresentation getPresentation() {
      return this.n3() != null ? this.n3().getPresentation() : null;
   }
}
