package com.aspose.slides.internal.z6e;

import java.awt.Point;
import java.awt.Rectangle;
import java.io.IOException;

public abstract class c4 extends com.aspose.slides.internal.n2z.k5 {
   Rectangle n5;
   int l6;
   Point[][] k5;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.n5 = com.aspose.slides.internal.l1b.k5.u9(var1, var2);
      var2 += 16;
      int var4 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.l6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.k5 = new Point[var4][];
      int var5 = 0;

      for (int var6 = 0; var6 < var4; var6++) {
         int var7 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
         var2 += 4;
         this.k5[var6] = new Point[var7];
         var5 += var7;
      }

      if (var5 != this.l6) {
         throw new IOException("Can't read PolyPoly");
      }

      for (int var11 = 0; var11 < this.k5.length; var11++) {
         for (int var12 = 0; var12 < this.k5[var11].length; var2 += 4) {
            this.k5[var11][var12] = com.aspose.slides.internal.l1b.k5.t2(var1, var2);
            var12++;
         }
      }
   }
}
