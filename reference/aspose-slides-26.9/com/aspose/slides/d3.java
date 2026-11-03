package com.aspose.slides;

class d3 extends com.aspose.slides.internal.v6g.h0<d3> {
   long n5;
   long l6;

   public d3() {
   }

   public void n5(d3 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public d3 n5() {
      d3 var1 = new d3();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(d3 var1) {
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
         return !(obj instanceof d3) ? false : this.l6((d3)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public d3 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(d3 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
