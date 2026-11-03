package com.aspose.slides.internal.k1;

import com.aspose.slides.ms.System.j8;

public class q0 extends com.aspose.slides.internal.y6.u3 {
   private int n5;
   private int l6;

   public q0() {
   }

   public q0(int var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.internal.o9b.j5 k5() {
      return new com.aspose.slides.internal.o9b.j5(this.n5, this.l6);
   }

   public final com.aspose.slides.internal.o9b.w1 u3() {
      return new com.aspose.slides.internal.o9b.w1(this.n5, this.l6);
   }

   protected final boolean n5(q0 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((q0)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.n5 * 397 ^ this.l6;
   }
}
