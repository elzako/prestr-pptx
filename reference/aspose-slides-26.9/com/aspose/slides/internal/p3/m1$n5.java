package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;

public class m1$n5<T> {
   private List<T> n5;
   private int l6;

   public m1$n5(List<T> var1) {
      this.n5 = var1;
      this.l6 = var1.size() - 1;
   }

   public final boolean n5() {
      return this.l6 != -1;
   }

   public final T l6() {
      return this.n5.get_Item(this.l6--);
   }
}
