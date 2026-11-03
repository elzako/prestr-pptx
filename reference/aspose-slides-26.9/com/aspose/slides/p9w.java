package com.aspose.slides;

class p9w extends DomObject<Axis> implements ILayoutable, IOverridableText {
   private Chart n5;
   private final t2h l6 = new t2h(this.getChart());
   private TextFrame k5;
   private IFormat u3 = new Format(this);
   private boolean a6;
   private ChartTextFormat h0;

   p9w(Axis var1) {
      super(var1);
   }

   final t2h n5() {
      return this.l6;
   }

   @Override
   public final IChart getChart() {
      if (this.n5 == null) {
         Chart[] var1 = new Chart[]{this.n5};
         d0u.n5(Chart.class, this.u9, var1);
         this.n5 = var1[0];
      }

      return this.n5;
   }

   @Override
   public final IBaseSlide getSlide() {
      return this.getChart() != null ? this.getChart().getSlide() : null;
   }

   @Override
   public final IPresentation getPresentation() {
      return this.getChart() != null ? this.getChart().getPresentation() : null;
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
      if (this.h0 == null) {
         this.h0 = new ChartTextFormat(this);
      }

      return this.h0;
   }

   final IFormat l6() {
      return this.u3;
   }

   final boolean k5() {
      return this.a6;
   }

   final void n5(boolean var1) {
      this.a6 = var1;
   }

   final Axis u3() {
      return this.u9;
   }
}
