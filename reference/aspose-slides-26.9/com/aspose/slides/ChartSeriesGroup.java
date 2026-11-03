package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class ChartSeriesGroup implements IChartSeriesGroup, r0g {
   private final r7n n5;
   private Chart l6;
   private f3l k5;
   private int u3;
   private boolean a6;
   private m4d u9;
   private UpDownBarsManager h0;
   private int c8;
   private int t2 = 150;
   private boolean s7;
   private int x8;
   private byte n3;
   private IChartLinesFormat y4;
   private IChartLinesFormat e2;
   private IChartLinesFormat t9;
   private int z1;
   private final PieSplitCustomPointCollection t4;
   private double q0 = 2.0;
   private int z3;
   private byte m1 = 10;
   private int k7 = 75;
   private int m3 = 100;

   @Override
   public final int getType() {
      return this.u3;
   }

   @Override
   public final boolean getPlotOnSecondAxis() {
      return this.a6;
   }

   @Override
   public final IChartSeriesReadonlyCollection getSeries() {
      return this.u9;
   }

   @Override
   public final IChartSeries get_Item(int index) {
      return this.u9.get_Item(index);
   }

   @Override
   public final IUpDownBarsManager getUpDownBars() {
      return this.h0;
   }

   @Override
   public final int getGapWidth() {
      return this.c8;
   }

   @Override
   public final void setGapWidth(int value) {
      this.c8 = value;
   }

   @Override
   public final int getGapDepth() {
      return this.t2;
   }

   @Override
   public final void setGapDepth(int value) {
      this.t2 = value;
   }

   @Override
   public final int getFirstSliceAngle() {
      return this.x8;
   }

   @Override
   public final void setFirstSliceAngle(int value) {
      if ((value & 65535) >= 0 && (value & 65535) <= 360) {
         this.x8 = value;
      } else {
         throw new ArgumentOutOfRangeException("FirstSliceAngle can be from 0 to 360 degrees.");
      }
   }

   @Override
   public final byte getDoughnutHoleSize() {
      return this.m1;
   }

   @Override
   public final void setDoughnutHoleSize(byte value) {
      if ((value & 255) >= 0 && (value & 255) <= 90) {
         this.m1 = value;
      } else {
         throw new ArgumentOutOfRangeException("DoughnutHoleSize can be from 0 to 90 persents.");
      }
   }

   @Override
   public final byte getOverlap() {
      return this.n3;
   }

   @Override
   public final void setOverlap(byte value) {
      if (value >= -100 && value <= 100) {
         this.n3 = value;
      } else {
         throw new ArgumentOutOfRangeException("Overlap value should be in the range from -100 to 100.");
      }
   }

   @Override
   public final int getSecondPieSize() {
      return this.k7;
   }

   @Override
   public final void setSecondPieSize(int value) {
      if ((value & 65535) >= 5 && (value & 65535) <= 200) {
         this.k7 = value;
      } else {
         throw new ArgumentOutOfRangeException("SecondPieSize can be from 5 to 200.");
      }
   }

   final boolean n5() {
      return this.u9().n5();
   }

   @Override
   public final int getBubbleSizeRepresentation() {
      return this.z1;
   }

   @Override
   public final void setBubbleSizeRepresentation(int value) {
      this.z1 = value;
   }

   @Override
   public final double getPieSplitPosition() {
      return this.q0;
   }

   @Override
   public final void setPieSplitPosition(double value) {
      this.q0 = value;
   }

   @Override
   public final int getPieSplitBy() {
      return this.z3;
   }

   @Override
   public final void setPieSplitBy(int value) {
      this.z3 = value;
   }

   @Override
   public final boolean isColorVaried() {
      return this.s7;
   }

   @Override
   public final void setColorVaried(boolean value) {
      this.s7 = value;
   }

   final IChartLinesFormat l6() {
      if (this.t9 == null) {
         this.t9 = new ChartLinesFormat(this);
      }

      return this.t9;
   }

   @Override
   public final boolean hasSeriesLines() {
      return this.t9 != null && this.t9.getLine().getFillFormat().getFillType() != 0;
   }

   @Override
   public final void setSeriesLines(boolean value) {
      if (this.t9 == null) {
         if (value) {
            this.t9 = new ChartLinesFormat(this);
            this.t9.getLine().getFillFormat().setFillType((byte)-1);
         }
      } else {
         this.t9.getLine().getFillFormat().setFillType((byte)(value ? -1 : 0));
      }
   }

   final IChartLinesFormat k5() {
      if (this.y4 == null) {
         this.y4 = new ChartLinesFormat(this);
      }

      return this.y4;
   }

   final boolean u3() {
      return this.y4 != null && this.y4.getLine().getFillFormat().getFillType() != 0;
   }

   @Override
   public final IChartLinesFormat getHiLowLinesFormat() {
      if (this.e2 == null) {
         this.e2 = new ChartLinesFormat(this);
      }

      return this.e2;
   }

   final boolean a6() {
      return this.e2 != null && this.e2.getLine().getFillFormat().getFillType() != 0;
   }

   @Override
   public final int getBubbleSizeScale() {
      return this.m3;
   }

   @Override
   public final void setBubbleSizeScale(int value) {
      if (value >= 0 && value <= 300) {
         this.m3 = value;
      } else {
         throw new ArgumentOutOfRangeException("BubbleSizeScale can be from 0 to 300.");
      }
   }

   @Override
   public final IPieSplitCustomPointCollection getPieSplitCustomPoints() {
      return this.t4;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.n5;
   }

   @Override
   public final IChart getChart() {
      if (this.l6 == null) {
         Chart[] var1 = new Chart[]{this.l6};
         d0u.n5(Chart.class, this.n5, var1);
         this.l6 = var1[0];
      }

      return this.l6;
   }

   @Override
   public final IBaseSlide getSlide() {
      return this.getChart() != null ? this.getChart().getSlide() : null;
   }

   @Override
   public final IPresentation getPresentation() {
      return this.getChart() != null ? this.getChart().getPresentation() : null;
   }

   ChartSeriesGroup(r7n parentImmediate, ChartSeries firstSeries) {
      this.n5 = parentImmediate;
      this.k5 = new f3l();
      this.u3 = ChartTypeCharacterizer.x8(firstSeries.getType());
      this.a6 = firstSeries.getPlotOnSecondAxis();
      this.u9 = new m4d(this);
      this.u9.n5(firstSeries);
      this.h0 = new UpDownBarsManager(this);
      this.t4 = new PieSplitCustomPointCollection(this);
      this.c8 = ChartTypeCharacterizer.l6(firstSeries.getType());
   }

   final f3l u9() {
      return this.k5;
   }
}
