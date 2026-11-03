package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;
import java.awt.Color;

public class ChartSeries implements IChartSeries, r0g {
   private Chart l6;
   private r0g k5;
   private Format u3;
   private int a6;
   private int u9;
   private Marker h0;
   private DataLabelCollection c8;
   private int t2;
   private IColorFormat s7;
   private int x8 = 0;
   private String n3 = "";
   private String y4 = "";
   private String e2 = "";
   private String t9 = "";
   private String z1 = "";
   private String t4 = "";
   private TrendlineCollection q0;
   private boolean z3 = true;
   private boolean m1;
   private LegendEntryProperties k7;
   private StringChartValue m3;
   private ChartSeriesGroup z8;
   private final ChartDataPointCollection j5;
   private final c9t w1;
   private final ErrorBarsFormat r4;
   private final ErrorBarsFormat c4;
   private d2 y2;
   private boolean y1;
   private boolean a0 = true;
   private boolean d2 = true;
   private boolean d5;
   private boolean s3 = true;
   private int p8 = 0;
   private int f2;
   private boolean i1;
   private boolean e5;
   List<String> n5 = new List<>();
   private String b3;
   private int o0;

   ChartSeries(ChartSeriesCollection parentImmediate, int type, boolean isDeserializtion) {
      this.k5 = parentImmediate;
      this.h0 = new Marker(this, this);
      this.q0 = new TrendlineCollection(this);
      this.m3 = new StringChartValue(this, new v1y(), false);
      this.j5 = new ChartDataPointCollection(this);
      this.c8 = new DataLabelCollection(this);
      this.r4 = new ErrorBarsFormat(this);
      this.c4 = new ErrorBarsFormat(this);
      this.w1 = new c9t();
      int var4 = -1;
      int var5 = -1;
      IGenericEnumerator var6 = parentImmediate.iterator();

      try {
         while (var6.hasNext()) {
            ChartSeries var7 = (ChartSeries)var6.next();
            if (var7.getOrder() > var4) {
               var4 = var7.getOrder();
            }

            if (!isDeserializtion && (int)var7.n5().n5() > var5) {
               var5 = (int)var7.n5().n5();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      if (!isDeserializtion) {
         this.w1.n5((var5 & 4294967295L) + 1L & 4294967295L);
      }

      this.u9 = var4 + 1;
      this.u3 = new Format(this);
      this.s7 = new ColorFormat(this);
      ((LineFillFormat)this.u3.getLine().getFillFormat()).n5.l6(new ChartSeries$1(this));
      if (type == 73) {
         throw new InvalidOperationException("It's meaningless to create series of ChartType.SeriesOfMixedTypes type.");
      }

      if (type == 29 || type == 30 || type == 67) {
         this.t2 = 25;
      }

      this.a6 = type;
      this.t4();
   }

   final c9t n5() {
      return this.w1;
   }

   final boolean l6() {
      return this.i1;
   }

   final void n5(boolean var1) {
      this.i1 = var1;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.k5;
   }

   @Override
   public final IChart getChart() {
      if (this.l6 == null) {
         Chart[] var1 = new Chart[]{this.l6};
         d0u.n5(Chart.class, this.k5, var1);
         this.l6 = var1[0];
      }

      return this.l6;
   }

   @Override
   public final int getExplosion() {
      return this.t2;
   }

   @Override
   public final void setExplosion(int value) {
      if (this.t2 != value) {
         this.t2 = value;
         this.a6();
      }
   }

   @Override
   public final boolean getSmooth() {
      return this.k5();
   }

   @Override
   public final void setSmooth(boolean value) {
      if (this.k5() != value) {
         this.l6(value);
         this.a6();
      }
   }

   final boolean k5() {
      return this.e5;
   }

   final void l6(boolean var1) {
      this.e5 = var1;
   }

   @Override
   public final IStringChartValue getName() {
      return this.m3;
   }

   final void n5(IStringChartValue var1) {
      this.m3 = (StringChartValue)var1;
   }

   @Override
   public final IChartDataPointCollection getDataPoints() {
      return this.j5;
   }

   @Override
   public final int getType() {
      return this.a6;
   }

   @Override
   public final void setType(int value) {
      if (value == 73) {
         throw new InvalidOperationException("It's meaningless to assign ChartType.SeriesOfMixedTypes value to ChartSeries.Type.");
      }

      if (this.a6 != value) {
         if (value == 29 || value == 30 || value == 67) {
            this.t2 = 25;
         }

         this.a6 = value;
         this.t4();
         this.u3();
      }
   }

   final void u3() {
      ((AxesManager)this.getChart().getAxes()).l6();
      ((r7n)this.getChart().getChartData().getSeriesGroups()).n5(this);
   }

   final void a6() {
      int var1 = this.a6;
      if (ChartTypeCharacterizer.isBar3DChart(this.a6)) {
         label156:
         switch (this.a6) {
            case 3:
            case 7:
            case 11:
            case 15:
               switch (this.x8) {
                  case 0:
                     this.a6 = 3;
                     break label156;
                  case 1:
                  case 2:
                     this.a6 = 11;
                     break label156;
                  case 3:
                     this.a6 = 7;
                     break label156;
                  case 4:
                  case 5:
                     this.a6 = 15;
                  default:
                     break label156;
               }
            case 4:
            case 8:
            case 12:
            case 16:
               switch (this.x8) {
                  case 0:
                     this.a6 = 4;
                     break label156;
                  case 1:
                  case 2:
                     this.a6 = 12;
                     break label156;
                  case 3:
                     this.a6 = 8;
                     break label156;
                  case 4:
                  case 5:
                     this.a6 = 16;
                  default:
                     break label156;
               }
            case 5:
            case 9:
            case 13:
            case 17:
               switch (this.x8) {
                  case 0:
                     this.a6 = 5;
                     break label156;
                  case 1:
                  case 2:
                     this.a6 = 13;
                     break label156;
                  case 3:
                     this.a6 = 9;
                     break label156;
                  case 4:
                  case 5:
                     this.a6 = 17;
                  default:
                     break label156;
               }
            case 6:
            case 10:
            case 14:
            case 18:
               switch (this.x8) {
                  case 0:
                     this.a6 = 6;
                     break label156;
                  case 1:
                  case 2:
                     this.a6 = 14;
                     break label156;
                  case 3:
                     this.a6 = 10;
                     break label156;
                  case 4:
                  case 5:
                     this.a6 = 18;
                  default:
                     break label156;
               }
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 35:
            default:
               throw new Exception();
            case 33:
            case 38:
            case 41:
            case 44:
               switch (this.x8) {
                  case 0:
                     this.a6 = 33;
                     break label156;
                  case 1:
                  case 2:
                     this.a6 = 41;
                     break label156;
                  case 3:
                     this.a6 = 38;
                     break label156;
                  case 4:
                  case 5:
                     this.a6 = 44;
                  default:
                     break label156;
               }
            case 36:
            case 39:
            case 42:
            case 45:
               switch (this.x8) {
                  case 0:
                     this.a6 = 36;
                     break label156;
                  case 1:
                  case 2:
                     this.a6 = 42;
                     break label156;
                  case 3:
                     this.a6 = 39;
                     break label156;
                  case 4:
                  case 5:
                     this.a6 = 45;
                  default:
                     break label156;
               }
            case 37:
            case 40:
            case 43:
            case 46:
               switch (this.x8) {
                  case 0:
                     this.a6 = 37;
                     break;
                  case 1:
                  case 2:
                     this.a6 = 43;
                     break;
                  case 3:
                     this.a6 = 40;
                     break;
                  case 4:
                  case 5:
                     this.a6 = 46;
               }
         }
      } else {
         switch (this.a6) {
            case 19:
            case 22:
               boolean var8 = this.getMarker().getSymbol() != 4;
               this.a6 = var8 ? 22 : 19;
               break;
            case 20:
            case 23:
               boolean var7 = this.getMarker().getSymbol() != 4;
               this.a6 = var7 ? 23 : 20;
               break;
            case 21:
            case 24:
               boolean var6 = this.getMarker().getSymbol() != 4;
               this.a6 = var6 ? 24 : 21;
            case 25:
            case 28:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 68:
            case 69:
            default:
               break;
            case 26:
            case 29:
               this.a6 = this.getExplosion() == 0 ? 26 : 29;
               break;
            case 27:
            case 30:
               this.a6 = this.getExplosion() == 0 ? 27 : 30;
               break;
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
               boolean var5 = this.getMarker().getSymbol() != 4;
               boolean var3 = this.getFormat().getLine().getFillFormat().getFillType() == 0;
               boolean var4 = this.getSmooth();
               if (var5) {
                  if (var3) {
                     this.a6 = 53;
                  } else if (var4) {
                     this.a6 = 54;
                  } else {
                     this.a6 = 56;
                  }
               } else if (var4) {
                  this.a6 = 55;
               } else {
                  this.a6 = 57;
               }
               break;
            case 66:
            case 67:
               this.a6 = this.getExplosion() == 0 ? 66 : 67;
               break;
            case 70:
            case 71:
               boolean var2 = this.getMarker().getSymbol() != 4;
               this.a6 = var2 ? 71 : 70;
         }
      }

      if (var1 != this.a6) {
         this.u3();
      }
   }

   private void t4() {
      if (ChartTypeCharacterizer.isBar3DChart(this.a6)) {
         switch (this.a6) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 33:
            case 36:
            case 37:
               this.x8 = 0;
               break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 38:
            case 39:
            case 40:
               this.x8 = 3;
               break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 41:
            case 42:
            case 43:
               this.x8 = 1;
               break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 44:
            case 45:
            case 46:
               this.x8 = 4;
               break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 35:
            default:
               throw new ArgumentException();
         }
      } else {
         if ((this.a6 == 19 || this.a6 == 20 || this.a6 == 21 || this.a6 == 55 || this.a6 == 57 || this.a6 == 70) && this.h0.getSymbol() == -1) {
            this.h0.l6 = 4;
         } else if (this.a6 == 54 || this.a6 == 56 || this.a6 == 53 || this.a6 == 71 || this.a6 == 22 || this.a6 == 24 || this.a6 == 23) {
            this.h0.l6 = -1;
         }

         if (this.a6 == 55 || this.a6 == 54) {
            this.l6(true);
         } else if (this.a6 == 57 || this.a6 == 56) {
            this.l6(false);
         }

         if (this.a6 == 53) {
            ((LineFillFormat)this.getFormat().getLine().getFillFormat()).setFillType((byte)0);
         } else if (this.getFormat().getLine().getFillFormat().getFillType() == 0) {
            ((LineFillFormat)this.getFormat().getLine().getFillFormat()).setFillType((byte)-1);
         }

         if (this.a6 == 26 || this.a6 == 27 || this.a6 == 66) {
            this.t2 = 0;
         }
      }
   }

   @Override
   public final boolean getPlotOnSecondAxis() {
      if (this.getType() == 77) {
         return true;
      } else {
         return this.getType() == 76 ? false : this.m1;
      }
   }

   @Override
   public final void setPlotOnSecondAxis(boolean value) {
      if (value && this.getType() == 76) {
         throw new InvalidOperationException("Histogram series can't be plotted on secondary axis");
      }

      if (!value && this.getType() == 77) {
         throw new InvalidOperationException("ParetoLine series can't be plotted on primary axis");
      }

      this.m1 = value;
      this.u3();
   }

   final void k5(boolean var1) {
      this.m1 = var1;
   }

   @Override
   public final IChartSeriesGroup getParentSeriesGroup() {
      return this.z8;
   }

   final void n5(ChartSeriesGroup var1) {
      this.z8 = var1;
   }

   @Override
   public final IFormat getFormat() {
      return this.u3;
   }

   @Override
   public final int getOrder() {
      return this.u9;
   }

   @Override
   public final void setOrder(int value) {
      this.u9 = value;
   }

   @Override
   public final IDataLabelCollection getLabels() {
      return this.c8;
   }

   @Override
   public final ITrendlineCollection getTrendLines() {
      return ChartTypeCharacterizer.hasSeriesTrendLines(this.a6) ? this.q0 : null;
   }

   @Override
   public final IErrorBarsFormat getErrorBarsXFormat() {
      return ChartTypeCharacterizer.isErrorBarsXAllowed(this.a6) ? this.r4 : null;
   }

   @Override
   public final IErrorBarsFormat getErrorBarsYFormat() {
      return ChartTypeCharacterizer.isErrorBarsYAllowed(this.a6) ? this.c4 : null;
   }

   @Override
   public final ILegendEntryProperties getRelatedLegendEntry() {
      if (this.k7 == null) {
         this.k7 = new LegendEntryProperties(this);
      }

      return this.k7;
   }

   @Override
   public final String getNumberFormatOfValues() {
      return this.n3;
   }

   @Override
   public final void setNumberFormatOfValues(String value) {
      this.n3 = value;
   }

   @Override
   public final String getNumberFormatOfXValues() {
      return this.y4;
   }

   @Override
   public final void setNumberFormatOfXValues(String value) {
      this.y4 = value;
   }

   @Override
   public final String getNumberFormatOfYValues() {
      return this.e2;
   }

   @Override
   public final void setNumberFormatOfYValues(String value) {
      this.e2 = value;
   }

   @Override
   public final String getNumberFormatOfBubbleSizes() {
      return this.t9;
   }

   @Override
   public final void setNumberFormatOfBubbleSizes(String value) {
      this.t9 = value;
   }

   final String u9() {
      return this.z1;
   }

   final void n5(String var1) {
      this.z1 = var1;
   }

   final String h0() {
      return this.t4;
   }

   final void l6(String var1) {
      this.t4 = var1;
   }

   @Override
   public final IMarker getMarker() {
      return this.h0;
   }

   @Override
   public final int getBar3DShape() {
      return ChartTypeCharacterizer.isBar3DChart(this.getType()) ? this.x8 : -1;
   }

   @Override
   public final void setBar3DShape(int value) {
      if (!ChartTypeCharacterizer.isBar3DChart(this.getType())) {
         throw new InvalidOperationException("Not applicable for non-Bar3dChart series type.");
      }

      if (this.x8 != value) {
         int var2 = this.x8;
         this.x8 = value;
         if ((var2 != 1 || value != 2) && (var2 != 2 || value != 1) && (var2 != 4 || value != 5) && (var2 != 5 || value != 4)) {
            this.a6();
         }
      }
   }

   @Override
   public final boolean getInvertIfNegative() {
      return this.z3;
   }

   @Override
   public final void setInvertIfNegative(boolean value) {
      this.z3 = value;
      IGenericEnumerator var2 = this.j5.iterator();

      try {
         while (var2.hasNext()) {
            ChartDataPoint var3 = (ChartDataPoint)var2.next();
            var3.setInvertIfNegative(value);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public final IColorFormat getInvertedSolidFillColor() {
      return this.s7;
   }

   @Override
   public final Color getAutomaticSeriesColor() {
      return com.aspose.slides.internal.o9b.c8.l6(this.c8());
   }

   com.aspose.slides.internal.o9b.c8 c8() {
      int var1 = (int)this.n5().n5();
      com.aspose.slides.internal.o9b.c8[] var2 = k3o.n5((Chart)this.getChart(), this.getChart().getStyle() + 1);
      return var2[var1];
   }

   @Override
   public final boolean getShowInnerPoints() {
      return this.y1;
   }

   @Override
   public final void setShowInnerPoints(boolean value) {
      this.y1 = value;
   }

   @Override
   public final boolean getShowOutlierPoints() {
      return this.a0;
   }

   @Override
   public final void setShowOutlierPoints(boolean value) {
      this.a0 = value;
   }

   @Override
   public final boolean getShowMeanMarkers() {
      return this.d2;
   }

   @Override
   public final void setShowMeanMarkers(boolean value) {
      this.d2 = value;
   }

   @Override
   public final boolean getShowMeanLine() {
      return this.d5;
   }

   @Override
   public final void setShowMeanLine(boolean value) {
      this.d5 = value;
   }

   @Override
   public final int getQuartileMethod() {
      return this.p8;
   }

   @Override
   public final void setQuartileMethod(int value) {
      this.p8 = value;
   }

   @Override
   public final boolean getShowConnectorLines() {
      return this.s3;
   }

   @Override
   public final void setShowConnectorLines(boolean value) {
      this.s3 = value;
   }

   @Override
   public final int getParentLabelLayout() {
      return this.f2;
   }

   @Override
   public final void setParentLabelLayout(int value) {
      this.f2 = value;
   }

   final d2 t2() {
      if (!ChartTypeCharacterizer.e2(this.getType())) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "Aggregated data points are not supported by series type ", com.aspose.slides.ms.System.s3.n5(ChartType.class, this.getType())
            })
         );
      }

      if (this.y2 == null) {
         this.y2 = new d2(this);
      }

      this.y2.l6();
      return this.y2;
   }

   final d2 s7() {
      return !ChartTypeCharacterizer.e2(this.getType()) ? null : this.y2;
   }

   final String x8() {
      return com.aspose.slides.ms.System.d1.n5(" ", this.n5.toArray(new String[0]));
   }

   final String n3() {
      return this.b3;
   }

   final void k5(String var1) {
      this.b3 = var1;
   }

   final int y4() {
      return this.o0;
   }

   @Override
   public final boolean hasUpDownBars() {
      return this.z8.getUpDownBars().hasUpDownBars();
   }

   final boolean e2() {
      return this.z8.u3();
   }

   final boolean t9() {
      return this.z8.a6();
   }

   @Override
   public final int getGapWidth() {
      return this.z8.getGapWidth() & 65535;
   }

   @Override
   public final int getGapDepth() {
      return this.z8.getGapDepth() & 65535;
   }

   @Override
   public final int getFirstSliceAngle() {
      return this.z8.getFirstSliceAngle();
   }

   @Override
   public final byte getDoughnutHoleSize() {
      return this.z8.getDoughnutHoleSize();
   }

   @Override
   public final byte getOverlap() {
      return this.z8.getOverlap();
   }

   @Override
   public final int getSecondPieSize() {
      return this.z8.getSecondPieSize();
   }

   @Override
   public final boolean hasSeriesLines() {
      return this.z8.hasSeriesLines();
   }

   final boolean z1() {
      return this.z8.n5();
   }

   @Override
   public final int getBubbleSizeRepresentation() {
      return this.z8.getBubbleSizeRepresentation();
   }

   @Override
   public final double getPieSplitPosition() {
      return this.z8.getPieSplitPosition();
   }

   @Override
   public final int getPieSplitBy() {
      return this.z8.getPieSplitBy();
   }

   @Override
   public final IPieSplitCustomPointCollection getPieSplitCustomPoints() {
      return this.z8.getPieSplitCustomPoints();
   }

   @Override
   public final boolean isColorVaried() {
      return this.z8.isColorVaried();
   }

   @Override
   public final int getBubbleSizeScale() {
      return this.z8.getBubbleSizeScale();
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
