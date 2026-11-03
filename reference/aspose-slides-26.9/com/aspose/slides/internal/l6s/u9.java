package com.aspose.slides.internal.l6s;

public class u9 extends l6 {
   private final float n5;

   public u9(float var1) {
      this.n5 = var1;
   }

   @Override
   protected void n5(com.aspose.slides.internal.t9z.k5 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = this.n5;
      float var9 = var8 * 0.5522848F;
      float var10 = var3 - var8;
      var1.n5(var2, var10);
      var1.n5(var2 + var9, var10, var2 + var8, var10 + var8 - var9, var2 + var8, var10 + var8);
      var1.n5(var2 + var8, var10 + var8 + var9, var2 + var9, var10 + 2.0F * var8, var2, var10 + 2.0F * var8);
      var1.n5(var2 - var9, var10 + 2.0F * var8, var2 - var8, var10 + var8 + var9, var2 - var8, var10 + var8);
      var1.n5(var2 - var8, var10 + var8 - var9, var2 - var9, var10, var2, var10);
      var1.n5();
   }
}
