package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

public final class MasterNotesSlideHeaderFooterManager extends BaseHandoutNotesSlideHeaderFooterManager implements IMasterNotesSlideHeaderFooterManager {
   private final MasterNotesSlide n5;

   @Override
   public final void setHeaderAndChildHeadersVisibility(boolean isVisible) {
      this.l6((byte)7, isVisible);
   }

   @Override
   public final void setHeaderAndChildHeadersText(String text) {
      this.l6((byte)7, text, false);
   }

   @Override
   public final void setFooterAndChildFootersVisibility(boolean isVisible) {
      this.l6((byte)6, isVisible);
   }

   @Override
   public final void setSlideNumberAndChildSlideNumbersVisibility(boolean isVisible) {
      this.l6((byte)5, isVisible);
   }

   @Override
   public final void setDateTimeAndChildDateTimesVisibility(boolean isVisible) {
      this.l6((byte)4, isVisible);
   }

   @Override
   public final void setFooterAndChildFootersText(String text) {
      this.l6((byte)6, text, false);
   }

   @Override
   public final void setDateTimeAndChildDateTimesText(String text) {
      this.l6((byte)4, text, true);
   }

   final void l6(byte var1, boolean var2) {
      this.n5(var1, var2);
      IGenericEnumerator var3 = this.a6().getSlides().iterator();

      try {
         while (var3.hasNext()) {
            ISlide var4 = (ISlide)var3.next();
            NotesSlide var5 = com.aspose.slides.internal.v6g.k5.n5(var4.getNotesSlideManager().getNotesSlide(), NotesSlide.class);
            if (var5 != null) {
               ((NotesSlideHeaderFooterManager)var5.getHeaderFooterManager()).n5(var1, var2);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   final void l6(byte var1, String var2, boolean var3) {
      this.n5(var1, var2, var3);
      IGenericEnumerator var4 = this.a6().getSlides().iterator();

      try {
         while (var4.hasNext()) {
            ISlide var5 = (ISlide)var4.next();
            NotesSlide var6 = com.aspose.slides.internal.v6g.k5.n5(var5.getNotesSlideManager().getNotesSlide(), NotesSlide.class);
            if (var6 != null) {
               ((NotesSlideHeaderFooterManager)var6.getHeaderFooterManager()).n5(var1, var2, var3);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   MasterNotesSlideHeaderFooterManager(MasterNotesSlide masterNotesSlide) {
      super(masterNotesSlide);
      this.n5 = masterNotesSlide;
   }

   @Override
   void k5(byte var1) {
      if (!this.l6(var1)) {
         switch (var1) {
            case 4:
               i6f.k5(this.n5, "Date Placeholder 2");
               break;
            case 5:
               i6f.u3(this.n5, "Slide Number Placeholder 6");
               break;
            case 6:
               i6f.l6(this.n5, "Footer Placeholder 5");
               break;
            case 7:
               i6f.n5(this.n5, "Header Placeholder 1");
               break;
            default:
               throw new ArgumentOutOfRangeException("placeholderType");
         }
      }
   }

   private Presentation a6() {
      return this.n5.z1();
   }
}
