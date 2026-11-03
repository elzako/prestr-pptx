package com.aspose.slides;

class y1m extends com.aspose.slides.internal.v6g.h0<y1m> {
   public float n5;
   public n3y l6 = new n3y();

   public y1m() {
   }

   public void n5(y1m var1) {
      var1.n5 = this.n5;
      this.l6.n5(var1.l6);
   }

   public y1m n5() {
      y1m var1 = new y1m();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(y1m var1) {
      return var1.n5 == this.n5 && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6);
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
         return !(obj instanceof y1m) ? false : this.l6((y1m)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public y1m Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(y1m bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
