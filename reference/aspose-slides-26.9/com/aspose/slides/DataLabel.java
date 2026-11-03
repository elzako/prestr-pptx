package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

public class DataLabel implements IDataLabel, r0g {
   private DataLabelFormat n5;
   private TextFrame l6;
   private n6d k5;
   private r0g u3;
   private ChartSeries a6;
   private k4s u9;
   private GeometryShape h0;
   private String c8;
   private float t2;
   private float s7;
   private float x8;
   private float n3;

   final String n5() {
      return this.c8;
   }

   final void n5(String var1) {
      this.c8 = var1;
   }

   public DataLabel(IChartDataPoint parentImmediate) {
      this.u3 = (r0g)parentImmediate;
      this.a6 = ((ChartDataPoint)parentImmediate).u3().l6();
      this.y4();
   }

   DataLabel(a0 parentImmediate) {
      this.u3 = parentImmediate;
      this.a6 = parentImmediate.x8();
      this.u9 = new k4s(this.u3);
      this.y4();
   }

   DataLabel(ChartDataPointLevel parentImmediate) {
      this.u3 = parentImmediate;
      this.a6 = parentImmediate.h0().u3().l6();
      this.y4();
   }

   final n6d l6() {
      if (this.k5 == null) {
         this.k5 = new n6d(this.a6.getChart());
      }

      return this.k5;
   }

   final n6d k5() {
      return this.k5;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.u3;
   }

   @Override
   public final IChart getChart() {
      return this.c8().getChart();
   }

   @Override
   public final boolean isVisible() {
      return this.n5.getShowLegendKey()
         || this.n5.getShowValue()
         || this.n5.getShowCategoryName()
         || this.n5.getShowSeriesName()
         || this.n5.getShowPercentage()
         || this.n5.getShowBubbleSize()
         || this.n5.getShowLabelValueFromCell();
   }

   @Override
   public final void hide() {
      this.n5.setShowLegendKey(false);
      this.n5.setShowValue(false);
      this.n5.setShowCategoryName(false);
      this.n5.setShowSeriesName(false);
      this.n5.setShowPercentage(false);
      this.n5.setShowBubbleSize(false);
      this.n5.setShowLabelValueFromCell(false);
   }

   @Override
   public final String getActualLabelText() {
      if (this.getTextFrameForOverriding() != null && !com.aspose.slides.ms.System.d1.n5(this.getTextFrameForOverriding().getText())) {
         return this.getTextFrameForOverriding().getText();
      }

      List var1 = new List();
      IDataLabelFormat var2 = this.getDataLabelFormat();
      if (var2.getShowSeriesName()) {
         var1.addItem(this.n3());
      }

      if (var2.getShowCategoryName()) {
         var1.addItem(this.x8());
      }

      if (var2.getShowValue()) {
         var1.addItem(this.a6());
      }

      if ((ChartTypeCharacterizer.isChartTypePie(this.c8().getType()) || ChartTypeCharacterizer.isChartTypeDoughnut(this.c8().getType()))
         && var2.getShowPercentage()) {
         var1.addItem(this.u9());
      }

      if (ChartTypeCharacterizer.isChartTypeBubble(this.c8().getType()) && var2.getShowBubbleSize()) {
         var1.addItem(this.u3());
      }

      String var3 = !var2.getShowSeriesName() && var2.getShowCategoryName() && !var2.getShowValue() && var2.getShowPercentage() ? "\n" : "; ";
      if (!com.aspose.slides.ms.System.d1.n5(this.getDataLabelFormat().getSeparator())) {
         var3 = this.getDataLabelFormat().getSeparator();
      }

      return com.aspose.slides.ms.System.d1.n5(var3,(String[])( var1.toArray(new String[0])));
   }

