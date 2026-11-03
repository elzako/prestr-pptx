package com.aspose.slides.internal.t5;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class y4 extends n3 {
   private k5 n5;

   public y4(n3 var1) {
      super(var1);
      this.l6(var1.t4());
      this.k5(var1.q0());
      this.u3(var1.z3());
      this.n5(var1.m1());
   }

   public final k5 k7() {
      return this.n5;
   }

   public final void n5(k5 var1) {
      this.n5 = var1;
   }

   @Override
   public String toString() {
      return d1.n5("{0}, DesignVector: {1}", super.toString(), this.k7());
   }

   protected final boolean n5(y4 var1) {
      return super.n5(var1) && j8.n5(this.n5, var1.n5);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((y4)obj);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode() * 397 ^ (this.n5 != null ? this.n5.hashCode() : 0);
   }
}
