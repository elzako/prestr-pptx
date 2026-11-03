package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

public final class AutoShape extends GeometryShape implements IAutoShape {
   private boolean n5 = false;
   private TextFrame l6;
   private boolean k5;

   AutoShape(r0g parentImmediate) {
      super(parentImmediate, new s9(), new AutoShapeLock());
      this.n5(new w8(this));
   }

   public final IAutoShapeLock getShapeLock() {
      return (IAutoShapeLock)super.getShapeLock();
   }

   @Override
   public final IAutoShapeLock getAutoShapeLock() {
      return (IAutoShapeLock)super.getShapeLock();
   }

   s9 n5() {
      return (s9)super.u9();
   }

   @Override
   public final ITextFrame getTextFrame() {
      return this.l6;
   }

   final TextFrame l6() {
      return this.l6;
   }

   final void n5(TextFrame var1) {
      this.l6 = var1;
   }

   final boolean k5() {
      if (this.l6() != null && this.l6().getParagraphs().getCount() > 0) {
         IParagraph var1 = this.l6().getParagraphs().get_Item(0);
         return var1.getPortions().getCount() > 0 && var1.getPortions().get_Item(0).getField() != null;
      } else {
         return false;
      }
   }

   final IFillFormat u3() {
      return this.w1() == null ? null : this.w1().getFillFormat();
   }

