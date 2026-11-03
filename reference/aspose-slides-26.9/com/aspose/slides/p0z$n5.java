package com.aspose.slides;

class p0z$n5 extends com.aspose.slides.internal.v6g.h0<p0z$n5> implements com.aspose.slides.ms.System.a5<p0z$n5> {
   int n5;
   boolean l6;

   public p0z$n5() {
      this.n5 = 0;
      this.l6 = false;
   }

   public final boolean n5(p0z$n5 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6;
   }

   @Override
   public boolean equals(Object obj) {
      return com.aspose.slides.ms.System.j8.l6(null, obj)
         ? false
         : com.aspose.slides.internal.v6g.k5.l6(obj, p0z$n5.class) && this.n5(com.aspose.slides.internal.v6g.k5.u3(obj, p0z$n5.class).n5());
   }

   @Override
   public int hashCode() {
      return this.n5 * 397 ^ com.aspose.slides.ms.System.n3.n5(this.l6);
   }

   p0z$n5(int var1, boolean var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public void l6(p0z$n5 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public p0z$n5 n5() {
      p0z$n5 var1 = new p0z$n5();
      this.l6(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public p0z$n5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(p0z$n5 bridgeArg0) {
      this.l6(bridgeArg0);
   }

}
