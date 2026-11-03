package com.aspose.slides.internal.p3;

public class t4$n5 {
   private double[] n5 = new double[4];
   private t4$k5[] l6 = new t4$k5[4];
   private double[] k5 = new double[4];
   private int[] u3 = new int[4];
   private int[] a6 = new int[4];
   private int[] u9 = new int[4];
   private int h0 = -1;

   public t4$n5() {
      this.k5();
   }

   public void n5(double var1, t4$k5 var3, double var4, int var6, int var7, int var8, int var9) {
      if (var1 > this.n5[var9]) {
      }

      this.n5[var9] = var1;
      this.l6[var9] = var3;
      this.k5[var9] = var4;
      this.a6[var9] = var6;
      this.u9[var9] = var7;
      this.u3[var9] = var8;
      if (this.h0 == -1 || var1 < this.n5[this.h0]) {
         this.h0 = var9;
      }
   }

   public final boolean n5() {
      return this.h0 != -1;
   }

   public final boolean n5(int var1) {
      return this.n5[var1] != Double.POSITIVE_INFINITY;
   }

   public final double l6(int var1) {
      return this.n5[var1];
   }

   public final t4$k5 k5(int var1) {
      return this.l6[var1];
   }

   public final double u3(int var1) {
      return this.k5[var1];
   }

   public final int a6(int var1) {
      return this.a6[var1];
   }

   public final int u9(int var1) {
      return this.u9[var1];
   }

   public final int h0(int var1) {
      return this.u3[var1];
   }

   public final double l6() {
      return this.h0 != -1 ? this.l6(this.h0) : Double.POSITIVE_INFINITY;
   }

   public final void k5() {
      for (int var1 = 0; var1 < 4; var1++) {
         this.n5[var1] = Double.POSITIVE_INFINITY;
      }

      this.h0 = -1;
   }
}
