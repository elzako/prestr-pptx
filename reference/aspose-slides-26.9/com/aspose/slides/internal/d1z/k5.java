package com.aspose.slides.internal.d1z;

public class k5 implements com.aspose.slides.internal.n1b.n5 {
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
      return 0.5 < var5 && var5 <= 0.531176 ? var3 + 0.5 : var1;
   }
}
