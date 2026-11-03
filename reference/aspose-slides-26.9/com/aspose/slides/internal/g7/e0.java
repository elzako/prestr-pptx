package com.aspose.slides.internal.g7;

class e0 {
   private boolean n5 = false;
   private h7[] l6;
   private w0 k5;
   private int u3;
   private double[] a6;
   private double[] u9;
   private double[] h0;
   private double[] c8;
   private double t2;
   private double s7;

   public e0(w0 var1) {
      this.k5 = var1;
   }

   public final boolean n5() {
      return this.n5;
   }

   public final h7[] l6() {
      return this.l6;
   }

   public final void k5() {
      this.n5 = true;
      this.u3 = 0;
      this.l6 = new h7[2];
      this.a6 = new double[3];
      this.u9 = new double[3];
      this.h0 = new double[3];
      this.c8 = new double[3];
   }

   public final void u3() {
      this.l6[0] = g0.n5(this.k5, this.u9[0], this.a6[0], this.u9[1], this.a6[1], this.u9[2], this.a6[2]);
      this.l6[1] = g0.n5(this.k5, this.c8[0], this.h0[0], this.c8[1], this.h0[1], this.c8[2], this.h0[2]);
      this.n5 = false;
   }

   public final void n5(double var1, double var3) {
      double var5 = var1;
      double var7 = var3;
      switch (this.u3) {
         case 0:
            this.t2 = var5;
            this.s7 = var7;
            break;
         case 1:
            this.u9[this.u3 - 1] = var5 + this.t2;
            this.a6[this.u3 - 1] = var7 + this.s7;
            break;
         case 2:
         case 3:
            this.u9[this.u3 - 1] = var5;
            this.a6[this.u3 - 1] = var7;
            break;
         case 4:
         case 5:
         case 6:
            this.c8[this.u3 - 4] = var5;
            this.h0[this.u3 - 4] = var7;
      }

      this.u3++;
   }
}