   final Shape a6() {
      AutoShape var1 = new AutoShape(this);
      var1.k5(this.v4());
      var1.setFrame(this.getFrame());
      var1.getFillFormat().setFillType((byte)0);
      var1.addTextFrame(" ");
      var1.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte)0);
      this.n5(var1);
      return this.w1();
   }

   @Override
   void c8() {
      this.x8 = this.t2();
   }

   @Override
   long t2() {
      return (this.s7 & 4294967295L) + ((this.l6 != null ? this.l6.n5.s3() : 0L) & 4294967295L) & 4294967295L;
   }

   @Override
   void n5(float var1, float var2, float var3) {
      if (this.getTextFrame() == null) {
         super.n5((float)var1, var2, var3);
      } else {
         Shape[] var4 = this.f2();
         TextFrameFormat var5 = (TextFrameFormat)this.getTextFrame().getTextFrameFormat();
         var5.h0().n5(var3);
         if (com.aspose.slides.internal.v6g.k5.l6(this.getSlide(), Slide.class) && (var4.length == 0 || var5.n5(this.n5(var4)))) {
            var5.n5(c0u.n5(var5.u3(), var3).l6());
         }

         IGenericEnumerator var6 = this.getTextFrame().getParagraphs().iterator();

         try {
            while (var6.hasNext()) {
               Paragraph var7 = (Paragraph)var6.next();
               var7.n5().n5(var3);
               if (var7.getEndParagraphPortionFormat() != null) {
                  ((PortionFormat)var7.getEndParagraphPortionFormat()).n5(var3);
               }

               if (!com.aspose.slides.ms.System.n1.k5(var7.getParagraphFormat().getSpaceWithin()) && var7.getParagraphFormat().getSpaceWithin() < 0.0F) {
                  var7.getParagraphFormat().setSpaceWithin(var7.getParagraphFormat().getSpaceWithin() * var3);
               }

               IGenericEnumerator var8 = var7.getPortions().iterator();

               try {
                  while (var8.hasNext()) {
                     Portion var9 = (Portion)var8.next();
                     var9.l6().n5(var3);
                     if (com.aspose.slides.internal.v6g.k5.l6(this.getSlide(), Slide.class)
                        && com.aspose.slides.ms.System.n1.k5(var9.l6().getFontHeight())
                        && var4.length == 0) {
                        var9.l6().setFontHeight(var9.l6().r4().h0());
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                     var8.dispose();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }

         super.n5((float)var1, var2, var3);
      }
   }

   @Override
   void s7() {
      super.s7();
      this.l6.n5.a0();
      IGenericEnumerator var1 = this.l6.getParagraphs().iterator();

      try {
         while (var1.hasNext()) {
            Paragraph var2 = (Paragraph)var1.next();
            var2.n5().e2();
            IGenericEnumerator var3 = var2.getPortions().iterator();

            try {
               while (var3.hasNext()) {
                  Portion var4 = (Portion)var3.next();
                  var4.l6().w1();
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

      h9z var13 = this.l6.n5.d2();
      if (var13.getAutofitType() == 1) {
         this.l6.n5.n5(var13.getAutofitType());
         ((w8)this.e5()).l6();
         if (this.l6.n5.n3() == 1.0F || this.l6.n5.y4() == 0.0F) {
            this.l6.n5.a0();
         }
      }
   }

   @Override
   public final boolean getUseBackgroundFill() {
      return this.n5;
   }

   @Override
   public final void setUseBackgroundFill(boolean value) {
      this.n5 = value;
   }

   final void l6(TextFrame var1) {
      this.e5().k5();
      i2h var2 = this.l6.n5(this).k5();
      ((TextFrameFormat)var1.getTextFrameFormat()).n5(var2.n5().l6());
      Shape[] var3 = this.f2();
      TextFrame[] var4 = var3.length == 0 ? null : new TextFrame[var3.length];

      for (int var5 = 0; var5 < var3.length; var5++) {
         GeometryShape var6 = com.aspose.slides.internal.v6g.k5.n5(var3[var5], GeometryShape.class);
         if (var6 != null) {
            TextFrame var7 = null;
            if (com.aspose.slides.internal.v6g.k5.l6(var6, AutoShape.class)) {
               var7 = ((AutoShape)var6).l6();
            } else if (com.aspose.slides.internal.v6g.k5.l6(var6, SmartArtShape.class)) {
               var7 = ((SmartArtShape)var6).k5();
            }

            if (var7 != null) {
               var4[var5] = var7;
            }
         }
      }

      this.l6.n5(var4, var1);
   }

   @Override
   public final ITextFrame addTextFrame(String text) {
      if (this.l6 == null) {
         this.l6 = new TextFrame(this);
      }

      ((ParagraphCollection)this.l6.getParagraphs()).n5(text);
      if (!com.aspose.slides.ms.System.d1.n5(text)) {
         this.n5(true);
      }

      return this.l6;
   }

   final TextFrame x8() {
      if (this.l6 == null) {
         this.l6 = new TextFrame(this);
      }

      return this.l6;
   }

   @Override
   public final boolean isTextBox() {
      return this.k5;
   }

   final void n5(boolean var1) {
      this.k5 = var1;
   }

   private ITextFrameFormat[] n5(Shape[] var1) {
      ITextFrameFormat[] var2 = new ITextFrameFormat[var1.length];

      for (int var3 = 0; var3 < var1.length; var3++) {
         AutoShape var4 = com.aspose.slides.internal.v6g.k5.n5(var1[var3], AutoShape.class);
         if (var4 != null) {
            var2[var3] = var4.getTextFrame().getTextFrameFormat();
         }
      }

      return var2;
   }

   @Override
   boolean n3() {
      if (super.n3()) {
         return true;
      }

      if (this.getShapeStyle() != null) {
         return true;
      }

      if (this.getPlaceholder() == null
         || ((Presentation)this.getPresentation()).m3() == 0
         || this.getPlaceholder().getType() != 2 && this.getPlaceholder().getType() != 3) {
         if (!this.getAutoShapeLock().getSizeLocked() && !this.getAutoShapeLock().getShapeTypeLocked()) {
            if (this.l6() != null) {
               if (this.l6().x8()) {
                  return true;
               }

               if (this.l6().s7().z1() == 1 && ((ThreeDFormat)this.getThreeDFormat()).a6()) {
                  return true;
               }
            }

            return false;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   final boolean y4() {
      return this.l6 == null ? false : this.l6.n3();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   s9 u9() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   s9 h0() {
      return this.n5();
   }

}
