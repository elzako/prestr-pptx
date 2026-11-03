package com.aspose.slides.internal.b7;

final class k7 extends d8 {
   private double n5;
   private double l6;
   private double k5;
   private double u3;

   public final void n5(double var1) {
      this.l6 = var1;
   }

   public final void l6(double var1) {
      this.n5 = var1;
   }

   public final void k5(double var1) {
      this.k5 = var1;
   }

   public final void u3(double var1) {
      this.u3 = var1;
   }

   public k7(double var1, double var3, double var5, double var7) {
      this.k5(var5);
      this.l6(var3);
      this.n5(var1);
      this.u3(var7);
   }

   @Override
   public d8 n5() {
      return new k7(this.l6, this.n5, this.k5, this.u3);
   }

   @Override
   k0 n5(n7 var1, k0 var2) {
      if (this.l6 == 0.0 && this.n5 == 0.0) {
         return new k0(var2.n5(), var2.l6());
      }

      com.aspose.slides.internal.o9b.w1 var3 = var1.n5(var2.n5(), var2.l6(), this.l6, this.n5, this.k5 / 60000.0, this.u3 / 60000.0).u3();
      return new k0(var3.l6(), var3.k5());
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public d8 cloneT() {
      return this.n5();
   }

}
