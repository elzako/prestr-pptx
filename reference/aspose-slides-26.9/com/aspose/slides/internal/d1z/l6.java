package com.aspose.slides.internal.d1z;

public class l6 implements com.aspose.slides.internal.n1b.n5 {
   @Override
   public double n5(double var1) {
      return this.k5(var1);
   }

   @Override
   public double l6(double var1) {
      return this.k5(var1);
   }

   public double k5(double var1) {
      double var3 = Math.floor(var1);
      double var5 = var1 - var3;
      return var5 <= 0.531176 ? var3 : var3 + 1.0;
   }
}
