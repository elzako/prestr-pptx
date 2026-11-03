package com.aspose.slides;

public class ChartWall extends DomObject<Chart> implements IChartWall {
   int n5;
   Format l6;
   int k5 = -1;
   private final v2x u3 = new v2x();

   ChartWall(Chart parentImmediate) {
      super(parentImmediate);
      this.l6 = new Format(this);
   }

   final v2x n5() {
      return this.u3;
   }

   @Override
   public final int getThickness() {
      return this.n5;
   }

   @Override
   public final void setThickness(int value) {
      this.n5 = value;
   }

   @Override
   public final IFormat getFormat() {
      return this.l6;
   }

   @Override
   public final int getPictureType() {
      return this.k5;
   }

   @Override
   public final void setPictureType(int value) {
      this.k5 = value;
   }
}
