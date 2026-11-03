package com.aspose.slides;

class k2t extends com.aspose.slides.internal.v6g.h0<k2t> {
   public j0t n5 = new j0t();
   public float l6;

   public k2t() {
   }

   public void n5(k2t var1) {
      this.n5.l6(var1.n5);
      var1.l6 = this.l6;
   }

   public k2t n5() {
      k2t var1 = new k2t();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(k2t var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5) && var1.l6 == this.l6;
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
         return !(obj instanceof k2t) ? false : this.l6((k2t)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public k2t Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(k2t bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
