package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class u6p extends k0t {
   private List<Integer> k5 = new List<>();
   private int u3;

   public u6p(long var1, String var3) {
      super(var1, var3);
   }

   public final Integer[] k5() {
      return this.k5.toArray(new Integer[0]);
   }

   @Override
   public void n5(f3c var1) {
      var1.n5(this.n5 & 4294967295L);
      this.u3 = var1.n3();
      this.k5 = l6(var1);
   }
}
