package com.aspose.slides;

class f6b$l6 {
   private double n5;
   private double l6;
   private double k5;
   private double u3;
   private double a6;
   private double u9;
   private double h0;
   private k6a c8;
   private k6a t2;

   public final double n5() {
      return this.n5;
   }

   public final void n5(double var1) {
      this.n5 = var1;
   }

   public final double l6() {
      return this.l6;
   }

   public final void l6(double var1) {
      this.l6 = var1;
   }

   public final double k5() {
      return this.u3 * this.k5;
   }

   public final double u3() {
      return this.a6 * this.k5;
   }

   public final double a6() {
      return this.u9 * this.k5;
   }

   public final double u9() {
      return this.h0 * this.k5;
   }

   public final k6a h0() {
      return this.t2;
   }

   public f6b$l6(k6a var1, k6a var2) {
      this.t2 = var2;
      this.c8 = var1;
      this.u3 = var2.c8().h0();
      this.a6 = var2.c8().x8();
      if (var1 != null) {
         this.u9 = var1.c8().h0();
         this.h0 = var1.c8().x8();
      }

      this.k5 = 1.0;
   }

   public final void k5(double var1) {
      this.k5 = var1;
   }

   public final void c8() {
      this.k5 = 1.0;
   }

   public final void t2() {
      double var1 = this.t2.c8().k5(12);
      if (var1 != 0.0) {
         e4c var3 = q3g.n5(var1, this.t2.c8().s7(), this.t2.c8().e2()).u9();
         double var4 = var3.n5 / this.t2.c8().s7() * this.k5;
         double var6 = var3.l6 / this.t2.c8().e2() * this.k5;
         this.t2.n5(var6, 15);
         this.t2.n5(var4, 61);
         if (d5.n5(var3.n5 / this.t2.c8().s7())) {
            this.t2.n5(var4, 32);
            this.t2.n5(var4, 18);
         }

         this.t2.c8().n5(11, this.a6 * var6);
         this.t2.c8().n5(10, this.u3 * var4);
      } else {
         this.t2.n5(this.k5, 61, 15);
         this.t2.c8().n5(11, this.u3());
         this.t2.c8().n5(10, this.k5());
      }

      if (this.c8 != null) {
         this.c8.n5(this.k5, 61, 15);
      }
   }
}
