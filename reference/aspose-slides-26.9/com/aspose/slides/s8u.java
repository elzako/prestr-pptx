package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import java.awt.Color;

final class s8u implements IThemeEffectiveData, q6z {
   private final Theme n5;
   private final y4u l6;
   private final i9l k5;
   private final l3m u3;
   private FontScheme a6;
   private long u9;
   private static final s8u h0 = a6();

   s8u() {
      this.n5 = null;
      this.u9 = 4294967295L;
      MasterTheme var1 = new MasterTheme(null);
      b2y.n5(var1);
      this.l6 = new y4u((ColorScheme)var1.getColorScheme());
      this.u3 = new l3m((FormatScheme)var1.getFormatScheme());
      FontScheme var2 = (FontScheme)var1.getFontScheme();
      this.k5 = new i9l(var2);
      if (var2 != null) {
         this.a6 = var2;
      }
   }

   s8u(Theme var1) {
      this.n5 = var1;
      this.u9 = 4294967295L;
      this.l6 = new y4u();
      this.k5 = new i9l();
      this.u3 = new l3m();
   }

   @Override
   public final long k5() {
      return this.u9;
   }

   @Override
   public final IColorSchemeEffectiveData getColorScheme(Color styleColor) {
      return this.n5(com.aspose.slides.internal.o9b.c8.n5(styleColor));
   }

   IColorSchemeEffectiveData n5(com.aspose.slides.internal.o9b.c8 var1) {
      return this.l6;
   }

   @Override
   public final IFontSchemeEffectiveData getFontScheme() {
      return this.k5;
   }

   @Override
   public final IFormatSchemeEffectiveData getFormatScheme() {
      return this.u3;
   }

   final FontScheme n5() {
      return this.a6;
   }

   final y4u l6() {
      return this.l6;
   }

   final f6a n5(int var1) {
      if (var1 == 0) {
         return null;
      }

      if (var1 > 0) {
         return var1 <= this.u3.l6.size() ? (f6a)this.u3.l6.get_Item(var1 - 1) : null;
      }

      var1 = -var1;
      return var1 <= this.u3.a6.size() ? (f6a)this.u3.a6.get_Item(var1 - 1) : null;
   }

   final f6a n5(IBaseSlide var1, int var2, ColorFormat var3) {
      m0a var4 = this.k5(var1, var2, var3);
      return var4 != null ? com.aspose.slides.internal.v6g.k5.n5(var4.n5, f6a.class) : null;
   }

   final t8r l6(int var1) {
      return var1 == 0 ? null : (t8r)this.u3.k5.get_Item(var1 - 1);
   }

   final t8r l6(IBaseSlide var1, int var2, ColorFormat var3) {
      n4k var4 = this.u3(var1, var2, var3);
      return var4 != null ? com.aspose.slides.internal.v6g.k5.n5(var4.n5, t8r.class) : null;
   }

   final d0e n5(long var1) {
      return (var1 & 4294967295L) == 0L ? null : (d0e)this.u3.u3.get_Item((int)var1 - 1).getEffectFormat();
   }

   final h3g l6(long var1) {
      return (var1 & 4294967295L) == 0L ? null : (h3g)this.u3.u3.get_Item((int)var1 - 1).getThreeDFormat();
   }

   final m0a k5(IBaseSlide var1, int var2, ColorFormat var3) {
      if (var2 > 0) {
         if (var2 <= this.u3.l6.size()) {
            r0s var4 = var3.l6(var1);
            return new m0a((f6a)this.u3.n5(var4.n5().o8()).get_Item(var2 - 1), var4);
         }
      } else if (var2 < 0) {
         var2 = -var2;
         if (var2 <= this.u3.a6.size()) {
            r0s var6 = var3.l6(var1);
            return new m0a((f6a)this.u3.u3(var6.n5().o8()).get_Item(var2 - 1), var6);
         }
      }

      return null;
   }

   final n4k u3(IBaseSlide var1, int var2, ColorFormat var3) {
      return var2 == 0 ? null : new n4k((t8r)this.u3.l6(var3.l6(var1).n5().o8()).get_Item(var2 - 1), var3.l6(var1));
   }

