package com.aspose.slides.internal.y8m;

import java.awt.Color;
import java.io.IOException;

public final class a6 extends com.aspose.slides.internal.n2z.k5 {
   int n5;
   int l6;
   Color[] k5;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.n5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.l6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var4 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.k5 = new Color[var4];

      for (int var5 = 0; var5 < var4; var2 += 4) {
         this.k5[var5] = com.aspose.slides.internal.l1b.k5.n3(var1, var2);
         var5++;
      }
   }

   @Override
   public int n5() {
      return 50;
   }
}
