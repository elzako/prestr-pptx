package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class z3o implements s3b {
   private IChartDataWorkbook n5;

   @Override
   public final int n5() {
      return 0;
   }

   @Override
   public final com.aspose.slides.internal.x7n.l6 l6() {
      IPresentation var1 = ((ChartDataWorkbook)this.n5).n3().getPresentation();
      return ((SpreadsheetOptions)((Presentation)var1).a6().getSpreadsheetOptions()).n5();
   }

   public z3o(IChartDataWorkbook var1) {
      if (var1 == null) {
         throw new ArgumentNullException("workbook");
      }

      this.n5 = var1;
   }
}
