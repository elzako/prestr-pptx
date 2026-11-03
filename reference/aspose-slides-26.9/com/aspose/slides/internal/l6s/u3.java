package com.aspose.slides.internal.l6s;

public class u3 extends l6 {
   private static final float n5 = (float)(2.0 * Math.sqrt(3.0));

   @Override
   protected void n5(com.aspose.slides.internal.t9z.k5 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = var2 + n5 * var5;
      float var9 = var3 - n5 * var4;
      var1.n5(var2, var3);
      var1.l6(var8 + 2.0F * var4, var9 + 2.0F * var5);
      var1.l6(var8 + 2.0F * var6, var9 + 2.0F * var7);
      var1.n5();
   }
}
