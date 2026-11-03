package com.aspose.slides;

class d2k extends com.aspose.slides.internal.v6g.h0<d2k> {
   public float n5;
   public float l6;
   public static final d2k k5 = new d2k(0.0F, 0.0F);
   public static final d2k u3 = new d2k(1.0F, 1.0F);

   public d2k() {
   }

   public d2k(float var1, float var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("X:{0}, Y:{1}", this.n5, this.l6);
   }

   public final void n5() {
      float var1 = this.n5;
      this.n5 = this.l6;
      this.l6 = var1;
   }

   public static d2k n5(d2k var0, d2k var1) {
      return new d2k(var0.n5 + var1.n5, var0.l6 + var1.l6);
   }

   public static d2k l6(d2k var0, d2k var1) {
      return new d2k(var0.n5 - var1.n5, var0.l6 - var1.l6);
   }

   public static d2k n5(d2k var0, int var1) {
      return new d2k(var0.n5 / var1, var0.l6 / var1);
   }

   public static d2k n5(d2k var0, float var1) {
      return new d2k(var0.n5 * var1, var0.l6 * var1);
   }

   public static boolean k5(d2k var0, d2k var1) {
      return var0.n5 == var1.n5 && var0.l6 == var1.l6;
   }

   public static boolean u3(d2k var0, d2k var1) {
      return !k5(var0, var1);
   }

   public final e4c l6() {
      return new e4c(this.n5, this.l6);
   }

   public final d2k n5(float var1, float var2) {
      return new d2k(this.n5 * var1, this.l6 * var2);
   }

   public static d2k a6(d2k var0, d2k var1) {
      return new d2k(com.aspose.slides.ms.System.q1.n5((float)(var0.n5), (float)(var1.n5)), com.aspose.slides.ms.System.q1.n5((float)(var0.l6), (float)(var1.l6)));
   }

   public final double k5() {
      return com.aspose.slides.ms.System.q1.z3(this.n5 * this.n5 + this.l6 * this.l6);
   }

   public void n5(d2k var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public d2k u3() {
      d2k var1 = new d2k();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.u3();
   }

   private boolean l6(d2k var1) {
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
         return !(obj instanceof d2k) ? false : this.l6((d2k)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public d2k Clone() {
      return this.u3();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(d2k bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
