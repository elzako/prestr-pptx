package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class MasterHandoutSlideHeaderFooterManager extends BaseHandoutNotesSlideHeaderFooterManager implements IMasterHandoutSlideHeaderFooterManager {
   private final MasterHandoutSlide n5;

   MasterHandoutSlideHeaderFooterManager(MasterHandoutSlide masterHandoutSlide) {
      super(masterHandoutSlide);
      this.n5 = masterHandoutSlide;
   }

   @Override
   void k5(byte var1) {
      if (!this.l6(var1)) {
         switch (var1) {
            case 4:
               z4k.k5(this.n5, "Date Placeholder 2");
               break;
            case 5:
               z4k.u3(this.n5, "Slide Number Placeholder 4");
               break;
            case 6:
               z4k.l6(this.n5, "Footer Placeholder 3");
               break;
            case 7:
               z4k.n5(this.n5, "Header Placeholder 1");
               break;
            default:
               throw new ArgumentOutOfRangeException("placeholderType");
         }
      }
   }
}
