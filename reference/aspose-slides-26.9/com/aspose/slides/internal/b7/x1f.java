package com.aspose.slides.internal.b7;

class x1f extends o3i {
   private k0 n5 = new k0();
   private k0 l6 = new k0();
   private double k5;

   @Override
   public double n5() {
      return this.k5;
   }

   @Override
   public o3i l6() {
      return new x1f(this.n5.u3(), this.l6.u3());
   }

   @Override
   public o3i n5(double var1) {
      v2 var3 = v2.n5(k0.n5(this.n5, this.l6).a6(), var1).u9();
      return new x1f(v2.n5(this.n5, var3).u3(), v2.n5(this.l6, var3).u3());
   }

   @Override
   public k0 l6(double var1) {
      double var3 = this.n5.n5() + (this.l6.n5() - this.n5.n5()) * var1;
      double var5 = this.n5.l6() + (this.l6.l6() - this.n5.l6()) * var1;
      return new k0(var3, var5);
   }

   @Override
   public v2 n5(double var1, double var3, boolean var5) {
      v2 var6 = k0.n5(this.n5, this.l6).u9();
      var6.u3().k5(var6);
      return var5 ? new v2(-var6.l6() * var3, var6.n5() * var3) : new v2(var6.l6() * var3, -var6.n5() * var3);
   }

   public x1f(k0 var1, k0 var2) {
      var1.n5(this.n5);
      var2.n5(this.l6);
      this.k5 = this.n5(this.n5.u3(), this.l6.u3());
   }

   private double n5(k0 var1, k0 var2) {
      double var3 = var1.n5() - var2.n5();
      double var5 = var1.l6() - var2.l6();
      return com.aspose.slides.ms.System.q1.z3(var3 * var3 + var5 * var5);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public o3i cloneT() {
      return this.l6();
   }

}