   final void u3() {
      if (this.n5 != null) {
         s8u var1 = n5(this.n5);
         long var2 = (this.n5.getVersion() & 4294967295L) + (var1.k5() & 4294967295L) & 4294967295L;
         if ((var2 & 4294967295L) != (this.u9 & 4294967295L)) {
            this.a6 = var1.a6;
            this.l6.n5(var1.l6, (ColorScheme)this.n5.getColorScheme());
            this.u3.n5(var1.u3, (FormatScheme)this.n5.getFormatScheme());
            FontScheme var4 = (FontScheme)this.n5.getFontScheme();
            this.k5.n5(var1.k5, var4);
            if (var4 != null) {
               this.a6 = var4;
            }
         }

         this.u9 = var2;
      }
   }

   private static s8u n5(Theme var0) {
      IPresentationComponent var1 = var0.getParent_IPresentationComponent();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, Chart.class)) {
         Chart var6 = com.aspose.slides.internal.v6g.k5.n5(var1, Chart.class);
         IThemeManager var7 = ((BaseSlide)var6.getSlide()).h0();
         if (com.aspose.slides.internal.v6g.k5.l6(var7, MasterThemeManager.class)) {
            return ((Theme)((MasterThemeManager)var7).getOverrideTheme()).l6();
         } else if (com.aspose.slides.internal.v6g.k5.l6(var7, BaseOverrideThemeManager.class)) {
            return ((Theme)((BaseOverrideThemeManager)var7).getOverrideTheme()).l6();
         } else {
            throw new NotImplementedException("Unknown theme manager type.");
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Slide.class)) {
         Slide var5 = com.aspose.slides.internal.v6g.k5.n5(var1, Slide.class);
         if (var5.getLayoutSlide() != null && var5.getLayoutSlide().getThemeManager().isOverrideThemeEnabled()) {
            return ((Theme)var5.getLayoutSlide().getThemeManager().getOverrideTheme()).l6();
         } else {
            return var5.r4() != null && var5.r4().getThemeManager().isOverrideThemeEnabled()
               ? ((Theme)var5.r4().getThemeManager().getOverrideTheme()).l6()
               : ((Theme)var5.getPresentation().getMasterTheme()).l6();
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, NotesSlide.class)) {
         NotesSlide var4 = com.aspose.slides.internal.v6g.k5.n5(var1, NotesSlide.class);
         MasterSlide var3 = var4.e2();
         if (var3 != null) {
            return ((Theme)var3.getThemeManager().getOverrideTheme()).l6();
         } else {
            return var4.getPresentation().getMasterNotesSlideManager().getMasterNotesSlide().getThemeManager().isOverrideThemeEnabled()
               ? ((Theme)var4.getPresentation().getMasterNotesSlideManager().getMasterNotesSlide().getThemeManager().getOverrideTheme()).l6()
               : ((Theme)var1.getPresentation().getMasterTheme()).l6();
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, LayoutSlide.class)) {
         LayoutSlide var2 = com.aspose.slides.internal.v6g.k5.n5(var1, LayoutSlide.class);
         return var2.getMasterSlide().getThemeManager().isOverrideThemeEnabled()
            ? ((Theme)var2.getMasterSlide().getThemeManager().getOverrideTheme()).l6()
            : ((Theme)var1.getPresentation().getMasterTheme()).l6();
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, MasterSlide.class)
         || com.aspose.slides.internal.v6g.k5.l6(var1, MasterNotesSlide.class)
         || com.aspose.slides.internal.v6g.k5.l6(var1, MasterHandoutSlide.class)) {
         return com.aspose.slides.internal.v6g.k5.l6(((r0g)var1.getPresentation().getMasterTheme()).getParent_Immediate(), Presentation.class)
            ? ((Theme)var1.getPresentation().getMasterTheme()).l6()
            : h0;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Presentation.class)) {
         return h0;
      } else {
         throw new NotImplementedException();
      }
   }

   private static s8u a6() {
      return new s8u();
   }
}
