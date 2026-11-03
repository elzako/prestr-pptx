package com.aspose.slides.internal.z6e;

import java.awt.Point;
import java.awt.Rectangle;
import java.io.IOException;

public abstract class q0 extends com.aspose.slides.internal.n2z.k5 {
   Rectangle n5;
   Point[] l6;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.n5 = com.aspose.slides.internal.l1b.k5.u9(var1, var2);
      var2 += 16;
      int var4 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      if (var4 * 4 > var3 - 20) {
         throw new IOException("Error reading points");
      }

      this.l6 = new Point[var4];

      for (int var5 = 0; var5 < var4; var2 += 4) {
         this.l6[var5] = com.aspose.slides.internal.l1b.k5.t2(var1, var2);
         var5++;
      }
   }
}
