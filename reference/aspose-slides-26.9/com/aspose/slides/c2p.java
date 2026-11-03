package com.aspose.slides;

class c2p extends com.aspose.slides.internal.v6g.h0<c2p> {
   public c7n n5 = new c7n();
   public g6h l6 = new g6h();

   public c2p() {
   }

   public void n5(c2p var1) {
      this.n5.n5(var1.n5);
      this.l6.n5(var1.l6);
   }

   public c2p n5() {
      c2p var1 = new c2p();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(c2p var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5) && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6);
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
         return !(obj instanceof c2p) ? false : this.l6((c2p)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public c2p Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(c2p bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
