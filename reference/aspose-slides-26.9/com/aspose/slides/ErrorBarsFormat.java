package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;

public class ErrorBarsFormat extends DomObject<ChartSeries> implements IErrorBarsFormat {
   private final y8i n5 = new y8i();
   private int l6 = 0;
   private int k5 = 4;
   private boolean u3 = true;
   private float a6;
   private Format h0 = new Format(this);
   private boolean c8;

   ErrorBarsFormat(ChartSeries parentImmediate) {
      super(parentImmediate);
   }

   @Override
   public final int getType() {
      return this.l6;
   }

   @Override
   public final void setType(int value) {
      this.l6 = value;
   }

   @Override
   public final int getValueType() {
      return this.k5;
   }

   @Override
   public final void setValueType(int value) {
      this.k5 = value;
   }

   @Override
   public final boolean hasEndCap() {
      return this.u3;
   }

   @Override
   public final void setEndCap(boolean value) {
      this.u3 = value;
   }

   @Override
   public final float getValue() {
      return this.getValueType() != 0 && this.getValueType() != 4 ? this.a6 : Float.NaN;
   }

   @Override
   public final void setValue(float value) {
      if (this.getValueType() != 0 && this.getValueType() != 4) {
         this.a6 = value;
      } else {
         throw new InvalidOperationException("Value of ValueType property must be Fixed, Percentage or StandardDeviation");
      }
   }

   @Override
   public final IFormat getFormat() {
      return this.h0;
   }

   @Override
   public final void setFormat(IFormat value) {
      this.h0 = (Format)value;
   }

   @Override
   public final IChart getChart() {
      return this.u9.getChart();
   }

   @Override
   public final boolean isVisible() {
      return this.c8;
   }

   @Override
   public final void setVisible(boolean value) {
      this.c8 = value;
   }

   @Override
   public final IBaseSlide getSlide() {
      return this.u9 != null ? this.u9.getSlide() : null;
   }

   @Override
   public final IPresentation getPresentation() {
      return this.u9 != null ? this.u9.getPresentation() : null;
   }

   final y8i n5() {
      return this.n5;
   }
}
