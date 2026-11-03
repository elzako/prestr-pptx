package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

final class a8k extends d7 implements j2m {
   private int l6 = 1;
   private double k5;

   public a8k(j2m var1, int var2) {
      super(var1);
      this.n5(var2);
   }

   public final int l6() {
      return this.l6;
   }

   public final void n5(int var1) {
      if (this.l6 != var1) {
         if (var1 < 0) {
            throw new ArgumentOutOfRangeException("value");
         }

         this.l6 = var1;
         this.l6(this.n5.k5() * this.l6());
      }
   }

   @Override
   public final double k5() {
      return this.k5;
   }

   private void l6(double var1) {
      this.k5 = var1;
   }

   @Override
   public final void n5(double var1) {
      var1 %= this.n5.k5();
      this.n5.n5(var1);
   }
}
