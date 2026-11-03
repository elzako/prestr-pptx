package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class p4b implements n6y {
   private ChartDataWorkbook n5;
   private final s3b l6;
   private final d4x k5;

   @Override
   public final boolean n5() {
      return this.n5.n5();
   }

   public final String u3() {
      return this.n5.s7();
   }

   @Override
   public final s3b l6() {
      return this.l6;
   }

   @Override
   public final d4x k5() {
      return this.k5;
   }

   @Override
   public final void n5(boolean var1) {
      this.n5.l6(var1);
   }

   public final int a6() {
      return this.n5.getWorksheets().size();
   }

   public p4b(ChartDataWorkbook var1) {
      this.n5 = var1;
      this.l6 = new z3o(var1);
      this.k5 = new x6o(this);
   }

   @Override
   public final b5v n5(String var1) {
      ChartDataWorksheet var2 = ((ChartDataWorksheetCollection)this.n5.getWorksheets()).l6(var1);
      return var2.u9();
   }

   public final l4a n5(String var1, String[] var2) {
      l4a var3 = null;
      var2[0] = null;
      IGenericEnumerator var4 = this.n5.getWorksheets().iterator();

      try {
         while (var4.hasNext()) {
            IChartDataWorksheet var5 = (IChartDataWorksheet)var4.next();
            var3 = ((ChartDataWorksheet)var5).n5().n5(var1);
            if (var3 != null) {
               var2[0] = var5.getName();
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return var3;
   }
}
