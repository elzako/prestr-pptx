package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

final class w1y extends d7 implements j2m {
   public final double l6;
   private double k5;

   public w1y(j2m var1, double var2) {
      super(var1);
      if (var2 < 0.0) {
         throw new ArgumentOutOfRangeException("delay");
      }

      this.l6 = var2;
      this.l6(var2 + var1.k5());
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
      if (!(var1 < this.l6)) {
         this.n5.n5(var1 - this.l6);
      }
   }
}
