package com.aspose.slides.internal.g7;

public class l4w extends n5p {
   private b7s n5;
   private double l6;

   public l4w(b7s var1) {
      this.n5 = var1;
      this.l6 = com.aspose.slides.ms.System.q1.z3(this.n5.n5() * this.n5.n5() + this.n5.l6() * this.n5.l6());
   }

   @Override
   public double n5(double var1, double var3) {
      return (var1 * this.n5.n5() + var3 * this.n5.l6()) / this.l6;
   }

   @Override
   public void n5(v2x var1, int var2, double var3) {
      double var5 = this.n5.n5() * var3;
      double var7 = this.n5.l6() * var3;
      var1.a6[var2] = var1.a6[var2] + var5;
      var1.u9[var2] = var1.u9[var2] + var7;
      var1.c8[var2] = true;
      var1.h0[var2] = true;
   }
}
