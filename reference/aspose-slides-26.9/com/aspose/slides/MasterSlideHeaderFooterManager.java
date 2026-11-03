package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

public final class MasterSlideHeaderFooterManager extends BaseSlideHeaderFooterManager implements IMasterSlideHeaderFooterManager {
   private final MasterSlide n5;

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

   MasterSlideHeaderFooterManager(MasterSlide masterSlide) {
      super(masterSlide);
      this.n5 = masterSlide;
   }

   @Override
   void k5(byte var1) {
      if (!this.l6(var1)) {
         switch (var1) {
            case 4:
               this.u9();
               break;
            case 5:
               this.h0();
               break;
            case 6:
               this.a6();
               break;
            default:
               throw new ArgumentOutOfRangeException("placeholderType");
         }
      }
   }

   final void l6(byte var1, boolean var2) {
      this.n5(var1, var2);
      IGenericEnumerator var3 = this.n5.getLayoutSlides().iterator();

      try {
         while (var3.hasNext()) {
            ILayoutSlide var4 = (ILayoutSlide)var3.next();
            ((LayoutSlideHeaderFooterManager)var4.getHeaderFooterManager()).l6(var1, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   final void l6(byte var1, String var2, boolean var3) {
      this.n5(var1, var2, var3);
      IGenericEnumerator var4 = this.n5.getLayoutSlides().iterator();

      try {
         while (var4.hasNext()) {
            ILayoutSlide var5 = (ILayoutSlide)var4.next();
            ((LayoutSlideHeaderFooterManager)var5.getHeaderFooterManager()).l6(var1, var2, var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   private void a6() {
      AutoShape var1 = x2f.l6(this.n5, "Footer Placeholder");
      com.aspose.slides.internal.o9b.f2 var2 = ((SlideSize)this.n5.getPresentation().getSlideSize()).n5().a6();
      double var3 = 228.0;
      double var5 = (var2.l6() - var3) / 2.0;
      o4f var7 = var1.R_();
      var7.n5(new e4c(var5, 500.5));
      var1.n5(var3, 28.75);
   }

   private void u9() {
      AutoShape var1 = x2f.n5(this.n5, "Date Placeholder");
      o4f var2 = var1.R_();
      var2.n5(new e4c(66.0, 500.5));
      var1.n5(168.0, 28.75);
   }

   private void h0() {
      AutoShape var1 = x2f.k5(this.n5, "Slide Number Placeholder");
      com.aspose.slides.internal.o9b.f2 var2 = ((SlideSize)this.n5.getPresentation().getSlideSize()).n5().a6();
      double var3 = 168.0;
      double var5 = var2.l6() - var3 - 66.0;
      o4f var7 = var1.R_();
      var7.n5(new e4c(var5, 500.5));
      var1.n5(var3, 28.75);
   }
}
