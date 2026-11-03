package com.aspose.slides;

class m7f extends com.aspose.slides.internal.v6g.h0<m7f> {
   public y6e n5;
   public float l6;

   public m7f() {
   }

   public m7f(y6e var1, float var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public void n5(m7f var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public m7f n5() {
      m7f var1 = new m7f();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(m7f var1) {
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
         return !(obj instanceof m7f) ? false : this.l6((m7f)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public m7f Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(m7f bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
