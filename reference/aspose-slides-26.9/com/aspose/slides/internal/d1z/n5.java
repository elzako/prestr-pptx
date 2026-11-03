package com.aspose.slides.internal.d1z;

class n5 implements com.aspose.slides.internal.n1b.n5 {
   @Override
   public double n5(double var1) {
      return this.n5(var1, 0.125);
   }

   @Override
   public double l6(double var1) {
      return this.n5(var1, 0.25);
   }

   public double n5(double var1, double var3) {
      double var5 = 0.002;
      double var7 = var3 - var5;
      double var9 = var1 % var3;
      if (var1 < 0.0) {
         return Math.abs(var9) < var7 ? var1 - var9 : var1 - var3 - var9;
      } else {
         return var9 < var5 ? var1 - var9 : var1 + var3 - var9;
      }
   }
}
