package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

public final class LayoutSlide extends BaseSlide implements ILayoutSlide {
   private final ParagraphFormat$n5 u9 = new LayoutSlide$1(this);
   private z2d h0;
   private o5y c8;
   private LayoutSlideHeaderFooterManager t2;
   private LayoutPlaceholderManager s7;
   private MasterSlide x8;
   private byte n3;
   private final LayoutSlideThemeManager y4;
   private boolean e2;
   private final DrawingGuidesCollection t9;

   LayoutSlide(IMasterSlide masterSlide, byte layoutType) {
      super((MasterLayoutSlideCollection)masterSlide.getLayoutSlides());
      if (this.c8 == null) {
         this.c8 = new o5y();
      }

      if (this.h0 == null) {
         this.h0 = new z2d();
      }

      this.c8.n5(this);
      this.y4 = new LayoutSlideThemeManager(this);
      ((GlobalLayoutSlideCollection)masterSlide.getPresentation().getLayoutSlides()).n5(this);
      this.setMasterSlide(masterSlide);
      this.n3 = layoutType;
      this.e2 = true;
      this.n5 = new SlideShowTransition(this);
      this.t9 = new DrawingGuidesCollection(DrawingGuidesCollection.k5.o8());
      this.n5(new t0(this));
   }

   @Override
   o8 k5() {
      if (this.h0 == null) {
         this.h0 = new z2d();
      }

      return this.h0;
   }

   @Override
   f1 u3() {
      if (this.c8 == null) {
         this.c8 = new o5y();
      }

      return this.c8;
   }

   final z2d t4() {
      if (this.h0 == null) {
         this.h0 = new z2d();
      }

      return this.h0;
   }

   final o5y q0() {
      if (this.c8 == null) {
         this.c8 = new o5y();
      }

      return this.c8;
   }

   @Override
   public final ILayoutSlideHeaderFooterManager getHeaderFooterManager() {
      if (this.t2 == null) {
         this.t2 = new LayoutSlideHeaderFooterManager(this);
      }

      return this.t2;
   }

   @Override
   public final ILayoutPlaceholderManager getPlaceholderManager() {
      if (this.s7 == null) {
         this.s7 = new LayoutPlaceholderManager(this);
      }

      return this.s7;
   }

   @Override
   public final IMasterSlide getMasterSlide() {
      return this.x8;
   }

   @Override
   public final void setMasterSlide(IMasterSlide value) {
      if (this.x8 != value) {
         if (value != null && value.getPresentation() != this.getPresentation()) {
            throw new PptxEditException("Master slide must be from the same presentation.");
         }

         if (this.x8 != null) {
            MasterSlide var2 = this.n5(value);
            if (var2 != null) {
               this.n5(var2);
               return;
            }

            this.remove();
         }

         this.x8 = (MasterSlide)value;
         if (value != null) {
            this.z3();
            this.n5((LayoutSlideCollection)this.x8.getLayoutSlides());
            ((LayoutSlideCollection)this.x8.getLayoutSlides()).n5(this);
         }
      }
   }

   private MasterSlide n5(IMasterSlide var1) {
      IGenericEnumerator var2 = this.getPresentation().getMasters().iterator();

      try {
         while (var2.hasNext()) {
            MasterSlide var3 = (MasterSlide)var2.next();
            if (var3 == var1) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   private void n5(MasterSlide var1) {
      ((LayoutSlideCollection)this.x8.getLayoutSlides()).n5.removeItem(this);
      this.x8 = var1;
      this.z3();
      this.n5((LayoutSlideCollection)this.x8.getLayoutSlides());
      ((LayoutSlideCollection)this.x8.getLayoutSlides()).n5(this);
   }

   @Override
   public final void remove() {
      if (this.z1() == null) {
         throw new PptxEditException("Slide is already removed from presentation.");
      }

      synchronized (((LayoutSlideCollection)this.z1().getLayoutSlides()).n5.getSyncRoot()) {
         if (this.hasDependingSlides()) {
            throw new PptxEditException("Error removing layout slide: this layout slide is used in presentation.");
         }

         this.m1();
         ((LayoutSlideCollection)this.x8.getLayoutSlides()).n5.removeItem(this);
         ((LayoutSlideCollection)this.z1().getLayoutSlides()).n5.removeItem(this);
         this.x8 = null;
         this.n5((r0g)null);
      }
   }

   final void z3() {
      if (this.x8 != null) {
         this.x8.l6.n5.l6(this.u9);
      }
   }

   private void m1() {
      if (this.x8 != null) {
         this.x8.l6.n5.n5(this.u9);
      }
   }

   @Override
   public final IOverrideThemeManager getThemeManager() {
      return this.y4;
   }

   @Override
   public final byte getLayoutType() {
      return this.n3;
   }

   @Override
   public final ISlide[] getDependingSlides() {
      List var1 = new List();
      int var2 = this.getPresentation().getSlides().size();

      for (int var3 = 0; var3 < var2; var3++) {
         if (((Slide)this.getPresentation().getSlides().get_Item(var3)).w1() == this) {
            var1.addItem(this.getPresentation().getSlides().get_Item(var3));
         }
      }

      return var1.size() > 0 ? (ISlide[])var1.toArray(new ISlide[0]) : SlideCollection.l6;
   }

   @Override
   public final boolean hasDependingSlides() {
      int var1 = this.getPresentation().getSlides().size();

      for (int var2 = 0; var2 < var1; var2++) {
         if (((Slide)this.getPresentation().getSlides().get_Item(var2)).getLayoutSlide() == this) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean getShowMasterShapes() {
      return this.e2;
   }

   @Override
   public void setShowMasterShapes(boolean value) {
      this.e2 = value;
   }

   @Override
   public final IDrawingGuidesCollection getDrawingGuides() {
      return this.t9;
   }

   @Override
   Shape[] n5(IPlaceholder var1) {
      if (this.x8 == null) {
         return a6;
      }

      Shape var2 = this.x8.l6.n5(var1, null);
      return var2 == null ? a6 : new Shape[]{var2};
   }
}
