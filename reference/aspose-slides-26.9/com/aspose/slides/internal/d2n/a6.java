package com.aspose.slides.internal.d2n;

import java.awt.Color;

public final class a6 {
   int n5;
   Color[] l6;

   public int n5(byte[] var1, int var2) {
      int var3 = var2;
      this.n5 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      short var4 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      this.l6 = new Color[var4];

      for (int var5 = 0; var5 < var4; var2 += 4) {
         this.l6[var5] = com.aspose.slides.internal.l1b.k5.n3(var1, var2);
         var5++;
      }

      return var2 - var3;
   }
}
