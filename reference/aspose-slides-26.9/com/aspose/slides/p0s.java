package com.aspose.slides;

class p0s extends com.aspose.slides.internal.v6g.h0<p0s> {
   double n5;
   float l6;

   public p0s() {
   }

   public p0s(double var1, float var3) {
      this.n5 = var1;
      this.l6 = var3;
   }

   public void n5(p0s var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public p0s n5() {
      p0s var1 = new p0s();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(p0s var1) {
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
         return !(obj instanceof p0s) ? false : this.l6((p0s)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public p0s Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(p0s bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
