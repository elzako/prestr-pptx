package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

public class NotesSlide extends BaseSlide implements INotesSlide {
   private d7r h0;
   private v1e c8;
   private NotesSlideHeaderFooterManager t2;
   Slide u9;
   private final NotesSlideThemeManager s7;
   private boolean x8;

   NotesSlide(NotesSlideManager parentImmediate) {
      super(parentImmediate);
      if (this.c8 == null) {
         this.c8 = new v1e();
      }

      if (this.h0 == null) {
         this.h0 = new d7r();
      }

      this.c8.n5(this);
      this.s7 = new NotesSlideThemeManager(this);
      this.u9 = parentImmediate.n5();
      this.x8 = true;
      e8e.n5(this);
      this.n5(new m7d(this));
   }

   final m7d t4() {
      return (m7d)super.l6();
   }

   @Override
   o8 k5() {
      if (this.h0 == null) {
         this.h0 = new d7r();
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

   final d7r q0() {
      if (this.h0 == null) {
         this.h0 = new d7r();
      }

      return this.h0;
   }

   final v1e z3() {
      if (this.c8 == null) {
         this.c8 = new v1e();
      }

      return this.c8;
   }

   @Override
   public final INotesSlideHeaderFooterManager getHeaderFooterManager() {
      if (this.t2 == null) {
         this.t2 = new NotesSlideHeaderFooterManager(this);
      }

      return this.t2;
   }

   @Override
   public final ITextFrame getNotesTextFrame() {
      IGenericEnumerator var1 = this.getShapes().iterator();

      try {
         while (var1.hasNext()) {
            Shape var2 = (Shape)var1.next();
            if (var2.getPlaceholder() != null && var2.getPlaceholder().getType() == 1 && com.aspose.slides.internal.v6g.k5.l6(var2, AutoShape.class)) {
               return ((AutoShape)var2).getTextFrame();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return null;
   }

   @Override
   public final IOverrideThemeManager getThemeManager() {
      return this.s7;
   }

   @Override
   public final ISlide getParentSlide() {
      return this.u9;
   }

   @Override
   public boolean getShowMasterShapes() {
      return this.x8;
   }

   @Override
   public void setShowMasterShapes(boolean value) {
      this.x8 = value;
   }

   @Override
   Shape[] n5(IPlaceholder var1) {
      if (this.getPresentation() != null && this.getPresentation().getMasterNotesSlideManager().getMasterNotesSlide() != null) {
         Shape var2 = ((BaseSlide)this.getPresentation().getMasterNotesSlideManager().getMasterNotesSlide()).l6.n5(var1, null);
         return var2 == null ? a6 : new Shape[]{var2};
      } else {
         return a6;
      }
   }
}
