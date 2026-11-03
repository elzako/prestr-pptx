package com.aspose.slides;

public class NotesSlideThemeManager extends BaseOverrideThemeManager {
   @Override
   IThemeable n5() {
      return this.l6().getPresentation().getMasterNotesSlideManager().getMasterNotesSlide();
   }

   NotesSlideThemeManager(NotesSlide parentImmediate) {
      super(parentImmediate);
   }
}
