package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;

public class MasterThemeManager extends BaseThemeManager implements IMasterThemeManager {
   private MasterTheme l6 = new MasterTheme(this);
   private boolean k5;

   @Override
   public final IMasterTheme getOverrideTheme() {
      return this.l6;
   }

   @Override
   public final void setOverrideTheme(IMasterTheme value) {
      if (value != null && value.getPresentation() == this.l6.getPresentation()) {
         this.l6 = (MasterTheme)value;
      } else {
         throw new ArgumentException("Assined theme must be from the same presentation and must not be null.");
      }
   }

   private IMasterTheme a6() {
      return this.l6().getPresentation().getMasterTheme();
   }

   final IMasterTheme n5() {
      return this.isOverrideThemeEnabled() ? this.getOverrideTheme() : this.a6();
   }

   @Override
   public final IThemeEffectiveData createThemeEffective() {
      return this.l6.getEffective();
   }

   @Override
   public final boolean isOverrideThemeEnabled() {
      return this.k5;
   }

   @Override
   public final void setOverrideThemeEnabled(boolean value) {
      if (value && (this.l6.getName() == null || "".equals(this.l6.getName()))) {
         this.l6.setName(com.aspose.slides.ms.System.d1.n5(new String[]{this.a6().getName(), " overriden"}));
      }

      this.k5 = value;
   }

   @Override
   public final void applyColorScheme(IExtraColorScheme scheme) {
      ((ColorScheme)this.l6.getColorScheme()).n5((ColorScheme)scheme.getColorScheme());
      this.u3().n5(((ExtraColorScheme)scheme).n5());
   }

   MasterThemeManager(BaseSlide parentImmediate) {
      super(parentImmediate);
      this.u3().n5(true);
   }

   @Override
   m0l k5() {
      return this.u3().n5() ? this.u3() : this.u9();
   }

   private m0l u9() {
      return n5;
   }

   final BaseSlide l6() {
      return (BaseSlide)this.getParent_Immediate();
   }
}
