package com.aspose.slides.internal.t5;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.j8;

public class k7 extends q0 {
   private long n5;
   private long l6;
   private long k5;
   private long u3;
   private com.aspose.slides.internal.k1.k7 a6;

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      if ((var1 & 4294967295L) != 32L) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.n5 = var1;
   }

   public final long l6() {
      return this.l6;
   }

   public final void l6(long var1) {
      if ((var1 & 4294967295L) != 1L) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.l6 = var1;
   }

   public final long k5() {
      return this.k5;
   }

   public final void k5(long var1) {
      this.k5 = var1;
   }

   public final long u3() {
      return this.u3;
   }

   public final void u3(long var1) {
      this.u3 = var1;
   }

   public final com.aspose.slides.internal.k1.k7 u9() {
      return this.a6;
   }

   public final void n5(com.aspose.slides.internal.k1.k7 var1) {
      this.a6 = var1;
   }

   protected final boolean n5(k7 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6 && this.k5 == var1.k5 && this.u3 == var1.u3 && j8.n5(this.a6, var1.a6);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((k7)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = (int)this.n5;
      var1 = var1 * 397 ^ (int)this.l6;
      var1 = var1 * 397 ^ (int)this.k5;
      var1 = var1 * 397 ^ (int)this.u3;
      return var1 * 397 ^ (this.a6 != null ? this.a6.hashCode() : 0);
   }
}
