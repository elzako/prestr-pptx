package com.aspose.slides;

final class ForEach$1 implements ForEach$ForEachSlideCallback {
   // $VF: synthetic field
   final ForEach$ForEachShapeCallback n5;
   // $VF: synthetic field
   final boolean l6;

   ForEach$1(ForEach$ForEachShapeCallback var1, boolean var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public void invoke(Slide slide, int index) {
      ForEach.shape(slide, this.n5);
      if (this.l6) {
         NotesSlide var3 = com.aspose.slides.internal.v6g.k5.n5(slide.getNotesSlideManager().getNotesSlide(), NotesSlide.class);
         if (var3 != null) {
            ForEach.shape(var3, this.n5);
         }
      }
   }
}
