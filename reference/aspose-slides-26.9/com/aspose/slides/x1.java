package com.aspose.slides;

final class x1 {
   private final float[] n5;
   private float l6;
   private float k5;

   public x1(int var1, int var2, float var3, float var4) {
      var1 /= var2;
      this.l6 = var3;
      this.k5 = var4;
      this.n5 = new float[var1];
   }

   public final float[] n5() {
      return this.n5;
   }

   public final void n5(float var1) {
      int var2 = com.aspose.slides.internal.v6g.k5.u3(this.n5.length * var1, 13);

      for (int var3 = 0; var3 < this.n5.length; var3++) {
         this.n5[var3] = (float)com.aspose.slides.internal.c8e.k5.n5((var3 - var2) * this.l6 + this.k5, 0.0, 1.0);
      }
   }
}
