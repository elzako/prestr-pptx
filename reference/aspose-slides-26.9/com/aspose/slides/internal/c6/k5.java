package com.aspose.slides.internal.c6;

import com.aspose.slides.IChartCategory;
import com.aspose.slides.ms.System.d1;

class k5 extends c4 {
   private final IChartCategory n5;

   public k5(IChartCategory var1) {
      this.n5 = var1;
   }

   @Override
   protected String n5() {
      String var1 = this.n5.getValue().toString();
      if (var1 == null) {
         var1 = d1.n5;
      }

      return var1;
   }

   @Override
   protected void n5(String var1) {
      if (this.n5.getUseCell()) {
         this.n5.getAsCell().setValue(var1);
      } else {
         this.n5.setAsLiteral(var1);
      }
   }
}
