package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;

public class DoubleChartValue extends BaseChartValue implements IDoubleChartValue {
   private k4s l6;
   private double k5 = Double.NaN;

   @Override
   public final IChartDataCell getAsCell() {
      if (this.getDataSourceType() != 0) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceType property value is not DataSourceType.Worksheet. ",
               "And so this property is not actual. See BaseChartValue.DataSourceType property summary."
            })
         );
      } else {
         return this.l6().n5();
      }
   }

   @Override
   public final void setAsCell(IChartDataCell value) {
      if (this.getDataSourceType() != 0) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceType property value is not DataSourceType.Worksheet. ",
               "And so this property is not actual. See BaseChartValue.DataSourceType property summary."
            })
         );
      }

      ((ChartData)this.n5().getChartData()).l6().n5((ChartDataCell)value);
      this.l6().n5((ChartDataCell)value);
   }

   @Override
   public final double getAsLiteralDouble() {
      if (this.getDataSourceType() != 2) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceType property value is not DataSourceType.DoubleLiterals. ",
               "And so this property is not actual. See BaseChartValue.DataSourceType property summary."
            })
         );
      } else {
         return this.k5;
      }
   }

   @Override
   public final void setAsLiteralDouble(double value) {
      if (this.getDataSourceType() != 2) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceType property value is not DataSourceType.DoubleLiterals. ",
               "And so this property is not actual. See BaseChartValue.DataSourceType property summary."
            })
         );
      }

      this.k5 = value;
   }

   @Override
   public Object getData() {
      switch (this.getDataSourceType()) {
         case 0:
            return this.l6().n5() == null ? null : this.l6().n5().getValue();
         case 2:
            if (com.aspose.slides.ms.System.d2.k5(this.k5)) {
               return null;
            }

            return this.k5;
         default:
            throw new Exception();
      }
   }

   @Override
   public void setData(Object value) {
      switch (this.getDataSourceType()) {
         case 0:
            if (com.aspose.slides.internal.v6g.k5.l6(value, ChartDataCell.class)) {
               ((ChartData)this.n5().getChartData()).l6().n5((ChartDataCell)value);
               this.l6().n5((ChartDataCell)value);
            } else {
               ((ChartDataCell)this.l6().n5()).n5(value);
            }
            break;
         case 2:
            if (value == null) {
               this.k5 = Double.NaN;
            } else {
               if (!com.aspose.slides.internal.v6g.k5.l6(value, Double.class)) {
                  throw new ArgumentException("Assigned value is not appropriate to DataSourceType.");
               }

               this.k5 = com.aspose.slides.internal.v6g.k5.u3(value, double.class);
            }
            break;
         default:
            throw new Exception();
      }
   }

   static String n5(IDoubleChartValue var0) {
      DoubleChartValue var1 = (DoubleChartValue)var0;
      switch (var1.getDataSourceType()) {
         case 0:
            return var1.l6().n5() == null
               ? com.aspose.slides.ms.System.d1.n5
               : com.aspose.slides.ms.System.z3.t9(var1.l6().n5().getValue(), com.aspose.slides.internal.x7n.l6.k5());
         case 2:
            return com.aspose.slides.ms.System.d2.k5(var1.k5)
               ? com.aspose.slides.ms.System.d1.n5
               : com.aspose.slides.ms.System.z3.n5(var1.k5, com.aspose.slides.internal.x7n.l6.k5());
         default:
            throw new Exception();
      }
   }

   static double l6(IDoubleChartValue var0) {
      return n5(var0, 0.0);
   }

   static double n5(IDoubleChartValue var0, double var1) {
      DoubleChartValue var3 = (DoubleChartValue)var0;
      switch (var3.getDataSourceType()) {
         case 0:
            if (var3.l6().n5() != null && var3.l6().n5().getValue() != null) {
               if (n5(var3.l6().n5().getValue())) {
                  return com.aspose.slides.ms.System.z3.n3(var3.l6().n5().getValue(), com.aspose.slides.internal.x7n.l6.k5());
               }

               String var4 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5().getValue(), String.class);
               if (var4 == null) {
                  var4 = var3.l6().n5().getValue().toString();
               }

               if (com.aspose.slides.ms.System.d1.a6(var4, com.aspose.slides.ms.System.d1.n5)) {
                  return 0.0;
               }

               double var5 = 0.0;
               double[] var7 = new double[]{0.0};
               boolean var8 = com.aspose.slides.ms.System.d2.n5(var4, 511, com.aspose.slides.internal.x7n.l6.k5(), var7);
               var5 = var7[0];
               if (var8) {
                  return var5;
               }

               return var1;
            }

            return var1;
         case 2:
            return com.aspose.slides.ms.System.d2.k5(var3.k5) ? var1 : var3.k5;
         default:
            throw new Exception();
      }
   }

   static boolean n5(ISingleCellChartValue var0) {
      return n5(var0, true, true);
   }

   static boolean n5(ISingleCellChartValue var0, boolean var1, boolean var2) {
      DoubleChartValue var3 = com.aspose.slides.internal.v6g.k5.n5(var0, DoubleChartValue.class);
      if (var3 == null) {
         return false;
      }

      switch (var3.getDataSourceType()) {
         case 0:
            if (var3.l6().n5() != null && var3.l6().n5().getValue() != null) {
               if (var1 && com.aspose.slides.ms.System.d1.n5(var3.l6().n5().getValue().toString())) {
                  return true;
               }

               if (var2 && com.aspose.slides.ms.System.d1.a6(var3.l6().n5().getValue().toString(), "#N/A")) {
                  return true;
               }

               return false;
            }

            return true;
         case 2:
            return com.aspose.slides.ms.System.d2.k5(var3.k5);
         default:
            throw new NotSupportedException(
               com.aspose.slides.ms.System.d1.n5(
                  "Data source '{0}' is not supported", new Object[]{com.aspose.slides.ms.System.s3.n5(DataSourceType.class, var3.getDataSourceType())}
               )
            );
      }
   }

   @Override
   public final double toDouble() {
      return n5(this, Double.NaN);
   }

   DoubleChartValue(r0g parentImmediate, v1y dataSourceTypeHolder, boolean centralizedTypeChangingRestriction) {
      super(parentImmediate, dataSourceTypeHolder, centralizedTypeChangingRestriction);
   }

   private static boolean n5(Object var0) {
      return com.aspose.slides.internal.v6g.k5.l6(var0, Byte.class)
         || com.aspose.slides.internal.v6g.k5.l6(var0, Integer.class)
         || com.aspose.slides.internal.v6g.k5.l6(var0, Long.class)
         || com.aspose.slides.internal.v6g.k5.l6(var0, Short.class)
         || com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.ms.System.c4.class)
         || com.aspose.slides.internal.v6g.k5.l6(var0, Double.class)
         || com.aspose.slides.internal.v6g.k5.l6(var0, Float.class);
   }

   private k4s l6() {
      if (this.l6 == null) {
         this.l6 = new k4s(this.n5);
      }

      return this.l6;
   }
}
