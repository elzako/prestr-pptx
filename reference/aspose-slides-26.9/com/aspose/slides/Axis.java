package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

public class Axis extends DomObject<AxesManager> implements IAxis {
   private float n5;
   private int l6;
   private p9w k5;
   private boolean u3 = true;
   private double a6;
   private boolean h0 = true;
   private double c8;
   private boolean t2 = true;
   private double s7;
   private boolean x8 = true;
   private double n3;
   private boolean y4 = false;
   private double e2 = 10.0;
   private boolean t9 = false;
   private boolean z1 = true;
   private int t4 = 3;
   private int q0 = 2;
   private int z3 = 2;
   private int m1;
   private int k7;
   private int m3;
   private boolean z8 = true;
   private final ChartLinesFormat j5;
   private final ChartLinesFormat w1;
   private final AxisFormat r4;
   private final ChartTitle c4;
   private int y2;
   private int y1;
   private long a0 = 1L;
   private boolean d2 = true;
   private long d5 = 1L;
   private boolean s3 = true;
   private String p8 = "";
   private boolean f2 = true;
   private boolean i1 = false;
   private int e5 = 100;
   private int b3 = 0;
   private ChartTextFormat o0;
   private final n7 z7 = new n7();
   private Chart v4;
   private int u6 = 1;
   private double t1 = 4.0;
   private long a5 = 6L;
   private boolean h2 = false;
   private boolean v0 = true;
   private double f0 = 0.0;
   private boolean a3 = false;
   private boolean p3 = true;
   private double x9 = 0.0;
   private double y0;
   private double j9;
   private double z6;
   private double e9;
   private double o5;
   private int j8;
   private int w2;

   Axis(AxesManager parentImmediate) {
      super(parentImmediate);
      this.r4 = new AxisFormat(this);
      this.c4 = new ChartTitle(this);
      this.k5 = new p9w(this);
      this.j5 = new ChartLinesFormat(this);
      this.w1 = new ChartLinesFormat(this);
   }

   final n7 n5() {
      return this.z7;
   }

   @Override
   public final IChart getChart() {
      if (this.v4 == null) {
         Chart[] var1 = new Chart[]{this.v4};
         d0u.n5(Chart.class, this.u9, var1);
         this.v4 = var1[0];
      }

      return this.v4;
   }

   @Override
   public final boolean getAxisBetweenCategories() {
      Axis var1 = this.a6();
      return var1 != null ? var1.n5().h0() != 1 : true;
   }

   @Override
   public final void setAxisBetweenCategories(boolean value) {
      Axis var2 = this.a6();
      if (var2 != null) {
         var2.n5().l6(value ? 0 : 1);
      }
   }

   @Override
   public final int getCategoryAxisType() {
      return this.b3;
   }

   @Override
   public final void setCategoryAxisType(int value) {
      this.b3 = value;
   }

   final double l6() {
      return this.y0;
   }

   final void n5(double var1) {
      this.y0 = var1;
   }

