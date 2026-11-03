package com.aspose.slides.internal.k1;

import com.aspose.slides.ms.System.j8;

public class u9 extends com.aspose.slides.internal.y6.u3 {
   private int n5;
   private int l6;
   private int k5;

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

   public final int k5() {
      return this.k5;
   }

   public final void k5(int var1) {
      this.k5 = var1;
   }

   protected final boolean n5(u9 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6 && this.k5 == var1.k5;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((u9)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5;
      var1 = var1 * 397 ^ this.l6;
      return var1 * 397 ^ this.k5;
   }
}
