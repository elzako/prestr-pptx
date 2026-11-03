package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

final class l6 extends d7 implements j2m {
   private float l6 = 0.0F;
   private float k5 = 0.0F;

   public l6(j2m var1, float var2, float var3) {
      super(var1);
      if (var2 < 0.0F) {
         throw new ArgumentOutOfRangeException("accelerate");
      }

      if (var3 < 0.0F) {
         throw new ArgumentOutOfRangeException("decelerate");
      }

      if (var2 + var3 > 1.0F) {
         float var4 = var2 + var3;
         var2 /= var4;
         var3 /= var4;
      }

      this.l6 = var2;
      this.k5 = var3;
   }

   public final float n5() {
      return this.l6;
   }

   public final float l6() {
      return this.k5;
   }

   @Override
   public final double k5() {
      return this.n5.k5();
   }

   @Override
   public final void n5(double var1) {
      double var3 = var1 / this.k5();
      if (this.n5() > 0.0F && var3 < this.n5()) {
         double var7 = this.n5(var3, this.n5());
         this.n5.n5(var7);
      } else if (this.l6() > 0.0F && 1.0 - var3 <= this.l6()) {
         double var5 = this.n5(1.0 - var3, this.l6());
         this.n5.n5(this.k5() - var5);
      } else {
         this.n5.n5(var1);
      }
   }

   private double n5(double var1, float var3) {
      var1 *= var1 / var3;
      return this.k5() * var1;
   }
}
