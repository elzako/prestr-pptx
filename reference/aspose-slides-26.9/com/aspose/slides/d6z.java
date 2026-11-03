package com.aspose.slides;

class d6z extends com.aspose.slides.internal.v6g.h0<d6z> {
   public d2k n5 = new d2k();
   public float l6;
   public boolean k5;
   public boolean u3;

   public d6z() {
   }

   public void n5(d6z var1) {
      this.n5.n5(var1.n5);
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
   }

   public d6z n5() {
      d6z var1 = new d6z();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(d6z var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5) && var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3;
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6, this.k5, this.u3);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof d6z) ? false : this.l6((d6z)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public d6z Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(d6z bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
