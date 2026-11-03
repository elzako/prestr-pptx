package com.aspose.slides;

import com.aspose.slides.exceptions.NotSupportedException;

public class MasterHandoutSlide extends BaseSlide implements IMasterHandoutSlide {
   private n5h u9;
   private j3x h0;
   private MasterHandoutSlideHeaderFooterManager c8;
   private final MasterThemeManager t2;
   private final DrawingGuidesCollection s7;

   @Override
   public boolean getShowMasterShapes() {
      return false;
   }

   @Override
   public void setShowMasterShapes(boolean value) {
      if (value) {
         throw new NotSupportedException("MasterHandoutSlide doesn't contain another master slide and doesn't support this setter.");
      }
   }

   MasterHandoutSlide(z4k parentImmediate) {
      super(parentImmediate);
      if (this.h0 == null) {
         this.h0 = new j3x();
      }

      if (this.u9 == null) {
         this.u9 = new n5h();
      }

      this.h0.n5(this);
      this.t2 = new MasterThemeManager(this);
      this.s7 = new DrawingGuidesCollection(DrawingGuidesCollection.l6.o8());
      this.n5(new t0(this));
   }

   @Override
   o8 k5() {
      if (this.u9 == null) {
         this.u9 = new n5h();
      }

      return this.u9;
   }

   @Override
   f1 u3() {
      if (this.h0 == null) {
         this.h0 = new j3x();
      }

      return this.h0;
   }

   final n5h t4() {
      if (this.u9 == null) {
         this.u9 = new n5h();
      }

      return this.u9;
   }

   final j3x q0() {
      if (this.h0 == null) {
         this.h0 = new j3x();
      }

      return this.h0;
   }

   @Override
   public final IMasterHandoutSlideHeaderFooterManager getHeaderFooterManager() {
      if (this.c8 == null) {
         this.c8 = new MasterHandoutSlideHeaderFooterManager(this);
      }

      return this.c8;
   }

   @Override
   public final IMasterThemeManager getThemeManager() {
      return this.t2;
   }

   @Override
   public final IDrawingGuidesCollection getDrawingGuides() {
      return this.s7;
   }
}
