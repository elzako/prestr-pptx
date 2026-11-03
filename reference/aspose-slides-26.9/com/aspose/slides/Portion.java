package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import java.awt.geom.Rectangle2D.Float;
import java.util.Arrays;

public class Portion implements IPortion, r0g {
   final o6d n5;
   private String k5 = "";
   private Field u3;
   PortionFormat l6;
   private PortionCollection a6;
   private IPresentationComponent u9;
   private ISlideComponent h0;

   public Portion() {
      this(com.aspose.slides.ms.System.d1.n5);
   }

   public Portion(String str) {
      this.l6 = new PortionFormat(this);
      this.k5 = str;
      this.n5 = new p7n(this);
   }

   public Portion(Portion portion) {
      this(com.aspose.slides.ms.System.d1.n5);
      this.l6.n5((com.aspose.slides.BasePortionFormat)portion.l6);
      this.k5 = portion.n5();
      if (portion.k5()) {
         this.u3 = new Field(this, portion.u3);
      }
   }

   Portion(PortionFormat portionProps) {
      this(com.aspose.slides.ms.System.d1.n5);
      this.l6.n5((com.aspose.slides.BasePortionFormat)portionProps);
   }

   Portion(PortionFormat portionProps, PortionCollection container) {
      if (container == null) {
         throw new ArgumentNullException("container");
      }

      this.k5 = com.aspose.slides.ms.System.d1.n5;
      this.a6 = container;
      this.l6 = new PortionFormat(this);
      this.l6.n5((com.aspose.slides.BasePortionFormat)portionProps);
      this.n5 = new p7n(this);
      container.n5(this);
   }

   @Override
   public final IPortionFormat getPortionFormat() {
      return this.l6;
   }

   final PortionFormat l6() {
      return this.l6;
   }

