package com.aspose.slides.internal.e8b;

import com.aspose.slides.ms.System.a5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.q1;

class l6 extends com.aspose.slides.internal.q6r.l6 implements a5<l6> {
   private final double n5 = q1.t4(2.0);
   private final int l6;
   private final int k5;
   private final int u3;

   public l6(int var1, int var2) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = (this.k5 << 12) + this.l6;
   }

   @Override
   public Double n5() {
      double var1 = (double)this.l6 / this.k5;
      if (var1 > 1.0) {
         throw new com.aspose.slides.internal.z3b.l6(d1.n5("Ocurrences number {0} could not be more than total blocks count {1}",new Object[]{ this.l6, this.k5}));
      } else {
         return var1 > 0.0 ? -var1 * (q1.t4(var1) / this.n5) : 0.0;
      }
   }

   @Override
   public int hashCode() {
      return this.u3;
   }

   @Override
   public boolean equals(Object obj1) {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(obj1, l6.class));
   }

   public final boolean n5(l6 var1) {
      if (j8.l6(var1, null)) {
         return false;
      } else if (j8.l6(this, var1)) {
         return true;
      } else {
         return j8.n5(this) != j8.n5(var1) ? false : this.hashCode() == var1.hashCode();
      }
   }
}
