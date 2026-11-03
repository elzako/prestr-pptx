package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.ArgumentException;

public class v2 implements com.aspose.slides.ms.System.v4 {
   private double[] n5;

   public final double n5() {
      return this.n5[0];
   }

   public final void n5(double var1) {
      this.n5[0] = var1;
   }

   public final double l6() {
      return this.n5[1];
   }

   public final void l6(double var1) {
      this.n5[1] = var1;
   }

   public final double k5() {
      return this.n5[2];
   }

   public final void k5(double var1) {
      this.n5[2] = var1;
   }

   public final double u3() {
      return this.n5[3];
   }

   public final void u3(double var1) {
      this.n5[3] = var1;
   }

   public final double a6() {
      return this.n5[4];
   }

   public final void a6(double var1) {
      this.n5[4] = var1;
   }

   public final double u9() {
      return this.n5[5];
   }

   public final void u9(double var1) {
      this.n5[5] = var1;
   }

   public v2() {
      this.n5 = new double[]{1.0, 0.0, 0.0, 1.0, 0.0, 0.0};
   }

   public v2(double[] var1) {
      if (var1.length != 6) {
         throw new ArgumentException();
      }

      this.n5 = var1;
   }

   public final void n5(double var1, double var3, double[] var5, double[] var6) {
      var5[0] = this.n5() * var1 + this.k5() * var3 + this.a6();
      var6[0] = this.l6() * var1 + this.u3() * var3 + this.u9();
   }

   public final v2 n5(v2 var1) {
      v2 var2 = new v2();
      var2.n5(this.n5() * var1.n5() + this.l6() * var1.k5());
      var2.l6(this.n5() * var1.l6() + this.l6() * var1.u3());
      var2.k5(this.k5() * var1.n5() + this.u3() * var1.k5());
      var2.u3(this.k5() * var1.l6() + this.u3() * var1.u3());
      var2.a6(this.a6() * var1.n5() + this.u9() * var1.k5() + var1.a6());
      var2.u9(this.a6() * var1.l6() + this.u9() * var1.u3() + var1.u9());
      return var2;
   }

   @Override
   public final Object deepClone() {
      return new v2(t2.n5(this.n5));
   }
}
