package com.aspose.slides.internal.b7;

public final class b7 extends k2 {
   private double n5;
   private boolean l6;

   public b7() {
      super(0);
      this.n5 = 0.0;
      this.l6 = false;
   }

   public b7(double var1, boolean var3) {
      super(0);
      this.n5 = var1;
      this.l6 = var3;
   }

   public final double u9() {
      return this.n5;
   }

   public final boolean h0() {
      return this.l6;
   }

   @Override
   public n9 n5() {
      b7 var1 = new b7(this.u9(), this.h0());
      this.n5(var1);
      return var1;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n9 cloneT() {
      return this.n5();
   }

}
