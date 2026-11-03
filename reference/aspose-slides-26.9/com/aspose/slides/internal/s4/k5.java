package com.aspose.slides.internal.s4;

import com.aspose.slides.ms.System.a5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.n3;

public class k5 implements a5<k5> {
   private final boolean n5;
   private final String l6;
   private final com.aspose.slides.internal.n1.l6 k5;

   public final String n5() {
      return this.l6;
   }

   public final com.aspose.slides.internal.n1.l6 l6() {
      return this.k5;
   }

   public final boolean k5() {
      return this.n5;
   }

   @Override
   public int hashCode() {
      int var1 = n3.n5(this.n5);
      var1 = var1 * 397 ^ (this.l6 != null ? this.l6.hashCode() : 0);
      return var1 * 397 ^ (this.k5 != null ? this.k5.hashCode() : 0);
   }

   public final boolean n5(k5 var1) {
      if (j8.l6(null, var1)) {
         return false;
      } else {
         return j8.l6(this, var1) ? true : n3.l6(this.n5, var1.n5) && d1.a6(this.l6, var1.l6) && j8.n5(this.k5, var1.k5);
      }
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((k5)obj);
      }
   }

   // BUILD-ONLY: mandatory constructorless normalization removes this entire member.
   private k5(boolean recoveryArg0, java.lang.String recoveryArg1, com.aspose.slides.internal.n1.l6 recoveryArg2) {
      super();
      this.n5 = recoveryArg0;
      this.l6 = recoveryArg1;
      this.k5 = recoveryArg2;
   }
}
