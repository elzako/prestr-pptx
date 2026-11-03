package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

class l1h implements IGenericEnumerable<h6g> {
   private List<h6g> n5 = new List<>();
   private ChartDataWorkbook l6;

   l1h(ChartDataWorkbook var1) {
      this.l6 = var1;
   }

   public final int n5() {
      return this.n5.size();
   }

   final void n5(h6g var1) {
      this.n5.addItem(var1);
   }

   @Override
   public final IGenericEnumerator<h6g> iterator() {
      return this.n5.iterator();
   }
}
