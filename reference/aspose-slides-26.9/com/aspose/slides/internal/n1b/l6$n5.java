package com.aspose.slides.internal.n1b;

class l6$n5 implements n5 {
   private final double n5;
   private final double l6;
   private final double k5;

   private l6$n5(double var1) {
      double var3 = var1 / 0.25;
      this.n5 = var3 * 0.0625;
      this.l6 = var3 * 0.002;
      this.k5 = this.n5 - this.l6;
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
      double var3 = var1 % this.n5;
      if (var1 < 0.0) {
         return Math.abs(var3) < this.k5 ? var1 - var3 : var1 - this.n5 - var3;
      } else {
         return var3 < this.l6 ? var1 - var3 : var1 + this.n5 - var3;
      }
   }

   // Restored original synthetic constructor delegation: (DLcom/aspose/slides/internal/n1b/k5;)V -> (D)V
   l6$n5(double recoveredArg0, com.aspose.slides.internal.n1b.k5 recoveredArg1) {
      this(recoveredArg0);
   }
}
