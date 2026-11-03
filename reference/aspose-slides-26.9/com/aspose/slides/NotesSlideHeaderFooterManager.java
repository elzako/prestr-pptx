package com.aspose.slides;

public final class NotesSlideHeaderFooterManager extends BaseHandoutNotesSlideHeaderFooterManager implements INotesSlideHeaderFooterManager {
   private final NotesSlide n5;

   NotesSlideHeaderFooterManager(NotesSlide notesSlide) {
      super(notesSlide);
      this.n5 = notesSlide;
   }

   @Override
   void k5(byte var1) {
      n5(this.n5(), this.a6(), var1);
   }

   private MasterNotesSlide a6() {
      return (MasterNotesSlide)this.n5.getPresentation().getMasterNotesSlideManager().getMasterNotesSlide();
   }
}
