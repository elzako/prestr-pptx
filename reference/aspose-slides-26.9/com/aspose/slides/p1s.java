package com.aspose.slides;

class p1s extends com.aspose.slides.internal.v6g.h0<p1s> {
   public long n5;
   public ColorFormat l6;
   public r0s k5;

   public p1s() {
   }

   public void n5(p1s var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public p1s n5() {
      p1s var1 = new p1s();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(p1s var1) {
      return var1.n5 == this.n5 && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6) && com.aspose.slides.ms.System.j8.n5(var1.k5, this.k5);
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6, this.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof p1s) ? false : this.l6((p1s)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public p1s Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(p1s bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
