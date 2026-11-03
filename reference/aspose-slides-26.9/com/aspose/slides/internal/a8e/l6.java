package com.aspose.slides.internal.a8e;

import com.aspose.slides.internal.t9z.h0;
import com.aspose.slides.internal.x4g.s7;
import com.aspose.slides.internal.x4g.u9;
import java.awt.geom.AffineTransform;

public class l6 extends n5 {
   private final com.aspose.slides.internal.p6x.n5 l6;

   public l6(AffineTransform var1, h0 var2) {
      super(var2);
      this.l6 = new com.aspose.slides.internal.p6x.n5(var1, var2);
   }

   @Override
   protected void n5(com.aspose.slides.internal.t9z.k5 var1, u9 var2, float var3, float var4, float var5, float var6) {
      float var7 = this.l6.n5(var2);
      this.n5(var2.n3(), var1, var3, var4, var7 * var5, var7 * var6);
   }

   private void n5(s7 var1, com.aspose.slides.internal.t9z.k5 var2, float var3, float var4, float var5, float var6) {
      com.aspose.slides.internal.t9z.u3.n5(var1, new k5(this, var2, var3, var5, var6, var4));
   }
}
