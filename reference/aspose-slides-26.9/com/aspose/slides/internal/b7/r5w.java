package com.aspose.slides.internal.b7;

final class r5w extends m6n {
   private final o9 n5;
   private double l6;
   private final w1n k5;
   private double u3;

   public r5w(o9 var1, w1n var2) {
      this.n5 = var1;
      this.k5 = var2;
      this.l6 = 0.0;
      this.u3 = 0.0;
   }

   @Override
   public j6 k5() {
      return new j6(this.u3, this.l6);
   }

   public final k4s n5() {
      int var1 = this.n5.c8() != null ? this.n5.c8().n5() + 1 : 1;
      double var2 = this.n5.t2() != null ? this.n5.t2().n5() : 347663 * var1;
      double var4 = this.n5.s7() != null ? this.n5.s7().n5() : 0.0;
      double var6 = 0.0;
      if (this.h0() == 0) {
         var6 = this.n5.h0() != null ? this.n5.h0().n5() : -342900.0;
      }

      return new k4s(var6, var2, var4);
   }

   public final void n5(k4s var1) {
      var1.n5(new w9(0.0, this.l6));
      this.n5((k1d)var1);
      this.l6 = this.l6 + var1.k5().l6();
      this.l6();
   }

   private void l6() {
      this.u3 = 0.0;
      k1d[] var1 = this.u9();

      for (k1d var5 : var1) {
         if (var5.k5().n5() > this.u3) {
            this.u3 = var5.k5().n5();
         }
      }
   }
}
