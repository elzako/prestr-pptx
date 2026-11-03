package com.aspose.slides;

class i2h extends com.aspose.slides.internal.v6g.h0<i2h> {
   public static final i2h n5 = new i2h(0.0F, 0.0F, 0.0F, 0.0F);
   public float l6;
   public float k5;
   public float u3;
   public float a6;

   public i2h() {
   }

   public i2h(d2k var1, d2k var2) {
      this.l6 = var1.n5;
      this.k5 = var1.l6;
      this.u3 = var2.n5;
      this.a6 = var2.l6;
   }

   public i2h(float var1, float var2, float var3, float var4) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
      this.a6 = var4;
   }

   public final i2h n5(i2h var1) {
      return new i2h(
         com.aspose.slides.ms.System.n1.k5(this.l6) ? var1.l6 : this.l6,
         com.aspose.slides.ms.System.n1.k5(this.k5) ? var1.k5 : this.k5,
         com.aspose.slides.ms.System.n1.k5(this.u3) ? var1.u3 : this.u3,
         com.aspose.slides.ms.System.n1.k5(this.a6) ? var1.a6 : this.a6
      );
   }

   public static i2h n5(i2h var0, float var1) {
      return new i2h(var0.l6 * var1, var0.k5 * var1, var0.u3 * var1, var0.a6 * var1);
   }

   public final c0u n5() {
      return new c0u(this.l6, this.k5, this.u3, this.a6);
   }

   public final boolean l6() {
      return !com.aspose.slides.ms.System.n1.k5(this.l6)
         && !com.aspose.slides.ms.System.n1.k5(this.k5)
         && !com.aspose.slides.ms.System.n1.k5(this.u3)
         && !com.aspose.slides.ms.System.n1.k5(this.a6);
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("{0} {1} {2} {3}", this.l6, this.k5, this.u3, this.a6);
   }

   public void l6(i2h var1) {
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
   }

   public i2h k5() {
      i2h var1 = new i2h();
      this.l6(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   private boolean k5(i2h var1) {
      return var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3 && var1.a6 == this.a6;
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.l6, this.k5, this.u3, this.a6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof i2h) ? false : this.k5((i2h)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public i2h Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(i2h bridgeArg0) {
      this.l6(bridgeArg0);
   }

}
