package com.aspose.slides.internal.g7;

public class b7s {
   private double n5;
   private double l6;

   public final double n5() {
      return this.n5;
   }

   public final double l6() {
      return this.l6;
   }

   public final void n5(double var1, double var3) {
      double[] var5 = new double[]{this.n5};
      double[] var6 = new double[]{this.l6};
      n5(var1, var3, var5, var6);
      this.n5 = var5[0];
      this.l6 = var6[0];
   }

   private static void n5(double var0, double var2, double[] var4, double[] var5) {
      double var6 = com.aspose.slides.ms.System.q1.z3(var0 * var0 + var2 * var2);
      var4[0] = var0 / var6;
      var5[0] = var2 / var6;
   }
}
