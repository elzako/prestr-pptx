package com.aspose.slides.internal.l6s;

import java.awt.geom.AffineTransform;

public class a6 extends l6 {
   private final com.aspose.slides.internal.p6x.l6 n5;

   public a6(AffineTransform var1, com.aspose.slides.internal.t9z.h0 var2) {
      this.n5 = new com.aspose.slides.internal.p6x.l6(var1, var2, false);
   }

   @Override
   protected void n5(com.aspose.slides.internal.t9z.k5 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = this.n5.n5(1.0F);
      var1.n5(var2 - var8 * var5, var3 + var8 * var4);
      var1.l6(var2 + var8 * var4, var3 + var8 * var5);
      var1.l6(var2 + var8 * var5, var3 - var8 * var4);
      var1.l6(var2 + var8 * var6, var3 + var8 * var7);
      var1.n5();
   }
}
