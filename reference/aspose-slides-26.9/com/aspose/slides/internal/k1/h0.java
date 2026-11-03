package com.aspose.slides.internal.k1;

import com.aspose.slides.ms.System.j8;

public class h0 extends com.aspose.slides.internal.y6.u3 {
   private u9 n5;
   private u9 l6;
   private u9 k5;

   public final u9 n5() {
      return this.n5;
   }

   public final void n5(u9 var1) {
      this.n5 = var1;
   }

   public final u9 l6() {
      return this.l6;
   }

   public final void l6(u9 var1) {
      this.l6 = var1;
   }

   public final u9 k5() {
      return this.k5;
   }

   public final void k5(u9 var1) {
      this.k5 = var1;
   }

   protected final boolean n5(h0 var1) {
      return j8.n5(this.n5, var1.n5) && j8.n5(this.l6, var1.l6) && j8.n5(this.k5, var1.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((h0)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5 != null ? this.n5.hashCode() : 0;
      var1 = var1 * 397 ^ (this.l6 != null ? this.l6.hashCode() : 0);
      return var1 * 397 ^ (this.k5 != null ? this.k5.hashCode() : 0);
   }
}
