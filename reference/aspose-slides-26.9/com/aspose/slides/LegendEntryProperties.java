package com.aspose.slides;

public class LegendEntryProperties implements ILegendEntryProperties, r0g {
   private r0g n5;
   private IPresentationComponent l6;
   private ISlideComponent k5;
   private Chart u3;
   private s4p a6 = new s4p();
   private ChartTextFormat u9;
   private boolean h0;

   @Override
   public final IChartTextFormat getTextFormat() {
      if (this.u9 == null) {
         this.u9 = new ChartTextFormat(this);
      }

      return this.u9;
   }

   @Override
   public final boolean getHide() {
      return this.h0;
   }

   @Override
   public final void setHide(boolean value) {
      this.h0 = value;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.n5;
   }

   final IPresentationComponent n5() {
      if (this.l6 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.l6};
         d0u.n5(IPresentationComponent.class, this.n5, var1);
         this.l6 = var1[0];
      }

      return this.l6;
   }

   final ISlideComponent l6() {
      if (this.k5 == null) {
         ISlideComponent[] var1 = new ISlideComponent[]{this.k5};
         d0u.n5(ISlideComponent.class, this.n5, var1);
         this.k5 = var1[0];
      }

      return this.k5;
   }

   @Override
   public final IChart getChart() {
      if (this.u3 == null) {
         Chart[] var1 = new Chart[]{this.u3};
         d0u.n5(Chart.class, this.n5, var1);
         this.u3 = var1[0];
      }

      return this.u3;
   }

   @Override
   public final IBaseSlide getSlide() {
      return this.l6() != null ? this.l6().getSlide() : null;
   }

   @Override
   public final IPresentation getPresentation() {
      return this.n5() != null ? this.n5().getPresentation() : null;
   }

   LegendEntryProperties(r0g parentImmediate) {
      this.n5 = parentImmediate;
   }

   final s4p k5() {
      return this.a6;
   }
}
