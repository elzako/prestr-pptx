package com.aspose.slides.internal.q5;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public abstract class n5 extends com.aspose.slides.internal.l7.a6 {
   protected int l6;
   protected l6 k5;

   public final int k5() {
      return this.l6;
   }

   public final l6 u3() {
      return this.k5;
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      var1.n5("cmap: ");
      var1.n5(this.u3());
      var1.n5(", ");
      var1.k5(this.k5());
      var1.n5(", Data Size=0x");
      var1.n5(d1.n5("{0:x}", new Object[]{this.n5.n5()}));
      return var1.toString();
   }

   public final boolean n5(n5 var1) {
      if (j8.l6(null, var1)) {
         return false;
      } else {
         return j8.l6(this, var1) ? true : j8.n5(var1.k5, this.k5);
      }
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != com.aspose.slides.internal.v6g.k5.n5(n5.class) ? false : this.n5((n5)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.k5 != null ? this.k5.hashCode() : 0;
   }

   // BUILD-ONLY: mandatory constructorless normalization removes this entire member.
   private n5(com.aspose.slides.internal.m9.h0 recoveryArg0) {
      super(recoveryArg0);
   }
}
