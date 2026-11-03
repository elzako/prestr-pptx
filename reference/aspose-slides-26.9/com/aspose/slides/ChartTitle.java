package com.aspose.slides;

public class ChartTitle implements IChartTitle, r0g {
   private boolean n5 = true;
   private final Format l6;
   private TextFrame k5;
   private ChartTextFormat u3;
   private y5s a6;
   private r0g u9;
   private Chart h0;
   private float c8;
   private float t2;
   private float s7;
   private float x8;

   ChartTitle(r0g parentImmediate) {
      this.u9 = parentImmediate;
      this.a6 = new y5s(this.getChart());
      this.l6 = new Format(this);
   }

   final y5s n5() {
      return this.a6;
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
      return this.n5;
   }

   @Override
   public final void setOverlay(boolean value) {
      this.n5 = value;
   }

   @Override
   public final IFormat getFormat() {
      return this.l6;
   }

   @Override
   public final ITextFrame addTextFrameForOverriding(String text) {
      if (this.k5 == null) {
         this.k5 = new TextFrame(this);
      }

      ((ParagraphCollection)this.k5.getParagraphs()).n5(text);
      return this.k5;
   }

   @Override
   public final ITextFrame getTextFrameForOverriding() {
      return this.k5;
   }

   @Override
   public final IChartTextFormat getTextFormat() {
      if (this.u3 == null) {
         this.u3 = new ChartTextFormat(this);
      }

      return this.u3;
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
   public final r0g getParent_Immediate() {
      return this.u9;
   }

   @Override
   public final IChart getChart() {
      if (this.h0 == null) {
         Chart[] var1 = new Chart[]{this.h0};
         d0u.n5(Chart.class, this.u9, var1);
         this.h0 = var1[0];
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
