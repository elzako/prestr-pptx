package com.aspose.slides;

import com.aspose.slides.exceptions.DivideByZeroException;

class e4c extends com.aspose.slides.internal.v6g.h0<e4c> {
   public double n5;
   public double l6;
   public static final e4c k5 = new e4c(0.0, 0.0);
   public static final e4c u3 = new e4c(1.0, 1.0);

   public e4c() {
   }

   public e4c(double var1, double var3) {
      this.n5 = var1;
      this.l6 = var3;
   }

   public e4c(com.aspose.slides.internal.o9b.w1 var1) {
      this.n5 = var1.l6();
      this.l6 = var1.k5();
   }

   public final e4c n5() {
      return new e4c(-this.l6, this.n5);
   }

   public final double l6() {
      return com.aspose.slides.ms.System.q1.z3(this.n5 * this.n5 + this.l6 * this.l6);
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("X:{0}, Y:{1}", this.n5, this.l6);
   }

   public static e4c n5(e4c var0, e4c var1) {
      return new e4c(var0.n5 + var1.n5, var0.l6 + var1.l6);
   }

   public static e4c l6(e4c var0, e4c var1) {
      return new e4c(var0.n5 - var1.n5, var0.l6 - var1.l6);
   }

   public static e4c n5(e4c var0, int var1) {
      return new e4c(var0.n5 / var1, var0.l6 / var1);
   }

   public static e4c n5(e4c var0, double var1) {
      return new e4c(var0.n5 / var1, var0.l6 / var1);
   }

   public static e4c l6(e4c var0, int var1) {
      return new e4c(var0.n5 * var1, var0.l6 * var1);
   }

   public static e4c l6(e4c var0, double var1) {
      return new e4c(var0.n5 * var1, var0.l6 * var1);
   }

   public static boolean k5(e4c var0, e4c var1) {
      return var0.n5 == var1.n5 && var0.l6 == var1.l6;
   }

   public static boolean u3(e4c var0, e4c var1) {
      return !k5(var0, var1);
   }

   public final void k5() {
      double var1 = this.n5;
      this.n5 = this.l6;
      this.l6 = var1;
   }

   public final double n5(e4c var1) {
      return this.n5 * var1.n5 + this.l6 * var1.l6;
   }

   public final e4c u3() {
      if (this.l6() < 1.0E-6) {
         throw new DivideByZeroException();
      } else {
         return n5(this, this.l6());
      }
   }

   public final d2k a6() {
      return new d2k((float)this.n5, (float)this.l6);
   }

   public void l6(e4c var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public e4c u9() {
      e4c var1 = new e4c();
      this.l6(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.u9();
   }

   private boolean k5(e4c var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6;
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof e4c) ? false : this.k5((e4c)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public e4c Clone() {
      return this.u9();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(e4c bridgeArg0) {
      this.l6(bridgeArg0);
   }

}
