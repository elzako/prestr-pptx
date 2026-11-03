package com.aspose.slides.internal.c4t;

import java.security.InvalidParameterException;

public final class x8 {
   public double[][] n5;
   public double[] l6;

   public x8(int var1) {
      if (var1 < 0) {
         throw new InvalidParameterException("number must be greater than zero");
      }

      this.n5 = new double[var1][];

      for (int var2 = 0; var2 < var1; var2++) {
         this.n5[var2] = new double[var1];
      }

      this.l6 = new double[var1];
   }

   public void n5() throws com.aspose.slides.internal.p7x.n5 {
      int var1 = this.n5.length;

      for (int var2 = 0; var2 < var1; var2++) {
         int var3 = var2;
         double var4 = Math.abs(this.n5[var2][var2]);

         for (int var6 = var2 + 1; var6 < var1; var6++) {
            if (Math.abs(this.n5[var6][var2]) > var4) {
               var4 = Math.abs(this.n5[var6][var2]);
               var3 = var6;
            }
         }

         if (var4 < 1.0E-6) {
            throw new com.aspose.slides.internal.p7x.n5();
         }

         this.n5(var2, var3);

         for (int var12 = var2 + 1; var12 < var1; var12++) {
            this.n5[var2][var12] = this.n5[var2][var12] / this.n5[var2][var2];
         }

         this.l6[var2] = this.l6[var2] / this.n5[var2][var2];
         this.n5[var2][var2] = 1.0;

         for (int var13 = var2 + 1; var13 < var1; var13++) {
            double var7 = this.n5[var13][var2];

            for (int var9 = var2; var9 < var1; var9++) {
               this.n5[var13][var9] = this.n5[var13][var9] - this.n5[var2][var9] * this.n5[var13][var2];
            }

            this.l6[var13] = this.l6[var13] - this.l6[var2] * var7;
         }
      }

      for (int var10 = var1 - 1; var10 >= 0; var10--) {
         for (int var11 = var10 - 1; var11 >= 0; var11--) {
            this.l6[var11] = this.l6[var11] - this.l6[var10] * this.n5[var11][var10];
            this.n5[var11][var10] = 0.0;
         }
      }
   }

   void n5(int var1, int var2) {
      double[] var3 = this.n5[var1];
      double var4 = this.l6[var1];
      this.n5[var1] = this.n5[var2];
      this.l6[var1] = this.l6[var2];
      this.n5[var2] = var3;
      this.l6[var2] = var4;
   }
}
