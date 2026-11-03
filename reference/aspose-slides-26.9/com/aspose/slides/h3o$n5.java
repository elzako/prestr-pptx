package com.aspose.slides;

class h3o$n5 extends com.aspose.slides.internal.v6g.h0<h3o$n5> {
   private double n5;
   private double l6;
   private boolean k5;

   public h3o$n5() {
   }

   public final double n5() {
      return this.l6;
   }

   public final double l6() {
      return this.n5;
   }

   public final boolean k5() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   public h3o$n5(double var1, double var3) {
      this.l6 = var1;
      this.n5 = var3;
      this.k5 = false;
   }

   public void n5(h3o$n5 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public h3o$n5 u3() {
      h3o$n5 var1 = new h3o$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.u3();
   }

   private boolean l6(h3o$n5 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5;
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6, this.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof h3o$n5) ? false : this.l6((h3o$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public h3o$n5 Clone() {
      return this.u3();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(h3o$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
