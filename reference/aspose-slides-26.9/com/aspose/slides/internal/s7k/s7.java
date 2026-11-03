package com.aspose.slides.internal.s7k;

import com.aspose.slides.ms.System.q1;

abstract class s7 extends k7 {
   protected float[] n5 = null;

   public void n5() {
   }

   public abstract float n5(float var1);

   public float l6(float var1) {
      return this.n5(var1, 0.0F, this.n5(0.0F), 1.0F, this.n5(1.0F));
   }

   private float n5(float var1, float var2, float var3, float var4, float var5) {
      if (var1 <= var3) {
         return var2;
      } else if (var1 >= var5) {
         return var4;
      } else if (var4 - var2 <= 1.0E-5) {
         float var8 = q1.n5(var1 - var3);
         float var9 = q1.n5(var5 - var1);
         return var8 < var9 ? var2 : var4;
      } else {
         float var6 = (var2 + var4) / 2.0F;
         float var7 = this.n5(var6);
         return var1 <= var7 ? this.n5(var1, var2, var3, var6, var7) : this.n5(var1, var6, var7, var4, var5);
      }
   }

   public abstract boolean l6();

   public float[] k5() {
      return this.n5;
   }

   public void n5(float[] var1) {
      this.n5 = var1;
   }
}
