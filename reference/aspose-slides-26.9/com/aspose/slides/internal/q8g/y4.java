package com.aspose.slides.internal.q8g;

import java.awt.Point;
import java.io.IOException;

public abstract class y4 extends com.aspose.slides.internal.s2b.u3 {
   protected Point[] n5;

   protected y4() {
   }

   protected y4(Point[] var1) {
      this.n5 = var1;
   }

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      int var4 = com.aspose.slides.internal.l1b.k5.k5(var1, var2);
      var2 += 2;
      this.n5 = new Point[var4];

      for (int var5 = 0; var5 < var4; var2 += 4) {
         this.n5[var5] = com.aspose.slides.internal.l1b.k5.t2(var1, var2);
         var5++;
      }
   }
}
