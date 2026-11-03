package com.aspose.slides;

final class j2n {
   private final int n5;
   private final float l6;
   private final int k5;
   private final float u3;

   public j2n(i2k var1, int var2, float var3) {
      this.n5 = var2;
      this.l6 = var3;
      float var4 = var1.k5().k5() == 0 && !var1.k5().h2() ? var1.n5.n5.h0() : var1.k5().u3(96.0F);
      this.k5 = this.n5 + var1.a6().k5.length();
      this.u3 = this.l6 + var1.a6().k5.length() * var4;
   }

   public j2n(int var1, float var2) {
      this.k5 = this.n5 = var1;
      this.u3 = this.l6 = var2;
   }

   public final int n5() {
      return this.k5;
   }

   public final float l6() {
      return this.u3;
   }
}
