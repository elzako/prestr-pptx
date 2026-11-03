package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

public class ChartDataPointCollection extends DomObject<ChartSeries> implements IChartDataPointCollection {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String h0;
   private String c8;
   private String t2;
   private String s7;
   private String x8;
   private boolean n3;
   private long y4;
   private final w4w e2 = new w4w();
   private final v1y t9 = new v1y();
   private final v1y z1 = new v1y();
   private final v1y t4 = new v1y();
   private final v1y q0 = new v1y();
   private final v1y z3 = new v1y();
   private final v1y m1 = new v1y();
   private final b3h<IChartDataPoint> k7;
   private final DataSourceTypeForErrorBarsCustomValues m3 = new DataSourceTypeForErrorBarsCustomValues();

   @Override
   public final IChartDataPoint get_Item(int index) {
      return this.k7.get_Item(index);
   }

   @Override
   public final int get_Item(IChartDataPoint pt) {
      return this.k7.indexOf(pt);
   }

   @Override
   public final int getDataSourceTypeForXValues() {
      return this.t9.n5();
   }

   @Override
   public final void setDataSourceTypeForXValues(int value) {
      this.t9.n5(value);
   }

   @Override
   public final int getDataSourceTypeForYValues() {
      return this.z1.n5();
   }

   @Override
   public final void setDataSourceTypeForYValues(int value) {
      if (value != 0 && value != 2) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"DataSourceTypeForYValues can be ", "DataSourceType.Worksheet or DataSourceType.DoubleLiterals"})
         );
      }

      this.z1.n5(value);
   }

   @Override
   public final int getDataSourceTypeForBubbleSizes() {
      return this.t4.n5();
   }

   @Override
   public final void setDataSourceTypeForBubbleSizes(int value) {
      if (value != 0 && value != 2) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"DataSourceTypeForBubbleSizes can be ", "DataSourceType.Worksheet or DataSourceType.DoubleLiterals"})
         );
      }

      this.t4.n5(value);
   }

   @Override
   public final int getDataSourceTypeForValues() {
      return this.q0.n5();
   }

   @Override
   public final void setDataSourceTypeForValues(int value) {
      if (value != 0 && value != 2) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"DataSourceTypeForValues can be ", "DataSourceType.Worksheet or DataSourceType.DoubleLiterals"})
         );
      }

      this.q0.n5(value);
   }

   @Override
   public final IDataSourceTypeForErrorBarsCustomValues getDataSourceTypeForErrorBarsCustomValues() {
      return (this.l6().getErrorBarsXFormat() == null || this.l6().getErrorBarsXFormat().getValueType() != 0)
            && (this.l6().getErrorBarsYFormat() == null || this.l6().getErrorBarsYFormat().getValueType() != 0)
         ? null
         : this.m3;
   }

   @Override
   public final IChartDataPoint getOrCreateDataPointByIdx(long index) {
      if ((index & 4294967295L) < 0L) {
         throw new ArgumentOutOfRangeException();
      }

      while (this.k7.size() <= (index & 4294967295L)) {
         this.l6(new ChartDataPoint(this));
      }

      return this.k7.get_Item((int)index);
   }

   final IChartDataPoint n5() {
      ChartDataPoint var1 = new ChartDataPoint(this);
      this.l6(var1);
      return var1;
   }

   @Override
   public final int size() {
      return this.k7.size();
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int arrayIndex) {
      this.k7.copyTo(array, arrayIndex);
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }

   @Override
   public final IGenericEnumerator<IChartDataPoint> iterator() {
      return this.k7.iterator();
   }

   @Override
   public final IGenericEnumerator<IChartDataPoint> iteratorJava() {
      return this.k7.iteratorJava();
   }

   @Override
   public final IChartDataPoint addDataPointForStockSeries(IChartDataCell value) {
      if (!ChartTypeCharacterizer.isChartTypeStock(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Stock series.");
      } else {
         return this.n5(value);
      }
   }

   @Override
   public final IChartDataPoint addDataPointForStockSeries(double value) {
      if (!ChartTypeCharacterizer.isChartTypeStock(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Stock series.");
      } else {
         return this.n5(value);
      }
   }

   @Override
   public final IChartDataPoint addDataPointForLineSeries(IChartDataCell value) {
      if (!ChartTypeCharacterizer.isChartTypeLine(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Line series.");
      } else {
         return this.n5(value);
      }
   }

   @Override
   public final IChartDataPoint addDataPointForLineSeries(double value) {
      if (!ChartTypeCharacterizer.isChartTypeLine(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Line series.");
      } else {
         return this.n5(value);
      }
   }

   @Override
   public final IChartDataPoint addDataPointForScatterSeries(IChartDataCell xValue, IChartDataCell yValue) {
      if (!ChartTypeCharacterizer.isChartTypeScatter(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Scatter series.");
      }

      if (this.getDataSourceTypeForXValues() != 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForXValues != DataSourceType.Worksheet and so ", "xValue cannot be of ", com.aspose.slides.ms.System.j8.n5(xValue).q0(), " type."
            })
         );
      }

      if (this.getDataSourceTypeForYValues() != 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForYValues != DataSourceType.Worksheet and so ", "yValue cannot be of ", com.aspose.slides.ms.System.j8.n5(yValue).q0(), " type."
            })
         );
      }

      ChartDataPoint var3 = new ChartDataPoint(this);
      var3.getXValue().setAsCell(xValue);
      var3.getYValue().setAsCell(yValue);
      this.l6(var3);
      return var3;
   }

   @Override
   public final IChartDataPoint addDataPointForScatterSeries(double xValue, IChartDataCell yValue) {
      if (!ChartTypeCharacterizer.isChartTypeScatter(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Scatter series.");
      }

      if (this.getDataSourceTypeForXValues() != 2) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"DataSourceTypeForXValues != DataSourceType.DoubleLiterals and so ", "xValue cannot be of System.Double type."})
         );
      }

      if (this.getDataSourceTypeForYValues() != 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForYValues != DataSourceType.Worksheet and so ", "yValue cannot be of ", com.aspose.slides.ms.System.j8.n5(yValue).q0(), " type."
            })
         );
      }

      ChartDataPoint var4 = new ChartDataPoint(this);
      var4.getXValue().setAsLiteralDouble(xValue);
      var4.getYValue().setAsCell(yValue);
      this.l6(var4);
      return var4;
   }

   @Override
   public final IChartDataPoint addDataPointForScatterSeries(String xValue, IChartDataCell yValue) {
      if (!ChartTypeCharacterizer.isChartTypeScatter(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Scatter series.");
      }

      if (this.getDataSourceTypeForXValues() != 1) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForXValues != DataSourceType.StringLiterals and so ",
               "xValue cannot be of ",
               com.aspose.slides.ms.System.j8.n5(xValue).q0(),
               " type."
            })
         );
      }

      if (this.getDataSourceTypeForYValues() != 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForYValues != DataSourceType.Worksheet and so ", "yValue cannot be of ", com.aspose.slides.ms.System.j8.n5(yValue).q0(), " type."
            })
         );
      }

      ChartDataPoint var3 = new ChartDataPoint(this);
      var3.getXValue().setAsLiteralString(xValue);
      var3.getYValue().setAsCell(yValue);
      this.l6(var3);
      return var3;
   }

   @Override
   public final IChartDataPoint addDataPointForScatterSeries(IChartDataCell xValue, double yValue) {
      if (!ChartTypeCharacterizer.isChartTypeScatter(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Scatter series.");
      }

      if (this.getDataSourceTypeForXValues() != 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForXValues != DataSourceType.Worksheet and so ", "xValue cannot be of ", com.aspose.slides.ms.System.j8.n5(xValue).q0(), " type."
            })
         );
      }

      if (this.getDataSourceTypeForYValues() != 2) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"DataSourceTypeForYValues != DataSourceType.DoubleLiterals and so ", "yValue cannot be of System.Double type."})
         );
      }

      ChartDataPoint var4 = new ChartDataPoint(this);
      var4.getXValue().setAsCell(xValue);
      var4.getYValue().setAsLiteralDouble(yValue);
      this.l6(var4);
      return var4;
   }

   @Override
   public final IChartDataPoint addDataPointForScatterSeries(double xValue, double yValue) {
      if (!ChartTypeCharacterizer.isChartTypeScatter(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Scatter series.");
      }

      if (this.getDataSourceTypeForXValues() != 2) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"DataSourceTypeForXValues != DataSourceType.DoubleLiterals and so ", "xValue cannot be of System.Double type."})
         );
      }

      if (this.getDataSourceTypeForYValues() != 2) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"DataSourceTypeForYValues != DataSourceType.DoubleLiterals and so ", "yValue cannot be of System.Double type."})
         );
      }

      ChartDataPoint var5 = new ChartDataPoint(this);
      var5.getXValue().setAsLiteralDouble(xValue);
      var5.getYValue().setAsLiteralDouble(yValue);
      this.l6(var5);
      return var5;
   }

   @Override
   public final IChartDataPoint addDataPointForScatterSeries(String xValue, double yValue) {
      if (!ChartTypeCharacterizer.isChartTypeScatter(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Scatter series.");
      }

      if (this.getDataSourceTypeForXValues() != 1) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForXValues != DataSourceType.StringLiterals and so ",
               "xValue cannot be of ",
               com.aspose.slides.ms.System.j8.n5(xValue).q0(),
               " type."
            })
         );
      }

      if (this.getDataSourceTypeForYValues() != 2) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"DataSourceTypeForYValues != DataSourceType.DoubleLiterals and so ", "yValue cannot be of System.Double type."})
         );
      }

      ChartDataPoint var4 = new ChartDataPoint(this);
      var4.getXValue().setAsLiteralString(xValue);
      var4.getYValue().setAsLiteralDouble(yValue);
      this.l6(var4);
      return var4;
   }

   @Override
   public final IChartDataPoint addDataPointForRadarSeries(IChartDataCell value) {
      if (!ChartTypeCharacterizer.isChartTypeRadar(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Radar series.");
      } else {
         return this.n5(value);
      }
   }

   @Override
   public final IChartDataPoint addDataPointForRadarSeries(double value) {
      if (!ChartTypeCharacterizer.isChartTypeRadar(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Radar series.");
      } else {
         return this.n5(value);
      }
   }

   @Override
   public final IChartDataPoint addDataPointForBarSeries(IChartDataCell value) {
      if (!ChartTypeCharacterizer.isChartTypeColumn(this.l6().getType()) && !ChartTypeCharacterizer.isChartTypeBar(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Column or Bar series.");
      } else {
         return this.n5(value);
      }
   }

   @Override
   public final IChartDataPoint addDataPointForBarSeries(double value) {
      if (!ChartTypeCharacterizer.isChartTypeColumn(this.l6().getType()) && !ChartTypeCharacterizer.isChartTypeBar(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Column or Bar series.");
      } else {
         return this.n5(value);
      }
   }

   @Override
   public final IChartDataPoint addDataPointForAreaSeries(IChartDataCell value) {
      if (!ChartTypeCharacterizer.isChartTypeArea(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Area series.");
      } else {
         return this.n5(value);
      }
   }

   @Override
   public final IChartDataPoint addDataPointForAreaSeries(double value) {
      if (!ChartTypeCharacterizer.isChartTypeArea(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Area series.");
      } else {
         return this.n5(value);
      }
   }

   @Override
   public final IChartDataPoint addDataPointForPieSeries(IChartDataCell value) {
      if (!ChartTypeCharacterizer.isChartTypePie(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Pie series.");
      } else {
         return this.n5(value);
      }
   }

   @Override
   public final IChartDataPoint addDataPointForPieSeries(double value) {
      if (!ChartTypeCharacterizer.isChartTypePie(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Pie series.");
      } else {
         return this.n5(value);
      }
   }

   @Override
   public final IChartDataPoint addDataPointForDoughnutSeries(IChartDataCell value) {
      if (!ChartTypeCharacterizer.isChartTypeDoughnut(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Doughnut series.");
      } else {
         return this.n5(value);
      }
   }

   @Override
   public final IChartDataPoint addDataPointForDoughnutSeries(double value) {
      if (!ChartTypeCharacterizer.isChartTypeDoughnut(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Doughnut series.");
      } else {
         return this.n5(value);
      }
   }

   @Override
   public final IChartDataPoint addDataPointForBubbleSeries(IChartDataCell xValue, IChartDataCell yValue, IChartDataCell bubbleSize) {
      if (!ChartTypeCharacterizer.isChartTypeBubble(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Bubble series.");
      }

      if (this.getDataSourceTypeForXValues() != 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForXValues != DataSourceType.Worksheet and so ", "xValue cannot be of ", com.aspose.slides.ms.System.j8.n5(xValue).q0(), " type."
            })
         );
      }

      if (this.getDataSourceTypeForYValues() != 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForYValues != DataSourceType.Worksheet and so ", "yValue cannot be of ", com.aspose.slides.ms.System.j8.n5(yValue).q0(), " type."
            })
         );
      }

      if (this.getDataSourceTypeForBubbleSizes() != 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForBubbleSizes != DataSourceType.Worksheet and so ",
               "bubbleSize cannot be of ",
               com.aspose.slides.ms.System.j8.n5(bubbleSize).q0(),
               " type."
            })
         );
      }

      ChartDataPoint var4 = new ChartDataPoint(this);
      var4.getXValue().setAsCell(xValue);
      var4.getYValue().setAsCell(yValue);
      var4.getBubbleSize().setAsCell(bubbleSize);
      this.l6(var4);
      return var4;
   }

   @Override
   public final IChartDataPoint addDataPointForBubbleSeries(double xValue, IChartDataCell yValue, IChartDataCell bubbleSize) {
      if (!ChartTypeCharacterizer.isChartTypeBubble(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Bubble series.");
      }

      if (this.getDataSourceTypeForXValues() != 2) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"DataSourceTypeForXValues != DataSourceType.DoubleLiterals and so ", "xValue cannot be of System.Double type."})
         );
      }

      if (this.getDataSourceTypeForYValues() != 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForYValues != DataSourceType.Worksheet and so ", "yValue cannot be of ", com.aspose.slides.ms.System.j8.n5(yValue).q0(), " type."
            })
         );
      }

      if (this.getDataSourceTypeForBubbleSizes() != 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForBubbleSizes != DataSourceType.Worksheet and so ",
               "bubbleSize cannot be of ",
               com.aspose.slides.ms.System.j8.n5(bubbleSize).q0(),
               " type."
            })
         );
      }

      ChartDataPoint var5 = new ChartDataPoint(this);
      var5.getXValue().setAsLiteralDouble(xValue);
      var5.getYValue().setAsCell(yValue);
      var5.getBubbleSize().setAsCell(bubbleSize);
      this.l6(var5);
      return var5;
   }

   @Override
   public final IChartDataPoint addDataPointForBubbleSeries(String xValue, IChartDataCell yValue, IChartDataCell bubbleSize) {
      if (!ChartTypeCharacterizer.isChartTypeBubble(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Bubble series.");
      }

      if (this.getDataSourceTypeForXValues() != 1) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForXValues != DataSourceType.StringLiterals and so ",
               "xValue cannot be of ",
               com.aspose.slides.ms.System.j8.n5(xValue).q0(),
               " type."
            })
         );
      }

      if (this.getDataSourceTypeForYValues() != 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForYValues != DataSourceType.Worksheet and so ", "yValue cannot be of ", com.aspose.slides.ms.System.j8.n5(yValue).q0(), " type."
            })
         );
      }

      if (this.getDataSourceTypeForBubbleSizes() != 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForBubbleSizes != DataSourceType.Worksheet and so ",
               "bubbleSize cannot be of ",
               com.aspose.slides.ms.System.j8.n5(bubbleSize).q0(),
               " type."
            })
         );
      }

      ChartDataPoint var4 = new ChartDataPoint(this);
      var4.getXValue().setAsLiteralString(xValue);
      var4.getYValue().setAsCell(yValue);
      var4.getBubbleSize().setAsCell(bubbleSize);
      this.l6(var4);
      return var4;
   }

   @Override
   public final IChartDataPoint addDataPointForBubbleSeries(IChartDataCell xValue, double yValue, IChartDataCell bubbleSize) {
      if (!ChartTypeCharacterizer.isChartTypeBubble(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Bubble series.");
      }

      if (this.getDataSourceTypeForXValues() != 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForXValues != DataSourceType.Worksheet and so ", "xValue cannot be of ", com.aspose.slides.ms.System.j8.n5(xValue).q0(), " type."
            })
         );
      }

      if (this.getDataSourceTypeForYValues() != 2) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"DataSourceTypeForYValues != DataSourceType.DoubleLiterals and so ", "yValue cannot be of System.Double type."})
         );
      }

      if (this.getDataSourceTypeForBubbleSizes() != 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForBubbleSizes != DataSourceType.Worksheet and so ",
               "bubbleSize cannot be of ",
               com.aspose.slides.ms.System.j8.n5(bubbleSize).q0(),
               " type."
            })
         );
      }

      ChartDataPoint var5 = new ChartDataPoint(this);
      var5.getXValue().setAsCell(xValue);
      var5.getYValue().setAsLiteralDouble(yValue);
      var5.getBubbleSize().setAsCell(bubbleSize);
      this.l6(var5);
      return var5;
   }

   @Override
   public final IChartDataPoint addDataPointForBubbleSeries(double xValue, double yValue, IChartDataCell bubbleSize) {
      if (!ChartTypeCharacterizer.isChartTypeBubble(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Bubble series.");
      }

      if (this.getDataSourceTypeForXValues() != 2) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"DataSourceTypeForXValues != DataSourceType.DoubleLiterals and so ", "xValue cannot be of System.Double type."})
         );
      }

      if (this.getDataSourceTypeForYValues() != 2) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"DataSourceTypeForYValues != DataSourceType.DoubleLiterals and so ", "yValue cannot be of System.Double type."})
         );
      }

      if (this.getDataSourceTypeForBubbleSizes() != 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForBubbleSizes != DataSourceType.Worksheet and so ",
               "bubbleSize cannot be of ",
               com.aspose.slides.ms.System.j8.n5(bubbleSize).q0(),
               " type."
            })
         );
      }

      ChartDataPoint var6 = new ChartDataPoint(this);
      var6.getXValue().setAsLiteralDouble(xValue);
      var6.getYValue().setAsLiteralDouble(yValue);
      var6.getBubbleSize().setAsCell(bubbleSize);
      this.l6(var6);
      return var6;
   }

   @Override
   public final IChartDataPoint addDataPointForBubbleSeries(String xValue, double yValue, IChartDataCell bubbleSize) {
      if (!ChartTypeCharacterizer.isChartTypeBubble(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Bubble series.");
      }

      if (this.getDataSourceTypeForXValues() != 1) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForXValues != DataSourceType.StringLiterals and so ",
               "xValue cannot be of ",
               com.aspose.slides.ms.System.j8.n5(xValue).q0(),
               " type."
            })
         );
      }

      if (this.getDataSourceTypeForYValues() != 2) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"DataSourceTypeForYValues != DataSourceType.DoubleLiterals and so ", "yValue cannot be of System.Double type."})
         );
      }

      if (this.getDataSourceTypeForBubbleSizes() != 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForBubbleSizes != DataSourceType.Worksheet and so ",
               "bubbleSize cannot be of ",
               com.aspose.slides.ms.System.j8.n5(bubbleSize).q0(),
               " type."
            })
         );
      }

      ChartDataPoint var5 = new ChartDataPoint(this);
      var5.getXValue().setAsLiteralString(xValue);
      var5.getYValue().setAsLiteralDouble(yValue);
      var5.getBubbleSize().setAsCell(bubbleSize);
      this.l6(var5);
      return var5;
   }

   @Override
   public final IChartDataPoint addDataPointForBubbleSeries(IChartDataCell xValue, IChartDataCell yValue, double bubbleSize) {
      if (!ChartTypeCharacterizer.isChartTypeBubble(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Bubble series.");
      }

      if (this.getDataSourceTypeForXValues() != 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForXValues != DataSourceType.Worksheet and so ", "xValue cannot be of ", com.aspose.slides.ms.System.j8.n5(xValue).q0(), " type."
            })
         );
      }

      if (this.getDataSourceTypeForYValues() != 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForYValues != DataSourceType.Worksheet and so ", "yValue cannot be of ", com.aspose.slides.ms.System.j8.n5(yValue).q0(), " type."
            })
         );
      }

      if (this.getDataSourceTypeForBubbleSizes() != 2) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForBubbleSizes != DataSourceType.DoubleLiterals and so ", "bubbleSize cannot be of System.Double type."
            })
         );
      }

      ChartDataPoint var5 = new ChartDataPoint(this);
      var5.getXValue().setAsCell(xValue);
      var5.getYValue().setAsCell(yValue);
      var5.getBubbleSize().setAsLiteralDouble(bubbleSize);
      this.l6(var5);
      return var5;
   }

   @Override
   public final IChartDataPoint addDataPointForBubbleSeries(double xValue, IChartDataCell yValue, double bubbleSize) {
      if (!ChartTypeCharacterizer.isChartTypeBubble(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Bubble series.");
      }

      if (this.getDataSourceTypeForXValues() != 2) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"DataSourceTypeForXValues != DataSourceType.DoubleLiterals and so ", "xValue cannot be of System.Double type."})
         );
      }

      if (this.getDataSourceTypeForYValues() != 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForYValues != DataSourceType.Worksheet and so ", "yValue cannot be of ", com.aspose.slides.ms.System.j8.n5(yValue).q0(), " type."
            })
         );
      }

      if (this.getDataSourceTypeForBubbleSizes() != 2) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForBubbleSizes != DataSourceType.DoubleLiterals and so ", "bubbleSize cannot be of System.Double type."
            })
         );
      }

      ChartDataPoint var6 = new ChartDataPoint(this);
      var6.getXValue().setAsLiteralDouble(xValue);
      var6.getYValue().setAsCell(yValue);
      var6.getBubbleSize().setAsLiteralDouble(bubbleSize);
      this.l6(var6);
      return var6;
   }

   @Override
   public final IChartDataPoint addDataPointForBubbleSeries(String xValue, IChartDataCell yValue, double bubbleSize) {
      if (!ChartTypeCharacterizer.isChartTypeBubble(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Bubble series.");
      }

      if (this.getDataSourceTypeForXValues() != 1) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForXValues != DataSourceType.StringLiterals and so ",
               "xValue cannot be of ",
               com.aspose.slides.ms.System.j8.n5(xValue).q0(),
               " type."
            })
         );
      }

      if (this.getDataSourceTypeForYValues() != 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForYValues != DataSourceType.Worksheet and so ", "yValue cannot be of ", com.aspose.slides.ms.System.j8.n5(yValue).q0(), " type."
            })
         );
      }

      if (this.getDataSourceTypeForBubbleSizes() != 2) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForBubbleSizes != DataSourceType.DoubleLiterals and so ", "bubbleSize cannot be of System.Double type."
            })
         );
      }

      ChartDataPoint var5 = new ChartDataPoint(this);
      var5.getXValue().setAsLiteralString(xValue);
      var5.getYValue().setAsCell(yValue);
      var5.getBubbleSize().setAsLiteralDouble(bubbleSize);
      this.l6(var5);
      return var5;
   }

   @Override
   public final IChartDataPoint addDataPointForBubbleSeries(IChartDataCell xValue, double yValue, double bubbleSize) {
      if (!ChartTypeCharacterizer.isChartTypeBubble(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Bubble series.");
      }

      if (this.getDataSourceTypeForXValues() != 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForXValues != DataSourceType.Worksheet and so ", "xValue cannot be of ", com.aspose.slides.ms.System.j8.n5(xValue).q0(), " type."
            })
         );
      }

      if (this.getDataSourceTypeForYValues() != 2) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"DataSourceTypeForYValues != DataSourceType.DoubleLiterals and so ", "yValue cannot be of System.Double type."})
         );
      }

      if (this.getDataSourceTypeForBubbleSizes() != 2) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForBubbleSizes != DataSourceType.DoubleLiterals and so ", "bubbleSize cannot be of System.Double type."
            })
         );
      }

      ChartDataPoint var6 = new ChartDataPoint(this);
      var6.getXValue().setAsCell(xValue);
      var6.getYValue().setAsLiteralDouble(yValue);
      var6.getBubbleSize().setAsLiteralDouble(bubbleSize);
      this.l6(var6);
      return var6;
   }

   @Override
   public final IChartDataPoint addDataPointForBubbleSeries(double xValue, double yValue, double bubbleSize) {
      if (!ChartTypeCharacterizer.isChartTypeBubble(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Bubble series.");
      }

      if (this.getDataSourceTypeForXValues() != 2) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"DataSourceTypeForXValues != DataSourceType.DoubleLiterals and so ", "xValue cannot be of System.Double type."})
         );
      }

      if (this.getDataSourceTypeForYValues() != 2) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"DataSourceTypeForYValues != DataSourceType.DoubleLiterals and so ", "yValue cannot be of System.Double type."})
         );
      }

      if (this.getDataSourceTypeForBubbleSizes() != 2) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForBubbleSizes != DataSourceType.DoubleLiterals and so ", "bubbleSize cannot be of System.Double type."
            })
         );
      }

      ChartDataPoint var7 = new ChartDataPoint(this);
      var7.getXValue().setAsLiteralDouble(xValue);
      var7.getYValue().setAsLiteralDouble(yValue);
      var7.getBubbleSize().setAsLiteralDouble(bubbleSize);
      this.l6(var7);
      return var7;
   }

   @Override
   public final IChartDataPoint addDataPointForBubbleSeries(String xValue, double yValue, double bubbleSize) {
      if (!ChartTypeCharacterizer.isChartTypeBubble(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Bubble series.");
      }

      if (this.getDataSourceTypeForXValues() != 1) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForXValues != DataSourceType.StringLiterals and so ",
               "xValue cannot be of ",
               com.aspose.slides.ms.System.j8.n5(xValue).q0(),
               " type."
            })
         );
      }

      if (this.getDataSourceTypeForYValues() != 2) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"DataSourceTypeForYValues != DataSourceType.DoubleLiterals and so ", "yValue cannot be of System.Double type."})
         );
      }

      if (this.getDataSourceTypeForBubbleSizes() != 2) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForBubbleSizes != DataSourceType.DoubleLiterals and so ", "bubbleSize cannot be of System.Double type."
            })
         );
      }

      ChartDataPoint var6 = new ChartDataPoint(this);
      var6.getXValue().setAsLiteralString(xValue);
      var6.getYValue().setAsLiteralDouble(yValue);
      var6.getBubbleSize().setAsLiteralDouble(bubbleSize);
      this.l6(var6);
      return var6;
   }

   @Override
   public final IChartDataPoint addDataPointForSurfaceSeries(IChartDataCell value) {
      if (!ChartTypeCharacterizer.isChartTypeSurface(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Surface series.");
      } else {
         return this.n5(value);
      }
   }

   @Override
   public final IChartDataPoint addDataPointForSurfaceSeries(double value) {
      if (!ChartTypeCharacterizer.isChartTypeSurface(this.l6().getType())) {
         throw new InvalidOperationException("Parent series is not Surface series.");
      } else {
         return this.n5(value);
      }
   }

   @Override
   public final IChartDataPoint addDataPointForSunburstSeries(IChartDataCell sizeValue) {
      if (this.l6().getType() != 75) {
         throw new InvalidOperationException("Parent series is not Sunburst series.");
      } else {
         return this.l6(sizeValue);
      }
   }

   @Override
   public final IChartDataPoint addDataPointForTreemapSeries(IChartDataCell sizeValue) {
      if (this.l6().getType() != 74) {
         throw new InvalidOperationException("Parent series is not Treemap series.");
      } else {
         return this.l6(sizeValue);
      }
   }

   @Override
   public final IChartDataPoint addDataPointForBoxAndWhiskerSeries(IChartDataCell value) {
      if (this.l6().getType() != 78) {
         throw new InvalidOperationException("Parent series is not BoxAndWhisker series.");
      } else {
         return this.n5(value);
      }
   }

   @Override
   public final IChartDataPoint addDataPointForWaterfallSeries(IChartDataCell value) {
      if (this.l6().getType() != 79) {
         throw new InvalidOperationException("Parent series is not Waterfall series.");
      } else {
         return this.n5(value);
      }
   }

   @Override
   public final IChartDataPoint addDataPointForHistogramSeries(IChartDataCell value) {
      if (this.l6().getType() != 76) {
         throw new InvalidOperationException("Parent series is not Histogram series.");
      } else {
         return this.n5(value);
      }
   }

   @Override
   public final IChartDataPoint addDataPointForFunnelSeries(IChartDataCell value) {
      if (this.l6().getType() != 80) {
         throw new InvalidOperationException("Parent series is not Funnel series.");
      } else {
         return this.n5(value);
      }
   }

   final IChartDataPoint n5(IChartDataCell var1) {
      if (this.getDataSourceTypeForValues() != 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForValues != DataSourceType.Worksheet and so ", "value cannot be of ", com.aspose.slides.ms.System.j8.n5(var1).q0(), " type."
            })
         );
      }

      ChartDataPoint var2 = new ChartDataPoint(this);
      var2.getValue().setAsCell(var1);
      this.l6(var2);
      return var2;
   }

   final IChartDataPoint n5(double var1) {
      if (this.getDataSourceTypeForValues() != 2) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"DataSourceTypeForValues != DataSourceType.DoubleLiterals and so ", "value cannot be of System.Double type."})
         );
      }

      ChartDataPoint var3 = new ChartDataPoint(this);
      var3.getValue().setAsLiteralDouble(var1);
      this.l6(var3);
      return var3;
   }

   final IChartDataPoint l6(IChartDataCell var1) {
      if (this.getDataSourceTypeForValues() != 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForValues != DataSourceType.Worksheet and so ", "value cannot be of ", com.aspose.slides.ms.System.j8.n5(var1).q0(), " type."
            })
         );
      }

      ChartDataPoint var2 = new ChartDataPoint(this);
      var2.getSizeValue().setAsCell(var1);
      this.l6(var2);
      return var2;
   }

   final IChartDataPoint k5(IChartDataCell var1) {
      if (this.getDataSourceTypeForValues() != 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceTypeForColorValues != DataSourceType.Worksheet and so ",
               "value cannot be of ",
               com.aspose.slides.ms.System.j8.n5(var1).q0(),
               " type."
            })
         );
      }

      ChartDataPoint var2 = new ChartDataPoint(this);
      var2.getColorValue().setAsCell(var1);
      this.l6(var2);
      return var2;
   }

   @Override
   public final IChartDataPoint addDataPointForMapSeries(IChartDataCell value) {
      if (this.l6().getType() != 81) {
         throw new InvalidOperationException("Parent series is not Map series.");
      } else {
         return this.k5(value);
      }
   }

   @Override
   public final void clear() {
      synchronized (this.k7) {
         List var2 = new List<>(this.k7);
         List$Enumerator var3 = var2.iterator();

         try {
            while (var3.hasNext()) {
               IChartDataPoint var4 = (IChartDataPoint)var3.next();
               var4.remove();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }
   }

   @Override
   public final void remove(IChartDataPoint value) {
      value.remove();
   }

   @Override
   public final void removeAt(int index) {
      this.get_Item(index).remove();
   }

   final void n5(ChartDataPoint var1) {
      if (!this.k7.removeItem(var1)) {
         throw new ArgumentException("The value parameter was not found in the collection.");
      }
   }

   final IChartDataPointLevel n5(int var1) {
      ChartCategoryCollection var2 = (ChartCategoryCollection)this.l6().getChart().getChartData().getCategories();
      if (var2.getGroupingLevelCount() != 1 && var2.size() != 0) {
         int var3 = -1;
         String[] var4 = new String[var2.getGroupingLevelCount()];

         for (int var5 = 0; var5 < var2.size(); var5++) {
            for (int var6 = var2.getGroupingLevelCount() - 1; var6 >= 0; var6--) {
               if (((ChartCategory)var2.get_Item(var5)).n5(var6) != null) {
                  String var7 = ((ChartCategory)var2.get_Item(var5)).n5(var6).toString();
                  if (var5 == 0) {
                     var4[var6] = var7;
                     var3++;
                  } else if (!com.aspose.slides.ms.System.d1.a6(var7, var4[var6]) && !com.aspose.slides.ms.System.d1.n5(var7)) {
                     var4[var6] = var7;
                     var3++;
                  }

                  if (var3 == var1) {
                     return this.k7.size() < var5 + 1 ? null : this.k7.get_Item(var5).getDataPointLevels().get_Item(var6);
                  }
               }
            }
         }

         return null;
      } else {
         return this.k7.size() < var1 + 1 ? null : this.k7.get_Item(var1).getDataPointLevels().get_Item(0);
      }
   }

   final ChartSeries l6() {
      return this.u9;
   }

   ChartDataPointCollection(ChartSeries parentImmediate) {
      super(parentImmediate);
      this.k7 = new b3h<>(parentImmediate.getChart().getChartData());
   }

   final w4w k5() {
      return this.e2;
   }

   final v1y u3() {
      return this.t9;
   }

   final v1y a6() {
      return this.z1;
   }

   final v1y u9() {
      return this.t4;
   }

   final v1y h0() {
      return this.z3;
   }

   final v1y c8() {
      return this.q0;
   }

   final v1y t2() {
      return this.m1;
   }

   final int n5(IChartDataPoint var1) {
      return this.k7.indexOf(var1);
   }

   final IChartDataPoint n5(com.aspose.slides.ms.System.g7<IChartDataPoint> var1) {
      if (var1 == null) {
         throw new ArgumentNullException("match");
      } else {
         return this.k7.find(var1);
      }
   }

   final String s7() {
      return this.n5;
   }

   final void n5(String var1) {
      this.n5 = var1;
   }

   final String x8() {
      return this.l6;
   }

   final void l6(String var1) {
      this.l6 = var1;
   }

   final String n3() {
      return this.k5;
   }

   final void k5(String var1) {
      this.k5 = var1;
   }

   final String y4() {
      return this.u3;
   }

   final void u3(String var1) {
      this.u3 = var1;
   }

   final String e2() {
      return this.a6;
   }

   final void a6(String var1) {
      this.a6 = var1;
   }

   final String t9() {
      return this.h0;
   }

   final void u9(String var1) {
      this.h0 = var1;
   }

   final String z1() {
      return this.c8;
   }

   final void h0(String var1) {
      this.c8 = var1;
   }

   final String t4() {
      return this.t2;
   }

   final void c8(String var1) {
      this.t2 = var1;
   }

   final String q0() {
      return this.s7;
   }

   final void t2(String var1) {
      this.s7 = var1;
   }

   final String z3() {
      return this.x8;
   }

   final void s7(String var1) {
      this.x8 = var1;
   }

   final boolean m1() {
      return this.n3;
   }

   final void n5(boolean var1) {
      this.n3 = var1;
   }

   final long k7() {
      return this.y4;
   }

   final void n5(long var1) {
      this.y4 = var1;
   }

   private void l6(ChartDataPoint var1) {
      if (var1 == null) {
         throw new ArgumentNullException("dataPoint");
      }

      var1.n5(this.k7.size() & 4294967295L);
      this.k7.addItem(var1);
   }
}
