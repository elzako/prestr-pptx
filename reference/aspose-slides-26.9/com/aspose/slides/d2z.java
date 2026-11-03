package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

class d2z implements IGenericEnumerable<g3c> {
   private List<g3c> n5 = new List<>();

   public int n5() {
      return this.n5.size();
   }

   public void n5(g3c var1) {
      this.n5.addItem(var1);
   }

   public void l6() {
      this.n5.clear();
   }

   public final int l6(g3c var1) {
      return this.n5.indexOf(var1);
   }

   @Override
   public IGenericEnumerator<g3c> iterator() {
      return this.n5.iterator();
   }
}
