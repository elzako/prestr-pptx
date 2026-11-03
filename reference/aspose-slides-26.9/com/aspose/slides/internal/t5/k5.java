package com.aspose.slides.internal.t5;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class k5 extends q0 {
   private long n5;
   private int[] l6;

   public final long n5() {
      return 134248036L;
   }

   public final void n5(long var1) {
      if ((var1 & 4294967295L) != 134248036L) {
         throw new ArgumentOutOfRangeException("value", "Signature must be set to 0x08007664.");
      }
   }

   public final long l6() {
      return this.n5;
   }

   public final void l6(long var1) {
      this.n5 = var1;
   }

   public final int[] k5() {
      return this.l6;
   }

   public final void n5(int[] var1) {
      this.l6 = var1;
   }

   @Override
   public String toString() {
      return d1.n5("Signature: {0}, NumAxes: {1}, Values: {2}", this.n5(), this.l6(), this.k5());
   }

   protected final boolean n5(k5 var1) {
      return this.n5 == var1.n5 && com.aspose.slides.internal.y6.c8.n5(this.l6, var1.l6);
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

   @Override
   public int hashCode() {
      return (int)this.n5 * 397 ^ (this.l6 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.l6)).hashCode() : 0);
   }
}
