package com.aspose.slides.internal.e8b;

import com.aspose.slides.exceptions.IndexOutOfRangeException;

class u3 extends com.aspose.slides.internal.q6r.n5 {
   private final int n5;
   private final int l6;
   private double[] k5;
   private int[][] u3;
   private int a6;

   public u3(int var1, int var2, int var3) {
      this.n5(new int[var1][]);

      for (int var4 = 0; var4 < var1; var4++) {
         this.n5()[var4] = new int[var2];
      }

      this.n5(var1);
      this.n5 = var2;
      this.l6 = var3;
   }

   public final int[][] n5() {
      return this.u3;
   }

   private void n5(int[][] var1) {
      this.u3 = var1;
   }

   public final int l6() {
      return this.a6;
   }

   private void n5(int var1) {
      this.a6 = var1;
   }

   public final void n5(int var1, int var2, double var3) {
      if (var1 > this.l6()) {
         throw new IndexOutOfRangeException("Pixel number exceeds block size");
      }

      if (var2 > this.n5) {
         throw new IndexOutOfRangeException("Quantization value exceeds configured maximum");
      }

      this.n5()[var1][com.aspose.slides.internal.z8m.l6.n5(var2)] = com.aspose.slides.internal.v6g.k5.u3(var3 / 64.0 * this.l6, 14);
   }

   public final double n5(int var1, int var2) {
      if (this.k5 == null) {
         this.k5 = new double[5000];
         this.k5[0] = var2;
      }

      l6 var3 = new l6(var1, var2);
      double var4 = 0.0;
      boolean var6 = this.k5.length > var1 + 1 && com.aspose.slides.internal.v6g.k5.u3(this.k5[0], 14) == var2;
      if (var6) {
         var4 = this.k5[var1 + 1];
      }

      if (var4 == 0.0) {
         var4 = this.n5(var3);
         if (var6) {
            this.k5[var1 + 1] = var4;
         }
      }

      return var4;
   }

   public final int[] n5(int[] var1) {
      int[] var2 = new int[var1.length];

      for (int var3 = 0; var3 < var1.length; var3++) {
         int var4 = com.aspose.slides.internal.z8m.l6.n5(var1[var3]);
         if (var3 < this.l6() && var4 < this.n5) {
            var2[var3] = this.n5()[var3][var4];
         }
      }

      return var2;
   }
}
