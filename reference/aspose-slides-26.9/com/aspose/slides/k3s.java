package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

class k3s {
   private double n5;
   private double l6;

   public k3s(double var1) {
      if (var1 <= 0.0) {
         throw new ArgumentOutOfRangeException("frameRatePeriod");
      }

      this.l6(var1);
      this.n5 = var1;
   }

   public final double n5() {
      return this.l6;
   }

   private void l6(double var1) {
      this.l6 = var1;
   }

   public final int n5(double var1) {
      if (var1 < 0.0) {
         return 0;
      }

      int var3 = 0;

      while (true) {
         double var4 = this.n5 + var1 - this.n5() * var3;
         if (!(this.n5() < var4)) {
            this.n5 = var4;
            return var3;
         }

         var3++;
      }
   }
}
