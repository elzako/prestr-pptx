package com.aspose.slides.internal.s7k;

class f2 extends d5 {
   private s7 n5 = null;
   private float[] l6 = new float[]{0.9642F, 1.0F, 0.8249F};

   @Override
   public void n5() {
      super.n5();
      if (this.a6()) {
         this.n5 = this.n5(1800688195);
      } else {
         this.n5 = this.l6(1800688195);
      }

      this.n5.n5();
      if (this.n5.l6()) {
         this.n5 = null;
      }

      t4.k5(this.l6);
      if (this.u3().l6().u9 == 1281450528) {
         t4.l6(this.l6, false);
      }
   }

   @Override
   public void n5(float[] var1) {
      this.l6(var1);
      if (this.a6()) {
         float var2 = var1[0];
         if (this.n5 != null) {
            var2 = this.n5.n5(var2);
         }

         var1[0] = var2 * this.l6[0];
         var1[1] = var2 * this.l6[1];
         var1[2] = var2 * this.l6[2];
      } else {
         if (this.u3().l6().u9 == 1281450528) {
            var1[0] /= this.l6[0];
         } else {
            var1[0] = var1[1] / this.l6[1];
         }

         if (this.n5 != null) {
            var1[0] = this.n5.n5(var1[0]);
         }
      }

      this.k5(var1);
   }
}
