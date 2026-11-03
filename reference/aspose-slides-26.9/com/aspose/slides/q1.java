package com.aspose.slides;

final class q1 extends d7 implements j2m {
   public q1(j2m var1) {
      super(var1);
   }

   @Override
   public final double k5() {
      return this.n5.k5() * 2.0;
   }

   @Override
   public final void n5(double var1) {
      if (var1 < this.n5.k5()) {
         this.n5.n5(var1);
      } else {
         this.n5.n5(this.k5() - var1);
      }
   }

   @Override
   public void I_() {
      this.n5(0.0);
   }
}