   final String u3() {
      int var1 = this.c8().getLabels().indexOf(this);
      if (ChartTypeCharacterizer.isChartTypeBubble(this.getChart().getType())) {
         if (((ChartDataPointCollection)this.c8().getDataPoints()).getDataSourceTypeForBubbleSizes() == 0
            && ((ChartData)this.c8().getChart().getChartData()).l6().k5() != 2) {
            Object var2 = ((ChartDataPoint)this.c8().getDataPoints().get_Item(var1)).n3().n5();
            return var2 == null ? null : var2.toString();
         } else {
            return this.c8().getDataPoints().get_Item(var1).getBubbleSize().getAsCell() != null
                  && this.c8().getDataPoints().get_Item(var1).getBubbleSize().getAsCell().getValue() != null
               ? this.c8().getDataPoints().get_Item(var1).getBubbleSize().getAsCell().getValue().toString()
               : "";
         }
      } else {
         return "";
      }
   }

   final String a6() {
      int var1 = this.c8().getLabels().indexOf(this);
      if (!ChartTypeCharacterizer.isSeriesUsesValueCoordinate(this.c8().getType())) {
         if (ChartTypeCharacterizer.isSeriesUsesYValueCoordinate(this.c8().getType())) {
            if (com.aspose.slides.internal.v6g.k5.n5(this.c8().getDataPoints(), ChartDataPointCollection.class).getDataSourceTypeForYValues() == 0
               && ((ChartData)this.c8().getChart().getChartData()).l6().k5() != 2) {
               Double var9 = (Double)com.aspose.slides.internal.v6g.k5.n5(this.c8().getDataPoints().get_Item(var1), ChartDataPoint.class).x8().n5();
               if (com.aspose.slides.internal.v6g.k5.l6(var9, Double.class)) {
                  var9 = this.n5(com.aspose.slides.internal.v6g.k5.u3(var9, double.class));
                  return com.aspose.slides.ms.System.d2.u9(var9);
               } else {
                  return var9.toString();
               }
            } else {
               return this.c8().getDataPoints().get_Item(var1).getYValue().getAsCell() != null
                     && this.c8().getDataPoints().get_Item(var1).getYValue().getAsCell().getValue() != null
                  ? this.c8().getDataPoints().get_Item(var1).getYValue().getAsCell().getValue().toString()
                  : "";
            }
         } else {
            return "";
         }
      } else {
         DataLabelFormat var2 = (DataLabelFormat)this.getDataLabelFormat();
         String var3 = var2.getNumberFormat();
         if (var2.isNumberFormatLinkedToSource() || var2.getShowPercentage() || com.aspose.slides.ms.System.d1.n5(var3) || "General".equals(var3)) {
            var3 = this.c8().getNumberFormatOfValues();
         }

         if (com.aspose.slides.internal.v6g.k5.n5(this.c8().getDataPoints(), ChartDataPointCollection.class).getDataSourceTypeForValues() == 0
            && ((ChartData)this.c8().getChart().getChartData()).l6().k5() != 2) {
            ChartDataPoint var4 = com.aspose.slides.internal.v6g.k5.n5(this.c8().getDataPoints().get_Item(var1), ChartDataPoint.class);
            if ("General".equals(var3) && !"General".equals(var4.t2().l6()) && !com.aspose.slides.ms.System.d1.n5(var4.t2().l6())) {
               var3 = var4.t2().l6();
            }

            return this.n5(var4.t2().n5(), var3, false);
         } else if (com.aspose.slides.internal.v6g.k5.n5(this.c8().getDataPoints(), ChartDataPointCollection.class).getDataSourceTypeForValues() == 2) {
            return this.n5(this.c8().getDataPoints().get_Item(var1).getValue().getAsLiteralDouble(), var3, false);
         } else if (this.c8().getDataPoints().get_Item(var1).getValue().getAsCell() != null
            && this.c8().getDataPoints().get_Item(var1).getValue().getAsCell().getValue() != null) {
            double var5 = 0.0;
            double[] var7 = new double[]{0.0};
            boolean var8 = com.aspose.slides.ms.System.d2.n5(
               this.c8().getDataPoints().get_Item(var1).getValue().getAsCell().getValue().toString(), 231, com.aspose.slides.internal.x7n.s7.x8(), var7
            );
            var5 = var7[0];
            return var8 ? this.n5(var5, var3, false) : this.c8().getDataPoints().get_Item(var1).getValue().getAsCell().getValue().toString();
         } else {
            return "";
         }
      }
   }

