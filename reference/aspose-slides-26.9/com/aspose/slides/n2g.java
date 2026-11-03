package com.aspose.slides;

class n2g extends com.aspose.slides.internal.v6g.h0<n2g> {
   public d2k n5 = new d2k();
   public d2k l6 = new d2k();
   public float k5;
   public float u3;
   public boolean a6;

   public n2g() {
   }

   public void n5(n2g var1) {
      this.n5.n5(var1.n5);
      this.l6.n5(var1.l6);
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
   }

   public n2g n5() {
      n2g var1 = new n2g();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6, this.k5, this.u3, this.a6);
   }

   private boolean l6(n2g var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5)
         && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6)
         && var1.k5 == this.k5
         && var1.u3 == this.u3
         && var1.a6 == this.a6;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof n2g) ? false : this.l6((n2g)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n2g Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(n2g bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
