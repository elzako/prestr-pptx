package com.aspose.slides.internal.q0y;

class u3 extends n5 {
   private com.aspose.slides.internal.u7q.n5 k5 = null;
   private final float[] u3 = new float[]{0.9642F, 1.0F, 0.8249F};

   @Override
   public void n5() {
      super.n5();
      if (this.a6()) {
         this.k5 = this.n5(1800688195);
      } else {
         this.k5 = this.l6(1800688195);
      }

      this.k5.n5();
      if (this.k5.l6()) {
         this.k5 = null;
      }

      com.aspose.slides.internal.g7i.l6.a6(this.u3);
      if (this.u3().l6().u9 == 1281450528L) {
         com.aspose.slides.internal.g7i.l6.l6(this.u3, false, this.h0());
      }
   }

   @Override
   public void n5(float[] var1) {
      this.l6(var1);
      if (this.a6()) {
         float var2 = var1[0];
         if (this.k5 != null) {
            var2 = this.k5.n5(var2);
         }

         var1[0] = var2 * this.u3[0];
         var1[1] = var2 * this.u3[1];
         var1[2] = var2 * this.u3[2];
      } else {
         if (this.u3().l6().u9 == 1281450528L) {
            var1[0] /= this.u3[0];
         } else {
            var1[0] = var1[1] / this.u3[1];
         }

         if (this.k5 != null) {
            var1[0] = this.k5.n5(var1[0]);
         }
      }

      this.k5(var1);
   }
}
