package com.aspose.slides.internal.n8e;

class n3$n5 extends com.aspose.slides.internal.v6g.h0<n3$n5> {
   public String n5;
   public String l6;

   public n3$n5() {
      this.n5 = null;
      this.l6 = null;
   }

   public n3$n5(String var1, String var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public void n5(n3$n5 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public n3$n5 n5() {
      n3$n5 var1 = new n3$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(n3$n5 var1) {
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
         return !(obj instanceof n3$n5) ? false : this.l6((n3$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n3$n5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(n3$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
