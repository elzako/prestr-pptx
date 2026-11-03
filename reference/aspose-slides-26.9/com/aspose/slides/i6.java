package com.aspose.slides;

class i6 extends com.aspose.slides.internal.v6g.h0<i6> {
   public float n5;
   public float l6;
   public static final i6 k5 = new i6();

   public i6() {
   }

   public i6(float var1, float var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public void n5(i6 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public i6 n5() {
      i6 var1 = new i6();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(i6 var1) {
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
         return !(obj instanceof i6) ? false : this.l6((i6)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public i6 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(i6 bridgeArg0) {
      this.n5(bridgeArg0);
   }


   static {
      k5.n5 = 0.0F;
      k5.l6 = 0.0F;
   }
}
