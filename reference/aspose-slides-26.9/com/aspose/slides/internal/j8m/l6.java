package com.aspose.slides.internal.j8m;

import com.aspose.slides.internal.n2z.k5;
import java.awt.geom.AffineTransform;
import java.io.IOException;

public final class l6 extends k5 {
   AffineTransform n5;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.n5 = com.aspose.slides.internal.l1b.k5.x8(var1, var2);
   }

   @Override
   public int n5() {
      return 35;
   }

   @Override
   protected void n5(com.aspose.slides.internal.o6t.l6 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      if (!var1.k7()) {
         var1.n5(this.n5);
      }
   }
}
