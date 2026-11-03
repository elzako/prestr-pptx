package com.aspose.slides.internal.c6;

import com.aspose.slides.IChartSeries;
import com.aspose.slides.ms.System.d1;

class w1 extends c4 {
   private final IChartSeries n5;

   public w1(IChartSeries var1) {
      this.n5 = var1;
   }

   @Override
   protected String n5() {
      String var1 = this.n5.getName().toString();
      if (var1 == null) {
         var1 = d1.n5;
      }

      return var1;
   }

   @Override
   protected void n5(String var1) {
      if (this.n5.getName().getDataSourceType() == 0) {
         this.n5.getName().getAsCells().get_Item(0).setValue(var1);
      } else {
         this.n5.getName().setAsLiteralString(var1);
      }
   }
}
