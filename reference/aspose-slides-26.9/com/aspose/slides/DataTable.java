package com.aspose.slides;

public class DataTable extends DomObject<Chart> implements IDataTable {
   boolean n5;
   boolean l6;
   boolean k5;
   boolean u3;
   Format a6;
   private ChartTextFormat h0;
   private final w9n c8 = new w9n();

   DataTable(Chart parentImmediate) {
      super(parentImmediate);
      this.a6 = new Format(this);
   }

   final w9n n5() {
      return this.c8;
   }

   @Override
   public final IFormat getFormat() {
      return this.a6;
   }

   @Override
   public final boolean hasBorderHorizontal() {
      return this.n5;
   }

   @Override
   public final void setBorderHorizontal(boolean value) {
      this.n5 = value;
   }

   @Override
   public final boolean hasBorderOutline() {
      return this.k5;
   }

   @Override
   public final void setBorderOutline(boolean value) {
      this.k5 = value;
   }

   @Override
   public final boolean hasBorderVertical() {
      return this.l6;
   }

   @Override
   public final void setBorderVertical(boolean value) {
      this.l6 = value;
   }

   @Override
   public final boolean getShowLegendKey() {
      return this.u3;
   }

   @Override
   public final void setShowLegendKey(boolean value) {
      this.u3 = value;
   }

   @Override
   public final IChart getChart() {
      return this.u9;
   }

   @Override
   public final IChartTextFormat getTextFormat() {
      if (this.h0 == null) {
         this.h0 = new ChartTextFormat(this);
      }

      return this.h0;
   }

   @Override
   public final IBaseSlide getSlide() {
      return this.getChart() != null ? this.getChart().getSlide() : null;
   }

   @Override
   public final IPresentation getPresentation() {
      return this.getChart() != null ? this.getChart().getPresentation() : null;
   }
}
