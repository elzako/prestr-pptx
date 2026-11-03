package com.aspose.slides;

final class c2l {
   private final float[] n5;
   private final float[] l6;
   private float k5;
   private float u3;

   public c2l(int var1, com.aspose.slides.ms.System.i9 var2) {
      this.n5 = new float[var1];
      this.l6 = new float[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         this.n5[var3] = (float)var2.l6();
      }

      float[] var7 = new float[var1];
      int var4 = var1 / 30;

      for (int var5 = 0; var5 < var4; var5++) {
         for (int var6 = 0; var6 + 1 < var1; var6++) {
            var7[var6] = (this.n5[var6] + this.n5[var6 + 1]) / 2.0F;
         }

         var7[var1 - 1] = (this.n5[var1 - 2] + this.n5[var1 - 1]) / 2.0F;
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(var7), com.aspose.slides.ms.System.u3.n5(this.n5), var1);
      }

      for (int var8 = 0; var8 < var1; var8++) {
         this.n5[var8] = this.n5[var8] * this.n5[var8];
         this.n5[var8] = this.n5[var8] * this.n5[var8];
      }
   }

   public final float[] n5() {
      return this.l6;
   }

   public final void n5(float var1) {
      if (var1 <= 0.5F) {
         this.k5 = var1 * 2.0F;
         this.u3 = 0.0F;
      } else {
         this.k5 = 1.0F;
         this.u3 = 2.0F * var1 - 1.0F;
         this.u3 = this.u3 * this.u3;
      }

      for (int var2 = 0; var2 < this.l6.length; var2++) {
         this.l6[var2] = this.u3 + (this.k5 - this.u3) * this.n5[var2];
      }
   }
}
