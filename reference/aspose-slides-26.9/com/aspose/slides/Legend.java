package com.aspose.slides;

public class Legend extends DomObject<Chart> implements ILegend {
   private boolean k5;
   int n5 = 2;
   Format l6;
   private ChartTextFormat u3;
   private final LegendEntryCollection a6;
   private final s1b h0;
   private float c8;
   private float t2;
   private float s7;
   private float x8;

   Legend(Chart parentImmediate) {
      super(parentImmediate);
      this.h0 = new s1b(parentImmediate);
      this.l6 = new Format(this);
      this.a6 = new LegendEntryCollection(parentImmediate);
   }

   final s1b n5() {
      return this.h0;
   }

   @Override
   public final float getX() {
      return this.n5().getX();
   }

   @Override
   public final void setX(float value) {
      this.n5().setX(value);
   }

   @Override
   public final float getY() {
      return this.n5().getY();
   }

   @Override
   public final void setY(float value) {
      this.n5().setY(value);
   }

   @Override
   public final float getWidth() {
      return this.n5().getWidth();
   }

   @Override
   public final void setWidth(float value) {
      this.n5().setWidth(value);
   }

   @Override
   public final float getHeight() {
      return this.n5().getHeight();
   }

   @Override
   public final void setHeight(float value) {
      this.n5().setHeight(value);
   }

   @Override
   public final float getRight() {
      return this.n5().getRight();
   }

   @Override
   public final float getBottom() {
      return this.n5().getBottom();
   }

   @Override
   public final boolean getOverlay() {
      return this.k5;
   }

   @Override
   public final void setOverlay(boolean value) {
      this.k5 = value;
   }

   @Override
   public final IChartTextFormat getTextFormat() {
      if (this.u3 == null) {
         this.u3 = new ChartTextFormat(this);
      }

      return this.u3;
   }

   @Override
   public final int getPosition() {
      return this.n5;
   }

   @Override
   public final void setPosition(int value) {
      this.n5 = value;
   }

   @Override
   public final IFormat getFormat() {
      return this.l6;
   }

   @Override
   public final IChart getChart() {
      return this.u9;
   }

   @Override
   public final ILegendEntryCollection getEntries() {
      return this.a6;
   }

   @Override
   public final float getActualX() {
      return this.c8;
   }

   final void n5(float var1) {
      this.c8 = var1;
   }

   @Override
   public final float getActualY() {
      return this.t2;
   }

   final void l6(float var1) {
      this.t2 = var1;
   }

   @Override
   public final float getActualWidth() {
      return this.s7;
   }

   final void k5(float var1) {
      this.s7 = var1;
   }

   @Override
   public final float getActualHeight() {
      return this.x8;
   }

   final void u3(float var1) {
      this.x8 = var1;
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
