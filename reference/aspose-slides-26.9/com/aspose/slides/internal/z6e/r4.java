package com.aspose.slides.internal.z6e;

import java.awt.Point;
import java.io.IOException;

public final class r4 extends w1 {
   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.n5 = com.aspose.slides.internal.l1b.k5.u9(var1, var2);
      var2 += 16;
      int var4 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.l6 = new byte[var4];
      this.k5 = new Point[var4];

      for (int var5 = 0; var5 < var4; var2 += 8) {
         this.k5[var5] = com.aspose.slides.internal.l1b.k5.c8(var1, var2);
         var5++;
      }

      for (int var8 = 0; var8 < var4; var2++) {
         this.l6[var8] = var1[var2];
         var8++;
      }
   }

   @Override
   public int n5() {
      return 56;
   }
}