   private String n5(Object var1, String var2, boolean var3) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, Double.class)) {
         var1 = this.n5(com.aspose.slides.internal.v6g.k5.u3(var1, double.class));
      }

      return t7k.n5(var1, var2, var3);
   }

   private double n5(double var1) {
      IAxis var3 = this.s7();
      return var3 == null ? var1 : var1 * this.n5(var3);
   }

   private IAxis s7() {
      if (this.c8() == null) {
         return null;
      } else {
         boolean var1 = this.c8().getPlotOnSecondAxis();
         if (ChartTypeCharacterizer.isChartTypeBar(this.c8().getType())) {
            return var1 && this.getChart().getAxes().getSecondaryHorizontalAxis() != null
               ? this.getChart().getAxes().getSecondaryHorizontalAxis()
               : this.getChart().getAxes().getHorizontalAxis();
         } else {
            return var1 && this.getChart().getAxes().getSecondaryVerticalAxis() != null
               ? this.getChart().getAxes().getSecondaryVerticalAxis()
               : this.getChart().getAxes().getVerticalAxis();
         }
      }
   }

   private double n5(IAxis var1) {
      int var2 = var1.getDisplayUnit() == 0 ? 0 : var1.getDisplayUnit() + 1;
      return var2 == 0 ? 1.0 : com.aspose.slides.ms.System.q1.a6(10.0, -var2);
   }

   private String x8() {
      int var1 = this.c8().getLabels().indexOf(this);
      if (ChartTypeCharacterizer.isSeriesUsesYValueCoordinate(this.c8().getType())) {
         if (com.aspose.slides.internal.v6g.k5.n5(this.c8().getDataPoints(), ChartDataPointCollection.class).getDataSourceTypeForXValues() == 0
            && ((ChartData)this.c8().getChart().getChartData()).l6().k5() != 2) {
            return com.aspose.slides.internal.v6g.k5.n5(this.c8().getDataPoints().get_Item(var1), ChartDataPoint.class).s7().n5().toString();
         } else {
            return this.c8().getDataPoints().get_Item(var1).getXValue().getAsCell() != null
                  && this.c8().getDataPoints().get_Item(var1).getXValue().getAsCell().getValue() != null
               ? this.c8().getDataPoints().get_Item(var1).getXValue().getAsCell().getValue().toString()
               : "";
         }
      } else if (var1 != this.c8().getLabels().getCount() - 1 || this.c8().getType() != 28 && this.c8().getType() != 31) {
         List var2 = new List();
         if (this.c8().getPlotOnSecondAxis()) {
            n1g.n5(this.getChart().getChartData().getSecondaryCategories(), var2, (Chart)this.getChart());
            if (this.getChart().getChartData().getSecondaryCategories().getGroupingLevelCount() > 1) {
               n1g.u9(var2);
            }
         } else {
            n1g.n5(this.getChart().getChartData().getCategories(), var2, (Chart)this.getChart());
            if (this.getChart().getChartData().getCategories().getGroupingLevelCount() > 1) {
               n1g.u9(var2);
            }
         }

         if (var1 < var2.size()) {
            x4 var3 = (x4)var2.get_Item(var1);
            return t7k.n5(var3.l6(), var3.u9(), false);
         } else {
            return com.aspose.slides.ms.System.a3.n5(var1 + 1, com.aspose.slides.internal.x7n.l6.k5());
         }
      } else {
         return "Other";
      }
   }

   final String u9() {
      int var1 = this.c8().getLabels().indexOf(this);
      if (!ChartTypeCharacterizer.isChartTypePie(this.c8().getType()) && !ChartTypeCharacterizer.isChartTypeDoughnut(this.c8().getType())) {
         return "";
      }

      ChartData var2 = (ChartData)this.c8().getChart().getChartData();
      double[] var3 = new double[this.c8().getDataPoints().size()];
      double var4 = 0.0;
      double var6 = 0.0;

      for (int var8 = 0; var8 < this.c8().getDataPoints().size(); var8++) {
         var6 += var2.l6().k5() != 2
            ? com.aspose.slides.ms.System.z3.n3(com.aspose.slides.internal.v6g.k5.n5(this.c8().getDataPoints().get_Item(var8), ChartDataPoint.class).t2().n5())
            : DoubleChartValue.l6(this.c8().getDataPoints().get_Item(var8).getValue());
      }

      byte var19 = 2;
      float var9 = 0.0F;
      int var10 = -1;

      for (int var11 = 0; var11 < this.c8().getDataPoints().size(); var11++) {
         double var12 = var2.l6().k5() != 2
            ? com.aspose.slides.ms.System.z3.n3(com.aspose.slides.internal.v6g.k5.n5(this.c8().getDataPoints().get_Item(var11), ChartDataPoint.class).t2().n5())
            : DoubleChartValue.l6(this.c8().getDataPoints().get_Item(var11).getValue());
         double var14 = com.aspose.slides.ms.System.q1.n5(var12);
         var3[var11] = var14 / var6;
         double var16 = com.aspose.slides.ms.System.q1.n5(var3[var11], var19, (short)1);
         var4 += var16;
         float var18 = (float)com.aspose.slides.ms.System.q1.n5(var16 - var3[var11]);
         if (var18 > var9) {
            var9 = var18;
            var10 = var11;
         }
      }

      if (var4 > 1.0 && var10 != -1) {
         var3[var10] = com.aspose.slides.ms.System.q1.n5(var3[var10], var19, (short)1) - (var4 - 1.0);
      }

      String var20 = "".equals(this.getDataLabelFormat().getNumberFormat()) ? "0%" : this.getDataLabelFormat().getNumberFormat();
      return t7k.n5(var3[var1], var20, false);
   }

   private String n3() {
      return this.c8().getName().getDataSourceType() == 0 && ((ChartData)this.c8().getChart().getChartData()).l6().k5() != 2
         ? this.c8().x8()
         : this.c8().getName().toString();
   }

   @Override
   public final ITextFrame addTextFrameForOverriding(String text) {
      ((ParagraphCollection)this.getTextFrameForOverriding().getParagraphs()).n5(text);
      return this.l6;
   }

   @Override
   public final ITextFrame getTextFrameForOverriding() {
      if (this.l6 == null) {
         this.l6 = new TextFrame(this);
      }

      return this.l6;
   }

   final ITextFrame h0() {
      return this.l6;
   }

   @Override
   public final IChartTextFormat getTextFormat() {
      return this.n5.getTextFormat();
   }

   @Override
   public final float getX() {
      return this.l6().getX();
   }

   @Override
   public final void setX(float value) {
      this.l6().setX(value);
   }

   @Override
   public final float getY() {
      return this.l6().getY();
   }

   @Override
   public final void setY(float value) {
      this.l6().setY(value);
   }

   @Override
   public final float getWidth() {
      return this.l6().getWidth();
   }

   @Override
   public final void setWidth(float value) {
      this.l6().setWidth(value);
   }

   @Override
   public final float getHeight() {
      return this.l6().getHeight();
   }

   @Override
   public final void setHeight(float value) {
      this.l6().setHeight(value);
   }

   @Override
   public final float getRight() {
      return this.l6().getRight();
   }

   @Override
   public final float getBottom() {
      return this.l6().getBottom();
   }

   @Override
   public final IDataLabelFormat getDataLabelFormat() {
      if (this.n5 == null) {
         this.n5 = new DataLabelFormat(this);
      }

      return this.n5;
   }

   @Override
   public final IChartDataCell getValueFromCell() {
      return this.e2().n5();
   }

   @Override
   public final void setValueFromCell(IChartDataCell value) {
      this.e2().n5((ChartDataCell)value);
   }

   final ChartSeries c8() {
      return this.a6;
   }

   static String n5(IChartSeries var0, int var1) {
      if (var1 == -1) {
         return "";
      }

      if (var0.getType() != 0 && var0.getType() != 34 && var0.getType() != 79 && var0.getType() != 76) {
         if (var0.getType() != 1 && var0.getType() != 2 && var0.getType() != 35 && var0.getType() != 32) {
            if (var0.getType() == 26
               || var0.getType() == 27
               || var0.getType() == 28
               || var0.getType() == 31
               || var0.getType() == 29
               || var0.getType() == 30
               || (var0.getType() == 66 || var0.getType() == 67) && (var0.getDoughnutHoleSize() & 255) == 0) {
               return var1 != 2 && var1 != 4 && var1 != 1 && var1 != 6
                  ? com.aspose.slides.ms.System.d1.n5(new String[]{
                     com.aspose.slides.ms.System.s3.n5(LegendDataLabelPosition.class, 2L),
                     ", ",
                     com.aspose.slides.ms.System.s3.n5(LegendDataLabelPosition.class, 4L),
                     ", ",
                     com.aspose.slides.ms.System.s3.n5(LegendDataLabelPosition.class, 1L),
                     ", ",
                     com.aspose.slides.ms.System.s3.n5(LegendDataLabelPosition.class, 6L)
                  })
                  : "";
            }

            if (var0.getType() != 22
               && var0.getType() != 23
               && var0.getType() != 24
               && var0.getType() != 19
               && var0.getType() != 21
               && var0.getType() != 20
               && var0.getType() != 53
               && var0.getType() != 55
               && var0.getType() != 54
               && var0.getType() != 57
               && var0.getType() != 56
               && var0.getType() != 58
               && var0.getType() != 59
               && var0.getType() != 60
               && var0.getType() != 61
               && var0.getType() != 68
               && var0.getType() != 69) {
               if (var0.getType() != 78) {
                  return "supports only default value";
               } else {
                  return var1 != 5 && var1 != 7 && var1 != 8 && var1 != 0
                     ? com.aspose.slides.ms.System.d1.n5(new String[]{
                        com.aspose.slides.ms.System.s3.n5(LegendDataLabelPosition.class, 5L),
                        ", ",
                        com.aspose.slides.ms.System.s3.n5(LegendDataLabelPosition.class, 7L),
                        ", ",
                        com.aspose.slides.ms.System.s3.n5(LegendDataLabelPosition.class, 8L),
                        ", ",
                        com.aspose.slides.ms.System.s3.n5(LegendDataLabelPosition.class, 0L)
                     })
                     : "";
               }
            } else {
               return var1 != 2 && var1 != 0 && var1 != 8 && var1 != 5 && var1 != 7
                  ? com.aspose.slides.ms.System.d1.n5(new String[]{
                     com.aspose.slides.ms.System.s3.n5(LegendDataLabelPosition.class, 2L),
                     ", ",
                     com.aspose.slides.ms.System.s3.n5(LegendDataLabelPosition.class, 0L),
                     ", ",
                     com.aspose.slides.ms.System.s3.n5(LegendDataLabelPosition.class, 8L),
                     ", ",
                     com.aspose.slides.ms.System.s3.n5(LegendDataLabelPosition.class, 5L),
                     ", ",
                     com.aspose.slides.ms.System.s3.n5(LegendDataLabelPosition.class, 7L)
                  })
                  : "";
            }
         } else {
            return var1 != 2 && var1 != 3 && var1 != 4
               ? com.aspose.slides.ms.System.d1.n5(new String[]{
                  com.aspose.slides.ms.System.s3.n5(LegendDataLabelPosition.class, 2L),
                  ", ",
                  com.aspose.slides.ms.System.s3.n5(LegendDataLabelPosition.class, 3L),
                  ", ",
                  com.aspose.slides.ms.System.s3.n5(LegendDataLabelPosition.class, 4L)
               })
               : "";
         }
      } else {
         return var1 != 2 && var1 != 3 && var1 != 4 && var1 != 6
            ? com.aspose.slides.ms.System.d1.n5(new String[]{
               com.aspose.slides.ms.System.s3.n5(LegendDataLabelPosition.class, 2L),
               ", ",
               com.aspose.slides.ms.System.s3.n5(LegendDataLabelPosition.class, 3L),
               ", ",
               com.aspose.slides.ms.System.s3.n5(LegendDataLabelPosition.class, 4L),
               ", ",
               com.aspose.slides.ms.System.s3.n5(LegendDataLabelPosition.class, 6L)
            })
            : "";
      }
   }

   final void n5(IDataLabel var1) {
      this.n5.n5((DataLabelFormat)var1.getDataLabelFormat());
   }

   final GeometryShape t2() {
      if (!this.getDataLabelFormat().getShowLabelAsDataCallout()) {
         return null;
      }

      if (this.h0 == null) {
         this.h0 = new AutoShape(this);
         this.h0.setShapeType(117);
         DataLabelCollection var1 = (DataLabelCollection)this.a6.getLabels();
         if (var1.u3() != null && var1.u3().u9().s7() != null) {
            this.h0.setShapeType(var1.u3().u9().s7().c8());
         }
      }

      return this.h0;
   }

   private void y4() {
      DataLabelFormat var1 = (DataLabelFormat)this.a6.getLabels().getDefaultDataLabelFormat();
      boolean var2 = var1.z3();
      this.n5 = new DataLabelFormat(this);
      if (var2) {
         ((Format)this.getDataLabelFormat().getFormat()).n5(this.a6.getLabels().getDefaultDataLabelFormat().getFormat());
         this.n5.setNumberFormatLinkedToSource(this.a6.getLabels().getDefaultDataLabelFormat().isNumberFormatLinkedToSource());
         this.n5.setNumberFormat(this.a6.getLabels().getDefaultDataLabelFormat().getNumberFormat());
         this.n5.setPosition(this.a6.getLabels().getDefaultDataLabelFormat().getPosition());
         this.n5.setSeparator(this.a6.getLabels().getDefaultDataLabelFormat().getSeparator());
         this.n5.setShowBubbleSize(this.a6.getLabels().getDefaultDataLabelFormat().getShowBubbleSize());
         this.n5.setShowCategoryName(this.a6.getLabels().getDefaultDataLabelFormat().getShowCategoryName());
         this.n5.setShowLegendKey(this.a6.getLabels().getDefaultDataLabelFormat().getShowLegendKey());
         this.n5.setShowPercentage(this.a6.getLabels().getDefaultDataLabelFormat().getShowPercentage());
         this.n5.setShowSeriesName(this.a6.getLabels().getDefaultDataLabelFormat().getShowSeriesName());
         this.n5.setShowValue(this.a6.getLabels().getDefaultDataLabelFormat().getShowValue());
         TextFrame var3 = new TextFrame(this);
         ((ChartTextFormat)this.a6.getLabels().getDefaultDataLabelFormat().getTextFormat()).copyTo(var3);
         ((ChartTextFormat)this.n5.getTextFormat()).copyFrom(var3);
      }
   }

   private k4s e2() {
      if (this.u9 == null) {
         this.u9 = new k4s(this.u3);
      }

      return this.u9;
   }

   @Override
   public final float getActualX() {
      return this.t2;
   }

   final void n5(float var1) {
      this.t2 = var1;
   }

   @Override
   public final float getActualY() {
      return this.s7;
   }

   final void l6(float var1) {
      this.s7 = var1;
   }

   @Override
   public final float getActualWidth() {
      return this.x8;
   }

   final void k5(float var1) {
      this.x8 = var1;
   }

   @Override
   public final float getActualHeight() {
      return this.n3;
   }

   final void u3(float var1) {
      this.n3 = var1;
   }

   @Override
   public final IBaseSlide getSlide() {
      return this.a6.getSlide();
   }

   @Override
   public final IPresentation getPresentation() {
      return this.a6.getPresentation();
   }
}
