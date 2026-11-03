package com.aspose.slides;

public class ErrorBarsCustomValues extends DomObject<ChartDataPoint> implements IErrorBarsCustomValues {
   private DoubleChartValue n5;
   private DoubleChartValue l6;
   private DoubleChartValue k5;
   private DoubleChartValue u3;
   private final ChartDataPointCollection a6;

   ErrorBarsCustomValues(ChartDataPoint parentImmediate) {
      super(parentImmediate);
      this.a6 = parentImmediate.u3();
   }

   @Override
   public final IDoubleChartValue getXMinus() {
      if (this.a6.l6().getErrorBarsXFormat() != null && this.a6.l6().getErrorBarsXFormat().getValueType() == 0) {
         if (this.n5 == null) {
            DataSourceTypeForErrorBarsCustomValues var1 = (DataSourceTypeForErrorBarsCustomValues)this.a6.getDataSourceTypeForErrorBarsCustomValues();
            this.n5 = new DoubleChartValue(this, var1.n5(), true);
         }

         return this.n5;
      } else {
         return null;
      }
   }

   @Override
   public final IDoubleChartValue getYMinus() {
      if (this.a6.l6().getErrorBarsYFormat() != null && this.a6.l6().getErrorBarsYFormat().getValueType() == 0) {
         if (this.k5 == null) {
            DataSourceTypeForErrorBarsCustomValues var1 = (DataSourceTypeForErrorBarsCustomValues)this.a6.getDataSourceTypeForErrorBarsCustomValues();
            this.k5 = new DoubleChartValue(this, var1.k5(), true);
         }

         return this.k5;
      } else {
         return null;
      }
   }

   @Override
   public final IDoubleChartValue getXPlus() {
      if (this.a6.l6().getErrorBarsXFormat() != null && this.a6.l6().getErrorBarsXFormat().getValueType() == 0) {
         if (this.l6 == null) {
            DataSourceTypeForErrorBarsCustomValues var1 = (DataSourceTypeForErrorBarsCustomValues)this.a6.getDataSourceTypeForErrorBarsCustomValues();
            this.l6 = new DoubleChartValue(this, var1.l6(), true);
         }

         return this.l6;
      } else {
         return null;
      }
   }

   @Override
   public final IDoubleChartValue getYPlus() {
      if (this.a6.l6().getErrorBarsYFormat() != null && this.a6.l6().getErrorBarsYFormat().getValueType() == 0) {
         if (this.u3 == null) {
            DataSourceTypeForErrorBarsCustomValues var1 = (DataSourceTypeForErrorBarsCustomValues)this.a6.getDataSourceTypeForErrorBarsCustomValues();
            this.u3 = new DoubleChartValue(this, var1.u3(), true);
         }

         return this.u3;
      } else {
         return null;
      }
   }

   final double n5() {
      if (this.u9.u3().getDataSourceTypeForErrorBarsCustomValues().getDataSourceTypeForXMinusValues() == 2
         && this.getXMinus() != null
         && !com.aspose.slides.ms.System.d2.k5(this.getXMinus().getAsLiteralDouble())) {
         return this.getXMinus().getAsLiteralDouble();
      } else {
         boolean var1 = ((ChartData)this.u9.u3().l6().getChart().getChartData()).l6().k5() != 2;
         if (var1) {
            return this.u9.e2().n5() == null ? 0.0 : com.aspose.slides.internal.v6g.k5.u3(this.u9.e2().n5(), double.class);
         } else {
            return DoubleChartValue.l6(this.getXMinus());
         }
      }
   }

   final double l6() {
      if (this.u9.u3().getDataSourceTypeForErrorBarsCustomValues().getDataSourceTypeForXPlusValues() == 2
         && this.getXPlus() != null
         && !com.aspose.slides.ms.System.d2.k5(this.getXPlus().getAsLiteralDouble())) {
         return this.getXPlus().getAsLiteralDouble();
      } else {
         boolean var1 = ((ChartData)this.u9.u3().l6().getChart().getChartData()).l6().k5() != 2;
         if (var1) {
            return this.u9.y4().n5() == null ? 0.0 : com.aspose.slides.internal.v6g.k5.u3(this.u9.y4().n5(), double.class);
         } else {
            return DoubleChartValue.l6(this.getXPlus());
         }
      }
   }

   final double k5() {
      if (this.u9.u3().getDataSourceTypeForErrorBarsCustomValues().getDataSourceTypeForYMinusValues() == 2
         && this.getYMinus() != null
         && !com.aspose.slides.ms.System.d2.k5(this.getYMinus().getAsLiteralDouble())) {
         return this.getYMinus().getAsLiteralDouble();
      } else {
         boolean var1 = ((ChartData)this.u9.u3().l6().getChart().getChartData()).l6().k5() != 2;
         if (var1) {
            return this.u9.z1().n5() == null ? 0.0 : com.aspose.slides.internal.v6g.k5.u3(this.u9.z1().n5(), double.class);
         } else {
            return DoubleChartValue.l6(this.getYMinus());
         }
      }
   }

   final double u3() {
      if (this.u9.u3().getDataSourceTypeForErrorBarsCustomValues().getDataSourceTypeForYPlusValues() == 2
         && this.getYPlus() != null
         && !com.aspose.slides.ms.System.d2.k5(this.getYPlus().getAsLiteralDouble())) {
         return this.getYPlus().getAsLiteralDouble();
      } else {
         boolean var1 = ((ChartData)this.u9.u3().l6().getChart().getChartData()).l6().k5() != 2;
         if (var1) {
            return this.u9.t9().n5() == null ? 0.0 : com.aspose.slides.internal.v6g.k5.u3(this.u9.t9().n5(), double.class);
         } else {
            return DoubleChartValue.l6(this.getYPlus());
         }
      }
   }
}
