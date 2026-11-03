package com.aspose.slides;

public abstract class Theme implements ITheme, q1v, q7p {
   private r0g n5;
   private IPresentationComponent l6;
   private s8u k5;

   Theme(r0g parentImmediate) {
      this.n5 = parentImmediate;
   }

   @Override
   public abstract IColorScheme getColorScheme();

   @Override
   public abstract IFontScheme getFontScheme();

   @Override
   public abstract IFormatScheme getFormatScheme();

   @Override
   public final IPresentation getPresentation() {
      return this.getParent_IPresentationComponent() != null ? this.getParent_IPresentationComponent().getPresentation() : null;
   }

   @Override
   public final IThemeEffectiveData getEffective() {
      return this.l6();
   }

   final s8u l6() {
      if (this.k5 == null) {
         this.k5 = new s8u(this);
      }

      this.k5.u3();
      return this.k5;
   }

   final void k5() {
      this.k5 = null;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.n5;
   }

   @Override
   public final IPresentationComponent getParent_IPresentationComponent() {
      if (this.l6 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.l6};
         d0u.n5(IPresentationComponent.class, this.n5, var1);
         this.l6 = var1[0];
      }

      return this.l6;
   }

   @Override
   public abstract long getVersion();

   static IThemeManager n5(IThemeable var0) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0, IMasterThemeable.class)) {
         return ((IMasterThemeable)var0).getThemeManager();
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var0, IOverrideThemeable.class)) {
         return ((IOverrideThemeable)var0).getThemeManager();
      }

      com.aspose.slides.internal.f8y.n5.n5("");
      return null;
   }
}
