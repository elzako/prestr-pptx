package com.aspose.slides.internal.b7;

final class a7 extends d8 {
   private k0 n5 = new k0();
   private k0 l6 = new k0();
   private k0 k5 = new k0();

   public final void n5(k0 var1) {
      var1.n5(this.n5);
   }

   public final void l6(k0 var1) {
      var1.n5(this.l6);
   }

   public final void k5(k0 var1) {
      var1.n5(this.k5);
   }

   public a7(k0 var1, k0 var2, k0 var3) {
      this.n5(var1.u3());
      this.l6(var2.u3());
      this.k5(var3.u3());
   }

   @Override
   public d8 n5() {
      return new a7(this.n5.u3(), this.l6.u3(), this.k5.u3());
   }

   @Override
   k0 n5(n7 var1, k0 var2) {
      var1.n5(var2.k5().u3(), this.n5.k5().u3(), this.l6.k5().u3(), this.k5.k5().u3());
      return this.k5;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public d8 cloneT() {
      return this.n5();
   }

}
