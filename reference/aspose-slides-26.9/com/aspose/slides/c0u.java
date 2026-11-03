package com.aspose.slides;

class c0u extends com.aspose.slides.internal.v6g.h0<c0u> {
   public static final c0u n5 = new c0u(0.0);
   public double l6;
   public double k5;
   public double u3;
   public double a6;

   public c0u() {
   }

   public c0u(double var1, double var3, double var5, double var7) {
      this.l6 = var1;
      this.k5 = var3;
      this.u3 = var5;
      this.a6 = var7;
   }

   public c0u(double var1) {
      this.l6 = var1;
      this.k5 = var1;
      this.u3 = var1;
      this.a6 = var1;
   }

   public final c0u n5(c0u var1) {
      return new c0u(
         com.aspose.slides.ms.System.d2.k5(this.l6) ? var1.l6 : this.l6,
         com.aspose.slides.ms.System.d2.k5(this.k5) ? var1.k5 : this.k5,
         com.aspose.slides.ms.System.d2.k5(this.u3) ? var1.u3 : this.u3,
         com.aspose.slides.ms.System.d2.k5(this.a6) ? var1.a6 : this.a6
      );
   }

   public static c0u n5(c0u var0, double var1) {
      return new c0u(var0.l6 * var1, var0.k5 * var1, var0.u3 * var1, var0.a6 * var1);
   }

   public static c0u l6(c0u var0, double var1) {
      return new c0u(var0.l6 / var1, var0.k5 / var1, var0.u3 / var1, var0.a6 / var1);
   }

   public static boolean n5(c0u var0, c0u var1) {
      return var0.l6 == var1.l6 && var0.k5 == var1.k5 && var0.u3 == var1.u3 && var0.a6 == var1.a6;
   }

   public static boolean l6(c0u var0, c0u var1) {
      return !n5(var0, var1);
   }

   public final i2h n5() {
      return new i2h((float)this.l6, (float)this.k5, (float)this.u3, (float)this.a6);
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("{0} {1} {2} {3}", this.l6, this.k5, this.u3, this.a6);
   }

   public void l6(c0u var1) {
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
   }

   public c0u l6() {
      c0u var1 = new c0u();
      this.l6(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.l6();
   }

   private boolean k5(c0u var1) {
      return var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3 && var1.a6 == this.a6;
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.l6, this.k5, this.u3, this.a6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof c0u) ? false : this.k5((c0u)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public c0u Clone() {
      return this.l6();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(c0u bridgeArg0) {
      this.l6(bridgeArg0);
   }

}
