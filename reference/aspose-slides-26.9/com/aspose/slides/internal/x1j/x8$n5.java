package com.aspose.slides.internal.x1j;

final class x8$n5 implements h0 {
   private final float n5;
   private final float l6;
   private final h0 k5;

   public x8$n5(h0 var1, float var2, float var3) {
      this.n5 = var2;
      this.l6 = var3;
      this.k5 = var1;
   }

   @Override
   public void n5(float var1, float var2) {
      this.k5.n5(var1 * this.n5, var2 * this.l6);
   }

   @Override
   public void l6(float var1, float var2) {
      this.k5.l6(var1 * this.n5, var2 * this.l6);
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4) {
      this.k5.n5(var1 * this.n5, var2 * this.l6, var3 * this.n5, var4 * this.l6);
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.k5.n5(var1 * this.n5, var2 * this.l6, var3 * this.n5, var4 * this.l6, var5 * this.n5, var6 * this.l6);
   }

   @Override
   public void n5() {
      this.k5.n5();
   }

   @Override
   public void l6() {
      this.k5.l6();
   }
}
