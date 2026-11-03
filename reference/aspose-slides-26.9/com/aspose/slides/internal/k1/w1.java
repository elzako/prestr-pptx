package com.aspose.slides.internal.k1;

import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class w1 extends com.aspose.slides.internal.y6.u3 {
   private long n5;
   private long l6;

   public w1() {
   }

   public w1(long var1, long var3) {
      this.n5 = var1;
      this.l6 = var3;
   }

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

   public final p8 k5() {
      return new p8((int)this.n5, (int)this.l6);
   }

   @Override
   public String toString() {
      return d1.n5("Cx: {0}, Cy: {1}", this.n5, this.l6);
   }

   protected final boolean n5(w1 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((w1)obj);
      }
   }

   @Override
   public int hashCode() {
      return (int)this.n5 * 397 ^ (int)this.l6;
   }
}
