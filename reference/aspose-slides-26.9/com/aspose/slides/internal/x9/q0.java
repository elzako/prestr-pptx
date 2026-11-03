package com.aspose.slides.internal.x9;

public class q0 {
   private int[] n5;
   private int l6;
   private int k5;

   public final int n5() {
      while (this.k5 < this.n5.length) {
         if (this.n5[this.k5] > this.l6) {
            return this.n5[this.k5] - this.l6;
         }

         this.k5++;
      }

      return -1;
   }

   public final boolean l6() {
      while (this.k5 < this.n5.length) {
         if (this.n5[this.k5] > this.l6) {
            return true;
         }

         this.k5++;
      }

      return false;
   }

   public final void n5(int var1) {
      this.l6 += var1;
   }
}
