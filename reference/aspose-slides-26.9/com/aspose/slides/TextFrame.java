package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.ms.System.IDisposable;
import java.awt.Color;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;

public final class TextFrame implements ITextFrame, r0g {
   private final r0g u9;
   private IPresentationComponent h0;
   private ISlideComponent c8;
   final TextFrameFormat n5;
   private final ParagraphCollection t2;
   private IParagraphFormat[] s7;
   private int x8 = -1;
   r0s l6;
   private HyperlinkQueries n3;
   final m1y k5 = new m1y();
   final f1z u3;
   private boolean y4;
   private TextFrame e2;
   private boolean t9;
   static final com.aspose.slides.internal.n8e.k8<Byte, Integer> a6 = new com.aspose.slides.internal.n8e.k8<>();

   TextFrame(r0g parentImmediate) {
      if (parentImmediate == null) {
         throw new ArgumentNullException();
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(parentImmediate, AutoShape.class)
         && !com.aspose.slides.internal.v6g.k5.l6(parentImmediate, Cell.class)
         && !com.aspose.slides.internal.v6g.k5.l6(parentImmediate, IOverridableText.class)
         && !com.aspose.slides.internal.v6g.k5.l6(parentImmediate, SmartArtShape.class)) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"Incorrect type of parent ISlideComponent: ", com.aspose.slides.ms.System.j8.n5(parentImmediate).q0()})
         );
      }

      this.u9 = parentImmediate;
      this.n5 = new TextFrameFormat(this);
      this.t2 = new ParagraphCollection(this);
      this.l6(true);
      this.u3 = new n6p(this);
   }

   static boolean n5(TextFrame var0) {
      boolean var1 = false;
      boolean var2 = false;
      IGenericEnumerator var3 = var0.getParagraphs().iterator();

      try {
         while (var3.hasNext()) {
            IParagraph var4 = (IParagraph)var3.next();
            IGenericEnumerator var5 = var4.getPortions().iterator();

            try {
               while (var5.hasNext()) {
                  IPortion var6 = (IPortion)var5.next();
                  MathPortion var7 = com.aspose.slides.internal.v6g.k5.n5(var6, MathPortion.class);
                  if (var7 != null) {
                     var1 = true;
                  } else {
                     var2 = true;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  var5.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var1 && var2;
   }

   static boolean l6(TextFrame var0) {
      boolean var1 = false;
      IGenericEnumerator var2 = var0.getParagraphs().iterator();

      try {
         while (var2.hasNext()) {
            IParagraph var3 = (IParagraph)var2.next();
            IGenericEnumerator var4 = var3.getPortions().iterator();

            try {
               while (var4.hasNext()) {
                  IPortion var5 = (IPortion)var4.next();
                  MathPortion var6 = com.aspose.slides.internal.v6g.k5.n5(var5, MathPortion.class);
                  if (var6 != null) {
                     return true;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return false;
   }

   final void n5(ITextFrame var1) {
      TextFrame var2 = com.aspose.slides.internal.v6g.k5.n5(var1, TextFrame.class);
      if (var2 != null) {
         this.k5(var2);
         this.u3(var2);
      }
   }

   final void l6(ITextFrame var1) {
      if (var1 == null) {
         throw new ArgumentNullException("source");
      }

      this.n5(var1);

      for (int var2 = 0; var2 < var1.getParagraphs().getCount(); var2++) {
         Paragraph var3 = (Paragraph)var1.getParagraphs().get_Item(var2);
         Paragraph var4 = (Paragraph)this.getParagraphs().get_Item(var2);
         var4.l6(var3);

         for (int var5 = 0; var5 < var3.getPortions().getCount(); var5++) {
            Portion var6 = (Portion)var3.getPortions().get_Item(var5);
            Portion var7 = (Portion)var4.getPortions().get_Item(var5);
            var7.n5(var6);
         }
      }
   }

   final boolean n5() {
      return this.y4;
   }

   final void n5(boolean var1) {
      this.y4 = var1;
   }

   final void k5(TextFrame var1) {
      this.n5.n5(var1.n5);
   }

   final void u3(TextFrame var1) {
      this.t2.clear();
      IGenericEnumerator var2 = var1.t2.iterator();

      try {
         while (var2.hasNext()) {
            Paragraph var3 = (Paragraph)var2.next();
            this.t2.add(new Paragraph(var3));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.u9;
   }

   final IPresentationComponent l6() {
      if (this.h0 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.h0};
         d0u.n5(IPresentationComponent.class, this.u9, var1);
         this.h0 = var1[0];
      }

      return this.h0;
   }

   final ISlideComponent k5() {
      if (this.c8 == null) {
         ISlideComponent[] var1 = new ISlideComponent[]{this.c8};
         d0u.n5(ISlideComponent.class, this.u9, var1);
         this.c8 = var1[0];
      }

      return this.c8;
   }

   final TextFrame u3() {
      return this.e2;
   }

   final void a6(TextFrame var1) {
      this.e2 = var1;
   }

   final i2h a6() {
      GeometryShape var1 = (GeometryShape)this.getParent_Immediate();
      return this.n5(var1);
   }

   final i2h n5(Shape var1) {
      ITextFrameFormatEffectiveData var2 = this.n5.getEffective();
      i2h var3 = new i2h();
      var3.l6 = (float)var2.getMarginLeft();
      var3.k5 = (float)var2.getMarginTop();
      var3.u3 = (float)var2.getMarginRight();
      var3.a6 = (float)var2.getMarginBottom();
      if (var3.l6()) {
         return var3;
      }

      Shape[] var4 = var1.f2();

      for (int var5 = 0; var5 < var4.length; var5++) {
         Shape var6 = var4[var5];
         TextFrame var7 = null;
         if (com.aspose.slides.internal.v6g.k5.l6(var6, AutoShape.class)) {
            var7 = ((AutoShape)var6).l6();
         } else if (com.aspose.slides.internal.v6g.k5.l6(var6, SmartArtShape.class)) {
            var7 = ((SmartArtShape)var6).k5();
         }

         if (var7 != null) {
            var3.n5(var7.n5.u3().n5().k5()).l6(var3);
            if (var3.l6()) {
               return var3;
            }
         }
      }

      return var3.n5(new i2h(7.2F, 3.6F, 7.2F, 3.6F));
   }

   final IParagraphFormat[] n5(r0s[] var1) {
      var1[0] = null;
      BaseSlide var2 = null;
      IPlaceholder var3 = null;
      IShapeStyle var4 = null;
      Shape[] var5 = new Shape[0];
      if (com.aspose.slides.internal.v6g.k5.l6(this.u9, GeometryShape.class)) {
         GeometryShape var6 = (GeometryShape)this.u9;
         var2 = (BaseSlide)((GeometryShape)this.u9).getSlide();
         var3 = var6.getPlaceholder();
         var4 = var6.getShapeStyle();
         var5 = var6.f2();
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.u9, Cell.class)) {
         Cell var15 = (Cell)this.u9;
         Table var7 = var15.u9().n5();
         var2 = (BaseSlide)var7.getSlide();
      }

      if (var2 == null) {
         return null;
      }

      ParagraphFormat[] var16 = new ParagraphFormat[9];
      Presentation var17 = (Presentation)this.getPresentation();
      MasterSlide var8 = n5(var2);
      if (var17 == null) {
         throw new NullReferenceException("Presentation couldn't be empty.");
      }

      ITextStyle var9 = var17.k5;
      if (var8 != null && var3 != null) {
         int var10 = a6.l6(var3.getType());
         switch (var10) {
            case 1:
               var9 = var8.getTitleStyle();
               break;
            case 2:
               var9 = var8.getBodyStyle();
               break;
            case 3:
               var9 = var8.getOtherStyle();
         }
      }

      for (int var18 = 0; var18 < var16.length; var18++) {
         var16[var18] = (ParagraphFormat)var9.getLevel(var18);
      }

      ParagraphFormat var19 = new ParagraphFormat((ParagraphFormat)var9.getDefaultParagraphFormat(), this);
      if (var4 != null) {
         this.n5(var4, var2, var19, var9, var16, var1);
      }

      for (int var11 = var5.length - 1; var11 >= 0; var11--) {
         GeometryShape var12 = com.aspose.slides.internal.v6g.k5.n5(var5[var11], GeometryShape.class);
         if (var12 != null) {
            TextFrame var13 = null;
            if (com.aspose.slides.internal.v6g.k5.l6(var12, AutoShape.class)) {
               var13 = ((AutoShape)var12).l6();
            } else if (com.aspose.slides.internal.v6g.k5.l6(var12, SmartArtShape.class)) {
               var13 = ((SmartArtShape)var12).k5();
            }

            if (var13 != null) {
               if (var12.getShapeStyle() != null) {
                  this.n5(var12.getShapeStyle(), var2, var19, var9, var16, var1);
               }

               for (int var14 = 0; var14 < var16.length; var14++) {
                  var16[var14] = var13.n5.h0().l6(var14, var16[var14]);
               }

               var19 = var13.n5.h0().n5(var19);
            }
         }
      }

      for (int var22 = 0; var22 < var16.length; var22++) {
         var16[var22] = this.n5.h0().l6(var22, var16[var22]);
      }

      var19 = this.n5.h0().n5(var19);
      var19 = var19.u3(Presentation.u9);

      for (int var23 = 0; var23 < var16.length; var23++) {
         var16[var23] = var16[var23] == null ? var19 : var16[var23].u3(Presentation.u9);
      }

      return var16;
   }

   private void n5(IShapeStyle var1, BaseSlide var2, ParagraphFormat var3, ITextStyle var4, ParagraphFormat[] var5, r0s[] var6) {
      if (var1.getFontColor().getColorType() != -1) {
         IFillFormat var7 = var3.u3().getFillFormat();
         var6[0] = ((ColorFormat)var1.getFontColor()).t2();
         var7.setFillType((byte)1);
         var7.getSolidFillColor().copyFrom(var1.getFontColor());
         var7.getSolidFillColor().copyFrom(var1.getFontColor());

         for (int var8 = 0; var8 < var5.length; var8++) {
            if (var5[var8] != null) {
               var5[var8] = new ParagraphFormat((ParagraphFormat)var4.getLevel(var8), this);
               var7 = var5[var8].u3().getFillFormat();
               var7.setFillType((byte)1);
               var7.getSolidFillColor().copyFrom(var1.getFontColor());
            }
         }
      }

      IFontsEffectiveData var10 = null;
      switch (var1.getFontCollectionIndex()) {
         case 1:
            var10 = var2.h0().createThemeEffective().getFontScheme().getMinor();
            break;
         case 2:
            var10 = var2.createThemeEffective().getFontScheme().getMajor();
      }

      if (var10 != null) {
         var3.u3().setLatinFont(var10.getLatinFont());
         var3.u3().setEastAsianFont(var10.getEastAsianFont());
         var3.u3().setComplexScriptFont(var10.getComplexScriptFont());

         for (int var11 = 0; var11 < var5.length; var11++) {
            if (var5[var11] != null) {
               var5[var11].u3().setLatinFont(var10.getLatinFont());
               var5[var11].u3().setEastAsianFont(var10.getEastAsianFont());
               var5[var11].u3().setComplexScriptFont(var10.getComplexScriptFont());
            }
         }
      }
   }

   final void n5(TextFrame[] var1, TextFrame var2) {
      TextFrameFormat var3 = (TextFrameFormat)var2.getTextFrameFormat();
      var3.setTextVerticalType(this.n5.y1());
      int var4 = this.n5.getColumnCount();
      double var5 = this.n5.getColumnSpacing();
      byte var7 = this.n5.getWrapText();
      byte var8 = this.n5.getAnchoringType();
      byte var9 = this.n5.getCenterText();
      if (var1 != null) {
         for (int var10 = 0; var10 < var1.length; var10++) {
            if (var4 == 0) {
               var4 = var1[var10].n5.getColumnCount();
            }

            if (com.aspose.slides.ms.System.d2.k5(var5)) {
               var5 = var1[var10].n5.getColumnSpacing();
            }

            if (var7 == -1) {
               var7 = var1[var10].n5.getWrapText();
            }

            if (var8 == -1) {
               var8 = var1[var10].n5.getAnchoringType();
            }

            if (var9 == -1) {
               var9 = var1[var10].n5.getCenterText();
            }
         }
      }

      var3.setColumnCount(var4);
      var3.setColumnSpacing(var5);
      var3.setWrapText(var7);
      var3.setAnchoringType(var8);
      var3.setCenterText(var9);
      IParagraphFormat[] var12 = this.u9();

      for (int var11 = 0; var11 < var12.length; var11++) {
         ((TextStyle)var2.getTextFrameFormat().getTextStyle()).n5(var11 + 1, (ParagraphFormat)var12[var11]);
      }
   }

   final IParagraphFormat[] u9() {
      if (this.s7 == null || this.x8 != this.n5.y2()) {
         if (this.u9 != null) {
            if (!com.aspose.slides.internal.v6g.k5.l6(this.u9, AutoShape.class) && !com.aspose.slides.internal.v6g.k5.l6(this.u9, SmartArtShape.class)) {
               BaseSlide var6 = com.aspose.slides.internal.v6g.k5.n5(this.u9, BaseSlide.class);
               if (var6 != null) {
                  r0s[] var2 = new r0s[]{this.l6};
                  this.s7 = this.n5(var6, var2);
                  this.l6 = var2[0];
                  this.x8 = this.n5.y2();
               } else {
                  Cell var7 = com.aspose.slides.internal.v6g.k5.n5(this.u9, Cell.class);
                  if (var7 != null) {
                     BaseSlide var3 = (BaseSlide)this.getSlide();
                     MasterSlide var4 = n5(var3);
                     r0s[] var5 = new r0s[]{this.l6};
                     this.s7 = this.n5(var3, var4, var7.n3().l6(), var5);
                     this.l6 = var5[0];
                     this.x8 = this.n5.y2();
                  } else {
                     this.x8 = this.n5.y2();
                     this.s7 = this.y4();
                  }
               }
            } else {
               r0s[] var1 = new r0s[]{this.l6};
               this.s7 = this.n5(var1);
               this.l6 = var1[0];
               this.x8 = this.n5.y2();
            }
         } else {
            this.x8 = this.n5.y2();
            this.s7 = this.y4();
         }
      }

      return this.s7;
   }

   final boolean h0() {
      x8m var1 = this.n5.c8();
      boolean var2 = false;
      if (var1 != null) {
         var2 = var1.n5() != -1 && var1.n5() != 41 && var1.n5() != 0;
      }

      return var2;
   }

   private static MasterSlide n5(BaseSlide var0) {
      Slide var1 = com.aspose.slides.internal.v6g.k5.n5(var0, Slide.class);
      MasterSlide var2;
      if (var1 != null) {
         var2 = (MasterSlide)var1.r4();
      } else {
         LayoutSlide var3 = com.aspose.slides.internal.v6g.k5.n5(var0, LayoutSlide.class);
         if (var3 != null) {
            var2 = (MasterSlide)var3.getMasterSlide();
         } else {
            var2 = com.aspose.slides.internal.v6g.k5.n5(var0, MasterSlide.class);
         }
      }

      return var2;
   }

   private ParagraphFormat[] y4() {
      ParagraphFormat[] var1 = new ParagraphFormat[9];
      if (this.getPresentation() != null) {
         TextStyle var2 = ((Presentation)this.getPresentation()).k5;

         for (int var3 = 0; var3 < var1.length; var3++) {
            var1[var3] = (ParagraphFormat)var2.getLevel(var3);
         }
      } else {
         for (int var4 = 0; var4 < var1.length; var4++) {
            var1[var4] = Presentation.u9;
         }
      }

      return var1;
   }

   private ParagraphFormat[] n5(BaseSlide var1, r0s[] var2) {
      ParagraphFormat[] var3 = new ParagraphFormat[9];
      var2[0] = null;
      MasterSlide var4 = n5(var1);
      if (this.getPresentation() == null) {
         throw new PptxReadException("Unable to load layout slide paragraph.");
      }

      TextStyle var5 = ((Presentation)this.getPresentation()).k5;

      for (int var6 = 0; var6 < var3.length; var6++) {
         var3[var6] = (ParagraphFormat)var5.getLevel(var6);
      }

      ParagraphFormat var8 = new ParagraphFormat(((r0g)var5.getDefaultParagraphFormat()).getParent_Immediate());
      if (var4 != null) {
         var8 = var8.u3((ParagraphFormat)var4.getBodyStyle().getDefaultParagraphFormat());
      }

      for (int var7 = 0; var7 < var3.length; var7++) {
         var3[var7] = var3[var7] == null ? var8 : var3[var7].u3(Presentation.u9);
      }

      return var3;
   }

   private IParagraphFormat[] n5(BaseSlide var1, IMasterSlide var2, c7e var3, r0s[] var4) {
      ParagraphFormat[] var5 = new ParagraphFormat[9];
      var4[0] = null;
      TextStyle var6 = ((Presentation)var1.getPresentation()).k5;
      if (var2 != null) {
         var6 = (TextStyle)var2.getOtherStyle();
      }

      if (var3 != null) {
         for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = (ParagraphFormat)var6.getLevel(var7);
            if (var5[var7] == null) {
               var5[var7] = new ParagraphFormat(Presentation.u9, this);
            } else {
               var5[var7] = var5[var7].u3(Presentation.u9);
            }
         }
      } else {
         for (int var8 = 0; var8 < var5.length; var8++) {
            var5[var8] = new ParagraphFormat(Presentation.u9, this);
         }
      }

      if (var3 != null) {
         var4[0] = ((ColorFormat)var3.h0()).l6((com.aspose.slides.IBaseSlide)(var1));

         for (int var9 = 0; var9 < var5.length; var9++) {
            var5[var9].u3().setFontBold(var3.n5());
            var5[var9].u3().setFontItalic(var3.l6());
            if (var4[0] != null) {
               var5[var9].u3().getFillFormat().setFillType((byte)1);
               var5[var9].u3().getFillFormat().getSolidFillColor().setSchemeColor(12);
            }
         }
      }

      if (this.n5.h0() != null) {
         for (int var10 = 0; var10 < var5.length; var10++) {
            var5[var10] = this.n5.h0().l6(var10, var5[var10]);
         }
      }

      return var5;
   }

   final boolean c8() {
      return this.t9;
   }

   final void l6(boolean var1) {
      this.t9 = var1;
   }

   @Override
   public final IParagraphCollection getParagraphs() {
      return this.t2;
   }

   final String t2() {
      return this.t2.a6();
   }

   final void n5(String var1) {
      this.t2.n5(var1);
   }

   @Override
   public final String getText() {
      s4e var1 = null;
      if (this.l6() != null && this.l6().getPresentation() != null) {
         var1 = (s4e)((Presentation)this.l6().getPresentation()).t4();
      }

      return this.n5(var1);
   }

   @Override
   public final void setText(String value) {
      this.n5(value);
      if (com.aspose.slides.internal.v6g.k5.l6(this.k5(), AutoShape.class) && !com.aspose.slides.ms.System.d1.n5(this.t2())) {
         ((AutoShape)this.k5()).n5(true);
      }
   }

   private String n5(s4e var1) {
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
         ? com.aspose.slides.internal.n8e.w1.n5(this.t2())
         : this.t2();
   }

   @Override
   public final ITextFrameFormat getTextFrameFormat() {
      return this.n5;
   }

   @Override
   public final IHyperlinkQueries getHyperlinkQueries() {
      if (this.n3 == null) {
         this.n3 = new HyperlinkQueries(this);
      }

      return this.n3;
   }

   @Override
   public final void joinPortionsWithSameFormatting() {
      IGenericEnumerator var1 = this.getParagraphs().iterator();

      try {
         while (var1.hasNext()) {
            IParagraph var2 = (IParagraph)var1.next();
            var2.joinPortionsWithSameFormatting();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   @Override
   public final void highlightText(String text, Color highlightColor) {
      this.n5(text, com.aspose.slides.internal.o9b.c8.n5(highlightColor));
   }

   void n5(String var1, com.aspose.slides.internal.o9b.c8 var2) {
      this.n5(var1, var2.o8(), new TextSearchOptions(), null);
   }

   @Deprecated
   @Override
   public final void highlightText(String text, Color highlightColor, ITextHighlightingOptions options) {
      this.n5(text, com.aspose.slides.internal.o9b.c8.n5(highlightColor), options);
   }

   void n5(String var1, com.aspose.slides.internal.o9b.c8 var2, ITextHighlightingOptions var3) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         throw new ArgumentException("Text to highlight can not be null or empty", "text");
      }

      byte var4 = 0;
      if (var3 != null && !var3.getCaseSensitive()) {
         var4 |= 66;
      }

      com.aspose.slides.internal.r7c.c8 var5 = new com.aspose.slides.internal.r7c.c8("[-[\\\\]{}()*+?.,\\\\^$|#\\s]");
      String var6 = var5.k5(var1, "\\$0");
      if (var3 != null && var3.getWholeWordsOnly()) {
         var6 = com.aspose.slides.ms.System.d1.n5(new String[]{"\\b", var6, "\\b"});
      }

      com.aspose.slides.internal.r7c.c8 var7 = new com.aspose.slides.internal.r7c.c8(var6, var4);
      this.n5(var7, (IFindResultCallback)null);
      this.n5(var7, var2.o8());
   }

   @Override
   public final String[] splitTextByColumns() {
      l3f var1 = new l3f();
      com.aspose.slides.internal.o9b.y1 var2 = new com.aspose.slides.internal.o9b.y1();
      l3f[] var3 = new l3f[]{var1};
      com.aspose.slides.internal.o9b.y1[] var4 = new com.aspose.slides.internal.o9b.y1[]{var2};
      s3z.n5(this.u3, var3, var4, null);
      var3[0].n5(var1);
      var4[0].a6(var2);
      return this.u3.c8();
   }

   @Override
   public final void highlightText(String text, Color highlightColor, ITextSearchOptions options, IFindResultCallback callback) {
      this.n5(text, com.aspose.slides.internal.o9b.c8.n5(highlightColor), options, callback);
   }

   void n5(String var1, com.aspose.slides.internal.o9b.c8 var2, ITextSearchOptions var3, IFindResultCallback var4) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         throw new ArgumentException("Text to highlight can not be null or empty", "text");
      }

      byte var5 = 0;
      if (var3 != null && !var3.getCaseSensitive()) {
         var5 |= 66;
      }

      com.aspose.slides.internal.r7c.c8 var6 = new com.aspose.slides.internal.r7c.c8("[-[\\\\]{}()*+?.,\\\\^$|#\\s]");
      String var7 = var6.k5(var1, "\\$0");
      if (var3 != null && var3.getWholeWordsOnly()) {
         var7 = com.aspose.slides.ms.System.d1.n5(new String[]{"\\b", var7, "\\b"});
      }

      com.aspose.slides.internal.r7c.c8 var8 = new com.aspose.slides.internal.r7c.c8(var7, var5);
      this.n5(var8, var4);
      this.n5(var8, var2.o8());
   }

   @Deprecated
   @Override
   public final void highlightRegex(String regex, Color highlightColor, ITextHighlightingOptions options) {
      this.l6(regex, com.aspose.slides.internal.o9b.c8.n5(highlightColor), options);
   }

   void l6(String var1, com.aspose.slides.internal.o9b.c8 var2, ITextHighlightingOptions var3) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         throw new ArgumentException("Regex to highlight can not be null or empty", "regex");
      }

      byte var4 = 0;
      if (var3 != null && !var3.getCaseSensitive()) {
         var4 |= 66;
      }

      if (var3 != null && var3.getWholeWordsOnly() && !com.aspose.slides.ms.System.d1.t2(var1, "\\b")) {
         var1 = com.aspose.slides.ms.System.d1.n5(new String[]{"\\b", var1, "\\b"});
      }

      com.aspose.slides.internal.r7c.c8 var5 = new com.aspose.slides.internal.r7c.c8(var1, var4);
      this.n5(var5, (IFindResultCallback)null);
      this.n5(var5, var2.o8());
   }

   @Override
   public final void highlightRegex(Pattern regex, Color highlightColor, IFindResultCallback callback) {
      this.n5(com.aspose.slides.internal.r7c.c8.n5(regex), com.aspose.slides.internal.o9b.c8.n5(highlightColor), callback);
   }

   void n5(com.aspose.slides.internal.r7c.c8 var1, com.aspose.slides.internal.o9b.c8 var2, IFindResultCallback var3) {
      if (var1 == null) {
         throw new ArgumentException("Regex to highlight can not be null", "regex");
      }

      this.n5(var1, var3);
      this.n5(var1, var2.o8());
   }

   final void n5(com.aspose.slides.internal.r7c.c8 var1, com.aspose.slides.internal.o9b.c8 var2) {
      if (this.k5.u3().size() != 0) {
         String var3 = this.t2();
         boolean var4 = false;
         boolean var5 = false;
         int var6 = 0;
         Portion var7 = null;

         for (int var8 = 0; var8 < var3.length(); var8++) {
            if (this.k5.n5().size() > 0 && var8 == this.k5.n5().get_Item(0)) {
               var7 = this.k5.l6().get_Item(0);
               var5 = false;
               this.k5.n5().removeAt(0);
               this.k5.l6().removeAt(0);
               if (this.k5.k5().size() > 0 && var8 + var7.u9().length() > this.k5.k5().get_Item(0)) {
                  if (var8 < this.k5.k5().get_Item(0)) {
                     int var9 = this.k5.k5().get_Item(0) - var8;
                     String var10 = com.aspose.slides.ms.System.d1.l6(var7.u9(), 0, var9);
                     String var11 = com.aspose.slides.ms.System.d1.k5(var7.u9(), var9);
                     Portion var12 = new Portion(var7);
                     var12.n5(var10);
                     var7.n5(var11);
                     this.k5.n5().insertItem(0, this.k5.k5().get_Item(0));
                     this.k5.l6().insertItem(0, var7);
                     int var13 = var7.n3().getPortions().indexOf(var7);
                     var7.n3().getPortions().insert(var13, var12);
                     var7 = var12;
                  } else if (var8 + var7.u9().length() > this.k5.k5().get_Item(0) + this.k5.u3().get_Item(0)) {
                     int var14 = this.k5.k5().get_Item(0) + this.k5.u3().get_Item(0) - var8;
                     String var15 = com.aspose.slides.ms.System.d1.l6(var7.u9(), 0, var14);
                     String var16 = com.aspose.slides.ms.System.d1.k5(var7.u9(), var14);
                     Portion var17 = new Portion(var7);
                     var17.n5(var16);
                     var7.n5(var15);
                     this.k5.n5().insertItem(0, this.k5.k5().get_Item(0) + this.k5.u3().get_Item(0));
                     this.k5.l6().insertItem(0, var17);
                     int var18 = var7.n3().getPortions().indexOf(var7) + 1;
                     var7.n3().getPortions().insert(var18, var17);
                  }
               }
            }

            if (var6 == 0) {
               var6 = this.k5.u3().get_Item(0);
            }

            if (!var4) {
               var4 = var8 == this.k5.k5().get_Item(0);
            }

            if (var4) {
               if (!var5) {
                  ((ColorFormat)var7.getPortionFormat().getHighlightColor()).n5(var2.o8());
                  var5 = true;
               }

               if (--var6 == 0) {
                  this.k5.k5().removeAt(0);
                  this.k5.u3().removeAt(0);
                  var4 = false;
               }
            }

            if (this.k5.k5().size() == 0) {
               break;
            }
         }
      }
   }

   @Override
   public final void replaceText(String oldText, String newText, ITextSearchOptions options, IFindResultCallback callback) {
      if (com.aspose.slides.ms.System.d1.n5(oldText)) {
         throw new ArgumentException("Text to replacement can not be null or empty", "oldText");
      }

      byte var5 = 0;
      if (options != null && !options.getCaseSensitive()) {
         var5 |= 66;
      }

      com.aspose.slides.internal.r7c.c8 var6 = new com.aspose.slides.internal.r7c.c8("\\-\\[\\]\\{\\}\\(\\)\\*\\+\\?\\.\\,\\\\\\^\\$\\|#\\s");
      String var7 = var6.k5(oldText, "\\$0");
      if (options != null && options.getWholeWordsOnly()) {
         var7 = com.aspose.slides.ms.System.d1.n5(new String[]{"\\b", var7, "\\b"});
      }

      com.aspose.slides.internal.r7c.c8 var8 = new com.aspose.slides.internal.r7c.c8(var7, var5);
      this.n5(var8, callback);
      this.n5(var8, newText);
   }

   @Override
   public final void replaceRegex(Pattern regex, String newText, IFindResultCallback callback) {
      this.n5(com.aspose.slides.internal.r7c.c8.n5(regex), newText, callback);
   }

   void n5(com.aspose.slides.internal.r7c.c8 var1, String var2, IFindResultCallback var3) {
      if (var1 == null) {
         throw new ArgumentException("Regex to replacement can not be null", "regex");
      }

      this.n5(var1, var3);
      this.n5(var1, var2);
   }

   final void n5(com.aspose.slides.internal.r7c.c8 var1, String var2) {
      List var3 = new List();
      List var4 = new List();
      if (this.k5.u3().size() != 0) {
         String var5 = this.t2();
         boolean var6 = false;
         boolean var7 = false;
         int var8 = 0;
         Portion var9 = null;

         for (int var10 = 0; var10 < var5.length(); var10++) {
            if (this.k5.n5().size() > 0 && var10 == this.k5.n5().get_Item(0)) {
               var9 = this.k5.l6().get_Item(0);
               var7 = false;
               this.k5.n5().removeAt(0);
               this.k5.l6().removeAt(0);
               if (this.k5.k5().size() > 0 && var10 + var9.u9().length() > this.k5.k5().get_Item(0)) {
                  if (var10 < this.k5.k5().get_Item(0)) {
                     int var11 = this.k5.k5().get_Item(0) - var10;
                     String var12 = com.aspose.slides.ms.System.d1.l6(var9.u9(), 0, var11);
                     String var13 = com.aspose.slides.ms.System.d1.k5(var9.u9(), var11);
                     Portion var14 = new Portion(var9);
                     var14.n5(var12);
                     var9.n5(var13);
                     this.k5.n5().insertItem(0, this.k5.k5().get_Item(0));
                     this.k5.l6().insertItem(0, var9);
                     int var15 = var9.n3().getPortions().indexOf(var9);
                     var9.n3().getPortions().insert(var15, var14);
                     var9 = var14;
                  } else if (var10 + var9.u9().length() > this.k5.k5().get_Item(0) + this.k5.u3().get_Item(0)) {
                     int var25 = this.k5.k5().get_Item(0) + this.k5.u3().get_Item(0) - var10;
                     String var28 = com.aspose.slides.ms.System.d1.l6(var9.u9(), 0, var25);
                     String var30 = com.aspose.slides.ms.System.d1.k5(var9.u9(), var25);
                     Portion var31 = new Portion(var9);
                     var31.n5(var30);
                     var9.n5(var28);
                     this.k5.n5().insertItem(0, this.k5.k5().get_Item(0) + this.k5.u3().get_Item(0));
                     this.k5.l6().insertItem(0, var31);
                     int var32 = var9.n3().getPortions().indexOf(var9) + 1;
                     var9.n3().getPortions().insert(var32, var31);
                  }
               }
            }

            if (var8 == 0) {
               var8 = this.k5.u3().get_Item(0);
            }

            if (!var6) {
               var6 = var10 == this.k5.k5().get_Item(0);
            }

            if (var6) {
               if (!var7) {
                  if (var10 == this.k5.k5().get_Item(0)) {
                     var3.addItem(var9);
                  } else {
                     var4.addItem(var9);
                  }

                  var7 = true;
               }

               if (--var8 == 0) {
                  this.k5.k5().removeAt(0);
                  this.k5.u3().removeAt(0);
                  var6 = false;
               }
            }

            if (this.k5.k5().size() == 0) {
               break;
            }
         }

         List$Enumerator var24 = var3.iterator();

         try {
            while (var24.hasNext()) {
               Portion var26 = (Portion)var24.next();
               var26.setText(var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var24, IDisposable.class)) {
               var24.dispose();
            }
         }

         List$Enumerator var27 = var4.iterator();

         try {
            while (var27.hasNext()) {
               Portion var29 = (Portion)var27.next();
               var29.n3().getPortions().remove(var29);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var27, IDisposable.class)) {
               var27.dispose();
            }
         }
      }
   }

   final void n5(com.aspose.slides.internal.r7c.c8 var1, IFindResultCallback var2) {
      this.k5.u9();
      String var3 = this.t2();
      if (var1.u3(var3)) {
         int var4 = 0;
         IGenericEnumerator var5 = this.getParagraphs().iterator();

         try {
            for (; var5.hasNext(); var4++) {
               IParagraph var6 = (IParagraph)var5.next();
               IGenericEnumerator var7 = var6.getPortions().iterator();

               try {
                  while (var7.hasNext()) {
                     Portion var8 = (Portion)var7.next();
                     this.k5.n5(var8, var4);
                     var4 += var8.u9().length();
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                     var7.dispose();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }

         Iterator var24 = var1.k5(var3).iterator();

         try {
            while (var24.hasNext()) {
               com.aspose.slides.internal.r7c.u3 var25 = (com.aspose.slides.internal.r7c.u3)var24.next();
               if (com.aspose.slides.ms.System.d1.n5(var25.k5(), new char[]{'\r', '\n'}) < 0) {
                  this.k5.n5(var25.n5(), var25.l6());
                  if (var2 != null) {
                     var2.foundResult(this, this.getText(), var25.k5(), var25.n5());
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var24, IDisposable.class)) {
               ((IDisposable)var24).dispose();
            }
         }
      }
   }

   final TextFrameFormat s7() {
      return this.n5;
   }

   final boolean x8() {
      if (this.n5.w1()) {
         return true;
      }

      Dictionary var1 = new Dictionary();
      IGenericEnumerator var2 = this.getParagraphs().iterator();

      try {
         while (var2.hasNext()) {
            Paragraph var3 = (Paragraph)var2.next();
            if (var3.s7()) {
               return true;
            }

            float var4 = 0.0F;
            Float[] var5 = new Float[]{var4};
            boolean var6 = var1.tryGetValue(var3.n5().u9(), var5);
            var4 = var5[0];
            if (var6) {
               if ((!com.aspose.slides.ms.System.n1.k5(var4) || !com.aspose.slides.ms.System.n1.k5(var3.n5().getMarginLeft()))
                  && var3.n5().getMarginLeft() != var4) {
                  return true;
               }
            } else {
               var1.addItem(var3.n5().u9(), var3.n5().getMarginLeft());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return false;
   }

   final boolean n3() {
      IGenericEnumerator var1 = this.getParagraphs().iterator();

      try {
         while (var1.hasNext()) {
            IParagraph var2 = (IParagraph)var1.next();
            IGenericEnumerator var3 = var2.getPortions().iterator();

            try {
               while (var3.hasNext()) {
                  IPortion var4 = (IPortion)var3.next();
                  if (com.aspose.slides.internal.v6g.k5.l6(var4, MathPortion.class)) {
                     return true;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  var3.dispose();
               }
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
   public final IBaseSlide getSlide() {
      return this.k5() != null ? this.k5().getSlide() : null;
   }

   @Override
   public final IPresentation getPresentation() {
      return this.k5() != null ? this.k5().getPresentation() : null;
   }

   @Override
   public final IShape getParentShape() {
      return com.aspose.slides.internal.v6g.k5.n5(this.u9, IShape.class);
   }

   @Override
   public final ICell getParentCell() {
      return com.aspose.slides.internal.v6g.k5.n5(this.u9, ICell.class);
   }

   static {
      a6.n5((byte)0, 1);
      a6.n5((byte)2, 1);
      a6.n5((byte)1, 2);
      a6.n5((byte)3, 2);
      a6.n5((byte)8, 2);
      a6.n5((byte)9, 2);
      a6.n5((byte)10, 2);
      a6.n5((byte)11, 2);
      a6.n5((byte)12, 2);
      a6.n5((byte)13, 2);
      a6.n5((byte)14, 2);
      a6.n5((byte)15, 2);
      a6.n5((byte)4, 0);
      a6.n5((byte)5, 0);
      a6.n5((byte)6, 0);
      a6.n5((byte)7, 0);
   }
}
