package com.aspose.slides.internal.e8b;

import com.aspose.slides.exceptions.IndexOutOfRangeException;

class n5 {
   private final int n5;
   private final int l6;
   private double[][] k5;

   public n5(int var1, int var2) {
      this.n5(new double[var1][]);

      for (int var3 = 0; var3 < var1; var3++) {
         this.n5()[var3] = new double[var2];
      }

      this.n5 = var1;
      this.l6 = var2;
   }

   public final double[][] n5() {
      return this.k5;
   }

   private void n5(double[][] var1) {
      this.k5 = var1;
   }

   public final void n5(int var1, int var2, double var3, int var5) {
      if (var1 > this.n5) {
         throw new IndexOutOfRangeException("Pixel number exceeds block size");
      }

      if (var2 > this.l6) {
         throw new IndexOutOfRangeException("Quantization value exceeds configured maximum");
      }

      this.n5()[var1][com.aspose.slides.internal.z8m.l6.n5(var2)] = var3 / var5;
   }

   public final double n5(double var1, int var3, int var4, int var5) {
      int var6 = var3 / (var5 << 1);
      double var7 = var1 - var5 * var6;
      return var4 * var7 * var7;
   }

   public final double[] n5(int[] var1) {
      double[] var2 = new double[var1.length];

      for (int var3 = 0; var3 < var1.length; var3++) {
         int var4 = com.aspose.slides.internal.z8m.l6.n5(var1[var3]);
         if (var3 < this.n5 && var4 < this.l6) {
            var2[var3] = this.n5()[var3][var4];
         }
      }

      return var2;
   }

   public final int[][] l6() {
      int[][] var1 = new int[this.n5][];

      for (int var2 = 0; var2 < this.n5; var2++) {
         var1[var2] = new int[this.l6];
      }

      for (int var5 = 5000; var5 >= 0; var5 -= 1000) {
         int[][][] var3 = new int[][][]{var1};
         boolean var4 = this.n5(var3, var5);
         var1 = var3[0];
         if (var4) {
            return var1;
         }
      }

      throw new com.aspose.slides.internal.z3b.l6("Distortions discretization error");
   }

   private boolean n5(int[][][] var1, int var2) {
      if (var2 == 0) {
         var2++;
      }

      for (int var3 = 0; var3 < this.n5; var3++) {
         for (int var4 = 0; var4 < this.l6; var4++) {
            int var5 = com.aspose.slides.internal.v6g.k5.u3(this.n5()[var3][var4] * var2, 14);
            if (var5 < 0) {
               return false;
            }

            var1[0][var3][var4] = var5;
         }
      }

      return true;
   }
}
