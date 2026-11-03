package com.aspose.slides;

class q5b extends com.aspose.slides.internal.v6g.h0<q5b> {
   public String n5;
   public int l6;

   public q5b() {
   }

   public void n5(q5b var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public q5b n5() {
      q5b var1 = new q5b();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(q5b var1) {
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
         return !(obj instanceof q5b) ? false : this.l6((q5b)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public q5b Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(q5b bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
