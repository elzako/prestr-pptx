package com.aspose.slides;

class g5x$k5$n5 extends com.aspose.slides.internal.v6g.h0<g5x$k5$n5> {
   int n5;
   com.aspose.slides.internal.k0r.k6 l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9(
      "horz", "vert", "vert270", "wordArtVert", "eaVert", "mongolianVert", "wordArtVertRtl"
   );

   public g5x$k5$n5() {
   }

   public void n5(g5x$k5$n5 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public g5x$k5$n5 n5() {
      g5x$k5$n5 var1 = new g5x$k5$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(g5x$k5$n5 var1) {
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
         return !(obj instanceof g5x$k5$n5) ? false : this.l6((g5x$k5$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public g5x$k5$n5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(g5x$k5$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
