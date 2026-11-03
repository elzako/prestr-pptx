package com.aspose.slides;

import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import java.awt.Color;

public class ChartDataPoint implements IChartDataPoint, r0g {
   private long n5;
   private boolean l6;
   private boolean k5;
   private float u3;
   private float a6;
   private float u9;
   private float h0;
   private ChartDataPointCollection c8;
   private m5l t2 = new m5l();
   private StringOrDoubleChartValue s7;
   private DoubleChartValue x8;
   private DoubleChartValue n3;
   private DoubleChartValue y4;
   private DoubleChartValue e2;
   private DoubleChartValue t9;
   private DataLabel z1;
   private Format t4;
   private boolean q0;
   private int z3 = -1;
   private Marker m1;
   private LegendEntryProperties k7;
   private ErrorBarsCustomValues m3;
   private IFormat z8;
   private int j5 = -1;
   private int w1 = -1;
   private boolean r4;
   private u0a c4;
   private u0a y2;
   private u0a y1;
   private u0a a0;
   private u0a d2;
   private u0a d5;
   private u0a s3;
   private u0a p8;
   private u0a f2;
   private u0a i1;
   private IChartDataPointLevelsManager e5;

   @Override
   public final IStringOrDoubleChartValue getXValue() {
      if (this.s7 == null) {
         this.s7 = new StringOrDoubleChartValue(this, this.u3().u3(), true);
      }

      return this.s7;
   }

   @Override
   public final IDoubleChartValue getYValue() {
      if (this.x8 == null) {
         this.x8 = new DoubleChartValue(this, this.u3().a6(), true);
      }

      return this.x8;
   }

   @Override
   public final IDoubleChartValue getBubbleSize() {
      if (this.n3 == null) {
         this.n3 = new DoubleChartValue(this, this.u3().u9(), true);
      }

      return this.n3;
   }

   @Override
   public final IDoubleChartValue getValue() {
      if (this.y4 == null) {
         this.y4 = new DoubleChartValue(this, this.u3().c8(), true);
      }

      return this.y4;
   }

   @Override
   public final IDoubleChartValue getSizeValue() {
      if (this.e2 == null) {
         this.e2 = new DoubleChartValue(this, this.u3().h0(), true);
      }

      return this.e2;
   }

   @Override
   public final IDoubleChartValue getColorValue() {
      if (this.t9 == null) {
         this.t9 = new DoubleChartValue(this, this.u3().t2(), true);
      }

      return this.t9;
   }

   @Override
   public final IErrorBarsCustomValues getErrorBarsCustomValues() {
      if (this.m3 == null) {
         this.m3 = new ErrorBarsCustomValues(this);
      }

      return this.m3;
   }

   @Override
   public final IDataLabel getLabel() {
      if (this.z1 == null) {
         this.z1 = new DataLabel(this);
      }

      return this.z1;
   }

   @Override
   public final boolean isBubble3D() {
      return this.q0;
   }

   @Override
   public final void setBubble3D(boolean value) {
      this.q0 = value;
   }

   @Override
   public final int getExplosion() {
      return this.z3;
   }

   @Override
   public final void setExplosion(int value) {
      this.z3 = value;
   }

   @Override
   public final IFormat getFormat() {
      if (this.t4 == null) {
         this.t4 = new Format(this);
         if (this.getDataPointLevels() != null && this.getDataPointLevels().getCount() > 0) {
            this.t4.n5(this.getDataPointLevels().get_Item(this.getDataPointLevels().getCount() - 1).getFormat());
         }
      }

      return this.t4;
   }

   @Override
   public final void setFormat(IFormat value) {
      this.t4 = (Format)value;
   }

   final IFormat n5() {
      return this.t4;
   }

   @Override
   public final IMarker getMarker() {
      if (this.m1 == null) {
         this.m1 = new Marker(this, this.c8.l6());
      }

      return this.m1;
   }

   final IMarker l6() {
      return this.m1;
   }

   ChartDataPoint(ChartDataPointCollection parentImmediate) {
      this.c8 = parentImmediate;
      this.setInvertIfNegative(parentImmediate.l6().getInvertIfNegative());
   }

   final m5l k5() {
      return this.t2;
   }

   @Override
   public final boolean getSetAsTotal() {
      return this.r4;
   }

   @Override
   public final void setSetAsTotal(boolean value) {
      this.r4 = value;
   }

   @Override
   public final ILegendEntryProperties getRelatedLegendEntry() {
      if (this.k7 == null) {
         this.k7 = new LegendEntryProperties(this);
      }

      return this.k7;
   }

   @Override
   public final void remove() {
      if (this.u3() == null) {
         throw new PptxEditException("Data point is already removed from series.");
      }

      synchronized (this.u3().getSyncRoot()) {
         this.u3().n5(this);
         this.c8 = null;
      }
   }

   @Override
   public final IChartDataPointLevelsManager getDataPointLevels() {
      if (this.c8.l6().getType() != 74 && this.c8.l6().getType() != 75) {
         return null;
      }

      if (this.e5 == null) {
         this.e5 = new ChartDataPointLevelsManager(this);
      }

      return this.e5;
   }

   @Override
   public final long getIndex() {
      return this.n5;
   }

   final void n5(long var1) {
      this.n5 = var1;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.c8;
   }

   final ChartDataPointCollection u3() {
      return this.c8;
   }

   @Override
   public final Color getAutomaticDataPointColor() {
      return com.aspose.slides.internal.o9b.c8.l6(this.a6());
   }

   com.aspose.slides.internal.o9b.c8 a6() {
      return this.n5(true);
   }

