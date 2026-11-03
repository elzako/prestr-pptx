package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

class a9f implements IGenericEnumerable<t3u> {
   private List<t3u> n5 = new List<>();
   private ChartDataWorkbook l6;

   a9f(ChartDataWorkbook var1) {
      this.l6 = var1;
   }

   public final int n5() {
      return this.n5.size();
   }

   public final t3u n5(int var1) {
      return this.n5.get_Item(var1);
   }

   final int n5(t3u var1) {
      this.n5.addItem(var1);
      return this.n5.indexOf(var1);
   }

   @Override
   public final IGenericEnumerator<t3u> iterator() {
      return this.n5.iterator();
   }
}
