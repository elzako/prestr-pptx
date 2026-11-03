package com.aspose.slides.internal.b7;

class k4s extends m6n {
   private t5g n5;
   private double l6;
   private final double k5;
   private double u3;
   private final double a6;
   private final double u9;
   private double h0;

   public k4s(double var1, double var3, double var5) {
      this.k5 = var1;
      this.a6 = var3;
      this.u9 = var5;
      this.l6 = 0.0;
      this.u3 = 0.0;
      this.h0 = this.a6 + this.k5;
   }

   public final t5g n5() {
      return this.n5;
   }

   public final void n5(t5g var1) {
      this.t2();
      this.l6(var1);
   }

   @Override
   public j6 k5() {
      return new j6(this.a6 + this.k5 + this.h0 + this.u9, this.l6);
   }

   public final void n5(x6s var1) {
      var1.l6();
      this.n5((k1d)var1);
      var1.n5(new w9(this.h0, var1.u3().l6()));
      this.h0 = this.h0 + var1.k5().n5();
      this.c8();
      this.l6();
   }

   private void l6() {
      double var1 = this.u3 * a6();
      k1d[] var3 = this.u9();

      for (k1d var7 : var3) {
         var7.n5(new w9(var7.u3().n5(), this.l6));
      }

      if (null != this.n5) {
         this.n5.n5(new w9(this.n5.u3().n5(), this.l6));
      }
   }

   private void c8() {
      this.l6 = 0.0;
      this.u3 = 0.0;
      k1d[] var1 = this.u9();

      for (k1d var5 : var1) {
         x6s var6 = (x6s)var5;
         j6 var7 = var6.k5();
         if (var7.l6() > this.l6) {
            this.l6 = var6.k5().l6();
         }

         if (var6.n5().h0() > this.u3) {
            this.u3 = var6.n5().h0();
         }
      }
   }

   private void t2() {
      k1d[] var1 = this.u9();
      if (null != this.n5) {
         this.h0 = this.a6 + this.k5;

         for (k1d var5 : var1) {
            var5.n5(new w9(this.h0, var5.u3().l6()));
            j6 var6 = var5.k5();
            this.h0 = this.h0 + var6.n5();
         }
      }
   }

   private void l6(t5g var1) {
      k1d[] var2 = this.u9();
      this.n5 = var1;
      if (null != this.n5) {
         this.h0 = this.a6 + this.k5;
         this.n5.n5(new w9(this.h0, this.n5.u3().l6()));
         if (com.aspose.slides.internal.v6g.k5.l6(this.n5, w4w.class)) {
            this.h0 = this.a6;
         } else {
            this.h0 = this.h0 + this.n5.k5().n5();
         }

         for (k1d var6 : var2) {
            var6.n5(new w9(this.h0, var6.u3().l6()));
            this.h0 = this.h0 + var6.k5().n5();
         }

         this.l6();
      }
   }
}