   final com.aspose.slides.internal.o9b.c8 n5(boolean var1) {
      ChartSeries var2 = this.u3().l6();
      Chart var3 = (Chart)var2.getChart();
      int var4 = var3.getStyle() + 1;
      if (var2.getFormat().getFill().getFillType() == 1) {
         return ((ColorFormat)var2.getFormat().getFill().getSolidFillColor()).u3();
      }

      if (var1) {
         IFormat var5 = this.u9();
         if (var5 != null) {
            return ((ColorFormat)var5.getFill().getSolidFillColor()).u3();
         }
      }

      if (!var2.isColorVaried()
         || !ChartTypeCharacterizer.isChartTypePie(var2.getType())
            && !ChartTypeCharacterizer.isChartTypeDoughnut(var2.getType())
            && var2.getParentSeriesGroup().getSeries().size() != 1) {
         return var2.c8();
      }

      int var6 = this.u3().n5((IChartDataPoint)this);
      return k3o.n5(var3, var4, var2.getDataPoints().size())[var6];
   }

   final IFormat u9() {
      ChartDataPointCollection var1 = this.u3();
      ChartSeries var2 = this.u3().l6();
      Chart var3 = (Chart)var2.getChart();
      if (this.h0()) {
         int var12 = var1.n5((IChartDataPoint)this);
         int var13 = var1.size();
         if (this.z8 == null || this.j5 != var12 || this.w1 != var13) {
            this.j5 = var12;
            this.w1 = var13;
            this.z8 = var3.t9().u9().n5(this, var12, var13);
         }

         return this.z8;
      } else {
         if (!var3.t9().k5()) {
            return null;
         }

         int var4 = var3.getChartData().getSeries().indexOf(var2);
         int var5 = var3.getChartData().getSeries().size();
         if (this.z8 == null || this.j5 != var4 || this.w1 != var5) {
            if (var1.l6().getType() == 79) {
               double var6 = ((ChartData)var3.getChartData()).l6().k5() != 2
                  ? com.aspose.slides.internal.v6g.k5.u3(this.t2().n5(), double.class)
                  : this.getValue().toDouble();
               if (this.getSetAsTotal()) {
                  var4 = 2;
               } else if (var6 < 0.0) {
                  var4 = 1;
               } else {
                  var4 = 0;
               }
            } else if (var1.l6().getType() == 74 || var1.l6().getType() == 75) {
               int var8 = var1.n5((IChartDataPoint)this);
               int var9 = ((ChartCategoryCollection)var3.getChartData().getCategories()).getGroupingLevelCount();
               List var10 = ((ChartCategoryCollection)var3.getChartData().getCategories()).n5(var9 - 1);
               var4 = var9 - 1;

               for (int var11 = 1; var11 < var10.size(); var11++) {
                  if (var8 >= (Integer)((KeyValuePair)var10.get_Item(var11 - 1)).getKey() && var8 < (Integer)((KeyValuePair)var10.get_Item(var11)).getKey()) {
                     var4 = var11 - 1;
                     break;
                  }
               }

               var5 = var9;
            }

            this.j5 = var4;
            this.w1 = var5;
            this.z8 = var3.t9().u9().n5(this, var4, var5);
         }

         return this.z8;
      }
   }

   final boolean h0() {
      ChartSeries var1 = this.u3().l6();
      Chart var2 = (Chart)var1.getChart();
      return (
            ChartTypeCharacterizer.isChartTypePie(var1.getType())
               || ChartTypeCharacterizer.isChartTypeDoughnut(var1.getType())
               || var1.getParentSeriesGroup().getSeries().size() == 1
         )
         && var1.isColorVaried()
         && var2.t9().k5()
         && var2.getStyle() <= 7;
   }

   @Override
   public final boolean getInvertIfNegative() {
      return this.l6;
   }

   @Override
   public final void setInvertIfNegative(boolean value) {
      this.l6 = value;
   }

   final boolean c8() {
      return this.k5;
   }

   final void l6(boolean var1) {
      this.k5 = var1;
   }

   final u0a t2() {
      if (this.c4 == null) {
         this.c4 = new u0a();
      }

      return this.c4;
   }

   final u0a s7() {
      if (this.y2 == null) {
         this.y2 = new u0a();
      }

      return this.y2;
   }

   final u0a x8() {
      if (this.y1 == null) {
         this.y1 = new u0a();
      }

      return this.y1;
   }

   final u0a n3() {
      if (this.a0 == null) {
         this.a0 = new u0a();
      }

      return this.a0;
   }

   final u0a y4() {
      if (this.d2 == null) {
         this.d2 = new u0a();
      }

      return this.d2;
   }

   final u0a e2() {
      if (this.d5 == null) {
         this.d5 = new u0a();
      }

      return this.d5;
   }

   final u0a t9() {
      if (this.s3 == null) {
         this.s3 = new u0a();
      }

      return this.s3;
   }

   final u0a z1() {
      if (this.p8 == null) {
         this.p8 = new u0a();
      }

      return this.p8;
   }

   final u0a t4() {
      if (this.f2 == null) {
         this.f2 = new u0a();
      }

      return this.f2;
   }

   final u0a q0() {
      if (this.i1 == null) {
         this.i1 = new u0a();
      }

      return this.i1;
   }

   @Override
   public final float getActualX() {
      return this.u3;
   }

   final void n5(float var1) {
      this.u3 = var1;
   }

   @Override
   public final float getActualY() {
      return this.a6;
   }

   final void l6(float var1) {
      this.a6 = var1;
   }

   @Override
   public final float getActualWidth() {
      return this.u9;
   }

   final void k5(float var1) {
      this.u9 = var1;
   }

   @Override
   public final float getActualHeight() {
      return this.h0;
   }

   final void u3(float var1) {
      this.h0 = var1;
   }
}
