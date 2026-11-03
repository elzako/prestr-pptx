package com.aspose.slides;

class q2z extends com.aspose.slides.internal.v6g.h0<q2z> {
   private int n5;
   private String l6;

   public q2z() {
      this.n5 = 0;
      this.l6 = null;
   }

   public final int n5() {
      return this.n5;
   }

   public final String l6() {
      return this.l6;
   }

   public q2z(int var1, String var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public void n5(q2z var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public q2z k5() {
      q2z var1 = new q2z();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   private boolean l6(q2z var1) {
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
         return !(obj instanceof q2z) ? false : this.l6((q2z)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public q2z Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(q2z bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
