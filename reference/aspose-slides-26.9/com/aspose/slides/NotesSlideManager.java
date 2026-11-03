package com.aspose.slides;

public final class NotesSlideManager extends DomObject<Slide> implements INotesSlideManager {
   private NotesSlide n5;

   @Override
   public final INotesSlide getNotesSlide() {
      return this.n5;
   }

   @Override
   public final INotesSlide addNotesSlide() {
      return this.n5(true);
   }

   final INotesSlide n5(boolean var1) {
      if (this.n5 == null || this.n5.getNotesTextFrame() == null) {
         i6f var2 = (i6f)this.n5().getPresentation().getMasterNotesSlideManager();
         if (var2.getMasterNotesSlide() == null) {
            var2.setDefaultMasterNotesSlide();
            var2.l6();
         }

         if (this.n5 == null) {
            this.n5(new NotesSlide(this));
            if (var1) {
               this.l6();
            }
         } else {
            e8e.l6(this.n5, "Notes Placeholder 2");
         }
      }

      return this.n5;
   }

   final void n5(NotesSlide var1) {
      this.n5 = var1;
      if (var1 != null) {
         var1.u9 = this.n5();
      }
   }

   @Override
   public final void removeNotesSlide() {
      this.n5.u9 = null;
      this.n5.n5((com.aspose.slides.r0g)null);
      this.n5 = null;
   }

   NotesSlideManager(Slide parentImmediate) {
      super(parentImmediate);
   }

   final Slide n5() {
      return this.u9;
   }

   private void l6() {
      MasterNotesSlide var1 = (MasterNotesSlide)this.n5().getPresentation().getMasterNotesSlideManager().getMasterNotesSlide();
      if (var1 != null && this.n5 != null) {
         com.aspose.slides.internal.k4y.c1v var2 = var1.t4().c8();
         if (var2 != null) {
            if (var2.u3()) {
               BaseHeaderFooterManager.n5(this.n5, var1, (byte)4);
            }

            if (var2.l6()) {
               BaseHeaderFooterManager.n5(this.n5, var1, (byte)7);
            }

            if (var2.k5()) {
               BaseHeaderFooterManager.n5(this.n5, var1, (byte)6);
            }

            if (var2.n5() && var1.getHeaderFooterManager().isSlideNumberVisible()) {
               Shape var3 = this.n5.n5((byte)5);
               if (var3 != null) {
                  ((Placeholder)var3.getPlaceholder()).n5(4294967295L);
               }

               BaseHeaderFooterManager.n5(this.n5, var1, (byte)5);
            }
         }
      }
   }
}
