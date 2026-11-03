package com.aspose.slides.internal.f1s;

import com.aspose.slides.ms.System.j8;

class x8$n5 {
   private x8$l6 n5;
   private s7 l6;

   public x8$n5(x8$l6 var1, s7 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final s7 n5() {
      return this.l6;
   }

   public final x8$l6 l6() {
      return this.n5;
   }

   @Override
   public int hashCode() {
      return this.n5.hashCode();
   }

   @Override
   public boolean equals(Object obj) {
      x8$l6 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, x8$l6.class);
      if (!j8.l6(null, var2)) {
         return this.l6().equals(var2);
      }

      x8$n5 var3 = com.aspose.slides.internal.v6g.k5.n5(obj, x8$n5.class);
      return !j8.l6(null, var3) ? this.l6().equals(var3.l6()) : false;
   }
}
