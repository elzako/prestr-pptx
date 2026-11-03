package com.aspose.slides;

class r0m {
   private l6v n5;
   private l6v l6;
   private boolean k5;

   public final l6v n5() {
      return this.n5;
   }

   public final void n5(l6v var1) {
      this.n5 = var1;
   }

   public final l6v l6() {
      return this.l6;
   }

   public final void l6(l6v var1) {
      this.l6 = var1;
   }

   public final boolean k5() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   public final boolean u3() {
      return this.n5() != null && this.n5().t2() || this.l6() != null && this.l6().t2();
   }

   public final float a6() {
      return this.n5(1.0F);
   }

   public final float n5(float var1) {
      if (!this.k5()) {
         return 0.0F;
      }

      float var2 = 0.0F;
      if (this.n5() != null && this.n5().t2()) {
         var2 += (float)this.n5().n5() * var1;
      }

      return var2;
   }

   private float u9() {
      return this.k5() ? 1.5F : 0.6666667F;
   }

   public final com.aspose.slides.internal.o9b.m3 l6(float var1) {
      com.aspose.slides.internal.o9b.m3 var2 = null;
      if (this.n5() != null && this.n5().t2()) {
         var2 = this.n5().l6(72.0F);
         var2.k5(var2.q0() * var1);
         var2.u9(this.k5() ? 0 : 2);
      }

      return var2;
   }

   public final com.aspose.slides.internal.o9b.m3 k5(float var1) {
      com.aspose.slides.internal.o9b.m3 var2 = null;
      if (this.l6() != null && this.l6().t2()) {
         if (this.k5() && this.n5() != null && this.n5().t2() && this.n5().n5() > 0.0) {
            float var3 = (float)this.l6().n5() * this.u9();
            var2 = this.l6().l6(72.0F);
            var2.k5(((float)this.n5().n5() + var3) * var1);
            float var4 = (float)(var3 / (this.n5().n5() + var3));
            var2.n5(new float[]{0.0F, var4});
            var2.u9(this.k5() ? 0 : 2);
         } else {
            var2 = this.l6().l6(72.0F);
            var2.k5(var2.q0() * (var1 * this.u9()));
            var2.u9(this.k5() ? 0 : 2);
         }
      }

      return var2;
   }
}
