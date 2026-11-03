package com.aspose.slides.internal.b7;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

final class y8 implements IGenericEnumerable<h6> {
   private final List<h6> n5 = new List<>();

   public int n5() {
      return this.n5.size();
   }

   public h6[] l6() {
      return this.n5.toArray(new h6[0]);
   }

   public void n5(h6 var1) {
      this.n5.addItem(var1);
   }

   @Override
   public IGenericEnumerator<h6> iterator() {
      return this.n5.iterator();
   }
}
