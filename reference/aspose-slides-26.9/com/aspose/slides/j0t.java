package com.aspose.slides;

class j0t extends com.aspose.slides.internal.v6g.h0<j0t> {
   public float n5;
   public float l6;
   public float k5;

   public j0t() {
   }

   public final float n5() {
      return this.n5 + this.l6;
   }

   public final j0t n5(j0t var1) {
      j0t var2 = new j0t();
      var2.n5 = com.aspose.slides.ms.System.q1.n5((float)(this.n5), (float)(var1.n5));
      var2.l6 = com.aspose.slides.ms.System.q1.n5((float)(this.l6), (float)(var1.l6));
      var2.k5 = com.aspose.slides.ms.System.q1.n5((float)(this.k5), (float)(var1.k5));
      return var2;
   }

   public void l6(j0t var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public j0t l6() {
      j0t var1 = new j0t();
      this.l6(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.l6();
   }

   private boolean k5(j0t var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5;
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
         return !(obj instanceof j0t) ? false : this.k5((j0t)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public j0t Clone() {
      return this.l6();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(j0t bridgeArg0) {
      this.l6(bridgeArg0);
   }

}
