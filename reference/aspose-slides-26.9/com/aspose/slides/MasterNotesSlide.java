package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.IDisposable;

public class MasterNotesSlide extends BaseSlide implements IMasterNotesSlide {
   private TextStyle u9;
   private c4x h0;
   private v1e c8;
   private MasterNotesSlideHeaderFooterManager t2;
   private final MasterThemeManager s7;
   private final DrawingGuidesCollection x8;

   @Override
   public boolean getShowMasterShapes() {
      return false;
   }

   @Override
   public void setShowMasterShapes(boolean value) {
      if (value) {
         throw new NotSupportedException("MasterNotesSlide doesn't contain another master slide and doesn't support this setter.");
      }
   }

   MasterNotesSlide(i6f parentImmediate) {
      super(parentImmediate);
      if (this.c8 == null) {
         this.c8 = new v1e();
      }

      if (this.h0 == null) {
         this.h0 = new c4x();
      }

      this.c8.n5(this);
      this.s7 = new MasterThemeManager(this);
      this.u9 = new TextStyle(this);
      this.x8 = new DrawingGuidesCollection(DrawingGuidesCollection.l6.o8());
      this.n5(new t0(this));
   }

   @Override
   o8 k5() {
      if (this.h0 == null) {
         this.h0 = new c4x();
      }

      return this.h0;
   }

   @Override
   f1 u3() {
      if (this.c8 == null) {
         this.c8 = new v1e();
      }

      return this.c8;
   }

   final c4x t4() {
      if (this.h0 == null) {
         this.h0 = new c4x();
      }

      return this.h0;
   }

   final v1e q0() {
      if (this.c8 == null) {
         this.c8 = new v1e();
      }

      return this.c8;
   }

   @Override
   public final IMasterNotesSlideHeaderFooterManager getHeaderFooterManager() {
      if (this.t2 == null) {
         this.t2 = new MasterNotesSlideHeaderFooterManager(this);
      }

      return this.t2;
   }

   @Override
   public final IMasterThemeManager getThemeManager() {
      return this.s7;
   }

   @Override
   public final ITextStyle getNotesStyle() {
      return this.u9;
   }

   @Override
   public final IDrawingGuidesCollection getDrawingGuides() {
      return this.x8;
   }

   final void z3() {
      IGenericEnumerator var1 = this.getShapes().iterator();

      try {
         while (var1.hasNext()) {
            Shape var2 = (Shape)var1.next();
            if (var2.getPlaceholder() != null && var2.getPlaceholder().getType() == 14) {
               com.aspose.slides.internal.o9b.f2 var3 = ((SlideSize)this.getPresentation().getSlideSize()).n5().a6();
               float var4 = var2.getWidth();
               var2.setWidth(var2.getHeight() * var3.l6() / var3.k5());
               var2.setX(var2.getX() + (var4 - var2.getWidth()) / 2.0F);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }
}
