package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;

public class StringOrDoubleChartValue extends BaseChartValue implements IStringOrDoubleChartValue {
   private k4s l6;
   private String k5 = null;
   private double u3 = Double.NaN;

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

      this.l6().n5((ChartDataCell)value);
   }

   @Override
   public final String getAsLiteralString() {
      if (this.getDataSourceType() != 1) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceType property value is not DataSourceType.StringLiterals. ",
               "And so this property is not actual. See BaseChartValue.DataSourceType property summary."
            })
         );
      } else {
         return this.k5;
      }
   }

   @Override
   public final void setAsLiteralString(String value) {
      if (this.getDataSourceType() != 1) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceType property value is not DataSourceType.StringLiterals. ",
               "And so this property is not actual. See BaseChartValue.DataSourceType property summary."
            })
         );
      }

      this.k5 = value;
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
         return this.u3;
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

      this.u3 = value;
   }

   @Override
   public Object getData() {
      switch (this.getDataSourceType()) {
         case 0:
            return this.l6().n5() == null ? null : this.l6().n5().getValue();
         case 1:
            return this.k5;
         case 2:
            if (com.aspose.slides.ms.System.d2.k5(this.u3)) {
               return null;
            }

            return this.u3;
         default:
            throw new Exception();
      }
   }

   @Override
   public void setData(Object value) {
      switch (this.getDataSourceType()) {
         case 0:
            if (com.aspose.slides.internal.v6g.k5.l6(value, ChartDataCell.class)) {
               this.l6().n5((ChartDataCell)value);
            } else {
               ((ChartDataCell)this.l6().n5()).n5(value);
            }
            break;
         case 1:
            if (!com.aspose.slides.internal.v6g.k5.l6(value, String.class)) {
               throw new ArgumentException("Assigned value is not appropriate to DataSourceType.");
            }

            this.k5 = (String)value;
            break;
         case 2:
            if (value == null) {
               this.u3 = Double.NaN;
            } else {
               if (!com.aspose.slides.internal.v6g.k5.l6(value, Double.class)) {
                  throw new ArgumentException("Assigned value is not appropriate to DataSourceType.");
               }

               this.u3 = com.aspose.slides.internal.v6g.k5.u3(value, double.class);
            }
            break;
         default:
            throw new InvalidOperationException();
      }
   }

   static String n5(IStringOrDoubleChartValue var0) {
      StringOrDoubleChartValue var1 = (StringOrDoubleChartValue)var0;
      switch (var1.getDataSourceType()) {
         case 0:
            return var1.l6().n5() == null
               ? com.aspose.slides.ms.System.d1.n5
               : com.aspose.slides.ms.System.z3.t9(var1.l6().n5().getValue(), com.aspose.slides.internal.x7n.l6.k5());
         case 1:
            return var1.k5 == null ? com.aspose.slides.ms.System.d1.n5 : var1.k5;
         case 2:
            return com.aspose.slides.ms.System.d2.k5(var1.u3)
               ? com.aspose.slides.ms.System.d1.n5
               : com.aspose.slides.ms.System.z3.n5(var1.u3, com.aspose.slides.internal.x7n.l6.k5());
         default:
            throw new Exception();
      }
   }

   static double n5(IStringOrDoubleChartValue var0, double var1) {
      StringOrDoubleChartValue var3 = (StringOrDoubleChartValue)var0;
      switch (var3.getDataSourceType()) {
         case 0:
            if (var3.l6().n5() != null && var3.l6().n5().getValue() != null && ((ChartDataCell)var3.l6().n5()).n5() != 3) {
               return com.aspose.slides.ms.System.z3.n3(var3.l6().n5().getValue(), com.aspose.slides.internal.x7n.l6.k5());
            }

            return var1;
         case 1:
            return com.aspose.slides.ms.System.z3.n3(var3.k5, com.aspose.slides.internal.x7n.l6.k5());
         case 2:
            return com.aspose.slides.ms.System.d2.k5(var3.u3) ? var1 : var3.u3;
         default:
            throw new Exception();
      }
   }

   static boolean n5(ISingleCellChartValue var0) {
      return n5(var0, true);
   }

   static boolean n5(ISingleCellChartValue var0, boolean var1) {
      StringOrDoubleChartValue var2 = com.aspose.slides.internal.v6g.k5.n5(var0, StringOrDoubleChartValue.class);
      if (var2 == null) {
         return false;
      }

      switch (var2.getDataSourceType()) {
         case 0:
            if (var2.l6().n5() != null && var2.l6().n5().getValue() != null) {
               if (var1 && com.aspose.slides.ms.System.d1.n5(var2.l6().n5().getValue().toString())) {
                  return true;
               }

               return false;
            }

            return true;
         case 1:
            return var1 ? com.aspose.slides.ms.System.d1.n5(var2.k5) : var2.k5 == null;
         case 2:
            return com.aspose.slides.ms.System.d2.k5(var2.u3);
         default:
            throw new Exception();
      }
   }

   @Override
   public final double toDouble() {
      return n5(this, Double.NaN);
   }

   StringOrDoubleChartValue(r0g parentImmediate, v1y dataSourceTypeHolder, boolean centralizedTypeChangingRestriction) {
      super(parentImmediate, dataSourceTypeHolder, centralizedTypeChangingRestriction);
   }

   private k4s l6() {
      if (this.l6 == null) {
         this.l6 = new k4s(this.n5);
      }

      return this.l6;
   }
}
