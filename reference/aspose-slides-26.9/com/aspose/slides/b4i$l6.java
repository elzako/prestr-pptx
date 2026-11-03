package com.aspose.slides;

class b4i$l6 extends com.aspose.slides.internal.v6g.h0<b4i$l6> {
   public b4i$n5 n5;
   public b4i$n5 l6;
   public float k5;
   public float u3;

   public b4i$l6() {
   }

   public void n5(b4i$l6 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
   }

   public b4i$l6 n5() {
      b4i$l6 var1 = new b4i$l6();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(b4i$l6 var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5)
         && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6)
         && var1.k5 == this.k5
         && var1.u3 == this.u3;
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
         return !(obj instanceof b4i$l6) ? false : this.l6((b4i$l6)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public b4i$l6 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(b4i$l6 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
