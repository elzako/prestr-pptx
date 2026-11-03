package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;

public final class OverrideTheme extends Theme implements IOverrideTheme {
   private ColorScheme n5;
   private FontScheme l6;
   private FormatScheme k5;
   private long u3 = 1L;
   private long a6 = 0L;

   OverrideTheme(BaseOverrideThemeManager parentImmediate) {
      super(parentImmediate);
   }

   @Override
   public final void initColorScheme() {
      this.u3 = this.getVersion();
      this.a6();
      if (this.n5 != null) {
         throw new InvalidOperationException();
      }

      this.n5 = new ColorScheme(this);
      this.n5.n5.l6(new OverrideTheme$1(this));
      ((ColorFormat)this.n5.getDark1()).n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      ((ColorFormat)this.n5.getLight1()).n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      ((ColorFormat)this.n5.getDark2()).n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      ((ColorFormat)this.n5.getLight2()).n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      ((ColorFormat)this.n5.getAccent1()).n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      ((ColorFormat)this.n5.getAccent2()).n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      ((ColorFormat)this.n5.getAccent3()).n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      ((ColorFormat)this.n5.getAccent4()).n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      ((ColorFormat)this.n5.getAccent5()).n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      ((ColorFormat)this.n5.getAccent6()).n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      ((ColorFormat)this.n5.getHyperlink()).n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      ((ColorFormat)this.n5.getFollowedHyperlink()).n5(com.aspose.slides.internal.o9b.c8.m3().o8());
   }

   @Override
   public final void initColorSchemeFrom(IColorScheme colorScheme) {
      if (colorScheme == null) {
         throw new ArgumentNullException("colorScheme");
      }

      this.initColorScheme();
      this.n5.n5((ColorScheme)colorScheme);
   }

   @Override
   public final void initColorSchemeFromInherited() {
      this.initColorScheme();
      if (this.u3().n5() != null) {
         this.n5.n5(((s8u)this.u3().n5().createThemeEffective()).l6());
      } else {
         throw new NotImplementedException();
      }
   }

   @Override
   public final void initFontScheme() {
      this.u3 = this.getVersion();
      this.a6();
      if (this.l6 != null) {
         throw new InvalidOperationException();
      }

      this.l6 = new FontScheme(this);
      this.l6.n5.l6(new OverrideTheme$2(this));
   }

   @Override
   public final void initFontSchemeFrom(IFontScheme fontScheme) {
      if (fontScheme == null) {
         throw new ArgumentNullException("fontScheme");
      }

      this.initFontScheme();
      this.l6.n5((FontScheme)fontScheme);
   }

   @Override
   public final void initFontSchemeFromInherited() {
      this.initFontScheme();
      if (this.u3().n5() != null) {
         this.l6.n5(this.u3().n5().createThemeEffective().getFontScheme());
      } else {
         throw new NotImplementedException();
      }
   }

   @Override
   public final void initFormatScheme() {
      this.u3 = this.getVersion();
      this.a6();
      if (this.k5 != null) {
         throw new InvalidOperationException();
      }

      this.k5 = new FormatScheme(this);
      this.k5.n5.l6(new OverrideTheme$3(this));
   }

   @Override
   public final void initFormatSchemeFrom(IFormatScheme formatScheme) {
      if (formatScheme == null) {
         throw new ArgumentNullException("formatScheme");
      }

      this.initFormatScheme();
      this.k5.n5((FormatScheme)formatScheme);
   }

   @Override
   public final void initFormatSchemeFromInherited() {
      this.initFormatScheme();
      if (this.u3().n5() != null) {
         this.k5.n5(this.u3().n5().createThemeEffective().getFormatScheme());
      } else {
         throw new NotImplementedException();
      }
   }

   @Override
   public IColorScheme getColorScheme() {
      return this.n5;
   }

   @Override
   public IFontScheme getFontScheme() {
      return this.l6;
   }

   @Override
   public IFormatScheme getFormatScheme() {
      return this.k5;
   }

   final ColorScheme n5() {
      if (this.n5 == null) {
         this.initColorScheme();
      }

      return this.n5;
   }

   @Override
   public final boolean isEmpty() {
      return this.n5 == null && this.l6 == null && this.k5 == null;
   }

   @Override
   public final void clear() {
      this.u3 = this.getVersion();
      this.a6();
      this.n5 = null;
      this.l6 = null;
      this.k5 = null;
   }

   private BaseOverrideThemeManager u3() {
      return (BaseOverrideThemeManager)this.getParent_Immediate();
   }

   private void a6() {
      this.u3++;
      this.u9();
   }

   private void u9() {
      this.a6 = 0L;
   }

   @Override
   public long getVersion() {
      if ((this.a6 & 4294967295L) == 0L) {
         this.a6 = (
                  ((this.u3 & 4294967295L) + ((this.n5 != null ? this.n5.u3() : 0L) & 4294967295L) & 4294967295L)
                        + ((this.l6 != null ? this.l6.u3() : 0L) & 4294967295L)
                     & 4294967295L
               )
               + ((this.k5 != null ? this.k5.u3() : 0L) & 4294967295L)
            & 4294967295L;
      }

      return this.a6;
   }

   // $VF: synthetic method
   static void n5(OverrideTheme var0) {
      var0.u9();
   }
}
