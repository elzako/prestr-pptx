package com.aspose.slides.internal.g7;

class z2 {
   private double[] n5;
   private int l6;
   private int[] k5;
   private int u3;
   private String[] a6 = new String[10];
   private int u9;
   private int[] h0;
   private int c8;

   public z2() {
      this.n5 = new double[100];
      this.k5 = new int[100];
      this.h0 = new int[100];
      this.l6();
   }

   public final int n5() {
      return this.c8 + 1;
   }

   public final void l6() {
      this.l6 = -1;
      this.u3 = -1;
      this.u9 = -1;
      this.c8 = -1;
   }

   public final void n5(double var1) {
      this.h0();
      this.c8++;
      this.l6++;
      this.n5[this.l6] = var1;
      this.h0[this.c8] = 2;
   }

   public final int k5() {
      return this.h0[this.c8];
   }

   public final double u3() {
      switch (this.k5()) {
         case 0:
         default:
            throw new h4("Unexpected PS object type in PS program.");
         case 1:
            return this.a6();
         case 2:
            return this.u9();
      }
   }

   public final double n5(int var1) {
      switch (this.k5()) {
         case 0:
         default:
            throw new h4("Unexpected PS object type in PS program.");
         case 1:
            return this.k5[this.u3 - var1];
         case 2:
            return this.n5[this.l6 - var1];
      }
   }

   public final int a6() {
      this.c8--;
      return this.k5[this.u3--];
   }

   public final double u9() {
      this.c8--;
      return this.n5[this.l6--];
   }

   private void h0() {
      if (this.l6 + 1 >= this.n5.length) {
         double[] var1 = new double[this.n5.length * 2];
         System.arraycopy(this.n5, 0, var1, 0, this.n5.length);
         this.n5 = var1;
         this.l6(this.n5.length);
      }
   }

   private void l6(int var1) {
      if (var1 > this.h0.length) {
         int[] var2 = new int[var1];
         System.arraycopy(this.h0, 0, var2, 0, this.h0.length);
         this.h0 = var2;
      }
   }
}
