package com.aspose.slides.internal.l6s;

import com.aspose.slides.internal.o9b.w1;
import java.awt.geom.AffineTransform;

public class n3 extends k5 {
   public n3(float var1, AffineTransform var2) {
      super(var1, var2);
   }

   @Override
   protected boolean n5() {
      return true;
   }

   @Override
   protected void n5(
      com.aspose.slides.internal.t9z.k5 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, boolean var10
   ) {
      w1 var11 = this.n5(var8, var9, var10);
      float var12 = var2 + var11.l6();
      float var13 = var3 + var11.k5();
      var1.n5(var2 + var4, var3 + var5);
      var1.l6(var12 + var4, var13 + var5);
      var1.l6(var12 + var6, var13 + var7);
      var1.l6(var2 + var6, var3 + var7);
      var1.n5();
   }
}
