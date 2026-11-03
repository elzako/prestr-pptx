package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

final class y1x {
   private IMasterThemeManager n5;
   private IOverrideThemeManager l6;
   private boolean k5 = false;

   static y1x n5(BaseSlide var0) {
      if (com.aspose.slides.internal.v6g.k5.n5(var0, MasterNotesSlide.class) != null) {
         return new y1x(com.aspose.slides.internal.v6g.k5.n5(var0, MasterNotesSlide.class));
      } else if (com.aspose.slides.internal.v6g.k5.n5(var0, MasterHandoutSlide.class) != null) {
         return new y1x(com.aspose.slides.internal.v6g.k5.n5(var0, MasterHandoutSlide.class));
      } else if (com.aspose.slides.internal.v6g.k5.n5(var0, MasterSlide.class) != null) {
         return new y1x(com.aspose.slides.internal.v6g.k5.n5(var0, MasterSlide.class));
      } else if (com.aspose.slides.internal.v6g.k5.n5(var0, LayoutSlide.class) != null) {
         return new y1x(com.aspose.slides.internal.v6g.k5.n5(var0, LayoutSlide.class));
      } else if (com.aspose.slides.internal.v6g.k5.n5(var0, Slide.class) != null) {
         return new y1x(com.aspose.slides.internal.v6g.k5.n5(var0, Slide.class));
      } else if (com.aspose.slides.internal.v6g.k5.n5(var0, NotesSlide.class) != null) {
         return new y1x(com.aspose.slides.internal.v6g.k5.n5(var0, NotesSlide.class));
      } else {
         throw new NotImplementedException(
            com.aspose.slides.ms.System.d1.n5(new Object[]{"Unknown slide [", com.aspose.slides.ms.System.j8.n5(var0), "] for Theme Context!"})
         );
      }
   }

   public y1x(MasterNotesSlide var1) {
      this.n5 = var1.getThemeManager();
      this.k5 = true;
   }

   public y1x(MasterHandoutSlide var1) {
      this.n5 = var1.getThemeManager();
      this.k5 = true;
   }

   public y1x(MasterSlide var1) {
      this.n5 = var1.getThemeManager();
      this.k5 = true;
   }

   public y1x(LayoutSlide var1) {
      this.l6 = var1.getThemeManager();
      this.k5 = false;
   }

   public y1x(Slide var1) {
      this.l6 = var1.getThemeManager();
      this.k5 = false;
   }

   public y1x(NotesSlide var1) {
      this.l6 = var1.getThemeManager();
      this.k5 = false;
   }

   final IThemeManager n5() {
      return this.k5 ? this.n5 : this.l6;
   }

   final ITheme l6() {
      return this.k5 ? this.n5.getOverrideTheme() : this.l6.getOverrideTheme();
   }

   final m0l k5() {
      return this.k5 ? ((MasterThemeManager)this.n5).k5() : ((BaseOverrideThemeManager)this.l6).k5();
   }

   public final FormatScheme u3() {
      return (FormatScheme)this.l6().getFormatScheme();
   }

   public final FontScheme a6() {
      return (FontScheme)this.l6().getFontScheme();
   }

   final boolean u9() {
      return this.k5;
   }

   final boolean h0() {
      return this.k5 ? this.n5.isOverrideThemeEnabled() : this.l6.isOverrideThemeEnabled();
   }

   final void n5(boolean var1) {
      if (this.k5) {
         this.n5.setOverrideThemeEnabled(var1);
      }
   }
}