   @Override
   public final String getText() {
      s4e var1 = null;
      if (this.s7() != null && this.s7().getPresentation() != null) {
         var1 = (s4e)((Presentation)this.s7().getPresentation()).t4();
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
         ? com.aspose.slides.internal.n8e.w1.n5(this.u9())
         : this.u9();
   }

   @Override
   public final void setText(String value) {
      this.n5(value);
   }

   final boolean k5() {
      return this.u3 != null;
   }

   @Override
   public final IField getField() {
      return this.u3;
   }

   @Override
   public final void addField(IFieldType fieldType) {
      this.u3 = new Field(this, (FieldType)fieldType);
   }

   @Override
   public final void addField(String internalString) {
      this.u3 = new Field(this, new FieldType(internalString));
   }

   @Override
   public final void removeField() {
      this.u3 = null;
   }

   @Override
   public final Float getRect() {
      return com.aspose.slides.internal.o9b.y1.u9(this.u3());
   }

   com.aspose.slides.internal.o9b.y1 u3() {
      return this.n5.n5(false);
   }

   @Override
   public final java.awt.geom.Point2D.Float getCoordinates() {
      return com.aspose.slides.internal.o9b.w1.l6(this.a6());
   }

   com.aspose.slides.internal.o9b.w1 a6() {
      com.aspose.slides.internal.o9b.y1 var1 = this.n5.n5(true).y4();
      return new com.aspose.slides.internal.o9b.w1(var1.x8(), var1.n3());
   }

   final void n5(Portion var1) {
      this.l6().n5(var1.l6());
      if (var1.k5()) {
         this.u3 = new Field(this, var1.u3);
      }
   }

   final String u9() {
      if (this.k5()) {
         IBaseSlide var1 = this.x8().getSlide();
         int var2;
         if (com.aspose.slides.internal.v6g.k5.l6(var1, Slide.class)) {
            var2 = ((Slide)var1).j5();
         } else {
            if (!com.aspose.slides.internal.v6g.k5.l6(var1, NotesSlide.class)) {
               return this.n5();
            }

            var2 = ((NotesSlide)var1).getParentSlide().getSlideNumber();
         }

         String var3 = null;
         String[] var4 = new String[]{var3};
         boolean var5 = this.n5(var2, var4);
         var3 = var4[0];
         if (var5) {
            this.l6(var3);
            return var3;
         }
      }

      return this.n5();
   }

   final void n5(String var1) {
      if (com.aspose.slides.ms.System.d1.n5(var1, ParagraphCollection.n5) != -1) {
         throw new PptxException("Can't assign string which contains paragraph break character");
      }

      String var2 = this.n5();
      this.l6(var1);
      if (!com.aspose.slides.ms.System.d1.a6(this.n5(), var2)) {
         this.t2();
      }
   }

   final boolean h0() {
      return this.u3 != null || this.n5() != null && !com.aspose.slides.ms.System.d1.a6(this.n5(), com.aspose.slides.ms.System.d1.n5);
   }

   final boolean c8() {
      if (this.l6().n3()) {
         return true;
      }

      for (int var1 = 0; var1 < this.u9().length(); var1++) {
         char var2 = this.u9().charAt(var1);
         if (var2 > 128 && var2 < 1424 || var2 > 1535 && var2 < 12255) {
            return true;
         }
      }

      return false;
   }

   final String n5(int var1) {
      String var2 = null;
      String[] var3 = new String[]{var2};
      boolean var4 = this.n5(var1, var3);
      var2 = var3[0];
      if (var4) {
         this.l6(var2);
         return var2;
      } else {
         return this.n5();
      }
   }

   final boolean n5(int var1, String[] var2) {
      IField var3 = this.getField();
      if (var3 != null) {
         if ("slidenum".equals(var3.getType().getInternalString())) {
            var2[0] = var1 != -1 ? com.aspose.slides.ms.System.a3.n5(var1, com.aspose.slides.internal.x7n.l6.k5()) : com.aspose.slides.ms.System.d1.n5;
            return true;
         }

         if (FieldType.l6().containsItem((FieldType)var3.getType())) {
            var2[0] = PresentationHeaderFooterManager.n5(
               var3.getType().getInternalString(), this.getPortionFormat() != null ? this.getPortionFormat().getLanguageId() : null
            );
            return true;
         }
      }

      var2[0] = null;
      return false;
   }

   final Portion n5(PortionFormat var1) {
      Portion var2 = new Portion(var1);
      this.l6().n5(var2.l6());
      var2.k5 = this.k5;
      if (this.u3 != null) {
         var2.u3 = new Field(this, this.u3);
      }

      return var2;
   }

   final void t2() {
      if (this.a6 != null) {
         this.a6.u3().u9();
      }
   }

   @Override
   public final IBaseSlide getSlide() {
      return this.x8() != null ? this.x8().getSlide() : null;
   }

   @Override
   public final IPresentation getPresentation() {
      return this.x8() != null ? this.x8().getPresentation() : null;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.a6;
   }

   final void n5(PortionCollection var1) {
      this.a6 = var1;
      this.u9 = null;
      this.h0 = null;
      if (var1 != null && this.l6.getLanguageId() == null && this.s7() != null && this.s7().getPresentation() != null) {
         this.l6.setLanguageId(((Presentation)this.s7().getPresentation()).c8());
      }
   }

   final IPresentationComponent s7() {
      if (this.u9 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.u9};
         d0u.n5(IPresentationComponent.class, this.a6, var1);
         this.u9 = var1[0];
      }

      return this.u9;
   }

   final ISlideComponent x8() {
      if (this.h0 == null) {
         ISlideComponent[] var1 = new ISlideComponent[]{this.h0};
         d0u.n5(ISlideComponent.class, this.a6, var1);
         this.h0 = var1[0];
      }

      return this.h0;
   }

   final Paragraph n3() {
      return this.a6 != null ? this.a6.u3() : null;
   }

   final void y4() {
      this.l6().c4();
   }

   private String n5() {
      return this.k5;
   }

   private void l6(String var1) {
      this.k5 = var1;
   }
}
