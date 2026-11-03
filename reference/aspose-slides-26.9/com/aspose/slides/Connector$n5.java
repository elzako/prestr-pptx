package com.aspose.slides;

class Connector$n5 extends com.aspose.slides.internal.v6g.h0<Connector$n5> {
   boolean n5;
   boolean l6;

   public Connector$n5() {
   }

   public void n5(Connector$n5 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public Connector$n5 n5() {
      Connector$n5 var1 = new Connector$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(Connector$n5 var1) {
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
         return !(obj instanceof Connector$n5) ? false : this.l6((Connector$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public Connector$n5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(Connector$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
