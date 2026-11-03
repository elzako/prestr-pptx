package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;

class r5d {
   private String n5;
   private IChartData l6;

   r5d(String var1, IChartData var2) {
      com.aspose.slides.internal.f8y.n5.n5(var2 != null, "Argument chartData can't be null");
      com.aspose.slides.internal.f8y.n5.n5(!com.aspose.slides.ms.System.d1.n5(var1), "Argument formula can't be empty");
      this.n5 = var1;
      this.l6 = var2;
   }

   final void n5(t1z var1) {
      ChartDataWorkbook var2 = (ChartDataWorkbook)this.l6.getChartDataWorkbook();
      List var3 = var2.u3(this.n5);
      if (var3.size() == 0) {
         throw new ArgumentException("Formula has incorrect format", "formula");
      }

      var1.n5(var3, this.l6);
      var1.l6(var3, this.l6);
   }
}
