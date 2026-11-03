package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidEnumArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;

public class StringChartValue extends BaseChartValue implements IStringChartValue {
   private String l6;
   private ChartCellCollection k5 = new ChartCellCollection(this);

   @Override
   public final IChartCellCollection getAsCells() {
      if (this.getDataSourceType() != 0) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceType property value is not DataSourceType.Worksheet. ",
               "And so this property is not actual. See BaseChartValue.DataSourceType property summary."
            })
         );
      }

      ChartData var1 = w8d.n5(ChartData.class, this.n5);
      var1.l6().n5();
      return this.k5;
   }

   @Override
   public final void setAsCells(IChartCellCollection value) {
      if (this.getDataSourceType() != 0) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceType property value is not DataSourceType.Worksheet. ",
               "And so this property is not actual. See BaseChartValue.DataSourceType property summary."
            })
         );
      }

      if (value == null) {
         throw new ArgumentNullException();
      }

      ChartData var2 = w8d.n5(ChartData.class, this.n5);
      var2.l6().n5();
      this.k5 = (ChartCellCollection)value;
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
         return this.l6;
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

      this.l6 = value;
   }

   @Override
   public Object getData() {
      switch (this.getDataSourceType()) {
         case 0:
            return this.getAsCells();
         case 1:
            return this.l6;
         default:
            throw new Exception();
      }
   }

   @Override
   public void setData(Object value) {
      switch (this.getDataSourceType()) {
         case 0:
            if (value == null) {
               throw new ArgumentNullException();
            }

            if (com.aspose.slides.internal.v6g.k5.l6(value, IChartDataCell.class)) {
               this.setFromOneCell((IChartDataCell)value);
            } else {
               if (!com.aspose.slides.internal.v6g.k5.l6(value, IChartCellCollection.class)) {
                  throw new ArgumentException("Assigned value is not appropriate to DataSourceType.");
               }

               this.setAsCells((ChartCellCollection)value);
            }
            break;
         case 1:
            if (!com.aspose.slides.internal.v6g.k5.l6(value, String.class)) {
               throw new ArgumentException("Assigned value is not appropriate to DataSourceType.");
            }

            this.l6 = (String)value;
            break;
         default:
            throw new InvalidOperationException();
      }
   }

   @Override
   public String toString() {
      switch (this.getDataSourceType()) {
         case 0:
            return this.getAsCells().getConcatenatedValuesFromCells();
         case 1:
            return this.l6;
         default:
            throw new InvalidEnumArgumentException();
      }
   }

   @Override
   public final void setFromOneCell(IChartDataCell cell) {
      if (this.getDataSourceType() != 0) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "DataSourceType property value is not DataSourceType.Worksheet. ",
               "And so this property is not actual. See BaseChartValue.DataSourceType property summary."
            })
         );
      }

      this.setAsCells(new ChartCellCollection(this));
      this.getAsCells().add(cell);
   }

   @Override
   public final String getCellsAddressInWorkbook() {
      return this.getDataSourceType() == 0 ? this.getAsCells().getCellsAddress() : "";
   }

   StringChartValue(r0g parentImmediate, v1y dataSourceTypeHolder, boolean centralizedTypeChangingRestriction) {
      super(parentImmediate, dataSourceTypeHolder, centralizedTypeChangingRestriction);
   }
}