   @Override
   public final void setCategoryAxisTypeAutomatically() {
      IChartCategoryCollection var1 = null;
      ChartData var2 = com.aspose.slides.internal.v6g.k5.n5(this.getChart().getChartData(), ChartData.class);
      if (this != this.getChart().getAxes().getVerticalAxis() && this != this.getChart().getAxes().getHorizontalAxis()) {
         var1 = this.getChart().getChartData().getSecondaryCategories();
      } else {
         var1 = this.getChart().getChartData().getCategories();
      }

      if (var1 != null) {
         boolean var3 = true;
         IGenericEnumerator var4 = var1.iterator();

         try {
            while (var4.hasNext()) {
               ChartCategory var5 = (ChartCategory)var4.next();
               Object var6 = var2.l6().k5() != 2 ? var5.n5() : var5.getValue();
               if (var6 != null && !com.aspose.slides.internal.v6g.k5.l6(var6, Double.class)) {
                  var3 = false;
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         this.setCategoryAxisType(var3 ? 1 : 0);
      }
   }

   @Override
   public final float getCrossAt() {
      return this.n5;
   }

   @Override
   public final void setCrossAt(float value) {
      this.n5 = value;
   }

   @Override
   public final int getDisplayUnit() {
      return this.l6;
   }

   @Override
   public final void setDisplayUnit(int value) {
      this.l6 = value;
   }

   final p9w k5() {
      return this.k5;
   }

   @Override
   public final double getActualMaxValue() {
      return this.j9;
   }

   final void l6(double var1) {
      this.j9 = var1;
   }

   @Override
   public final double getActualMinValue() {
      return this.z6;
   }

   final void k5(double var1) {
      this.z6 = var1;
   }

   @Override
   public final double getActualMajorUnit() {
      return this.e9;
   }

   final void u3(double var1) {
      this.e9 = var1;
   }

   @Override
   public final double getActualMinorUnit() {
      return this.o5;
   }

   final void a6(double var1) {
      this.o5 = var1;
   }

   @Override
   public final int getActualMajorUnitScale() {
      return this.j8;
   }

   final void n5(int var1) {
      this.j8 = var1;
   }

   @Override
   public final int getActualMinorUnitScale() {
      return this.w2;
   }

   final void l6(int var1) {
      this.w2 = var1;
   }

   @Override
   public final boolean isAutomaticMaxValue() {
      return this.u3;
   }

   @Override
   public final void setAutomaticMaxValue(boolean value) {
      this.u3 = value;
   }

   @Override
   public final double getMaxValue() {
      return this.a6;
   }

   @Override
   public final void setMaxValue(double value) {
      this.a6 = value;
   }

   @Override
   public final double getMinorUnit() {
      return this.s7;
   }

   @Override
   public final void setMinorUnit(double value) {
      this.s7 = value;
   }

   @Override
   public final boolean isAutomaticMinorUnit() {
      return this.t2;
   }

   @Override
   public final void setAutomaticMinorUnit(boolean value) {
      this.t2 = value;
   }

   @Override
   public final double getMajorUnit() {
      return this.c8;
   }

   @Override
   public final void setMajorUnit(double value) {
      this.c8 = value;
   }

   @Override
   public final boolean isAutomaticMajorUnit() {
      return this.h0;
   }

   @Override
   public final void setAutomaticMajorUnit(boolean value) {
      this.h0 = value;
   }

   @Override
   public final boolean isAutomaticMinValue() {
      return this.x8;
   }

   @Override
   public final void setAutomaticMinValue(boolean value) {
      this.x8 = value;
   }

   @Override
   public final double getMinValue() {
      return this.n3;
   }

   @Override
   public final void setMinValue(double value) {
      this.n3 = value;
   }

   @Override
   public final boolean isLogarithmic() {
      return this.y4;
   }

   @Override
   public final void setLogarithmic(boolean value) {
      this.y4 = value;
   }

   @Override
   public final double getLogBase() {
      return this.e2;
   }

   @Override
   public final void setLogBase(double value) {
      this.e2 = value;
   }

   @Override
   public final boolean isPlotOrderReversed() {
      return this.t9;
   }

   @Override
   public final void setPlotOrderReversed(boolean value) {
      this.t9 = value;
   }

   @Override
   public final boolean isVisible() {
      return this.z1;
   }

   @Override
   public final void setVisible(boolean value) {
      this.z1 = value;
   }

   @Override
   public final int getMajorTickMark() {
      return this.t4;
   }

   @Override
   public final void setMajorTickMark(int value) {
      this.t4 = value;
   }

   @Override
   public final int getMinorTickMark() {
      return this.q0;
   }

   @Override
   public final void setMinorTickMark(int value) {
      this.q0 = value;
   }

   @Override
   public final int getTickLabelPosition() {
      return this.z3;
   }

   @Override
   public final void setTickLabelPosition(int value) {
      this.z3 = value;
   }

   @Override
   public final int getMajorUnitScale() {
      return this.m1;
   }

   @Override
   public final void setMajorUnitScale(int value) {
      this.m1 = value;
   }

   @Override
   public final int getMinorUnitScale() {
      return this.k7;
   }

   @Override
   public final void setMinorUnitScale(int value) {
      this.k7 = value;
   }

   @Override
   public final int getBaseUnitScale() {
      return this.m3;
   }

   @Override
   public final void setBaseUnitScale(int value) {
      this.m3 = value;
   }

   final boolean u3() {
      return this.z8;
   }

   final void n5(boolean var1) {
      this.z8 = var1;
   }

   @Override
   public final IChartLinesFormat getMinorGridLinesFormat() {
      return this.j5;
   }

   @Override
   public final IChartLinesFormat getMajorGridLinesFormat() {
      return this.w1;
   }

   @Override
   public final boolean getShowMinorGridLines() {
      return this.j5.getLine().getFillFormat().getFillType() != 0;
   }

   @Override
   public final boolean getShowMajorGridLines() {
      return this.w1.getLine().getFillFormat().getFillType() != 0;
   }

   @Override
   public final IAxisFormat getFormat() {
      return this.r4;
   }

   @Override
   public final IChartTextFormat getTextFormat() {
      if (this.o0 == null) {
         this.o0 = new ChartTextFormat(this);
      }

      return this.o0;
   }

   @Override
   public final IChartTitle getTitle() {
      return this.c4;
   }

   @Override
   public final int getCrossType() {
      return this.y2;
   }

   @Override
   public final void setCrossType(int value) {
      this.y2 = value;
   }

   @Override
   public final int getPosition() {
      return this.y1;
   }

   @Override
   public final void setPosition(int value) {
      this.y1 = value;
   }

   @Override
   public final boolean hasTitle() {
      return this.i1;
   }

   @Override
   public final void setTitle(boolean value) {
      this.i1 = value;
   }

   @Override
   public final String getNumberFormat() {
      return this.p8;
   }

   @Override
   public final void setNumberFormat(String value) {
      this.p8 = value;
   }

   @Override
   public final boolean isNumberFormatLinkedToSource() {
      return this.f2;
   }

   @Override
   public final void setNumberFormatLinkedToSource(boolean value) {
      this.f2 = value;
   }

   @Override
   public final float getTickLabelRotationAngle() {
      return ((TextFrameFormat)this.getTextFormat().getTextBlockFormat()).getRotationAngle();
   }

   @Override
   public final void setTickLabelRotationAngle(float value) {
      ((TextFrameFormat)this.getTextFormat().getTextBlockFormat()).setRotationAngle(value);
   }

   @Override
   public final long getTickLabelSpacing() {
      return this.a0;
   }

   @Override
   public final void setTickLabelSpacing(long value) {
      if ((value & 4294967295L) <= 0L) {
         throw new PptxException("Invalid value: must be greater than 0");
      }

      this.a0 = value;
   }

   @Override
   public final boolean isAutomaticTickLabelSpacing() {
      return this.d2;
   }

   @Override
   public final void setAutomaticTickLabelSpacing(boolean value) {
      this.d2 = value;
   }

   @Override
   public final long getTickMarksSpacing() {
      return this.d5;
   }

   @Override
   public final void setTickMarksSpacing(long value) {
      if ((value & 4294967295L) <= 0L) {
         throw new PptxException("Invalid value: must be greater than 0");
      }

      this.d5 = value;
   }

   @Override
   public final boolean isAutomaticTickMarksSpacing() {
      return this.s3;
   }

   @Override
   public final void setAutomaticTickMarksSpacing(boolean value) {
      this.s3 = value;
   }

   @Override
   public final int getLabelOffset() {
      return this.e5;
   }

   @Override
   public final void setLabelOffset(int value) {
      this.e5 = value;
   }

   final Axis a6() {
      if (this.u9.getHorizontalAxis() == this) {
         return (Axis)this.u9.getVerticalAxis();
      } else if (this.u9.getVerticalAxis() == this) {
         return (Axis)this.u9.getHorizontalAxis();
      } else if (this.u9.getSecondaryVerticalAxis() == this) {
         return (Axis)this.u9.getSecondaryHorizontalAxis();
      } else {
         return this.u9.getSecondaryHorizontalAxis() == this ? (Axis)this.u9.getSecondaryVerticalAxis() : null;
      }
   }

   @Override
   public final int getAggregationType() {
      return this.u6;
   }

   @Override
   public final void setAggregationType(int value) {
      this.u6 = value;
   }

   @Override
   public final double getBinWidth() {
      return this.t1;
   }

   @Override
   public final void setBinWidth(double value) {
      this.t1 = value;
   }

   @Override
   public final long getNumberOfBins() {
      return this.a5;
   }

   @Override
   public final void setNumberOfBins(long value) {
      this.a5 = value;
   }

   @Override
   public final boolean isOverflowBin() {
      return this.h2;
   }

   @Override
   public final void setOverflowBin(boolean value) {
      this.h2 = value;
   }

   @Override
   public final boolean isAutomaticOverflowBin() {
      return this.v0;
   }

   @Override
   public final void setAutomaticOverflowBin(boolean value) {
      this.v0 = value;
   }

   @Override
   public final double getOverflowBin() {
      return this.f0;
   }

   @Override
   public final void setOverflowBin(double value) {
      this.f0 = value;
   }

   @Override
   public final boolean isUnderflowBin() {
      return this.a3;
   }

   @Override
   public final void setUnderflowBin(boolean value) {
      this.a3 = value;
   }

   @Override
   public final boolean isAutomaticUnderflowBin() {
      return this.p3;
   }

   @Override
   public final void setAutomaticUnderflowBin(boolean value) {
      this.p3 = value;
   }

   @Override
   public final double getUnderflowBin() {
      return this.x9;
   }

   @Override
   public final void setUnderflowBin(double value) {
      this.x9 = value;
   }

   final boolean u9() {
      return this == this.getChart().getAxes().getSecondaryHorizontalAxis() || this == this.getChart().getAxes().getSecondaryVerticalAxis();
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
