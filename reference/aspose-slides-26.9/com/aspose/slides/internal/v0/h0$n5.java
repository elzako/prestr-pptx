package com.aspose.slides.internal.v0;

import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.j8;

final class h0$n5 {
   private final int n5;
   private final int l6;

   public h0$n5(int var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public boolean equals(Object obj) {
      h0$n5 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, h0$n5.class);
      if (j8.l6(null, var2)) {
         return false;
      } else {
         return j8.l6(this, var2) ? true : a3.l6(var2.hashCode(), this.hashCode());
      }
   }

   @Override
   public int hashCode() {
      int var1 = 17;
      var1 = 37 * var1 + a3.n5(this.n5);
      return 37 * var1 + a3.n5(this.l6);
   }
}
