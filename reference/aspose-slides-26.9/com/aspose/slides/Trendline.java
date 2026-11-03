package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class Trendline extends DomObject<TrendlineCollection> implements ITrendline {
   private Chart n5;
   private final y9a l6 = new y9a();
   private double k5 = Double.NaN;
   private boolean u3;
   private boolean a6;
   private double h0 = Double.NaN;
   private double c8 = Double.NaN;
   private String t2;
   private byte s7 = 2;
   private byte x8 = 2;
   private int n3 = 1;
   private ChartTextFormat y4;
   private TextFrame e2;
   private Format t9 = new Format(this);
   private LegendEntryProperties z1;

   @Override
   public final String getTrendlineName() {
      return this.t2;
   }

   @Override
   public final void setTrendlineName(String value) {
      this.t2 = value;
   }

   @Override
   public final int getTrendlineType() {
      return this.n3;
   }

   @Override
   public final void setTrendlineType(int value) {
      this.n3 = value;
   }

   Trendline(TrendlineCollection parentImmediate) {
      super(parentImmediate);
      this.e2 = new TextFrame(this);
   }

   final y9a n5() {
      return this.l6;
   }

   @Override
   public final IFormat getFormat() {
      return this.t9;
   }

   @Override
   public final void setFormat(IFormat value) {
      this.t9 = (Format)value;
   }

   @Override
   public final double getBackward() {
      return this.k5;
   }

   @Override
   public final void setBackward(double value) {
      this.k5 = value;
   }

   @Override
   public final double getForward() {
      return this.h0;
   }

   @Override
   public final void setForward(double value) {
      this.h0 = value;
   }

   @Override
   public final double getIntercept() {
      return this.c8;
   }

   @Override
   public final void setIntercept(double value) {
      this.c8 = value;
   }

   @Override
   public final boolean getDisplayEquation() {
      return this.u3;
   }

   @Override
   public final void setDisplayEquation(boolean value) {
      this.u3 = value;
   }

   @Override
   public final byte getOrder() {
      return this.s7;
   }

   @Override
   public final void setOrder(byte value) {
      if ((value & 255) >= 2 && (value & 255) <= 6) {
         this.s7 = value;
      } else {
         throw new ArgumentOutOfRangeException("Value must be between 2 and 6");
      }
   }

   @Override
   public final byte getPeriod() {
      return this.x8;
   }

   @Override
   public final void setPeriod(byte value) {
      if ((value & 255) < 2) {
         throw new ArgumentOutOfRangeException("Value must be between 2 and 255");
      }

      this.x8 = value;
   }

   @Override
   public final boolean getDisplayRSquaredValue() {
      return this.a6;
   }

   @Override
   public final void setDisplayRSquaredValue(boolean value) {
      this.a6 = value;
   }

   @Override
   public final ILegendEntryProperties getRelatedLegendEntry() {
      if (this.z1 == null) {
         this.z1 = new LegendEntryProperties(this);
      }

      return this.z1;
   }

   @Override
   public final ITextFrame addTextFrameForOverriding(String text) {
      if (this.e2 == null) {
         this.e2 = new TextFrame(this);
      }

      ((ParagraphCollection)this.e2.getParagraphs()).n5(text);
      return this.e2;
   }

   @Override
   public final ITextFrame getTextFrameForOverriding() {
      return this.e2;
   }

   @Override
   public final IChartTextFormat getTextFormat() {
      if (this.y4 == null) {
         this.y4 = new ChartTextFormat(this);
      }

      return this.y4;
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
}
