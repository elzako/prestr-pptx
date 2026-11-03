package com.aspose.slides.internal.k1;

import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class k7 extends com.aspose.slides.internal.y6.u3 {
   private int n5;
   private int l6;
   private int k5;
   private int u3;

   public k7() {
   }

   public k7(int var1, int var2, int var3, int var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
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

   public final int k5() {
      return this.k5;
   }

   public final void k5(int var1) {
      this.k5 = var1;
   }

   public final int u3() {
      return this.u3;
   }

   public final void u3(int var1) {
      this.u3 = var1;
   }

   public final int u9() {
      return this.k5 - this.n5;
   }

   public final int h0() {
      return this.u3 - this.l6;
   }

   public final y2 c8() {
      return y2.n5(this.n5, this.l6, this.k5, this.u3);
   }

   public final y1 t2() {
      return y1.n5(this.c8());
   }

   protected final boolean n5(k7 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6 && this.k5 == var1.k5 && this.u3 == var1.u3;
   }

   @Override
   public String toString() {
      return d1.n5("[Left: {0}, Top: {1}, Right: {2}, Bottom: {3}]", this.n5, this.l6, this.k5, this.u3);
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
      int var1 = this.n5;
      var1 = var1 * 397 ^ this.l6;
      var1 = var1 * 397 ^ this.k5;
      return var1 * 397 ^ this.u3;
   }
}
