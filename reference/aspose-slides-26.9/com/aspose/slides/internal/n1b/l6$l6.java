package com.aspose.slides.internal.n1b;

class l6$l6 implements n5 {
   private final double n5;
   private final double l6;

   l6$l6(double var1) {
      double var3 = var1 / 0.25;
      this.n5 = var3 * 0.0625;
      this.l6 = this.n5 / 2.0;
   }

   @Override
   public double n5(double var1) {
      return this.k5(var1);
   }

   @Override
   public double l6(double var1) {
      return this.k5(var1);
   }

   private double k5(double var1) {
      double var3;
      if (var1 > 0.0) {
         var3 = var1 + this.l6;
      } else {
         var3 = var1 - this.l6;
      }

      return var3 - var3 % this.n5;
   }
}
