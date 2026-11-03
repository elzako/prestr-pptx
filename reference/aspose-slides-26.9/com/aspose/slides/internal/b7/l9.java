package com.aspose.slides.internal.b7;

final class l9 extends d8 {
   private k0 n5 = new k0();
   private k0 l6 = new k0();

   public final void n5(k0 var1) {
      var1.n5(this.n5);
   }

   public final void l6(k0 var1) {
      var1.n5(this.l6);
   }

   public l9(k0 var1, k0 var2) {
      this.n5(var1.u3());
      this.l6(var2.u3());
   }

   @Override
   public d8 n5() {
      return new l9(this.n5.u3(), this.l6.u3());
   }

   @Override
   k0 n5(n7 var1, k0 var2) {
      double var3 = this.n5.n5() - var2.n5();
      double var5 = this.n5.l6() - var2.l6();
      double var7 = this.l6.n5() - var2.n5();
      double var9 = this.l6.l6() - var2.l6();
      double var11 = var3 * 2.0 / 3.0;
      double var13 = var5 * 2.0 / 3.0;
      double var15 = var11 + var7 / 3.0;
      double var17 = var13 + var9 / 3.0;
      k0 var19 = new k0(var2.n5() + var11, var2.l6() + var13);
      k0 var20 = new k0(var2.n5() + var15, var2.l6() + var17);
      var1.n5(var2.k5().u3(), var19.k5().u3(), var20.k5().u3(), this.l6.k5().u3());
      return this.l6;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public d8 cloneT() {
      return this.n5();
   }

}
