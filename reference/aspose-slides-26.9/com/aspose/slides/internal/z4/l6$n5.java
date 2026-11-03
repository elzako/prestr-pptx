package com.aspose.slides.internal.z4;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

class l6$n5 {
   private int n5;
   private final String l6;
   private int k5 = -1;

   public l6$n5(String var1, int var2) {
      this.n5 = var2;
      this.l6 = var1;
      this.k5 = d1.t2(this.l6).hashCode();
   }

   public final String n5() {
      return this.l6;
   }

   public final int l6() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final boolean n5(String var1) {
      return this.hashCode() == d1.t2(var1).hashCode();
   }

   @Override
   public boolean equals(Object obj) {
      l6$n5 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, l6$n5.class);
      if (j8.l6(null, var2)) {
         return false;
      } else {
         return j8.l6(this, var2) ? true : this.hashCode() == var2.hashCode();
      }
   }

   @Override
   public int hashCode() {
      if (this.k5 == -1) {
         this.k5 = d1.t2(this.n5()).hashCode();
      }

      return this.k5;
   }
}
