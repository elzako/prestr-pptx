package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;

public abstract class BaseOverrideThemeManager extends BaseThemeManager implements IOverrideThemeManager {
   private IThemeable l6;
   private OverrideTheme k5 = new OverrideTheme(this);

   @Override
   public final IOverrideTheme getOverrideTheme() {
      return this.k5;
   }

   @Override
   public final void setOverrideTheme(IOverrideTheme value) {
      if (value != null && value.getPresentation() == this.k5.getPresentation()) {
         this.k5 = (OverrideTheme)value;
      } else {
         throw new ArgumentException("Assined theme must be from the same presentation and must not be null.");
      }
   }

   @Override
   public final IThemeEffectiveData createThemeEffective() {
      return this.k5.getEffective();
   }

   @Override
   public final boolean isOverrideThemeEnabled() {
      return !this.k5.isEmpty();
   }

   @Override
   public final void applyColorScheme(IExtraColorScheme scheme) {
      this.k5.n5().n5((ColorScheme)scheme.getColorScheme());
      this.u3().n5(((ExtraColorScheme)scheme).n5().n5());
      if (this.u3().n5()) {
         this.u3().n5(((ExtraColorScheme)scheme).n5());
      }
   }

   BaseOverrideThemeManager(r0g parentImmediate) {
      super(parentImmediate);
   }

   abstract IThemeable n5();

   final IThemeable l6() {
      if (this.l6 == null) {
         IThemeable[] var1 = new IThemeable[]{this.l6};
         d0u.n5(IThemeable.class, this.getParent_Immediate(), var1);
         this.l6 = var1[0];
      }

      return this.l6;
   }

   @Override
   m0l k5() {
      return this.u3().n5() ? this.u3() : this.a6();
   }

   private m0l a6() {
      return this.n5() != null ? ((BaseThemeManager)Theme.n5(this.n5())).k5() : n5;
   }
}
