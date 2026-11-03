package com.aspose.slides;

class h3o$l6 extends com.aspose.slides.internal.v6g.h0<h3o$l6> {
   boolean n5;
   boolean l6;

   public h3o$l6() {
   }

   public final boolean n5() {
      return this.n5 || this.l6;
   }

   public void n5(h3o$l6 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public h3o$l6 l6() {
      h3o$l6 var1 = new h3o$l6();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.l6();
   }

   private boolean l6(h3o$l6 var1) {
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
         return !(obj instanceof h3o$l6) ? false : this.l6((h3o$l6)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public h3o$l6 Clone() {
      return this.l6();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(h3o$l6 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
