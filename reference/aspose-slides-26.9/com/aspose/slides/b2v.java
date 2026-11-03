package com.aspose.slides;

class b2v extends com.aspose.slides.internal.v6g.h0<b2v> {
   public float n5;
   public float l6;

   public b2v() {
   }

   public void n5(b2v var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public b2v n5() {
      b2v var1 = new b2v();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(b2v var1) {
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
         return !(obj instanceof b2v) ? false : this.l6((b2v)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public b2v Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(b2v bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
