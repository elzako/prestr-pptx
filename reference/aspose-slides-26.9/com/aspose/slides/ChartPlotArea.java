package com.aspose.slides;

public class ChartPlotArea extends DomObject<Chart> implements IChartPlotArea {
   private final l1b l6;
   private final IFormat k5;
   boolean n5 = true;
   private int u3 = 1;
   private float a6;
   private float h0;
   private float c8;
   private float t2;

   ChartPlotArea(Chart parentImmediate) {
      super(parentImmediate);
      this.l6 = new l1b(parentImmediate);
      this.k5 = new Format(this);
   }

   final l1b n5() {
      return this.l6;
   }

   @Override
   public final IFormat getFormat() {
      return this.k5;
   }

   @Override
   public final float getX() {
      return this.n5().getX();
   }

   @Override
   public final void setX(float value) {
      this.n5 = false;
      this.n5().setX(value);
   }

   @Override
   public final float getY() {
      return this.n5().getY();
   }

   @Override
   public final void setY(float value) {
      this.n5 = false;
      this.n5().setY(value);
   }

   final float l6() {
      return this.n5().getY();
   }

   @Override
   public final float getWidth() {
      return this.n5().getWidth();
   }

   @Override
   public final void setWidth(float value) {
      this.n5 = false;
      this.n5().setWidth(value);
   }

   @Override
   public final float getHeight() {
      return this.n5().getHeight();
   }

   @Override
   public final void setHeight(float value) {
      this.n5 = false;
      this.n5().setHeight(value);
   }

   final float k5() {
      return this.n5().getHeight();
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
   public final IChart getChart() {
      return this.u9;
   }

   public final boolean isLocationAutocalculated() {
      return this.n5;
   }

   @Override
   public final int getLayoutTargetType() {
      return this.u3;
   }

   @Override
   public final void setLayoutTargetType(int value) {
      this.u3 = value;
   }

   @Override
   public final float getActualX() {
      return this.a6;
   }

   final void n5(float var1) {
      this.a6 = var1;
   }

   @Override
   public final float getActualY() {
      return this.h0;
   }

   final void l6(float var1) {
      this.h0 = var1;
   }

   @Override
   public final float getActualWidth() {
      return this.c8;
   }

   final void k5(float var1) {
      this.c8 = var1;
   }

   @Override
   public final float getActualHeight() {
      return this.t2;
   }

   final void u3(float var1) {
      this.t2 = var1;
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
