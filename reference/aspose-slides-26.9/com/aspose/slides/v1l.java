package com.aspose.slides;

class v1l extends com.aspose.slides.internal.v6g.h0<v1l> {
   public e3 n5;
   public com.aspose.slides.internal.o9b.u3 l6;

   public v1l() {
   }

   public void n5(v1l var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public v1l n5() {
      v1l var1 = new v1l();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(v1l var1) {
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
         return !(obj instanceof v1l) ? false : this.l6((v1l)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public v1l Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(v1l bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
