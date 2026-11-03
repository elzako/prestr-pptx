package com.aspose.slides;

public class UpDownBarsManager extends DomObject<ChartSeriesGroup> implements IUpDownBarsManager {
   private final q5m n5 = new q5m();
   private final Format l6;
   private final Format k5;
   private boolean u3 = false;
   private int a6 = 150;

   @Override
   public final IFormat getUpBarsFormat() {
      return this.l6;
   }

   @Override
   public final IFormat getDownBarsFormat() {
      return this.k5;
   }

   @Override
   public final boolean hasUpDownBars() {
      return this.u3;
   }

   @Override
   public final void setUpDownBars(boolean value) {
      this.u3 = value;
   }

   @Override
   public final int getGapWidth() {
      return this.a6;
   }

   @Override
   public final void setGapWidth(int value) {
      this.a6 = value;
   }

   UpDownBarsManager(ChartSeriesGroup parentImmediate) {
      super(parentImmediate);
      this.l6 = new Format(this);
      this.k5 = new Format(this);
   }

   final q5m n5() {
      return this.n5;
   }
}
