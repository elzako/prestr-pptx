package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;

public class DataSourceTypeForErrorBarsCustomValues implements IDataSourceTypeForErrorBarsCustomValues {
   private v1y n5 = new v1y();
   private v1y l6 = new v1y();
   private v1y k5 = new v1y();
   private v1y u3 = new v1y();

   @Override
   public final int getDataSourceTypeForXMinusValues() {
      return this.n5.n5();
   }

   @Override
   public final void setDataSourceTypeForXMinusValues(int value) {
      if (value != 0 && value != 2) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"DataSourceTypeForXMinus can be ", "DataSourceType.Worksheet or DataSourceType.DoubleLiterals"})
         );
      }

      this.n5.n5(value);
   }

   @Override
   public final int getDataSourceTypeForXPlusValues() {
      return this.l6.n5();
   }

   @Override
   public final void setDataSourceTypeForXPlusValues(int value) {
      if (value != 0 && value != 2) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"DataSourceTypeForXPlus can be ", "DataSourceType.Worksheet or DataSourceType.DoubleLiterals"})
         );
      }

      this.l6.n5(value);
   }

   @Override
   public final int getDataSourceTypeForYMinusValues() {
      return this.k5.n5();
   }

   @Override
   public final void setDataSourceTypeForYMinusValues(int value) {
      if (value != 0 && value != 2) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"DataSourceTypeForYMinus can be ", "DataSourceType.Worksheet or DataSourceType.DoubleLiterals"})
         );
      }

      this.k5.n5(value);
   }

   @Override
   public final int getDataSourceTypeForYPlusValues() {
      return this.u3.n5();
   }

   @Override
   public final void setDataSourceTypeForYPlusValues(int value) {
      if (value != 0 && value != 2) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"DataSourceTypeForYPlus can be ", "DataSourceType.Worksheet or DataSourceType.DoubleLiterals"})
         );
      }

      this.u3.n5(value);
   }

   final v1y n5() {
      return this.n5;
   }

   final v1y l6() {
      return this.l6;
   }

   final v1y k5() {
      return this.k5;
   }

   final v1y u3() {
      return this.u3;
   }
}
