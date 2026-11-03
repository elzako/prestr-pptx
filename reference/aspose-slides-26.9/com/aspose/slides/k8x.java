package com.aspose.slides;

class k8x extends com.aspose.slides.internal.v6g.h0<k8x> {
   public float n5;
   public float l6;
   public float k5;
   public static final k8x u3 = new k8x();

   public k8x() {
   }

   public static k8x n5(k8x var0, k8x var1) {
      k8x var2 = new k8x();
      var2.n5 = com.aspose.slides.ms.System.q1.n5((float)(var0.n5), (float)(var1.n5));
      var2.l6 = com.aspose.slides.ms.System.q1.n5((float)(var0.l6), (float)(var1.l6));
      var2.k5 = com.aspose.slides.ms.System.q1.n5((float)(var0.k5), (float)(var1.k5));
      return var2;
   }

   public void n5(k8x var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public k8x n5() {
      k8x var1 = new k8x();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(k8x var1) {
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
         return !(obj instanceof k8x) ? false : this.l6((k8x)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public k8x Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(k8x bridgeArg0) {
      this.n5(bridgeArg0);
   }


   static {
      u3.n5 = 0.0F;
      u3.l6 = 0.0F;
      u3.k5 = 0.0F;
   }
}
