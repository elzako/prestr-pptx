package com.aspose.slides.internal.x1j;

final class x8$u3 implements h0 {
   private final h0 n5;
   private final float l6;
   private final float k5;
   private final float u3;
   private final float a6;
   private final float u9;
   private final float h0;

   x8$u3(h0 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
      this.u9 = var6;
      this.h0 = var7;
   }

   @Override
   public void n5(float var1, float var2) {
      this.n5.n5(var1 * this.l6 + var2 * this.k5 + this.u3, var1 * this.a6 + var2 * this.u9 + this.h0);
   }

   @Override
   public void l6(float var1, float var2) {
      this.n5.l6(var1 * this.l6 + var2 * this.k5 + this.u3, var1 * this.a6 + var2 * this.u9 + this.h0);
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4) {
      this.n5
         .n5(
            var1 * this.l6 + var2 * this.k5 + this.u3,
            var1 * this.a6 + var2 * this.u9 + this.h0,
            var3 * this.l6 + var4 * this.k5 + this.u3,
            var3 * this.a6 + var4 * this.u9 + this.h0
         );
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.n5
         .n5(
            var1 * this.l6 + var2 * this.k5 + this.u3,
            var1 * this.a6 + var2 * this.u9 + this.h0,
            var3 * this.l6 + var4 * this.k5 + this.u3,
            var3 * this.a6 + var4 * this.u9 + this.h0,
            var5 * this.l6 + var6 * this.k5 + this.u3,
            var5 * this.a6 + var6 * this.u9 + this.h0
         );
   }

   @Override
   public void n5() {
      this.n5.n5();
   }

   @Override
   public void l6() {
      this.n5.l6();
   }
}
