package com.aspose.slides.internal.t5;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.c3;
import com.aspose.slides.ms.System.j8;

public class e2 extends q0 {
   private int n5;
   private int l6;
   private t9[] k5;
   private int[] u3;

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      if ((var1 & 65535) != 768) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final int[] k5() {
      return this.u3;
   }

   public final void n5(int[] var1) {
      if (this.u3 != var1) {
         this.k5 = null;
      }

      this.u3 = var1;
   }

   public final t9[] u3() {
      if (this.k5 == null) {
         this.u9();
      }

      return this.k5;
   }

   private void u9() {
      this.k5 = new t9[this.u3.length];

      for (int var1 = 0; var1 < this.k5.length; var1++) {
         this.k5[var1] = new t9(this.u3[var1]);
      }
   }

   protected final boolean n5(e2 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6 && j8.n5(this.k5, var1.k5) && j8.n5(this.u3, var1.u3);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((e2)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = c3.n5(this.n5);
      var1 = var1 * 397 ^ c3.n5(this.l6);
      var1 = var1 * 397 ^ (this.k5 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.k5)).hashCode() : 0);
      return var1 * 397 ^ (this.u3 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.u3)).hashCode() : 0);
   }
}
