package com.aspose.slides.internal.t5;

import com.aspose.slides.ms.System.j8;

public class c8 extends t2 {
   private long n5;
   private long l6;

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final long l6() {
      return this.l6;
   }

   public final void l6(long var1) {
      this.l6 = var1;
   }

   protected final boolean n5(c8 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((c8)obj);
      }
   }

   @Override
   public int hashCode() {
      return (int)this.n5 * 397 ^ (int)this.l6;
   }
}
