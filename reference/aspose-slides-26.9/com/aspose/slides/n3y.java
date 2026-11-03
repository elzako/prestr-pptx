package com.aspose.slides;

class n3y extends com.aspose.slides.internal.v6g.h0<n3y> {
   public float n5;
   public float l6;

   public n3y() {
   }

   public n3y(float var1, float var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final float n5() {
      return this.n5 + this.l6;
   }

   public static n3y n5(n3y var0, n3y var1) {
      n3y var2 = new n3y();
      var2.n5 = com.aspose.slides.ms.System.q1.n5((float)(var0.n5), (float)(var1.n5));
      var2.l6 = com.aspose.slides.ms.System.q1.n5((float)(var0.l6), (float)(var1.l6));
      return var2;
   }

   public static n3y n5(n3y var0, float var1, float var2, float[] var3) {
      float var4 = var1 + var2;
      if (var2 >= 0.0F) {
         var3[0] = 0.0F;
         n3y var7 = new n3y();
         var7.n5 = var0.n5;
         var7.l6 = com.aspose.slides.ms.System.q1.n5((float)(var0.n5()), (float)(var4)) - var0.n5;
         return var7;
      } else {
         var3[0] = -var2;
         float var5 = var0.n5 + var3[0];
         n3y var6 = new n3y();
         var6.n5 = var5;
         var6.l6 = com.aspose.slides.ms.System.q1.n5((float)(var0.n5()), (float)(var4)) - var5;
         return var6;
      }
   }

   public void n5(n3y var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public n3y l6() {
      n3y var1 = new n3y();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.l6();
   }

   private boolean l6(n3y var1) {
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
         return !(obj instanceof n3y) ? false : this.l6((n3y)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n3y Clone() {
      return this.l6();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(n3y bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
