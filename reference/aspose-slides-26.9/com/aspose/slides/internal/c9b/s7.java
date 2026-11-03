package com.aspose.slides.internal.c9b;

import java.io.Serializable;

final class s7 implements Serializable, Cloneable {
   private final double[][] n5;
   private final int l6;
   private final int k5;

   public s7(int var1, int var2) {
      this.l6 = var1;
      this.k5 = var2;
      this.n5 = new double[var1][var2];
   }

   public s7(double[][] var1) {
      this.l6 = var1.length;
      this.k5 = var1[0].length;

      for (int var2 = 0; var2 < this.l6; var2++) {
         if (var1[var2].length != this.k5) {
            throw new IllegalArgumentException("All rows must have the same length.");
         }
      }

      this.n5 = var1;
   }

   public s7 n5() {
      s7 var1 = new s7(this.l6, this.k5);
      double[][] var2 = var1.l6();

      for (int var3 = 0; var3 < this.l6; var3++) {
         if (this.k5 >= 0) {
            System.arraycopy(this.n5[var3], 0, var2[var3], 0, this.k5);
         }
      }

      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   public double[][] l6() {
      return this.n5;
   }

   public double[][] k5() {
      double[][] var1 = new double[this.l6][this.k5];

      for (int var2 = 0; var2 < this.l6; var2++) {
         System.arraycopy(this.n5[var2], 0, var1[var2], 0, this.k5);
      }

      return var1;
   }

   public int u3() {
      return this.l6;
   }

   public int a6() {
      return this.k5;
   }
}
